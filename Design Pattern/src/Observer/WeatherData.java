package Observer;

import java.util.ArrayList;

public class WeatherData implements Subject{
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public void registerObserver(Observer ob) {
        observers.add(ob);
    }

    public void removeObserver(Observer ob) {
        int index = observers.indexOf(ob);
        if (index != -1) {
            observers.remove(index);
        }
    }

    public void notifyObserver() {
        for (int i = 0; i <observers.size(); i++) {
            Observer observer = observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObserver();
    }

    public void setMeasurements (float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
