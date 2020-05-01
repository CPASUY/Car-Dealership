package model;
public abstract class Vehicle{
	//Constants
	public static final String VEHICLE_NEW="New";
	public static final String VEHICLE_USED="Used";
	//Atributes
	private double total_price;
	private double base_price;
	private String brand;
	private String model;
	private double mileage;
	private double cylinder_capacity;
	private String type;
	private String lisence_plate;
	//Methods
	public Vehicle(double base_price, String brand, String model, double mileage, double cylinder_capacity, String type, String lisence_plate){
		this.total_price=0;
		this.base_price=base_price;
		this.brand=brand;
		this.model=model;
		this.mileage=mileage;
		this.cylinder_capacity=cylinder_capacity;
		this.type=type;
		this.lisence_plate=lisence_plate;
	}
	public double getTotal_price(){
		return total_price;
	}
	public void setTotal_price(double total_price) {
		this.total_price=total_price;
	}
	public double getBase_price(){
		return base_price;
	}
	public void setBase_price(double base_price) {
		this.base_price=base_price;
	}

	public String getCar_brand(){
		return brand;
	}
	public void setCar_brand(String brand){
		this.brand=brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model){
		this.model=model;
	}
	public double getMileage() {
		return mileage;
	}
	public void setMileage(double mileage){
		this.mileage=mileage;
	}
	public double getCylinder_capacity(){
		return cylinder_capacity;
	}
	public void setCylinder_capacity(double cylinder_capacity) {
		this.cylinder_capacity=cylinder_capacity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type=type;
	}
	public String getLisence_plate() {
		return lisence_plate;
	}
	public void setLisence_plate(String lisence_plate) {
		this.lisence_plate=lisence_plate;
	}

}