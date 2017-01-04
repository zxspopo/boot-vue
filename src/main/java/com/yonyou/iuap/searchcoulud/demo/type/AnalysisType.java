package com.yonyou.iuap.searchcoulud.demo.type;

import com.google.gson.JsonElement;

import java.util.List;

/**
 * Created by zengxs on 2017/1/4.
 */
public class AnalysisType {


    /**
     * responseHeader : {"status":0,"QTime":27} analysis : {"field_types":{"text_type":{"index":[
     * "org.apache.lucene.analysis.charfilter.HTMLStripCharFilter"
     * ,"曾宪盛","org.apache.lucene.analysis.standard.StandardTokenizer"
     * ,[{"text":"曾","raw_bytes":"[e6 9b be]","start":0,"end":1,
     * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
     * :1,"type":"<IDEOGRAPHIC>"
     * ,"position":1,"positionHistory":[1]},{"text":"宪","raw_bytes":"[e5 ae aa]","start":1,"end":2,
     * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
     * :1,"type":"<IDEOGRAPHIC>"
     * ,"position":2,"positionHistory":[2]},{"text":"盛","raw_bytes":"[e7 9b 9b]","start":2,"end":3,
     * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
     * :1,"type":"<IDEOGRAPHIC>"
     * ,"position":3,"positionHistory":[3]}],"org.apache.lucene.analysis.core.LowerCaseFilter"
     * ,[{"text":"曾","raw_bytes":"[e6 9b be]","start":0,"end":1,
     * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
     * :1,"type":"<IDEOGRAPHIC>"
     * ,"position":1,"positionHistory":[1,1]},{"text":"宪","raw_bytes":"[e5 ae aa]"
     * ,"start":1,"end":2,
     * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
     * :1,"type":"<IDEOGRAPHIC>"
     * ,"position":2,"positionHistory":[2,2]},{"text":"盛","raw_bytes":"[e7 9b 9b]"
     * ,"start":2,"end":3,
     * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
     * :1,"type":"<IDEOGRAPHIC>"
     * ,"position":3,"positionHistory":[3,3]}],"org.apache.lucene.analysis.ngram.NGramTokenFilter"
     * ,[{"text":"曾","raw_bytes":"[e6 9b be]","start":0,"end":1,
     * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
     * :1,"type":"word"
     * ,"position":1,"positionHistory":[1,1,1]},{"text":"宪","raw_bytes":"[e5 ae aa]",
     * "start":1,"end":
     * 2,"org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
     * :1,"type"
     * :"word","position":2,"positionHistory":[2,2,2]},{"text":"盛","raw_bytes":"[e7 9b 9b]",
     * "start":2
     * ,"end":3,"org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
     * :1,"type":"word","position":3,"positionHistory":[3,3,3]}],
     * "com.yonyou.iuap.search.analyzer.PinyinNameTransformTokenFilter"
     * ,[{"text":"曾","raw_bytes":"[e6 9b be]","start":0,"end":1,
     * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
     * :1,"type":"word"
     * ,"position":1,"positionHistory":[1,1,1,1]},{"text":"c","raw_bytes":"[63]","start":0,"end":1,
     * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
     * :1,"type":"word"
     * ,"position":1,"positionHistory":[1,1,1,1]},{"text":"z","raw_bytes":"[7a]","start":0,"end":1,
     * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
     * :1,"type":"word"
     * ,"position":1,"positionHistory":[1,1,1,1]},{"text":"ceng","raw_bytes":"[63 65 6e 67]"
     * ,"start":0,"end":1,
     * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
     * :1,"type":"word"
     * ,"position":1,"positionHistory":[1,1,1,1]},{"text":"zeng","raw_bytes":"[7a 65 6e 67]"
     * ,"start":0,"end":1,
     * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
     * :1,"type":"word"
     * ,"position":1,"positionHistory":[1,1,1,1]},{"text":"曾","raw_bytes":"[e6 9b be]"
     * ,"start":0,"end"
     * :1,"org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
     * :1,"type"
     * :"word","position":1,"positionHistory":[1,1,1,1]},{"text":"宪","raw_bytes":"[e5 ae aa]"
     * ,"start":1,"end":2,
     * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
     * :1,"type":"word"
     * ,"position":2,"positionHistory":[2,2,2,2]},{"text":"x","raw_bytes":"[78]","start":1,"end":2,
     * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
     * :1,"type":"word"
     * ,"position":2,"positionHistory":[2,2,2,2]},{"text":"xian","raw_bytes":"[78 69 61 6e]"
     * ,"start":1,"end":2,
     * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
     * :1,"type":"word"
     * ,"position":2,"positionHistory":[2,2,2,2]},{"text":"宪","raw_bytes":"[e5 ae aa]"
     * ,"start":1,"end"
     * :2,"org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
     * :1,"type"
     * :"word","position":2,"positionHistory":[2,2,2,2]},{"text":"盛","raw_bytes":"[e7 9b 9b]"
     * ,"start":2,"end":3,
     * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
     * :1,"type":"word"
     * ,"position":3,"positionHistory":[3,3,3,3]},{"text":"s","raw_bytes":"[73]","start":2,"end":3,
     * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
     * :1,"type":"word"
     * ,"position":3,"positionHistory":[3,3,3,3]},{"text":"c","raw_bytes":"[63]","start":2,"end":3,
     * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
     * :1,"type":"word"
     * ,"position":3,"positionHistory":[3,3,3,3]},{"text":"sheng","raw_bytes":"[73 68 65 6e 67]"
     * ,"start":2,"end":3,
     * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
     * :1,"type":"word"
     * ,"position":3,"positionHistory":[3,3,3,3]},{"text":"cheng","raw_bytes":"[63 68 65 6e 67]"
     * ,"start":2,"end":3,
     * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
     * :1,"type":"word"
     * ,"position":3,"positionHistory":[3,3,3,3]},{"text":"盛","raw_bytes":"[e7 9b 9b]"
     * ,"start":2,"end"
     * :3,"org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
     * :1,"type":"word","position":3,"positionHistory":[3,3,3,3]}]]}},"field_names":{}}
     */

