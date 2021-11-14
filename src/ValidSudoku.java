import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {


    public boolean isValidSudoku(char[][] board) {

        Set<String> elems = new HashSet<>();
        Set<Character> cubes = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.' && !elems.add("r" + i + board[i][j])) {
                    return false;
                }
                if (board[i][j] != '.' && !elems.add("c" + j + board[i][j])) {
                    return false;
                }
            }
        }

        for (int x = 0; x < 9; x=x+3) {
            for (int y = 0; y < 9; y=y+3) {
                for (int i = x; i < x + 3; i++) {
                    for (int j = y; j < y + 3; j++) {
                        if(board[i][j]!='.' && !cubes.add(board[i][j]))
                            return false;
                    }
                }
                cubes.clear();
            }
        }
        return true;
    }

}
