class ShowRoom{
static void getCars(String[] cars){
System.out.println("Inside getCars()");
System.out.println("car names are" +cars.length);
for(int i=0;i<cars.length;i++){
System.out.println(cars[i]);
}
}

static void getBikes(String[] bikes){
System.out.println("Inside getbikes()");
System.out.println("bike names are" +bikes.length);
for(int j=0;j<bikes.length;j++){
System.out.println(bikes[j]);
}
}
}