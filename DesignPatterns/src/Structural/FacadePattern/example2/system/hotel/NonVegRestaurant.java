package Structural.FacadePattern.example2.system.hotel;

import Structural.FacadePattern.example2.system.menu.Menus;
import Structural.FacadePattern.example2.system.menu.NonVegMenu;

public class NonVegRestaurant implements Hotel {
    public Menus getMenus() {
        return new NonVegMenu();
    }
}
