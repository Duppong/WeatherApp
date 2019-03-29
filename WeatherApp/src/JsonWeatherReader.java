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
		
		//Get weather info
		JSONArray jArray = jObj.getJSONArray("weather");
		
		
		JSONObject  JSONWeather = jArray.getJSONObject(0);
		System.out.println(jObj.toString());
		System.out.println(jArray.toString());
		weather.currentCondition.setWeatherId(getInt("id", JSONWeather));
		weather.currentCondition.setCondition(getString("main", JSONWeather));
		weather.currentCondition.setDescription(getString("description",JSONWeather));
		
		
		JSONObject mainObj = getObject("main", jObj);
		weather.currentCondition.setHumidity(getInt("humidity", mainObj));
		weather.currentCondition.setPressure(getInt("pressure", mainObj));
		weather.temperature.setMaxTemp(getFloat("temp_max", mainObj));
		weather.temperature.setMinTemp(getFloat("temp_min", mainObj));
		weather.temperature.setTemp(getFloat("temp", mainObj));
		
		JSONObject windObj = getObject("wind", jObj);
		weather.wind.setDeg(getFloat("deg" ,windObj));
		weather.wind.setSpeed(getFloat("speed", windObj));
		
		JSONObject cloudsObj = getObject("clouds", jObj);
		weather.clouds.setPercent(getInt("perc",cloudsObj));
		
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
