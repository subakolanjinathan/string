public class Totalword
{
public static void main(String args[])
{
String S="Narayanaswamy resigned as chief minister from pondicherry";
int count=0;
char c[]=new char[S.length()];
for(int i=0;i<c.length;i++)
{
c[i]=S.charAt(i);
}
for(int i=0;i<c.length;i++)
{
if(c[i]==' ')
{
count=count+1;
}
}
System.out.println(count+1);

}

}
