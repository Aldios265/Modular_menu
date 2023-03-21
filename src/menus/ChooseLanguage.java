package menus;

public class ChooseLanguage implements Menu{

    String name = "Выбрать язык";
    String parentName = "Настройки";
    String[] possibleOptions = {"Русский", "Назад"};


    public String getName() { return name; }

    public String[] getOptions() { return possibleOptions; }

    public String getParentName() { return parentName; }
}
