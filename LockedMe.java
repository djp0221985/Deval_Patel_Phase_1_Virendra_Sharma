package phase1.project;

import java.io.File;
import java.util.TreeSet;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LockedMe
{
	public static void main(String[] args)
	{
		System.out.println("************************************************************");
		System.out.println("************************************************************");
        System.out.println("************************ LOCKED ME. COM ********************");
        System.out.println("******************* Developed by: Deval Patel **************");
        System.out.println("************************************************************");
        System.out.println("************************************************************\n");
        do
        {
        	System.out.println("\nPlease choose from the following options:");
        	System.out.println("(1) Display files");
        	System.out.println("(2) Other options");
        	System.out.println("(3) Exit");
        	try
        	{
        		Scanner s = new Scanner(System.in);
        		int num = s.nextInt();

        		outerSwitch(num);
        	}
        	catch(InputMismatchException ie)
        	{
        		System.out.println("Invalid input. Please try again!\n");
        	}
        }while(true);
   }
   static void innerSwitch(int selection)   {
		Scanner sc = new Scanner(System.in);
		if(selection == 4 || selection == 5 || selection == 6)
		{
			switch(selection)
			{
				case 4:
				try
				{
					System.out.println("Enter file name: ");
					String fName = sc.nextLine();
				    String fileName = fName;

					File file = new File("C:/Users/Dev Patel/Desktop/lockedMe/" + fileName);

					if(file.createNewFile())
					{
						System.out.println("New file is created.");
					}
					else
					{
						{
							System.out.println("File already exists.");
						}
					}
				}
				catch(IOException e)
				{
					System.out.println("Exception is thrown");
				}
				catch(InputMismatchException ie)
				{
					System.out.println("Invalid input!");
				}
				break;

				case 5:
					File c = new File("C://Users//Dev Patel//Desktop//LockedMe");
      				String st [];

      				st = c.list();
      				System.out.println("\nChoose from the following list of files to delete: ");
      				for(int i = 0; i < st.length; i++)
      				{
      					System.out.println(st[i]);
      				}

					String df = sc.nextLine();
				    String delFile = df;

					File file = new File("C:/Users/Dev Patel/Desktop/lockedMe/" + delFile);
					boolean b = file.delete();
					if(b == true)
					{
						System.out.println("File deleted!!");
					}
					else
					{
						System.out.println("File not found.");
					}
				break;

				case 6:
					String sch = sc.nextLine();
					String se = sch;

					File search = new File("C:/Users/Dev Patel/Desktop/LockedMe/" + se);
					boolean a = search.exists();

					if(a)
					{
						System.out.println("The file you search is: " + se);
					}
					else
					{
						System.out.println("File not found.");
					}
				break;
			}
			}
			else
			{
				System.out.println("Invalid input, please try again.");
			}

	}

	static void outerSwitch(int num)
   {
		if(num == 1 || num == 2 || num == 3)
		{
			switch(num)
			{

       			case 1:
       				File f = new File("C:/Users/Dev Patel/Desktop/LockedMe");
       				String str [];
       				str = f.list();

       				if(str.length == 0)
       				{
       					System.out.println("The directory is empty!");
       				}
       				else
       				{
       					for(int i = 0; i < str.length; i++)
           				{
           					System.out.println(str[i]);
           				}
       				}
       				break;

       			case 2:
       				System.out.println("Please choose from the following options:");
       				System.out.println("(4) Add file");
       				System.out.println("(5) Delete file");
       				System.out.println("(6) Search file\n");

       				System.out.println("Enter your selection:");

       				Scanner s = new Scanner(System.in);
       				int selection = s.nextInt();
       				innerSwitch(selection);
       				break;

       			case 3:
       				System.exit(0);
			}
		}
			else
			{
				System.out.println("Invalid input, please try again.");
			}
	}
}
