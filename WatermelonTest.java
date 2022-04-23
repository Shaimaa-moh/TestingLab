package LabAss1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WatermelonTest {

    @Test
    public void check_division1()throws IllegalArgumentException
    {
        Watermelon w = new Watermelon();

        assertEquals(false,w.getEven(3));
    }
    @Test
    public void check_division2 () throws IllegalArgumentException
    {
        Watermelon w = new Watermelon();

        assertEquals(true,w.getEven(6));
    }
    @Test
    public void check_division3 () throws IllegalArgumentException
    {
        Watermelon w = new Watermelon();

        assertEquals(true,w.getEven(104));

    }
    @Test
    public void check_division4 () throws IllegalArgumentException
    {
        Watermelon w = new Watermelon();

        assertEquals(true,w.getEven(70));
    }
    @Test
    public void check_division5 () throws IllegalArgumentException
    {
        Watermelon w = new Watermelon();

        assertEquals(false,w.getEven(99));
    }
    @Test
    public void check_division6() throws IllegalArgumentException
    {
        Watermelon w = new Watermelon();

        assertEquals(false,w.getEven(-4));
    }
    @Test
    public void check_division7() throws IllegalArgumentException
    {
        Watermelon w = new Watermelon();

        assertEquals(false,w.getEven(0));
    }
}