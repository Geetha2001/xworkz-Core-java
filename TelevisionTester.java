class TelevisionTester{
public static void main(String tv[]){

System.out.println("MAIN METHOD IS STARTED...");
Television.brandName="SONY";
Television.color="BLACK";
Television.warranty="5 years";
Television.width="50 inches";
Television.price=50000.00;

System.out.println("BRAND NAME IS " +Television.brandName);
System.out.println("COLOUR IS " +Television.color);
System.out.println("WARRANTY IS " +Television.warranty);
System.out.println("WIDTH IS " +Television.width);
System.out.println("PRICE IS " +Television.price);

Television.onOrOff();
Television.increaseVolume();
Television.increaseVolume();
		Television.increaseVolume();
		Television.increaseVolume();
		Television.increaseVolume();
		Television.increaseVolume();
		Television.decreaseVolume();
		Television.decreaseVolume();
		Television.decreaseVolume();
		Television.decreaseVolume();
		Television.decreaseVolume();
	

System.out.println("MAIN METHOD IS ENDED");



}



}