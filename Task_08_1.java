package home.Task_08;

/*
Число Фибоначи
написать метод который возвращает N-ное число фибоначи, по правилу:
F(0) = 0, F(1) = 1
F(N) = F(N - 1) + F(N - 2)
 */
public class Task_08_1 {
    public static void main(String[] args) {
        System.out.println(returnFibonacciNumber(5));
    }

    public static int returnFibonacciNumber(int number) {
        if (number == 0 || number == 1) {
            return number;
        }
        return returnFibonacciNumber(number - 1) + returnFibonacciNumber(number - 2);
    }
}
