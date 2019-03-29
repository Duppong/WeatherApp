
public class Weather {
	
	
	public Temperature temperature;
	public Location location;
	public Wind wind; 
	public CurrentCondition currentCondition;
	public Clouds clouds;
	
	public Weather()
	{
		
	}

	public Weather(Weather weather) {
		this.clouds = weather.clouds;
		this.location = weather.location;
		this.temperature = weather.temperature;
		this.wind = weather.wind;
		this.currentCondition = weather.currentCondition;
	}
	
	
	
	
}
