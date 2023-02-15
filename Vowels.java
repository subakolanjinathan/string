public class Vowels
{
public static void main(String args[])
{
String S="India is my country";
char c[]=new char[S.length()];
for(int i=0;i<c.length;i++)
{
c[i]=S.charAt(i);
}

for(int i=0;i<c.length;i++)
{
if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')
{
System.out.println(c[i]);

}
} 

}
}
