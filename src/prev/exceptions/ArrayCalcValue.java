package prev.exceptions;

public class ArrayCalcValue {
    public int calc(String[][] array) {
        Size(array.length);

        for (int i = 0; i < array.length; i++) {
            Size(array[i].length);
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);


                } catch (NumberFormatException exp) {
                    throw new MyArrayDataException(
                            String.format("Value is not int-parseable: [%s] [%s]", i, j),
                            exp
                    );
                }


            }


        }
        System.out.println("Summa = " + sum);
        return sum;


    }


    private void Size(int length) {
        if (length != 4) {
            throw new MySizeArrayException("The length of the array should be 4");
        }

    }


}




