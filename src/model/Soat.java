package model;
public class Soat extends Documents {
	//Atributes
	private double coverage_amount;
	//Methods
	public Soat(double price,String year,int[][] image_code,double coverage_amount){
		super(price,year,image_code);
		this.coverage_amount=coverage_amount;
	}
	public double getCoverage_amount() {
		return coverage_amount;
	}
	public void setCoverage_amount(double coverage_amount) {
		this.coverage_amount=coverage_amount;
	}

}