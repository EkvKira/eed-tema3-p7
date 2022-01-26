/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedro.ieslaencanta.com.chess.model.ChessPiece;

import pedro.ieslaencanta.com.chess.model.Board;
import pedro.ieslaencanta.com.chess.model.Move;
import pedro.ieslaencanta.com.chess.model.Position;

/**
 *
 * @author Pedro
 */
public class Pawn extends Piece {

    private boolean can_move_two;

    public Pawn() {
        super();
        this.can_move_two = true;
        this.letter = 'P';
    }

    public Pawn(int row, int col, PieceType type, boolean alive, String id) {
        super(row, col);
        this.can_move_two = true;
        this.type = type;
        this.alive = alive;
        this.letter = 'P';
        this.setId(id);
    }

    /*  @Override
    public boolean canmove(Board board, int row, int col) {
        boolean vuelta = false;
        if (this.type == PieceType.White) {
            //avanzar 1 posicion
            if (this.getPosition().getRow() - 1 == row
                    && this.getPosition().getCol() == col
                    && board.getCell(row, col).getPiece() == null) {
                vuelta = true;
                this.can_move_two = false;
            } else {
                if (this.getPosition().getRow() - 2 == row
                        && this.getPosition().getCol() == col
                        && this.can_move_two
                        && board.getCell(row, col).getPiece() == null) {
                    vuelta = true;
                    this.can_move_two = false;
                } //diagonales
                else {
                    if (this.getPosition().getRow() - 1 == row
                            && (this.getPosition().getCol() - 1 == col || this.getPosition().getCol() + 1 == col)
                            && board.getCell(row, col).getPiece() != null
                            && this.getType() != board.getCell(row, col).getPiece().getType()) {
                        vuelta = true;
                    }
                }
            }
        } else {
            //avanzar una posicion
            if (this.getPosition().getRow() + 1 == row
                    && this.getPosition().getCol() == col
                    && board.getCell(row, col).getPiece() == null) {
                vuelta = true;
            } else {
                if (this.getPosition().getRow() + 2 == row
                        && this.getPosition().getCol() == col
                        && this.can_move_two
                        && board.getCell(row, col).getPiece() == null) {
                    vuelta = true;
                    this.can_move_two = false;
                } else {
                    if (this.getPosition().getRow() + 1 == row
                            && (this.getPosition().getCol() - 1 == col || this.getPosition().getCol() + 1 == col)
                            && board.getCell(row, col).getPiece() != null
                            && this.getType() != board.getCell(row, col).getPiece().getType()) {
                        vuelta = true;
                    }
                }
            }
        }
        if (vuelta && this.getPosition().equals(new Position(row, col))) {
            vuelta = false;
        }
        return vuelta;
    }
     */
    @Override
    public Move move(Board board, int row, int col) {
        this.can_move_two = false;
        
        return super.move(board, row, col);
        
    }

