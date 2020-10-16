public class Multidmensional_arrays {
    public static void main(String[] args) {
int[] number = {1,2,3};
int[][] matrice = {{1,2,3,6,6},
                {4,5,6,6},
                {7,8,9,5,5}};

for(int i = 0; i<matrice.length; i++){
    for(int j = 0; j<matrice[i].length; j++){
        System.out.print(matrice[i][j] + " ");
    }
    System.out.println();
}
     //   System.out.println(matrice[2][2]);
        // System.out.println(matrice[1][0]);
        //System.out.println(matrice[0][4]);
        //int[] number1 = new int[5];
        //String[][] strings = new String[2][3];
        // strings [0][1] = "hi pidor";
       // System.out.println(strings[0][1]);

    }

}
