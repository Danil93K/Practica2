package HomeWork1;

public class Task2 {
   //Написать перегруженный метод, который может:
//  - не принимать никаких значений, тогда он будет выводить на консоль сообщение типа:
//    "Я пустой".
//  - Принимать в качестве параметров String, тогда он будет выводить на консоль это сообщение.
//  - Принимать в качестве параметров массив строк, тогда он будет выводить на консоль все его значения
//    через пробел.
//  - Принимать в качестве параметра массив чисел, тогда он будет выводить на консоль сумму элементов
//    массива.
//  - Принимать в качестве параметров число и строку, тогда он будет выводить на консоль сообщение типа:
//    "Ваше сообщение - "%%%%%%%%", ваше число -  $",
//    где "%%%%%%%%" и $ ваши введенные строка и число соответственно.
   public void peregruz(){
       String string;
       System.out.println("Я пустой");
   }
    public void peregruz(String string){
        System.out.println("Я не пустой метод. У меня строка "+string);
    }
    public void peregruz(String[]str){
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
        }}
    public void peregruz(int[] arr){
        int[] numbers = {1, 2, 3, 4, 5,6};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);}
    public void peregruz(int number, String string){
        System.out.println("Ваше сообщение- "+string+"ваше число- "+number);
            }


}