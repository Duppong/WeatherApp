
/**
 * @author duppong
 *
 */
public class urlEntry {

	
	 static final String apiKey ="&appid=7d6c101de32c56801610872143aba7d6";
	 static final String current = "http://api.openweathermap.org/data/2.5/weather?";
	 static final String forecast = "http://api.openweathermap.org/data/2.5/forecast?";
	 String cityName = null;
	 String zipCode = null;
	 static String countryCode = "us";
	 String lang = null;
	 static String format = "&units=imperial";
	 
	 //&units=imperial
	 
	 /**
	 * @param zipcode
	 * @return url String with zipcode
	 */
	public static String getForecastByZipCode(String zipcode)
	 {
		 return forecast + "zip=" + zipcode+ "," + format + countryCode + apiKey;
	 }
	 
	 /**
	 * @param city
	 * @return url String wth City
	 */
	public static String getForecastByCity(String city)
	 {
		 return forecast + "q=" + city+ "," + format +  countryCode + apiKey;
	 }
}
