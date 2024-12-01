package HashMap;


import java.util.ArrayList;
import java.util.List;

public class testing {
    List<Integer> list;
    public testing () {
        list =  new ArrayList<>();
    }

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "testing{" +
                "list=" + list +
                '}';
    }
}
