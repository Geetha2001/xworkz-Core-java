class TajHotelTester{
public static void main(String a[]){


//It is default constructor
TajHotel f1=new TajHotel();
f1.foodNames="MasalaDosa";
f1.branches="Rajajinagar";
f1.managerNames="sahana";

TajHotel f2=new TajHotel();
f2.foodNames="Palav";
f2.branches="Shivnanagar";
f2.managerNames="Hema";

TajHotel f3=new TajHotel();
f3.foodNames="Chitranna";
f3.branches="BTM";
f3.managerNames="Spandana";

TajHotel f4=new TajHotel();
f4.foodNames="Mosaranna";
f4.branches="Kengeri";
f4.managerNames="Shalini";


TajHotel f5=new TajHotel();
f5.foodNames="Chapati";
f5.branches="GandhiNagar";
f5.managerNames="Geetha";


System.out.println(f1.foodNames +"  "+ f1. branches +" "+ f1.managerNames);
System.out.println(f2.foodNames +"  "+ f2. branches +" "+ f2.managerNames);
System.out.println(f3.foodNames +"  "+ f3. branches +" "+ f3.managerNames);
System.out.println(f4.foodNames +"  "+ f4. branches +" "+ f4.managerNames);
System.out.println(f5.foodNames +"  "+ f5. branches +" "+ f5.managerNames);
}

}