    private ResponseHeaderBean responseHeader;
    private AnalysisBean analysis;

    public ResponseHeaderBean getResponseHeader() {
        return responseHeader;
    }

    public void setResponseHeader(ResponseHeaderBean responseHeader) {
        this.responseHeader = responseHeader;
    }

    public AnalysisBean getAnalysis() {
        return analysis;
    }

    public void setAnalysis(AnalysisBean analysis) {
        this.analysis = analysis;
    }

    public static class ResponseHeaderBean {
        /**
         * status : 0 QTime : 27
         */

        private int status;
        private int QTime;

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getQTime() {
            return QTime;
        }

        public void setQTime(int QTime) {
            this.QTime = QTime;
        }
    }

    public static class AnalysisBean {
        /**
         * field_types :
         * {"text_type":{"index":["org.apache.lucene.analysis.charfilter.HTMLStripCharFilter"
         * ,"曾宪盛","org.apache.lucene.analysis.standard.StandardTokenizer"
         * ,[{"text":"曾","raw_bytes":"[e6 9b be]","start":0,"end":1,
         * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
         * :1,"type":"<IDEOGRAPHIC>","position":1,"positionHistory":[1]},{"text":"宪","raw_bytes":
         * "[e5 ae aa]","start":1,"end":2,
         * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
         * :1,"type":"<IDEOGRAPHIC>","position":2,"positionHistory":[2]},{"text":"盛","raw_bytes":
         * "[e7 9b 9b]","start":2,"end":3,
         * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
         * :1,"type":"<IDEOGRAPHIC>","position":3,"positionHistory":[3]}],
         * "org.apache.lucene.analysis.core.LowerCaseFilter"
         * ,[{"text":"曾","raw_bytes":"[e6 9b be]","start":0,"end":1,
         * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
         * :1,"type":"<IDEOGRAPHIC>","position":1,"positionHistory":[1,1]},{"text":"宪","raw_bytes":
         * "[e5 ae aa]","start":1,"end":2,
         * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
         * :1,"type":"<IDEOGRAPHIC>","position":2,"positionHistory":[2,2]},{"text":"盛","raw_bytes":
         * "[e7 9b 9b]","start":2,"end":3,
         * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
         * :1,"type":"<IDEOGRAPHIC>","position":3,"positionHistory":[3,3]}],
         * "org.apache.lucene.analysis.ngram.NGramTokenFilter"
         * ,[{"text":"曾","raw_bytes":"[e6 9b be]","start":0,"end":1,
         * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
         * :1,"type"
         * :"word","position":1,"positionHistory":[1,1,1]},{"text":"宪","raw_bytes":"[e5 ae aa]"
         * ,"start":1,"end":2,
         * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
         * :1,"type"
         * :"word","position":2,"positionHistory":[2,2,2]},{"text":"盛","raw_bytes":"[e7 9b 9b]"
         * ,"start":2,"end":3,
         * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
         * :1,"type":"word","position":3,"positionHistory":[3,3,3]}],
         * "com.yonyou.iuap.search.analyzer.PinyinNameTransformTokenFilter"
         * ,[{"text":"曾","raw_bytes":"[e6 9b be]","start":0,"end":1,
         * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
         * :1,"type"
         * :"word","position":1,"positionHistory":[1,1,1,1]},{"text":"c","raw_bytes":"[63]",
         * "start":0,"end":1,
         * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
         * :1,"type"
         * :"word","position":1,"positionHistory":[1,1,1,1]},{"text":"z","raw_bytes":"[7a]",
         * "start":0,"end":1,
         * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
         * :1,"type":"word","position":1,"positionHistory":[1,1,1,1]},{"text":"ceng","raw_bytes":
         * "[63 65 6e 67]","start":0,"end":1,
         * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
         * :1,"type":"word","position":1,"positionHistory":[1,1,1,1]},{"text":"zeng","raw_bytes":
         * "[7a 65 6e 67]","start":0,"end":1,
         * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
         * :1,"type"
         * :"word","position":1,"positionHistory":[1,1,1,1]},{"text":"曾","raw_bytes":"[e6 9b be]"
         * ,"start":0,"end":1,
         * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
         * :1,"type"
         * :"word","position":1,"positionHistory":[1,1,1,1]},{"text":"宪","raw_bytes":"[e5 ae aa]"
         * ,"start":1,"end":2,
         * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
         * :1,"type"
         * :"word","position":2,"positionHistory":[2,2,2,2]},{"text":"x","raw_bytes":"[78]",
         * "start":1,"end":2,
         * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
         * :1,"type":"word","position":2,"positionHistory":[2,2,2,2]},{"text":"xian","raw_bytes":
         * "[78 69 61 6e]","start":1,"end":2,
         * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
         * :1,"type"
         * :"word","position":2,"positionHistory":[2,2,2,2]},{"text":"宪","raw_bytes":"[e5 ae aa]"
         * ,"start":1,"end":2,
         * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
         * :1,"type"
         * :"word","position":2,"positionHistory":[2,2,2,2]},{"text":"盛","raw_bytes":"[e7 9b 9b]"
         * ,"start":2,"end":3,
         * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
         * :1,"type"
         * :"word","position":3,"positionHistory":[3,3,3,3]},{"text":"s","raw_bytes":"[73]",
         * "start":2,"end":3,
         * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
         * :1,"type"
         * :"word","position":3,"positionHistory":[3,3,3,3]},{"text":"c","raw_bytes":"[63]",
         * "start":2,"end":3,
         * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
         * :1,"type":"word","position":3,"positionHistory":[3,3,3,3]},{"text":"sheng","raw_bytes":
         * "[73 68 65 6e 67]","start":2,"end":3,
         * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
         * :1,"type":"word","position":3,"positionHistory":[3,3,3,3]},{"text":"cheng","raw_bytes":
         * "[63 68 65 6e 67]","start":2,"end":3,
         * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
         * :1,"type"
         * :"word","position":3,"positionHistory":[3,3,3,3]},{"text":"盛","raw_bytes":"[e7 9b 9b]"
         * ,"start":2,"end":3,
         * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
         * :1,"type":"word","position":3,"positionHistory":[3,3,3,3]}]]}} field_names : {}
         */

