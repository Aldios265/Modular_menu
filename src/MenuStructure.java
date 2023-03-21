import functions.*;
import menus.*;

public class MenuStructure {

    public static void menuCycle(Menu[] menuArray, Function[] functionArray) {

        boolean exit = false;
        boolean functionFound = false;
        String toExecute = "Главное меню";


        while (!exit) {
            functionFound = false;

            for (Menu i : menuArray) {
                if (i.getName().equals(toExecute)) {
                    toExecute = MenuExecutor.mainExecutor(i);
                    if (toExecute.equals("Назад")) {
                        toExecute = i.getParentName();
                    }
                }
                functionFound = true;
            }
        }


            if (!functionFound) {
                for (Function k : functionArray) {
                    if (k.getName().equals(toExecute)) {
                        k.execute();
                        functionFound = true;
                    }
                }
            }


            if (!functionFound) {
                System.out.println("(убрать) функция не найдена");
            }
        }
    }

