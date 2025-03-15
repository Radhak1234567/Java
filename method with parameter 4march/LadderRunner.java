class LadderRunner{
public static void main(String[]args){
	// 3 method with 1 parameter
int quantity = 1;
Ladder.open(quantity);

String name = "red";
Ladder.color(name);

 float count=3f;
Ladder.step(count);


// 3 method with 2 parameter

char value= 'A';
double digit=2.2;
Ladder.open(value,digit);


String colorvalue= "yellow";
float number=5f;
Ladder.color(colorvalue,number);

int var= 3;
char sup ='B';
Ladder.color(var,sup);
// 3 method with 3 parameter

char not= 'T';
double tap= 5.5;
int na = 3;

Ladder.open(not,tap,na);


String rat= "blue";
float be = 7f;
char v = 'i';

Ladder.color(rat,be,v);

}
}