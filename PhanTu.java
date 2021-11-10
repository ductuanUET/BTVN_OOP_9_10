public class PhanTu<T extends Comparable<T>> {
    private T obj;

    public  PhanTu() {

    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public boolean isGreaterThan(T a) {
        return this.obj.compareTo(a) > 0;
    }
}
