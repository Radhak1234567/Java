class FoodItemRunner{
public static void main(String[]args){
	// 3 method with 1 parameter
int quantity = 1;
FoodItem.open(quantity);

String name = "red";
FoodItem.color(name);

 float count=3f;
FoodItem.step(count);


// 3 method with 2 parameter

char value= 'A';
double digit=2.2;
FoodItem.open(value,digit);


String colorvalue= "yellow";
float number=5f;
FoodItem.color(colorvalue,number);

int var= 3;
char sup ='B';
FoodItem.color(var,sup);
// 3 method with 3 parameter

char not= 'T';
double tap= 5.5;
int na = 3;

FoodItem.open(not,tap,na);


String rat= "blue";
float be = 7f;
char v = 'i';

FoodItem.color(rat,be,v);

}
}