require.config({
    baseUrl: ".",
    paths: {
        text: "vendor/requirejs/text",
        css: "vendor/requirejs/css",
        jquery: "vendor/jquery/jquery-1.11.2",
        bootstrap: 'vendor/bootstrap/js/bootstrap',
        vue: "vendor/vue/vue.min",
        director:"vendor/director/director",
        doc: "vendor/doc/doc"
    },
    shim: {
        'bootstrap': {
            deps: ["jquery"]
        },
        'doc': {
            deps: ["bootstrap","css!vendor/doc/doc.css"]
        }
    }
});
