import java.io.Serial;
import java.io.Serializable;

public class Person implements Serializable {
    @Serial
    private static final long serialVersionUID = 2850941593282398964L;

    private int id;
    private String personName;
    private int age;
    private byte type;



    public Person(int id, String name) {
        this.id = id;
        this.personName = name;
    }

    @Override
    public String toString() {
        return id + " : " + personName;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return personName;
    }
}
