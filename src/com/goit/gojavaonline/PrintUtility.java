package com.goit.gojavaonline;

import java.util.List;

public class PrintUtility {
    public static StringBuilder listToString(List<? extends Printable> printableList){
        StringBuilder result = new StringBuilder();
        for(Printable printable : printableList){
            result.append(printable.print()).append("\n");
        }
        return result;
    }

    public static StringBuilder listToTable(List<? extends Printable> printableList){
        StringBuilder result = new StringBuilder();
        for(Printable printable : printableList){
            result.append(String.format("| %-10s | %-10s |\n", printable.printTableLine() ));
        }
        return result;
    }
}
