package Structural.FacadePattern.example2.system.hotel;

import Structural.FacadePattern.example2.system.menu.Menus;
import Structural.FacadePattern.example2.system.menu.VegMenu;

public class VegRestaurant implements Hotel {
    public Menus getMenus() {
        return new VegMenu();
    }
}
