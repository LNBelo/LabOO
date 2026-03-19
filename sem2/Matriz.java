import java.util.*;

public class Matriz {
    // ler matriz: le, cria e retorna a matriz
    // linB = colA
    public static void main(String[] args){
        int rows_A = Integer.parseInt(args[0]);
        int cols_A = Integer.parseInt(args[1]);
        int[][] A = new int[rows_A][cols_A];

        int rows_B = Integer.parseInt(args[2]);
        int cols_B = Integer.parseInt(args[3]);
        int [][] B = new int[rows_B][cols_B];

        A = input_values(A);
    }

    void input_values(int[][] m){
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[i].length; j++){
                int x = new UsoScanner().get_inter(null);
                m[i][j] = x;
            }
        }
    }

    void print_matriz(int[][]m){
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[0].length; j++){
                int x = m[i][j];
                System.out.println(x);
            }
        }
    }

    // multiplica matriz: (a, b) e retorna a  nova matriz    
}

class UsoScanner{
    public int get_inter(String []args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        return x;
    }
}
