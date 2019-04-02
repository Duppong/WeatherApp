
public class urlEntry {

	
	 static final String apiKey ="&appid=7d6c101de32c56801610872143aba7d6";
	 static final String current = "http://api.openweathermap.org/data/2.5/weather?";
	 static final String forecast = "http://api.openweathermap.org/data/2.5/forecast?";
	 String cityName = null;
	 String zipCode = null;
	 static String countryCode = "us";
	 String lang = null;
	 
	 public static String getForecastByZipCode(String zipcode)
	 {
		 return forecast + "zip=" + zipcode+ "," +countryCode + apiKey;
	 }
	 
	 public static String getForecastByCity(String city)
	 {
		 return forecast + "q=" + city + "," + countryCode + apiKey;
	 }
}
