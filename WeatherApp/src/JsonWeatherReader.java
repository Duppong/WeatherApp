import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonWeatherReader {

	public static Weather getWeather(String data)throws JSONException{
		Weather weather = new Weather();
		System.out.println("Data ["+data+"]");
		
		//create JSONObject from the data
		JSONObject jObj = new JSONObject(data);
		
		//Extract Info
		Location loc = new Location();
		
		JSONObject coordObj = getObject("coord",jObj);
		loc.setLatitude(getFloat("lat",coordObj));
		loc.setLongitude(getFloat("lon", coordObj));
		
		JSONObject sysObj = getObject("sys",jObj);
		loc.setCity(getString("name",jObj));
		loc.setCountry(getString("country",sysObj));
		loc.setSunrise(getInt("sunrise",sysObj));
		loc.setSunset(getInt("sunset",sysObj));
		weather.location = loc;
		
		
		
		
		return weather;
		
	}
	
	
		private static JSONObject getObject(String tagName, JSONObject jObj) throws JSONException {
		JSONObject subObj = jObj.getJSONObject(tagName);
		return subObj;
		}

		private static String getString(String tagName, JSONObject jObj) throws JSONException {
		return jObj.getString(tagName);
		}
		private static float getFloat(String tagName, JSONObject jObj) throws JSONException {
		return (float) jObj.getDouble(tagName);
		}

		private static int getInt(String tagName, JSONObject jObj) throws JSONException {
		return jObj.getInt(tagName);
		}
}
