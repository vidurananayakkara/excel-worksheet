package com.h2o.excel;

/**
 * Entry point of the excel worksheet program.
 *
 * @since 1.0.0
 */
public class Worksheet {

    /**
     * Main method of the excel worksheet program.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Cell cell = new Cell();

        // Demo only
        System.out.println("Column number for cell A1 is: " + cell.getColumnNumber("A"));
        System.out.println("Column number for cell Z1 is: " + cell.getColumnNumber("Z"));
        System.out.println("Column number for cell AZ1 is: " + cell.getColumnNumber("AZ"));
        System.out.println("Column number for cell ZZ1 is: " + cell.getColumnNumber("ZZ"));
        System.out.println("Column number for cell AAC1 is: " + cell.getColumnNumber("AAC"));
    }
}
