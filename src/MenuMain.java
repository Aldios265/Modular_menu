import functions.*;
import menus.*;

import menus.Menu;

/** Главные класс данного проекта, в нем создаются все объекты окон меню и функций и добавляются в массив
 меню и функций соответственно. Данный класс содержит функцию main()**/
public class MenuMain {


    static menus.MainMenu mainMenu = new menus.MainMenu();
    static menus.Settings settings = new menus.Settings();
    static ChooseProgram chooseProgram = new ChooseProgram();
    static ChooseLanguage chooseLanguage = new ChooseLanguage();

    static Menu[] menuArray = {mainMenu, settings, chooseProgram, chooseLanguage};


    static ChooseProgram_Program1 program1 = new ChooseProgram_Program1();
    static ChooseProgram_Program2 program2 = new ChooseProgram_Program2();
    static ChangeLanguage_Russian changeLanguage_russian = new ChangeLanguage_Russian();

    static Function[] functionArray = {program1, program2, changeLanguage_russian};

    public static void main(String[] args) {
        MenuStructure.menuCycle(menuArray, functionArray);
    }
}

























//Куницкий Андрей Владимирович