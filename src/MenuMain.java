import functions.*;
import menus.Menu;

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