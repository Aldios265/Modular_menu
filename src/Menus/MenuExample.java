package Menus;

import functions.*;

public class MenuExample {

    FunctionalOption info = new FunctionalOption() {
        public void execute() {
            InfoClass.printInfo();
        }
    };

    Object[][] menuArray = {{"Главное меню", "Главное меню", "Выбрать программу", "Настройки", "Информация"},
            {"Выбрать программу", "Главное меню", "Программа1", "Программа2", "Назад"},
            {"Настройки", "Главное меню", "Сменить язык", "Назад"},
            {"Информация", info}
    };
}
