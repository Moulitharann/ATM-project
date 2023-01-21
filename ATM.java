import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    int pin=1234;
	    int balances=75000;
	    
	    int takeamount=0;
	    int addamount=0;
	    
	    String name;
	    
	    
		
		Scanner mt=new Scanner(System.in);
		System.out.println("Enter your pin");
		int password=mt.nextInt();
		if(password==pin)
		{
            System.out.println("Enter your Name");
            name=mt.next();
            System.out.println("Welcome to MT bank  "+name);
            while(true)
            {
		    System.out.println("\nPress 1 to check balances");
		    System.out.println("Press 2 to add amount");
		    System.out.println("Press 3 to  withdraws");
		    System.out.println("Press 4 to mini statement");
		    System.out.println("press 5 to EXIT");
		    
		    int option=mt.nextInt();
		    switch(option)
		    {
		        case 1:
		            System.out.println("Your account balaces is " +balances);
		            break;
		            
		        case 4:
		            System.out.println("welcome to MT bank "+name);
		            System.out.println("Your balances:"+balances);
		            System.out.println("your deposite:"+addamount);
		            System.out.println("Amount taken :"+takeamount);
		            break;
		            
		        case 3:
		            System.out.println("Enter your withdraws amount");
		             takeamount=mt.nextInt();
		            if(takeamount<balances)
		            {
		                 balances=balances-takeamount;
		                System.out.println("Your current balances is:"+balances);
		            }
		            else{
		                System.out.println("You dont have sufficient balances");
		            }
		            break;
		            
		      case 2:
		            addamount=mt.nextInt();
		             balances=balances+addamount;
		            System.out.println("Your amount has been added successfully");
		            System.out.println("Your balances"+balances);
		            break;
		            
		          default:
		          System.out.println("Enter the number below 5");
		          break;
		    }
		    if(option==5)
		    {
		        System.out.println("Thank You");
		    }
            }
		    
		}
		
		else
		{
		    System.out.println("You Have Entered Wrong Pin");
		}
		
	}
}