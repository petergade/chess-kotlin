package org.kbem.chess



class ChessGame {
    val board: List<List<Piece?>> = listOf(listOf(Rook(Color.BLACK), Knight(Color.BLACK), Bishop(Color.BLACK), Queen(Color.BLACK), King(Color.BLACK), Bishop(Color.BLACK), Knight(Color.BLACK), Rook(Color.BLACK)),
        listOf(null, null, null, null, null, null, null, null),
        listOf(null, null, null, null, null, null, null, null),
        listOf(null, null, null, null, null, null, null, null),
        listOf(null, null, null, null, null, null, null, null),
        listOf(null, null, null, null, null, null, null, null),
        listOf(null, null, null, null, null, null, null, null),
        listOf(Rook(Color.WHITE), Knight(Color.WHITE), Bishop(Color.WHITE), Queen(Color.WHITE), King(Color.WHITE), Bishop(Color.WHITE), Knight(Color.WHITE), Rook(Color.WHITE)))
}

open abstract class Piece(val color: Color) {
    abstract val symbol: String;

    override fun toString(): String {
        return if (color == Color.WHITE) "$symbol" else ".$symbol."
    }
}

class Pawn(color: Color): Piece(color) {
    override val symbol = ""
}

class Rook(color: Color): Piece(color) {
    override val symbol = "R"
}

class Knight(color: Color): Piece(color) {
    override val symbol = "K"
}

class Bishop(color: Color): Piece(color) {
    override val symbol = "B"
}

class Queen(color: Color): Piece(color) {
    override val symbol = "Q"
}

class King(color: Color): Piece(color) {
    override val symbol = "K"
}

enum class Color {
    WHITE, BLACK
}