        private FieldTypesBean field_types;
        private FieldNamesBean field_names;

        public FieldTypesBean getField_types() {
            return field_types;
        }

        public void setField_types(FieldTypesBean field_types) {
            this.field_types = field_types;
        }

        public FieldNamesBean getField_names() {
            return field_names;
        }

        public void setField_names(FieldNamesBean field_names) {
            this.field_names = field_names;
        }

        public static class FieldTypesBean {
            /**
             * text_type :
             * {"index":["org.apache.lucene.analysis.charfilter.HTMLStripCharFilter","曾宪盛"
             * ,"org.apache.lucene.analysis.standard.StandardTokenizer"
             * ,[{"text":"曾","raw_bytes":"[e6 9b be]","start":0,"end":1,
             * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
             * :1,
             * "type":"<IDEOGRAPHIC>","position":1,"positionHistory":[1]},{"text":"宪","raw_bytes":
             * "[e5 ae aa]","start":1,"end":2,
             * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
             * :1,
             * "type":"<IDEOGRAPHIC>","position":2,"positionHistory":[2]},{"text":"盛","raw_bytes":
             * "[e7 9b 9b]","start":2,"end":3,
             * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
             * :1,"type":"<IDEOGRAPHIC>","position":3,"positionHistory":[3]}],
             * "org.apache.lucene.analysis.core.LowerCaseFilter"
             * ,[{"text":"曾","raw_bytes":"[e6 9b be]","start":0,"end":1,
             * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
             * :1,
             * "type":"<IDEOGRAPHIC>","position":1,"positionHistory":[1,1]},{"text":"宪","raw_bytes"
             * :"[e5 ae aa]","start":1,"end":2,
             * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
             * :1,
             * "type":"<IDEOGRAPHIC>","position":2,"positionHistory":[2,2]},{"text":"盛","raw_bytes"
             * :"[e7 9b 9b]","start":2,"end":3,
             * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
             * :1,"type":"<IDEOGRAPHIC>","position":3,"positionHistory":[3,3]}],
             * "org.apache.lucene.analysis.ngram.NGramTokenFilter"
             * ,[{"text":"曾","raw_bytes":"[e6 9b be]","start":0,"end":1,
             * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
             * :1,"type":"word","position":1,"positionHistory":[1,1,1]},{"text":"宪","raw_bytes":
             * "[e5 ae aa]","start":1,"end":2,
             * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
             * :1,"type":"word","position":2,"positionHistory":[2,2,2]},{"text":"盛","raw_bytes":
             * "[e7 9b 9b]","start":2,"end":3,
             * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
             * :1,"type":"word","position":3,"positionHistory":[3,3,3]}],
             * "com.yonyou.iuap.search.analyzer.PinyinNameTransformTokenFilter"
             * ,[{"text":"曾","raw_bytes":"[e6 9b be]","start":0,"end":1,
             * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
             * :1,"type":"word","position":1,"positionHistory":[1,1,1,1]},{"text":"c","raw_bytes":
             * "[63]","start":0,"end":1,
             * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
             * :1,"type":"word","position":1,"positionHistory":[1,1,1,1]},{"text":"z","raw_bytes":
             * "[7a]","start":0,"end":1,
             * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
             * :1,
             * "type":"word","position":1,"positionHistory":[1,1,1,1]},{"text":"ceng","raw_bytes":
             * "[63 65 6e 67]","start":0,"end":1,
             * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
             * :1,
             * "type":"word","position":1,"positionHistory":[1,1,1,1]},{"text":"zeng","raw_bytes":
             * "[7a 65 6e 67]","start":0,"end":1,
             * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
             * :1,"type":"word","position":1,"positionHistory":[1,1,1,1]},{"text":"曾","raw_bytes":
             * "[e6 9b be]","start":0,"end":1,
             * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
             * :1,"type":"word","position":1,"positionHistory":[1,1,1,1]},{"text":"宪","raw_bytes":
             * "[e5 ae aa]","start":1,"end":2,
             * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
             * :1,"type":"word","position":2,"positionHistory":[2,2,2,2]},{"text":"x","raw_bytes":
             * "[78]","start":1,"end":2,
             * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
             * :1,
             * "type":"word","position":2,"positionHistory":[2,2,2,2]},{"text":"xian","raw_bytes":
             * "[78 69 61 6e]","start":1,"end":2,
             * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
             * :1,"type":"word","position":2,"positionHistory":[2,2,2,2]},{"text":"宪","raw_bytes":
             * "[e5 ae aa]","start":1,"end":2,
             * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
             * :1,"type":"word","position":2,"positionHistory":[2,2,2,2]},{"text":"盛","raw_bytes":
             * "[e7 9b 9b]","start":2,"end":3,
             * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
             * :1,"type":"word","position":3,"positionHistory":[3,3,3,3]},{"text":"s","raw_bytes":
             * "[73]","start":2,"end":3,
             * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
             * :1,"type":"word","position":3,"positionHistory":[3,3,3,3]},{"text":"c","raw_bytes":
             * "[63]","start":2,"end":3,
             * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
             * :1,
             * "type":"word","position":3,"positionHistory":[3,3,3,3]},{"text":"sheng","raw_bytes"
             * :"[73 68 65 6e 67]","start":2,"end":3,
             * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
             * :1,
             * "type":"word","position":3,"positionHistory":[3,3,3,3]},{"text":"cheng","raw_bytes"
             * :"[63 68 65 6e 67]","start":2,"end":3,
             * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
             * :1,"type":"word","position":3,"positionHistory":[3,3,3,3]},{"text":"盛","raw_bytes":
             * "[e7 9b 9b]","start":2,"end":3,
             * "org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength"
             * :1,"type":"word","position":3,"positionHistory":[3,3,3,3]}]]}
             */

            private TextTypeBean text_type;

            public TextTypeBean getText_type() {
                return text_type;
            }

            public void setText_type(TextTypeBean text_type) {
                this.text_type = text_type;
            }

            public static class TextTypeBean {
                private List<JsonElement> index;

                public List<JsonElement> getIndex() {
                    return index;
                }

                public void setIndex(List<JsonElement> index) {
                    this.index = index;
                }
            }
        }

        public static class FieldNamesBean {
        }
    }
}
