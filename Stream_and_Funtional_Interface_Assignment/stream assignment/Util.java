import java.util.ArrayList;
import java.util.List;


public class Util{
    public static List<Salary> getLast6MonthSalaries(Employee emp)
    {
        {
            List<Salary> salaries = emp.getSalaries();
            if (salaries.size() >= 6) {
                return salaries.subList(salaries.size() - 6, salaries.size());
            } 
            else {
                List<Salary> emptyList = new ArrayList<>();
                return emptyList;
            }
        
        }
    }
}