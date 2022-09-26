package main;

public class Ten {
	
	Ten(double distanceInKM, int hours, int minutes, int seconds){
		
		double distanceInMiles = KMToMiles(distanceInKM);
		double hoursTaken = convertToHour(hours, minutes, seconds);
		
		System.out.printf("Average Speed : %.2f miles/hour\n", distanceInMiles / hoursTaken);
		
	}
	
	private double KMToMiles(double KM) {
		
		return KM * 0.621371;
		
	}
	
	private double convertToHour(int hours, int minutes, int seconds) {
		
		return (double) hours + (double) minutes / 60 + (double) seconds / 3600;
		
	}

}
