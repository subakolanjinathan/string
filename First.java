public class First
{
public static void main(String args[])
{
String a="String is a final class in java . String can’t be a parent class or we can’t create child class for String class . All final class are read only . we can access but we can’t modify . All properties are exposed as methods so length() is also a method";
char b[]=a.toCharArray();
for(int i = 0; i < b.length; i++)
{
if((b[i]==' ') && (b[i+1]>='a'))
b[i+1]=(char)(b[i+1]-32);
System.out.print(b[i]);
}
}
}
