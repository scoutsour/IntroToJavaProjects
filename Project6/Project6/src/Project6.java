//Nick Rodriguez

import java.util.Scanner;

 

public class Project6 {

 

       public static void main(String[] args) {

              Scanner input = new Scanner(System.in);

              final int SENTINEL = -1;

              int data = 0;

              int currentSet = 3;

              int previousSet = 3;

              int posChange = 0;

              int negChange = 0;

              int noChange = 0;

              int num1 = 0;

              int num2 = 0;

              int num3 = 0;

              int num4 = 0;

              int num5 = 0;

              //declared variables that are to be used in dial simulator

      

              currentSet = 3;

              System.out.println("Response Dial Simulator");

              System.out.println("-----------------------");

              System.out.println("Initial setting: 3");

              System.out.println("Enter the next setting (1-5) or -1 to stop.");

              data = input.nextInt();

             

              while (data != SENTINEL) 

              {

                     previousSet = currentSet;

                     currentSet = data;

                     if (previousSet > currentSet) 

                     {

                           System.out.println("Negative change: " + previousSet +  " to "  + currentSet);

                           negChange++;

                     }

                    

                     else if (previousSet < currentSet) 

                     {

                           System.out.println("Positive change: " + previousSet + " to "  + currentSet);

                           posChange++;

                     }

                     else if (previousSet == currentSet) 

                     {

                           System.out.println("No change: " + previousSet + " to " + currentSet);

                           noChange++;

                     }

                     System.out.println("Current setting: " + currentSet);

                     if (data == 1) 

                     {

                           num1++;

                     }

                     else if (data == 2)

                     {

                           num2++;

                     }

                     else if (data == 3)

                     {

                           num3++;

                     }

                     else if (data == 4)

                     {

                           num4++;

                     }

                     else if (data == 5)

                     {

                           num5++;

                     }

                     System.out.println("Enter the next setting (1-5) or -1 to stop.");

                     data = input.nextInt();

                    

              }

              System.out.println("                ");

              System.out.println("Response Summary");

              System.out.println("----------------");

              System.out.println("1 was chosen " + num1 + " time(s).");

              System.out.println("2 was chosen " + num2 + " time(s).");

              System.out.println("3 was chosen " + num3 + " time(s).");

              System.out.println("4 was chosen " + num4 + " time(s).");

              System.out.println("5 was chosen " + num5 + " time(s).");

              System.out.println("                                  ");

              System.out.println("Positive changes: " + posChange);

              System.out.println("Negative changes: " + negChange);

              System.out.println("No changes: " + noChange);

              input.close();

       }

      

      

}

 
