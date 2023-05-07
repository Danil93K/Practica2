package lesson1;

public class Main {
    public static void main(String[] args) {
        Computer1 computer1 = new Computer1();
        System.out.println(computer1.name);
        System.out.println(computer1.cost);
        System.out.println(computer1.haskeyboard);
        computer1.cost = 1700;
        computer1.name = "acer";
        computer1.haskeyboard = true;
        System.out.println("==============");
        System.out.println(computer1.name);
        System.out.println(computer1.cost);
        System.out.println(computer1.haskeyboard);
        System.out.println(computer1.getnumber(7) + 7);
        System.out.println("============");
        Computer2 computer2 = new Computer2();
        computer2.setCost(17000);
        System.out.println(computer2.getCost());
    }}



