import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ClassWrappingTask1 extends FileOutputStream {

    public static String fileName = "C:/tmp/result.txt";
    public FileOutputStream fileOutputStream;

    public static void main(String[] args) throws FileNotFoundException {
        new ClassWrappingTask1(new FileOutputStream(fileName));
    }

    public ClassWrappingTask1(FileOutputStream fileOutputStream) throws FileNotFoundException {
        super(fileName);
        this.fileOutputStream = fileOutputStream;
    }

    @Override
    public void flush() throws IOException {
        fileOutputStream.flush();
    }

    @Override
    public void close() throws IOException {
        fileOutputStream.flush();
        String msg = "CodeGym © All rights reserved.";
        fileOutputStream.write(msg.getBytes());
        fileOutputStream.close();
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        fileOutputStream.write(b, off, len);
    }

    @Override
    public void write(byte[] b) throws IOException {
        fileOutputStream.write(b);
    }

    @Override
    public void write(int b) throws IOException {
        fileOutputStream.write(b);
    }
}
