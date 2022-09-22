class WashingMachineTester{
public static void main(String machine[]){
WashingMachine.name="SAMSUNG";
WashingMachine.type="ELECTRONIC DEVICE";
WashingMachine.price=15000.00;
WashingMachine.warranty="5 years";
WashingMachine.width="15 inches";
WashingMachine.height="3 inches";


System.out.println("MAIN METHOD STARTED");
System.out.println("BRAND NAME IS " +WashingMachine.name);
System.out.println("AC TYPE IS  " +WashingMachine.type);
System.out.println("AC PRICE IS " +WashingMachine.price);
System.out.println("WARRANTY IS " +WashingMachine.warranty);
System.out.println("AC WIDTH IS " +WashingMachine.width);
System.out.println("AC HEIGHT IS " +WashingMachine.height);
WashingMachine.onOrOff();
WashingMachine.increaseRange();
WashingMachine.increaseRange();
WashingMachine.increaseRange();
WashingMachine.increaseRange();
WashingMachine.decreaseRange();
WashingMachine.decreaseRange();
WashingMachine.decreaseRange();
WashingMachine.decreaseRange();
WashingMachine.decreaseRange();
	
System.out.println("MAIN METHOD ENDED");

}
}