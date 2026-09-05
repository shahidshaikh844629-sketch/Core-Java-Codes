import java.io.* ;
public class Switcha
{
	public static void main(String args[]) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		 System.out.println("                 MENU              ");
		System.out.println("Press 1 for Area of Circle      ");
		System.out.println("Press 2 for Area of Rectangle    ");
		System.out.println("Press 3 Area of Square \n ");


		System.out.print("What is Your Choice :");
		int choice = Integer.parseInt(br.readLine());
        
        switch(choice)
		{
			case 1:
				System.out.print("Enter the Radius : ");
		double radius = Double.parseDouble(br.readLine());
					double circle = Math.PI * radius * radius;
					System.out.println("Circle = "+ circle);
					break;
			case 2:
				System.out.print("Enter the Length: ");
		double length = Double.parseDouble(br.readLine());

			System.out.print("Enter the Breadth: ");
		double breadth = Double.parseDouble(br.readLine());

					double rectangle =  length * breadth ;
					System.out.println("Rectangle = "+ rectangle);
					break;

			case 3:
				System.out.print("Enter the Side : ");
		double side = Double.parseDouble(br.readLine());
					double square =  side * side;
					System.out.println("Square = "+ square);
					break;

              default :
					System.out.println("You have Selected Invalid Choice !!!");
		}


    		} 


}