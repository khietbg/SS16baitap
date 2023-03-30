package bai2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            String line;
            String FILE_PATCH = "src//bai2//countries.csv";
            br = new BufferedReader(new FileReader(FILE_PATCH));

            while ((line = br.readLine()) != null) {
                    printCountry(parseCsvLine(line));
            }
        }catch (Exception e){
            System.err.println("file khong ton tai or noi dung co loi!");
        }finally {
            try {
                if (br != null){
                    br.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }

        }
    }
    public static List<String> parseCsvLine(String csvLine){
            List<String> result = new ArrayList<>();
            if (csvLine != null){
                String[] splitData;
                splitData = csvLine.split(",");
                for (int i = 0; i < splitData.length; i++) {
                    result.add(splitData[i]);
                }
            }
            return result;
    }
    public static void printCountry(List<String> country){
        System.out.println(
                "country [id= "+country.get(0)+
                        "code = "+country.get(1)+
                        "name = "+country.get(2)
        );
            

    }
}