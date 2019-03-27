
public class Weather {
	
	
	public Temperature temperature;
	public Location location;
	public Wind wind; 
	
	public Weather()
	{
		
	}

	public Weather(Weather weather) {
		this.location = weather.location;
	}
	
	
}
