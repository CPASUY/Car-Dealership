package model;
public class Gasoline extends Car implements GasolineConsumable {
	//Constants
	public static final String EXTRA="Extra";
	public static final String CORRIENT="Corrient";
	public static final String DIESEL="Diesel";
	//Atributes
	private double cap_gasoline;
	private String type_gasoline;
	private double gaso_consume;
	//Methods
	public Gasoline(double base_price, String brand, String model, double mileage, double cylinder_capacity, String type, String lisence_plate,String car_type, int door_number, boolean polarized, double cap_gasoline, String type_gasoline,double gaso_consume) {
		super(base_price,brand,model,mileage,cylinder_capacity,type,lisence_plate,car_type,door_number,polarized);
		this.cap_gasoline=cap_gasoline;
		this.type_gasoline=type_gasoline;
		this.gaso_consume=gaso_consume;
	}
	@Override
	public void gasolineConsume(){

	}
	public double getCap_gasoline(){
		return cap_gasoline;
	}
	public void setCap_gasoline(double cap_gasoline){
		this.cap_gasoline=cap_gasoline;
	}
	public String getType_gasoline(){
		return type_gasoline;
	}
	public void setType_gasoline(String type_gasoline) {
		this.type_gasoline=type_gasoline;
	}
	public double getGaso_consume(){
		return cap_gasoline;
	}
	public void setGaso_consume(double gaso_consume){
		this.gaso_consume=gaso_consume;
	}
}