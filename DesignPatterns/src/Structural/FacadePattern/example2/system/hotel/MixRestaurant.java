package Structural.FacadePattern.example2.system.hotel;

import Structural.FacadePattern.example2.system.menu.BothMenu;
import Structural.FacadePattern.example2.system.menu.Menus;

public class MixRestaurant implements Hotel {
    public Menus getMenus() {
        return new BothMenu();
    }
}
