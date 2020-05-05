package model;
public class Soat extends Document {
	//Atributes
	private double coverage_amount;
	private String soat;
	//Methods
	public Soat(double price,String year,double coverage_amount){
		super(price,year);
		this.coverage_amount=coverage_amount;
		this.soat=soat();
	}
	public String soat(){
	int[][] image_code=super.getImage_code();
    String a="";
    String b="";
    String soat="";
    for (int s=0;s<image_code.length; s++) {
    		 	 a+=image_code[s][0]+" ";
    }
    for (int m=0;m<image_code.length;m++) {
           b+=image_code[3][m]+" ";
    }
    soat=a+b;
  		return soat;
	}
	public double getCoverage_amount() {
		return coverage_amount;
	}
	public void setCoverage_amount(double coverage_amount) {
		this.coverage_amount=coverage_amount;
	}

}