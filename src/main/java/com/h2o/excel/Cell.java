package com.h2o.excel;

/**
 * Class to represent a cell in an excel worksheet.
 *
 * @since 1.0.0
 */
public class Cell {

    private final int ASCII_BEFORE_ASCII_NUMBER_OF_A = 64;
    private final int NUMBER_OF_LETTERS_IN_ALPHABET = 26;

    /**
     * Find the corresponding column number for the cell sequence.
     * <p>
     * Given the sequence "B", result is 2
     * Given the sequence "AZ", result is 52
     * Given the sequence "AAC", result is 705
     *
     * @param cellSequence cell sequence
     * @return corresponding number for the given cell sequence
     */
    public int getColumnNumber(String cellSequence) {
        char[] segments = cellSequence.toCharArray();
        int cellNumber = 0;
        for (int i = 0; i < cellSequence.length(); i++) {
            if (i == 0) {
                cellNumber = getCellPaddingNumber(segments[i]);
                continue;
            }
            cellNumber = (cellNumber * NUMBER_OF_LETTERS_IN_ALPHABET) + getCellPaddingNumber(segments[i]);
        }
        return cellNumber;
    }

    /**
     * Find the cell number for the char given that sequence only has one char (1 column).
     * <p>
     * In other words, this method will return the padding number
     *
     * @param character input character to obtain the cell number given that sequence only has one char (1 column)
     * @return cell number given that the sequence consists only of 1 column
     * @throws java.lang.IllegalArgumentException thrown when an errors occurs due to illegal character. The
     *                                            character should only be an upper case letter
     */
    private int getCellPaddingNumber(char character) {
        if (!Character.isLetter(character) || !Character.isUpperCase(character)) {
            throw new IllegalArgumentException("Invalid character found in sequence: " + character);
        }
        return character - ASCII_BEFORE_ASCII_NUMBER_OF_A;
    }
}
