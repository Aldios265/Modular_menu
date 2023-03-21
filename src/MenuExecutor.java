import java.util.Scanner;

/*Данный класс, а точнее метод menuExecutor активирующий объект имплементирующий интерфейс Menu,
 помещенный в него в качестве параметра,
и выводит в консоль соотвесттвующие данному объекту сообщения.
* Данный класс является универсальным и может автивировать любой объект класса */
public class MenuExecutor {

    /*Данный метод выводит в консоль заголовок меню*/
    public static void printHeader(String name) {
        System.out.println("\n\n\n\n\n\n");
        System.out.println("Modular_Menu");
        System.out.println("------------");
        System.out.println(name);
        System.out.println("------------");


    }
    /* Данный метод выводит в консоль все варианты выбора, соответствующие данному меню вместе с их индексами,
    * к которым прибавляется еденица(user friendly)*/
    public static void printChoices(String[] possibleOptions) {
        for (int i = 0; i < possibleOptions.length; i++) {
            System.out.println((i + 1) + ") " + possibleOptions[i]);
        }
        System.out.println("Для выбора введите номер опции:");
    }

/* Данный метод считывает введенное пользователем в консоль значение а также
* в случае неправильности ввода выводит некоторые ошибки*/
    public static int userInput(int length) {
        int input;
        Scanner scanner = new Scanner(System.in);
        try {
            input = Integer.parseInt(scanner.next());
            System.out.println("\n\n\n");
        } catch (Exception e) {
            throw new IllegalArgumentException("Введен неверный символ, ожидался номер опции");
        }
        if ((input > 0) && (input <= length)) {
            return input;
        } else {
            throw new IllegalArgumentException("Введен неверный номер опции");
        }
    }


/*Главный метод данного класса, см.описание в самом верху*/
    public static String mainExecutor(menus.Menu menu) {


        String name = menu.getName();
        String[] options = menu.getOptions();


        printHeader(name);
        printChoices(options);
        return options[userInput(options.length) - 1];
    }


}







//        //----------------------
//        String treeName = "MainMenu";
//        String[] tree = {"ChooseProgram", "Settings", "Info", "Back"};
//
//        String name = "ModularSolver\nГлавное меню";
//        String[] possibleOptions = {"Выбрать программу", "Настройки", "Информация", "Назад"};
//        //------------------