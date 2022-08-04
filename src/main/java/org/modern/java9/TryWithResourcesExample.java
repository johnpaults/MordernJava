package org.modern.java9;

import java.io.BufferedReader;
import java.io.Reader;
import java.io.StringReader;

public class TryWithResourcesExample {
    public static void main(String[] args) {
        Reader input = new StringReader("Hello john");
        BufferedReader bufferedReader = new BufferedReader(input);
        try (BufferedReader bufferedReader1 = bufferedReader){
            System.out.println("bufferedReader1.readLine() = " + bufferedReader1.readLine());
        } catch (Exception e){
            e.printStackTrace();
        }

        //Java 9
        Reader input1 = new StringReader("Hello there");
        BufferedReader newBufferedReader = new BufferedReader(input1);
        try (newBufferedReader){
            System.out.println("newBufferedReader.readLine() = " + newBufferedReader.readLine());
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
