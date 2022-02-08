import com.andreapivetta.kolor.Kolor
import org.kbem.chess.ChessGame
import org.kbem.chess.Color as Color

val game = ChessGame()

fun main(args: Array<String>) {

    println("Game started")
    printBoard()
    var choice = ""

    while (choice != "q") {
        displayMainMenu()
        print("What would you like to do? ")
        choice = readln()

        if (choice == "1") {
            // move_uci = input('Enter you move: ')
            // self.play_move(move_uci)
        } else if (choice == "2") {
            // self.print_all_moves()
        } else if (choice == "3") {
            // self.replay_game()
        } else if (choice == "4") {
            /*move = self.chess_game.undo_move()

            if move is None:
            print('No move to undone')
            continue
            self.print_board()
            self.chess_game.check_end_result()
            self.print_player_points()
            self.print_info_message(move, move_undone = True)
            print()*/
        } else if (choice == "5") {
            // legal_moves = self.chess_game.generate_legal_moves()
            // print(','.join(str(legal_move) for legal_move in legal_moves))
        } else if (choice == "6") {
            // self.replay_sample_game()
        } else if (choice == "q") {
            print("\nThanks for playing. Bye.")
        }
        else {
            print("\nI didn't understand that choice.\n")
        }
    }

    println("Program finished")
}

private fun displayMainMenu() {
    println("[1] - Play move")
    println("[2] - Display all moves already played")
    println("[3] - Replay the game from the beginning")
    println("[4] - Undo move")
    println("[5] - Print legal moves")
    println("[6] - Load sample game")
    println("[q] - Quit app")
}

private fun printBoard() {
    for (rank in 0 until game.board.count()) {
        printRank(rank)
    }
    println("  |-----|-----|-----|-----|-----|-----|-----|-----|")
    println("     A     B     C     D     E     F     G     H   ")
}

private fun printRank(rank: Int) {
    print("  |-----|-----|-----|-----|-----|-----|-----|-----|")
    println()
    printPieces(rank)
    println()
    printSquareColors(rank)
    println()
}

private fun printPieces(rank: Int) {
    print("  ")
    for (file in 0 until game.board[rank].count()) {
        val piece = game.board[rank][file]
        if (piece == null) {
            print("|     ")
        } else {
            if (piece.color == Color.WHITE) {
                print(Kolor.foreground("|  $piece  ", com.andreapivetta.kolor.Color.YELLOW))
            } else {
                print(Kolor.foreground("| $piece ", com.andreapivetta.kolor.Color.GREEN))
            }
        }
    }
    print("|")
}

private fun printSquareColors(rank: Int) {
    print("${8 - rank} ")
    for (file in 0 until game.board[rank].count()) {
        val color = if ((rank + file) % 2 == 0) Color.BLACK else Color.WHITE
        if (color == Color.WHITE) {
            print("|    w")
        } else {
            print("|    b")
        }
    }
    print("|")
}