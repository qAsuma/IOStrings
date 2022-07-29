package IOStrings;
//Создайте файл, запишите в него произвольные данные и закройте файл. Затем снова откройте этот файл, прочитайте из него данные и выведете их на консоль.

import java.io.*;

public class Task2 {
    public static void main(String[] args) {
        try {


            File file = new File("FileAdd");
            PrintWriter pw = new PrintWriter(file);
            pw.println("Hello");
            pw.println("My");
            pw.println("Friend!");
            pw.close();
            BufferedReader br = new BufferedReader(new FileReader("FileAdd"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
