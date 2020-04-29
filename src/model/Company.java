package model;
public class Company {
	//Constants
	public static final int SELLERS=10;
	//Atributes
	private String name;
	private String nit;
	private double total_earnings;
	private double sales_number;
	private Advisor[] sellers;
	//Methods
	public Company(String name, String nit) {
		this.name=name;
		this.nit=nit;
		this.total_earnings=0;
		this.sales_number=0;
		this.sellers = new Advisor[SELLERS];
	}
	public Advisor searchAdvisor(String identification){
	Advisor searchAdvisor=null;
	boolean find=false;
	for (int s=0;s<SELLERS&&find==false;s++){
		if(sellers[s]!=null){
			if (sellers[s].getIdentification().equals(identification)){
			searchAdvisor=sellers[s];
			find=true;
			}
		}
	}

		return searchAdvisor;
    }
    public String addAdvisor(String name, String last_name, String identification)
	{   String message="";
		boolean add=false;
	    Advisor search=searchAdvisor(identification);
	    if (search!=null){
	    	message="Error. Avisor already exists.";
	    }
	    else
	    {
	   		for (int s=0;s<SELLERS&&add==false;s++){
	    		if (sellers[s]==null){
	    			sellers[s]=new Advisor(name,last_name,identification);
	    			add=true;
	    			message="The new advisor was successfully registered.";
	    	}
	    }
	    	if (add==false){
	    	message="Error.Cannot register more advisors";
	    	}
	    }
        return message;
	}
	public Client searchClient(String identification){
	Client searchClient=null;
	boolean find=false;
	boolean search=false;
	for(int s=0;s<SELLERS&&find==false;s++){
		if(sellers[s]!=null){
			Client []clients=new Client[Advisor.CLIENTS];
			clients=sellers[s].getClients();
			for(int m=0;m<Advisor.CLIENTS&&search==false;m++){
				if(clients[m]!=null){
					if(clients[m].getIdentification().equals(identification)){
						searchClient=clients[m];
						search=true;
						find=true;
					}
				}
			}	
		}
	}
		return searchClient;
    }
    public String addClient(String name, String last_name, String identification, String phone_number, String mail)
	{   String message="";
		boolean add=false;
	    Client search=searchClient(identification);
	    
	    if (search!=null){
	    	message="Error. Client already exists.";
	    }
	    else{
	   		for (int m=0;m<SELLERS&& add==false;m++){
	   			if (sellers[m]!=null){
	   				Client []clients=new Client[Advisor.CLIENTS];
					clients=sellers[m].getClients();
					for(int s=0;s<Advisor.CLIENTS;s++){
						if(clients[s]==null){
	    					clients[s]=new Client(name,last_name,identification,phone_number,mail);
	    					add=true;
	    				}
	    			}
	    		}
	    	}
	    if(add==true){
	    	message="The new client was successfully registered.";
	    }
	    else{
	    	message="Error.Cannot register more clients";
	    	}
	    }
        return message;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNit() {
		return nit;
	}
	public void setNit(String nit) {
		this.nit = nit;
	}
	public double getTotal_earnings() {
		return total_earnings;
	}
	public void setTotal_earnings(double total_earnings) {
		this.total_earnings = total_earnings;
	}
	public double getSales_number() {
		return sales_number;
	}
	public void setSales_number(double sales_number) {
		this.sales_number = sales_number;
	}

}