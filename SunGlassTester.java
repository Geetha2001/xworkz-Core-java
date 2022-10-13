class SunGlassTester{
public static void main(String a[]){


//It is default constructor
SunGlass f1=new SunGlass();
f1.color="black";
f1.quality="high";
f1.price="600";

SunGlass f2=new SunGlass();
f2.color="brown";
f2.quality="high";
f2.price="600";

SunGlass f3=new SunGlass();
f3.color="Blue";
f3.quality="low";
f3.price="800";

SunGlass f4=new SunGlass();
f4.color="green";
f4.quality="low";
f4.price="6000";


SunGlass f5=new SunGlass();
f5.color="yellow";
f5.quality="high";
f5.price="600";


System.out.println(f1.color +"  "+ f1. quality +" "+ f1.price);
System.out.println(f2.color +"  "+ f2. quality +" "+ f2.price);
System.out.println(f3.color +"  "+ f3. quality +" "+ f3.price);
System.out.println(f4.color +"  "+ f4. quality +" "+ f4.price);
System.out.println(f5.color +"  "+ f5. quality +" "+ f5.price);
}

}