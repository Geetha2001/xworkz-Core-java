class Resturant{

 static void getFoodMenu(String[] foodMenu){
 System.out.println("inside the getFoodMenu()");
 System.out.println("Food Menu size is " + foodMenu.length);
 for(int i=0;i<foodMenu.length;i++){
   System.out.println(foodMenu[i]);
 }
 System.out.println("End of the getFoodMenu()");
 }


}