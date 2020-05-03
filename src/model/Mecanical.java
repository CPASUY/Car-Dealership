package model;
public class Mecanical extends Documents {
	//Atributes
	private double gas_level;
	//Methods
	public Mecanical(double price,String year,int[][] image_code,double gas_level){
		super(price,year,image_code);
		this.gas_level=gas_level;
	}
	public double getGas_level() {
		return gas_level;
	}
	public void setGas_level(double gas_level) {
		this.gas_level = gas_level;
	}

}