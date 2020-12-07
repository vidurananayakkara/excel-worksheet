package com.h2o.excel;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Test class to test the functionality of cells.
 *
 * @since 1.0.0
 */
public class CellTest {

    // POST
    @Test(description = "Tests whether the cell number is properly returned.")
    public void getColumnNumber() {
        Cell cell = new Cell();

        // Happy path
        Assert.assertEquals(cell.getColumnNumber("A"), 1);
        Assert.assertEquals(cell.getColumnNumber("Z"), 26);
        Assert.assertEquals(cell.getColumnNumber("AZ"), 52);
        Assert.assertEquals(cell.getColumnNumber("ZZ"), 702);
        Assert.assertEquals(cell.getColumnNumber("AAC"), 705);
    }

    @Test(
        expectedExceptions = IllegalArgumentException.class,
        expectedExceptionsMessageRegExp = "Invalid character found in sequence: 2"
    )
    public void throwErrorForInvalidColumnInvalid1() {
        Cell cell = new Cell();
        cell.getColumnNumber("23");
    }

    @Test(
        expectedExceptions = IllegalArgumentException.class,
        expectedExceptionsMessageRegExp = "Invalid character found in sequence: @"
    )
    public void throwErrorForInvalidColumnInvalid2() {
        Cell cell = new Cell();
        cell.getColumnNumber("@%$");
    }

    @Test(
        expectedExceptions = IllegalArgumentException.class,
        expectedExceptionsMessageRegExp = "Invalid character found in sequence: a"
    )
    public void throwErrorForInvalidColumnInvalid3() {
        Cell cell = new Cell();
        cell.getColumnNumber("aa");
    }
}
