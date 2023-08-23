package ss17_io_binary_file_and_serialization;
import java.io.*;
public class SerializationDemo {
    public static void main(String[] args) throws Exception {
        User user = new User("John Doe", "john.doe@example.com");
        FileOutputStream fileOutputStream = new FileOutputStream("user.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(user);
        objectOutputStream.close();
        FileInputStream fileInputStream = new FileInputStream("user.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        User deserializedUser = (User) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(deserializedUser);
    }
}
class User implements Serializable {

    private final String name;
    private final String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
