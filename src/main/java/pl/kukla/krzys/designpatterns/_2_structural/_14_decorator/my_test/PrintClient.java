package pl.kukla.krzys.designpatterns._2_structural._14_decorator.my_test;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class PrintClient {
    private final Printer printer;

    void runPrint() {
        printer.print();
    }
}
