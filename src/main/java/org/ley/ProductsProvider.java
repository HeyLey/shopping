package org.ley;


import java.util.ArrayList;
import java.util.List;

// создание списка продуктов
public class ProductsProvider {

    private static List<Product> allProducts;

    static {
        allProducts = new ArrayList();
        addProduct("Дубленка Mondial", "Дубленка из натуральной овчины с меховым подкладом, воротник из меха лисы.", 59999, "/img/img10.png", "/img/img10.jpg")
                .withLongDescription("Состав \n" +
                        "Материал 1: Натуральный мех - 100%; \n" +
                        "Материал 2: Натуральная кожа - 100%\n" +
                        "Материал подкладки: Натуральный мех овчины - 100%\n" +
                        "Утеплитель: Без утеплителя\n" +
                        "Размер модели на фото: M\n" +
                        "Рост модели на фото: 170\n" +
                        "Длина: до середины бедра\n" +
                        "Застежка: на молнии\n" +
                        "Сезон: Зима\n" +
                        "Стиль: Повседневный\n" +
                        "Коллекция: Осень-зима\n" +
                        "Узор: Однотонный\n" +
                        "Артикул: MP002XW1GJ08")
                .withColor("Зеленый", "Коричневый", "Красный")
                .fermale(Categories.WOMAN_COAT)
                .withCloseSize();

        addProduct("Куртка кожаная Karl Lagerfeld", "Куртка Karl Lagerfeld выполнена из коровьей кожи. Модель приталенного кроя.", 64999, "/img/img11.png", "/img/img11.jpg")
                .withLongDescription("Особенности: \n" +
                        "широкий ветрозащитный клапан, застежка на молнию, \n" +
                        "четыре кармана с внешней стороны, \n" +
                        "функциональные молнии на рукавах, \n" +
                        "без подкладки.\n" +
                        "Состав: Коровья кожа - 100%\n" +
                        "Длина рукава: 59 см\n" +
                        "Длина: 53 см\n" +
                        "Размер модели на фото: M\n" +
                        "Рост модели на фото: 178\n" +
                        "Параметры модели: 80-60-86\n" +
                        "Длина: до бедра\n" +
                        "Рукав: длинный\n" +
                        "Застежка: на молнии\n" +
                        "Страна производства: Турция\n" +
                        "Сезон: Демисезон\n" +
                        "Стиль: Повседневный\n" +
                        "Коллекция: Весна-лето\n" +
                        "Узор: Однотонный\n" +
                        "Карманы: 4\n" +
                        "Артикул: KA025EWOXV48")
                .withColor("Серебристый", "Золотой", "Бронза")
                .fermale(Categories.WOMAN_COAT)
                .withCloseSize();

        addProduct("Пальто Weekend Max Mara", "Двухстороннее пальто Weekend Max Mara выполнено из мягкого материала с высоким содержанием шерсти. Модель прямого кроя.", 59999, "/img/img12.png", "/img/img12.jpg")
                .withLongDescription("Особенности: \n" +
                        "фиксированный капюшон, \n" +
                        "застежка на кнопки,\n" +
                        "по два накладных кармана с внешней и внутренней стороны, \n" +
                        "разрезы по бокам.\n" +
                        "Состав: Шерсть - 90%, Полиамид - 10%\n" +
                        "Длина рукава: 55 см\n" +
                        "Длина: 85 см\n" +
                        "Размер модели на фото: M\n" +
                        "Рост модели на фото: 178\n" +
                        "Параметры модели: 80-60-86\n" +
                        "Длина: до середины бедра\n" +
                        "Рукав: длинный\n" +
                        "Застежка: на кнопках\n" +
                        "Сезон: Демисезон\n" +
                        "Стиль: Повседневный\n" +
                        "Коллекция: Весна-лето\n" +
                        "Внутренние карманы: 2\n" +
                        "Узор: Однотонный\n" +
                        "Вырез/воротник: С капюшоном\n" +
                        "Капюшон: 1\n" +
                        "Карманы: 2\n" +
                        "Артикул: WE017EWORB56")
                .withColor("Красный", "Синий", "Черный")
                .fermale(Categories.WOMAN_COAT)
                .withCloseSize();

        addProduct("Платье To be Bride", "Телесный подклад. Цветочный орнамент.", 69700, "/img/img16.png", "/img/img16.jpg")
                .withLongDescription("Декор: паетки, бисер. \n" +
                        "Открытая спина.\n" +
                        "Состав: Полиэстер - 100%\n" +
                        "Материал подкладки: Полиэстер - 100%\n" +
                        "Утеплитель: без утеплителя\n" +
                        "Длина: макси\n" +
                        "Застежка: на молнии\n" +
                        "Сезон: Мульти\n" +
                        "Стиль: Выход в свет\n" +
                        "Детали: одежды бисер/бусины, пайетки/блестки\n" +
                        "Узор: Цветочный\n" +
                        "Артикул: MP002XW0DPA9")
                .withColor("Черно-бежевый", "Сине-бежевый", "Бежевый")
                .fermale(Categories.WOMAN_DRESS)
                .withCloseSize();

        addProduct("Платье Фламенко Michal Nergin", "Длинное вечернее платье Фламенко на брителях с кружевной оттелкой. \nЗолотисный цветочный орнамент в викторианском стиле, украшенный кристаллами Swarovski. Крой - А-силуэт. \nВерх платья из плотной эластичной ткани, ниже бедра полупрозрачная сетка с кружевными вставками.", 110900, "/img/img17.png", "/img/img17.jpg")
                .withLongDescription("Состав: Полиэстер - 91%, Лайкра - 9%\n" +
                        "Материал подкладки: Без подкладки\n" +
                        "Утеплитель: Без утеплителя\n" +
                        "Размер модели на фото: S\n" +
                        "Рост модели на фото: 177\n" +
                        "Параметры модели: 81-63-89\n" +
                        "Застежка: без застежки\n" +
                        "Сезон: Мульти\n" +
                        "Стиль: Выход в свет, Романтический\n" +
                        "Коллекция: Осень-зима\n" +
                        "Детали: одежды сетка, камни/стразы\n" +
                        "Узор: Цветочный\n" +
                        "Артикул: MP002XW1GIXJ")
                .fermale(Categories.WOMAN_DRESS)
                .withColor("Черно-золотистый", "Черно-серебристый", "Серебристо-золотой")
                .withCloseSize();

        addProduct("Платье Red Valentino", "Платье Red Valentino выполнено из тонкого полупрозрачного текстиля. Модель с подкладкой внутри.", 59399, "/img/img18.png", "/img/img18.jpg")
                .withLongDescription("Особенности: \n" +
                        "прямой крой, \n" +
                        "застежка на спинке, \n" +
                        "отложной воротник, \n" +
                        "плиссированная юбка.\n" +
                        "Состав: Полиэстер - 100%\n" +
                        "Длина рукава: 16 см\n" +
                        "Длина: 100 см\n" +
                        "Размер модели на фото: M\n" +
                        "Рост модели на фото: 180\n" +
                        "Параметры модели: 83-61-91\n" +
                        "Длина: миди\n" +
                        "Рукав: короткий\n" +
                        "Застежка: на молнии\n" +
                        "Страна производства: Венгрия\n" +
                        "Сезон: Мульти\n" +
                        "Стиль: Повседневный\n" +
                        "Коллекция: Весна-лето\n" +
                        "Узор: Цветочный\n" +
                        "Вырез/воротник: Отложной\n" +
                        "Назначение платья: Повседневное\n" +
                        "Артикул: RE025EWOGF65")
                .fermale(Categories.WOMAN_DRESS)
                .withColor("Черный", "Синий", "Красный")
                .withCloseSize();

        addProduct("Туфли Casadei", "47 499 руб.", 47499, "/img/img22.png", "/img/img22.jpg")
                .fermale(Categories.WOMAN_SHOES)
                .withColor("Розово-красный", "Розово-синий", "Розово-зеленый")
                .withShoeSize();

        addProduct("Туфли Nando Muzi", "33 999 руб.", 33999, "/img/img23.png", "/img/img23.jpg")
                .fermale(Categories.WOMAN_SHOES)
                .withColor("Черный", "Серый", "Белый")
                .withShoeSize();

        addProduct("Туфли Loriblu", "32 999 руб.", 32999, "/img/img24.png", "/img/img24.jpg")
                .fermale(Categories.WOMAN_SHOES)
                .withColor("Синий", "Розовый", "Желтый")
                .withShoeSize();

        addProduct("Блуза Али Michal Nergin", "38 490 руб.", 38490, "/img/img1.png", "/img/img1.jpg")
                .fermale(Categories.WOMAN_BLOUSE)
                .withColor("Бирюзовый", "Розовый", "Желтый")
                .withCloseSize();

        addProduct("Блуза Cavalli Class", "27 499 руб.", 27499, "/img/img2.png", "/img/img2.jpg")
                .fermale(Categories.WOMAN_BLOUSE)
                .withColor("Розовый", "Желтый", "Бирюзовый")
                .withCloseSize();

        addProduct("Блуза Sportmax Code", "23 999 руб.", 23999, "/img/img3.png", "/img/img3.jpg")
                .fermale(Categories.WOMAN_BLOUSE)
                .withColor("Черный", "Красный", "Синий")
                .withCloseSize();

        addProduct("Юбка Twin-Set Simona Barbieri", "25 599 руб.", 25599, "/img/img4.png", "/img/img4.jpg")
                .fermale(Categories.WOMAN_SKIRT)
                .withColor("Серый", "Черный", "Бежевый")
                .withCloseSize();

        addProduct("Юбка Elisabetta Franchi", "15 999 руб.", 15999, "/img/img5.png", "/img/img5.jpg")
                .fermale(Categories.WOMAN_SKIRT)
                .withColor("Красный", "Черный", "Синий")
                .withCloseSize();

        addProduct("Юбка Elmira Markes", "14 100 руб.", 14100, "/img/img6.png", "/img/img6.jpg")
                .fermale(Categories.WOMAN_SKIRT)
                .withColor("Черный", "Серебристый", "Золотой")
                .withCloseSize();

        addProduct("Брюки Boutique Moschino", "28 499 руб.", 28499, "/img/img31.png", "/img/img31.jpg")
                .fermale(Categories.WOMAN_PANTS)
                .withColor("Желтый", "Розовый", "Голубой")
                .withCloseSize();

        addProduct("Брюки French Connection", "26 999 руб.", 26999, "/img/img32.png", "/img/img32.jpg")
                .fermale(Categories.WOMAN_PANTS)
                .withColor("Коричневый", "Красный", "Черный")
                .withCloseSize();

        addProduct("Брюки Max&Co", "19 999 руб.", 19999, "/img/img33.png", "/img/img33.jpg")
                .fermale(Categories.WOMAN_PANTS)
                .withColor("Бордовый", "Черный", "Синий")
                .withCloseSize();

        // -----------------------------------

        addProduct("Рубашка Just Cavalli", "19 999 руб.", 19999, "/img/img7.png", "/img/img7.jpg")
                .male(Categories.MEN_SHIRT)
                .withColor("Черный", "Синий", "Серый")
                .withCloseSize();

        addProduct("Рубашка Love Moschino", "14 999 руб.", 14999, "/img/img8.png", "/img/img8.jpg")
                .male(Categories.MEN_SHIRT)
                .withColor("Белый", "Черный", "Серый")
                .withCloseSize();

        addProduct("Рубашка NIGHT RIDE Affliction", "11 499 руб.", 11499, "/img/img9.png", "/img/img9.jpg")
                .male(Categories.MEN_SHIRT)
                .withColor("Красный", "Серый", "Черный")
                .withCloseSize();

        addProduct("Пуховик Woolrich", "82 199 руб.", 82199, "/img/img13.png", "/img/img13.jpg")
                .male(Categories.MEN_COAT)
                .withColor("Черный", "Зеленый", "Коричневый")
                .withCloseSize();

        addProduct("Дубленка Mondial", "69 900 руб.", 69900, "/img/img14.png", "/img/img14.jpg")
                .male(Categories.MEN_COAT)
                .withColor("Черный", "Коричневый", "Бежевый")
                .withCloseSize();

        addProduct("Пуховик C.P. Company", "53 899 руб.", 53899, "/img/img15.png", "/img/img15.jpg")
                .male(Categories.MEN_COAT)
                .withColor("Красный", "Синий", "Черный")
                .withCloseSize();

        addProduct("Брюки спортивные Markus Lupfer", "27 399 руб.", 27399, "/img/img19.png", "/img/img19.jpg")
                .male(Categories.MEN_PANTS)
                .withColor("Черно-серый", "Черно-синий", "Черно-белый")
                .withCloseSize();

        addProduct("Брюки Boss", "21 000 руб.", 21000, "/img/img20.png", "/img/img20.jpg")
                .male(Categories.MEN_PANTS)
                .withColor("Черный", "Серый", "Белый")
                .withCloseSize();

        addProduct("Чиносы Iceberg", "16 299 руб.", 16299, "/img/img21.png", "/img/img21.jpg")
                .male(Categories.MEN_PANTS)
                .withColor("Белый", "Серый", "Синий")
                .withCloseSize();

        addProduct("Пиджак Boss", "48 000 руб.", 48000, "/img/img25.png", "/img/img25.jpg")
                .male(Categories.MEN_JACKET)
                .withColor("Черный", "Серый", "Белый")
                .withCloseSize();

        addProduct("Пиджак Joop!", "35 999 руб.", 35999, "/img/img26.png", "/img/img26.jpg")
                .male(Categories.MEN_JACKET)
                .withColor("Серый", "Белый", "Черный")
                .withCloseSize();

        addProduct("Пиджак Tommy Hilfiger", "33 990 руб.", 33990, "/img/img27.png", "/img/img27.jpg")
                .male(Categories.MEN_JACKET)
                .withColor("Бежевый", "Черный", "Серый")
                .withCloseSize();

        addProduct("Лоферы Roberto Cavalli", "39 999 руб.", 39999, "/img/img28.png", "/img/img28.jpg")
                .male(Categories.MEN_SHOES)
                .withColor("Черный", "Серый", "Коричневый")
                .withShoeSize();

        addProduct("Туфли Roberto Botticelli", "49 399 руб.", 49399, "/img/img29.png", "/img/img29.jpg")
                .male(Categories.MEN_SHOES)
                .withColor("Черный", "Коричневый", "Бежевый")
                .withShoeSize();

        addProduct("Туфли Moma", "29 999 руб.", 29999, "/img/img30.png", "/img/img30.jpg")
                .male(Categories.MEN_SHOES)
                .withColor("Синий", "Черный", "Белый")
                .withShoeSize();

        addProduct("Футболка Plein Sport", "24 499 руб.", 24499, "/img/img34.png", "/img/img34.jpg")
                .male(Categories.MEN_POLO)
                .withColor("Белый", "Черный", "Красный")
                .withCloseSize();

        addProduct("Поло Love Moschino", "18 999 руб.", 18999, "/img/img35.png", "/img/img35.jpg")
                .male(Categories.MEN_POLO)
                .withColor("Красный", "Синий", "Зеленый")
                .withCloseSize();

        addProduct("Футболка Versace Jeans", "14 499 руб.", 14499, "/img/img36.png", "/img/img36.jpg")
                .male(Categories.MEN_POLO)
                .withColor("Зеленый", "Желтый", "Синий")
                .withCloseSize();
    }


