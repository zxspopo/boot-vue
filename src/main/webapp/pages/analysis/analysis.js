// 你可以使用 Require.js css / text 插件来加载
define(["vue","doc"], function (Vue) {

    var init = function (content) {
        var vm = new Vue({
            el: '#container',
            data: {
                alaysisText_no: '',
                alaysisResult_no: '',
                alaysisText_zhcn: '',
                alaysisResult_zhcn: '',
                alaysisText_zhcn_pinyin: '',
                alaysisResult_zhcn_pinyin: '',
                alaysisText_zhcn_standard: '',
                alaysisResult_zhcn_standard: '',
                alaysisText_zhcn_standard_pinyin: '',
                alaysisResult_zhcn_standard_pinyin: '',
                alaysisText_like: '',
                alaysisResult_like: '',
                alaysisText_like_pinyin: '',
                alaysisResult_like_pinyin: '',
                alaysisText_en: '',
                alaysisResult_en: '',
                alaysisText_en_simple: '',
                alaysisResult_en_simple: ''
            },
            methods: {
                alaysis_no: function () {
                    this.alaysisResult_no = '<span class="label label-info">' + this.alaysisText_no + '</span>';
                },
                alaysis_zhcn: function () {
                    this.alaysisResult_zhcn = "";
                    var self = this;
                    this.analysis(ctx + '/analysis/analysis_zhcn', this.alaysisText_zhcn, "alaysisResult_zhcn");
                },
                alaysis_zhcn_pinyin: function () {
                    this.alaysisResult_zhcn_pinyin = "";
                    var self = this;
                    this.analysis(ctx + '/analysis/analysis_zhcn_pinyin', this.alaysisText_zhcn_pinyin, "alaysisResult_zhcn_pinyin");
                },
                alaysis_zhcn_standard: function () {
                    this.alaysisResult_zhcn_standard = "";
                    var self = this;
                    this.analysis(ctx + '/analysis/analysis_zhcn_standard', this.alaysisText_zhcn_standard, "alaysisResult_zhcn_standard");
                },
                alaysis_zhcn_standard_pinyin: function () {
                    this.alaysisResult_zhcn_standard_pinyin = "";
                    var self = this;
                    this.analysis(ctx + '/analysis/analysis_zhcn_standard_pinyin', this.alaysisText_zhcn_standard_pinyin, "alaysisResult_zhcn_standard_pinyin");
                },
                alaysis_like: function () {
                    this.alaysisResult_like = "";
                    var self = this;
                    this.analysis(ctx + '/analysis/analysis_like', this.alaysisText_like, "alaysisResult_like");
                },
                alaysis_like_pinyin: function () {
                    this.alaysisResult_like_pinyin = "";
                    var self = this;
                    this.analysis(ctx + '/analysis/analysis_like_pinyin', this.alaysisText_like_pinyin, "alaysisResult_like_pinyin");
                },
                alaysis_en: function () {
                    this.alaysisResult_en = "";
                    var self = this;
                    this.analysis(ctx + '/analysis/analysis_en', this.alaysisText_en, "alaysisResult_en");
                },
                alaysis_en_simple: function () {
                    this.alaysisResult_en_simple = "";
                    var self = this;
                    this.analysis(ctx + '/analysis/analysis_en_simple', this.alaysisText_en_simple, "alaysisResult_en_simple");
                },
                analysis: function (url, text, variableName) {
                    text = $.trim(text);

                    if (text.length > 0) {
                        var self = this;
                        this.$http({url: url, method: 'GET'}).then(function (res) {
                            var html = "";
                            for (var data in res) {
                                html += '<span class="label label-info" >' + res[data] + '</span>';
                            }
                            self.$set(variableName, html);
                        }, function (er) {
                            alert("请求失败，请稍后重试!");
                        });
                    }
                }
            }
        });
    }

    return {
        init: init
    }
});
