import java.util.HashMap;
import java.util.Map;

public class PhoneFormatTest2 {

/*
Adapting multiple interfaces

*/

    public static Map<String, String> countries = new HashMap<>();

    static {
        countries.put("UA", "Ukraine");
        countries.put("US", "United States");
        countries.put("FR", "France");
    }

    public static void main(String[] args) {

    }

    public static class IncomeDataAdapter implements Customer, Contact {
        private IncomeData data;

        public IncomeDataAdapter(IncomeData incomeData) {
            this.data = incomeData;
        }

        @Override
        public String getCompanyName() {
            return data.getCompany();
        }

        @Override
        public String getName() {
            return data.getContactLastName() +
                    ", " + data.getContactFirstName();
        }

        @Override
        public String getCountryName() {
            return countries.get(data.getCountryCode());
        }

        @Override
        public String getPhoneNumber() {
//            String zeros = "0000000000";
//            String phoneNmb = Integer.toString(data.getPhoneNumber());
//            if (phoneNmb.length() < 10){
//                zeros = zeros.substring(phoneNmb.length());
//                phoneNmb = zeros + phoneNmb;
//            }
//            phoneNmb = String.format("%010d", Integer.parseInt(phoneNmb));
//            String formatterPhone = String.format("+%d(%s)%s-%s-%s",
//                    data.getCountryCode(),
//                    phoneNmb.substring(0, 3),
//                    phoneNmb.substring(3, 6),
//                    phoneNmb.substring(6, 8),
//                    phoneNmb.substring(8, 10));
//            return formatterPhone;
//            return String.format("%010d",
//                    Integer.parseInt(Integer.toString(this.data.getCountryPhoneCode())+Integer.toString(this.data.getPhoneNumber())));
            String input = String.format("%010d", data.getPhoneNumber());
            return "+" + data.getCountryPhoneCode() + input.replaceFirst("(.{3})(.{3})(.{2})(.{2})", "($1)$2-$3-$4");
        }
    }


    public static interface IncomeData {
        String getCountryCode();        // For example: US

        String getCompany();            // For example: CodeGym Ltd.

        String getContactFirstName();   // For example: John

        String getContactLastName();    // For example: Smith

        int getCountryPhoneCode();      // For example: 1

        int getPhoneNumber();           // For example: 991234567
    }

    public static interface Customer {
        String getCompanyName();        // For example: CodeGym Ltd.

        String getCountryName();        // For example: United States
    }

    public static interface Contact {
        String getName();               // For example: Smith, John

        String getPhoneNumber();        // For example: +1(099)123-45-67
    }

}
