package Structural.FacadePattern.example2;

import Structural.FacadePattern.example2.system.hotel.NonVegRestaurant;
import Structural.FacadePattern.example2.system.hotel.MixRestaurant;
import Structural.FacadePattern.example2.system.hotel.VegRestaurant;
import Structural.FacadePattern.example2.system.menu.BothMenu;
import Structural.FacadePattern.example2.system.menu.Menus;
import Structural.FacadePattern.example2.system.menu.NonVegMenu;
import Structural.FacadePattern.example2.system.menu.VegMenu;

public class HotelKeeper {
    public Menus getVegMenu() {
        VegRestaurant v = new VegRestaurant();
        VegMenu vegMenu = (VegMenu) v.getMenus();
        return vegMenu;
    }

    public Menus getNonVegMenu() {
        NonVegRestaurant v = new NonVegRestaurant();
        NonVegMenu nonVegMenu = (NonVegMenu) v.getMenus();
        return nonVegMenu;
    }

    public Menus getMixMenus() {
        MixRestaurant v = new MixRestaurant();
        BothMenu bothMenu = (BothMenu) v.getMenus();
        return bothMenu;
    }

}
