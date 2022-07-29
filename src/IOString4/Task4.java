package IOString4;
//Создайте в package текстовый файл и клас, внесите в файл некий текст.
//
//Выведите на экран содержимое файла.

import java.io.*;

public class Task4 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\Java\\IOStrings\\src\\IOString3\\task4file");
        PrintWriter pw = new PrintWriter(file);
        pw.println("nani?");
        pw.close();
        BufferedReader br = new BufferedReader(new FileReader("D:\\Java\\IOStrings\\src\\IOString3\\task4file"));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);


        }
    }
}
