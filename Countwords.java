public class Countwords
{
public static void main(String args[])
{
String S="India is my country";
char c[]=new char[S.length()];
for(int i=0;i<c.length;i++)
{
c[i]=S.charAt(i);
}
int counter=0;
for(int i=0;i<c.length;i++)
{
if(c[i]==' ')
{
counter=counter+1;
}
}
System.out.println(counter+1);
}
}

