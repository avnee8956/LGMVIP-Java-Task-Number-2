import java.util.*;
import java.text.DecimalFormat;

public class CurrencyConverter
{
    public static void main(String[] args)
    {
        double amount;
        double Rupee, Dollar, Pound, Euro, Yen, Renminbi;
        int Choices;

        DecimalFormat d = new DecimalFormat("##.##");

        Scanner sc = new Scanner(System.in);

        System.out.println("Following are the Choices:");
        System.out.println("Enter 1: Ruppe");
        System.out.println("Enter 2: Dollar");
        System.out.println("Enter 3: Pound");
        System.out.println("Enter 4: Euro");
        System.out.println("Enter 5: Yen");
        System.out.println("Enter 6: Renminbi");

        System.out.print("\nChoose from above options: ");
        Choices = sc.nextInt();

        System.out.println("Enter the amount you want to convert?");
        amount = sc.nextFloat();

        switch (Choices)
        {
            case 1:  // Ruppe Conversion
                Dollar = amount / 81.90;
                System.out.println(amount + " Rupee = " + d.format(Dollar) + " Dollar");

                Pound = amount * 0.0095;
                System.out.println(amount + " Rupee = " + d.format(Pound) + " Pounds");

                Euro = amount / 89.66;
                System.out.println(amount + " Rupee = " + d.format(Euro) + " Euro");

                Yen = amount / 0.58;
                System.out.println(amount + " Rupee = " + d.format(Yen) + " Yen");

                Renminbi = amount / 11.50;
                System.out.println(amount + " Rupee = " + d.format(Renminbi) + " Renminbi");
                break;

            case 2:  // Dollar Conversion
                Rupee = amount * 81.90;
                System.out.println(amount + " Dollar = " + d.format(Rupee) + " Ruppes");

                Pound = amount *0.78;
                System.out.println(amount + " Dollar = " + d.format(Pound) + " Pound");

                Euro = amount *0.91;
                System.out.println(amount + " Dollar = " + d.format(Euro) + " Euro");

                Yen = amount *140.27;
                System.out.println(amount + " Dollar = " + d.format(Yen) + " Yen");

                Renminbi = amount *7.12;
                System.out.println(amount + " Dollar = " + d.format(Renminbi) + " Renminbi");
                break;

            case 3:  // Pound Conversion
                Rupee = amount * 104.67;
                System.out.println(amount + " Pound = " + d.format(Rupee) + " Ruppes");

                Dollar = amount *1.28;
                System.out.println(amount + " Pound = " + d.format(Dollar) + " Dollar");

                Euro = amount *1.17;
                System.out.println(amount + " Pound = " + d.format(Euro) + " Euro");

                Yen = amount *179.24;
                System.out.println(amount + " Pound = " + d.format(Yen) + " Yen");

                Renminbi = amount *9.10;
                System.out.println(amount + " Pound = " + d.format(Renminbi) + " Renminbi");
                break;

            case 4:  // Euro Conversion
                Rupee = amount * 89.65;
                System.out.println(amount + " Euro = " + d.format(Rupee) + " Ruppes");

                Dollar = amount *1.09;
                System.out.println(amount + " Euro = " + d.format(Dollar) + " Dollar");

                Pound = amount *0.86;
                System.out.println(amount + " Euro = " + d.format(Pound) + " Pound");

                Yen = amount *157.53;
                System.out.println(amount + " Euro = " + d.format(Yen) + " Yen");

                Renminbi = amount *7.79;
                System.out.println(amount + " Euro = " + d.format(Renminbi) + " Renminbi");
                break;

            case 5:  // Yen Conversion
                Rupee = amount *0.58;
                System.out.println(amount + " Yen = " + d.format(Rupee) + " Ruppes");

                Dollar = amount *0.0071;
                System.out.println(amount + " Yen = " + d.format(Dollar) + " Dollar");

                Pound = amount *0.0056;
                System.out.println(amount + " Yen = " + d.format(Pound) + " Pound");

                Euro = amount *0.0065;
                System.out.println(amount + " Yen = " + d.format(Euro) + " Euro");

                Renminbi = amount *0.051;
                System.out.println(amount + " Yen = " + d.format(Renminbi) + "Renminbi");
                break;

            case 6:  // Renminbi Conversion
                Rupee = amount *11.50;
                System.out.println(amount + " Renminbi = " + d.format(Rupee) + " Ruppes");

                Dollar = amount *0.14;
                System.out.println(amount + " Renminbi = " + d.format(Dollar) + " Dollar");

                Pound = amount *0.11;
                System.out.println(amount + " Renminbi = " + d.format(Pound) + " Pound");

                Euro = amount *0.13;
                System.out.println(amount + " Renminbi = " + d.format(Euro) + " Euro");

                Yen = amount *19.69;
                System.out.println(amount + " Renminbi = " + d.format(Yen) + " Yen");
                break;

            //Default case
            default:
                System.out.println("Please Write Correct Input");
        }
    }
}