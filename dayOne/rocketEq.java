package dayOne;
// Work by Joshua Prila, done for Advent of Code 2019
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class rocketEq {

	private static double fuelReq = 0;
	static List<Float> arr = new ArrayList<Float>();
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File myFile = new File("rocket.txt");
		Scanner file = new Scanner(myFile);
		
		while(file.hasNextLine()) {
			float token = file.nextFloat();
			arr.add(token);
		}
		
		
		float tempFuel = 0;	// tempFuel used for calculation on a given mass
		float temp1 = 0;	// temp1 used for calculation on fuel required for a given mass
		
		for(int i = 0; i<arr.size();i++) {
			//System.out.println(calculations.calc(arr.get(i)));
			tempFuel = (arr.get(i));System.out.println("Value of mass: "+tempFuel);
			tempFuel = calculations.calc(tempFuel);System.out.println("Calculated required fuel: "+tempFuel);
			fuelReq += tempFuel;
			
			// For current index, keep iterating to account for fuel usage
			temp1 = tempFuel;
			while(((Math.floor(temp1/3))-2)>=1) { 						// While: the fuel post calculation still requires more fuel to carry; continue
				temp1 = calculations.calc(temp1);
				fuelReq += temp1;
				tempFuel = tempFuel - temp1;
			}
			tempFuel = 0;
		}
		
		System.out.println("= "+fuelReq);
		//3297896 returned :)
		
	}

}




