import java.io.FileOutputStream;
import java.io.IOException;

public class AdapterTest2 {

/*
Adapter

*/

    public class AdapterFileOutputStream implements StringWriter {
        private FileOutputStream fileOutputStream;

        public AdapterFileOutputStream(FileOutputStream fileOutputStream) {
            this.fileOutputStream = fileOutputStream;
        }

        @Override
        public void flush() throws IOException {
            fileOutputStream.flush();
        }

        @Override
        public void writeString(String s) throws IOException {
            fileOutputStream.write(s.getBytes());
        }

        @Override
        public void close() throws IOException {
            fileOutputStream.close();
        }
    }

    public static void main(String[] args) {

    }

    public interface StringWriter {
        void flush() throws IOException;

        void writeString(String s) throws IOException;

        void close() throws IOException;
    }


}
