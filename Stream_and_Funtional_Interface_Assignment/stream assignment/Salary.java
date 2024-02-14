public class Salary {
    private int id;
    private double salary;
    private int month;
    private int year;

    public Salary() {
    
    }

    public Salary(int id, float salary, int month, int year) {
        this.id = id;
        this.salary = salary;
        this.month = month;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
