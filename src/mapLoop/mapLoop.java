package mapLoop;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.HashMap;

public class mapLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test");
		boolean validPrompt=false;
		Scanner userInput = new Scanner(System.in);
		while (validPrompt==false) {
			System.out.println("1 for Loop - 2 for Hash Map");
			String stringProgram=userInput.nextLine().toUpperCase();
			int programID=Integer.parseInt(stringProgram);			
			if ((programID==1) || (programID==2)) {
				validPrompt=true;
			}
			else {
				System.out.println("Please insert 1 or  2 ");
			}
			
			//Commenting so 2 can be done
			/*
			if (programID==1) {
				System.out.println("Starting Loop");
				int cont=0;
				List<Integer> intArray=new ArrayList<Integer>();
				while (cont<5) {
					System.out.println("Please insert number "+(cont+1));
					String stringNum=userInput.nextLine().toUpperCase();
					int num=Integer.parseInt(stringNum);		
					intArray.add(num);
					cont++;
				}
				System.out.println("Sum is "+(intArray.get(0)+intArray.get(1)+intArray.get(2)+intArray.get(3)+intArray.get(4)));
				System.out.println("Product is "+(intArray.get(0)*intArray.get(1)*intArray.get(2)*intArray.get(3)*intArray.get(4)));
				Collections.sort(intArray);
				System.out.println("Smallest is "+intArray.get(0));
				System.out.println("Largest is "+intArray.get(intArray.size()-1));
				//listLucky.get(0)
			}*/
			if (programID==2) {
				HashMap<String,String> dealership= new HashMap<String,String>();
				dealership.put("Honda","Civic");
				dealership.put("Hyundai","Tucson");
				dealership.put("Jeep","Cherokee");
				dealership.put("Equinox","Chevrolet");
				dealership.put("Chevrolet","Silverado");
				dealership.put("Aveo","Chevrolet");
				dealership.put("Chevrolet","Avalanche");
				System.out.println("Keys");
				for (String i : dealership.keySet()) {
				  System.out.println("Keys "+i);
				}
				System.out.println("Values");
				for (String i : dealership.values()) {
				  System.out.println("Values "+i);
				}
				System.out.println("Chevrolet");
				for (String i : dealership.values()) {
				  if (i=="Chevrolet"){
					  System.out.println("Values "+dealership.get("Chevrolet"));
				  }
				}
			}
		}
	}

}
