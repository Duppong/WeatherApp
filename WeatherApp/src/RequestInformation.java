/**
 * 
 */

/**
 * @author duppong
 *
 */
public class RequestInformation {

	 static final String apiKey ="&appid=7d6c101de32c56801610872143aba7d6";
	 String owm = "api.openweathermap.org/data/2.5/";
	 static final String current = "weather?";
	 static final String hourly = "forecast?";
	 
	 
	 String cityName = "";
	 String zipCode = "";
	 String countryCode = "";
	 
	 
	 
	 public RequestInformation()
	 {
		 
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
	 
	 public void setLocation(String location)
	 {
		 this.cityName = location;
	 }
	 
	 public void setCountryCode(String countryCode)
	 {
		 this.countryCode = countryCode;
	 }
	 
	 public String getLocation()
	 {
		 return this.cityName;
	 }
	 
	 public String getCountryCode()
	 {
		 return this.countryCode;
	 }
	 
	 public String getZipCode()
	 {
		 return this.zipCode;
	 }
	 
	 @Override
	 public String toString()
	 {
		 return super.toString();
	 }
}
