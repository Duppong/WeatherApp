import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
/**
 * @author duppong
 *
 */
public class WeatherHttpRequest {

	 public WeatherHttpRequest()
	 {
		 
	 }
	 

	 
	 public String getWeatherData(String url)
	 {
		 HttpURLConnection con = null;
		 InputStream is = null;
		 
		 try {
			 con = (HttpURLConnection) (new URL(url)).openConnection();
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
	 
	 public String getForecastWeatherData(String url)
	 {
		 HttpURLConnection con = null;
		 InputStreamReader is = null;

		 
		 try{
			 //Forecast

			 
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
