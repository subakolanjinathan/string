public class Lower
{
public static void main(String args[])
{
String s="SUBASHINI";
char c[]=s.toCharArray();
for(int i=0; i<c.length; i++)
{
if(c[i]>='A' && c[i]<='Z')
c[i]=(char)((int)c[i]+32);
}
for(int i=0; i<c.length; i++)
{
System.out.println(c[i]);
}
}
}
