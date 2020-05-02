package model;
public class Hybrid extends Car implements GasolineConsumable, BatteryConsumable {
	//Atributes
	private double cap_gasoline;
	private String type_gasoline;
	private double gaso_consume;
	private String charger_type;
	private double duration;
	private double consume_battery;
	//Methods
	public Hybrid(double base_price, String brand, String model, double mileage, double cylinder_capacity, String type, String lisence_plate,String car_type, int door_number, boolean polarized, double cap_gasoline, String type_gasoline, double gaso_consume, String charger_type, double duration,double consume_battery) {
		super(base_price,brand,model,mileage,cylinder_capacity,type,lisence_plate,car_type,door_number,polarized);
		this.cap_gasoline=cap_gasoline;
		this.type_gasoline=type_gasoline;
		this.gaso_consume=gaso_consume;
		this.charger_type=charger_type;
		this.duration=duration;
		this.consume_battery=consume_battery;
	}
	public void gasolineConsume(){

	}
	public void batteryConsume(){

	}
	public double getCap_gasoline() {
		return cap_gasoline;
	}
	public void setCap_gasoline(double cap_gasoline) {
		this.cap_gasoline = cap_gasoline;
	}
	public String getType_gasoline() {
		return type_gasoline;
	}
	public void setType_gasoline(String type_gasoline) {
		this.type_gasoline = type_gasoline;
	}

	public double getGaso_consume() {
		return gaso_consume;
	}
	public void setGaso_consume(double gaso_consume) {
		this.gaso_consume = gaso_consume;
	}

	public String getCharger_type() {
		return charger_type;
	}
	public void setCharger_type(String charger_type) {
		this.charger_type = charger_type;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	public double getConsume_Battery(){
		return consume_battery;
	}
	public void setConsume_Battery(double consume_battery) {
		this.consume_battery=consume_battery;
	}
}