package Encapsulation;

public class Printer {
    private int tonerLevel;
    private boolean duplex;
    private int pagesPrinted;

    public Printer(int tonerLevel,boolean duplex){
        if(tonerLevel<0 || tonerLevel>100){
            this.tonerLevel = -1;
        }
        else {
            this.tonerLevel = tonerLevel;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;

    }

    public int addToner(int tonerAmount){
        if(tonerAmount>0 && tonerAmount<=100){
            if((tonerAmount+tonerLevel)>100){
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        }
        else {
            return -1;
        }
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        if(this.duplex==true){
            System.out.println("Printing in duplex mode");
            pagesToPrint = (pagesToPrint/2) +(pagesToPrint%2);
            this.pagesPrinted+=pagesToPrint;
        }
        else {
            this.pagesPrinted+=(pagesToPrint);
        }
        return pagesToPrint;
    }

}
