import org.json.JSONException;

public class test {

	public static void main(String[] args) throws JSONException {
		WeatherHttpRequest request = new WeatherHttpRequest("58504", "us");
		
		//url is hardcoded for testing
		Weather w1 = new Weather(JsonWeatherReader.getWeather(request.getWeatherData()));
		
		System.out.println(w1.location.getCity());
		//System.out.println(w1.temperature.getMaxTemp());
	//	w1.temperature.getMaxTemp();

	}

}
