import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String [][] letter = new String[6][4]; //Çift boyutlu array 2 tane köşeli parantez, 6 satır, 4 sütun

        for (int i=0; i< letter.length; i++){//Çok boyutlu dizilerde, dizinin length'i satır sayısını verir.
            for (int j = 0; j<letter[i].length; j++) {
                if (i==0 || i==2) {
                    letter[i][j] = " * ";
                } else if (j == 0 || j == 3) {
                    letter[i][j]= " * ";
                }else {
                    letter[i][j] = "   ";
                }
            }
        }

        for (String[] row: letter) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
