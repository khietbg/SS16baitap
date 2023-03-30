package bai1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWRite {
    public static void main(String[] args) {
    ReadAndWRite readAndWRite = new ReadAndWRite();
    String FILE_NUMBER = "src//bai1//number.txt";
    String PATCH_RESULT = "src//bai1//result.txt";
    List<Integer> number = readAndWRite.readFile(FILE_NUMBER);
    List<Integer> list = findMax(number);
    readAndWRite.WriteFile(PATCH_RESULT,list);


    }
    public static List<Integer> readFile(String filePatch){
        List<Integer> number = new ArrayList<>();
        try {
            File file = new File(filePatch);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null){
                number.add(Integer.parseInt(line));
            }
        }catch (Exception e){
            System.err.println("file khong ton tai or noi dung co loi!");
        }

        return  number;
    }
    public static void WriteFile(String filePatch, List<Integer> list){
        try {
            FileWriter fileWriter = new FileWriter(filePatch,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("mang copy la: "+ list);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Integer>   findMax(List<Integer> number){
        List<Integer> list = new ArrayList<>();
        for (Integer i:number) {
            list.add(i);
        }
        return list;

    }
}