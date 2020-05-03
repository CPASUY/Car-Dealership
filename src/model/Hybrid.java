package model;
public class Hybrid extends Car implements GasolineConsumable, BatteryConsumable {
	//Constamts
	public static final String NORMAL="Normal";
	public static final String QUICK="Quick";
	//Atributes
	private double cap_tank;
	private String type_gasoline;
	private double gaso_consume;
	private String charger_type;
	private double duration;
	private double consume_battery;
	//Methods
	public Hybrid(double base_price, String brand, String model, double mileage, double cylinder, String type, String lisence_plate,String car_type, int door_number, boolean polarized, double cap_tank, String type_gasoline,String charger_type, double duration) {
		super(base_price,brand,model,mileage,cylinder,type,lisence_plate,car_type,door_number,polarized);
		this.cap_tank=cap_tank;
		this.type_gasoline=type_gasoline;
		this.gaso_consume=gasolineConsume();
		this.charger_type=charger_type;
		this.duration=duration;
		this.consume_battery=batteryConsume();
	}
	public double gasolineConsume(){
		double displacement=super.getCylinder();
		double consume=cap_tank*(displacement/ 110);
		return consume;
	}
	public double batteryConsume(){
		double consume=0;
		double displacement=super.getCylinder();
		if(charger_type.equals(NORMAL)){
			consume=(duration + 5) * (displacement / 100);
		}
		else if(charger_type.equals(QUICK)){
			consume=(duration)* (displacement / 100);
		}
		return consume;
	}
	public double getCap_gasoline() {
		return cap_tank;
	}
	public void setCap_gasoline(double cap_tank) {
		this.cap_tank = cap_tank;
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