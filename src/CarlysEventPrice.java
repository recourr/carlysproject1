import java.text.DecimalFormat;
import java.util.Scanner;

//Carly’s Catering provides meals for parties and special events. Write a program
//that prompts the user for the number of guests attending an event and then
//computes
//the total price, which is $35 per person. Display the company motto
//with the border that you created in the CarlysMotto2 class in Chapter 1,
//and then display the number of guests, price per guest, and total price. Also
//display
//a message that indicates true or false depending on whether the job
//is classified as a large event
//written by Jonah Westercamp
//12/12/21


public class CarlysEventPrice {
    //Global Definitions
   static Scanner inputDevice;

    //This is the main method. It is required
    public static void main(String[]args) {
        init();
        int cGuests = input();
        int cTotPrice = calcs(cGuests);
        output(cTotPrice, cGuests);
    }
    public static void init(){
        inputDevice = new Scanner(System.in);
    }

    public static int input() {
        String iGuests = " ";
        System.out.print("Enter the amount of guests attending. ");
        iGuests = inputDevice.nextLine(); //get input from user
        int cGuests = Integer.parseInt(iGuests);

        return cGuests;
    }

    public static int calcs(int cGuests) {
        int cTotPrice = 0;
        final int RATE_PER_PERSON = 35;
        cTotPrice = cGuests * RATE_PER_PERSON;

        return cTotPrice;
    }

    public static void output(int cTotPrice, int cGuests) {
        String oTotPrice;
        DecimalFormat dollarAmt = new DecimalFormat( "$###,###.##");
        oTotPrice = dollarAmt.format(cTotPrice);

        System.out.printf("%10s%9s\n", "Amount of guests attending is ", cGuests);
        System.out.printf("%5s\n", "It costs $35 per guest to attend. ");
        System.out.printf("%10s%26s\n", "Total price is ", oTotPrice);

        if (cGuests >= 50) {
            System.out.println("You have a large party!");
        } else {
            System.out.println("You have a small party! ");
        }
    }
}

