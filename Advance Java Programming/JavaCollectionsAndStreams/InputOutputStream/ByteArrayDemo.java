package JavaCollectionsAndStreams.InputOutputStream;

import java.io.ByteArrayInputStream;

public class ByteArrayDemo {
    public static void main(String[] args) {

        byte[] arr = {'H', 'E', 'L', 'L', 'O'};

        ByteArrayInputStream bis =
                new ByteArrayInputStream(arr);

        int data;

        while ((data = bis.read()) != -1) {
            System.out.print((char) data);
        }
    }
}