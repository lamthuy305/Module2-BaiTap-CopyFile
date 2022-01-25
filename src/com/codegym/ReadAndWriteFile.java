package com.codegym;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath){
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
        return numbers;
    }

    public void writeFile(String filePath, List<Integer> numbers){

        try {
            FileWriter writer = new FileWriter(filePath); // thêm true để ghi tiếp (không bị ghi đè)
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (int i = 0; i < numbers.size(); i++) {
                bufferedWriter.write(numbers.get(i) + "\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
