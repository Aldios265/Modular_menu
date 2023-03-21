package menus;

/* Все объекты, находящиеся в пакете menus представляют из себя окна меню, активируемые с помощью MenuExecutor-а.
Все класы окон меню должны имплементировать данный интерфейс.
Классы, имплементирующие данный интерфейс должны содержать имя меню, массив возможных его опций,
* а также имя предыдущего меню. Все меню храняться в пакете menus, в котором распологается данный интерфейс,
* и при необходимости по образце может быть создано и интегрировано в основную программу новое окно меню*/
public interface Menu {

    String getName();

    String[] getOptions();
}
