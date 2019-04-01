
public class Weather {
	
	
	public Temperature temperature = new Temperature();
	public Location location = new Location();
	public Wind wind = new Wind(); 
	public CurrentCondition currentCondition = new CurrentCondition();
	public Clouds clouds = new Clouds();
	
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
