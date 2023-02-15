public class Pali
{
public static void main(String args[])
{
String orignal="malayalam";
String revers="";
for(int i=orignal.length()-1;i>=0;i--)
{
revers=revers+orignal.charAt(i);
}
if(orignal.equals(revers))
{
System.out.println("Palindrome");
}
else
{
System.out.println("not a palindrome");
}
}
}
