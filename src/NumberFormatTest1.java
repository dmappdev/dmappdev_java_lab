import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class NumberFormatTest1 {

    public static void main(String[] args) {

        double payment = 20567.78;
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(nf.format(payment));

        Currency curr = Currency.getInstance(Locale.US);
        nf.setCurrency(curr);
        System.out.println(nf.format(payment));
        curr = Currency.getInstance(Locale.UK);
        nf.setCurrency(curr);
        System.out.println(nf.format(payment));

        nf.setCurrency(Currency.getInstance(Locale.FRANCE));
        System.out.println(nf.format(payment));
        curr = Currency.getInstance(Locale.CHINA);
        nf.setCurrency(curr);
        System.out.println(nf.format(payment));
        System.out.println(curr.getSymbol());

        nf.setCurrency(Currency.getInstance(new Locale("hi", "IN")));
        NumberFormat india = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        nf.setCurrency(Currency.getInstance(new Locale("en", "IN")));
        System.out.println(nf.format(payment));
        System.out.println(curr.getCurrencyCode());
        System.out.println(curr.getDefaultFractionDigits());
        System.out.println(curr.getDisplayName());
        System.out.println(curr.getSymbol());
        //Locale locale = Locale.
        double num = 123.56;
        //int usCurr = nf.setCurrency(new Currency());

        System.out.println("------------------------------------------");
        Locale indiaLocale = new Locale("en", "IN");

        /* Create NumberFormats using Locales */
        NumberFormat us     = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india1  = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat china  = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        /* Print output */
        System.out.println("US: "     + us.format(payment));
        System.out.println("India: "  + india1.format(payment));
        System.out.println("China: "  + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }

}
