package org.test;

public class Deepika_01 {
public static void main(String[] args) {
	int a=122,i=0,j=0,temp;
	temp=a;
	while(a>0)
	{
		i=a%10;
		j=(j*10)+i;
		a=a/10;
	}
	System.out.println("reverse of 122 is"+j);
}
}
