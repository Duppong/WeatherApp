import org.json.JSONException;

public class Test {

	public static void main(String[] args) throws JSONException {
		
		//Reuqest object
		WeatherHttpRequest request = new WeatherHttpRequest();
	
		//Example for current Weather call
		Weather w1 = new Weather(JsonWeatherReader.getWeather(request.getWeatherData(urlEntry.getCurrentByZipCode("58504"))));
			
		System.out.println("Current:");
		System.out.println(w1.temperature.getTemp());
		System.out.println(w1.temperature.getMaxTemp());
		System.out.println(w1.temperature.getMinTemp());
		System.out.println(w1.currentCondition.getHumidity());
		System.out.println(w1.wind.getSpeed());
		System.out.println(w1.currentCondition.getCondition());
		System.out.println(w1.currentCondition.getDescription());
		
		
		/*Forecast Test
		 * WeatherForecast f1 = new WeatherForecast(JsonWeatherReader.getWeatherForecast(request.getForecastWeatherData(urlEntry.getForecastByZipCode("58504"))));

		 * System.out.println("Forecast:");
		 * System.out.println(f1.getForecast(0).getDateText());
		 * System.out.println(f1.getForecast(0).weather.temperature.getMaxTemp());
		 * System.out.println(f1.getForecast(7).weather.temperature.getMinTemp());
		 * System.out.println(f1.getForecast(7).getDateText()); System.out.println();
		 * 
		 * System.out.println(f1.getForecast(8).getDateText());
		 * System.out.println(f1.getForecast(8).weather.temperature.getMaxTemp());
		 * System.out.println(f1.getForecast(15).weather.temperature.getMinTemp());
		 * System.out.println(f1.getForecast(15).getDateText()); System.out.println();
		 * 
		 * System.out.println(f1.getForecast(16).getDateText());
		 * System.out.println(f1.getForecast(16).weather.temperature.getMaxTemp());
		 * System.out.println(f1.getForecast(23).weather.temperature.getMinTemp());
		 * System.out.println(f1.getForecast(23).getDateText()); System.out.println();
		 * 
		 * System.out.println(f1.getForecast(24).getDateText());
		 * System.out.println(f1.getForecast(24).weather.temperature.getMaxTemp());
		 * System.out.println(f1.getForecast(31).weather.temperature.getMinTemp());
		 * System.out.println(f1.getForecast(31).getDateText()); System.out.println();
		 * 
		 * System.out.println(f1.getForecast(32).getDateText());
		 * System.out.println(f1.getForecast(32).weather.temperature.getMaxTemp());
		 * System.out.println(f1.getForecast(38).weather.temperature.getMinTemp());
		 * System.out.println(f1.getForecast(38).getDateText());
		 */
		
		
		
	}

}
