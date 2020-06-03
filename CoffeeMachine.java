
import java.util.*;
public class CoffeeMachine {
        public static int water=400;
        public static int milk=540;
        public static int coffee=120;
        public static int cups=9;
        public static int money=550;   
    
    public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	 while(true)
        {
            System.out.println("Write action (buy, fill, take,remaining,exit): ");
            String action=sc.nextLine();

            if(action.equals("buy"))
            {
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:,back-to main menu");
                String choice=sc.nextLine();
                 
                if(choice.equals("1"))
                {
                    if(water>=250 && coffee>=16 )
                    {
                        System.out.println("I have enough resources, making you a coffee!");
                        water=water-250;
                        coffee=coffee-16;
                        money=money+4;
                         cups--;
                    }
                    else
                    {
                         System.out.println("it can't make a cup of coffee.");
                    }
                }
			
			 else if(choice.equals("2"))
                {
                    if(water>=350 && milk>=75 && coffee>=20)
                    {
                        System.out.println("I have enough resources, making you a coffee!");

                        water=water-350;
                        milk=milk-75;
                        coffee=coffee-20;
                        money=money+7;
                         cups--;
                    }
                    else
                    {
                        System.out.println("it can't make a cup of coffee.");

                    }
                }
				
			                else if(choice.equals("3"))
                {
                    if(water>200 && milk>=100 && coffee>=12)
                    {
                        System.out.println("I have enough resources, making you a coffee!");
                        water=water-200;
                        milk=milk-100;
                        coffee=coffee-12;
                        money=money+6;
                         cups--;
                    }
                    else
                    {
                        System.out.println("it can't make a cup of coffee.");

                    }
                }
                else
                {
                    continue;
                }
                
                 

            }
			
			            else if(action.equals("fill"))
            {
                System.out.println("Write how many ml of water do you want to add: ");
                int wateradded=sc.nextInt();
                System.out.println("Write how many ml of milk do you want to add: ");
                int milkadded=sc.nextInt();
                System.out.println("Write how many grams of coffee beans do you want to add:"); 
                int coffeeadded=sc.nextInt();
                System.out.println("Write how many disposable cups of coffee do you want to add:"); 
                int cupsadded=sc.nextInt();
            
                water=water+wateradded;
                milk=milk+milkadded;
                coffee=coffee+coffeeadded;
                cups=cups+cupsadded;
            
                  

        }
        else if(action.equals("take"))
        {
                System.out.println("I gave you $"+money);
                money=0;
                 
        }
		
		  else if(action.equals("remaining"))
        {
            coffeeState();
        }
        else if(action.equals("exit"))
        {
            break;
        }
        
        
        
    }
    }
         
       public static void coffeeState()
         {
            System.out.println("The coffee machine has:");
            
             System.out.println(water+" of water");

             System.out.println(milk+" of milk");

             System.out.println(coffee+" of coffee beans");

             System.out.println(cups+" of disposable cups");

             System.out.println(money+" of money");
         }
}