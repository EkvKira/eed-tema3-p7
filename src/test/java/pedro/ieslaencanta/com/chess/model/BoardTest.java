/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package pedro.ieslaencanta.com.chess.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import pedro.ieslaencanta.com.chess.model.ChessPiece.King;
import pedro.ieslaencanta.com.chess.model.ChessPiece.Piece;

/**
 *
 * @author kirae
 */
public class BoardTest {
    
    public BoardTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
/*En metodo GetCell no podemos hacer test porque tenemos error "ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 8", 
    que significa que este metodo no vuelve null en caso cuando tenemos row o col menor que 0 y mayor que 7.*/
        @Test
    public void testGetCell_e1a() {
        Board instance = new Board();
        Cell celda = instance.getCell(-3, 0);
  //      assertTrue(celda instanceof Cell);
        assertNull(celda);
    }

    @Test
    public void testGetCell_e1b() {
        Board instance = new Board();
        Cell result = instance.getCell(10, 0);
        assertNull(result);
    }
    /**/
    @Test
    public void testGetCell_e1c() {
        Board instance = new Board();
        Cell celda = instance.getCell(1, 0);
        assertTrue(celda instanceof Cell);
    }
    
    
     @Test
    public void testGetCell_e2c() {
        Board instance = new Board();
        Cell celda = instance.getCell(7, 2);
        assertTrue(celda instanceof Cell);
    }
    
      @Test
    public void testGetCell_e2a() {
        Board instance = new Board();
        Cell celda = instance.getCell(0, -3);
        assertNull(celda);
    }
    @Test
    public void testGetCell_e2b() {
        Board instance = new Board();
        Cell celda = instance.getCell(0, 10);
        assertNull(celda);
    }
        @Test
    public void testGetCell_l1a() {
        Board instance = new Board();
        Cell celda = instance.getCell(-1, 0);
        assertNull(celda);
    }
        @Test
    public void testGetCell_l1b() {
        Board instance = new Board();
        Cell celda = instance.getCell(0, 0);
        assertTrue(celda instanceof Cell);
    }
    @Test
    public void testGetCell_l1c() {
        Board instance = new Board();
        Cell celda = instance.getCell(7, 0);
        assertTrue(celda instanceof Cell);
    }
     @Test
    public void testGetCell_l1d() {
        Board instance = new Board();
        Cell celda = instance.getCell(8, 0);
        assertNull(celda);
    }
    
    @Test
    public void testGetCell_l2a() {
        Board instance = new Board();
        Cell celda = instance.getCell(0, -1);
        assertNull(celda);
    }
    
    @Test
    public void testGetCell_l2b() {
        Board instance = new Board();
        Cell celda = instance.getCell(2, 0);
        assertTrue(celda instanceof Cell);
    }
    @Test
    public void testGetCell_l2c() {
        Board instance = new Board();
        Cell celda = instance.getCell(0, 7);
        assertTrue(celda instanceof Cell);
    }
    @Test
    public void testGetCell_l2d() {
        Board instance = new Board();
        Cell celda = instance.getCell(0, 10);
        assertNull(celda);
    }
    
    @Test
    public void testMove_pi1_pf2() {
        Board instance = new Board();
        Move result = instance.move(-2, 5, 1, 1);
        assertNull(result);
    }
        @Test
    public void testMove_pi2_pf2() {
        Board instance = new Board();
        Move result = instance.move(1, 1, 1, 2);
        assertTrue(result instanceof Move);
    }
        @Test
    public void testMove_pi4_pf2() {
        Board instance = new Board();
        Move result = instance.move(8, 1, 1, 1);
        assertNull(result);
    }
        @Test
    public void testMove_pi2_pf1() {
        Board instance = new Board();
        Move result = instance.move(1, 1, -2, 5);
        assertNull(result);
    }
        @Test
    public void testMove_pi2_pf3() {
        Board instance = new Board();
        Move result = instance.move(1, 2, 1, 8);
        assertNull(result);
    }
    
        @Test
    public void testMove_pi3_pf2() {
        Board instance = new Board();
        Move result = instance.move(2, 3, 2, 4);
        assertNull(result);
    }
    
