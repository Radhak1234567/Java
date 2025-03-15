class BeerRunner{
public static void main(String[]args){
	// 3 method with 1 parameter
int quantity = 1;
Beer.open(quantity);

String name = "red";
Beer.color(name);

 float count=3f;
Beer.step(count);


// 3 method with 2 parameter

char value= 'A';
double digit=2.2;
Beer.open(value,digit);


String colorvalue= "yellow";
float number=5f;
Beer.color(colorvalue,number);

int var= 3;
char sup ='B';
Beer.color(var,sup);
// 3 method with 3 parameter

char not= 'T';
double tap= 5.5;
int na = 3;

Beer.open(not,tap,na);


String rat= "blue";
float be = 7f;
char v = 'i';

Beer.color(rat,be,v);

}
}