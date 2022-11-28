public class Counter {
    //värden
    private int myRows;
    private int myCounter;

    public Counter() {

    }
    // Skapar en metod som räknar/hämtar när den funkar
    public int getMyCounter() { return myCounter;}
    public int getMyRows() { return myRows;}



    // Ska räkna tecken
    public void myInput(String myInput) {
        if (!myInput.equals("Stop")) {
                myCounter += myInput.length();

        }

    }
    // försöker öka rader
    public void increasemyRows() {
        this.myRows++;

    }
}

