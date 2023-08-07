package pl.kukla.krzys.designpatterns._2_structural._14_decorator.my_test;

class PdfPrinter implements Printer {
    @Override
    public String print() {
        return "pdf printer";
    }
}
