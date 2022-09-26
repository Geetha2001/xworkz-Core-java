class TeaStallTester{
	public static void main(String a[]){
	
	TeaStall.setTeaStallId(5678);
	TeaStall.setName("Spandana Tea stall");
	TeaStall.setAddress("Malleshwaram");
	TeaStall.setContactNumber(6565775676L);

	
	//System.out.println(TeaStall.getTeaStallId());
	//System.out.println(TeaStall.getName());
	//System.out.println(TeaStall.getAddress());
	//System.out.println(TeaStall.getContactNumber());
	
	System.out.println(TeaStall.getTeaStallId() +" \n"+ TeaStall.getName() +" \n"+
						TeaStall.getAddress() +" \n"+ TeaStall.getContactNumber());

	}
}