package model;
import java.util.Random;
public class Documents{
	//Constants
	public static final int DIMENSION=4;
	//Atributes
	private double price;
	private String year;
	private int[][] image_code;
	//Methods
	public Documents(double price,String year,int[][]image_code){
		this.price=price;
		this.year=year;
		this.image_code= initialize();
	}
	public int[][] initialize(){
		int [][]code = new int[DIMENSION][DIMENSION];
		for (int s=0;s< code.length; s++) {
  			for(int m=0;m< code[s].length;m++) {
    		 	code[s][m] = Math.random()*20;
  			}
  		}
  		return code;
	}
	public String soat(){
		String soat="";
		int [][]code = initialize();
  			for(int m=0;m< code[s].length;m++) {
    		 	 soat= code[0][m]+" ";
  			}
  		return soat;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year=year;
	}
}