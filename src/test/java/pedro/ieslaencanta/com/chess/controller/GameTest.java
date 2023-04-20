/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package pedro.ieslaencanta.com.chess.controller;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import pedro.ieslaencanta.com.chess.model.Board;
import pedro.ieslaencanta.com.chess.model.ChessPiece.PieceType;
import pedro.ieslaencanta.com.chess.model.Move;

/**
 *
 * @author kirae
 */
public class GameTest {
    public GameTest() {
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

     @Test
    public void testCanMove_white_true() {
//        System.out.println("canMove");
//        int startrow = 0;
//        int startcol = 0;
//        int endrow = 0;
//        int endcol = 0;
        Game instance = new Game();
//        boolean expResult = false;
        boolean result = instance.canMove(6, 0, 5, 0);
        assertEquals(true, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
        @Test
    public void testCanMove_white_error() {
        Game instance = new Game();
        boolean result = instance.canMove(7, 0, 6, 0);
        assertEquals(false, result);
    }
    
       @Test
    public void testCanMove_vacio() {
        Game instance = new Game();
        boolean result = instance.canMove(2, 0, 3, 0);
        assertEquals(false, result);
    }
    
     @Test
    public void testCanMove_black_error() {
        Game instance = new Game();
        boolean result = instance.canMove(1, 0, 2, 0);
        assertEquals(false, result);
    }
    
         @Test
    public void testCanMove_white_error_paso() {
        Game instance = new Game();
        boolean result = instance.canMove(6, 0, 3, 0);
        assertEquals(false, result);
    }
    
    
    /**
     * Test of move method, of class Game.
     */
//    @Test
//    public void testMove() {
//        System.out.println("move");
//        int startrow = 0;
//        int startcol = 0;
//        int endrow = 0;
//        int endcol = 0;
//        Game instance = new Game();
//        Move expResult = null;
//        Move result = instance.move(startrow, startcol, endrow, endcol);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of Jaque method, of class Game.
//     */
//    @Test
//    public void testJaque() {
//        System.out.println("Jaque");
//        Game instance = new Game();
//        Move[] expResult = null;
//        Move[] result = instance.Jaque();
//        assertArrayEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of JaqueMate method, of class Game.
//     */
//    @Test
//    public void testJaqueMate() {
//        System.out.println("JaqueMate");
//        PieceType type = null;
//        Game instance = new Game();
//        boolean expResult = false;
//        boolean result = instance.JaqueMate(type);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }



//    /**
//     * Test of getCalculatesMoves method, of class Game.
//     */
//    @Test
//    public void testGetCalculatesMoves() {
//        System.out.println("getCalculatesMoves");
//        int row = 0;
//        int col = 0;
//        Game instance = new Game();
//        Move[] expResult = null;
//        Move[] result = instance.getCalculatesMoves(row, col);
//        assertArrayEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getMoves method, of class Game.
//     */
//    @Test
//    public void testGetMoves() {
//        System.out.println("getMoves");
//        int row = 0;
//        int col = 0;
//        Game instance = new Game();
//        Move[] expResult = null;
//        Move[] result = instance.getMoves(row, col);
//        assertArrayEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of reset method, of class Game.
//     */
//    @Test
//    public void testReset() {
//        System.out.println("reset");
//        Game instance = new Game();
//        instance.reset();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getPieceType method, of class Game.
//     */
//    @Test
//    public void testGetPieceType() {
//        System.out.println("getPieceType");
//        int row = 0;
//        int col = 0;
//        Game instance = new Game();
//        PieceType expResult = null;
//        PieceType result = instance.getPieceType(row, col);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getBoard method, of class Game.
//     */
//    @Test
//    public void testGetBoard() {
//        System.out.println("getBoard");
//        Game instance = new Game();
//        Board expResult = null;
//        Board result = instance.getBoard();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setBoard method, of class Game.
//     */
//    @Test
//    public void testSetBoard() {
//        System.out.println("setBoard");
//        Board board = null;
//        Game instance = new Game();
//        instance.setBoard(board);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getTurn method, of class Game.
//     */
//    @Test
//    public void testGetTurn() {
//        System.out.println("getTurn");
//        Game instance = new Game();
//        PieceType expResult = null;
//        PieceType result = instance.getTurn();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
    
        /**
     * Test of canMove method, of class Game.
     */
   
}
