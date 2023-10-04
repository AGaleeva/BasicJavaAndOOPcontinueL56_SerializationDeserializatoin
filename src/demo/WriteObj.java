package demo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObj {
    public static void main(String[] args) throws IOException {
        Person p1 = new Person("john", 20);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object_out.dat"));
             ObjectOutputStream oos1 = new ObjectOutputStream(new FileOutputStream("objectPer_out.dat"))) {
            oos.writeObject(new String("hello from main"));
            oos1.writeObject(p1);
        }
    }
}
