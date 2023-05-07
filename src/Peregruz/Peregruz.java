package Peregruz;

public class Peregruz {
        int x;


        public void peregruz(){
            String string;
            System.out.println("Я пустой метод");
        }
        public void peregruz(String string){
            System.out.println("Я не пустой метод. У меня строка "+string);
        }

        public void peregruz(String string,int number){
            System.out.println("Я не пустой метод." +
                    " У меня строка "+string+" и у меня число "+number);
        }
        public void peregruz(int number, String string){
            System.out.println("Я не пустой метод." +
                    " У меня строка "+string+" и у меня число "+number);
        }
        public void peregruz(int number, String string, String string2){
            peregruz(string2,number);
            System.out.println("И еще есть строка "+string);
        }
        static void example(){
            System.out.println("acacac");
        }

        public static void main(String[] args) {
            example();
            Peregruz per = new Peregruz();
            per.peregruz();
        }
        public  void peregruz (int a, int b,int c){

            System.out.println(a+b+c);
        }
        public void peregruz(int[] arr){
            int[] numbers = {1, 2, 3, 4, 5,6};
        int sum = 0;
    for (int i = 0; i < arr.length; i++) {
        sum += arr[i];
    }
    System.out.println(sum);
}   public void peregruz(String[]str){
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
        }


    }

}



