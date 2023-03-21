import functions.*;
import menus.*;
import java.util.Scanner;

import java.util.Scanner;

public class MenuStructure {

    public static void menuCycle(Menu[] menuArray, Function[] functionArray) {

        boolean exit = false;
        boolean functionFound = false;
        String toExecute = "Главное меню";
        String pastExecution = "";


        while (!exit) {
            functionFound = false;

            for (Menu i : menuArray) {
                if (i.getName().equals(toExecute)) {
                    pastExecution = toExecute;
                    toExecute = MenuExecutor.mainExecutor(i);
                    if (toExecute.equals("Назад")) {
                        toExecute = i.getParentName();
                    }
                    functionFound = true;
                }
            }

            if (!functionFound) {
                for (Function k : functionArray) {
                    if (k.getName().equals(toExecute)) {
                        k.execute();
                        k.exit();
                        toExecute = pastExecution;
                        functionFound = true;
                    }
                }
            }

            if (!functionFound) {
                System.out.println("К сожалению, на данный момент данной опции не существует.\n " +
                        "Чтобы вернуться в меню введите любой символ:");
                Scanner scanner = new Scanner(System.in);
                scanner.next();
                toExecute = pastExecution;
            }
        }
    }
}

