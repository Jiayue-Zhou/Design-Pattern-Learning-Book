import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer {
    Observable o;
    float temperature;
    float humidity;
//    float pressure;
    public CurrentConditionDisplay(Observable o) {
        this.o = o;
        o.addObserver(this);
    }
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
    public void display() {
        System.out.println("Display the current condition of this observer: Temperature: " + temperature
        + "; Humidity: " + humidity + ";");
    }
}
