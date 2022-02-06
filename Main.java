package CarpoolApp;

public class Main {
	
	public static void main(String arg[]) {
		
//		Admin admin = new Admin();
//		
//		admin.createRide("Delhi","Agra", 500);
//		admin.createRide("Delhi","Patahnkot",600);
//		admin.createRide("Delhi","Jalandhar",700);
//		admin.displayRide();
////		admin.deleteRide("Delhi","Agra", 500);
////		admin.displayRide();
////		admin.deleteRide("Delhi","Pathankot",500);
		
		Admin saneet = new Admin();
		saneet.createRide("Delhi","Jammu", 300);
		saneet.createRide("Agra", "Jaipur", 200);
		saneet.createRide("Delhi","Jammu", 300);
		saneet.createRide("sagra", "Jaipur", 200);
//		saneet.createRide("belelhi","Jammu", 300);
//		saneet.createRide("asra", "Jaipur", 200);
//		saneet.createRide("asddlhi","Jammu", 300);
//		saneet.createRide("asdfa", "Jaipur", 200);
		saneet.displayRide();
		saneet.deleteRide(1);
		System.out.println("///////////////////////////");
		saneet.displayRide();
	}
}
      