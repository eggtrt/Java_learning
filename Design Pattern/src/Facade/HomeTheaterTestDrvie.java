package Facade;

public class HomeTheaterTestDrvie {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd);
        homeTheater.watchMovie('lost ark');
    }
}
