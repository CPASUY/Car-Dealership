package ui;
import java.util.Scanner;
import java.io.IOException;
import java.time.LocalDate;
import model.*;
public class Main{
	//Atributes
		private Company mainCompany;	
		public static Scanner lector;
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
				"\n4.Show vehicle report"+
				"\n5.Calculate the total sale price of a vehicle"+
				"\n6.Sell ​​a vehicle"+
				"\n7.Show vehicle catalog"+
				"\n8.Save cars in the parking lot");
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
						
						break;
					case 4:
						
						break;
					case 5:
						
						break;
					case 6:
						
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
	public void enterVehiclesMotocycle(){
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
				System.out.println("Type the model");
				String model=lector.nextLine();
				System.out.println("Type the cylinder capacity");
				double cylinder_capacity=lector.nextDouble();
				System.out.println("If the motorcycle is new digit 1, if used digit 2");
				int choice=lector.nextInt();
				if(choice==1){
					type=Vehicle.VEHICLE_NEW;
					lisence_plate="";
					mileage=0;
				}
				else{
					type=Vehicle.VEHICLE_USED;
					System.out.println("Type the lisence plate");
					lisence_plate=lector.nextLine();
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
				double gasoline_capacity=lector.nextDouble();
				System.out.println("Type the gasoline consume");
				double consume_gaso=lector.nextDouble();
				message=mainCompany.addVehicle(base_price,brand,model,mileage,cylinder_capacity,type,lisence_plate,moto_type,gasoline_capacity,consume_gaso);
				System.out.println(message);
	}
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
				System.out.println("Type the model");
				String model=lector.nextLine();
				System.out.println("Type the cylinder capacity");
				double cylinder_capacity=lector.nextDouble();
				System.out.println("If the car is new digit 1, if used digit 2");
				int opt=lector.nextInt();
				if(opt==1){
					type=Vehicle.VEHICLE_NEW;
				}
				else{
					type=Vehicle.VEHICLE_USED;
					System.out.println("Type the lisence plate");
					lisence_plate=lector.nextLine();
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
				System.out.println("Type the gasoline capacity");
				double cap_gasoline=lector.nextDouble();
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
				System.out.println("Type the gasoline consume");
				double gaso_consume=lector.nextDouble();
		 		message=mainCompany.addVehicle(base_price,brand,model,mileage,cylinder_capacity,type,lisence_plate,car_type,door_number,polarized,cap_gasoline,type_gasoline,gaso_consume);
	}
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
				System.out.println("Type the model");
				String model=lector.nextLine();
				System.out.println("Type the cylinder capacity");
				double cylinder_capacity=lector.nextDouble();
				System.out.println("If the car is new digit 1, if used digit 2");
				int opt=lector.nextInt();
				if(opt==1){
					type=Vehicle.VEHICLE_NEW;
				}
				else{
					type=Vehicle.VEHICLE_USED;
					System.out.println("Type the lisence plate");
					lisence_plate=lector.nextLine();
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
				System.out.println("Type the battery consume");
				double consume_battery=lector.nextDouble();
		 		message=mainCompany.addVehicle(base_price,brand,model,mileage,cylinder_capacity,type,lisence_plate,car_type,door_number,polarized,charger_type,duration,consume_battery);
	}
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
				System.out.println("Type the model");
				String model=lector.nextLine();
				System.out.println("Type the cylinder capacity");
				double cylinder_capacity=lector.nextDouble();
				System.out.println("If the car is new digit 1, if used digit 2");
				int opt=lector.nextInt();
				if(opt==1){
					type=Vehicle.VEHICLE_NEW;
				}
				else{
					type=Vehicle.VEHICLE_USED;
					System.out.println("Type the lisence plate");
					lisence_plate=lector.nextLine();
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
				System.out.println("Type the gasoline capacity");
				double cap_gasoline=lector.nextDouble();
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
				System.out.println("Type the gasoline consume");
				double gaso_consume=lector.nextDouble();
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
				System.out.println("Type the consume battery");
				double consume_battery=lector.nextDouble();
		 		message=mainCompany.addVehicle(base_price,brand,model,mileage,cylinder_capacity,type,lisence_plate,car_type,door_number,polarized,cap_gasoline,type_gasoline,gaso_consume,charger_type,duration,consume_battery);
	}
}	


