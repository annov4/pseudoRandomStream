import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        pseudoRandomStream(13)
                .limit(10)
                .forEach(System.out::println);
    }

    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed, n -> (n * n)  % 1000);// seed - начальное значение, унарный оператор, чтобы его создать можно использовать лямбда выражение
   //выделяем второй, третий и четвертый разряд переданного числа
    }
}
//Берется какое-то начальное неотрицательное число (оно будет передаваться в ваш метод проверяющей системой).
//Первый элемент последовательности устанавливается равным этому числу.
//Следующие элементы вычисляются по рекуррентной формуле
