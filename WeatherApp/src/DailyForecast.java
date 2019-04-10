import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * @author duppong
 *
 */
public class DailyForecast{
	
	public Weather weather = new Weather();
	
	public ForecastTemp forecastTemp = new ForecastTemp();
	
	public long timestamp;
	
	public String dateText;
	
	
	/**
	 * @return the dateText
	 */
	public String getDateText() {
		return dateText;
	}


	/**
	 * @param dateText the dateText to set
	 */
	public void setDateText(String dateText) {
		this.dateText = dateText;
	}


	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public DailyForecast() {
		
		}
 
	
    public String getStringDate() {
        return sdf.format(new Date(timestamp));
    }
}
