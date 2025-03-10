package Structural.FacadePattern.example1;

import Structural.FacadePattern.example1.complexSystem.*;

public class client {
    public static void main(String[] args) {
        System.out.println("ComplexSystem usage\n");
        Amplifier amp = new Amplifier("Top-O-Line Amplifier");
        Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner", amp);
        DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player", amp);
        CdPlayer cd = new CdPlayer("Top-O-Line CD Player", amp);
        Projector projector = new Projector("Top-O-Line Projector", dvd);
        TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
        Screen screen = new Screen("Theater Screen");
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");

        // Using the Facade
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd, cd,
                projector, screen, lights, popper);
        homeTheater.watchMovie("Inception");
        homeTheater.endMovie();
    }

}
