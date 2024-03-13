public class Main {
    public static void main(String[] args) {

        Printer printer = new Printer(75, false);
        System.out.println("Initial printed page count = " + printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(5);
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n",
                    pagesPrinted, printer.getPagesPrinted());



    }
}