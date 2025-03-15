class WhiteBoardRunner{
public static void main(String[]args){
	// 3 method with 1 parameter
int quantity = 1;
WhiteBoard.open(quantity);

String name = "red";
WhiteBoard.color(name);

 float count=3f;
WhiteBoard.step(count);


// 3 method with 2 parameter

char value= 'A';
double digit=2.2;
WhiteBoard.open(value,digit);


String colorvalue= "yellow";
float number=5f;
WhiteBoard.color(colorvalue,number);

int var= 3;
char sup ='B';
WhiteBoard.color(var,sup);
// 3 method with 3 parameter

char not= 'T';
double tap= 5.5;
int na = 3;

WhiteBoard.open(not,tap,na);


String rat= "blue";
float be = 7f;
char v = 'i';

WhiteBoard.color(rat,be,v);

}
}