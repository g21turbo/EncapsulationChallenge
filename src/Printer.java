public class Printer {

    int tonerLevel = 100;
    int pagesPrinted;
    boolean duplex = true;

    public int addToner(int tonerAmount) {
        tonerLevel = tonerLevel + tonerAmount;

        if (tonerLevel > 100 || tonerLevel < 0) {
            return -1;
        } else {
            return tonerLevel;
        }
    }

    public int printPages(int pages) {

        if (!duplex) {
            return pages;
        } else {
            pages = pages / 2;
        }
        return pages;
    }

}
