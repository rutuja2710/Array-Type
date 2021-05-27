import java.util.*;

public class TypeOfArray {
    public static int checkTypeOfArray(int inputArray[], int arraySize) {
        boolean isEven = false, isOdd = false;
        for (int i = 0; i < arraySize; i++) {
            if(inputArray[i] % 2 == 0)
                isEven=true;
            else
                isOdd=true;
        }
        if (isEven && isOdd)
            return 3;
        if (isOdd)
            return 2;
        else
            return 1;
    }

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();

        int inputArray[] = new int[arraySize];
        for (int i = 0; i < arraySize; i++)
            inputArray[i] = scanner.nextInt();

        String typeOfArray[] = {"","Even", "Odd", "Mixed"};

        System.out.println("The array is " + typeOfArray[checkTypeOfArray(inputArray, arraySize)]);
    }
}
