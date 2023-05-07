package Peregruz;

public class Main {
    public static void main(String[] args) {

        Peregruz per =new Peregruz();

        per.peregruz();
        per.peregruz("str");
        per.peregruz("str1",3);
        per.peregruz(7,"str2");
        per.peregruz(9,"str3","str4");
        per.peregruz(1,2,3);
        int[]ints= {1, 2, 3, 4, 5,6,7};;
        per.peregruz(ints);
        String[] names = { "Alice", "Bob", "Charlie", "David" };
        per.peregruz(names);
    }
}
