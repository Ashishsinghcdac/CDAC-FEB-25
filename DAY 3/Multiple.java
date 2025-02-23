import java.util.*;

class Multiple{

public static void main(String[]args){
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
 n=sc.nextInt();

for(int i=1;i<=100;i++){
if(i%n==0){
System.out.println(i);

}
}
}
}