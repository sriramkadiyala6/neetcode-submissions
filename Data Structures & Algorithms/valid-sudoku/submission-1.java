class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rowArr = new HashSet[9];
        Set<Character>[] colArr = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];
        for(int i = 0; i < 9; ++i){
            rowArr[i] = new HashSet<>();
            colArr[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for(int i = 0; i < 9; ++i){
            for(int j = 0; j < 9; ++j){
                if(board[i][j] == '.') continue;
                else{
                    if(rowArr[i].contains(board[i][j])) return false;
                    else rowArr[i].add(board[i][j]);
                }
            }
        }    
        
        for(int j = 0; j < 9; ++j){
            for(int i = 0; i < 9; ++i){
                if(board[i][j] == '.') continue;
                else{
                if(colArr[j].contains(board[i][j])) return false;
                else colArr[j].add(board[i][j]);
                }
            }
        }
        for(int i = 0; i < 9; ++i){
            for(int j = 0; j < 9; ++j){
                int b = (i / 3) * 3 + (j / 3); // Flatten 2D to 1D formula
                if(board[i][j] == '.') continue;
            
                else{
                if(boxes[b].contains(board[i][j])) return false;
                else boxes[b].add(board[i][j]);
                }
            }
        }
        return true;
    }
}
