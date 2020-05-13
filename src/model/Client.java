package model;
import java.util.ArrayList;
public class Client extends Person {
	//Atributes
	private String phone_number;
	private String mail;
	//Relations
	private ArrayList<Vehicle>interest;
	//Methods
	public Client(){
		super();
	}
	/**
	*Client builder
	*@param name != null
	*@param last_name != null
	*@param identification != null
	*@param phone_number != null
	*@param mail != null
	*/
	public Client(String name, String last_name, String identification, String phone_number, String mail) {
		super(name,last_name,identification);
		this.phone_number=phone_number;
		this.mail=mail;
		this.interest=new ArrayList<Vehicle>();
	}
	/** getPhone_number
	     * Method to provide the phone number of the client
	     * @return String phone number
	     */
	public String getPhone_number(){
		return phone_number;
	}
	/** setPhone_number
	     * Method to changes the phone number of the client
	     * @param phone_number -!= null
	     */
	public void setPhone_number(String phone_number) {
		this.phone_number=phone_number;
	}
	/** getMail
	     * Method to provide the mail of the client
	     * @return String phone number
	     */
	public String getMail() {
		return mail;
	}
	/** setMail
	     * Method to changes the mail of the client
	     * @param mail -!= null
	     */
	public void setMail(String mail) {
		this.mail=mail;
	}
	/** getInterest
	     * Method to provide the vehicle of interest of the client
	     * @return Arraylist<Vehicle> vehicles of interest
	     */
	public ArrayList<Vehicle> getInterest(){
		return interest;
	}
}