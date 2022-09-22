class CitizenOfIndia{

public static void showTheResponsibility(){
System.out.println("invoked showTheResponsibility");

int age=21;
char gender='F';

//AND operator
if(age>=10 && age<16){
System.out.println("Responsibility is goto School");
return ;
}

if(age==16){
System.out.println("Responsibility is goto Collage");
}

if(age==21){
System.out.println("Responsibility is go for vote");
if(gender=='F'){
	System.out.println("Girl is legally marry");
	
}
else {
	
	System.out.println("boy cannot is legally marry");
}
}

System.out.println("end of showTheResponsibility");

}
}