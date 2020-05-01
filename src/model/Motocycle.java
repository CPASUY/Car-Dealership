package model;
public class Motocycle extends Vehicle {
	//Constants
	public static final String MOTO_STANDAR="Standar";
	public static final String MOTO_SPORT="Sport";
	public static final String MOTO_SCOOTER="Scooter";
	public static final String MOTO_CROSS="Cross";
	//Atributes
	private String moto_type;
	private double gasoline_capacity;
	private double consume_gaso;
	//Methods
	public Motocycle(double base_price, String brand, String model, double mileage, double cylinder_capacity,String type,String lisence_plate,String moto_type,double gasoline_capacity,double consume_gaso){
		super(base_price,brand,model,mileage,cylinder_capacity,type,lisence_plate);
		this.moto_type=moto_type;
		this.gasoline_capacity=gasoline_capacity;
		this.consume_gaso=consume_gaso;
	}
	public String getMoto_Type(){
		return moto_type;
	}
	public void setMoto_Type(String moto_type){
		this.moto_type=moto_type;
	}
	public double getGasoline_Capacity(){
		return gasoline_capacity;
	}
	public void setGasoline_Capacity(double gasoline_capacity){
		this.gasoline_capacity=gasoline_capacity;
	}
	public double getConsume_Gaso(){
		return consume_gaso;
	}
	public void setConsume_Gaso(double consume_gaso){
		this.consume_gaso=consume_gaso;
	}
}