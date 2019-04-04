import java.util.ArrayList;
import java.util.List;
/**
 * @author duppong
 *
 */
public class WeatherForecast {

	public List<DailyForecast> forecastDays = new ArrayList<DailyForecast>();
	
	public WeatherForecast() {
		
	}

	public WeatherForecast(List<DailyForecast> forecastDays) {
		super();
		this.forecastDays = forecastDays;
	}

	public WeatherForecast(WeatherForecast weatherForecast) {
		this.forecastDays = weatherForecast.getForecast();
	}

	public void addForecast(DailyForecast forecast)
	{
		forecastDays.add(forecast);
	}
	
	public DailyForecast getForecast(int dayNum)
	{
		return forecastDays.get(dayNum);
	}
	
	public List<DailyForecast> getForecast()
	{
		return this.forecastDays;
	}
}
