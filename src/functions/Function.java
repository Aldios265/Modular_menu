package functions;
import java.util.Scanner;

/* Классы содержащиеся, находящиеся в данном пакете являются функциональнымы опциями данной программы,
 они предназначены для выполнения непосредственно сторонних или внутренних программ.
 Все объекты функциональных опций должны имплементировать данный интерфейс, который
 помимо метода считывания getName() имеет метод execute(). Для удобства навигации рекомендуется в названии
  функциональной опции указывать имя меню, от которого она заимствуется*/
public interface Function {

    /* Метод выполения соответствующей функфиональной опции */
    void execute();

    String getName();

    default void exit() {
        System.out.println(" Программа завершена.\n Чтобы вернуться в меню введите любой символ:");
        Scanner scanner = new Scanner(System.in);
        scanner.next();
    }
}
