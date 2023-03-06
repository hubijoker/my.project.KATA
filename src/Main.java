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
                    String[] rim = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
                            "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                            "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
                            "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                            "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L",
                            "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                            "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                            "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                            "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                            "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
                    for (int i = 1; i < 11; i++) {
                        for (int j = 1; j < 11; j++) {
                            if (op.equals("-") && x.equals(rim[i-1]) && y.equals(rim[j-1]))
                                return rim[(i - j)-1];

                            if (op.equals("+") && x.equals(rim[i-1]) && y.equals(rim[j-1]))
                                return rim[(i + j)-1];

                            if (op.equals("*") && x.equals(rim[i-1]) && y.equals(rim[j-1]))
                                return rim[(i * j)-1];

                            if (op.equals("/") && x.equals(rim[i-1]) && y.equals(rim[j-1]))
                                return rim[(i / j)-1];

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