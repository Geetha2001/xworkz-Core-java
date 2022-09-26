class ToysTester{
public static void main(String a[]){

Toys.setCompanyName("Brink");
Toys.setToyName("Barby");
Toys.setPrice(600);
Toys.setColour("pink");
Toys.setWarranty("2 years");

System.out.println(Toys.getCompanyName());
System.out.println(Toys.getToyName());
System.out.println(Toys.getPrice());
System.out.println(Toys.getColour());
System.out.println(Toys.getWarranty());

}
}