class Mobile{
static String name;
static String type;
static double price;
static String warranty;
static boolean isWorking;

public static boolean switchOnOrOff(){
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

}