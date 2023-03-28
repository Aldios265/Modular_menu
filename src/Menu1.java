public class Menu1 {

    FunctionalOption info = new FunctionalOption() {
        public void execute() {
            InfoClass.printInfo();
        }
    };


    Object[][] menuArray = {{"Главное меню", "Главное меню", "Выбрать программу", "Настройки", "Информация"},
                                {"Выбрать программу", "Главное меню", "Программа1", "Программа2"},
                                {"Настройки", "Главное меню", "Сменить язык"},
                                {"Информация", info}
    };
}
