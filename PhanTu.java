import java.util.List;

public class PhanTu<T extends Comparable<T>> {
    private List<T> obj;

    public  PhanTu() {

    }

    public void setList(List<T> list) {
        obj = list;
    }

    public void insert(T t) {
        obj.add(t);
        System.out.print("Added!");
    }

    public void print() {
        for(T t : obj) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    public T getData(int index) {
        return obj.get(index);
    }

    public int size() {
        return obj.size();
    }

    public List<T> getObj() {
        return obj;
    }

    public boolean isGreaterThan(T a) {
        return this.obj.compareTo(a) > 0;
    }
}
