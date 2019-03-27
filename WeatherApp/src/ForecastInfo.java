import java.util.Date;

public class ForecastInfo {
	
	private String dateInformation;
	private String maxTemperature;
	private String minTemperature;
	private String dateTemperature;
	private Date dayOfWeek;
	private boolean currentDay = false;
	private String description;
	private String humidity;
	private String pressure;
	private String clouds;
	private String windSpeed;
	
	public ForecastInfo()
	{
		
	}
	
	public ForecastInfo(String dateInformation, String maxTemperature, String minTemperature, String dateTemperature, Date dayOfWeek,
			String description, String humidity,String pressure, String clouds, String windSpeed)
	{
		this.dateInformation = dateInformation;
		this.maxTemperature = maxTemperature;
		this.minTemperature = minTemperature;
		this.dateTemperature = dateTemperature;
		this.dayOfWeek = dayOfWeek;
		this.description = description;
		this.humidity = humidity;
		this.pressure = pressure;
		this.clouds = clouds;
		this.windSpeed = windSpeed;
	}

	public String getDateInformation() {
		return dateInformation;
	}

	public void setDateInformation(String dateInformation) {
		this.dateInformation = dateInformation;
	}

	public String getMaxTemperature() {
		return maxTemperature;
	}

	public void setMaxTemperature(String maxTemperature) {
		this.maxTemperature = maxTemperature;
	}

	public String getMinTemperature() {
		return minTemperature;
	}

	public void setMinTemperature(String minTemperature) {
		this.minTemperature = minTemperature;
	}

	public String getDateTemperature() {
		return dateTemperature;
	}

	public void setDateTemperature(String dateTemperature) {
		this.dateTemperature = dateTemperature;
	}

	public Date getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(Date dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	public boolean isCurrentDay() {
		return currentDay;
	}

	public void setCurrentDay(boolean currentDay) {
		this.currentDay = currentDay;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getHumidity() {
		return humidity;
	}

	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}

	public String getPressure() {
		return pressure;
	}

	public void setPressure(String pressure) {
		this.pressure = pressure;
	}

	public String getClouds() {
		return clouds;
	}

	public void setClouds(String clouds) {
		this.clouds = clouds;
	}

	public String getWindSpeed() {
		return windSpeed;
	}

	public void setWindSpeed(String windSpeed) {
		this.windSpeed = windSpeed;
	}
	
	
}
