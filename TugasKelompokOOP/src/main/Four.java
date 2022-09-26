package main;

public class Four {
	
	Four(int n){
		
		System.out.println("a     a^2   a^3     ");
		
		for (int i = 1; i <= n; i++) {
			
			System.out.printf("%-5d %-5d %-5d\n", i, i * i, i * i * i);
			
		}
		
	}

}
