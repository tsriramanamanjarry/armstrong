import java.util.Scanner;
public class Arm{
public static void main(String[]args){
int a=0;
int c=0;
int r=0;
Scanner s = new Scanner(System.in);
System.out.println("Enter the number");
int n=s.nextInt();
int d=n;
while(d!=0){
c++;
d=d/10;
}
while(n!=0){
int b=1;
r=n%10;
for(int i=1;i<=c;i++){
b*=r;
}
a+=b;
n/=10;
}
System.out.println(a);
}
}
