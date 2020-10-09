
/*
Your own FileWriter

*/

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileWriter;
import java.io.IOException;

public class MyOwnFileWriter {
    private FileWriter fileWriter;

    public MyOwnFileWriter(File file) {
        try {
            fileWriter = new FileWriter(file);
        } catch (IOException e) {
        }
    }

    public MyOwnFileWriter(File file, boolean append) {
        try {
            fileWriter = new FileWriter(file, append);
        } catch (IOException e) {
        }
    }

    public MyOwnFileWriter(FileDescriptor fd) {
        fileWriter = new FileWriter(fd);
    }

    public MyOwnFileWriter(String fileName) {
        try {
            fileWriter = new FileWriter(fileName);

        } catch (IOException e) {
        }
    }

    public MyOwnFileWriter(String fileName, boolean append) {
        try {
            fileWriter = new FileWriter(fileName, append);

        } catch (IOException e) {
        }
    }

    public static void main(String[] args) {

    }

    public void write(int c) throws IOException {
        this.fileWriter.write(c);
        System.out.println(c);
    }

    public void write(String str) throws IOException {
        this.fileWriter.write(str);
        System.out.println(str);
    }

    public void write(char[] cbuf) throws IOException {
        this.fileWriter.write(cbuf);
        System.out.println(cbuf);
    }

    public void write(String str, int off, int len) throws IOException {
        this.fileWriter.write(str, off, len);
        System.out.println(str.substring(off, off + len));
    }

    public void write(char[] cbuf, int off, int len) throws IOException {
        this.fileWriter.write(cbuf, off, len);
        for (int i = 0; i < len; i++) {
            System.out.print(cbuf[off+i]);
        }
    }

    public void close() throws IOException {
        this.fileWriter.close();
    }


}
