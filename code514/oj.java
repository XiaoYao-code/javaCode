package code514;

import java.util.ArrayList;
import java.util.List;

class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;

    public Employee(int id, int importance, List<Integer> subordinates) {
        this.id = id;
        this.importance = importance;
        this.subordinates = subordinates;
    }
}
public class oj {
    public static void main(String[] args) {
        List<Integer> subordinates=new ArrayList<>();
        subordinates.add(2);//下属
        subordinates.add(3);//下属
        subordinates.add(4);//下属

        Employee employee=new Employee(1,2,subordinates);
    }

}
