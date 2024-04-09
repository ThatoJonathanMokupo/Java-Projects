import java.util.Scanner;

public class tair 
{
    public static int ta0101Seats = 50;
    public static int[] ta0101Seat = new int[ta0101Seats];
    private static int ta102Seats = 50;
    public static int[] ta102Seat = new int[ta102Seats];
    private static Scanner user = new Scanner(System.in);
    
    public static void main(String[] args) 
    {
        tairui();
    }
    
    public static void tairui() 
    {
        System.out.println("Welcome to T Air");
        System.out.println("Which flight would you like to book for ?");
        System.out.println("1. Flight TA0101 departs at 09:00 AM.");
        System.out.println("2. Flight TA0102 departs at 12:00 PM.");
        System.out.println("If you would like to check information regarding a flight please chose the flight you would like the info for from the above options.");
        System.out.println("3. To exit.");
        int tairui = user.nextInt();
        switch (tairui) 
        {
            case 1:
            ta0101Seat();
            break;
            case 2:
            ta0102Seat();
            break;
            default:
            System.out.print("Thank you for using T Air.");
            System.exit(0);
        }
    }
    
    public static void ta0101Seat() 
    {
        System.out.println("Welcome to T Air flight TA0101");
        System.out.println("This flight departs at 09:00.");
        System.out.println("There are " + ta0101Seats + " seats available on this flight this flight takes off at 09:00 AM GMT");
        System.out.println("Please select an option: ");
        System.out.println("1. Book seat.");
        System.out.println("2. Check open seats.");
        System.out.println("3. Exit.");
        int ta0101Seatpick = user.nextInt();
        switch (ta0101Seatpick) 
        {
            case 1:
            bookTA0101();
            break;
            case 2:
            checkTA0101();
            break;
            case 3:
            System.exit(0);
        }
    }
    
    public static void ta0102Seat() 
    {
        System.out.println("Welcome to T Air");
        System.out.println("This flight departs at 12:00.");
        System.out.println("There are " + ta102Seats + " seats available on this flight this flight takes off at 12:00 PM GMT");
        System.out.println("Please select an option: ");
        System.out.println("1. Book seat.");
        System.out.println("2. Check open seats.");
        System.out.println("3. Exit.");
        int ta0101Seatpick = user.nextInt();
        switch (ta0101Seatpick) 
        {
            case 1:
            bookTA0102();
            break;
            case 2:
            checkTA0102();
            break;
            case 3:
            System.exit(0);
        }
    }
    
    public static void bookTA0101() 
    {
        System.out.println("Please enter the desired seat number for this flight we have " + ta0101Seats + " available.");
        int seatChoice1 = user.nextInt();
        if (seatChoice1 < 1 || seatChoice1 > ta0101Seats) 
        {
            System.out.println("Your seat choice is either invalid or taken already you may need to chose a different seat");
            return;
        }
        if (ta0101Seat[seatChoice1 - 1] == 0) 
        {
            ta0101Seat[seatChoice1 - 1] = 1;
            System.out.println("Seat " + seatChoice1 + " has been reserved for you");
        } 
        else 
        {
            System.out.println("Sorry but seat " + seatChoice1 + " has already been taken");
        }
    }
    
    public static void checkTA0101() 
    {
        int openSeats = 0;
        for (int i = 0; i < ta0101Seats; i++) 
        {
            if (ta0101Seat[i] == 0) 
            {
                openSeats++;
            }
        }
        System.out.println("There are " + openSeats + " open seats on flight TA0101");
    }
    
    public static void bookTA0102() 
    {
        System.out.println("Please enter the desired seat number for this flight we have " + ta102Seats + " available.");
        int seatChoice2 = user.nextInt();
        if (seatChoice2 < 1 || seatChoice2 > ta102Seats) 
        {
            System.out.println("Your seat choice is either invalid or taken already you may need to chose a different seat");
            return;
        }
        if (ta102Seat[seatChoice2 - 1] == 0) 
        {
            ta102Seat[seatChoice2 - 1] = 1;
            System.out.println("Seat " + seatChoice2 + " has been reserved for you");
        } 
        else 
        {
            System.out.println("Sorry but seat " + seatChoice2 + " has already been taken");
        }
    }
    
    public static void checkTA0102() 
    {
        int openSeats = 0;
        for (int i = 0; i < ta102Seats; i++) 
        {
            if (ta102Seat[i] == 0) {
                openSeats++;
            }
        }
        System.out.println("There are " + openSeats + " open seats on flight TA0102");
    }
}