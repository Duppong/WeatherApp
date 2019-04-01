import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WeatherHttpRequest {
	
	 static final String apiKey ="&appid=7d6c101de32c56801610872143aba7d6";
	 String owm = "api.openweathermap.org/data/2.5/";
	 static final String current = "weather?";
	 static final String hourly = "forecast?";
	 
	 
	 String cityName = "Bismarck";
	 String zipCode = "58504";
	 String countryCode = "US";
	 
	 String urlTest = "http://api.openweathermap.org/data/2.5/weather?zip=58504,us&appid=7d6c101de32c56801610872143aba7d6";
	 
	 public WeatherHttpRequest(String zipCode, String countryCode)
	 {
		 this.zipCode = zipCode;
		 this.countryCode = countryCode;
	 }
	 
	 public WeatherHttpRequest() {

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
	 
	 
	 public String getWeatherData()
	 {
		 HttpURLConnection con = null;
		 InputStream is = null;
		 
		 try {
			 con = (HttpURLConnection) (new URL(urlTest)).openConnection();
			 con.setRequestMethod("GET");
			 con.setDoInput(true);
			 con.setDoOutput(true);
			 con.connect();
			 
			 //Read Response
			 StringBuffer buffer = null;
			 try {
				 buffer = new StringBuffer();
				 is = con.getInputStream();
				 BufferedReader br = new BufferedReader(new InputStreamReader(is));
				 String line = null;
				 while((line = br.readLine()) != null)
				 {
					 buffer.append(line + "\r\n");
				 }
			 }catch(IOException e) {
				 e.printStackTrace();
			 }
			 is.close();
			 con.disconnect();
			 
			 return buffer.toString();
		 }catch(Throwable t) {
			 t.printStackTrace();
		 }finally {
			 try {is.close();
		 }catch(Throwable t) {}
			 try {
				 con.disconnect();
			 }catch(Throwable t) {}
		 }
		 return null;
	 }
	 
	 public String getForecastWeatherData()
	 {
		 HttpURLConnection con = null;
		 InputStreamReader is = null;

		 
		 try{
			 //Forecast
			 String url = "Http://api.openweathermap.org/data/2.5/forecast?zip=58504,us&appid=7d6c101de32c56801610872143aba7d6";
			 
			 con = (HttpURLConnection) (new URL(url)).openConnection();
			 con.setRequestMethod("GET");
			 con.setDoInput(true);
			 con.setDoOutput(true);
			 con.connect();
			 StringBuffer buffer1 = null;
			 
			 try {
				 buffer1 = new StringBuffer();
				 is = new InputStreamReader(con.getInputStream());
				 BufferedReader br1 = new BufferedReader(is);
				 String line1 = null;
				 while((line1 = br1.readLine())!= null)
				 {
					 buffer1.append(line1 + "\r\n");
				 }
			 }catch(IOException e){
				 e.printStackTrace();
			 }
			 
			 is.close();
			 con.disconnect();
			 
			 System.out.println("Buffer [" + buffer1.toString() +"]");
			 return buffer1.toString();
		 }catch(Throwable t) {
			 t.printStackTrace();
		 }finally {
			 try {is.close();}catch(Throwable t) {}
			 try {con.disconnect();}catch(Throwable t) {}
			 }
		  
		 return null;
	 }
}
