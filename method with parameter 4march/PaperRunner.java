class PaperRunner{
public static void main(String[]args){
	// 3 method with 1 parameter
int quantity = 1;
Paper.open(quantity);

String name = "red";
Paper.color(name);

 float count=3f;
Paper.step(count);


// 3 method with 2 parameter

char value= 'A';
double digit=2.2;
Paper.open(value,digit);


String colorvalue= "yellow";
float number=5f;
Paper.color(colorvalue,number);

int var= 3;
char sup ='B';
Paper.color(var,sup);
// 3 method with 3 parameter

char not= 'T';
double tap= 5.5;
int na = 3;

Paper.open(not,tap,na);


String rat= "blue";
float be = 7f;
char v = 'i';

Paper.color(rat,be,v);

}
}