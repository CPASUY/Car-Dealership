package model;
import java.util.Random;
public class Document{
	//Constants
	public static final int DIMENSION=4;
	//Atributes
	private double price;
	private String year;
	private int[][] image_code;
	//Methods
	/**Document builder
	* @param price - price of the document -!= null
	*/
	public Documents(double price,String year,int[][]image_code){
		this.price=price;
		this.year=year;
		this.image_code= initialize();
	}
	/** inicializate
	* Method used to create a matrix for the documents
	*@return int[][] code 
	*/
	public int[][] initialize(){
		int [][]code = new int[DIMENSION][DIMENSION];
		for (int s=0;s< code.length; s++) {
  			for(int m=0;m< code[s].length;m++) {
    		 	code[s][m] = Math.random()*10;
  			}
  		}
  		return code;
	}
	/** getPrice
	     * Method to provide the price of the document
	     * @return double price of the document
	     */
	public double getPrice() {
		return price;
	}
	/** setPrice
	     * Method to changes the price of documents
	     * @param price != null
	     */
	public void setPrice(double price) {
		this.price=price;
	}
	/** getYear
	     * Method to provide the year of the document
	     * @return String year of the document
	     */
	public String getYear(){
		return year;
	}
	/** setYear
	     * Method to changes the year of the document
	     * @param year -!= null
	     */
	public void setYear(String year) {
		this.year=year;
	}
}