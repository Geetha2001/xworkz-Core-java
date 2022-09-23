class Swiggy{
	
	public static double takeOrder(String item){
	
	if (item=="pizza"){
		System.out.println("Your order is ready with "+item);
	return 99.00;	
	}
	if (item=="Burger"){
		System.out.println("Your order is ready with "+item);
	return 59.00;	
	}
	if (item=="South Indian"){
		System.out.println("Your order is ready with "+item);
	return 59.00;	
	}
	if (item=="Mosaranna"){
		System.out.println("Your order is ready with "+item);
	return 25.00;	
	}
	if (item=="Sandwitch"){
		System.out.println("Your order is ready with "+item);
	return 99.00;	
	}
	if (item=="French Fries"){
		System.out.println("Your order is ready with "+item);
	return 39.00;	
	}
	if (item=="Pastries"){
		System.out.println("Your order is ready with "+item);
	return 49.00;	
	}
	
	
	return 0.00;
}


public static double takeOrder(String item,double quantity){
		
	if (item=="pizza"){
		System.out.println("Your order is ready with "+item);
	return (99.00*quantity);	
	}
	if (item=="Burger"){
		System.out.println("Your order is ready with "+item);
	return (59.00*quantity);	
	}
	if (item=="South Indian"){
		System.out.println("Your order is ready with "+item);
	return (59.00*quantity);	
	}
	if (item=="Mosaranna"){
		System.out.println("Your order is ready with "+item);
	return (25.00*quantity);	
	}
	if (item=="Sandwitch"){
		System.out.println("Your order is ready with "+item);
	return (99.00*quantity);	
	}
	if (item=="French Fries"){
		System.out.println("Your order is ready with "+item);
	return (39.00*quantity);	
	}
	if (item=="Pastries"){
		System.out.println("Your order is ready with "+item);
	return (49.00*quantity);	
	}
	return 0.00;
	}
}


      //orther statements
	  //return;
	  //other statment -- not possibile
	  // void hakidre retutn; bekilla
	  //String hakidre mathra return type; hakbeka