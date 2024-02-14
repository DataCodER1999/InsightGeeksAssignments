import java.util.*;

public class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private Map<String, Salary> salary;
    List<Address> addresses;


    public Employee(int id, String name, Map<String, Salary> salary, List<Address> addresses) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.addresses = addresses;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Salary> getSalary() {
        return salary;
    }

    public void setSalary(Map<String, Salary> salary) {
        this.salary = salary;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }


    public String toString() {
        return this.getName();
    }


    @Override
    public int compareTo(Employee emp2) {
        try {
            String address1 = this.getAddresses().get(0).toString();
            String address2 = emp2.getAddresses().get(0).toString();
            return address1.compareTo(address2);
        } catch (NullPointerException e) {
            e.printStackTrace();
            return 0;
        }
    }


//
//    public static Map<String, Integer> countEmployeesWithSameAddress(List<Employee> employees) {
//        Map<String, Integer> addressEmployeeCount = new HashMap<>();
//        for (Employee employee : employees) {
//            String addressKey = employee.getAddresses().toString();
//            addressEmployeeCount.put(addressKey, addressEmployeeCount.getOrDefault(addressKey, 0) + 1);
//        }
//        return addressEmployeeCount;
//    }

    public static Map<String, Integer> countEmployeesWithSameAddress(List<Employee> employees) {
        Map<String, Integer> addressEmployeeCount = new HashMap<>();

        try {
            for (Employee employee : employees) {
                List<Address> addresses = employee.getAddresses();
                if (addresses != null) {
                    String addressKey = addresses.toString();
                    addressEmployeeCount.put(addressKey, addressEmployeeCount.getOrDefault(addressKey, 0) + 1);
                } else {
                    System.out.println("Null addresses for employee: " + employee.getName());
                }
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        return addressEmployeeCount;
    }


    //    public static Map<String, Integer> countEmployeesWithSameCountry(List<Employee> employees) {
//        Map<String, Integer> addressEmployeeCount = new HashMap<>();
//        for (Employee employee : employees) {
//            for (Address add : employee.getAddresses()) {
//                String country = add.getCountry();
//                addressEmployeeCount.put(country, addressEmployeeCount.getOrDefault(country, 0) + 1);
//            }
//        }
//        return addressEmployeeCount;
//    }
    public static Map<String, Integer> countEmployeesWithSameCountry(List<Employee> employees) {
        Map<String, Integer> addressEmployeeCount = new HashMap<>();
        try {
            for (Employee employee : employees) {
                for (Address add : employee.getAddresses()) {
                    try {
                        String country = add.getCountry();
                        addressEmployeeCount.put(country, addressEmployeeCount.getOrDefault(country, 0) + 1);
                    } catch (NullPointerException e) {

                        e.printStackTrace();
                    }
                }
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        return addressEmployeeCount;
    }


    public static Map<String, Double> sumSalaryByCity(List<Employee> employees) {
        Map<String, Double> citySalarySum = new HashMap<>();

        try {
            for (Employee emp : employees) {
                for (Address addr : emp.getAddresses()) {
                    String city = addr.getCity();
                    double totalSalary = calculateTotalSalary(emp);
                    citySalarySum.put(city, citySalarySum.getOrDefault(city, 0.0) + totalSalary);
                }
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        return citySalarySum;
    }


    public static Map<Integer, Double> calculateYearlySalaries(Employee e1) {
        Map<Integer, Double> yearlySalaries = new HashMap<>();

        for (Map.Entry<String, Salary> entry : e1.getSalary().entrySet()) {
            String month = entry.getKey();
            Salary salary = entry.getValue();
            int year = Integer.parseInt(month.substring(0, 4));
            double monthlySalary = salary.getSalary();
            yearlySalaries.put(year, yearlySalaries.getOrDefault(year, 0.0) + monthlySalary);
        }
        return yearlySalaries;
    }


    public static double calculateTotalSalary(Employee emp) {
        double sum = 0;
        for (Map.Entry<String, Salary> entry : emp.getSalary().entrySet()) {
            sum += entry.getValue().getSalary();
        }

        return sum;
    }


//    public static Map<Double, List<String>> same_Yearly_Salary_Group(List<Employee> employees, int year) {
//        Map<Double, List<String>> sameYearlySalaryGroup = new HashMap<>();
//        List<Double> yearlySalaries = new ArrayList<>();
//        for (Employee emp : employees) {
//            Map<Integer, Double> employeeSalaries = calculateYearlySalaries(emp);
//            if (employeeSalaries.containsKey(year)) {
//
//                sameYearlySalaryGroup.put(employeeSalaries.get(year), sameYearlySalaryGroup.getOrDefault(employeeSalaries.get(year), new ArrayList<String>()));
//                sameYearlySalaryGroup.get(employeeSalaries.get(year)).add(emp.getName());
//            }
//        }
//        return sameYearlySalaryGroup;
//    }



public static Map<Double, List<String>> same_Yearly_Salary_Group(List<Employee> employees, int year) {
    Map<Double, List<String>> sameYearlySalaryGroup = new HashMap<>();

    try {
        for (Employee emp : employees) {
            try {
                Map<Integer, Double> employeeSalaries = calculateYearlySalaries(emp);
                if (employeeSalaries != null && employeeSalaries.containsKey(year)) {
                    Double yearlySalary = employeeSalaries.get(year);

                    sameYearlySalaryGroup.putIfAbsent(yearlySalary, new ArrayList<>());
                    sameYearlySalaryGroup.get(yearlySalary).add(emp.getName());
                }
            } catch (NullPointerException e) {
                System.out.println("NullPointerException: " + e.getMessage());
                e.printStackTrace();
            } catch (NumberFormatException e) {
                System.out.println("NumberFormatException: " + e.getMessage());
                e.printStackTrace();
            }
        }
    } catch (NullPointerException e) {
        System.out.println("NullPointerException: " + e.getMessage());
        e.printStackTrace();
    }
    return  sameYearlySalaryGroup;
}







    public static List<Employee> sorted_Employee_By_Salary(List<Employee> employees) {
        List<Employee> sortedEmployeedBySalary = new ArrayList<>(employees);
        sortedEmployeedBySalary.sort((emp1, emp2) -> {
            try {
                double salary1 = calculateTotalSalary(emp1);
                double salary2 = calculateTotalSalary(emp2);
                return Double.compare(salary1, salary2);
            } catch (NullPointerException e) {
                e.printStackTrace();
                return 0;
            } catch (Exception e) {
                e.printStackTrace();
                return 0;
            }
        });
        return sortedEmployeedBySalary;
    }


//    public static Map<String, ArrayList> get_Salary_Sum_and_Employee_Count_By_State(List<Employee> employees) {
//        Map<String, ArrayList> mixMatch = new HashMap<>();
//        for (Employee emp : employees) {
//
//        }
//
//        return mixMatch;
//    }


    public static Map<String, Double> sumSalaryByState_and_Count(List<Employee> employees) {
        Map<String, Double> StateSalarySum = new HashMap<>();

        for (Employee emp : employees) {

            Map<String, Double> StateTotalSalary = new HashMap<>();
            double totalSalary = calculateTotalSalary(emp);
            for (Address addr : emp.getAddresses()) {

                String city = addr.getCity();
                StateTotalSalary.put(city, StateTotalSalary.getOrDefault(city, 0.0) + totalSalary);
            }

            for (Map.Entry<String, Double> entry : StateTotalSalary.entrySet()) {
                String city = entry.getKey();
                double sum = entry.getValue();
                StateSalarySum.put(city, StateSalarySum.getOrDefault(city, 0.0) + sum);
            }
        }
        return StateSalarySum;

    }


    //    public static Map<Employee, Map<Integer, Double>> yearly_Salary_Tax(List<Employee> employees) {
//        Map<Employee, Map<Integer, Double>> tax_data = new HashMap<>();
//        for (Employee emp : employees) {
//            Map<Integer, Double> employee_tax_data = new HashMap<>();
//            Map<Integer, Double> employee_yearly_salary = calculateYearlySalaries(emp);
//
//            for (Map.Entry<Integer, Double> entry : employee_yearly_salary.entrySet()) {
//                employee_tax_data.put(entry.getKey(), (((entry.getValue() + 2000 + 3000) - 5000) * 0.3));
//            }
//            tax_data.put(emp, employee_tax_data);
//        }
//        return tax_data;
//    }
    public static Map<Employee, Map<Integer, Double>> yearly_Salary_Tax(List<Employee> employees) {
        Map<Employee, Map<Integer, Double>> tax_data = new HashMap<>();
        for (Employee emp : employees) {
            try {
                if (emp != null) {
                    Map<Integer, Double> employee_tax_data = new HashMap<>();
                    Map<Integer, Double> employee_yearly_salary = calculateYearlySalaries(emp);

                    if (employee_yearly_salary != null) {
                        for (Map.Entry<Integer, Double> entry : employee_yearly_salary.entrySet()) {
                            double tax = (((entry.getValue() + 2000 + 3000) - 5000) * 0.3);
                            employee_tax_data.put(entry.getKey(), tax);
                        }
                        tax_data.put(emp, employee_tax_data);
                    } else {
                        System.out.println("Yearly salaries map is null for employee: " + emp.getName());
                    }
                } else {
                    System.out.println("Null employee found.");
                }
            } catch (NullPointerException e) {
                System.out.println("NullPointerException: " + e.getMessage());
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException: " + e.getMessage());
            }
        }
        return tax_data;
    }


//
//    public static List<Employee> salaryInRange(List<Employee> employees, int year) {
//        List<Employee> rangedEmployees = new ArrayList<>();
//        for (Employee emp : employees) {
//            Map<Integer, Double> employee_yearly_salaries = calculateYearlySalaries(emp);
//            if (employee_yearly_salaries.containsKey(year) && (employee_yearly_salaries.get(year) > 20000 && employee_yearly_salaries.get(year) < 200000000)) {
//                rangedEmployees.add(emp);
//            }
//        }
//        return rangedEmployees;
//    }

    //    public static List<Employee> salaryInRange(List<Employee> employees, int year) {
//        List<Employee> rangedEmployees = new ArrayList<>();
//        for (Employee emp : employees) {
//            try {
//                if (emp != null) {
//                    Map<Integer, Double> employee_yearly_salaries = calculateYearlySalaries(emp);
//                    if (employee_yearly_salaries != null && employee_yearly_salaries.containsKey(year)) {
//                        double yearlySalary = employee_yearly_salaries.get(year);
//                        if (yearlySalary > 20000 && yearlySalary < 200000000) {
//                            rangedEmployees.add(emp);
//                        }
//                    } else {
//                        System.out.println("Yearly salaries map is null or does not contain the specified year for employee: " + emp.getName());
//                    }
//                } else {
//                    System.out.println("Null employee found.");
//                }
//            } catch (NullPointerException e) {
//                System.out.println("NullPointerException: " + e.getMessage());
//            }
//            return rangedEmployees;
//        }
//    }
    public static List<Employee> salaryInRange(List<Employee> employees, int year) {
        List<Employee> rangedEmployees = new ArrayList<>();
        for (Employee emp : employees) {
            try {
                if (emp != null) {
                    Map<Integer, Double> employee_yearly_salaries = calculateYearlySalaries(emp);
                    if (employee_yearly_salaries != null && employee_yearly_salaries.containsKey(year)) {
                        double yearlySalary = employee_yearly_salaries.get(year);
                        if (yearlySalary > 20000 && yearlySalary < 200000000) {
                            rangedEmployees.add(emp);
                        }
                    } else {
                        System.out.println("Yearly salaries map is null or does not contain the specified year for employee: " + emp.getName());
                    }
                } else {
                    System.out.println("Null employee found.");
                }
            } catch (NullPointerException e) {
                System.out.println("NullPointerException: " + e.getMessage());
            }
        }
        return rangedEmployees; // Moved outside the for loop
    }


    public static Map<String, Double> sumSalaryByState(List<Employee> employees) {
        Map<String, Double> citySalarySum = new HashMap<>();

        try {
            for (Employee emp : employees) {
                for (Address addr : emp.getAddresses()) {
                    String state = addr.getState();
                    double totalSalary = calculateTotalSalary(emp);
                    citySalarySum.put(state, citySalarySum.getOrDefault(state, 0.0) + totalSalary);
                }
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        return citySalarySum;
    }

//    public static Map<String, Integer> calculateEmployeeCountByState(List<Employee> employees) {
//        Map<String, Integer> employeeCountByState = new HashMap<>();
//
//        for (Employee emp : employees) {
//            for (Address addr : emp.getAddresses()) {
//                String state = addr.getState();
//                employeeCountByState.put(state, employeeCountByState.getOrDefault(state, 0) + 1);
//            }
//        }
//        return employeeCountByState;
//    }

    public static Map<String, Integer> calculateEmployeeCountByState(List<Employee> employees) {
        Map<String, Integer> employeeCountByState = new HashMap<>();

        try {
            for (Employee emp : employees) {
                for (Address addr : emp.getAddresses()) {
                    String state = addr.getState();
                    employeeCountByState.put(state, employeeCountByState.getOrDefault(state, 0) + 1);
                }
            }
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        return employeeCountByState;
    }


    public static Map<String, Double> calculateAverageSalaryByStateAndYear(List<Employee> employees) {
        Map<String, Map<Integer, Double>> totalSalaryByStateAndYear = new HashMap<>();
        Map<String, Map<Integer, Integer>> employeeCountByStateAndYear = new HashMap<>();
        Map<String, Double> averageSalaryByStateAndYear = new HashMap<>();

        for (Employee emp : employees) {
            for (Map.Entry<String, Salary> entry : emp.getSalary().entrySet()) {
                Salary salary = entry.getValue();
                String month = entry.getKey();
                int year = Integer.parseInt(month.substring(0, 4));

                for (Address addr : emp.getAddresses()) {
                    String state = addr.getState();

                    double totalSalary = salary.getSalary();
                    totalSalaryByStateAndYear
                            .computeIfAbsent(state, k -> new HashMap<>())
                            .merge(year, totalSalary, Double::sum);

                    employeeCountByStateAndYear
                            .computeIfAbsent(state, k -> new HashMap<>())
                            .merge(year, 1, Integer::sum);
                }
            }
        }

        for (Map.Entry<String, Map<Integer, Double>> stateEntry : totalSalaryByStateAndYear.entrySet()) {
            String state = stateEntry.getKey();
            Map<Integer, Double> totalSalaryByYear = stateEntry.getValue();
            Map<Integer, Integer> employeeCountByYear = employeeCountByStateAndYear.get(state);

            for (Map.Entry<Integer, Double> yearEntry : totalSalaryByYear.entrySet()) {
                int year = yearEntry.getKey();
                double totalSalary = yearEntry.getValue();
                int totalEmployees = employeeCountByYear.get(year);

                double averageSalary = totalSalary / totalEmployees;
                averageSalaryByStateAndYear.put(state + " - " + year, averageSalary);
            }
        }

        return averageSalaryByStateAndYear;
    }

    private static int getYearFromDate(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.YEAR);
    }

}






//    public static Map<String, Double> average_salary_by_state(List<Employee> employees, int year)
//    {
//        Map<String, Double> StateSalarySum = new HashMap<>();
//        Map<String, Integer> StateCount = new HashMap<>();
//        for (Employee emp : employees) {
//
//            Map<String, Double> StateTotalSalary = new HashMap<>();
//            double totalSalary = calculateTotalSalary(emp);
//            for (Address addr : emp.getAddresses()) {
//
//                String state = addr.getState();
//                StateTotalSalary.put(state, StateTotalSalary.getOrDefault(state, 0.0) + totalSalary);
//            }
//
//            for (Map.Entry<String, Double> entry : StateTotalSalary.entrySet()) {
//                String state = entry.getKey();
//                double sum = entry.getValue();
//                StateSalarySum.put(state, StateSalarySum.getOrDefault(state, 0.0) + sum);
//            }
//        }
//        return StateSalarySum;
//    }

