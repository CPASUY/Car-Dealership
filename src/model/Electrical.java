public class Electrical extends Car implements BatteryConsumable {
	//Atributes
	private String charger_type;
	private double duration;
	//Methods
	public Electrical(String car_type, int door_number, boolean polarized, String charger_type, int duration) {
		super(car_type,door_number,polarized);
		this.charger_type=charger_type;
		this.duration=duration;
	}
	public String getCharger_type(){
		return charger_type;
	}
	public void setCharger_type(String charger_type){
		this.charger_type=charger_type;
	}
	public double getDuration(){
		return duration;
	}
	public void setDuration(double duration) {
		this.duration=duration;
	}

}