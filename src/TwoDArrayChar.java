public class TwoDArrayChar {

    public static void main(String[] args) {
    /*
        char[][] ca=new char[5][3];
        ca[0][0] = 'G';
        ca[0][1] = 'O';
        ca[0][2] = 'Y';
        ca[1][0] = 'J';
        ca[1][1] = 'Z';
        ca[1][2] = 'U';
        ca[2][0] = 'N';
        ca[2][1] = 'R';
        ca[2][2] = 'V';
        ca[3][0] = 'S';
        ca[3][1] = 'G';
        ca[3][2] = 'Q';
        ca[4][0] = 'H';
        ca[4][1] = 'J';
       // ca[4][2] = 'C'; //It will print NULL if String array Not defined
   */
        //we can define array this way
        char[][] ca = {
                {'G', 'O', 'Y'},
                {'J', 'Z', 'U'},
                {'N', 'R', 'V'},
                {'S', 'G', 'Q'},
                {'H', 'J', 'C'}
        };
        for(int i=0;i<ca.length;i++) {
            for (int j=0;j<ca[0].length;j++)
            {
                System.out.print(ca[i][j]+" ");
            }
            System.out.println();
        }
    }
}
