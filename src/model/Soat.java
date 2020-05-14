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
	/** soat
	* Method used to create a code of the Soat
	*@return String code of the soat
	*/
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
	/** getCoverage_amount
	     * Method to provide the coverage amount of the vehicle
	     * @return double coverage amount
	     */
	public double getCoverage_amount() {
		return coverage_amount;
	}
	/** setCoverage_amount
	     * Method to changes the coverage amount of the ehicle
	     * @param coverage_amount != null
	     */
	public void setCoverage_amount(double coverage_amount) {
		this.coverage_amount=coverage_amount;
	}
	/** getSoatCode
	     * Method to provide the code of the soat
	     * @return String code soat
	     */
	public String getSoatCode() {
		return soat;
	}
}