    private static Product addProduct(String name, String description, int price, String img, String img_) {
        Product product = new Product(allProducts.size(), name, description, price, img, img_);

        allProducts.add(product);
        return product;
    }


    // поиск продукта (фильтрация)

    public static List<Product> getProducts(String categoryStr, String query) {
        Gender gender = null;
        Categories category = null;

        if (categoryStr != null) {
            if ("FOR_WOMEN".equals(categoryStr)) {
                gender = Gender.FOR_WOMAN;
            }
            if ("FOR_MEN".equals(categoryStr)) {
                gender = Gender.FOR_MEN;
            }
            for (Categories c : Categories.values()) {
                if (c.name().equals(categoryStr)) {
                    category = c;
                }
            }
        }


        List<Product> result = new ArrayList();
        for (Product p : allProducts) {
            if (!p.fromCategory(gender, category)) {
                continue;
            }
            if (query == null) {
                result.add(p);
            } else {
                String s = query.toLowerCase();
                if (p.getName().toLowerCase().contains(s) ||
                        p.getDescription().toLowerCase().contains(s) ||
                        p.getLongDescription().toLowerCase().contains(s)) {
                    result.add(p);
                }
            }
        }
        return result;
    }

    public static Product getProduct(int id) {
        for (Product p : allProducts) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }
}