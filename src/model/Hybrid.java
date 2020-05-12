package model;
import java.time.LocalDate;
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
	public Hybrid(double base_price, String brand, String model, double mileage, double cylinder, String type, String lisence_plate,String car_type, int door_number, boolean polarized, double cap_tank, String type_gasoline,String charger_type, double duration,double priceSoat,String yearSoat,double coverage_amount,double priceMec,String yearMec,double gas_level) {
		super(base_price,brand,model,mileage,cylinder,type,lisence_plate,car_type,door_number,polarized,priceSoat,yearSoat,coverage_amount,priceMec,yearMec,gas_level);
		this.cap_tank=cap_tank;
		this.type_gasoline=type_gasoline;
		this.gaso_consume=gasolineConsume();
		this.charger_type=charger_type;
		this.duration=duration;
		this.consume_battery=batteryConsume();
		total_price();
	}
	public void total_price(){
		double total_price=0;
		double total=0;
		double desc=0;
		double base=super.getBase_price();
		String type=super.getType();
		int yearDate=LocalDate.now().getYear();
		String year= String.valueOf(yearDate);
		String dateSoat=super.getSoat().getYear();
		String dateMecanical=super.getSoat().getYear();
		if(dateSoat.equals(year) && dateMecanical.equals(year) && type.equals(Vehicle.VEHICLE_NEW)){
			total=base*0.15;
			total_price=total+base;
		}
		else if(dateSoat.equals(year) && dateMecanical.equals(year) && type.equals(Vehicle.VEHICLE_USED)){
			total=base*0.15;
			desc=base*0.1;
			total_price=total+base-desc;
		}
		else if(!dateSoat.equals(year) && !dateMecanical.equals(year) && type.equals(Vehicle.VEHICLE_NEW)){
			total=base*0.15;
			total_price=total+base+500000;
		}
		else if(!dateSoat.equals(year) && !dateMecanical.equals(year) && type.equals(Vehicle.VEHICLE_USED)){
			total=base*0.15;
			desc=base*0.1;
			total_price=total+base-desc+500000;
		}
		super.setTotal_price(total_price);
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
	@Override
	public String toString(){
		String polarized="";
		double total_price=super.getTotal_price();
		double base_price=super.getBase_price();
		double displacement=super.getCylinder();
		String brand=super.getBrand();
		String model=super.getModel();
		double mileage=super.getMileage();
		String type=super.getType();
		String lisence_plate=super.getLisence_plate();
		String car_type=super.getCar_type();
		int door_number=super.getDoor_number();
		boolean polarizedCar=super.getPolarized();
		if(polarizedCar==true){
			polarized="Yes";
		}
		else{
			polarized="No";
		}
		return "Total price: "+total_price+"\n"+"Base price: "+base_price+"\n"+"Brand: "+brand+"\n"+"Model: "+model+"\n"+"mileage: "+mileage+"\n"+"Displacement: "+displacement+"\n"+"Used or New: "+type+"\n"+"Lisence plate: "+lisence_plate+"\n"+"Car type: "+car_type+"\n"+"Door number: "+door_number+"\n"+"Polarized: "+polarized+"\n"+"Tank capacity: "+cap_tank+"\n"+"Gasoline type: "+type_gasoline+"\n"+"Chaerger type: "+charger_type+"\n"+"Duration: "+duration+"\n"+"Battery consume: "+consume_battery+"\n"+"Gasoline consume: "+gaso_consume;
	}
}