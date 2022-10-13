class BigBazarTester{
public static void main(String a[]){


//It is default constructor
BigBazar f1=new BigBazar();
f1.productName="Chocolate";
f1.pId="P1";
f1.price="100";

BigBazar f2=new BigBazar();
f2.productName="Chips";
f2.pId="P2";
f2.price="10";

BigBazar f3=new BigBazar();
f3.productName="Biscuts";
f3.pId="P3";
f3.price="100";

BigBazar f4=new BigBazar();
f4.productName="IceCream";
f4.pId="P4";
f4.price="100";


BigBazar f5=new BigBazar();
f5.productName="Juice";
f5.pId="P5";
f5.price="100";

BigBazar f6=f5;




System.out.println(f1.productName +"  "+ f1. pId +" "+ f1.price);
System.out.println(f2.productName +"  "+ f2. pId +" "+ f2.price);
System.out.println(f3.productName +"  "+ f3. pId +" "+ f3.price);
System.out.println(f4.productName +"  "+ f4. pId +" "+ f4.price);
System.out.println(f5.productName +"  "+ f5. pId +" "+ f5.price);
System.out.println(f6.productName +"  "+ f6. pId +" "+ f6.price);
}

}