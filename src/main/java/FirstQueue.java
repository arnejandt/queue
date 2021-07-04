import java.util.ArrayList;

public class FirstQueue implements Queue{
    private ArrayList<String> list = new ArrayList<>();
    @Override
    public void remove() {
        if (list.isEmpty()==true) throw new IllegalArgumentException("Cannot remove because Queue is empty");
            list.remove(0);
    }

    @Override
    public void add(String string) {
        if (list.contains(null)) {
            throw new IllegalArgumentException("null should not be added");
            }
        list.add(string);
    }

    @Override
    public boolean isEmpty() {
        if(list.isEmpty()){
            return true;
        }
        else {return false;}
    }

    @Override
    public String showFirst() {
        if (list.isEmpty()==true) throw new IllegalArgumentException("Cannot show first Element because list is empty");
        return list.get(0);
    }

    @Override
    public String showLast() {
        if (list.isEmpty()==true) throw new IllegalArgumentException("Cannot show last element because empty");
        return list.get(list.size()-1);
    }
}
