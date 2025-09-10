// Fouad Kadry - Easter

import java.util.*;
public class Easter{
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
int y=scanner.nextInt();

int a=y%19;
int b=y/100;
int c=y%100;
int d=b/4;
int e=b%4;
int f=(b+8)/25;
int g=(b-f+1)/3;
int h=(19*a+b-d-g+15)/30;
int i=c/4;
int k=c%4;
int r = 31 + (2*e)+(2*i)-h-k;
int m = (a+(11*h)+(22*r))/451;
int n = (h+r-(7*m)+114)/32;
int p = (h+r-(7*m)+114)%32;
int q = p+1; 
System.out.println("a="+a);
System.out.println("b="+b);
System.out.println("c="+c);
System.out.println("d="+d);
System.out.println("e="+e);
System.out.println("f="+f);
System.out.println("g="+g);
System.out.println("h="+h);
System.out.println("i="+i);
System.out.println("k="+k);
System.out.println("r="+r);
System.out.println("m="+m);
System.out.println("n="+n);
System.out.println("p="+p);

System.out.println("Therefore in " + y + ", Easter fell on " + n "\" + p+1 + ". [Month = n =" + n + " & day = p+1 = " + p + "]");
}
}