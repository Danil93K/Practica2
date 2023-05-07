package HomeWork1;

import java.util.Scanner;

public class Task4 {
    //Создать класс калькулятор.
    //   В нем создать методы:
    //   summ, minus, multiply, division.
    //   Сложение, вычитание, умножение и деление соответственно.
    //   Каждый метод принимает в качестве параметров два значения типа double.
    //   И выводит в консоль результат действия.
    //
    //   Также в классе есть метод старт. Который выводит сообщение в консоль, что
    //   калькулятор запущен. И предлагает ввести действие в вашей консоли.
    //
    //   Калькулятор должен принимать только следующие типы действий:
    //   2+4;    - пример синтаксиса сложения;
    //   5-6;    - пример синтаксиса вычитания;
    //   25*3;   - пример синтаксиса умножения;
    //   34/3;   - пример синтаксиса деления;
    //   После ввода действия на консоль выводится ответ этого действия.
    //   И после снова выводится сообщение о предложении ввести действие.
    //
    //   в случае ввода другого синтаксисана консоль возвращается сообщение:
    //   "Введите корректное действие".
    //   И после снова выводится сообщение о предложении ввести действие.
    //
    //   Программа закрывается после ввода команды Stop.
    //   Перед закрытием на консоль должно выводится сообщение:
    //   "Калькулятор закрыт".



        public static void main(String[] args) {
            start();}


       public static void start() {
            System.out.println("Калькулятор запущен.");
            Scanner scanner = new Scanner(System.in);
            while (true) {
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("Stop")) {
                    System.out.println("Калькулятор закрыт.");
                    break;
                }
                String[] tokens = input.split("[+\\-*/]");
                if (tokens.length != 2) {
                    System.out.println("Введите корректное действие.");
                    continue;
                }
                double num1 = Double.parseDouble(tokens[0].trim());
                double num2 = Double.parseDouble(tokens[1].trim());
                if (input.contains("+")) {
                    summ(num1, num2);
                } else if (input.contains("-")) {
                    minus(num1, num2);
                } else if (input.contains("*")) {
                    multiply(num1, num2);
                } else if (input.contains("/")) {
                    division(num1, num2);
                } else {
                    System.out.println("Введите корректное действие.");
                }
            }
            scanner.close();
        }

        private static void summ(double num1, double num2) {
            double result = num1 + num2;
            System.out.println("Результат: " + result);
        }

        private static void minus(double num1, double num2) {
            double result = num1 - num2;
            System.out.println("Результат: " + result);
        }

        private static void multiply(double num1, double num2) {
            double result = num1 * num2;
            System.out.println("Результат: " + result);
        }

        private static void division(double num1, double num2) {
            if (num2 == 0) {
                System.out.println("Деление на ноль невозможно.");
                return;
            }
            double result = num1 / num2;
            System.out.println("Результат: " + result);
        }
    }



