class VivantaTajHotel{
 public static void main(String args[]){
	String type="5 star hotel";
	String address="MG ROAD, BANGLORE";
	String[] managerNames={"Geetha","Spandana","Hema","Shalini"};
	int noOfManagers=4;
	int noOfFoods=16;
 
	String foodMenu[]={"Masala Dosa","palav","paneer gravy","pizza","burgur",
	"frenchfries","Ghee rice","gobi manchurian","roti","icecreams",
	"juice","Noodles","vegitable curry","potato curry","curd rice","butter dosa"};
	System.out.println("WELCOME TO VIVANTHA TAJ HOTEL");
	System.out.println("WHICH STAR HOTEL IS THIS" +type);
	System.out.println("HOTEL ADDRESS IS" +address);
	System.out.println("Hotel managers names are");
 
	for(int i=0;i<managerNames.length;i++){
	System.out.println(managerNames[i]);
		} 
	System.out.println("Foods menus in hotel are");
	for(int j=0;j<foodMenu.length;j++){
	System.out.println(foodMenu[j]);
	}
  }
}