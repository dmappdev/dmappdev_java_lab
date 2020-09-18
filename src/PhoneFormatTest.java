public class PhoneFormatTest {

    public static void main(String[] args) {

        String phoneNmb = "234567";
        String zeros = "0000000000";

        if (phoneNmb.length() < 10){
            zeros = zeros.substring(phoneNmb.length());
            phoneNmb = zeros + phoneNmb;
        }
//        System.out.println(zeros);
        int code = 123;
        String formatterPhone = String.format("+%d(%s)%s-%s-%s",code, phoneNmb.substring(0, 3), phoneNmb.substring(3, 6), phoneNmb.substring(6, 8), phoneNmb.substring(8, 10));
        System.out.println(formatterPhone);
        System.out.println(String.format("%3d-%2d-%2d", Integer.parseInt(phoneNmb)));
        System.out.println(String.format("%010d",Integer.parseInt(phoneNmb)));

    }

}
