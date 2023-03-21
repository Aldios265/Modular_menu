package menus;

public class MainMenu implements Menu {


    /* Основным объектом проекта является так называемое окно меню. Все окна меню содержатся в
     * пакете menus и содержат следующие поля:*/
    String name = "Главное меню";

    /* Поле parentName содержит имя окна меню, из которого данное окно вызывается, используется для
     * реализации опции "назад" */
    String parentName = "Главное меню";

    /* Данное поле содержит массив всех опций данного меню*/
    String[] possibleOptions = {"Выбрать программу", "Настройки", "Информация", "Назад"};


    public String getName() {
        return name;
    }

    public String getParentName() { return parentName; }

    public String[] getOptions() {
        return possibleOptions;
    }

}

