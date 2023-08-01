public class EJ5 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int [][] transpuesta = new int[4][4];
        

        for (int i = 0; i < 3; i++) {
            for ( int j = 0; j < 3; j++){
            matriz[i][j] = (int)(Math.random()*10);
            System.out.print("( " + matriz[i][j] + " ) ");
            }
            System.out.println(" ");
        }
        System.out.println("---------------------------");
        
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                transpuesta[j][i] = matriz[i][j];
                System.out.print("( " + transpuesta[i][j] + " ) ");
            }
            System.out.println(" ");
        }
        System.out.println("---------------------------");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                transpuesta[j][i] = matriz[i][j] * (-1);
                System.out.print("( " + transpuesta[i][j] + " ) ");
            }
            System.out.println(" ");
        }
    }
}
