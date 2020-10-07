public class ClassInterfaceHolder {

    public String msg = "msg";

    InterfaceHolder interfaceHolder;

    ClassInterfaceHolder(InterfaceHolder interfaceHolder){
        this.interfaceHolder = interfaceHolder;
    }

    public interface InterfaceHolder {
        public String getMessage();
        public void setMessage(String msg);
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
