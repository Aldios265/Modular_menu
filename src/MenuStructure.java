
import functions.ChangeLanguage;
import functions.Function;
import menus.*;

public class MenuStructure {

    public static void menuCycle(Menu[] menuArray, Function[] functionArray) {
        boolean exit = false;
        boolean functionFound = false;
        String toExecute = "Главное меню";
        String pastExecution = "Главное меню";
        while (!exit) {
            functionFound = false;
            for (Menu i : menuArray) {
                if (i.getName().equals(toExecute)) {
                    if (pastExecution != toExecute) {
                        pastExecution = toExecute;
                    }
                    toExecute = MenuExecutor.mainExecutor(i);
                    if (toExecute == "Назад") {
                        toExecute = pastExecution;
                    }
                    functionFound = true;
                }
            }
            if (!functionFound) {
                for (Function k : functionArray) {
                    if (k.getName().equals(toExecute)) {
                        k.execute();
                        toExecute = pastExecution;
                        functionFound = true;
                    }
                }
            }

            if (!functionFound) {
                System.out.println("(убрать) функция не найдена");
            }
            System.out.println("1");
        }
    }
}