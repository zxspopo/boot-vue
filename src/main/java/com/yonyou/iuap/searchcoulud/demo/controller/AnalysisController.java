package com.yonyou.iuap.searchcoulud.demo.controller;

import com.yonyou.iuap.searchcoulud.demo.service.AnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zengxs on 2017/1/3.
 */
@RestController
@RequestMapping("/analysis")
public class AnalysisController {

    @Autowired
    private AnalysisService analysisService;

    /**
     * ik分词
     * 
     * @param text
     * @return
     */
    @RequestMapping(value = "analysis_zhcn", method = RequestMethod.GET)
    public List<String> analysisChinese(@RequestParam("text") String text) {
        return analysisService.analysisIk(text);
    }

    /**
     * ik+pinyin分词
     * 
     * @param text
     * @return
     */
    @RequestMapping(value = "analysis_zhcn_pinyin", method = RequestMethod.GET)
    public List<String> analysisChineseWithPinyin(@RequestParam("text") String text) {
        return analysisService.analysisIkWithPinyin(text);
    }

    /**
     * 单字分词
     * 
     * @param text
     * @return
     */
    @RequestMapping(value = "analysis_zhcn_standard", method = RequestMethod.GET)
    public List<String> analysisChineseStandard(@RequestParam("text") String text) {
        return analysisService.analysisChineseStandard(text);
    }

    /**
     * 单字+拼音分词
     * 
     * @param text
     * @return
     */
    @RequestMapping(value = "analysis_zhcn_standard_pinyin", method = RequestMethod.GET)
    public List<String> analysisChineseStandardWithPinyin(@RequestParam("text") String text) {
        return analysisService.analysisChineseStandardWithPinyin(text);
    }

    /**
     * 模糊分词
     * 
     * @param text
     * @return
     */
    @RequestMapping(value = "analysis_like", method = RequestMethod.GET)
    public List<String> analysisLike(@RequestParam("text") String text) {
        return analysisService.analysisLike(text);
    }

    /**
     * 模糊+拼音分词
     * 
     * @param text
     * @return
     */
    @RequestMapping(value = "analysis_like_pinyin", method = RequestMethod.GET)
    public List<String> analysisLikeWithPinyin(@RequestParam("text") String text) {
        return analysisService.analysisLikeWithPinyin(text);
    }

    /**
     * 模糊+拼音分词
     *
     * @param text
     * @return
     */
    @RequestMapping(value = "analysis_en", method = RequestMethod.GET)
    public List<String> analysisEn(@RequestParam("text") String text) {
        return analysisService.analysisEn(text);
    }

    /**
     * 模糊+拼音分词
     *
     * @param text
     * @return
     */
    @RequestMapping(value = "analysis_en_simple", method = RequestMethod.GET)
    public List<String> analysisEnSimple(@RequestParam("text") String text) {
        return analysisService.analysisEnSimple(text);
    }
}
