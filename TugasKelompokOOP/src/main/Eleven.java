package main;

public class Eleven {

	final int secondsInAYear = 365 * 24 * 60 * 60;
	
	Eleven(int years){
		
		int currentPopulation = 312032486;
		int leftOverBirthSeconds = 0;
		int leftOverDeathSeconds = 0;
		int leftOverImmigrantSeconds = 0;
		
		for (int i = 1; i <= years; i++) {
			
			int amountOfBirth = (secondsInAYear + leftOverBirthSeconds) / 7;
			int amountOfDeath = (secondsInAYear + leftOverDeathSeconds) / 13;
			int amountOfImmigrants = (secondsInAYear + leftOverImmigrantSeconds) / 45;
			
			leftOverBirthSeconds = (secondsInAYear + leftOverBirthSeconds) % 7;
			leftOverDeathSeconds = (secondsInAYear + leftOverDeathSeconds) % 13;
			leftOverImmigrantSeconds = (secondsInAYear + leftOverImmigrantSeconds) % 45;
			
			currentPopulation = currentPopulation + amountOfBirth + 
					amountOfImmigrants - amountOfDeath;
			System.out.printf("Year %d : %d\n", i, currentPopulation);
			
		}
		
	}
	
}
