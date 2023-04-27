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
import pedro.ieslaencanta.com.chess.model.ChessPiece.Bishop;
import pedro.ieslaencanta.com.chess.model.ChessPiece.King;
import pedro.ieslaencanta.com.chess.model.ChessPiece.Knight;
import pedro.ieslaencanta.com.chess.model.ChessPiece.Pawn;
import pedro.ieslaencanta.com.chess.model.ChessPiece.Piece;
import pedro.ieslaencanta.com.chess.model.ChessPiece.PieceType;
import pedro.ieslaencanta.com.chess.model.ChessPiece.Queen;
import pedro.ieslaencanta.com.chess.model.ChessPiece.Rook;

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
//        @Test
//    public void testGetCell_e1a() {
//        Board instance = new Board();
//        Cell celda = instance.getCell(-3, 0);
//  //      assertTrue(celda instanceof Cell);
//        assertNull(celda);
//    }
//
//    @Test
//    public void testGetCell_e1b() {
//        Board instance = new Board();
//        Cell result = instance.getCell(10, 0);
//        assertNull(result);
//    }
//    /**/
//    @Test
//    public void testGetCell_e1c() {
//        Board instance = new Board();
//        Cell celda = instance.getCell(1, 0);
//        assertTrue(celda instanceof Cell);
//    }
//    
//    
//     @Test
//    public void testGetCell_e2c() {
//        Board instance = new Board();
//        Cell celda = instance.getCell(7, 2);
//        assertTrue(celda instanceof Cell);
//    }
//    
//      @Test
//    public void testGetCell_e2a() {
//        Board instance = new Board();
//        Cell celda = instance.getCell(0, -3);
//        assertNull(celda);
//    }
//    @Test
//    public void testGetCell_e2b() {
//        Board instance = new Board();
//        Cell celda = instance.getCell(0, 10);
//        assertNull(celda);
//    }
//        @Test
//    public void testGetCell_l1a() {
//        Board instance = new Board();
//        Cell celda = instance.getCell(-1, 0);
//        assertNull(celda);
//    }
//        @Test
//    public void testGetCell_l1b() {
//        Board instance = new Board();
//        Cell celda = instance.getCell(0, 0);
//        assertTrue(celda instanceof Cell);
//    }
//    @Test
//    public void testGetCell_l1c() {
//        Board instance = new Board();
//        Cell celda = instance.getCell(7, 0);
//        assertTrue(celda instanceof Cell);
//    }
//     @Test
//    public void testGetCell_l1d() {
//        Board instance = new Board();
//        Cell celda = instance.getCell(8, 0);
//        assertNull(celda);
//    }
//    
//    @Test
//    public void testGetCell_l2a() {
//        Board instance = new Board();
//        Cell celda = instance.getCell(0, -1);
//        assertNull(celda);
//    }
//    
//    @Test
//    public void testGetCell_l2b() {
//        Board instance = new Board();
//        Cell celda = instance.getCell(2, 0);
//        assertTrue(celda instanceof Cell);
//    }
//    @Test
//    public void testGetCell_l2c() {
//        Board instance = new Board();
//        Cell celda = instance.getCell(0, 7);
//        assertTrue(celda instanceof Cell);
//    }
//    @Test
//    public void testGetCell_l2d() {
//        Board instance = new Board();
//        Cell celda = instance.getCell(0, 10);
//        assertNull(celda);
//    }
//    
//    @Test
//    public void testMove_pi1_pf2() {
//        Board instance = new Board();
//        Move result = instance.move(-2, 5, 1, 1);
//        assertNull(result);
//    }
//        @Test
//    public void testMove_pi2_pf2() {
//        Board instance = new Board();
//        Move result = instance.move(1, 1, 1, 2);
//        assertTrue(result instanceof Move);
//    }
//        @Test
//    public void testMove_pi4_pf2() {
//        Board instance = new Board();
//        Move result = instance.move(8, 1, 1, 1);
//        assertNull(result);
//    }
//        @Test
//    public void testMove_pi2_pf1() {
//        Board instance = new Board();
//        Move result = instance.move(1, 1, -2, 5);
//        assertNull(result);
//    }
//        @Test
//    public void testMove_pi2_pf3() {
//        Board instance = new Board();
//        Move result = instance.move(1, 2, 1, 8);
//        assertNull(result);
//    }
//    
//        @Test
//    public void testMove_pi3_pf2() {
//        Board instance = new Board();
//        Move result = instance.move(2, 3, 2, 4);
//        assertNull(result);
//    }
//    
//     @Test
//    public void testMove_pi2_pf2_entrada5_0() {        
//        Board instance = new Board();
//        instance.move(6, 0, 5, 0);
//        Move result = instance.move(5, 0, 4, 0);
//        assertTrue(result instanceof Move);
//    }
//     @Test
//    public void testMove_ls1() {
//        Board instance = new Board();
//        Move result = instance.move(-1, 0, 1, 1);
//        assertNull(result);
//    }
//     @Test
//    public void testMove_ls2() {
//        Board instance = new Board();
//        Move result = instance.move(0, -1, 1, 1);
//        assertNull(result);
//    }
//     @Test
//    public void testMove_ls3() {
//        Board instance = new Board();
//        Move result = instance.move(0, 0, 1, 1);
//        assertTrue(result instanceof Move);
//    }
//    @Test
//    public void testMove_ls4() {
//        Board instance = new Board();
//        Move result = instance.move(7, 7, 1, 1);
//        assertTrue(result instanceof Move);
//    }
//    @Test
//    public void testMove_ls5() {
//        Board instance = new Board();
//        Move result = instance.move(8, 7, 1, 1);
//        assertNull(result);
//    }
//    @Test
//    public void testMove_ls6() {
//        Board instance = new Board();
//        Move result = instance.move(7, 8, 1, 1);
//        assertNull(result);
//    }
//    @Test
//    public void testMove_lf1() {
//        Board instance = new Board();
//        Move result = instance.move(1, 1, -1, 0);
//        assertNull(result);
//    }
//    @Test
//    public void testMove_lf2() {
//        Board instance = new Board();
//        Move result = instance.move(1, 1, 0, -1);
//        assertNull(result);
//    }
//    @Test
//    public void testMove_lf3() {
//        Board instance = new Board();
//        Move result = instance.move(1, 1, 0, 0);
//        assertTrue(result instanceof Move);
//    }
//     @Test
//    public void testMove_lf4() {
//        Board instance = new Board();
//        Move result = instance.move(1, 1, 7, 7);
//        assertTrue(result instanceof Move);
//    }
//    @Test
//    public void testMove_lf5() {
//        Board instance = new Board();
//        Move result = instance.move(1, 1, 8, 7);
//        assertNull(result);
//    }
//    @Test
//    public void testMove_lf6() {
//        Board instance = new Board();
//        Move result = instance.move(1, 1, 7, 8);
//        assertNull(result);
//    }
    
   
     @Test
    public void testReset_Rook_black_00() {
        Board instance = new Board();
        instance.reset();
        Piece result = instance.getCell(0, 0).getPiece();
        PieceType result1 = instance.getCell(0, 0).getPiece().getType();
        assertTrue(result instanceof Rook && result1 == PieceType.Black);
    }
         @Test
    public void testReset_Rook_black_07() {
        Board instance = new Board();
        instance.reset();
        Piece result = instance.getCell(0, 7).getPiece();
        PieceType result1 = instance.getCell(0, 7).getPiece().getType();
        assertTrue(result instanceof Rook && result1 == PieceType.Black);
    }
         @Test
    public void testReset_Rook_white_70() {
        Board instance = new Board();
        instance.reset();
        Piece result = instance.getCell(7, 0).getPiece();
        PieceType result1 = instance.getCell(7, 0).getPiece().getType();
        assertTrue(result instanceof Rook && result1 == PieceType.White);
    }
    @Test
    public void testReset_Rook_white_77() {
        Board instance = new Board();
        instance.reset();
        Piece result = instance.getCell(7, 7).getPiece();
        PieceType result1 = instance.getCell(7, 7).getPiece().getType();
        assertTrue(result instanceof Rook && result1 == PieceType.White);
    }
    @Test
    public void testReset_Knight_black_01() {
        Board instance = new Board();
        instance.reset();
        Piece result = instance.getCell(0, 1).getPiece();
        PieceType result1 = instance.getCell(0, 1).getPiece().getType();
        assertTrue(result instanceof Knight && result1 == PieceType.Black);
    }
    @Test
    public void testReset_Knight_black_06() {
        Board instance = new Board();
        instance.reset();
        Piece result = instance.getCell(0, 6).getPiece();
        PieceType result1 = instance.getCell(0, 6).getPiece().getType();
        assertTrue(result instanceof Knight && result1 == PieceType.Black);
    }
    @Test
    public void testReset_Knight_white_71() {
        Board instance = new Board();
        instance.reset();
        Piece result = instance.getCell(7, 1).getPiece();
        PieceType result1 = instance.getCell(7, 1).getPiece().getType();
        assertTrue(result instanceof Knight && result1 == PieceType.White);
    }
    @Test
    public void testReset_Knight_white_76() {
        Board instance = new Board();
        instance.reset();
        Piece result = instance.getCell(7, 6).getPiece();
        PieceType result1 = instance.getCell(7, 6).getPiece().getType();
        assertTrue(result instanceof Knight && result1 == PieceType.White);
    }
    @Test
    public void testReset_Bishop_black_02() {
        Board instance = new Board();
        instance.reset();
        Piece result = instance.getCell(0, 2).getPiece();
        PieceType result1 = instance.getCell(0, 2).getPiece().getType();
        assertTrue(result instanceof Bishop && result1 == PieceType.Black);
    }
    @Test
    public void testReset_Bishop_black_05() {
        Board instance = new Board();
        instance.reset();
        Piece result = instance.getCell(0, 5).getPiece();
        PieceType result1 = instance.getCell(0, 5).getPiece().getType();
        assertTrue(result instanceof Bishop && result1 == PieceType.Black);
    }
    @Test
    public void testReset_Bishop_white_72() {
        Board instance = new Board();
        instance.reset();
        Piece result = instance.getCell(7, 2).getPiece();
        PieceType result1 = instance.getCell(7, 2).getPiece().getType();
        assertTrue(result instanceof Bishop && result1 == PieceType.White);
    }
    @Test
     public void testReset_Bishop_white_75() {
        Board instance = new Board();
        instance.reset();
        Piece result = instance.getCell(7, 5).getPiece();
        PieceType result1 = instance.getCell(7, 5).getPiece().getType();
        assertTrue(result instanceof Bishop && result1 == PieceType.White);
    }
     @Test
     public void testReset_King_black_04() {
        Board instance = new Board();
        instance.reset();
        Piece result = instance.getCell(0, 4).getPiece();
        PieceType result1 = instance.getCell(0, 4).getPiece().getType();
        assertTrue(result instanceof King && result1 == PieceType.Black);
     }
     @Test
        public void testReset_King_white_74() {
        Board instance = new Board();
        instance.reset();
        Piece result = instance.getCell(7, 4).getPiece();
        PieceType result1 = instance.getCell(7, 4).getPiece().getType();
        assertTrue(result instanceof King && result1 == PieceType.White);
    }
        @Test
     public void testReset_Queen_black_03() {
        Board instance = new Board();
        instance.reset();
        Piece result = instance.getCell(0, 3).getPiece();
        PieceType result1 = instance.getCell(0, 3).getPiece().getType();
        assertTrue(result instanceof Queen && result1 == PieceType.Black);
     }
         @Test
     public void testReset_Queen_white_73() {
        Board instance = new Board();
        instance.reset();
        Piece result = instance.getCell(7, 3).getPiece();
        PieceType result1 = instance.getCell(7, 3).getPiece().getType();
        assertTrue(result instanceof Queen && result1 == PieceType.White);
     }
         @Test
     public void testReset_Pawn_black_17() {
        Board instance = new Board();
        instance.reset();
        Piece result = instance.getCell(1, 7).getPiece();
        PieceType result1 = instance.getCell(1, 7).getPiece().getType();
        assertTrue(result instanceof Pawn && result1 == PieceType.Black);
     }
      @Test
     public void testReset_Pawn_black_15() {
        Board instance = new Board();
        instance.reset();
        Piece result = instance.getCell(1, 5).getPiece();
        PieceType result1 = instance.getCell(1, 5).getPiece().getType();
        assertTrue(result instanceof Pawn && result1 == PieceType.Black);
     }
      @Test
     public void testReset_Pawn_white_66() {
        Board instance = new Board();
        instance.reset();
        Piece result = instance.getCell(6, 6).getPiece();
        PieceType result1 = instance.getCell(6, 6).getPiece().getType();
        assertTrue(result instanceof Pawn && result1 == PieceType.White);
     }
      @Test
     public void testReset_Pawn_white_62() {
        Board instance = new Board();
        instance.reset();
        Piece result = instance.getCell(6, 2).getPiece();
        PieceType result1 = instance.getCell(6, 2).getPiece().getType();
        assertTrue(result instanceof Pawn && result1 == PieceType.White);
     }
     @Test
    public void testReset_Null_20() {
        Board instance = new Board();
        instance.reset();
        Piece result = instance.getCell(2, 0).getPiece();
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

    /**
     * Test of reset method, of class Board.
     */
 
}
