package formatStr;

public class Demo {
    public static void main(String[] args) {
        int num = 54321;
        double val = 12.34567;
        char symbol = 'R';
        String txt = "JAVA";

        String A = String.format("Целое число %1$+010d и символ %2$4c", num, symbol);
        System.out.println(A);
        String B = String.format("Текст \"%1$-7s\" и число %2$e", txt, val);
        System.out.println(B);
        String C = String.format("Число: %1$07x - это тоже, что и %1$07o", num);
        System.out.println(C);
        String D = String.format("Число: %1$ d\nЧисло: %2$ d", num, -num);
        System.out.println(D);
        String E = String.format("Действительное число: %012.3f", val);
        System.out.println(E);
        String F = String.format("Найучая нотация: %12.3e", val);
        System.out.println(F);
    }
}
