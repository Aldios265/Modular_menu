package menu.menus;

import menu.functions.Function;

public class MenuExample2 {

    Function info2 = new Function() {
        public void execute() {
            System.out.println("Информация о программе");
        }
    };
    Function program2 = new Function() {
        @Override
        public void execute() {
            menu.functions.TestClass2.someFunction();
        }
    };

    public Object[][] menuArray = {{"Главное меню", "Главное меню", "Выбрать программу", "Настройки", "Информация"},
            {"Выбрать программу", "Главное меню", "Программа1", "Программа2", "Назад"},
            {"Программа2", program2},
            {"Настройки", "Главное меню", "Сменить язык", "Назад"},
            {"Информация", info2}
    };
}
