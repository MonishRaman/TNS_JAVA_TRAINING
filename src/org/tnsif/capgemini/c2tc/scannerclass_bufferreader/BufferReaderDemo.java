package org.tnsif.capgemini.c2tc.scannerClass_bufferReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderDemo {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader("C:\\Users\\KUNAL\\Downloads\\demo.txt"));

        String data = "";

        while ((data = br.readLine()) != null) {
            System.out.println(data);
        }

        br.close();
    }
}