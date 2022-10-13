class SolarTester{
public static void main(String a[]){


//It is default constructor
Solar f1=new Solar();
f1.name="sony";
f1.quality="high";
f1.price="600";

Solar f2=new Solar();
f2.name="dell";
f2.quality="high";
f2.price="600";

Solar f3=new Solar();
f3.name="samsung";
f3.quality="low";
f3.price="800";

Solar f4=new Solar();
f4.name="lenovo";
f4.quality="low";
f4.price="6000";


Solar f5=new Solar();
f5.name="acer";
f5.quality="high";
f5.price="600";


System.out.println(f1.name +"  "+ f1. quality +" "+ f1.price);
System.out.println(f2.name +"  "+ f2. quality +" "+ f2.price);
System.out.println(f3.name +"  "+ f3. quality +" "+ f3.price);
System.out.println(f4.name +"  "+ f4. quality +" "+ f4.price);
System.out.println(f5.name +"  "+ f5. quality +" "+ f5.price);
}

}