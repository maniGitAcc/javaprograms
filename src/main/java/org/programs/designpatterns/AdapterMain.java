package org.programs.designpatterns;

// Target interface

interface Printer {
    void print();
}

// Adaptee class (legacy system)
class LegacyPrinter {
    public void printDocument() {
        System.out.println("Printing document from legacy printer");
    }
}

// Adapter class
class LegacyPrinterAdapter implements Printer {
    private LegacyPrinter legacyPrinter;

    public LegacyPrinterAdapter(LegacyPrinter legacyPrinter) {
        this.legacyPrinter = legacyPrinter;
    }

    @Override
    public void print() {
        legacyPrinter.printDocument();
    }
}

// Client code
public class AdapterMain {
    public static void main(String[] args) {
        LegacyPrinter legacyPrinter = new LegacyPrinter();
        LegacyPrinterAdapter adapter = new LegacyPrinterAdapter(legacyPrinter);

        adapter.print(); // Output: Printing document from legacy printer
    }
}
