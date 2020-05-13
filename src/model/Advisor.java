package model;
public class Advisor extends Person{
	//Constants
	public static final int CLIENTS=5;
	//Atributes
	private int sales_quantity;
	//Relationa
	private Client[] clients;
	//Methods
	public Advisor(){
		super();
	}
	/**
	*Advisor builder
	*@param name != null
	*@param last_name != null
	*@param identification != null
	*/
	public Advisor(String name, String last_name, String identification) {
		super(name,last_name,identification);
		this.sales_quantity=0;
		this.clients = new Client[CLIENTS];
	}
	/** getSales_quantity
	     * Method to provide the quantity of sales of the advisor
	     * @return int sales quantity
	     */
	public int getSales_quantity(){
		return sales_quantity;
	}
	/** setSales_quantity
	     * Method to changes the sales quantity of the advisor
	     * @param sales_quantity -!= null
	     */
	public void setSales_quantity(int sales_quantity){
		this.sales_quantity=sales_quantity;
	}
	/** getClients
	     * Method to provide the array of clients of the advisor
	     * @return Client[] clients of the advisor
	     */
	public Client[] getClients(){
		return clients;
	}

}