public class Upper 
{
public static void main(String args[])
{
String s="subashini";
char c[]=s.toCharArray();
for(int i=0; i<c.length; i++)
{
if(c[i]>='a' && c[i]<='z')
c[i]=(char)((int)c[i]-32);
}
for(int i=0; i<c.length; i++)
{
System.out.println(c[i]);
}
}
}
