package demo;

import java.io.*;

public class ReadObj {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        try ( ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object_out.dat"));
             ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("objectPer_out.dat"));) {
            String str = (String)ois.readObject();
            System.out.println(str);
             Person person = (Person) ois1.readObject();
            System.out.println(person);
        }
    }
}
