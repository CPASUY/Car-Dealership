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
	/**Car builder
	* @param base_price - base price of the hybrid car -!= null
	     * @param brand - brand of the hybrid car- != null
	     * @param model - model of the hybrid car- != null
	     * @param mileage - mileage of the hybrid car- != null
	     * @param cylinder - cylinder of the hybrid car- != null
	     * @param type - type of the hybrid car(new or used)-!= null
	     * @param lisence_plate - lisence plate of the hybrid car - != null
	     * @param car_type - type of the hybrid car- != null
	     * @param door_number - door numbers of the hybrid car- != null
	     * @param polarized - if the hybrid car if polarized- != null
		 */
	public Car(double base_price, String brand, String model, double mileage, double cylinder, String type, String lisence_plate,String car_type, int door_number, boolean polarized,double priceSoat,String yearSoat,double coverage_amount,double priceMec,String yearMec,double gas_level) {
		super(base_price,brand,model,mileage,cylinder,type,lisence_plate,priceSoat,yearSoat,coverage_amount,priceMec,yearMec,gas_level);
		this.car_type=car_type;
		this.door_number=door_number;
		this.polarized=polarized;
	}/** getCar_type
	     * Method to provide the type of car
	     * @return String type of car
	     */
	public String getCar_type(){
		return car_type;
	}
	/** setCar_type
	     * Method to changes the type of car
	     * @param car_type -!= null
	     */
	public void setCar_type(String car_type){
		this.car_type=car_type;
	}
	/** getDoor_number
	     * Method to provide the number of doors
	     * @return int number of doors
	     */
	public int getDoor_number(){
		return door_number;
	}
	/** setDoor_number
	     * Method to changes the door number
	     * @param door_number -!= null
	     */
	public void setDoor_number(int door_number){
		this.door_number=door_number;
	}
	/** getPolarized
	     * Method to provide if the car is polarized or not
	     * @return boolean true it is polarized or false if not
	     */
	public boolean getPolarized(){
		return polarized;
	}
	/** setPolarized
	     * Method to changes if a car is polarized or not
	     * @param polarized -!= null
	     */
	public void setPolarized(boolean polarized) {
		this.polarized=polarized;
	}

}