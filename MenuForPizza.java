package pizzaHut;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MenuForPizza {

	public static void main(String[] args)throws IOException {
		// Initial method
		
		System.out.println("WELCOME TO PIZZA HUT!!!!!!!!");
		System.out.println();
		System.out.println();
		System.out.println("NEW DEAL OF THE DAY: BUY 1 AND GET 1 FREE!!!");
		System.out.println("*t&c apply");
		System.out.println();
		System.out.println();
		System.out.println("Please enter your details below");
		System.out.println();
		System.out.println();
		System.out.println("Press y : yes, n : no ");
		// Initializing Varibles
		
		int x, d = 1, f, g, b, e = 1, i, j, v, total, h = 1, bill, token = 150619;
	    double no;
		int r[]=new int[10];
		int k[]=new int[10];
		int o[]=new int[10];
		int p[]=new int[10];
		int w[]=new int[10];
		int n[]=new int[10];
		
		// Start taking Inputs from user
		Scanner sc=new Scanner(System.in);
		String u=new String();
		
		String a=new String("y");
		String q=new String("n");
		do
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String name=new String();
			String address=new String();
			System.out.print("Please enter your FULL NAME: ");	
			name=br.readLine();
			System.out.println();
			System.out.print("Please enter your FULL ADDRESS: ");
			address=br.readLine();
			System.out.println();
			System.out.print("Please enter your CONTACT NUMBER: ");
			no=sc.nextDouble();
			System.out.println();
			token=token+1546;
			bill=0;
			total=0;
			i=1;
			j=1;
			v=1;
			
		while(i>0)
			{
				r[i]=0;
				k[i]=0;
				i--;
			}
		while(j>0)
			{
				o[j]=0;
				p[j]=0;
				j--;
			}
		while(v>0)
			{
				w[v]=0;
				n[v]=0;
				v--;
			}
		i=1;
		j=1;
		v=1;
		while(h!=0)
		{
			System.out.print("1: Veg pizza's"+"\t");
			System.out.print("2: NonVeg pizza's"+"\t");
			System.out.println("3: Sides & More");
			x=sc.nextInt();
			System.out.println("Do You Want to Proceed");
			u=sc.next();
			b=q.compareToIgnoreCase(u);
			if(b != 0)
			{
				switch(x)
				{
				case 1:
					System.out.println("Select a pizza");
					System.out.println();
					System.out.println("1: Margherita ");
					System.out.println("(Classic Cheese)");
					System.out.println();
					System.out.println("2: Double Cheese ");
					System.out.println("(Extra Cheese On Cheese)");
					System.out.println();
					System.out.println("3: Veggie Feast ");
					System.out.println("(Capsicum,Onion,Sweet Corn)");
					System.out.println();
					System.out.println("4: Rawalpindi Channa ");
					System.out.println("(Chole,Onion,Green Capsicum,Tomato In Tandoori Sauce)");
					System.out.println();
					System.out.println("5: Tandoori Paneer ");
					System.out.println("(Paneer,Onion,Capsicum,Red Paprika,Tomato In Tandoori Sauce)");
					System.out.println();
					System.out.println("6: Veggie Lover ");
					System.out.println("(Onion,Capsicum,Mushroom,Tomato,Red Paprika)");
					System.out.println();
					System.out.println("7: Country Feast ");
					System.out.println("(Onion,Capsicum,Mushroom,Sweet Corn,Tomato)");
					System.out.println();
					System.out.println("8: Veggie Supreme ");
					System.out.println("(Onion,Capsicum,Mushroom,Red Paprika,Black Olives,Sweet Corn)");
					System.out.println();
					System.out.println("9: Paneer Vegorma[NEW]");
					System.out.println("(Paneer,Onion,Capsicum,Black Olives,Red Paprika)");
					System.out.println();
					System.out.println("10:Exotica ");
					System.out.println("(Red Capsicum,Green Capsicum,Baby Corn,Black Olives,Jalapeno)");
					System.out.println();
					d=sc.nextInt();
					if(d>0&&d<11)
					{
					r[i]=d;
					System.out.println("Do you want to proceed");
					u=sc.next();
					b=q.compareToIgnoreCase(u);
					if(b!=0)
					{
						switch(d)
						{
							case 1:
							System.out.println("1: Personal = Rs.100");
							System.out.println("2: Medium = Rs.245");
							break;
							case 2:
							System.out.println("1: Personal = Rs.100");
							System.out.println("2: Medium = Rs.245");
							break;
							case 3:
							System.out.println("1: Personal = Rs.100");
							System.out.println("2: Medium = Rs.245");
							break;
							case 4:
							System.out.println("1: Personal = Rs.170");
							System.out.println("2: Medium = Rs.340");
							break;
							case 5:
							System.out.println("1: Personal = Rs.170");
							System.out.println("2: Medium = Rs.340");
							break;
							case 6:
							System.out.println("1: Personal = Rs.230");
							System.out.println("2: Medium = Rs.425");
							break;
							case 7:
							System.out.println("1: Personal = Rs.230");
							System.out.println("2: Medium = Rs.425");
							break;
							case 8:
							System.out.println("1: Personal = Rs.230");
							System.out.println("2: Medium = Rs.425");
							break;
							case 9:
							System.out.println("1: Personal = Rs.265");
							System.out.println("2: Medium = Rs.480");
							break;
							case 10:
							System.out.println("1: Personal = Rs.265");
							System.out.println("2: Medium = Rs.480");	
							default:
							System.out.println("enter a number from 1 to 10");
						}
					f = sc.nextInt();
					if(f>0&&f<3)
					{
						k[i]=f;
						if(d==1||d==2||d==3)
						{
							if(f==1)
							bill=100;
							else
							bill=245;
						}
						else if(d==4||d==5)
						{
							if(f==1)
							bill=170;
							else
							bill=340;
						}
						else if(d==6||d==7||d==8)
						{
						   if(f==1)
						   bill=230;
						   else
						   bill=425;	   
						}
						else if(d==9||d==10)
						{
							if(f==1)
							bill=265;
							else
							bill=480;
						}
						total=total+bill;
						i++;
					}    
					if(f<1||f>2)
					{
						System.out.println("Enter either 1 or 2!");
					}
               }
		   }
				if(d<1||d>10)
				{
				System.out.println("enter a number from 1 to 10!");
				}
			break;
			case 2:
				System.out.println("Select a pizza");
				System.out.println();
				System.out.println("1: Chicken Sausage ");
				System.out.println("(Chicken Sausage & Onion)");
				System.out.println();
				System.out.println("2: Chicken 'N' Spicy ");
				System.out.println("(Chicken Hot & Chilly,Capsicum,Mushroom)");
				System.out.println();
				System.out.println("3:Keema Masala ");
				System.out.println("(Chicken Keema,Onion,Capsicum in a Tandoori Sauce)");
				System.out.println();
				System.out.println("4: Chicken Pepperoni ");
				System.out.println("(Chicken Pepperoni & Cheese)");
				System.out.println();
				System.out.println("5: Chicken Tikka ");
				System.out.println("(Chicken Tikka,Onion,Tomato in a Tandoori Sauce)");
				System.out.println();
				System.out.println("6: Double Trouble[NEW] ");
				System.out.println("(Chicken Sausage,Chicken Tikka,Capsicum,Jalapeno,Red Paprika)");
				System.out.println();
				System.out.println("7: Chicken Supreme ");
				System.out.println("(Chicken Tikka,Chicken Hot & Chilly,Chicken Meatball)");
				System.out.println();
				System.out.println("8: Triple Chicken Feast[NEW] ");
				System.out.println("(Chicken Keema,Chicken Meatball,Chicken Hot & Chilly,Capsicum,Onion,Sweet Corn)");
				System.out.println();
				System.out.println("9: Ultimate Chicken ");
				System.out.println("(Chicken Keema,Chicken Meatball,Chicken Keema,Chicken Meatball,Chicken Pepperoni)");
				System.out.println();
				System.out.println("10: Chicken Italiano ");
				System.out.println("(Chicken Pepperoni,Chicken Sausage,Capsicum,Mushroom,Black Olives)");
				System.out.println();
				System.out.println("11: Pork Pepperoni ");
				System.out.println("(Pork Pepperoni & Cheese)");
				System.out.println();
				e=sc.nextInt();
				if(e>0&&e<12)
				{
				o[j]=e;
				System.out.println("Do you want to proceed");
				u=sc.next();
				b=q.compareToIgnoreCase(u);
				if(b!=0)
				{
				switch(e)
					{
					case 1:
					System.out.println("1: Personal = Rs.170");
					System.out.println("2: Medium = Rs.340");
					break;
					case 2:
					System.out.println("1: Personal = Rs.170");
					System.out.println("2: Medium = Rs.340");
					break;
					case 3:
					System.out.println("1: Personal = Rs.230");
					System.out.println("2: Medium = Rs.425");
					break;
					case 4:
					System.out.println("1: Personal = Rs.230");
					System.out.println("2: Medium = Rs.425");
					break;
					case 5:
					System.out.println("1: Personal = Rs.230");
					System.out.println("2: Medium = Rs.425");
					break;
					case 6:
					System.out.println("1: Personal = Rs.265");
					System.out.println("2: Medium = Rs.480");
					break;
					case 7:
					System.out.println("1: Personal = Rs.265");
					System.out.println("2: Medium = Rs.480");
					break;
					case 8:
					System.out.println("1: Personal = Rs.265");
					System.out.println("2: Medium = Rs.480");
					break;
					case 9:
					System.out.println("1: Personal = Rs.300");
					System.out.println("2: Medium = Rs.525");
					break;
					case 10:
					System.out.println("1: Personal = Rs.300");
					System.out.println("2: Medium = Rs.525");
					break;
					case 11:
					System.out.println("1: Personal = Rs.300");
					System.out.println("2: Medium = Rs.525");
					break;
					default:
					System.out.println("enter a number from 1 to 11!");
				}
				g=sc.nextInt();
				if(g>0&&g<3)
				{
					p[j]=g;
					if(e==1||e==2)
					{
						if(g==1)
						bill=170;
						else
						bill=340;
					}
					else if(e==3||e==4||e==5)
					{
						if(g==1)
						bill=230;
						else
						bill=425;
					}
					else if(e==6||e==7||e==8)
					{
					   if(g==1)
					   bill=265;
					   else
					   bill=480;	   
					}
					else if(e==9||e==10||e==11)
					{
						if(g==1)
						bill=300;
						else
						bill=525;
					}
					total=total+bill;
					j++;
				}
				if(g<1||g>2)
				{
					System.out.println("Enter either 1 or 2!");
				}
			 }
		  }
			if(e<1||e>11)
			{
				System.out.println("enter a number from 1 to 11");
			}
		    break;
			case 3:
			System.out.println("1: Garlic Bread ");
			System.out.println("2: Garlic Bread Stix ");
			System.out.println("3: Tandoori Pockets ");
			System.out.println("4: Cheesy Pepper Pasta ");
			System.out.println("5: Spicy BBQ Wings ");
			System.out.println("6: Soft Drinks");
			System.out.println("7: Desserts");
			d=sc.nextInt();
			if(d>0&&d<8)
			{
			w[v]=d;
			System.out.println("Do you want to proceed");
			u=sc.next();
			b=q.compareToIgnoreCase(u);
			if(b!=0)
			{
			switch(d)
			{
			case 1:
			System.out.println("1: Classic................Rs.89");
			System.out.println("2: Garlic Bread Cheese....Rs.99");
			System.out.println("3: Exotica................Rs.125");
			break;
			case 2:
		    System.out.println("1: Garlic Bread Stix...................Rs.85");
		    System.out.println("2: Tastes Best with Texas Garlic Dip...Rs.20");
		    break;
			case 3:
			System.out.println("1: Paneer....Rs.59");
			System.out.println("2: Chicken...Rs.79");
			break;
			case 4:
			System.out.println("1: Veg......Rs.139");
			System.out.println("2: NonVeg...Rs.159");
			break;
			case 5:
			System.out.println("1: Spicy BBQ Chicken Wings....Rs.149");
			break;
			case 6:
			System.out.println("1: Pepsi.........Rs.50");
			System.out.println("2: Diet Pepsi....Rs.60");
			System.out.println("3: 7UP...........Rs.50");
			System.out.println("4: Miranda.......Rs.50");
			break;
			case 7:
			System.out.println("1: Choco Mousse..........Rs.69");
			System.out.println("2: Choco Truffle Cake....Rs.69");
			break;
			default:
			System.out.println("Enter numbers from 1 to 7!");
			}
			f=sc.nextInt();
			if(f>0&&f<8)
			{
			n[v]=f;
			if(d==1)
			{
				if(f==1)
				bill=89;
				else if(f==2)
				bill=99;
				else
				bill=125;
			}
			else if(d==2)
			{
				if(f==1)
				bill=85;
				else
				bill=20;
			}
			else if(d==3)
			{
			   if(f==1)
			   bill=59;
			   else
			   bill=69;	   
			}
			else if(d==4)
			{
				if(f==1)
				bill=139;
				else
				bill=159;
			}
			else if(d==5)
			{
				if(f==1)
				{
				bill=149;
				}
			}
			else if(d==6)
			{
				if(f==2)
				bill=60;
				else 
				bill=50;
			}
			else if(d==7)
			{
				if(f==1)
				bill=69;
				else
				bill=69;
			}
			   total=total+bill;
			   v++;
			   }
			     if(f<1||f>4)
			     {
				      System.out.println("Invalid Entry,Please enter the numbers from the given options !");
			     }
			 }
		}
			if(d<1||d>7)
			{
			System.out.println("enter a number from 1 to 7!");
			}
			break;
			default:
			System.out.println("enter a number from 1 to 3!");
			    }
			}
			System.out.println("Would You Like to Order Anything else");
			u=sc.next();
			h=q.compareToIgnoreCase(u);
	}
		System.out.println("Your order is:");
		System.out.println();
		System.out.print("Name:"+name);
		System.out.println();
		System.out.print("Address: "+address);
		System.out.println();
		System.out.print("Contact number: "+no);
		System.out.println();
		System.out.print("Order NO. is: "+token);
		System.out.println();
		while(i>0)
		{
			if(r[i]==1&&k[i]==1)
			{
			System.out.println(" Margherita ");
			System.out.println("(Classic Cheese)");
		    System.out.println(" Personal = Rs.100");
		    System.out.println();
			}
			else if(r[i]==1&&k[i]==2)
			{
			System.out.println(" Margherita ");
			System.out.println("(Classic Cheese)");
			System.out.println(" Medium = Rs.245");
			System.out.println();
			}
			else if(r[i]==2&&k[i]==1)
			{
			System.out.println(" Double Cheese ");
			System.out.println("(Extra Cheese On Cheese)");
			System.out.println(" Personal = Rs.100");
			System.out.println();
			}
			else if(r[i]==2&&k[i]==2)
			{
			System.out.println(" Double Cheese ");
			System.out.println("(Extra Cheese On Cheese)");
			System.out.println(" Medium = Rs.245");
			System.out.println();
			}
			else if(r[i]==3&&k[i]==1)
			{
			System.out.println(" Veggie Feast ");
			System.out.println("(Capsicum,Onion,Sweet Corn)");
			System.out.println(" Personal = Rs.100");
			System.out.println();
			}
			else if(r[i]==3&&k[i]==2)
			{
			System.out.println(" Veggie Feast ");
			System.out.println("(Capsicum,Onion,Sweet Corn)");
			System.out.println(" Medium = Rs.245");
			System.out.println();
			}
			else if(r[i]==4&&k[i]==1)
			{
			System.out.println(" Rawalpindi Channa ");
			System.out.println("(Chole,Onion,Green Capsicum,Tomato In Tandoori Sauce)");
			System.out.println(" Personal = Rs.170");
			System.out.println();
			}
			else if(r[i]==4&&k[i]==2)
			{
			System.out.println(" Rawalpindi Channa ");
			System.out.println("(Chole,Onion,Green Capsicum,Tomato In Tandoori Sauce)");
			System.out.println(" Medium = Rs.340");
            System.out.println();
			}
			else if(r[i]==5&&k[i]==1)
			{
			System.out.println(" Tandoori Paneer ");
			System.out.println("(Paneer,Onion,Capsicum,Red Paprika,Tomato In Tandoori Sauce)");
			System.out.println(" Personal = Rs.170");
			System.out.println();
			}
			else if(r[i]==5&&k[i]==2)
			{
			System.out.println(" Tandoori Paneer ");
			System.out.println("(Paneer,Onion,Capsicum,Red Paprika,Tomato In Tandoori Sauce)");
			System.out.println(" Medium = Rs.340");
            System.out.println();
			}
			else if(r[i]==6&&k[i]==1)
			{
			System.out.println(" Veggie Lover ");
			System.out.println("(Onion,Capsicum,Mushroom,Tomato,Red Paprika)");
			System.out.println(" Personal = Rs.230");
			System.out.println();
			}
			else if(r[i]==6&&k[i]==2)
			{
			System.out.println(" Veggie Lover ");
			System.out.println("(Onion,Capsicum,Mushroom,Tomato,Red Paprika)");
			System.out.println(" Medium = Rs.425");
			System.out.println();
			}
			else if(r[i]==7&&k[i]==1)
			{
			System.out.println(" Country Feast ");
			System.out.println("(Onion,Capsicum,Mushroom,Sweet Corn,Tomato)");
			System.out.println(" Personal = Rs.230");
			System.out.println();
			}
			else if(r[i]==7&&k[i]==2)
			{
			System.out.println(" Country Feast ");
			System.out.println("(Onion,Capsicum,Mushroom,Sweet Corn,Tomato)");	
			System.out.println(" Medium = Rs.425");
			System.out.println();
			}
			else if(r[i]==8&&k[i]==1)
			{
			System.out.println(" Veggie Supreme ");
			System.out.println("(Onion,Capsicum,Mushroom,Red Paprika,Black Olives,Sweet Corn)");
			System.out.println(" Personal = Rs.230");
			System.out.println();
			}
			else if(r[i]==8&&k[i]==2)
			{
			System.out.println(" Veggie Supreme ");
			System.out.println("(Onion,Capsicum,Mushroom,Red Paprika,Black Olives,Sweet Corn)");
			System.out.println(" Medium = Rs.425");
			System.out.println();
			}
			else if(r[i]==9&&k[i]==1)
			{
			System.out.println(" Paneer Vegorma[NEW]");
			System.out.println("(Paneer,Onion,Capsicum,Black Olives,Red Paprika)");
			System.out.println(" Personal = Rs.265");
			System.out.println();
			}
			else if(r[i]==9&&k[i]==2)
			{
			System.out.println(" Paneer Vegorma[NEW]");
			System.out.println("(Paneer,Onion,Capsicum,Black Olives,Red Paprika)");
			System.out.println(" Medium = Rs.480");
			System.out.println();
			}
			else if(r[i]==10&&k[i]==1)
			{
			System.out.println("Exotica ");
			System.out.println("(Red Capsicum,Green Capsicum,Baby Corn,Black Olives,Jalapeno)");
			System.out.println(" Personal = Rs.265");
			System.out.println();
			}
			else if(r[i]==10&&k[i]==2)
			{
			System.out.println("Exotica ");
			System.out.println("(Red Capsicum,Green Capsicum,Baby Corn,Black Olives,Jalapeno)");
			System.out.println(" Medium = Rs.480");
			System.out.println();
			}
			i--;			
		}
		while(j>0)
		{
			if(o[j]==1&&p[j]==1)
			{
				System.out.println(" Chicken Sausage ");
				System.out.println("(Chicken Sausage & Onion)");
				System.out.println(" Personal = Rs.170");
				System.out.println();
			}
			else if(o[j]==1&&p[j]==2)
			{
				System.out.println(" Chicken Sausage ");
				System.out.println("(Chicken Sausage & Onion)");
				System.out.println(" Medium = Rs.340");
				System.out.println();
			}
			else if(o[j]==2&&p[j]==1)
			{
			    System.out.println(" Chicken 'N' Spicy ");
				System.out.println("(Chicken Hot & Chilly,Capsicum,Mushroom)");	
				System.out.println(" Personal = Rs.170");
				System.out.println();
			}
			else if(o[j]==2&&p[j]==2)
			{
			    System.out.println(" Chicken 'N' Spicy ");
				System.out.println("(Chicken Hot & Chilly,Capsicum,Mushroom)");	
				System.out.println(" Medium = Rs.340");
				System.out.println();
			}
			else if(o[j]==3&&p[j]==1)
			{
				System.out.println(" Keema Masala ");
				System.out.println("(Chicken Keema,Onion,Capsicum in a Tandoori Sauce)");
				System.out.println(" Personal = Rs.230");
				System.out.println();
			}
			else if(o[j]==3&&p[j]==2)
			{
				System.out.println(" Keema Masala ");
				System.out.println("(Chicken Keema,Onion,Capsicum in a Tandoori Sauce)");
				System.out.println(" Medium = Rs.425");
				System.out.println();
			}
			else if(o[j]==4&&p[j]==1)
			{
				System.out.println(" Chicken Pepperoni ");
				System.out.println("(Chicken Pepperoni & Cheese)");
				System.out.println(" Personal = Rs.230");
				System.out.println();
			}
			else if(o[j]==4&&p[j]==2)
			{
				System.out.println(" Chicken Pepperoni ");
				System.out.println("(Chicken Pepperoni & Cheese)");
				System.out.println(" Medium = Rs.425");
				System.out.println();
			}
			else if(o[j]==5&&p[j]==1)
			{
			    System.out.println(" Chicken Tikka ");
				System.out.println("(Chicken Tikka,Onion,Tomato in a Tandoori Sauce)");
				System.out.println(" Personal = Rs.230");
				System.out.println();
			}
			else if(o[j]==5&&p[j]==2)
			{
			    System.out.println(" Chicken Tikka ");
				System.out.println("(Chicken Tikka,Onion,Tomato in a Tandoori Sauce)");
				System.out.println(" Medium = Rs.425");
				System.out.println();
			}
			else if(o[j]==6&&p[j]==1)
			{
				System.out.println(" Double Trouble[NEW] ");
				System.out.println("(Chicken Sausage,Chicken Tikka,Capsicum,Jalapeno,Red Paprika)");
				System.out.println(" Personal = Rs.265");
				System.out.println();
			}
			else if(o[j]==6&&p[j]==2)
			{
				System.out.println(" Double Trouble[NEW] ");
				System.out.println("(Chicken Sausage,Chicken Tikka,Capsicum,Jalapeno,Red Paprika)");
				System.out.println(" Medium = Rs.480");
				System.out.println();
			}
			else if(o[j]==7&&p[j]==1)
			{
				System.out.println(" Chicken Supreme ");
				System.out.println("(Chicken Tikka,Chicken Hot & Chilly,Chicken Meatball)");
				System.out.println(" Personal = Rs.265");
				System.out.println();
			}
			else if(o[j]==7&&p[j]==2)
			{
				System.out.println(" Chicken Supreme ");
				System.out.println("(Chicken Tikka,Chicken Hot & Chilly,Chicken Meatball)");
				System.out.println(" Medium = Rs.480");
				System.out.println();
			}
			else if(o[j]==8&&p[j]==1)
			{
				System.out.println(" Triple Chicken Feast[NEW] ");
				System.out.println("(Chicken Keema,Chicken Meatball,Chicken Hot & Chilly,Capsicum,Onion,Sweet Corn)");
				System.out.println(" Personal = Rs.265");
				System.out.println();
			}
			else if(o[j]==8&&p[j]==2)
			{
				System.out.println(" Triple Chicken Feast[NEW] ");
				System.out.println("(Chicken Keema,Chicken Meatball,Chicken Hot & Chilly,Capsicum,Onion,Sweet Corn)");
				System.out.println(" Medium = Rs.480");
				System.out.println();
			}
			else if(o[j]==9&&p[j]==1)
			{
				System.out.println(" Ultimate Chicken ");
				System.out.println("(Chicken Keema,Chicken Meatball,Chicken Keema,Chicken Meatball,Chicken Pepperoni)");
				System.out.println(" Personal = Rs.300");
				System.out.println();
			}
			else if(o[j]==9&&p[j]==2)
			{
				System.out.println(" Ultimate Chicken ");
				System.out.println("(Chicken Keema,Chicken Meatball,Chicken Keema,Chicken Meatball,Chicken Pepperoni)");
				System.out.println(" Medium = Rs.480");
				System.out.println();
			}
			else if(o[j]==10&&p[j]==1)
			{
				System.out.println(" Chicken Italiano ");
				System.out.println("(Chicken Pepperoni,Chicken Sausage,Capsicum,Mushroom,Black Olives)");
				System.out.println(" Personal = Rs.300");
				System.out.println();
			}
			else if(o[j]==10&&p[j]==2)
			{
				System.out.println(" Chicken Italiano ");
				System.out.println("(Chicken Pepperoni,Chicken Sausage,Capsicum,Mushroom,Black Olives)");
				System.out.println(" Medium = Rs.480");
				System.out.println();
			}
			else if(o[j]==11&&p[j]==1)
			{
				System.out.println(" Pork Pepperoni ");
				System.out.println("(Pork Pepperoni & Cheese)");
				System.out.println(" Personal = Rs.300");
				System.out.println();
			}
			else if(o[j]==11&&p[j]==2)
			{
				System.out.println(" Pork Pepperoni ");
				System.out.println("(Pork Pepperoni & Cheese)");
				System.out.println(" Medium = Rs.480");
				System.out.println();
			}
		    j--;
	}
		while(v>0)
		{
			if(w[v]==1&&n[v]==1)
			{
				System.out.println(" Garlic Bread: ");
				System.out.println(" Classic................Rs.89");
				System.out.println();
			}
			else if(w[v]==1&&n[v]==2)
			{
				System.out.println(" Garlic Bread: ");
				System.out.println(" Garlic Bread Cheese....Rs.99");
				System.out.println();
			}
			else if(w[v]==1&&n[v]==3)
			{
				System.out.println(" Garlic Bread: ");
				System.out.println(" Exotica................Rs.125");
				System.out.println();
			}
			else if(w[v]==2&&n[v]==1)
			{
				System.out.println(" Garlic Bread Stix...................Rs.85");
				System.out.println();
			}
			else if(w[v]==2&&n[v]==2)
			{
				System.out.println(" Texas Garlic Dip...Rs.20");
				System.out.println();
			}
			else if(w[v]==3&&n[v]==1)
			{
				System.out.println(" Tandoori Pockets ");
				System.out.println(" Paneer....Rs.59 ");
				System.out.println();
			}
			else if(w[v]==3&&n[v]==2)
			{
				System.out.println(" Tandoori Pockets ");
				System.out.println(" Chicken...Rs.79");
				System.out.println();
			}
			else if(w[v]==4&&n[v]==1)
			{
				System.out.println(" Cheesy Pepper Pasta ");
				System.out.println(" Veg......Rs.139");
				System.out.println();
			}
			else if(w[v]==4&&n[v]==2)
			{
				System.out.println(" Cheesy Pepper Pasta ");
				System.out.println(" NonVeg......Rs.139");
				System.out.println();
			}
			else if(w[v]==5&&n[v]==1)
			{
				System.out.println(" Spicy BBQ Chicken Wings....Rs.149");
				System.out.println();
			}
			else if(w[v]==6&&n[v]==1)
			{
				System.out.println(" Pepsi.........Rs.50");	
				System.out.println();
			}
			else if(w[v]==6&&n[v]==2)
			{
				System.out.println(" Diet Pepsi....Rs.60");
				System.out.println();
			}
			else if(w[v]==6&&n[v]==3)
			{
				System.out.println(" 7UP...........Rs.50");
				System.out.println();
			}
			else if(w[v]==6&&n[v]==4)
			{
				System.out.println(" Miranda.......Rs.50");
				System.out.println();
			}
			else if(w[v]==7&&n[v]==1)
			{
				System.out.println(" Choco Mousse..........Rs.69");
				System.out.println();
			}
			else if(w[v]==7&&n[v]==2)
			{
			System.out.println(" Choco Truffle Cake....Rs.69");
			System.out.println();
			}
			v--;
		}
		System.out.println("Your total amount is :"+total);
		System.out.println();
		System.out.println("Do You Want to Confirm Your Order?");
		u=sc.next();
		h=a.compareToIgnoreCase(u);
		}
	    while(h != 0);
		System.out.println("Your Order Has Been Succesfully Placed!!!");
		sc.close();
	}	
     
}