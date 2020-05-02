package model;
public class Electrical extends Car implements BatteryConsumable {
	//Constants
	public static final String NORMAL="Normal";
	public static final String QUICK="Quick";
	//Atributes
	private String charger_type;
	private double duration;
	private double consume_battery;
	//Methods
	public Electrical(double base_price, String brand, String model, double mileage, double cylinder_capacity, String type, String lisence_plate,String car_type, int door_number, boolean polarized, String charger_type, double duration,double consume_battery) {
		super(base_price,brand,model,mileage,cylinder_capacity,type,lisence_plate,car_type,door_number,polarized);
		this.charger_type=charger_type;
		this.duration=duration;
		this.consume_battery=consume_battery;
	}
	public void batteryConsume(){

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
	public double getConsume_Battery(){
		return consume_battery;
	}
	public void setConsume_Battery(double consume_battery) {
		this.consume_battery=consume_battery;
	}
}