class AcTester{ 
public static void main(String ac[]){
Ac.name="SAMSUNG";
Ac.type="ELECTRONIC DEVICE";
Ac.price=15000.00;
Ac.warranty="5 years";
Ac.width="15 inches";

System.out.println("MAIN METHOD STARTED");
System.out.println("BRAND NAME IS " +Ac.name);
System.out.println("AC TYPE IS  " +Ac.type);
System.out.println("AC PRICE IS " +Ac.price);
System.out.println("WARRANTY " +Ac.warranty);
System.out.println("AC WIDTH IS " +Ac.width);
Ac.onOrOff();
Ac.increaseRange();
Ac.increaseRange();
Ac.increaseRange();
Ac.increaseRange();
Ac.decreaseRange();
Ac.decreaseRange();
Ac.decreaseRange();
Ac.decreaseRange();
Ac.decreaseRange();
	
System.out.println("MAIN METHOD ENDED");

}
}