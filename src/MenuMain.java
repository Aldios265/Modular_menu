import functions.*;
import menus.Menu;

/** Главные класс данного проекта, в нем создаются все объекты окон меню и функций и добавляются в массив
 меню и функций соответственно. Данный класс содержит функцию main()**/
public class MenuMain {


    static menus.MainMenu mainMenu = new menus.MainMenu();
    static menus.Settings settings = new menus.Settings();
    static Menu[] menuArray = {mainMenu, settings};

    static ChangeLanguage changeLanguage = new ChangeLanguage();
    static Function[] functionArray = {changeLanguage};

    public static void main(String[] args) {
        MenuStructure.menuCycle(menuArray, functionArray);
    }
}

























//Куницкий Андрей Владимирович