class Crecket{
public static void main(String creaket[]){

int rohithHighestScore=264;
int sachinHighestScore=200;
int viratHighestScore=135;
int mandanaHighestScore=232;
int doniHighestScore=229;

int higestScores[]={rohithHighestScore,sachinHighestScore,viratHighestScore,mandanaHighestScore,doniHighestScore};

int ref0=higestScores[0];
int ref1=higestScores[1];
int ref2=higestScores[2];
int ref3=higestScores[3];
int ref4=higestScores[4];

System.out.println("ELEMENTS OF INDEX 0 :" +ref0);
System.out.println("ELEMENTS OF INDEX 1 :" +ref1);
System.out.println("ELEMENTS OF INDEX 2 :" +ref2);
System.out.println("ELEMENTS OF INDEX 3 :" +ref3);
System.out.println("ELEMENTS OF INDEX 4 :" +ref4);

for(int index=0;index<higestScores.length;index++){
	int ref=higestScores[index];
	System.out.println("ENTER AT INDEX "+index+" ref");
	System.out.println(higestScores[index]);
}

}

}