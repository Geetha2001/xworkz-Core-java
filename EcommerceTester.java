class EcommerceTester{
public static void main(String a[]){

Ecommerce.setPriceId(132);
Ecommerce.setSku("A183_UK");
Ecommerce.setPrice(140);
Ecommerce.setCurrency("pounds");
Ecommerce.setStartDate("12-12-2010");
Ecommerce.setEndDate("12-12-2025");


System.out.println(Ecommerce.getPriceId());
System.out.println(Ecommerce.getSku());
System.out.println(Ecommerce.getPrice());
System.out.println(Ecommerce.getCurrency());
System.out.println(Ecommerce.getStartDate());
System.out.println(Ecommerce.getEndDate());
}
}