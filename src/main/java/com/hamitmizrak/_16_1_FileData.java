package com.hamitmizrak;


import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class _16_1_FileData {

    private static final String MY_PATH = "E:\\1_Kodlar\\Java Se\\Ecodation_FullStackJavaCore_5\\Ecodation_FullStackJavaCore_5\\src\\main\\java\\com\\hamitmizrak\\file.txt";

    // FileCreate
    private static void myFileICreate() throws IOException {
        File file = new File(MY_PATH);
        if (!file.exists()) {
            file.createNewFile();
            System.out.println(MY_PATH + " dosya oluşturuldu");
        } else {
            System.out.println(MY_PATH + " zaten böyle bir dosya var");
        }
    }

    // Date
    private static String logDate() {
        Locale locale = new Locale("tr", "TR");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MMMM/yyyy HH:mm:ss zzzz", locale);
        Date date = new Date();
        return simpleDateFormat.format(date).toString();
    }

    // Writer
    private static void logAddWithWriter(String data,boolean isClear) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(MY_PATH, isClear))) {
            String nowDate = "[" + logDate() + "] ";
            String value = nowDate + data + "\n";
            bufferedWriter.write(value);
            bufferedWriter.flush();
        } catch (Exception exp) {
            exp.printStackTrace();
        }
    }

    // Reader
    // Writer
    private static String logReader() {
        String rows; // Okunana satır
        String builderToString="";
        StringBuilder stringBuilder= new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(MY_PATH))) {
           while ( (rows=bufferedReader.readLine())!=null ){
               stringBuilder.append(rows).append("\n");
           }
            builderToString = stringBuilder.toString();
            System.out.println(builderToString);
        } catch (Exception exp) {
            exp.printStackTrace();
        }
        return builderToString;
    }

    // All Data
    private static void validationAllData() throws IOException{

    }

}
