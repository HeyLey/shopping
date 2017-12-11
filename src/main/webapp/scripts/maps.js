ymaps.ready(init);

function init() {
    var myMap = new ymaps.Map("map", {
        center: [59.978288, 30.335000],
        zoom: 12
    }, {
        searchControlProvider: 'yandex#search'
    });

    var shop1 = new ymaps.Placemark([59.984008, 30.351001], {
        balloonContent: 'IMyMeShop',
        iconCaption: 'ул. Харченко, 19'
    }, {
        preset: 'islands#greenDotIcon'
    });

    shop1.events.add(['balloonopen'
    ], function (e) {
        $("#radio1").prop("checked", true);
        $("#shop_addres").text("ул. Харченко, 19");
        $("#address").val("ул. Харченко 19");
    });

    var shop2 = new ymaps.Placemark([59.970614, 30.318572], {
        balloonContent: 'IMyMeShop',
        iconCaption: 'ул. Профессора Попова, 4'
    }, {
        preset: 'islands#greenDotIcon'
    });

    shop2.events.add(['balloonopen'
    ], function (e) {
        $("#radio1").prop("checked", true);
        $("#shop_addres").text("ул. Профессора Попова, 4");
        $("#address").val("ул. Профессора Попова 4");
    });

    myMap.geoObjects
        .add(shop1)
        .add(shop2);
}