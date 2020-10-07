public class ClassInterfaceTest1 implements ClassInterfaceHolder.InterfaceHolder {
    public String msg = null;

    public static void main(String[] args) {
        ClassInterfaceTest1 test1 = new ClassInterfaceTest1();
        System.out.println(test1.getMessage());
        ClassInterfaceHolder cl1 = new ClassInterfaceHolder(test1);
        cl1.getMsg();
        ClassInterfaceHolder.InterfaceHolder interfaceHolder = new ClassInterfaceTest1();
        System.out.println(interfaceHolder.toString());
        interfaceHolder.getMessage();
        interfaceHolder = test1;
        test1.setMessage("msg1");
    }

    @Override
    public String getMessage() {
        return msg;
    }

    public void setMessage(String msg) {
        this.msg = msg;
    }
}
