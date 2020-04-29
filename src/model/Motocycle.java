public class Motocycle extends Vehicle {
	//Atributes
	private String moto_type;
	private double gasoline_capacity;
	private double consume_gaso;
	//Methods
	public Motocycle(double total_price, double base_price, String car_brand, String model, double mileage, double cylinder_capacity,String moto_type,double gasoline_capacity,double consume_gaso){
		super(total_price,base_price,car_brand,model,mileage,cylinder_capacity,type,lisence_plate);
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
	public String getGasoline_Capacity(){
		return gasoline_capacity;
	}
	public void setGasoline_Capacity(double gasoline_capacity){
		this.gasoline_capacity=gasoline_capacity;
	}
	public String getConsume_Gaso(){
		return consume_gaso;
	}
	public void setConsume_Gaso(double consume_gaso){
		this.consume_gaso=consume_gaso;
	}
}