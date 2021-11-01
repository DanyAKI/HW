package prev.exceptions;

public class Main {
    public static void main(String[] args) {
        String array[][] = new String[4][4];
        String [][] arr ={
        {"1", "1", "1", "1"},
        {"1", "1", "1", "1"},
        {"1", "1", "1", "1"},
        {"1", "t", "1", "1"}
    };
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
            ArrayCalcValue sc = new ArrayCalcValue();
            sc.calc(arr);


        }
    }
}












