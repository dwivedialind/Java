package Introduction;

import java.text.NumberFormat;

public class FormattingNumbers {
    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String res = currency.format(123455.44);
        System.out.println(res);

        NumberFormat percent = NumberFormat.getPercentInstance();
        String newRes = percent.format(0.123);
        System.out.println(newRes);
    }
}
