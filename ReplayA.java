public class ReplayA
{
public static void main(String args[])
{
String s="Narayanaswamy resigned as chief minister from pondicherry";
char a[]=new char[s.length()];
for(int i=0;i<s.length();i++)
{
a[i]=s.charAt(i);
}
for(int i=0;i<s.length();i++)
{
if(a[i]=='a')
{
a[i]='A';
}
}
System.out.println(a);
}
}
