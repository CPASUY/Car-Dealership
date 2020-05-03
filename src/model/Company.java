package model;
import java.util.ArrayList;
public class Company {
	//Constants
	public static final int SELLERS=10;
	//Atributes
	private String name;
	private String nit;
	private double total_earnings;
	private double sales_number;
	private Advisor[] sellers;
	private ArrayList<Vehicle>vehicles;
	//Methods
	public Company(String name, String nit) {
		this.name=name;
		this.nit=nit;
		this.total_earnings=0;
		this.sales_number=0;
		this.sellers = new Advisor[SELLERS];
		this.vehicles=new ArrayList<Vehicle>();
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
	public boolean searchVehicle(String lisence_plate){
	boolean searchVehicle=false;
	boolean find=false;
	for (int s=0;s<vehicles.size()&&find==false;s++){
		if(vehicles.get(s)!=null){
			if(vehicles.get(s).getLisence_plate().equals(lisence_plate)){
			searchVehicle=true;
			find=true;
			}
		}
	}
		return searchVehicle;
    }
	public String addVehicle(double base_price,String brand,String model,double mileage,double cylinder,String type,String lisence_plate,String moto_type,double cap_tank){
		boolean find=false;
		boolean add=true;
		if(lisence_plate.equals(Vehicle.VEHICLE_USED)){
		add=searchVehicle(lisence_plate);
		}
		String message="";
		if(add==false || lisence_plate.equals("")){
			for(int s=0;s<vehicles.size()&&find==false;s++){
				if(vehicles.get(s)==null){
					Motocycle vehicles=new Motocycle(base_price,brand,model,mileage,cylinder,type,lisence_plate,moto_type,cap_tank);
					this.vehicles.add(vehicles);
					find=true;
				}
			}
		}
		if(find==true){
			message="The vehicle has been successfully registered";
		}
		else{
			message="The vehicle has not been successfully registered";
		}
		return message;
	}
	public String addVehicle(double base_price,String brand,String model,double mileage,double cylinder,String type,String lisence_plate,String car_type,int door_number,boolean polarized,double cap_tank,String type_gasoline){
		boolean find=false;
		boolean add=true;
		String message="";
		if(lisence_plate.equals(Vehicle.VEHICLE_USED)){
		add=searchVehicle(lisence_plate);
		}
		if(add==false || lisence_plate.equals("")){
			for(int s=0;s<vehicles.size()&&find==false;s++){
				if(vehicles.get(s)==null){
					Gasoline vehicles=new Gasoline(base_price,brand,model,mileage,cylinder,type,lisence_plate,car_type,door_number,polarized,cap_tank,type_gasoline);
					this.vehicles.add(vehicles);
					find=true;
				}
			}
		}
		if(find==true){
			message="The vehicle has been successfully registered";
		}
		else if(add==true){
			message="The vehicle has not been successfully registered";
		}
		return message;
	}
	public String addVehicle(double base_price,String brand,String model,double mileage,double cylinder,String type,String lisence_plate,String car_type,int door_number,boolean polarized,String charger_type,double duration){
		boolean find=false;
		boolean add=true;
		if(lisence_plate.equals(Vehicle.VEHICLE_USED)){
		add=searchVehicle(lisence_plate);
		}
		String message="";
		if(add==false || lisence_plate.equals("")){
			for(int s=0;s<vehicles.size()&&find==false;s++){
				if(vehicles.get(s)==null){
					Electrical vehicles=new Electrical(base_price,brand,model,mileage,cylinder,type,lisence_plate,car_type,door_number,polarized,charger_type,duration);
					this.vehicles.add(vehicles);
					find=true;
				}
			}
		}
		if(find==true){
			message="The vehicle has been successfully registered";
		}
		else if(add==true){
			message="The vehicle has not been successfully registered";
		}
		return message;
	}
	public String addVehicle(double base_price,String brand,String model,double mileage,double cylinder,String type,String lisence_plate,String car_type,int door_number,boolean polarized,double cap_tank,String type_gasoline,String charger_type,double duration){
		boolean find=false;
		boolean add=true;
		if(lisence_plate.equals(Vehicle.VEHICLE_USED)){
		add=searchVehicle(lisence_plate);
		}
		String message="";
		if(add==false || lisence_plate.equals("")){
			for(int s=0;s<vehicles.size()&&find==false;s++){
				if(vehicles.get(s)==null){
					Hybrid vehicles=new Hybrid(base_price,brand,model,mileage,cylinder,type,lisence_plate,car_type,door_number,polarized,cap_tank,type_gasoline,charger_type,duration);
					this.vehicles.add(vehicles);
					find=true;
				}
			}
		}
		if(find==true){
			message="The vehicle has been successfully registered";
		}
		else if(add==true){
			message="The vehicle has not been successfully registered";
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
	public ArrayList<Vehicle> getVehicles(){
		return vehicles;
	}
}