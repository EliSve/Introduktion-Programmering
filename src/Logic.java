import java.util.Scanner;


public class Logic {
    public static void main(String[] args) {

        String myInput = "";
        Counter counter = new Counter();
        Scanner scan = new Scanner(System.in);
        System.out.println("Write whatever you want");
        //läs in första raden
        myInput = scan.nextLine();
        //gör nedan tills du skriver Stop
        while (!myInput.equals("Stop")) {
            //spara resultatet i counter


            //läs in ny rad
            myInput = scan.nextLine();

        }
        //hämta ifrån counter resultatet och skriv ut det
        System.out.println("The result is: ");

    }
}
