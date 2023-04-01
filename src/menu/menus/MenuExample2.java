package menu.menus;

import menu.*;
import functionsTest.*;

public class MenuExample2 {

    Function info2 = new Function() {
        public void execute() {
            System.out.println("Информация о программе");
        }
    };
    Function program1 = new Function() {
        public void execute() {
            menu.functions.TestClass.someFunction();
        }
    };

    Function program2 = new Function() {
        public void execute() {
            menu.functions.TestClass2.someFunction();
        }
    };

    Function changeMapping = new Function() {
        public void execute() {
            functionsTest.ChangeMapping.changeMapping();
        }
    };

    public Object[][] menuArray = {{"Главное меню", "Главное меню", "Выбрать программу", "Настройки", "Информация"},
            {"Выбрать программу", "Главное меню", "Программа1", "Программа2", "Назад"},
                {"Программа1", program1},
                {"Программа2", program2},
            {"Настройки", "Главное меню", "Настройки отображения(тест)", "Сменить язык", "Назад"},
                {"Настройки отображения(тест)", "Настройки", "Вид", "Текст", "Цвет", "Назад"},
                    {"Вид", "Настройки отображения(тест)", "Изменить отображение", "Какая-то другая опция", "Назад"},
                        {"Изменить отображение", changeMapping},
                    {"Текст", "Настройки отображения(тест)", "Какая-то опция", "Какая-то другая опция", "Назад"},
                    {"Цвет", "Настройки отображения(тест)", "Какая-то опция", "Какая-то другая опция", "Назад"},
            {"Информация", info2}
    };
}
