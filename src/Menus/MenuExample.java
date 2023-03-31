package Menus;

import functions.*;

public class MenuExample {


    /* Декларация анонимного класса с помощью интерфейса Function. Анонимный класс используется для возможности
    реализации функциональных опциий, содержащих множество функций различных классов, в том числе и не содержащихся в
    данном репозитории*/
    Function info = new Function() {
        public void execute() {
            System.out.println("тестовая функция");
        }
    };

    /* Главный массив меню. Этот двухмерный массив включает подммассивы "окон меню" и "функциональных опций" (далее без ковычек)
     * Окна меню - это подмассивы, выполняющиеся классом MenuExecutor.
     * Функциональные опции - подмассивы, которые при выполнении активируют определенные методы сторонных классов.
     *
     * Рассмотрим подмассивы окон меню.
     * Каждый такой подмассив содержит несколько полей. Первое поле - название окна меню. Оно отображается в шапке меню при
     * его выполении, и именно по нему класс MenuStructure ищит нужную опцию перед перенаправлением ее классу MenuExecutor.
     * Вторая опция - название опции, высшей по иерархии, т.е класс от которого данная опция наследуется.
     * Опции следующие далее(со 2 если счет начинать с нуля) - возможные опции данного окна меню, которые должны
     * соответствовать названию какого либо другого окна меню или функциональной опции. Важно, чтобы все
     * названия опциий строго соответствовали названиям окон менб или функциональных опции, они также чувствительны к
     * регистру. Итого имеем структуру подмассива {"Имя окна меню", "Имя окна меню родителя", "Опция 1" , "Опция 2" , "Опция 3", ...}
     * Предположим, мы хотим создать осно меню с названием "Выбрать программу", для начала мы должны решить, из
     * какой опции меню оно будет доступно, в нашем случае мы хотим чтобы оно было доступно из окна главного меню,
     * именно туда мы и записываем имя нащей опции(в нашем случае это 2 позиция если счет начинать с нуля), Затем
     * создаем новый подмассив, у которого первое поле будет представлять точно такую же строку(учитывая регистр!),
     * следующее поле - строка с названием окна - родителя, в нашем случае это "Главное меню", далее прописываем
     * возможные для данного окна меню опции.
     *
     * Подмассивы функциональных опций содержат в себе только название опции и анонимный оюъект, задекларированный
     * над данным описанием, при активации которого выполняется код внутри соответствующего анонимного класса.
     * Т.е по сути функциональные опции, как это следует из названия добавляют функционал в данное меню.
     *
     * При создании массива неню понядок следования подмассивов не имеет значения. Однако для удобства навигации
     * рекомендуется прописывать подмассивы опций меню непосредственно под подмассивом окон меню в том
     * же порядке в котором следуют опции вышестоящего окна меню, при этом проставляя знаки табуляции. */

    public Object[][] menuArray = {{"Главное меню", "Главное меню", "Выбрать программу", "Настройки", "Информация"},
            {"Выбрать программу", "Главное меню", "Программа1", "Программа2", "Назад"},
            {"Настройки", "Главное меню", "Сменить язык", "Назад"},
            {"Информация", info}
    };
}
