class ResortRunner{
public static void main(String[]args)
{
System.out.println("running mobileno");
String name;
int mobileno =101;
name=Resort.name(mobileno);
System.out.println("Name: " +  name  +  "mobileno: "  +   mobileno);

System.out.println("===========================================");



System.out.println("running company");
String ownername;
String companyname ="dell";
name=Resort.ownername(companyname);
System.out.println("Name: " +  name  +  "companyname: "  +   companyname);


System.out.println("===========================================");

System.out.println("food available");
String foodItem ="biryani";
int price;
price=Resort.price(foodItem);
System.out.println("price: " +  price  +  "foodItem: "  +   foodItem);


System.out.println("===========================================");

System.out.println("account balance");
int balance;
int accountnumber=1;
balance=Resort.balance(accountnumber);
System.out.println("balance: " +  balance  +  "accountnumber: "  +   accountnumber);

System.out.println("===========================================");

System.out.println("source");
String source ="Articles";
int value;
value=Resort.value(source);
System.out.println("value: " +  value  +  "source: "  +   source);



System.out.println("===========================================");

System.out.println("alive");
String naame="sonika";
int alive;
alive=Resort.alive(naame);
System.out.println("alive: " +  alive +  "naame: "  +   naame);}}
