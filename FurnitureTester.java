class FurnitureTester{
public static void main(String a[]){

Furniture.setCompanyName("Brink");
Furniture.setName("Sofa");
Furniture.setPrice(6000);
Furniture.setColour("pink");
Furniture.setWarranty("10 years");

System.out.println(Furniture.getCompanyName());
System.out.println(Furniture.getName());
System.out.println(Furniture.getPrice());
System.out.println(Furniture.getColour());
System.out.println(Furniture.getWarranty());

}
}