public class Car extends Vehicle {
	//Atributes
	private String car_type;
	private int door_number;
	private boolean polarized;
	//Methods
	public Car(double total_price, double base_price, String car_brand, String model, double mileage, double cylinder_capacity, String type, String lisence_plate,String car_type, int door_number, boolean polarized) {
		super(total_price,base_price,car_brand,model,mileage,cylinder_capacity,type,lisence_plate);
		this.car_type=type;
		this.door_number=door_number;
		this.polarized=polarized;
	}
	public String getCar_Type(){
		return car_type;
	}
	public void setCar_Type(String car_type){
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