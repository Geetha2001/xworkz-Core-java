class MobileTester{
public static void main(String torch[]){
Torch.name="REAL ME";
Torch.type="ELECTRONIC DEVICE";
Torch.price=15000.00;
Torch.warranty="1 year";

System.out.println("MAIN METHOD STARTED");
System.out.println("BRAND NAME IS " +Mobile.name);
System.out.println("AC TYPE IS  " +Mobile.type);
System.out.println("AC PRICE IS " +Mobile.price);
System.out.println("WARRANTY IS " +Mobile.warranty);
Mobile.switchOnOrOff();
System.out.println("MAIN METHOD ENDED");

}
}