class CollegeTester{
public static void main(String a[]){


//It is default constructor
College f1=new College();
f1.collegeNames="GEC";
f1.branches="CSE";
f1.address="Chamarajanagar";

College f2=new College();
f2.collegeNames="Govt Politechnic";
f2.branches="Civil";
f2.address="Kollegal";

College f3=new College();
f3.collegeNames="GEC";
f3.branches="Mech";
f3.address="Mysore";

College f4=new College();
f4.collegeNames="MIT";
f4.branches="IS";
f4.address="Mysore";


College f5=new College();
f5.collegeNames="ATME";
f5.branches="ECE";
f5.address="Banglore";


System.out.println(f1.collegeNames +"  "+ f1. branches +" "+ f1.address);
System.out.println(f2.collegeNames +"  "+ f2. branches +" "+ f2.address);
System.out.println(f3.collegeNames +"  "+ f3. branches +" "+ f3.address);
System.out.println(f4.collegeNames +"  "+ f4. branches +" "+ f4.address);
System.out.println(f5.collegeNames +"  "+ f5. branches +" "+ f5.address);
}

}