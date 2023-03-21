package functions;

public class Information implements functions.Function {
    String name = "Программа 1";

    public void execute() {
        System.out.println("Здесь должна быть информация о вашем проекте");
    }

    public String getName() {
        return name;
    }
}
