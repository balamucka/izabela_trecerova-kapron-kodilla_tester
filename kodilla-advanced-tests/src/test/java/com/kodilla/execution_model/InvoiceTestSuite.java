package com.kodilla.execution_model;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTestSuite {

    Invoice invoice = new Invoice();
    Item book = new Item("Book", 30.99);
    Item newspaper = new Item("Newspaper", 5.00);
    Item comic = new Item("Comic", 50.00);

    @Test
    public void shouldAddItemsToInvoice() {

        int numberOfItems = invoice.getSize();
        assertEquals(3, numberOfItems);
    }

    @Test
    public void shouldGetExistingItem() {

        Item result = invoice.getItem(0);
        assertEquals("Book", result.getName());
        assertEquals(30.99, result.getPrice(), 0.01);
    }

    @Test
    public void shouldReturnNullWhenPassingNegativeIndex() {

        Item result = invoice.getItem(-3);
        assertNull(result);
    }

    @Test
    public void shouldReturnNullWhenPassingOutOfRangeIndex() {

        Item result = invoice.getItem(8);
        assertNull(result);
    }

    @Test
    public void shouldClearInvoice() {

        invoice.clear();
        assertEquals(0, invoice.getSize());
    }

    @BeforeEach
    public void initializeInvoice() {
        invoice.addItem(book);
        invoice.addItem(newspaper);
        invoice.addItem(comic);
    }

    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finnish testing");
    }
}