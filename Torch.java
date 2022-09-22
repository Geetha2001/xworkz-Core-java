class Torch{
static String name;
static String type;
static double price;
static String warranty;
static boolean isWorking;
static int minVolume;
static int maxVolume=8;
static int currentVolume;

public static boolean onOrOff(){
System.out.println("INSIDE ONOROFF");

if(isWorking==false){
isWorking=true;
System.out.println(" TORCH IS TURNED ON...");
}

else if(isWorking==true){
isWorking=false;
System.out.println("TORCH IS TURNED OFF...");
}

System.out.println("ENDING OF ONOROFF");
return isWorking;
}
public static void increaseRange(){
		System.out.println("INSIDE OF INCREASE VOLUME");
		if(isWorking==true){
		if(currentVolume<maxVolume){
			currentVolume=currentVolume+1;
		System.out.println("CURRENT VOLUME IS :" +currentVolume);
		
			
		}
		
		else{
			System.out.println("Max Volume reached()");
			}
		}
		
		
		else{
			System.out.println("Gube... Speaker on madu");
			}
		
	
		
	
	System.out.println("END OF INCREASE VOLUME");
		
	return ;
		
	} 
public static void decreaseRange(){
		System.out.println("INSIDE OF DECRESE VOLUME");
		if(isWorking==true){
		if(currentVolume>minVolume){
			currentVolume=currentVolume-1;
			System.out.println("CURRENT VOLUME IS :" +currentVolume);
		}
		
		else{
			
		System.out.println("Min volume reached()");
		}
		}
		
		else{
			
		System.out.println("Gube... Speaker on madu");
		}
		
		System.out.println("OUTSIDE THE DECRESE VOLUME");
		return ;

		
		
		
	}
	


}