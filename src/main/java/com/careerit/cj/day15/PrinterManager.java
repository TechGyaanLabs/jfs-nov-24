package com.careerit.cj.day15;

class Printer{
    public void print(String data){
        System.out.println("Printer printing data : "+data);
    }
}
class SonyPrinter extends Printer{
    public void print(String data){
        System.out.println("Sony Printer printing data : "+data);
    }
    public void print(String data,String color){
        System.out.println("Sony Printer printing data : "+data+" with color : "+color);
    }
}
class HPPrinter extends Printer{
    public void print(String data){
        System.out.println("HP Printer printing data : "+data);
    }
}
class CanonPrinter extends Printer{
    public void print(String data){
        System.out.println("Canon Printer printing data : "+data);
    }
}
enum PrinterType{
    SONY,HP,CANON
}

public class PrinterManager {

    public static void main(String[] args) {

            Printer obj = getSelectedPrinter(PrinterType.SONY);
            obj.print("Hello");
            if(obj instanceof SonyPrinter ref){
                ref.print("Hello","Red");
            }

    }

    private static Printer getSelectedPrinter(PrinterType printerType) {
        return switch (printerType) {
            case SONY -> new SonyPrinter();
            case HP -> new HPPrinter();
            case CANON -> new CanonPrinter();
        };
    }
}
