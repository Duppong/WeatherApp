import java.io.InputStream;
import java.net.HttpURLConnection;

public class WeatherHttpRequest {
	
	 static final String apiKey ="&appid=7d6c101de32c56801610872143aba7d6";
	 String owm = "api.openweathermap.org/data/2.5/";
	 static final String current = "weather?";
	 static final String hourly = "forecast?";
	 
	 
	 String cityName = "Bismarck";
	 String zipCode = "58504";
	 String countryCode = "US";
	 
	 public WeatherHttpRequest(String zipCode, String countryCode)
	 {
		 this.zipCode = zipCode;
		 this.countryCode = countryCode;
	 }
	 
	 public String requestCurrentZipCode(String zipCode, String countyCode)
	 {
		 StringBuilder url = new StringBuilder();
		 
		 url.append(owm);
		 url.append(current);
		 url.append("zip=" + zipCode);
		 url.append("," + countryCode);
		 url.append(apiKey);
		 
		 return url.toString();
	 }
	 
	 
	 public String getWeatherData(String url)
	 {
		 HttpURLConnection con = null;
		 InputStream is = null;
		 

		 return null;
	 }
}