    @Override
    public Move[] getMoves(Board board
    ) {
        //4 posibles movimiento avanza 1, 2(primera vez), diagonal izquierda, diagonal drecha
        int c = 0;

        if (this.moves == null) {
            this.moves = new Move[4];
            if (this.type == PieceType.White) {
                //si puede avanzar 1 casilla hacia abajo
                if (this.getPosition().getRow() + 1 >= 0
                        && board.getCell(this.getPosition().getRow() - 1, this.getPosition().getCol()).getPiece() == null) {
                    moves[0] = new Move(this, null, this.getPosition(), new Position(this.getPosition().getRow() - 1, this.getPosition().getCol()));
                }
                //si puede avanzar 2 casilla hacia arriba
                if (this.getPosition().getRow() - 2 >= 0
                        && this.can_move_two
                        && board.getCell(this.getPosition().getRow() - 2, this.getPosition().getCol()).getPiece() == null) {
                    moves[1] = new Move(this, null, this.getPosition(), new Position(this.getPosition().getRow() - 2, this.getPosition().getCol()));

                }
                //si puede avanzar hacia la DIAGONAL derecha si no es un extremo
                //existe una pieza y no es blanca x-1, y+1
                if (this.getPosition().getRow() - 1 >= 0
                        && this.getPosition().getCol() + 1 < board.getWidht()
                        && board.getCell(this.getPosition().getRow() - 1, this.getPosition().getCol() + 1).getPiece() != null
                        && board.getCell(this.getPosition().getRow() - 1, this.getPosition().getCol() + 1).getPiece().getType() != this.getType()) {
                    moves[2] = new Move(this, board.getCell(this.getPosition().getRow() - 1, this.getPosition().getCol() + 1).getPiece(), this.getPosition(), new Position(this.getPosition().getRow() - 1, this.getPosition().getCol() + 1));
                }
                //si puede avanzar hacia la DIAGONAL izquierda si no es un extremo
                //existe una pieza y no es blanca x-1, y-1
                if (this.getPosition().getRow() - 1 > 0
                        && this.getPosition().getCol() - 1 >= 0
                        && board.getCell(this.getPosition().getRow() - 1, this.getPosition().getCol() - 1).getPiece() != null
                        && board.getCell(this.getPosition().getRow() - 1, this.getPosition().getCol() - 1).getPiece().getType() != this.getType()) {
                    moves[3] = new Move(this, board.getCell(this.getPosition().getRow() - 1, this.getPosition().getCol() - 1).getPiece(), this.getPosition(), new Position(this.getPosition().getRow() - 1, this.getPosition().getCol() - 1));
                }
            } //fichas negras
            else {
                //si puede avanzar 1 casilla hacia abajo
                if (this.getPosition().getRow() + 1 < board.getHeight()
                        && board.getCell(this.getPosition().getRow() + 1, this.getPosition().getCol()).getPiece() == null) {
                    moves[0] = new Move(this, null, this.getPosition(), new Position(this.getPosition().getRow() + 1, this.getPosition().getCol()));
                }
                //si puede avanzar 2 casilla hacia abajo
                if (this.getPosition().getRow() + 2 < board.getHeight()
                        && this.can_move_two
                        && board.getCell(this.getPosition().getRow() + 2, this.getPosition().getCol()).getPiece() == null) {
                    moves[1] = new Move(this, null, this.getPosition(), new Position(this.getPosition().getRow() + 2, this.getPosition().getCol()));
                }
                //si puede avanzar hacia la DIAGONAL derecha si no es un extremo
                //existe una pieza y no es negra x+1, y+1
                if (this.getPosition().getRow() + 1 >= 0
                        && this.getPosition().getCol() + 1 < board.getWidht()
                        
                        && board.getCell(this.getPosition().getRow() + 1, this.getPosition().getCol() + 1).getPiece() != null
                        && board.getCell(this.getPosition().getRow() + 1, this.getPosition().getCol() + 1).getPiece().getType() != this.getType()) {
                    moves[2] = new Move(this, board.getCell(this.getPosition().getRow() + 1, this.getPosition().getCol() + 1).getPiece(), this.getPosition().clone(), new Position(this.getPosition().getRow() + 1, this.getPosition().getCol() + 1));
                }
                //si puede avanzar hacia la DIAGONAL izquierda si no es un extremo
                //existe una pieza y no es blanca x-1, y+1
                if (this.getPosition().getRow() + 1 >= 0
                        && this.getPosition().getCol() - 1 >= 0
                        
                        && board.getCell(this.getPosition().getRow() + 1, this.getPosition().getCol() - 1).getPiece() != null
                        && board.getCell(this.getPosition().getRow() + 1, this.getPosition().getCol() - 1).getPiece().getType() != this.getType()) {
                    moves[3] = new Move(this, board.getCell(this.getPosition().getRow() + 1, this.getPosition().getCol() - 1).getPiece(), this.getPosition().clone(), new Position(this.getPosition().getRow() + 1, this.getPosition().getCol() - 1));
                }
            }
        }
        return moves;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
