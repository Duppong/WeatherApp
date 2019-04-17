import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.json.JSONException;

public class Test {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws JSONException, ParseException {
		
		//Request object
		WeatherHttpRequest request = new WeatherHttpRequest();
	
		//Example for current Weather call
		/*
		 * Weather w1 = new
		 * Weather(JsonWeatherReader.getWeather(request.getWeatherData(urlEntry.
		 * getCurrentByZipCode("58504"))));
		 * 
		 * System.out.println("Current:"); System.out.println(w1.temperature.getTemp());
		 * System.out.println(w1.temperature.getMaxTemp());
		 * System.out.println(w1.temperature.getMinTemp());
		 * System.out.println(w1.currentCondition.getHumidity());
		 * System.out.println(w1.wind.getSpeed());
		 * System.out.println(w1.currentCondition.getCondition());
		 * System.out.println(w1.currentCondition.getDescription());
		 */
		
		//Forecast Test
		  WeatherForecast f1 = new WeatherForecast(JsonWeatherReader.getWeatherForecast(request.getForecastWeatherData(urlEntry.getForecastByZipCode("58504"))));

		  System.out.println("Forecast:");

		  System.out.println(f1.getForecast(0).weather.temperature.getMaxTemp());
		  System.out.println(f1.getForecast(7).weather.temperature.getMinTemp());
		  System.out.println(f1.getForecast(7).getCalendar());
		  System.out.println(f1.getForecast(7).getDate());
		  System.out.println();

		  System.out.println(f1.getForecast(8).weather.temperature.getMaxTemp());
		  System.out.println(f1.getForecast(15).weather.temperature.getMinTemp());
		  System.out.println(f1.getForecast(15).getCalendar());
		  System.out.println(f1.getForecast(15).getDate());
		  System.out.println();

		  System.out.println(f1.getForecast(16).weather.temperature.getMaxTemp());
		  System.out.println(f1.getForecast(23).weather.temperature.getMinTemp());
		  System.out.println(f1.getForecast(23).getCalendar());
		  System.out.println(f1.getForecast(23).getDate());
		  System.out.println();

		  System.out.println(f1.getForecast(24).weather.temperature.getMaxTemp());
		  System.out.println(f1.getForecast(31).weather.temperature.getMinTemp());
		  System.out.println(f1.getForecast(31).getCalendar());
		  System.out.println(f1.getForecast(31).getDate());
		  System.out.println();


		  System.out.println(f1.getForecast(32).weather.temperature.getMaxTemp());
		  System.out.println(f1.getForecast(38).weather.temperature.getMinTemp());
		  System.out.println(f1.getForecast(38).getCalendar());
		  System.out.println(f1.getForecast(38).getDate());
		  System.out.println();
		  

		  
		  
		  
		
	}

}
