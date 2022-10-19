package Prometeus.Part1;

public class MatrixPrint {
    public static void main(String args[]) {
        int[][] matrix = new int[5][5];
        String g = String.format("%s"," * ");
        for (int i = 0, k = 5, x = 1; i < 5; i++) {
            k--;
            for (int j = 0; j < 5; j++, x++) {
                matrix[i][j] = x;
                String element = Integer.toString(matrix[i][j]);
                
                if (i == j || j == k)
                    System.out.print(g);
                    
                else{
                    if(element.length()<2)
                    System.out.print(" "+matrix[i][j] + " ");
                    else
                    System.out.print(matrix[i][j] + " ");
                }
                    
            }
            
            System.out.println();
        }
    }
}
