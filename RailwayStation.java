class RailwayStation{

static String stationName;
static int tiketPrice;
static int platformNo;
static String trainName;

static void setStationName(String sName){
stationName=sName;
}
static String getStationName(){
return stationName;
}

static void setTiketPrice(int tiketamt){
tiketPrice=tiketamt;
}
static int getTiketPrice(){
return tiketPrice;
}

static void setPlatformNo(int pNo){
platformNo=pNo;
}
static int getPlatformNo(){
return platformNo;
}

static void setTrainName(String trainNm){
trainName=trainNm;
}
static String getTrainName(){
return trainName;
}
}
