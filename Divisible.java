import java.io.* ;
public class Divisible {
public static void main(String args []) throws IOException {

BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));

System.out.print("Enter the number : !!");
 int a = Integer.parseInt(br.readLine());

if(a % 5 == 0 && a % 7 == 0)
{
   System.out.println("is Divisible by 5 and 7 !!");
}
else if(a % 5 == 0)
{
	System.out.println(" is Divisible by 5 only !!");
}
else if(a % 7 == 0)
{
	System.out.println(" is Divisible by 7 only !!");
}
else
{
	System.out.println(" is not Divisible by 5 or 7 !!");
}
}
}