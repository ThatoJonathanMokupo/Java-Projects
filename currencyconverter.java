import java.util.Scanner;
public class currencyconverter 
{
    public static void main (String [] args)
    {
        System.out.println ("Welcome to ZAR currency converter made by Thato Mokupo.");
        curui();//calls for the ui.
    }
    public static void curui()//currency selection menu for user and core program
    {
        Scanner currui = new Scanner(System.in);
        System.out.println ("Which currency would you like to convert your ZAR to ?");
        System.out.println ("Press 1 for (US Dollar) USD");
        System.out.println ("Press 2 for (Great British pound) GBP");
        System.out.println ("Press 3 for (Euro) EURO");
        System.out.println ("Press 4 for (Hong Kong Dollar) HKD");
        System.out.println ("Press 5 for (Japanese Yen) JPY");
        System.out.println ("Press 6 for (Australian dollar) AUD");
        System.out.println ("Press 7 for (Canadian Dollar) CAD");
        System.out.println ("Press 8 for (Swiss Franc) CHD");
        int choice = currui.nextInt();

        switch (choice)//this method calls for the corresponding logic for the selected currencies
        {
            case 1:
            {
                usdc();
                break;
            }
            case 2:
            {
                gbpc();
                break;
            }
            case 3:
            {
                euroc();
                break;
            }
            case 4:
            {
                hkdc();
                break;
            }
            case 5:
            {
                jpyc();
                break;
            }
            case 6:
            {
                audc();
                break;
            }
            case 7:
            {
                cadc();
                break;
            }
            case 8:
            {
                chdc();
                break;
            }
            default:
            System.out.println("You have entered an invalid number please try again:");
            break;
        }
        currui.close();
        
    }
    public static void usdc()//usd conversion logic
    {
        Scanner usdc = new Scanner(System.in);
        System.out.print ("Please enter the amount of ZAR that you would like to convert : ");
        double zamount = usdc.nextDouble();
        double conamount = zamount * 0.053;
        System.out.print ("Your converted amount is :" + conamount);
        usdc.close();
    }
    public static void gbpc()//gbp conversion logic
    {
        Scanner gbpc = new Scanner(System.in);
        System.out.print ("Please enter the amount of ZAR that you would like to convert : ");
        double zamount = gbpc.nextDouble();
        double conamount = zamount * 0.042;
        System.out.print ("Your converted amount is :" + conamount);
        gbpc.close();
    }
    public static void euroc()//euro conversion logic
    {
        Scanner euroc = new Scanner(System.in);
        System.out.print ("Please enter the amount of ZAR that you would like to convert : ");
        double zamount = euroc.nextDouble();
        double conamount = zamount * 0.049;
        System.out.print ("Your converted amount is :" + conamount);
        euroc.close();
    }
    public static void hkdc()//hong kong dollar conversion logic
    {
        Scanner hkdc = new Scanner(System.in);
        System.out.print ("Please enter the amount of ZAR that you would like to convert : ");
        double zamount = hkdc.nextDouble();
        double conamount = zamount * 0.42;
        System.out.print ("Your converted amount is :" + conamount);
        hkdc.close();
    }
    public static void jpyc()//japanese yen conversion logic
    {
        Scanner jpyc = new Scanner(System.in);
        System.out.print ("Please enter the amount of ZAR that you would like to convert : ");
        double zamount = jpyc.nextDouble();
        double conamount = zamount * 7.91;
        System.out.print ("Your converted amount is :" + conamount);
        jpyc.close();
    }
    public static void audc()//australian dollar conversion logic
    {
        Scanner audc = new Scanner(System.in);
        System.out.print ("Please enter the amount of ZAR that you would like to convert : ");
        double zamount = audc.nextDouble();
        double conamount = zamount * 0.081;
        System.out.print ("Your converted amount is :" + conamount);
        audc.close();
    }
    public static void cadc()//canadian dollar conversion logic
    {
        Scanner cadc = new Scanner(System.in);
        System.out.print ("Please enter the amount of ZAR that you would like to convert : ");
        double zamount = cadc.nextDouble();
        double conamount = zamount * 0.072;
        System.out.print ("Your converted amount is :" + conamount);
        cadc.close();
    }
    public static void chdc()//swiss franc conversion logic
    {
        Scanner chdc = new Scanner(System.in);
        System.out.print ("Please enter the amount of ZAR that you would like to convert : ");
        double zamount = chdc.nextDouble();
        double conamount = zamount * 0.047;
        System.out.print ("Your converted amount is :" + conamount);
        chdc.close();
    }

    
}
