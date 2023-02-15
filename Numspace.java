public class Numspace
{
public static void main(String args[])
{
String s="Narayanaswamy resigned as chief minister from pondicherry";
int count=0;
char a[]=new char[s.length()];
for(int i=0;i<s.length();i++)
{
a[i]=s.charAt(i);
}
for(int i=0;i<s.length();i++)
{
if(a[i]==' ') 
{
count=count+1;
}
}
System.out.println(count);
}
}
