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
		
		JSONObject coordObj = getObject("coord",jObj);
		weather.location.setLatitude(getFloat("lat",coordObj));
		weather.location.setLongitude(getFloat("lon", coordObj));
		
		JSONObject sysObj = getObject("sys",jObj);
		weather.location.setCity(getString("name",jObj));
		weather.location.setCountry(getString("country",sysObj));
		weather.location.setSunrise(getInt("sunrise",sysObj));
		weather.location.setSunset(getInt("sunset",sysObj));

		
		//Get weather info
		JSONArray jArray = jObj.getJSONArray("weather");
		
		
		JSONObject  JSONWeather = jArray.getJSONObject(0);
		weather.currentCondition.setWeatherId(getInt("id", JSONWeather));
		weather.currentCondition.setDescription(getString("description",JSONWeather));
		weather.currentCondition.setCondition(getString("main", JSONWeather));
		weather.currentCondition.setIcon(getString("icon", JSONWeather));

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
		weather.clouds.setPercent(getInt("all", cloudsObj));
		
				
		return weather;
	}
	
	public static WeatherForecast getWeatherForecast( String data) throws JSONException
	{
		WeatherForecast forecast = new WeatherForecast();
		
		JSONObject  jObj = new JSONObject(data);
		JSONArray jArray = jObj.getJSONArray("list");// Get forecast for every day
		
		
		
		for (int i = 0; i <jArray.length(); i++)
		{
			JSONObject jDailyForecast = jArray.getJSONObject(i);
			
			DailyForecast df = new DailyForecast();
			
			df.timestamp = jDailyForecast.getLong("dt");
			
			JSONObject jTempObj = jDailyForecast.getJSONObject("main");
			
//			df.forecastTemp.day = (float) jTempObj.getDouble("day");
//			df.forecastTemp.min = (float) jTempObj.getDouble("min");
//			df.forecastTemp.max = (float) jTempObj.getDouble("max");
//			df.forecastTemp.night = (float) jTempObj.getDouble("night");
//			df.forecastTemp.eve = (float) jTempObj.getDouble("eve");
//			df.forecastTemp.morning = (float) jTempObj.getDouble("morning");
			
			df.weather.temperature.setMaxTemp(getFloat("temp_max", jTempObj));
			df.weather.temperature.setMinTemp(getFloat("temp_min", jTempObj));
			df.weather.temperature.setTemp(getFloat("temp", jTempObj));
			
			
			df.weather.currentCondition.setHumidity(getInt("humidity", jTempObj));
			df.weather.currentCondition.setPressure(getInt("pressure", jTempObj));
			
			JSONArray jWeatherArray = jDailyForecast.getJSONArray("weather");
			JSONObject JSONWeather = jWeatherArray.getJSONObject(0);
			
			df.weather.currentCondition.setWeatherId(getInt("id",JSONWeather));
			df.weather.currentCondition.setDescription(getString("description",JSONWeather));
			df.weather.currentCondition.setCondition(getString("main", JSONWeather));
			df.weather.currentCondition.setIcon(getString("icon", JSONWeather));
			forecast.addForecast(df);
 		}
		
		return forecast;
		
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
