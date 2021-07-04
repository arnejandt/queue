public interface Queue {

    void remove();
    void add(String string);
    boolean isEmpty();
    String showFirst();
    String showLast();
}
