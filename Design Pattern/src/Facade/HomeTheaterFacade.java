package Facade;

public class HomeTheaterFacade {
    Amplifier amp;
    Tuner tuner;
    DvdPlayer dvd;

    public HomeTheaterFacade(Amplifier amp, Tuner tuner, DvdPlayer dvd) {
        this.amp = amp;
        this.tuner = tuner;
        this.dvd = dvd;
    }

    public void watchMovie(String movie) {
        amp.on();
        amp.setDvd();
        amp.setMusic();
        dvd.on();
        dvd.play(movie);
        
    }
}
