import Displays.CurrentConditionsDisplay;
import Displays.ForecastDisplay;
import Displays.StatisticsDisplay;
import WeatherData.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        // StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        // ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 50, 30.5f);
        weatherData.setMeasurements(84, 76, 24.2f);
        weatherData.setMeasurements(75, 94, 24.2f);
        
    }    
}
