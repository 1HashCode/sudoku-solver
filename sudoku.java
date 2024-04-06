public class sudoku {
    static boolean finished=false;  //flag used to indicate that the backtracking algorithm is successfully or not, if not then the input has wrong parameters.

    public static void main(String[] args) {
        char[][]s={{'.','.','.','2','6','.','7','.','1'},   //input board
                {'6','8','.','.','7','.','.','9','.'},
                {'1','9','.','.','.','4','5','6','.'},
                {'8','2','.','1','.','.','.','4','.'},
                {'.','.','4','6','.','2','9','.','.'},
                {'.','5','.','.','.','3','.','2','8'},
                {'.','.','9','3','.','.','.','7','4'},
                {'.','4','.','.','5','.','.','3','6'},
                {'7','.','3','.','1','8','.','.','.'}};

        System.out.println("THE INITIAL BOARD IS ");
        printBoard(s);

        sol(s,0,0);

        System.out.println("\n");

        if(finished) {
            System.out.println("THE SOLVED SUDOKU IS ");
            printBoard(s);
        }
        else System.out.println("Couldn't solve,please find the error in input");
    }

    static void sol(char[][]s,int row,int col){     // the backtracking algorithm
        if(col==s[0].length){
            ++row;
            col=0;
        }
        if(row==s.length){
            finished=true;   //the flag is also used to indicate the end of the backtracking algorithm
            return;
        }
        if(s[row][col]!='.'){
            sol(s,row,col+1);
            return;
        }

        for(int i=1;i<10;++i){
            if(isValid(s,i,row,col)){
                s[row][col]=(char)(i+'0');
                sol(s,row,col+1);

                if(!finished)
                    s[row][col]='.';
            }
        }
    }

    static boolean isValid(char[][]s,int num,int row,int col){      //checking whether a value can be inserted in the given board coordinates or not by validating with sudoku rules.
        for(int i=0;i<s.length;++i){   //for that column
            if(s[i][col]==(char)(num+'0')){
                return false;
            }
        }

        for(int i=0;i<s[0].length;++i){    //for that row
            if(s[row][i]==(char)(num+'0')){
                return false;
            }
        }

        int r=(row/3)*3;
        int c=(col/3)*3;

        for(int i=r;i<r+3;++i){         //for the nested grid
            for(int j=c;j<c+3;++j){
                if(s[i][j]==(char)(num+'0')){
                    return false;
                }
            }
        }
        return true;
    }

    static void printBoard(char[][]s){      //printing the board for visualisation
        for(int i=0;i<s.length;++i){
            System.out.println("     ___________________________________________________________________");
            if(i%3==0 ){
                System.out.print("\n");
                System.out.print("     -------------------------------------------------------------------");
                System.out.print("\n");
            }
            System.out.print("     ");
            for(int j=0;j<s[0].length;++j){
                if(j%3==0){
                    System.out.print("|||");
                }
                System.out.print("|"+"  "+s[i][j]+"  ");
            }
            System.out.print("|||");
            System.out.println("|");

        }
        System.out.println("     ___________________________________________________________________");
    }
}