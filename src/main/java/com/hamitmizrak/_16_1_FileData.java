package com.hamitmizrak;


import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class _16_1_FileData {

    // Field
    private static final String MY_PATH = "E:\\1_Kodlar\\Java Se\\Ecodation_FullStackJavaCore_5\\Ecodation_FullStackJavaCore_5\\src\\main\\java\\com\\hamitmizrak\\file.txt";

    // parametresiz constructor
    public _16_1_FileData() throws IOException {
        myFileICreate();
    }

    // FileCreate
    private  void myFileICreate() throws IOException {
        File file = new File(MY_PATH);
        if (!file.exists()) {
            file.createNewFile();
            System.out.println(MY_PATH + " dosya oluşturuldu");
        } else {
            System.out.println(MY_PATH + " zaten böyle bir dosya var");
        }
    }

    // Date
    private  String logDate() {
        Locale locale = new Locale("tr", "TR");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MMMM/yyyy HH:mm:ss zzzz", locale);
        Date date = new Date();
        return simpleDateFormat.format(date).toString();
    }

    // Writer
    private  void logAddWithWriter(String data,boolean isClear) {
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
    private  void validationAllData() throws IOException{
        Scanner scanner = new Scanner(System.in);
        String allUserChooise ="\nLütfen Seçim yapınız".concat("\n1-)Dosya Oluştur").concat("\n2-)Dosyaya Yaz").concat("\n3-)Dosya Oku").concat("\n4-)Çıkış Yap");
        System.out.println(allUserChooise);
        int chooise = scanner.nextInt();
        switch (chooise){
            case 1:
                myFileICreate();
                break;
            case 2:
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Birşey yazınız");
                String data=scanner1.nextLine();
                logAddWithWriter(data,true);
                break;
            case 3:
                logReader();
                break;
            case 4:
                System.out.println("Sistemden Çıkış yapılıyor");
                System.exit(0);
                break;
            default:
                System.out.println("Lütfen Size verilen aralıkta seçim yapınız");
        }
    }

    //
    private void allResultData() throws IOException{
        while(true){
            validationAllData();
        }
    } //end allResultData

    // psvm
    static void main() throws IOException {
        _16_1_FileData fileData= new _16_1_FileData();
        fileData.allResultData();
    }

} //end _16_1_FileData
