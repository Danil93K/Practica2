package lesson1;
public class Chernovik2{

        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5};
            int sum = sumArray(numbers);
            System.out.println("Сумма элементов массива: " + sum);
        }
        public static int sumArray(int[] arr) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            return sum;

        }
    }











