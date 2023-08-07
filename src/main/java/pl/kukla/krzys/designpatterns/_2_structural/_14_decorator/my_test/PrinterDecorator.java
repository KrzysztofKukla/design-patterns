package pl.kukla.krzys.designpatterns._2_structural._14_decorator.my_test;

class PrinterDecorator implements Printer {

    private Printer printer;

    @Override
    public String print() {
        return "dupa blada " + printer.print();
    }
}
