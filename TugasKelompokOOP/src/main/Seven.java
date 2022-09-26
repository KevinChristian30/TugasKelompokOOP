package main;

public class Seven {

	Seven(int n){
		
		double multiplier = 0;
		for (int i = 1, j = 1; i <= n ; i += 2, j++) {
			
			multiplier = (j % 2 == 1) ? 
			multiplier + (double) 1 / i :
			multiplier - (double) 1 / i;
			
		}
		
		System.out.println(4 * multiplier);
		
	}
	
}
