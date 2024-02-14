import java.util.Comparator;

public class NameComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee emp1 , Employee emp2) {
        String add1 = emp1.getAddresses().get(0).toString();
        String add2 = emp1.getAddresses().get(0).toString();

        return add1.compareTo(add2);
    }
}
