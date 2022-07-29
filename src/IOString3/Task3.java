package IOString3;
//Необходимо создать строку с текстом (текст взять любой из интернета).
// Разбить эту строку на 2 подстроки равной длине и вывести на экран каждое предложения с новой строки.

public class Task3 {
    public static void main(String[] args) {
        String s = "Here the JVM checks the String Constant Pool. If the string does not exist, then a new string instance is created and placed in a pool." +
                " If the string exists, then it will not create a new object. Rather, it will return the reference to the same instance." +
                " The cache which stores these string instances is known as the String Constant pool or String Pool. In earlier versions of Java up to JDK 6 String pool was located inside PermGen(Permanent Generation) space." +
                " But in JDK 7 it is moved to the main heap area.PermGen space is limited, the default size is just 64 MB. it was a problem with creating and storing too many string objects in PermGen space." +
                " That’s why the String pool was moved to a larger heap area." +
                " To make Java more memory efficient, the concept of string literal is used. By the use of the ‘new’ keyword, The JVM will create a new string object in the normal heap area even if the same string object is present in the string pool.  ";
        System.out.println(s.length());


        String[] splitter = (s.substring(0, 474)).split("\\.");
        for (String q : splitter) {
            System.out.println(q);
        }

        String[] splitter1 = (s.substring(474)).split("\\.");
        for (String w : splitter1) {
            System.out.println(w);


        }





    }
}

