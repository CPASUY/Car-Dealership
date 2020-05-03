package model;
public class Motocycle extends Vehicle {
	//Constants
	public static final String MOTO_STANDAR="Standar";
	public static final String MOTO_SPORT="Sport";
	public static final String MOTO_SCOOTER="Scooter";
	public static final String MOTO_CROSS="Cross";
	//Atributes
	private String moto_type;
	private double cap_tank;
	private double consume_gaso;
	//Methods
	public Motocycle(double base_price, String brand, String model, double mileage, double cylinder,String type,String lisence_plate,String moto_type,double cap_tank){
		super(base_price,brand,model,mileage,cylinder,type,lisence_plate);
		this.moto_type=moto_type;
		this.cap_tank=cap_tank;
		this.consume_gaso=gasolineConsume();
	}
	public double gasolineConsume(){
		double displacement=super.getCylinder();
		double consume=cap_tank*(displacement/ 90);
		return consume;
	}
	public String getMoto_Type(){
		return moto_type;
	}
	public void setMoto_Type(String moto_type){
		this.moto_type=moto_type;
	}
	public double getCap_tank(){
		return cap_tank;
	}
	public void setGasoline_Capacity(double cap_tank){
		this.cap_tank=cap_tank;
	}
	public double getConsume_Gaso(){
		return consume_gaso;
	}
	public void setConsume_Gaso(double consume_gaso){
		this.consume_gaso=consume_gaso;
	}
}