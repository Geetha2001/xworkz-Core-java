class Speaker
	{
		static String brand;
		static String colour;
		static double price;
		static boolean isConnected;
		static int minVolume;
		static int maxVolume=8;
		static int currentVolume;
 
	 public static boolean onOrOff()
	 {
		System.out.println("INSIDE OF onOrOff()");
		//why false means defalut value of boolean is false
		//false==false
		
		if(isConnected==false)
		{
			isConnected=true;
			System.out.println("SPEAKER IS TURNED ON...");
		}
		
		else if(isConnected==true)
		{
			isConnected=false;
			System.out.println("SPEAKER IS TURNED OFF...");
		}
 
			System.out.println("END OF onOrOff()");
			return isConnected;
 
	}
	public static void increaseVolume(){
		System.out.println("INSIDE OF INCREASE VOLUME");
		if(isConnected==true){
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
	
	public static void decreaseVolume(){
		System.out.println("INSIDE OF DECRESE VOLUME");
		if(isConnected==true){
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

	
	
	
