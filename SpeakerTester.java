class SpeakerTester
	{
	public static void main(String speaker[])
	{
		System.out.println("MAIN METHOD STARTED..");
		Speaker.brand="boat";
		Speaker.colour="black";
		Speaker.price=500.00;
		System.out.println("brand name is " +Speaker.brand);
		System.out.println("colour is " +Speaker.colour);
		System.out.println("price is " +Speaker.price);
		Speaker.onOrOff();
		Speaker.increaseVolume();
		Speaker.increaseVolume();
		Speaker.increaseVolume();
		Speaker.increaseVolume();
		Speaker.increaseVolume();
		Speaker.decreaseVolume();
		Speaker.decreaseVolume();
		Speaker.decreaseVolume();
		Speaker.decreaseVolume();
		Speaker.decreaseVolume();
	
		Speaker.onOrOff();
		
		
		
		System.out.println("MAIN METHOD ENDED..");
	}
	}