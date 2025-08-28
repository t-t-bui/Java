public class SumOrSameGame {
    private int[][] puzzle;

    public SumOrSameGame(int numRows, int numCols) {
        puzzle = new int[numRows][numCols];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                int randNum = (int) (Math.random() * 10); // Random numbers between 0 and 9

                for(int k = 0; k <= j; k++) {
                    if(randNum == puzzle[i][j]) {
                        randNum = (int) (Math.random() * 10 + 1); // Regenerate if duplicate
                    } else {
                        puzzle[i][j] = randNum; // Assign unique number
                    }
                }
            }
        }
    }

    public boolean clearPair(int row, int col) {
        if (row < 0 || row >= puzzle.length || col < 0 || col >= puzzle[0].length) {
            return false; // Invalid indices
        }

        int sum = puzzle[row][col];

        for (int i = col; i < puzzle[row].length; i++) {
            sum += puzzle[row][i];

            if (sum == 10) {
                puzzle[row][i] = 0;
                puzzle[row][col] = 0; // Clear the pair
                return true;
            } else {
                sum = puzzle[row][col];
            }
        }
        
        for (int i = col; i < puzzle[row + 1].length; i++) {
            if (sum == puzzle[row + 1][i]) {
                puzzle[row + 1][i] = 0;
                return true;
            }
        }

        return false;
    }

    public void printPuzzle() {
        for (int i = 0; i < puzzle.length; i++) {
            for (int j = 0; j < puzzle[i].length; j++) {
                System.out.print(puzzle[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SumOrSameGame game = new SumOrSameGame(4, 4);
        game.printPuzzle();

        // Example of clearing a pair
        if (game.clearPair(0, 0)) {
            System.out.println("Pair cleared!");
        } else {
            System.out.println("No pair found.");
        }

        game.printPuzzle();
    }
}