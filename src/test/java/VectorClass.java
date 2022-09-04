import java.util.Vector;

public class VectorClass {
    Vector<String> vector = new Vector<String>();


    public void DeleteLastString() {
        vector.remove(vector.size()-1);
        vector.forEach(System.out::println);
    }
    public void addString(String text) {
        vector.addElement(text);
    }
}
