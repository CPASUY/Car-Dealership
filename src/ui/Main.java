package ui;
import java.util.Scanner;
import java.io.IOException;
import model.Company;
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
}	
