public class Sortstring
{
public static void main(String args[])
{
String name[]={"Raj","Sam","Azar","Ram","Tej"};
for(int i=0;i<name.length;i++)
{
for(int j=i+1;j<name.length;j++)
{
if(name[i].compareTo(name[j])>0)
{
String temp=name[i];
name[i]=name[j];
name[j]=temp;
}
}
}
for(String s:name)
{
System.out.println(s);
}
}
}

