import java.util.Scanner;
public class corpogear 
{
    private static double newcart = 0;
    private static double cart = 0;
    public static void main (String [] args)
    {
        System.out.println ("Welcome to Corpo Gear!");
        cgui();
    }
    public static synchronized void cgui()
    {
        Scanner cgui = new Scanner(System.in);
        try
        {
            System.out.println ("Please select what you would like from the list of items below:");
            System.out.println ("Blazers");
            System.out.println ("Waistcoats");
            System.out.println ("Dress Shirts");
            System.out.println ("Dress Pants");
            System.out.println ("Socks");
            System.out.println ("Dress shoes");
            System.out.print ("Would you like to buy any of these items? Type yes to purchase type no to leave the system : ");
            String purbool = cgui.nextLine();
            if (purbool.equals("yes"))
            {
                System.out.println ("Which clothing item would you like to purchase ? : ");
                System.out.print ("Type Blazer, Waistcoat, DShirt, DPants, Socks, DShoes : ");
                String clothchoice = cgui.nextLine();
                switch (clothchoice)
                {
                    case "Blazer":
                    {
                        blazers();
                        break;
                    }
                    case "Waistcoat":
                    {
                        waistcoats();
                        break;
                    }
                    case "DShirt":
                    {
                        dshirts();
                        break;
                    }
                    case "DPants":
                    {
                        dpants();
                        break;
                    }
                    case "Socks":
                    {
                        socks();
                        break;
                    }
                    case "DShoes":
                    {
                        dshoes();
                        break;
                    }
                }
            }else 
            {
                System.out.println ("We are sorry to see you are not interested we will return to main screen now.");
                cgui();
            }
        }
        catch (Exception e)
        {
            System.out.println("An error has been encountered:" + e.getMessage());
        }
        finally
        {
            cgui.close();
        }
    }
    
    public static synchronized void blazers() 
    {
        Scanner blazerinput = new Scanner(System.in);
        try {
            String bsizes = "Small";
            String bsizem = "Medium";
            String bsizel = "Large";
            double bsizesp = 350;
            double bsizemp = 500;
            double bsizelp = 600;
            System.out.println("Blazer sizes and prices are as follows : ");
            System.out.println("Blazer Sizes :" + bsizes + " " + bsizem + " " + bsizel);
            System.out.println("Blazer Prices :" + bsizesp + " " + bsizemp + " " + bsizelp);
            System.out.print("Would you like a  blazer ? : ");
            String purb = blazerinput.nextLine();
            if (purb.equals("yes")) 
            {
                System.out.print("What size would you like we have small, medium and large:");
                String bsize = blazerinput.nextLine();
                switch (bsize) 
                {
                    case "Small":
                    {
                        newcart +=  bsizesp;
                        break;
                    }
                    case "Medium":
                    {
                        newcart +=  bsizemp;
                        break;
                    }
                    case "Large":
                    {
                        newcart +=  bsizelp;
                        break;
                    }
                }
            }
            System.out.println("Your current cart amount is :" + newcart);
            System.out.print("Is there anything else that you would like to buy type yes to go back to the catalog.");
            String rettocat = blazerinput.nextLine();
            if (rettocat.equals("yes")) 
            {
                cgui();
            }
        } 
        catch (Exception e) 
        {
            System.out.println("An error occurred: " + e.getMessage());
        } 
        finally 
        {
            blazerinput.close();
        }
    }
    
    public static synchronized void waistcoats() 
    {
        Scanner wcinput = new Scanner(System.in);
        try {
            String wcsizes = "Small";
            String wcsizem = "Medium";
            String wcsizel = "Large";
            double wcsizesp = 250;
            double wcsizemp = 400;
            double wcsizelp = 500;
            System.out.println("Waistcoat sizes and prices are as follows : ");
            System.out.println("Waistcoats Sizes :" + wcsizes + wcsizem + wcsizel);
            System.out.println("Waistcoats Prices :" + wcsizesp + wcsizemp + wcsizelp);
            System.out.print("Would you like a waistcoat?");
            String purwc = wcinput.nextLine();
            if (purwc.equals("yes")) 
            {
                System.out.print("What size would you like we have small, medium and large:");
                String bsize = wcinput.nextLine();
                switch (bsize) 
                {
                    case "Small":
                    {
                        newcart +=  wcsizesp;
                        break;
                    }
                    case "Medium":
                    {
                        newcart +=  wcsizemp;
                        break;
                    }
                    case "Large":
                    {
                        newcart +=  wcsizelp;
                        break;
                    }
                }
            }
            System.out.println("Your current cart amount is :" + newcart);
            System.out.print("Is there anything else that you would like to buy type yes to go back to the catalog.");
            String rettocat = wcinput.nextLine();
            if (rettocat.equals("yes")) 
            {
                cgui();
            }
        } 
        catch (Exception e) 
        {
            System.out.println("An error was encountered: " + e.getMessage());
        } 
        finally 
        {
            wcinput.close();
        }
    }
    public static synchronized void dshirts()
    {
        Scanner dsinput = new Scanner (System.in);
        try
        {
            String dssizes = "Small";
            String dssizem = "Medium";
            String dssizel = "Large";
            double dssizesp = 150;
            double dssizemp = 200;
            double dssizelp = 300;
            System.out.println ("Dress Shirts sizes and prices are as follows : ");
            System.out.println ("Dress Shirts Sizes :" + dssizes + dssizem + dssizel);
            System.out.println ("Dress Shirts Prices :" + dssizesp + dssizemp + dssizelp);            
            System.out.print("Would you like a dress shirt?");
            String purwc = dsinput.nextLine();
            if (purwc.equals("yes"))
            {
                System.out.print ("What size would you like we have small,medium and large:");
                String bsize = dsinput.nextLine();
                switch (bsize)
                {
                    case "Small":
                    {
                        newcart += dssizesp;
                        break;
                    }
                    case "Medium":
                    {
                        newcart += dssizemp;
                        break;
                    }
                    case "Large":
                    {
                        newcart += dssizelp;                        
                        break;
                    }
                }
            }  
            System.out.println ("Your current cart amount is :" + newcart);
            System.out.print ("Is there anything else that you would like to buy type yes to go back to the catalog.");
            String rettocat = dsinput.nextLine();
            if (rettocat.equals("yes"))
            {
                cgui();
            }
        }
        catch (Exception e)
        {
            System.out.println("An error has been encountered:" + e.getMessage());
        }
        finally
        {
            dsinput.close();
        }
    }
    
