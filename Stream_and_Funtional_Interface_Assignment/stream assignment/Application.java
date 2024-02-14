import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.Set;
import java.time.LocalDate;
import java.util.HashMap;

public class Application {




    public static Map<Integer, Map<Integer, Double>> calculateTopSalaryEmployeeMonthly(List<Employee> employees)
    {
        Map<Integer, Map<Integer, Double>> topalaryEmployeeMonthly = employees.stream().flatMap(emp -> emp.getSalaries().stream())
        .collect(Collectors.groupingBy(Salary::getYear,Collectors
        .groupingBy(Salary::getMonth,Collectors.collectingAndThen(Collectors
        .maxBy(Comparator.comparing(Salary::getSalary)), opt -> opt.map(Salary::getSalary).orElse(0.0)))));
    
            return topalaryEmployeeMonthly;
    }




        public static Map<String, Map<Integer, Double>> calculateMaxSalaryPerCompanyPerMonth(List<Employee> employees) {
            return employees.stream()
                    .collect(Collectors.groupingBy(Employee::getCompany,
                            Collectors.flatMapping(emp -> emp.getSalaries().stream(),
                                    Collectors.groupingBy(Salary::getMonth,
                                            Collectors.collectingAndThen(
                                                    Collectors.maxBy(Comparator.comparing(Salary::getSalary)),
                                                    opt -> opt.map(Salary::getSalary).orElse(0.0))))));
        }




    public static Map<String, Double> calculate6MonthsSalarySumByCompany(List<Employee> employees) {

        Map<String, Double> sixMonthsSalarySumByCompany = employees.stream()
            .flatMap(emp -> Util.getLast6MonthSalaries(emp).stream() 
                    .collect(Collectors.groupingBy(sal -> emp.getCompany(), Collectors.summingDouble(Salary::getSalary)))
                    .entrySet().stream())
            .collect(Collectors.groupingBy(Map.Entry::getKey, Collectors.summingDouble(Map.Entry::getValue)));
            
        return sixMonthsSalarySumByCompany;
    }





    public static Map<String, Map<String, Double>> calculatePercentageGrowth(List<Employee> employees) {
        return employees.stream().collect(Collectors.toMap(
                Employee::getName,
                employee -> calculatePercentageGrowthForEmployee(employee.getSalaries())
        ));
    }

    private static Map<String, Double> calculatePercentageGrowthForEmployee(List<Salary> salaries) {
        Map<String, Double> percentageGrowthMap = new HashMap<>();
        double previousSalary = 0; 
        for (int i = 0; i < salaries.size(); i++) {
            Salary currentSalary = salaries.get(i);
            double currentSalaryAmount = currentSalary.getSalary();
            String month = getMonthName(currentSalary.getMonth());

            if (i > 0) {
                double percentageGrowth = ((currentSalaryAmount - previousSalary) / previousSalary) * 100;
                percentageGrowthMap.put(month, percentageGrowth);
            }

            previousSalary = currentSalaryAmount;
        }
        return percentageGrowthMap;
    }

    private static String getMonthName(int month) {
        return switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "";
        };
    }







    
        public static double salarySumByEmployee(String employeeName)
        {
            List<Employee> employees = Employees_Creation.getEmployees();
            double salarySum = employees.stream().filter(emp -> emp.getName().equals(employeeName))
            .flatMap(emp -> emp.getSalaries().stream()).mapToDouble(Salary::getSalary).sum();

            return salarySum;
        }


        public static List<List<String>> printEmployeesPatternInAPatternCompanyWise(List<Employee> employees)
        {
            
            List<List<String>> employeeDetailsCompanyWise = new ArrayList<>();
            Set<String> companyList = employees.stream().map(emp -> emp.getCompany()).collect(Collectors.toSet());
            // System.out.println(companyList);

            for (String company : companyList) {
                List<String> empDetails = employees.stream().filter(emp -> emp.getCompany().equals(company))
                .map(emp -> emp.toString()).collect(Collectors.toList());

                employeeDetailsCompanyWise.add(empDetails);
            }
            return employeeDetailsCompanyWise;
    }



        public static List<String> printEmployeesInAPattern(List<Employee> employees)
        {
            List<String> employeeDetails = employees.stream().map(emp -> emp.toString())
            .collect(Collectors.toList());

            return employeeDetails;
        }




    public static void main(String[] args) {
        List<Employee> employees = Employees_Creation.getEmployees();
        // System.out.println(Application.calculateTopSalaryEmployeeMonthly(employees));
        // System.out.println(calculate6MonthsSalarySumByCompany(employees));
        // System.out.println(calculateMaxSalaryPerCompanyPerMonth(employees));
        // System.out.println(companyMaxSalariesByMonth(employees));
        // System.out.println(printEmployeesInAPattern(employees));
        // System.out.println(printEmployeesPatternInAPatternCompanyWise(employees));
        System.out.println(calculatePercentageGrowth(employees));
    }
}
