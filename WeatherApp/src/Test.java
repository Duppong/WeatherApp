import org.json.JSONException;

public class Test {

	public static void main(String[] args) throws JSONException {
		WeatherHttpRequest request = new WeatherHttpRequest();
		WeatherForecast f1 = new WeatherForecast(JsonWeatherReader.getWeatherForecast(request.getForecastWeatherData(urlEntry.getForecastByZipCode("58504"))));
				
		System.out.println(f1.getForecast(0).weather.temperature.getMinTemp());
		System.out.println(f1.getForecast(1).weather.temperature.getMinTemp());
		System.out.println(f1.getForecast(2).weather.temperature.getMinTemp());
		System.out.println(f1.getForecast(3).weather.temperature.getMinTemp());
		System.out.println(f1.getForecast(4).weather.temperature.getMinTemp());
	}

}