     @Test
    public void testMove_pi2_pf2_entrada5_0() {        
        Board instance = new Board();
        instance.move(6, 0, 5, 0);
        Move result = instance.move(5, 0, 4, 0);
        assertTrue(result instanceof Move);
    }
     @Test
    public void testMove_ls1() {
        Board instance = new Board();
        Move result = instance.move(-1, 0, 1, 1);
        assertNull(result);
    }
     @Test
    public void testMove_ls2() {
        Board instance = new Board();
        Move result = instance.move(0, -1, 1, 1);
        assertNull(result);
    }
     @Test
    public void testMove_ls3() {
        Board instance = new Board();
        Move result = instance.move(0, 0, 1, 1);
        assertTrue(result instanceof Move);
    }
    @Test
    public void testMove_ls4() {
        Board instance = new Board();
        Move result = instance.move(7, 7, 1, 1);
        assertTrue(result instanceof Move);
    }
    @Test
    public void testMove_ls5() {
        Board instance = new Board();
        Move result = instance.move(8, 7, 1, 1);
        assertNull(result);
    }
    @Test
    public void testMove_ls6() {
        Board instance = new Board();
        Move result = instance.move(7, 8, 1, 1);
        assertNull(result);
    }
    @Test
    public void testMove_lf1() {
        Board instance = new Board();
        Move result = instance.move(1, 1, -1, 0);
        assertNull(result);
    }
    @Test
    public void testMove_lf2() {
        Board instance = new Board();
        Move result = instance.move(1, 1, 0, -1);
        assertNull(result);
    }
    @Test
    public void testMove_lf3() {
        Board instance = new Board();
        Move result = instance.move(1, 1, 0, 0);
        assertTrue(result instanceof Move);
    }
     @Test
    public void testMove_lf4() {
        Board instance = new Board();
        Move result = instance.move(1, 1, 7, 7);
        assertTrue(result instanceof Move);
    }
    @Test
    public void testMove_lf5() {
        Board instance = new Board();
        Move result = instance.move(1, 1, 8, 7);
        assertNull(result);
    }
    @Test
    public void testMove_lf6() {
        Board instance = new Board();
        Move result = instance.move(1, 1, 7, 8);
        assertNull(result);
    }
    //    @Test
//    public void testGetCell() {
//        Board instance = new Board();
//        Cell expResult = null;
//        Cell result = instance.getCell(-3, 1);
//        assertEquals(expResult, result);
//    }
    
//    @Test
//    public void testReset() {
//        System.out.println("reset");
//        Board instance = new Board();
//        instance.reset();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getHeight method, of class Board.
//     */
//    @Test
//    public void testGetHeight() {
//        System.out.println("getHeight");
//        Board instance = new Board();
//        int expResult = 0;
//        int result = instance.getHeight();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getWidht method, of class Board.
//     */
//    @Test
//    public void testGetWidht() {
//        System.out.println("getWidht");
//        Board instance = new Board();
//        int expResult = 0;
//        int result = instance.getWidht();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of move method, of class Board.
//     */
//    @Test
//    public void testMove() {
//        System.out.println("move");
//        int star_row = 0;
//        int star_col = 0;
//        int end_row = 0;
//        int end_col = 0;
//        Board instance = new Board();
//        Move expResult = null;
//        Move result = instance.move(star_row, star_col, end_row, end_col);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of toString method, of class Board.
//     */
//    @Test
//    public void testToString() {
//        System.out.println("toString");
//        Board instance = new Board();
//        String expResult = "";
//        String result = instance.toString();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getKingBlack method, of class Board.
//     */
//    @Test
//    public void testGetKingBlack() {
//        System.out.println("getKingBlack");
//        Board instance = new Board();
//        King expResult = null;
//        King result = instance.getKingBlack();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getKingWhite method, of class Board.
//     */
//    @Test
//    public void testGetKingWhite() {
//        System.out.println("getKingWhite");
//        Board instance = new Board();
//        King expResult = null;
//        King result = instance.getKingWhite();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
}
