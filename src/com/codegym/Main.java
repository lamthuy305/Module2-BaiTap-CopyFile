package com.codegym;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("numbers.txt");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
        readAndWriteFile.writeFile("result.txt", numbers);

    }
}
