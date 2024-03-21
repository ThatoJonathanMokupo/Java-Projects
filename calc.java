import java.util.Scanner;
public class calc
{
    public static void main (String [] args)
    {
        System.out.println("Welcome to the calculator made by Thato Mokupo");
        ui();
    }
    public static void ui()// The main method that calls for all calculation methods.
    {
        Scanner uiin = new Scanner(System.in);
        System.out.println("what would you like to do would you like to do?");
        System.out.println("Type 1 for addition.");
        System.out.println("Type 2 for multiplication.");
        System.out.println("Type 3 for division.");
        System.out.println("Type 4 for subtraction.");
        System.out.print("answer:");
        int req = uiin.nextInt();

        switch(req)
        {
            case 1:
            {
                add();//calls addition method.
                break;
            }
            case 2:
            {
                mult();//calls multiplication method.
                break;
            }
            case 3:
            {
                div();//calls the division method.
                break;
            }
            case 4:
            {
                sub();//calls the subtraction method.
                break;
            }
            default:
            System.err.println("Invalid input.");// in case of any errors on the users end.
            break;
        }
        uiin.close();


    }
    public static void add()// addition method.
    {
        Scanner addin = new Scanner(System.in);
        System.out.print("What the first number?");
        int firadd = addin.nextInt();
        System.out.print("What is the second number");
        int secadd = addin.nextInt();
        addin.close();
        int ans = firadd+secadd;
        System.out.println(ans);
    }
    public static void mult()//multiplication method.
    {
        Scanner multin = new Scanner(System.in);
        System.out.print("What the first number?");
        int firmult = multin.nextInt();
        System.out.print("What is the second number");
        int secmult = multin.nextInt();
        multin.close();
        int ans1 = firmult*secmult;
        System.out.println(ans1);
    }
    public static void div()//division method.
    {
        Scanner divin = new Scanner(System.in);
        System.out.print("What the first number?");
        int firdiv = divin.nextInt();
        System.out.print("What is the second number");
        int secdiv = divin.nextInt();
        divin.close();
        int ans2 = firdiv/secdiv;
        System.out.println(ans2);
    }
    public static void sub()//subtraction method.
    {
        Scanner subin = new Scanner(System.in);
        System.out.print("What the first number?");
        int firsub = subin.nextInt();
        System.out.print("What is the second number");
        int secsub = subin.nextInt();
        subin.close();
        int ans3 = firsub-secsub;
        System.out.println(ans3);
    }


}