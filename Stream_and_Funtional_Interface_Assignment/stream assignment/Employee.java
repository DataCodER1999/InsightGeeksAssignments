import java.util.List;

public class Employee {

    private int id;
    private String name;
    private List<Salary> salaries; 
    private int monthJoined; 
    private int year;
    private String company;

    public Employee(int id, String name, List<Salary> salaries, int monthJoined, int year, String company) {
        this.id = id;
        this.name = name;
        this.salaries = salaries;
        this.monthJoined = monthJoined;
        this.year = year;
        this.company = company;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Salary> getSalaries() {
        return salaries;
    }

    public int getMonthJoined() {
        return monthJoined;
    }

    public int getYear() {
        return year;
    }

    public String getCompany() {
        return company;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalaries(List<Salary> salaries) {
        this.salaries = salaries;
    }

    public void setMonthJoined(int monthJoined) {
        this.monthJoined = monthJoined;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String toString()
    {
        return "id"+this.id+"_emp"+this.id+"_"+Application.salarySumByEmployee(name)+"_"+this.company;
    }
}
