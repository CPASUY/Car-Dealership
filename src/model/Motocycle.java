package model;
import java.time.LocalDate;
public class Motocycle extends Vehicle{
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
	public Motocycle(double base_price, String brand, String model, double mileage, double cylinder,String type,String lisence_plate,String moto_type,double cap_tank,double priceSoat,String yearSoat,double coverage_amount,double priceMec,String yearMec,double gas_level){
		super(base_price,brand,model,mileage,cylinder,type,lisence_plate,priceSoat,yearSoat,coverage_amount,priceMec,yearMec,gas_level);
		this.moto_type=moto_type;
		this.cap_tank=cap_tank;
		this.consume_gaso=gasolineConsume();
		total_price();
	}
	public void total_price(){
		double total_price=0;
		double total=0;
		double desc=0;
		double base=super.getBase_price();
		String type=super.getType();
		int year=LocalDate.now().getYear();
		String dateSoat=super.getSoat().getYear();
		String dateMecanical=super.getSoat().getYear();
		if(dateSoat.equals(year) && dateMecanical.equals(year) && type.equals(Vehicle.VEHICLE_NEW)){
			total=base*0.04;
			total_price=total+base;
		}
		else if(dateSoat.equals(year) && dateMecanical.equals(year) && type.equals(Vehicle.VEHICLE_USED)){
			total=base*0.04;
			total_price=total+base;
			desc=base*0.02;
			total_price=total+base-desc;
		}
		else if(!dateSoat.equals(year) && !dateMecanical.equals(year) && type.equals(Vehicle.VEHICLE_NEW)){
			total=base*0.04;
			total_price=total+base+500000;
		}
		else if(!dateSoat.equals(year) && !dateMecanical.equals(year) && type.equals(Vehicle.VEHICLE_USED)){
			total=base*0.04;
			total_price=total+base+500000;
			desc=base*0.02;
			total_price=total+base-desc;
		}
		super.setTotal_price(total_price);
	}
	@Override
	public String toString(){
		double total_price=super.getTotal_price();
		double base_price=super.getBase_price();
		double displacement=super.getCylinder();
		String brand=super.getBrand();
		String model=super.getModel();
		double mileage=super.getMileage();
		String type=super.getType();
		String lisence_plate=super.getLisence_plate();
		return "Total price: "+total_price+"\n"+"Base price: "+base_price+"\n"+"Brand: "+brand+"\n"+"Model: "+model+"\n"+"mileage: "+mileage+"\n"+"Displacement: "+displacement+"\n"+"Used or New: "+type+"\n"+"Lisence plate: "+lisence_plate+"\n"+"Moto type: "+moto_type+"\n"+"Tank capacity: "+cap_tank+"\n"+"Gasoline consume: "+consume_gaso;
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