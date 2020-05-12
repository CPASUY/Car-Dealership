package model;
import java.time.LocalDate;
public class Gasoline extends Car implements GasolineConsumable {
	//Constants
	public static final String EXTRA="Extra";
	public static final String CORRIENT="Corrient";
	public static final String DIESEL="Diesel";
	//Atributes
	private double cap_tank;
	private String type_gasoline;
	private double gaso_consume;
	//Methods
	public Gasoline(double base_price, String brand, String model, double mileage, double cylinder, String type, String lisence_plate,String car_type, int door_number, boolean polarized, double cap_tank, String type_gasoline,double priceSoat,String yearSoat,double coverage_amount,double priceMec,String yearMec,double gas_level) {
		super(base_price,brand,model,mileage,cylinder,type,lisence_plate,car_type,door_number,polarized,priceSoat,yearSoat,coverage_amount,priceMec,yearMec,gas_level);
		this.cap_tank=cap_tank;
		this.type_gasoline=type_gasoline;
		this.gaso_consume=gasolineConsume();
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
			total_price=base;
		}
		if(!dateSoat.equals(year) && !dateMecanical.equals(year) && type.equals(Vehicle.VEHICLE_USED)){
			desc=base*0.1;
			total_price=base-desc+500000;
		}
		super.setTotal_price(total_price);
	}
	@Override
	public double gasolineConsume(){
		double displacement=super.getCylinder();
		double consume=cap_tank*(displacement/ 100);
		return consume;
	}
	public double getCap_gasoline(){
		return cap_tank;
	}
	public void setCap_gasoline(double cap_tank){
		this.cap_tank=cap_tank;
	}
	public String getType_gasoline(){
		return type_gasoline;
	}
	public void setType_gasoline(String type_gasoline) {
		this.type_gasoline=type_gasoline;
	}
	public double getGaso_consume(){
		return gaso_consume;
	}
	public void setGaso_consume(double gaso_consume){
		this.gaso_consume=gaso_consume;
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
		return "Total price: "+total_price+"\n"+"Base price: "+base_price+"\n"+"Brand: "+brand+"\n"+"Model: "+model+"\n"+"mileage: "+mileage+"\n"+"Displacement: "+displacement+"\n"+"Used or New: "+type+"\n"+"Lisence plate: "+lisence_plate+"\n"+"Car type: "+car_type+"\n"+"Door number: "+door_number+"\n"+"Polarized: "+polarized+"\n"+"Tank capacity: "+cap_tank+"\n"+"Gasoline type: "+type_gasoline+"\n"+"Gasoline consume: "+gaso_consume;
	}
}