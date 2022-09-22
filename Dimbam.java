class Dimbam{
public static void main(String a[]){
String forestName="Dimbam Forest";
String animals[]={"Lion","Tiger","Elepanet","Dear","Bear","Cheeta"};
String region="Tamilnadu";
String length="8 kms";

String forestInfo[]={"forestName","animals","region","length"};

String ref0=forestInfo[0];
String ref1=forestInfo[1];
String ref2=forestInfo[2];        
String ref3=forestInfo[3];


System.out.println("FORESTNAME ARE :" +ref0);
System.out.println("ANIMALS ARE :" +ref1);
System.out.println("REGION ARE :" +ref2);
System.out.println("LENGTH ARE :" +ref3);

for(int i=0;i<forestInfo.length;i++){
	String ref=forestInfo[i];
	System.out.println("ENTER AT INDEX "+i+" ref");
	System.out.println(forestInfo[i]);


}
}
}