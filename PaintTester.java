class PaintTester{

 public static void main(String a[]){
   //Intialization through 
   Paint.setPaintId(123);
   Paint.setBrandName("Asian Paints");
   Paint.setColor("Pink");
   
   System.out.println(Paint.getPaintId()); 
   System.out.println(Paint.getBrandName());
   System.out.println(Paint.getColor());
 }

}