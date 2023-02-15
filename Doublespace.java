public class Doublespace
{
public static void main(String agrs[])
{
String s="I  am  learning java";
char c[]=s.toCharArray();
String x="";
for(int i=0;i<c.length; i++)
{
if(c[i]==' ' && c[i+1]==' ')
{
x=x+"";
}
else
{
x=x+c[i];
}
}
x=x+c[c.length-1];
System.out.println(x);
}
}
