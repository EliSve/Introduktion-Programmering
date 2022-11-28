import org.junit.Test;

import java.util.Scanner;

public class Logic {
    public static void main(String[] args) {

        String myInput = "";
        Counter counter = new Counter();




        //gör nedan tills du skriver Stop
        while (!myInput.equals("Stop")) {
            //spara resultatet i counter
            counter.increasemyRows();


            Scanner scan = new Scanner(System.in);
            System.out.println("Write whatever you want");
            myInput = scan.nextLine();


            if (!myInput.equals("Stop")) {
                counter.increasemyRows();
            }

            //läs in ny rad
            myInput = scan.nextLine();



        }
        //hämta ifrån counter resultatet och skriver ut det korrekt nu.
        System.out.println("The result is: ");
        System.out.println(counter.getMyCounter());
        System.out.println(counter.getMyRows());

        //testen
        {
                    public void shouldReturnCorrectmyRows() {
                    public void shouldNotAddCharacterCountIfStop()
                    public void shouldAddCharacterCount() {

            }
        }
        }

    }
}


