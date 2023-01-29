package fstrain;
import java.util.*;

class Numbers 
{  
static void conversion(char num[])  
{   
int len = num.length;  
String[] single = new String[] {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};  
String[] doubles = new String[] {"", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};  
String[] tens = new String[] {"",  "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};  
String[] ht = new String[] {"Hundred", "Thousand"};  
System.out.print(String.valueOf(num) + " = ");  
if (len == 1)   
{  
System.out.println(single[num[0] - '0']);  
return;  
}  
int x = 0;  
while (x < num.length)   
{  
if (len >= 3)   
{  
if (num[x] - '0' != 0)   
{  
System.out.print(single[num[x] - '0'] + " ");  
System.out.print(ht[len - 3]+ " ");  
}   
--len;  
}  
else   
{     
if (num[x] - '0' == 1)   
{  
int val = num[x] - '0' + num[x + 1] - '0';  
System.out.println(doubles[val]);  
return;  
}  
else if (num[x] - '0' == 2 && num[x + 1] - '0' == 0)   
{  
System.out.println("Twenty");  
return;  
}  
else   
{  
int i = (num[x] - '0');  
if (i > 0)  
System.out.print(tens[i]+ "-");  
else  
System.out.print("");  
++x;  
if (num[x] - '0' != 0)  
System.out.println(single[num[x] - '0']);  
}  
}  
++x;  
}  
}  
public static void main(String args[])  
{  
	Scanner sc = new Scanner(System.in);
	char[] a = sc.next().toCharArray();
	conversion(a);
}  
}  