define({
    // "/" : function() {},     // Director.js 原有的方式
    // "/books" : "book/index", // 使用控制器自动加载 you-app/controllers/book/index.js
    "/": function () {
    },
    "/pages/analysis/analysis": function () {
        initPage("pages/analysis/analysis");
    },
    "/pages/highlight/highlight": function () {
        initPage("pages/highlight/highlight");
    }
});

function initPage(p) {
    var module = p;
    var html = "text!" + module + ".html";
    var content = document.getElementById("container");
    require([module,html], function (module,html) {
        content.innerHTML = html;
        module.init(content);

    })
}
