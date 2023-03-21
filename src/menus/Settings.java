package menus;

public class Settings implements Menu{

    String name = "Настройки";
    String parentName = "Главное меню";
    String[] possibleOptions = {"Выбрать язык", "Назад"};


    public String getName() { return name; }

    public String[] getOptions() { return possibleOptions; }

    public String getParentName() { return parentName; }
}
