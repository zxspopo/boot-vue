package com.yonyou.iuap.searchcoulud.demo.service;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.solr.client.solrj.util.ClientUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.yonyou.iuap.searchcoulud.demo.constants.SolrConstants;
import com.yonyou.iuap.searchcoulud.demo.type.AnalysisIndexType;
import com.yonyou.iuap.searchcoulud.demo.type.AnalysisType;
import com.yonyou.iuap.searchcoulud.demo.utils.JsonUtils;
import com.yonyou.iuap.searchcoulud.demo.utils.SolrQueryUtils;

/**
 * Created by zengxs on 2017/1/4.
 */
@Service
public class AnalysisService {

    @Value("${solr.collection}")
    private String baseUrl;

    @Value("${solr.analyz.uri}")
    private String analyzUri;

    @Value("${solr.analyz.ik}")
    private String ik;

    @Value("${solr.analyz.ik.pinyin}")
    private String ik_pinyin;

    @Value("${solr.analyz.standard}")
    private String standard;

    @Value("${solr.analyz.standard.pinyin}")
    private String standard_pinyin;

    @Value("${solr.analyz.like}")
    private String like;

    @Value("${solr.analyz.like.pinyin}")
    private String like_pinyin;

    @Value("${solr.analyz.en}")
    private String en;

    @Value("${solr.analyz.en_plain}")
    private String en_plain;

    /**
     * ik分词
     * 
     * @param text
     * @return
     */
    public List<String> analysisIk(String text) {
        String ikurl = genAnalysisUrl(ik, text);
        return analysis(ikurl, ik);
    }


    /**
     * ik+拼音分词
     * 
     * @param text
     * @return
     */
    public List<String> analysisIkWithPinyin(String text) {
        String ikWithPinyinUrl = genAnalysisUrl(ik_pinyin, text);
        return analysis(ikWithPinyinUrl, ik_pinyin);
    }

    /**
     * 中文单字分词
     * 
     * @param text
     * @return
     */
    public List<String> analysisChineseStandard(String text) {
        String standURL = genAnalysisUrl(standard, text);
        return analysis(standURL, standard);
    }

    /**
     * 中文单字分词+pinyin
     *
     * @param text
     * @return
     */
    public List<String> analysisChineseStandardWithPinyin(String text) {
        String standURL = genAnalysisUrl(standard_pinyin, text);
        return analysis(standURL, standard_pinyin);
    }

    /**
     * 模糊分词
     * 
     * @param text
     * @return
     */
    public List<String> analysisLike(String text) {
        String likeUrl = genAnalysisUrl(like, text);
        return analysis(likeUrl, like);
    }

    /**
     * 模糊分词+pinyin
     *
     * @param text
     * @return
     */
    public List<String> analysisLikeWithPinyin(String text) {
        String likeUrl = genAnalysisUrl(like_pinyin, text);
        return analysis(likeUrl, like_pinyin);
    }

    /**
     * 英文去词根分词
     * 
     * @param text
     * @return
     */
    public List<String> analysisEn(String text) {
        String likeUrl = genAnalysisUrl(en, text);
        return analysis(likeUrl, en);
    }

    /**
     * 英文标点和空格分词
     * 
     * @param text
     * @return
     */
    public List<String> analysisEnSimple(String text) {
        String likeUrl = genAnalysisUrl(en_plain, text);
        return analysis(likeUrl, en_plain);
    }


    private List<String> analysis(String queryURl, String currentType) {
        String response = SolrQueryUtils.doQuery(queryURl, String.class);
        response = response.replaceFirst(currentType, "text_type");
        AnalysisType analysisType = JsonUtils.toObject(response, AnalysisType.class);
        List<String> resultList = new ArrayList<>();
        if (analysisType != null && analysisType.getAnalysis() != null
                && analysisType.getAnalysis().getField_types() != null
                && analysisType.getAnalysis().getField_types().getText_type() != null
                && CollectionUtils.isNotEmpty(analysisType.getAnalysis().getField_types().getText_type().getIndex())) {
            Object value =
                    analysisType.getAnalysis().getField_types().getText_type().getIndex()
                            .get(analysisType.getAnalysis().getField_types().getText_type().getIndex().size() - 1);
            List<AnalysisIndexType> indexTypeList = JsonUtils.toList(value.toString(), AnalysisIndexType.class);
            int start = 0;
            int end = 0;
            for (AnalysisIndexType indexType : indexTypeList) {
                if (indexType.getStart() == start && indexType.getEnd() == end
                        && resultList.contains(indexType.getText())) {
                    continue;
                }
                start = indexType.getStart();
                end = indexType.getEnd();
                resultList.add(indexType.getText());
            }
        }
        return resultList;
    }

    private String genAnalysisUrl(String filedType, String value) {
        StringBuilder builder = new StringBuilder();
        builder.append(baseUrl).append(analyzUri).append(SolrConstants.ANALYSIS_FIELDTYPE).append(filedType)
                .append(SolrConstants.ANALYSIS_FIELDVALUE)
                .append(URLEncoder.encode(ClientUtils.escapeQueryChars(value)));
        return builder.toString();
    }

}
