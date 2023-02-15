public class Anagram
{
static String sort(char a[])
{
for(int i=0;i<a.length;i++)
{
for(int j=i+1;j<a.length;j++)
{
if(a[i]>a[j])
{
char temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
String s=String.valueOf(a);
return s;
}
public static void main(String args[])
{
String a="bear";
String b="bare";
char x[]=a.toCharArray();
char y[]=b.toCharArray();
String c=sort(x);
String d=sort(y);
if(c.equals(d))
{
System.out.println("Given string is an Anagram");
}
else
{
System.out.println("Given string is non an Anagram");
}
}
}
