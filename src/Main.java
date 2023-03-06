import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(calc(input));

        /* Присвоил значение введенной строки Переменной input и запускаю вывод
        метода CALC на консоль */

    }

    public static String calc(String input) {
        try {
            Scanner sc = new Scanner(input);
            String x = sc.next();
            String op = sc.next();
            String y = sc.next();

            // присвоил значения символов до каждого пробела переменным

            try {
                if (op.equals("-"))
                    return "" + (Integer.parseInt(x) - Integer.parseInt(y));

                if (op.equals("+"))
                    return "" + (Integer.parseInt(x) + Integer.parseInt(y));

                if (op.equals("*"))
                    return "" + (Integer.parseInt(x) * Integer.parseInt(y));

                if (op.equals("/"))
                    return "" + (Integer.parseInt(x) / Integer.parseInt(y));

                // если введены арабские числа то сравниваю операцию и возвращаю результат

            } catch (Exception e) {
                try {
                    String[] rim = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
                    for (int i = 1; i < 11; i++) {
                        for (int j = 1; j < 11; j++) {
                            if (op.equals("-") && x.equals(rim[i-1]) && y.equals(rim[j-1]))
                                return "" + (i - j);

                            if (op.equals("+") && x.equals(rim[i-1]) && y.equals(rim[j-1]))
                                return "" + (i + j);

                            if (op.equals("*") && x.equals(rim[i-1]) && y.equals(rim[j-1]))
                                return "" + (i * j);

                            if (op.equals("/") && x.equals(rim[i-1]) && y.equals(rim[j-1]))
                                return "" + (i / j);

                            /*если введены римские числа решил вписать их  в массив чтобы было легче
                            задавать им значения сразу внутри цикла for, и возвращаю их резултат после сравнения с
                            значениями внутри массива и сравнения оперции
                             */

                        }
                    }
                }catch (Exception w){
                    return "Throws Exception";
                }
            }
        }catch (Exception q){
            return "Throws Exception";
        }
        return "Throws Exception";
    }
}