package menus;

public class MainMenu implements Menu {

    /* Основным объектом проекта является так называемое окно меню. Все окна меню содержатся в
     * пакете menus и содержат следующие поля:*/

    /* Имя данного окна меню*/
    String name = "Главное меню";

    /* Поле parentName содержит имя окна меню, из которого данное окно вызывается, используется для
     * реализации опции "назад", в данном конкретном случае данное поле пустое т.к главное меню находится на
     * вершине дерева меню */
    String parentName = "";

    /* Данное поле содержит массив всех опций данного меню*/
    String[] possibleOptions = {"Выбрать программу", "Настройки", "Информация"};


    /* Соответствующие get-методы интерфейса Menu*/
    public String getName() { return name; }

    public String getParentName() { return parentName; }

    public String[] getOptions() { return possibleOptions; }

}

