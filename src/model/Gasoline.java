public class Gasoline extends Car implements GasolineConsumable {
	//Atributes
	private double cap_gasoline;
	private String type_gasoline;
	//Methods
	public Gasoline(String car_type, int door_number, boolean polarized, double cap_gasoline, String type_gasoline) {
		super(car_type,door_number,polarized);
		this.cap_gasoline=cap_gasoline;
		this.type_gasoline=type_gasoline;
	}
	public double getCap_gasoline(){
		return cap_gasoline;
	}
	public void setCap_gasoline(double cap_gasoline){
		this.cap_gasoline=cap_gasoline;
	}
	public String getType_gasoline(){
		return type_gasoline;
	}
	public void setType_gasoline(String type_gasoline) {
		this.type_gasoline=type_gasoline;
	}

}