package ui;
import java.util.Scanner;
import java.io.IOException;
import java.time.LocalDate;
import model.*;
public class Main{
	//Atributes
		private Company mainCompany;	
		public static Scanner lector;
	//Constants
		public static final String MOTO="Motocycle";
		public static final String GASO="Gasoline";
		public static final String ELEC="Electrical";
		public static final String HYB="Hybrid";
		public static void main(String[] args){
			Scanner lector = new Scanner (System.in);
			Main objMain=new Main();
			int option;
			objMain.createCompany();
			do{
				cls();
				System.out.println ("Options Menu"+
				"\n1.Register advisor"+
				"\n2.Register client"+
				"\n3.Register vehicles"+
				"\n4.Show the parking information"+
				"\n5.Sell vehicle");
				System.out.println ("Choose the option you want");
				option=lector.nextInt();
				lector.nextLine();
				switch (option){
					case 1:
						objMain.enterAdvisor();
						break;
					case 2:
						objMain.enterClient();
						break;
					case 3:
						System.out.println("What kind of vehicle you want to register. Enter 1 for motorcycles, 2 for gasoline cars, 3 for electric cars or 4 for hybrid cars");
						int o=lector.nextInt();
						if(o==1){
							objMain.enterVehicleMotocycle();
						}
						else if(o==2){
							objMain.enterVehicleGasoline();
						}
						else if(o==3){
							objMain.enterVehicleElectrical();
						}
						else{
							objMain.enterVehicleHybrid();
						}
						break;
					case 4:
						objMain.parkingInformation();
						break;
					case 5:
						objMain.interest();
						break;
				}
				System.out.println("To return to the menu type 0");
				option=lector.nextInt();
			} while (option==0);
		}
	public static void cls(){
			try{
				new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
			}
			catch (Exception E){
				System.out.println (E);
			}
	}
	public void createCompany(){
		Scanner lector = new Scanner (System.in);
		System.out.println("Enter the name of the Car-Dealership Company");
		String name=lector.nextLine();
		System.out.println("Enter the NIT");
		String nit=lector.nextLine();
		mainCompany=new Company(name.toUpperCase(),nit);
		}
	/** enterAdvisor
	* Method used to enter the information of an advisor and register it
	*/
	public void enterAdvisor(){
			Scanner lector = new Scanner (System.in);
			System.out.println("Type the name");
			String name=lector.nextLine();
			System.out.println("Type the last name");
			String last_name=lector.nextLine();
			System.out.println("Enter the identification");
			String identification=lector.nextLine();
			String message=mainCompany.addAdvisor(name.toUpperCase(),last_name.toUpperCase(),identification);
			System.out.println(message);
		}
	/** enterClient
	* Method used to enter the information of a client and register it
	*/
	public void enterClient(){
			Scanner lector = new Scanner (System.in);
			System.out.println("Type the name");
			String name=lector.nextLine();
			System.out.println("Type the last name");
			String last_name=lector.nextLine();
			System.out.println("Enter the identification");
			String identification=lector.nextLine();
			System.out.println("Type the phone number");
			String phone_number=lector.nextLine();
			System.out.println("Type the mail");
			String mail=lector.nextLine();
			String message=mainCompany.addClient(name.toUpperCase(),last_name.toUpperCase(),identification,phone_number,mail);
			System.out.println(message);
		}
	/** enterVehicleMotocycle
	* Method used to enter the information of a motocycle and register it
	*/
	public void enterVehicleMotocycle(){
			Scanner lector = new Scanner (System.in);
			String message="";
			String moto_type="";
			String type="";
			String lisence_plate;
			double mileage;
				System.out.println("Type the base price");
				double base_price=lector.nextDouble();
				System.out.println("Type the brand");
				String brand=lector.nextLine();
				lector.nextLine();
				System.out.println("Type the model");
				String model=lector.nextLine();
				System.out.println("Type the cylinder");
				double cylinder=lector.
				nextDouble();
				System.out.println("If the motorcycle is new digit 1, if used digit 2");
				int choice=lector.nextInt();
				if(choice==1){
					type=Vehicle.VEHICLE_NEW;
					lisence_plate="Not assigned";
					mileage=0;
				}
				else{
					type=Vehicle.VEHICLE_USED;
					System.out.println("Type the lisence plate");
					lisence_plate=lector.nextLine();
					lector.nextLine();
					System.out.println("Type the mileage");
					mileage=lector.nextDouble();
				}
				System.out.println("What is the type of motorcycle.Type 1 standar,2 for a sport,3 for scooter and 4 for cross");
				int choi=lector.nextInt();
				if(choi==1){
					moto_type=Motocycle.MOTO_STANDAR;
				}
				else if(choi==2){
					moto_type=Motocycle.MOTO_SPORT;
				}
				else if(choice==3){
					moto_type=Motocycle.MOTO_SCOOTER;
				}
				else{
					moto_type=Motocycle.MOTO_CROSS;
				}
				System.out.println("Type the gasoline capacity");
				double cap_tank=lector.nextDouble();
				System.out.println("--Additional information about the soat--");
				System.out.println("Type the price of the document");
				double priceSoat=lector.nextDouble();
				System.out.println("Type the year of the document");
				String yearSoat=lector.nextLine();
				lector.nextLine();
				System.out.println("What is the amount of accident coverage of the vehicle to register");
				double coverage_amount=lector.nextDouble();
				System.out.println("--Additional information about the mechanical technical revision--");
				System.out.println("Type the price of the document");
				double priceMec=lector.nextDouble();
				System.out.println("Type the year of the document");
				String yearMec=lector.nextLine();
				lector.nextLine();
				System.out.println("What are the gas levels");
				double gas_level=lector.nextDouble();
				message=mainCompany.addVehicle(base_price,brand,model,mileage,cylinder,type,lisence_plate,moto_type,cap_tank,priceSoat,yearSoat,coverage_amount,priceMec,yearMec,gas_level);
				System.out.println(message);
	}
	/** enterVehicleGasoline
	* Method used to enter the information of a gasoline car and register it
	*/
	public void enterVehicleGasoline(){
			Scanner lector = new Scanner (System.in);
			String message="";
			String car_type="";
			String type="";
			String type_gasoline="";
			String lisence_plate="";
			boolean polarized;
			double mileage=0;;
				System.out.println("Type the base price");
				double base_price=lector.nextDouble();
				System.out.println("Type the brand");
				String brand=lector.nextLine();
				lector.nextLine();
				System.out.println("Type the model");
				String model=lector.nextLine();
				System.out.println("Type the cylinder");
				double cylinder=lector.nextDouble();
				System.out.println("If the car is new digit 1, if used digit 2");
				int opt=lector.nextInt();
				if(opt==1){
					type=Vehicle.VEHICLE_NEW;
					lisence_plate="Not assigned";
					mileage=0;
				}
				else{
					type=Vehicle.VEHICLE_USED;
					System.out.println("Type the lisence plate");
					lisence_plate=lector.nextLine();
					lector.nextLine();
					System.out.println("Type the mileage");
					mileage=lector.nextDouble();
				}
				System.out.println("What is the type of car.Type 1 sedan or 2 for a van");
				int op=lector.nextInt();
				if(op==1){
					car_type=Car.CAR_SEDAN;
				}
				else{
					car_type=Car.CAR_VAN;
				}
				System.out.println("Type the number of doors");
				int door_number=lector.nextInt();
				System.out.println("Type 1 if the car is polarized,2 if it is not");
				int opti=lector.nextInt();
				if(opti==1){
					polarized=true;
				}
				else{
					polarized=false;
				}
				System.out.println("Type the tank capacity");
				double cap_tank=lector.nextDouble();
				System.out.println("What is the type of gasoline.Type 1 extra, 2 for corrient or 3 for diesel");
				int gaso=lector.nextInt();
				if(gaso==1){
					type_gasoline=Gasoline.EXTRA;
				}
				else if(gaso==2){
					type_gasoline=Gasoline.CORRIENT;
				}
				else{
					type_gasoline=Gasoline.DIESEL;
				}
				System.out.println("--Additional information about the soat--");
				System.out.println("Type the price of the document");
				double priceSoat=lector.nextDouble();
				System.out.println("Type the year of the document");
				String yearSoat=lector.nextLine();
				lector.nextLine();
				System.out.println("What is the amount of accident coverage of the vehicle to register");
				double coverage_amount=lector.nextDouble();
				System.out.println("--Additional information about the mechanical technical revision--");
				System.out.println("Type the price of the document");
				double priceMec=lector.nextDouble();
				System.out.println("Type the year of the document");
				String yearMec=lector.nextLine();
				lector.nextLine();
				System.out.println("What are the gas levels");
				double gas_level=lector.nextDouble();
		 		message=mainCompany.addVehicle(base_price,brand,model,mileage,cylinder,type,lisence_plate,car_type,door_number,polarized,cap_tank,type_gasoline,priceSoat,yearSoat,coverage_amount,priceMec,yearMec,gas_level);
		 		System.out.println(message);
	}
	/** enterVehicleElectrical
	* Method used to enter the information of a electrical car and register it
	*/
	public void enterVehicleElectrical(){
			Scanner lector = new Scanner (System.in);
			String message="";
			String car_type="";
			String type="";
			String charger_type="";
			String lisence_plate="";
			boolean polarized;
			double mileage=0;
				System.out.println("Type the base price");
				double base_price=lector.nextDouble();
				System.out.println("Type the brand");
				String brand=lector.nextLine();
				lector.nextLine();
				System.out.println("Type the model");
				String model=lector.nextLine();
				System.out.println("Type the cylinder");
				double cylinder=lector.nextDouble();
				System.out.println("If the car is new digit 1, if used digit 2");
				int opt=lector.nextInt();
				if(opt==1){
					type=Vehicle.VEHICLE_NEW;
					lisence_plate="Not assigned";
					mileage=0;
				}
				else{
					type=Vehicle.VEHICLE_USED;
					System.out.println("Type the lisence plate");
					lisence_plate=lector.nextLine();
					lector.nextLine();
					System.out.println("Type the mileage");
					mileage=lector.nextDouble();
				}
				System.out.println("What is the type of car.Type 1 sedan or 2 for a van");
				int op=lector.nextInt();
				if(op==1){
					car_type=Car.CAR_SEDAN;
				}
				else{
					car_type=Car.CAR_VAN;
				}
				System.out.println("Type the number of doors");
				int door_number=lector.nextInt();
				System.out.println("Type 1 if the car is polarized,2 if it is not");
				int opti=lector.nextInt();
				if(opti==1){
					polarized=true;
				}
				else{
					polarized=false;
				}
				System.out.println("What is the type of charger.Type 1 normal, or 2 for quick");
				int charg=lector.nextInt();
				if(charg==1){
					charger_type=Electrical.NORMAL;
				}
				else{
					charger_type=Electrical.QUICK;
				}
				System.out.println("Type the duration of the charger");
				double duration=lector.nextDouble();
				System.out.println("--Additional information about the soat--");
				System.out.println("Type the price of the document");
				double priceSoat=lector.nextDouble();
				System.out.println("Type the year of the document");
				String yearSoat=lector.nextLine();
				lector.nextLine();
				System.out.println("What is the amount of accident coverage of the vehicle to register");
				double coverage_amount=lector.nextDouble();
				System.out.println("--Additional information about the mechanical technical revision--");
				System.out.println("Type the price of the document");
				double priceMec=lector.nextDouble();
				System.out.println("Type the year of the document");
				String yearMec=lector.nextLine();
				lector.nextLine();
				System.out.println("What are the gas levels");
				double gas_level=lector.nextDouble();
		 		message=mainCompany.addVehicle(base_price,brand,model,mileage,cylinder,type,lisence_plate,car_type,door_number,polarized,charger_type,duration,priceSoat,yearSoat,coverage_amount,priceMec,yearMec,gas_level);
		 		System.out.println(message);
	}
	/** enterVehicleHybrid
	* Method used to enter the information of a hybrid car and register it
	*/
	public void enterVehicleHybrid(){
			Scanner lector = new Scanner (System.in);
			String message="";
			String car_type="";
			String type="";
			String type_gasoline="";
			String charger_type="";
			String lisence_plate="";
			boolean polarized;
			double mileage=0;
				System.out.println("Type the base price");
				double base_price=lector.nextDouble();
				System.out.println("Type the brand");
				String brand=lector.nextLine();
				lector.nextLine();
				System.out.println("Type the model");
				String model=lector.nextLine();
				System.out.println("Type the cylinder");
				double cylinder=lector.nextDouble();
				System.out.println("If the car is new digit 1, if used digit 2");
				int opt=lector.nextInt();
				if(opt==1){
					type=Vehicle.VEHICLE_NEW;
					lisence_plate="Not assigned";
					mileage=0;
				}
				else{
					type=Vehicle.VEHICLE_USED;
					System.out.println("Type the lisence plate");
					lisence_plate=lector.nextLine();
					lector.nextLine();
					System.out.println("Type the mileage");
					mileage=lector.nextDouble();
				}
				System.out.println("What is the type of car.Type 1 sedan or 2 for a van");
				int op=lector.nextInt();
				if(op==1){
					car_type=Car.CAR_SEDAN;
				}
				else{
					car_type=Car.CAR_VAN;
				}
				System.out.println("Type the number of doors");
				int door_number=lector.nextInt();
				System.out.println("Type 1 if the car is polarized,2 if it is not");
				int opti=lector.nextInt();
				if(opti==1){
					polarized=true;
				}
				else{
					polarized=false;
				}
				System.out.println("Type the tank capacity");
				double cap_tank=lector.nextDouble();
				System.out.println("What is the type of gasoline.Type 1 extra, 2 for corrient or 3 for diesel");
				int gaso=lector.nextInt();
				if(gaso==1){
					type_gasoline=Gasoline.EXTRA;
				}
				else if(gaso==2){
					type_gasoline=Gasoline.CORRIENT;
				}
				else{
					type_gasoline=Gasoline.DIESEL;
				}
				System.out.println("What is the type of charger.Type 1 normal, or 2 for quick");
				int charg=lector.nextInt();
				if(charg==1){
					charger_type=Electrical.NORMAL;
				}
				else{
					charger_type=Electrical.QUICK;
				}
				System.out.println("Type the duration of the battery");
				double duration=lector.nextDouble();
				System.out.println("--Additional information about the soat--");
				System.out.println("Type the price of the document");
				double priceSoat=lector.nextDouble();
				System.out.println("Type the year of the document");
				String yearSoat=lector.nextLine();
				lector.nextLine();
				System.out.println("What is the amount of accident coverage of the vehicle to register");
				double coverage_amount=lector.nextDouble();
				System.out.println("--Additional information about the mechanical technical revision--");
				System.out.println("Type the price of the document");
				double priceMec=lector.nextDouble();
				System.out.println("Type the year of the document");
				String yearMec=lector.nextLine();
				lector.nextLine();
				System.out.println("What are the gas levels");
				double gas_level=lector.nextDouble();
		 		message=mainCompany.addVehicle(base_price,brand,model,mileage,cylinder,type,lisence_plate,car_type,door_number,polarized,cap_tank,type_gasoline,charger_type,duration,priceSoat,yearSoat,coverage_amount,priceMec,yearMec,gas_level);
		 		System.out.println(message);
	}
	/** interest
	* Method used for the customer to digitize in detail the inferation of the vehicles that he wants to have as vehicles of interest
	*/
	public void interest(){
		Scanner lector = new Scanner (System.in);
		String message="";
		String lisence_plate="";
		int buy=0;
		double base_price=0;
		System.out.println("Write the identification of the seller in charge");
		String identificationA=lector.nextLine();
		System.out.println("Write the client's identification");
		String identificationC=lector.nextLine();
		System.out.println("What type of vehicle are you interested in");
		System.out.println("Enter 1 for motorcycles, 2 for gasoline cars, 3 for electric cars or 4 for hybrid cars");
		int opt=lector.nextInt();
		String vehicle="";
		String type="";
		if(opt==1){
			vehicle=MOTO;
		}
		if(opt==2){
			vehicle=GASO;
		}
		if(opt==3){
			vehicle=ELEC;
		}
		else if(opt==4){
			vehicle=HYB;
		}
		System.out.println("Want new or used vehicles.Enter 1 for the first one, 2 for the other one");
			int op=lector.nextInt();
			if(op==1){
				type=Vehicle.VEHICLE_NEW;
			}
			else{
				type=Vehicle.VEHICLE_USED;
			}
		message=mainCompany.interest(identificationA,identificationC,vehicle,type);
		System.out.println(message);
		System.out.println("Do you want to buy a vehicle? Type 1 for yes, 2 for no");
		buy=lector.nextInt();
		if(buy==1){
			if(type.equals(Vehicle.VEHICLE_USED)){
				System.out.println("Type the lisence plate of the vehicle you want to buy");
				lector.nextLine();
				lisence_plate=lector.nextLine();
			}
			else{
				System.out.println("Type the base price of the vehicle you want to buy");
				lector.nextLine();
				base_price=lector.nextDouble();
			}
				message=mainCompany.sellVehicle(identificationA,identificationC,lisence_plate,type,base_price);
				System.out.println(message);
			}
		}
	/** parkingInformation
	* Method used to enter the model of the cars to see their respective information
	*/
	public void parkingInformation(){
		Scanner lector = new Scanner(System.in);
		String message="";
		System.out.println("What year do you want to consult?");
		String year=lector.nextLine();
		message=mainCompany.parkingInformation(year);
		System.out.println(message);
	}
}	


