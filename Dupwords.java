public class Dupwords
{
public static void main(String args[])
{
String name[]={"Raj","Ram","Azar","Ram","Tej"};
count=0;
for(int i=0;i<name.length;i++)
{
for(int j=i+1;j<name.length;j++)
{
if(name[i].compareTo(name[j])>0)
{
if(name[i].equals(name[j]))
Count++;
name[j]="0";
{
if(Count>1&&name[i]!="0")

System.out.println(name[i]);
}
}
}
}
}
}


