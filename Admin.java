package CarpoolApp;

import java.util.ArrayList;


public class Admin {
	
	ArrayList<Ride> rideList = new ArrayList<>();
	
	int id;
	void createRide(String sourceCity, String destinationCity, int fare) {
		 id=id+1;
		Ride ride = new Ride(sourceCity, destinationCity, fare, id);
		 rideList.add(ride);
		
		 
	}
	
	
	void displayRide() {
		for(Ride ride : rideList) {
			System.out.println(ride);
		}
	}
	
	ArrayList<String> getAllPlaces(){
		ArrayList<String> cityList = new ArrayList<>();
		for (Ride ride : rideList) {
			if(!cityList.contains(ride.getSourceCity())) {
			cityList.add(ride.getSourceCity());
			}
			if(!cityList.contains(ride.getDestinationCity())) {
			cityList.add(ride.getDestinationCity());
		}
		}
		return cityList;
		
 	}
	
	ArrayList<String> getAllDestination(String source){
		ArrayList<String>destList= new ArrayList<>();
		for(Ride ride : rideList) {
			if(ride.getSourceCity().equals(source)) {
				destList.add(ride.getDestinationCity());
			}
		}
		return destList;

	}
	
	int totalFare() {
		int total =0;
		for(Ride ride : rideList) {
			total =total + ride.getFare();
		}
		return total;
	}
	
	void deleteRide(int id) {
		for(int i=0;i<rideList.size();i++) {
			if(rideList.get(i).getId()==id) {
				rideList.remove(rideList.get(i));
		}
	}
		 
		 
	}
	
	
}


