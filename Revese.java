public class Revese
{
public static void main(String args[])
{
String s="subashini";
char c[]=new char[s.length()];
for(int i=0;i<c.length;i++)
{
c[i]=s.charAt(i);
}
for(int i=c.length-1; i>=0;i--)
{
System.out.println(c[i]);
}

}
}
