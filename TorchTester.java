class TorchTester{
public static void main(String torch[]){
Torch.name="BATTERY";
Torch.type="ELECTRONIC DEVICE";
Torch.price=150.00;
Torch.warranty="1 years";

System.out.println("MAIN METHOD STARTED");
System.out.println("BRAND NAME IS " +Torch.name);
System.out.println("AC TYPE IS  " +Torch.type);
System.out.println("AC PRICE IS " +Torch.price);
System.out.println("WARRANTY IS " +Torch.warranty);
Torch.onOrOff();
Torch.increaseRange();
Torch.increaseRange();
Torch.increaseRange();
Torch.increaseRange();
Torch.decreaseRange();
Torch.decreaseRange();
Torch.decreaseRange();
Torch.decreaseRange();
Torch.decreaseRange();
System.out.println("MAIN METHOD ENDED");

}
}