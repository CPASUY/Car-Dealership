package model;
public abstract class Car extends Vehicle {
	//Constants
	public static final String CAR_SEDAN="Sedan";
	public static final String CAR_VAN="Van";
	//Atributes
	private String car_type;
	private int door_number;
	private boolean polarized;
	//Methods
	public Car(double base_price, String brand, String model, double mileage, double cylinder, String type, String lisence_plate,String car_type, int door_number, boolean polarized) {
		super(base_price,brand,model,mileage,cylinder,type,lisence_plate);
		this.car_type=car_type;
		this.door_number=door_number;
		this.polarized=polarized;
	}
	public String getCar_type(){
		return car_type;
	}
	public void setCar_type(String car_type){
		this.car_type=car_type;
	}
	public int getDoor_number(){
		return door_number;
	}
	public void setDoor_number(int door_number){
		this.door_number=door_number;
	}
	public boolean getPolarized(){
		return polarized;
	}
	public void setPolarized(boolean polarized) {
		this.polarized=polarized;
	}

}