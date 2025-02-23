import java.util.*;

class Natural{

public static void main(String args[]){
int n,sum=0;
Scanner sc=new Scanner(System.in);

System.out.println("Enter number of term");

 n=sc.nextInt();

for(int i=1;i<=n;i++){

sum=sum+i;
}
System.out.println(sum);


}
}

