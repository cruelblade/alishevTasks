import javax.imageio.IIOException;
import java.io.*;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            //чтение индекса и массива поэлементно
//            int personCount = ois.readInt();
//            Person[] people = new Person[personCount];
//
//            for (int i = 0; i < personCount; i++) {
//                people[i] = (Person) ois.readObject();
//            }

            Person[] people = (Person[]) ois.readObject();

            System.out.println(Arrays.toString(people));

            ois.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
