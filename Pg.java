class Pg{

static String name;
static String type;
static String address;
static int price;

static void setName(String pgName){
name=pgName;
}
static String getName(){
return name;
}

static void setType(String pType){
type=pType;
}
static String getType(){
return type;
}

static void setAddress(String add){
address=add;
}
static String getAddress(){
return address;
}

static void setPrice(int amt){
price=amt;
}
static int getPrice(){
return price;
}
}
