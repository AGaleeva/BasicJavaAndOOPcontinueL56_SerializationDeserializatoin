package homework56;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadProduct {

    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        try ( ObjectInputStream ois = new ObjectInputStream(new FileInputStream("product_out.dat"));) {
            Product product = (Product) ois.readObject();
            System.out.println(product);
        }
    }
}
