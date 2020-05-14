package model;
import java.time.LocalDate;
public class Electrical extends Car implements BatteryConsumable {
	//Constants
	public static final String NORMAL="Normal";
	public static final String QUICK="Quick";
	//Atributes
	private String charger_type;
	private double duration;
	private double consume_battery;
	//Methods
	/**Electrical builder
	* @param base_price - base price of the electric car -!= null
	     * @param brand - brand of the electric car- != null
	     * @param model - model of the electric car- != null
	     * @param mileage - mileage of the electric car- != null
	     * @param cylinder - cylinder of the electric car- != null
	     * @param type - type of the electric car(new or used)-!= null
	     * @param lisence_plate - lisence plate of the electric car - != null
	     * @param car_type - type of the electric car- != null
	     * @param door_number - door numbers of the electric car- != null
	     * @param polarized - if the electric car if polarized- != null
	     * @param priceSoat - client mail - !=null
	     * @param charger_type - charger type oh the battery- != null
	     * @param duration- duration of the battery- !=null
	     * @param priceSoat - Soat price of the electric car- !=null
	     * @param yearSoat - Soat year of the electric car-!= null
	     * @param coverage_amout - coverage amount of the electric car - != null
	     * @param priceMec - mechanical techno review price of the electric car - != null
	     * @param yearMec - mechanical techno review year- != null
	     * @param level_gas - level gas of the electric car - != null
	     * @return String with the operation message
	     */
	public Electrical(double base_price, String brand, String model, double mileage, double cylinder, String type, String lisence_plate,String car_type, int door_number, boolean polarized, String charger_type, double duration,double priceSoat,String yearSoat,double coverage_amount,double priceMec,String yearMec,double gas_level) {
		super(base_price,brand,model,mileage,cylinder,type,lisence_plate,car_type,door_number,polarized,priceSoat,yearSoat,coverage_amount,priceMec,yearMec,gas_level);
		this.charger_type=charger_type;
		this.duration=duration;
		this.consume_battery=batteryConsume();
		total_price();
	}
	/** total_price
	* Method used to find the total price of the electrical car
	*/
	public void total_price(){
		double total_price=0;
		double total=0;
		double desc=0;
		double base=super.getBase_price();
		double priceSoat=super.getSoat().getPrice();
		double priceMec=super.getMecanical().getPrice();
		String type=super.getType();
		int yearDate=LocalDate.now().getYear();
		String year= String.valueOf(yearDate);
		String dateSoat=super.getSoat().getYear();
		String dateMecanical=super.getSoat().getYear();
		if( type.equals(Vehicle.VEHICLE_NEW)){
			total=base*0.2;
			total_price=total+base+priceSoat+priceMec;
		}
		else if(dateSoat.equals(year) && dateMecanical.equals(year) && type.equals(Vehicle.VEHICLE_USED)){
			total=base*0.2;
			total_price=total+base;
			desc=base*0.1;
			total_price=total+base-desc;
		}
		else if(!dateSoat.equals(year) && !dateMecanical.equals(year) && type.equals(Vehicle.VEHICLE_USED)){
			total=base*0.2;
			desc=base*0.1;
			total_price=total+base-desc+500000+priceMec+priceSoat;
		}
		else if(dateSoat.equals(year) && !dateMecanical.equals(year) && type.equals(Vehicle.VEHICLE_USED)){
			total=base*0.2;
			desc=base*0.1;
			total_price=total+base-desc+250000+priceMec+priceSoat;
		}
		else if(!dateSoat.equals(year) && dateMecanical.equals(year) && type.equals(Vehicle.VEHICLE_USED)){
			total=base*0.2;
			desc=base*0.1;
			total_price=total+base-desc+250000+priceMec+priceSoat;
		}
		super.setTotal_price(total_price);
	}
	/** batteryConsume
	* Method used to find the battery consume of the electrical car
	* @return double consume of the eletrical car
	*/
	public double batteryConsume(){
		double consume=0;
		double displacement=super.getCylinder();
		if(charger_type.equals(NORMAL)){
			consume=(duration + 15) * (displacement / 100);
		}
		else if(charger_type.equals(QUICK)){
			consume=(duration + 10) * (displacement / 100);
		}
		return consume;
	}
	/** getCharger_type
	     * Method to provide the type of the charger
	     * @return string charger type
	     */
	public String getCharger_type(){
		return charger_type;
	}
	/** setCharger_type
	     * Method to changes the charger type
	     * @param charger_type -!= null
	     */
	public void setCharger_type(String charger_type){
		this.charger_type=charger_type;
	}
	/** getDuration
	     * Method to provide the duration of the battery
	     * @return double duration of the battery
	     */
	public double getDuration(){
		return duration;
	}
	/** setDuration
	     * Method to changes the duration of the battery
	     * @param duration-!= null
	     */
	public void setDuration(double duration) {
		this.duration=duration;
	}
	/** getConsume_Battery
	     * Method to provide the consume of the battery
	     * @return double consume of the battery
	     */
	public double getConsume_Battery(){
		return consume_battery;
	}
	/** setConsume_battery
	     * Method to changes the consume of the batery
	     * @param consume_battery -!= null
	     */
	public void setConsume_Battery(double consume_battery) {
		this.consume_battery=consume_battery;
	}
	/** toString
	* Method used to show the information of the vehicle
	* @return String information of the vehicle
	*/
	@Override
	public String toString(){
		String polarized="";
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
		String car_type=super.getCar_type();
		int door_number=super.getDoor_number();
		boolean polarizedCar=super.getPolarized();
		double priceSoat=super.getSoat().getPrice();
		String yearSoat=super.getSoat().getYear();
		double coverage_amount=super.getSoat().getCoverage_amount();
		String soat=super.getSoat().getSoatCode();
		double priceMec=super.getMecanical().getPrice();
		String yearMec=super.getMecanical().getYear();
		double level_gas=super.getMecanical().getGas_level();
		String mecanical=super.getMecanical().getMecanicalCode();
		if(polarizedCar==true){
			polarized="Yes";
		}
		else{
			polarized="No";
		}
		if(client!=null){
			return "Client: "+id+"Total price: "+total_price+"\n"+"Base price: "+base_price+"\n"+"Brand: "+brand+"\n"+"Model: "+model+"\n"+"mileage: "+mileage+"\n"+"Displacement: "+displacement+"\n"+"Used or New: "+type+"\n"+"Lisence plate: "+lisence_plate+"\n"+"Car type: "+car_type+"\n"+"Door number: "+door_number+"\n"+"Polarized: "+polarized+"\n"+"Charger type: "+charger_type+"\n"+"Duration: "+duration+"\n"+"Battery consume: "+consume_battery+"\n"+"Soat code: "+soat+"\n"+"Price soat: "+priceSoat+"\n"+"Year Soat: "+yearSoat+"\n"+"Coverage amount: "+coverage_amount+"\n"+"Mecanical code: "+mecanical+"\n"+"Price Mecanical review: "+priceMec+"\n"+"Year Mecanical review: "+yearMec+"\n"+"Level gas: "+level_gas;
		}
		return "Total price: "+total_price+"\n"+"Base price: "+base_price+"\n"+"Brand: "+brand+"\n"+"Model: "+model+"\n"+"mileage: "+mileage+"\n"+"Displacement: "+displacement+"\n"+"Used or New: "+type+"\n"+"Lisence plate: "+lisence_plate+"\n"+"Car type: "+car_type+"\n"+"Door number: "+door_number+"\n"+"Polarized: "+polarized+"\n"+"Charger type: "+charger_type+"\n"+"Duration: "+duration+"\n"+"Battery consume: "+consume_battery+"\n"+"Soat code: "+soat+"\n"+"Price soat: "+priceSoat+"\n"+"Year Soat: "+yearSoat+"\n"+"Coverage amount: "+coverage_amount+"\n"+"Mecanical code: "+mecanical+"\n"+"Price Mecanical review: "+priceMec+"\n"+"Year Mecanical review: "+yearMec+"\n"+"Level gas: "+level_gas;
	}
}