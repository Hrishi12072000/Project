import java.util.Scanner;

public class MiniFoodOrderingProgram 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int choice,ch1=0,ch2=0,ch3=0,Your_bill;
		char ans;
		Scanner sc=new Scanner(System.in);
		System.out.println("\t\t----\tYadavji Food Corner\t----\t\t");
		do
		{
			System.out.println("Please enter our menu \n 1:Starters\n 2:Main Course\n 3:Desert");
			choice=sc.nextInt(); 
			switch(choice)
			{
			case 1: 
					System.out.println("Starters Items");
					System.out.println("1:Spring Rolls ");
					System.out.println("2:French Onion Soup");
					System.out.println("3:Tomato Soup");
					System.out.println("4:Caesar Salad");
					ch1=sc.nextInt();
				break; 
			case 2:
				System.out.println("Main Course Items");
				System.out.println("1:Citrus scallops with pea puree");
				System.out.println("2:Crunchwrap supreme");
				System.out.println("3:Mozarella Stuffed Flounder");
				System.out.println("4:Spinach Stuffed Flounder ");
				ch2=sc.nextInt();
				break;
			case 3:
				System.out.println(" Desert Items");
				System.out.println("1:Spring Resort");
				System.out.println("2:Peanut butter");
				System.out.println("3:Chocolate torte");
				System.out.println("4:Butler's Gelato");
				ch3=sc.nextInt();
				break;
			default:
				System.out.println("Invalid Item");
				break;

			}
			System.out.println("Do you want to add another Item Yes/No");
			ans=sc.next().charAt(0);
			

		}
		while(ans=='y'||ans=='Y');
		System.out.println("Thanks For coming");
		//Your_bill=ch1+ch2+ch3;
		//System.out.println("your order is"+Your_bill);

	}

}
