package com.yonyou.iuap.searchcoulud.demo.type;

/**
 * Created by zengxs on 2017/1/4.
 */
public class AnalysisIndexType {


    /**
     * text : 曾 raw_bytes : [e6 9b be] start : 0 end : 1
     * org.apache.lucene.analysis.tokenattributes.PositionLengthAttribute#positionLength : 1 type :
     * word position : 1 positionHistory : [1,1,1,1]
     */

    private String text;
    private String raw_bytes;
    private int start;
    private int end;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getRaw_bytes() {
        return raw_bytes;
    }

    public void setRaw_bytes(String raw_bytes) {
        this.raw_bytes = raw_bytes;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }
}
