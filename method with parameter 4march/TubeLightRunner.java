class TubeLightRunner{
public static void main(String[]args){
	// 3 method with 1 parameter
int quantity = 1;
TubeLight.open(quantity);

String name = "red";
TubeLight.color(name);

 float count=3f;
TubeLight.step(count);


// 3 method with 2 parameter

char value= 'A';
double digit=2.2;
TubeLight.open(value,digit);


String colorvalue= "yellow";
float number=5f;
TubeLight.color(colorvalue,number);

int var= 3;
char sup ='B';
TubeLight.color(var,sup);
// 3 method with 3 parameter

char not= 'T';
double tap= 5.5;
int na = 3;

TubeLight.open(not,tap,na);


String rat= "blue";
float be = 7f;
char v = 'i';
TubeLight.color(rat,be,v);

}
}