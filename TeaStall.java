class TeaStall{
	
	static int teaStallId;
	static String name;
	static String address;
	static long contactNumber;
	
	//setter and getter
	
	static void setTeaStallId(int id){
		teaStallId=id;
		}
	static int getTeaStallId(){
		return teaStallId;
		}
		
	static void setName(String teaStallName){
		name=teaStallName;
		}
	static String getName(){
		return name;
		}
	
	static void setAddress(String add){
		address=add;
		}
	static String getAddress(){
		return address;
		}
		
	static void setContactNumber(long contactNo ){
		contactNumber=contactNo;
		}
	static long getContactNumber(){
		return contactNumber;
		}
		
}