import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Step 1: Create an array with numbersOne from 1 to 10 and print it to the console.

        int[] numbersOne = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Array One: " + Arrays.toString(numbersOne));
//        Step 2: Calculate the sum of all numbersOne in the array and print the result to the console.
        int sum = 0;
        int biggestNumber = 0;
        for (int i = 0; i < numbersOne.length; i = i + 1) {
            sum = sum + numbersOne[i];
            if (biggestNumber < numbersOne[i]) {
                biggestNumber = numbersOne[i];
            }
        }
        System.out.println("The sum of all numbersOne is : " + sum);
        System.out.println("The biggest number is : " + biggestNumber);

        int[] numbersTwo = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        System.out.println("Array two : " + Arrays.toString(numbersTwo));
        int biggerLenght = 0;
        if (numbersOne.length > numbersTwo.length) {
            biggerLenght = numbersOne.length;
        } else {
            biggerLenght = numbersTwo.length;
        }

        int[] numbersThree = new int[biggerLenght];
//        System.out.println(numbersThree.length);


        int arraySizeOne = numbersOne.length;
        int arraySizeTwo = numbersTwo.length;
        if (arraySizeOne > arraySizeTwo) {
            for (int i = 0; i < arraySizeOne; i++) {
                if (i < arraySizeTwo - 1) {
                    numbersThree[i] = numbersOne[i] + numbersTwo[i];
                } else {
                    numbersThree[i] = numbersOne[i];
                }
            }

        }
        else if (arraySizeTwo > arraySizeOne) {
            for (int i = 0; i < arraySizeTwo; i++) {
                if (i < arraySizeOne - 1) {
                    numbersThree[i] = numbersOne[i] + numbersTwo[i];
                } else {
                    numbersThree[i] = numbersTwo[i];
                }
            }

        }
        else{
            for (int i = 0; i < numbersThree.length; i++) {
                numbersThree[i] = numbersOne[i] + numbersTwo[i];
            }

        }
        System.out.println("Element-wise addition makes this Array: " + Arrays.toString(numbersThree));
    }
}