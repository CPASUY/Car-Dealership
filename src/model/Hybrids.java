public class Hybrids extends Car implements GasolineConsumable, BatteryConsumable {

	private double cap_gasol;
	private string type_gaso;
	private double gaso_consume;
	private string charger_type;
	private double duration;

	/**
	 * 
	 * @param type
	 * @param door_number
	 * @param polarized
	 * @param cap_gasol
	 * @param type_gasol
	 * @param gaso_consume
	 * @param charger_type
	 * @param duration
	 */
	public Hybrids(String type, int door_number, boolean polarized, double cap_gasol, String type_gasol, double gaso_consume, String charger_type, int duration) {
		// TODO - implement Hybrids.Hybrids
		throw new UnsupportedOperationException();
	}

	public double getCap_gasol() {
		return this.cap_gasol;
	}

	/**
	 * 
	 * @param cap_gasol
	 */
	public void setCap_gasol(double cap_gasol) {
		this.cap_gasol = cap_gasol;
	}

	public string getType_gaso() {
		return this.type_gaso;
	}

	/**
	 * 
	 * @param type_gaso
	 */
	public void setType_gaso(string type_gaso) {
		this.type_gaso = type_gaso;
	}

	public double getGaso_consume() {
		return this.gaso_consume;
	}

	/**
	 * 
	 * @param gaso_consume
	 */
	public void setGaso_consume(double gaso_consume) {
		this.gaso_consume = gaso_consume;
	}

	public string getCharger_type() {
		return this.charger_type;
	}

	/**
	 * 
	 * @param charger_type
	 */
	public void setCharger_type(string charger_type) {
		this.charger_type = charger_type;
	}

	public double getDuration() {
		return this.duration;
	}

	/**
	 * 
	 * @param duration
	 */
	public void setDuration(double duration) {
		this.duration = duration;
	}

}