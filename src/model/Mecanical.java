package model;
public class Mecanical extends Document {
	//Atributes
	private double gas_level;
	private String mecanical;
	//Methods
	/**Mecanical builder
	* @param price - price of the document -!= null
	* @param gas_level - gas level of the vehicle-!= null
	*/
	public Mecanical(double price,String year,double gas_level){
		super(price,year);
		this.gas_level=gas_level;
		this.mecanical=mecanical();
	}
	/** mecanical
	* Method used to create a code of the techno review
	*@return string code techno review
	*/
	public String mecanical(){
	int[][] image_code=super.getImage_code();
    String a="";
    String b="";
    String c="";
    String soat="";
    int cont=image_code.length-1;
    for (int s=0;s<image_code.length;s++) {
    		 	 a+=image_code[0][s]+" ";
    }
    for (int w=0;w<image_code.length;w++){
           b+=image_code[w][cont]+" ";
           cont--;
    }
    for (int t=0;t<image_code.length;t++){
           c+=image_code[3][t]+" ";
    }

    soat=a+b+c;
  		return soat;
	}
	/** getGas_level
	     * Method to provide the gas level of the vehicle
	     * @return double gas level of the vehicle
	     */
	public double getGas_level() {
		return gas_level;
	}
	/** setGas_level
	     * Method to changes the gas level of the vehicle
	     * @param gas_level != null
	     */
	public void setGas_level(double gas_level) {
		this.gas_level = gas_level;
	}
	/** getMecanicalCode
	     * Method to provide the code of the techno review
	     * @return String code techno review
	     */
	public String getMecanicalCode() {
		return mecanical;
	}

}