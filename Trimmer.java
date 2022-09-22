class Trimmer{
public static void main(String a[]){
String brandName="VGR V";
String type="Clippers";
String price="1,499";
String warranty="5 years";
String colour="black";

String settings[]={"brandName","type","price","warranty","colour"};

String ref0=settings[0];
String ref1=settings[1];
String ref2=settings[2];
String ref3=settings[3];
String ref4=settings[4];

System.out.println("TRIMMER BRAND NAME IS : " +ref0);
System.out.println("TRIMMER TYPE IS : " +ref1);
System.out.println("TRIMMER PRICE IS : " +ref2);
System.out.println("TRIMMER WARRANTY IS : " +ref3);
System.out.println("TRIMMER COLOUR IS : " + ref4);

for(int i=0;i<settings.length;i++){
String ref=settings[i];
System.out.println("TRIMMER SETTINGS ARE : " +i+ "ref");
System.out.println(settings[i]);

} 
}
}