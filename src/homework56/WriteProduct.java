package homework56;

import java.io.*;

public class WriteProduct {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Product prod1 = new Product("Clock", 65.5, 10, 15.5);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("product_out.dat"));) {
            oos.writeObject(prod1);
        }

    }
}
