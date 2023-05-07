package HomeWork1;

public class Task1 {//Написать метод, принимающий в качестве параметра массив целых чисел.
    // И выводит на экран все четные числа списком,
    //    а также нечетные числа списком.
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        {
            System.out.println("Chetnie chisla");
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == 0) {
                    System.out.print(numbers[i] + " ");
                }
            }
            System.out.println("\nNechetnie chisla");
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 != 0) {
                    System.out.print(numbers[i] + " ");
                }
            }
        }}}
