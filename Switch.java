import java.io.* ;
public class Switch 
{
	public static void main(String args[]) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		System.out.print("Enter the First Number : ");
		double a = Double.parseDouble(br.readLine());
     
        System.out.print("Enter the Second Number : ");
		double b = Double.parseDouble(br.readLine());

		System.out.print("Enter the Third Number : ");
		double c = Double.parseDouble(br.readLine());

        System.out.println("                 MENU              ");
		System.out.println("Press 1 for Area of Circle      ");
		System.out.println("Press 2 for Area of Rectangle    ");
		System.out.println("Press 3 Area of Square \n ");
        
        System.out.print("What is Your Choice :");
		int choice = Integer.parseInt(br.readLine());
        
        switch(choice)
		{
			case 1:
					double circle = Math.PI * a * a;
					System.out.println("Circle = "+ circle);
					break;
			case 2:
					double rectangle = a * b;
					System.out.println("Rectangle = "+ rectangle);
					break;

			case 3:
					double square =  c * c;
					System.out.println("Square = "+ square);
					break;

              default :
					System.out.println("You have Selected Invalid Choice !!!");
		}


    		} 


}