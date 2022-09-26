class Ecommerce{

static int pricingId;
static String sku;
static int price;
static String currency;
static String startDate;
static String endDate;

static void setPriceId(int pId){
pricingId=pId;
}
static int getPriceId(){
return pricingId;
}

static void setSku(String skuData){
sku=skuData;
}
static String getSku(){

return sku;
}

static void setPrice(int amt){
price=amt;
}
static int getPrice(){
return price;
}

static void setCurrency(String currencyType){
currency=currencyType;
}
static String getCurrency(){
return currency;
}

static void setStartDate(String startDt){
startDate=startDt;
}
static String getStartDate(){
return startDate;
}

static void setEndDate(String endDt) {
endDate=endDt;
}
static String getEndDate(){
return endDate;
}
}