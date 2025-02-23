class Swapping{

public static void main(String args[]){

int x=10;
int y=20;


System.out.println("value before swapping");
System.out.println("value of x :" +x);
System.out.println("value of y :" +y);

x=x+y;
y=x-y;
x=x-y;

System.out.println("value after swapping");
System.out.println("value of x :" +x);
System.out.println("value of y :" +y);



}
}
