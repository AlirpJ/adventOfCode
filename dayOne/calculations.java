package dayOne;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class calculations {
	
	static float fuel = 0;
	
	
	
	public static float calc(float t) throws IOException {
		
			float temp;
			temp = t;
			temp = temp / 3;
			temp = (float) Math.floor(temp);
			temp = temp-2;
			fuel = temp;
			return fuel;
		}
	
}
