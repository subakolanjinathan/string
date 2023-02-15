public class Replayalla
{
public static void main(String args[])
{
String s="India is my country";
char c[]=new char[s.length()];
for(int i=0;i<c.length;i++)
{
c[i]=s.charAt(i);
}
char a='i';
char b='@';
for(int j=0;j<c.length;j++)
{
if(c[j]==a)
{
c[j]=b;

}
}
System.out.println(c);
}
}
