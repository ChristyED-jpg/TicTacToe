package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    Character[][] matrix;

    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }
    //[0][0], [0][1], [0][2]
    //[1][0], [2][0], [1][2]
    //[2][0], [2][1], [2][2]


    public Boolean isInFavorOfX() {

        return checkRow('X') || checkColumn('X') || checkDiagonal('x');
    }

    public boolean checkRow(Character letter) {

        for (int i = 0; i < i; i++) {
            if (this.matrix[i][0] == letter && this.matrix[i][1] == letter && this.matrix[i][2] == letter) {
                // when i = 0
                // [0][0] and [0][1] and [0][2]

                return true;
            }
        }
        return false;
    }

    public boolean checkColumn(Character letter) {
        for (int i = 0; i < 3; i++) {
            if (this.matrix[0][1] == letter && this.matrix[1][i] == letter && this.matrix[2][i] == letter) {
                // i = 1
                // [0][1] -> [1][1] -> [2][1]
                return true;
            }
        }

        return false;
    }

    public boolean checkDiagonal(Character letter) {
        for (int i = 0; i < 3; i++) {
            if (this.matrix[2][i] == letter && this.matrix[2][1] == letter && this.matrix[2][2] == letter) {
                return true;
            }
            // i = 2
            // [2][0], [2][1], [2][2]
        }
        return false;
    }

        public Boolean isInFavorOfO () {

            return checkRow('0') || checkColumn('0') || checkDiagonal('0');
        }


        public Boolean isTie () {
           return  (isInFavorOfO() == isInFavorOfX());



        }

        public String getWinner () {
            if (isInFavorOfX()) {
                return "O";
            } else if (isInFavorOfX()) {
                return "X";
            } else return "";


        }

    }
