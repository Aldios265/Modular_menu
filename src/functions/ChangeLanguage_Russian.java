package functions;

import settings.MenuSettings;

public class ChangeLanguage_Russian implements functions.Function {
    String name = "Русский";

    public void execute() {
        if (!settings.MenuSettings.language.equals("русский")) {
            MenuSettings.language = "русский";
            System.out.println("Установлен русский язык");
        } else {
            System.out.println("Данный язык уже установлен");
        }


    }

    public String getName() {
        return name;
    }
}
