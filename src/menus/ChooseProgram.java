package menus;

public class ChooseProgram implements Menu{

    String name = "Выбрать программу";
    String parentName = "Главное меню";
    String[] possibleOptions = {"Программа 1", "Программа 2", "Назад"};


    public String getName() { return name; }

    public String[] getOptions() { return possibleOptions; }

    public String getParentName() { return parentName; }
}
