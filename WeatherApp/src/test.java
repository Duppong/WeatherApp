import org.json.JSONException;

public class test {

	public static void main(String[] args) throws JSONException {
		WeatherHttpRequest request = new WeatherHttpRequest("58504", "us");
		
		JsonWeatherReader.getWeather(request.getWeatherData());
		
		//url is hardcoded for testing
		Weather w1 = new Weather(JsonWeatherReader.getWeather(request.getWeatherData()));
		WeatherForecast wf1 = new WeatherForecast(JsonWeatherReader.getWeatherForecast(request.getForecastWeatherData()));
		
		System.out.println(w1.location.getCity());
		System.out.println(w1.temperature.getMaxTemp());
		System.out.println(w1.currentCondition.getDescription());

		WeatherHttpRequest rForecast = new WeatherHttpRequest();
		
		System.out.println(rForecast.getForecastWeatherData());
		

		System.out.println(wf1.getForecast());
		
	}

}
