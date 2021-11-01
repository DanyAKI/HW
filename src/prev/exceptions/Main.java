package prev.exceptions;

public class Main {
    public static void main(String[] args) {
        String array[][] = new String[4][4];
        String counter = "AD";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j]= counter;
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();

            ArrayCalcValue sc = new ArrayCalcValue();
            sc.calc(array);


        }
    }
}