    public static synchronized void dpants()
    {
        Scanner dpinput = new Scanner(System.in);
        try
        {
            String dpsizes = "Small";
            String dpsizem = "Medium";
            String dpsizel = "Large";
            double dpsizesp = 150;
            double dpsizemp = 200;
            double dpsizelp = 300;
            System.out.println ("Dress Pants sizes and prices are as follows : ");
            System.out.println ("Dress Pants Sizes :" + dpsizes + dpsizem + dpsizel);
            System.out.println ("Dress Pants Prices :" + dpsizesp + dpsizemp + dpsizelp);
            System.out.print("Would you like a dress pants?");
            String purwc = dpinput.nextLine();
            if (purwc.equals("yes"))
            {
                System.out.print ("What size would you like we have small,medium and large:");
                String bsize = dpinput.nextLine();
                switch (bsize)
                {
                    case "Small":
                    {
                        newcart = dpsizesp;
                        break;
                    }
                    case "Medium":
                    {
                        newcart = dpsizemp;
                        break;
                    }
                    case "Large":
                    {
                        newcart = dpsizelp;
                        break;
                    }
                }
            }  
            System.out.println ("Your current cart amount is :" + newcart);
            System.out.print ("Is there anything else that you would like to buy type yes to go back to the catalog.");
            String rettocat = dpinput.nextLine();
            if (rettocat.equals("yes"))
            {
                cgui();
            }
        }
        catch (Exception e)
        {
            System.out.println("An error has been encountered:" + e.getMessage());
        }
        finally
        {
            dpinput.close();
        }
    }
    public static synchronized void socks()
    {
        Scanner sockinput = new Scanner (System.in);
        try
        {
            double sockprice = 100;
            System.out.println ("Socks have 1 size fits all and the price is as follows : ");
            System.out.println ("Sock Prices :" + sockprice);
            System.out.print("Would you like a pair of socks?");
            String purwc = sockinput.nextLine();
            if (purwc.equals("yes"))
            {
                newcart =  sockprice;
            }
            System.out.println ("Your current cart amount is :" + newcart);
            System.out.print ("Is there anything else that you would like to buy type yes to go back to the catalog.");
            String rettocat = sockinput.nextLine();
            if (rettocat.equals("yes"))
            {
                cgui();
            }
        } 
        catch (Exception e)
        {
            System.out.println("An error has been encountered:" + e.getMessage());
        }
        finally
        {
            sockinput.close();
        }
        
    }
    public static synchronized void dshoes()
    {
        Scanner dshinput = new Scanner (System.in);
        try
        {
            String dshsizes = "Small";
            String dshsizem = "Medium";
            String dshsizel = "Large";
            double dshsizesp = 500;
            double dshsizemp = 800;
            double dshsizelp = 1000;
            System.out.println ("Dress Shoes sizes and prices are as follows : ");
            System.out.println ("Dress Shoes Sizes :" + dshsizes + dshsizem + dshsizel);
            System.out.println ("Dress Shoes Prices :" + dshsizesp + dshsizemp + dshsizelp);
            System.out.print("Would you like a pair of dress shoes?");
            String purwc = dshinput.nextLine();
            if (purwc.equals("yes"))
            {
                System.out.print ("What size would you like we have small,medium and large:");
                String bsize = dshinput.nextLine();
                switch (bsize)
                {
                    case "Small":
                    {
                        newcart += dshsizesp;
                        break;
                    }
                    case "Medium":
                    {
                        newcart += dshsizemp;
                        break;
                    }
                    case "Large":
                    {
                        newcart += dshsizelp;
                        break;
                    }
                }
            }  
            System.out.println ("Your current cart amount is :" + newcart);
            System.out.print ("Is there anything else that you would like to buy type yes to go back to the catalog.");
            String rettocat = dshinput.nextLine();
            if (rettocat.equals("yes"))
            {
                cgui();
            }
        }
        catch (Exception e)
        {
            System.out.println("An error has been encountered:" + e.getMessage());
        }
        finally
        {
            dshinput.close();
        }
    }
}