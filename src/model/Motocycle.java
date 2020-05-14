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
	/**Motocycle builder
	* @param base_price - base price of the motocycle -!= null
	     * @param brand - brand of the motocycle - != null
	     * @param model - model of the motocycle- != null
	     * @param mileage - mileage of the motocycle- != null
	     * @param cylinder - cylinder of the motocycle- != null
	     * @param type - type of the motocycle(new or used)-!= null
	     * @param lisence_plate - lisence plate of the motocycle - != null
	     * @param moto_type - type of the motocycle - != null
	     * @param cap_tank - capacity of the tank - != null
	     * @param priceSoat - Soat price of the motocycle- !=null
	     * @param yearSoat - Soat year of the motocycle-!= null
	     * @param coverage_amout - coverage amount of the motocycle - != null
	     * @param priceMec - mechanical techno review price of the motocycle - != null
	     * @param yearMec - mechanical techno review year- != null
	     * @param level_gas - level gas of the motocycle - != null
	     */
	public Motocycle(double base_price, String brand, String model, double mileage, double cylinder,String type,String lisence_plate,String moto_type,double cap_tank,double priceSoat,String yearSoat,double coverage_amount,double priceMec,String yearMec,double gas_level){
		super(base_price,brand,model,mileage,cylinder,type,lisence_plate,priceSoat,yearSoat,coverage_amount,priceMec,yearMec,gas_level);
		this.moto_type=moto_type;
		this.cap_tank=cap_tank;
		this.consume_gaso=gasolineConsume();
		total_price();
	}
	/** total_price
	* Method used to find the total price of the motocycle
	*/
	public void total_price(){
		double total_price=0;
		double total=0;
		double desc=0;
		double base=super.getBase_price();
		String type=super.getType();
		double priceSoat=super.getSoat().getPrice();
		double priceMec=super.getMecanical().getPrice();
		int year=LocalDate.now().getYear();
		String dateSoat=super.getSoat().getYear();
		String dateMecanical=super.getSoat().getYear();
		if(type.equals(Vehicle.VEHICLE_NEW)){
			total=base*0.04;
			total_price=total+base+priceSoat+priceMec;
		}
		else if(dateSoat.equals(year) && dateMecanical.equals(year) && type.equals(Vehicle.VEHICLE_USED)){
			total=base*0.04;
			total_price=total+base;
			desc=base*0.02;
			total_price=total+base-desc;
		}
		else if(!dateSoat.equals(year) && !dateMecanical.equals(year) && type.equals(Vehicle.VEHICLE_USED)){
			total=base*0.04;
			desc=base*0.02;
			total_price=total+base-desc+priceSoat+priceMec+500000;
		}
		else if(!dateSoat.equals(year) && dateMecanical.equals(year) && type.equals(Vehicle.VEHICLE_USED)){
			total=base*0.04;
			desc=base*0.02;
			total_price=total+base-desc+priceSoat+priceMec+250000;
		}
		else if(dateSoat.equals(year) && !dateMecanical.equals(year) && type.equals(Vehicle.VEHICLE_USED)){
			total=base*0.04;
			desc=base*0.02;
			total_price=total+base-desc+priceSoat+priceMec+250000;
		}
		super.setTotal_price(total_price);
	}
	/** toString
	* Method used to show the information of the vehicle
	* @return String information of the vehicle
	*/
	@Override
	public String toString(){
		String id="";
		Client client=super.getClient();
		if(client!=null){
			id=super.getClient().getIdentification();
		}
		double total_price=super.getTotal_price();
		double base_price=super.getBase_price();
		double displacement=super.getCylinder();
		String brand=super.getBrand();
		String model=super.getModel();
		double mileage=super.getMileage();
		String type=super.getType();
		String lisence_plate=super.getLisence_plate();
		double priceSoat=super.getSoat().getPrice();
		String yearSoat=super.getSoat().getYear();
		double coverage_amount=super.getSoat().getCoverage_amount();
		String soat=super.getSoat().getSoatCode();
		double priceMec=super.getMecanical().getPrice();
		String yearMec=super.getMecanical().getYear();
		double level_gas=super.getMecanical().getGas_level();
		String mecanical=super.getMecanical().getMecanicalCode();
		if(client!=null){
			return "Client: "+id+"Total price: "+total_price+"\n"+"Base price: "+base_price+"\n"+"Brand: "+brand+"\n"+"Model: "+model+"\n"+"mileage: "+mileage+"\n"+"Displacement: "+displacement+"\n"+"Used or New: "+type+"\n"+"Lisence plate: "+lisence_plate+"\n"+"Moto type: "+moto_type+"\n"+"Tank capacity: "+cap_tank+"\n"+"Gasoline consume: "+consume_gaso+"Soat code: "+soat+"\n"+"Price soat: "+priceSoat+"\n"+"Year Soat: "+yearSoat+"\n"+"Coverage amount: "+coverage_amount+"\n"+"Mecanical code: "+mecanical+"\n"+"Price Mecanical review: "+priceMec+"\n"+"Year Mecanical review: "+yearMec+"\n"+"Level gas: "+level_gas;
		}
		return "Total price: "+total_price+"\n"+"Base price: "+base_price+"\n"+"Brand: "+brand+"\n"+"Model: "+model+"\n"+"mileage: "+mileage+"\n"+"Displacement: "+displacement+"\n"+"Used or New: "+type+"\n"+"Lisence plate: "+lisence_plate+"\n"+"Moto type: "+moto_type+"\n"+"Tank capacity: "+cap_tank+"\n"+"Gasoline consume: "+consume_gaso+"Soat code: "+soat+"\n"+"Price soat: "+priceSoat+"\n"+"Year Soat: "+yearSoat+"\n"+"Coverage amount: "+coverage_amount+"\n"+"Mecanical code: "+mecanical+"\n"+"Price Mecanical review: "+priceMec+"\n"+"Year Mecanical review: "+yearMec+"\n"+"Level gas: "+level_gas;
	}
	/** gasolineConsume
	* Method used to find the gasoline consume of the motocycle
	* @return double consume of the motocycle
	*/
	public double gasolineConsume(){
		double displacement=super.getCylinder();
		double consume=cap_tank*(displacement/ 90);
		return consume;
	}
	/** getMoto_type
	     * Method to provide the type of motocycle
	     * @return string motocycle type
	     */
	public String getMoto_Type(){
		return moto_type;
	}
	/** setMoto_type
	     * Method to changes the motocycle type
	     * @param moto_type -!= null
	     */
	public void setMoto_Type(String moto_type){
		this.moto_type=moto_type;
	}
	/** getCap_tank
	     * Method to provide the capacity of tank
	     * @return double capacity of tank
	     */
	public double getCap_tank(){
		return cap_tank;
	}
	/** setGasoline_capacity
	     * Method to changes the tank capacity 
	     * @param cap_tank -!= null
	     */
	public void setCap_tank(double cap_tank){
		this.cap_tank=cap_tank;
	}
	/** getConsume_Gaso
	     * Method to provide the consume of the gasoline
	     * @return double consume of the gasoline
	     */
	public double getConsume_Gaso(){
		return consume_gaso;
	}
	/** setConsume_Gaso
	     * Method to changes the consume of the gasoline
	     * @param consume_gaso -!= null
	     */
	public void setConsume_Gaso(double consume_gaso){
		this.consume_gaso=consume_gaso;
	}
}