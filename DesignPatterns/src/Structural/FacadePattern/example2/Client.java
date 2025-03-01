package Structural.FacadePattern.example2;

import Structural.FacadePattern.example2.system.menu.Menus;

public class Client {

    public static void main(String[] args) {
        HotelKeeper keeper = new HotelKeeper();
        Menus vegMenu = keeper.getVegMenu();
        vegMenu.showMenu();

        Menus nonVeg = keeper.getNonVegMenu();
        nonVeg.showMenu();

        Menus mixMenu = keeper.getMixMenus();
        mixMenu.showMenu();
    }
}
