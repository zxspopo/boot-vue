var ctx = "/demo";
require(["director","./configs/routes"], function (router,router_conf) {

    var router = Router(router_conf);
    router.init();

});
