import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Employees_Creation {
        public static List<Employee> getEmployees()
        {
                List<Employee> employees = new ArrayList<>();

                Employee emp1 = new Employee(1, "Aarav", Arrays.asList(
                    new Salary(1, 150000f, 1, 2022),
                    new Salary(2, 170000f, 2, 2022),
                    new Salary(3, 160000f, 3, 2022),
                    new Salary(4, 180000f, 4, 2022),
                    new Salary(5, 155000f, 5, 2022),
                    new Salary(6, 175000f, 6, 2022),
                    new Salary(7, 190000f, 7, 2022),
                    new Salary(8, 165000f, 8, 2022),
                    new Salary(9, 185000f, 9, 2022),
                    new Salary(10, 195000f, 10, 2022),
                    new Salary(11, 200000f, 11, 2022),
                    new Salary(12, 210000f, 12, 2022)
                ), 1, 2022, "Tech Solutions");
                
                
                Employee emp2 = new Employee(2, "Aarushi", Arrays.asList(
                    new Salary(13, 300000f, 1, 2023),
                    new Salary(14, 310000f, 2, 2023),
                    new Salary(15, 320000f, 3, 2023),
                    new Salary(16, 330000f, 4, 2023),
                    new Salary(17, 340000f, 5, 2023),
                    new Salary(18, 350000f, 6, 2023),
                    new Salary(19, 360000f, 7, 2023),
                    new Salary(20, 370000f, 8, 2023),
                    new Salary(21, 380000f, 9, 2023),
                    new Salary(22, 390000f, 10, 2023),
                    new Salary(23, 400000f, 11, 2023),
                    new Salary(24, 410000f, 12, 2023)
                ), 1, 2023, "Tech Solutions");
                
                Employee emp3 = new Employee(3, "Aarya", Arrays.asList(
                    new Salary(25, 550000f, 1, 2022),
                    new Salary(26, 580000f, 2, 2022),
                    new Salary(27, 600000f, 3, 2022),
                    new Salary(28, 620000f, 4, 2022),
                    new Salary(29, 640000f, 5, 2022),
                    new Salary(30, 660000f, 6, 2022),
                    new Salary(31, 680000f, 7, 2022),
                    new Salary(32, 700000f, 8, 2022),
                    new Salary(33, 720000f, 9, 2022),
                    new Salary(34, 740000f, 10, 2022),
                    new Salary(35, 760000f, 11, 2022),
                    new Salary(36, 780000f, 12, 2022)
                ), 1, 2023, "Mobilloite Innovations");
                
                
                Employee emp4 = new Employee(4, "Advik", Arrays.asList(
                    new Salary(37, 320000f, 1, 2023),
                    new Salary(38, 330000f, 2, 2023),
                    new Salary(39, 340000f, 3, 2023),
                    new Salary(40, 350000f, 4, 2023),
                    new Salary(41, 360000f, 5, 2023),
                    new Salary(42, 370000f, 6, 2023),
                    new Salary(43, 380000f, 7, 2023),
                    new Salary(44, 390000f, 8, 2023),
                    new Salary(45, 400000f, 9, 2023),
                    new Salary(46, 410000f, 10, 2023),
                    new Salary(47, 420000f, 11, 2023),
                    new Salary(48, 430000f, 12, 2023)
                ), 1, 2025, "Mobilloite Innovations");
                

                Employee emp5 = new Employee(5, "Ananya", Arrays.asList(
                    new Salary(49, 480000f, 1, 2022),
                    new Salary(50, 500000f, 2, 2022),
                    new Salary(51, 520000f, 3, 2022),
                    new Salary(52, 540000f, 4, 2022),
                    new Salary(53, 560000f, 5, 2022),
                    new Salary(54, 580000f, 6, 2022),
                    new Salary(55, 600000f, 7, 2022),
                    new Salary(56, 620000f, 8, 2022),
                    new Salary(57, 640000f, 9, 2022),
                    new Salary(58, 660000f, 10, 2022),
                    new Salary(59, 680000f, 11, 2022),
                    new Salary(60, 700000f, 12, 2022)
                ), 1, 2026, "NextGen Solutions");
                
                
                Employee emp6 = new Employee(6, "Anaya", Arrays.asList(
                    new Salary(61, 770000f, 1, 2023),
                    new Salary(62, 780000f, 2, 2023),
                    new Salary(63, 790000f, 3, 2023),
                    new Salary(64, 800000f, 4, 2023),
                    new Salary(65, 810000f, 5, 2023),
                    new Salary(66, 820000f, 6, 2023),
                    new Salary(67, 830000f, 7, 2023),
                    new Salary(68, 840000f, 8, 2023),
                    new Salary(69, 850000f, 9, 2023),
                    new Salary(70, 860000f, 10, 2023),
                    new Salary(71, 870000f, 11, 2023),
                    new Salary(72, 880000f, 12, 2023)
                ), 1, 2027, "NextGen Solutions");
                
                
                Employee emp7 = new Employee(7, "Ansh", Arrays.asList(
                    new Salary(73, 920000f, 1, 2022),
                    new Salary(74, 930000f, 2, 2022),
                    new Salary(75, 940000f, 3, 2022),
                    new Salary(76, 950000f, 4, 2022),
                    new Salary(77, 960000f, 5, 2022),
                    new Salary(78, 970000f, 6, 2022),
                    new Salary(79, 980000f, 7, 2022),
                    new Salary(80, 990000f, 8, 2022),
                    new Salary(81, 1000000f, 9, 2022),
                    new Salary(82, 1010000f, 10, 2022),
                    new Salary(83, 1020000f, 11, 2022),
                    new Salary(84, 1030000f, 12, 2022)
                ), 1, 2028, "Cutting Edge Tech");
                
                Employee emp8 = new Employee(8, "Arnav", Arrays.asList(
                    new Salary(85, 1060000f, 1, 2023),
                    new Salary(86, 1070000f, 2, 2023),
                    new Salary(87, 1080000f, 3, 2023),
                    new Salary(88, 1090000f, 4, 2023),
                    new Salary(89, 1100000f, 5, 2023),
                    new Salary(90, 1110000f, 6, 2023),
                    new Salary(91, 1120000f, 7, 2023),
                    new Salary(92, 1130000f, 8, 2023),
                    new Salary(93, 1140000f, 9, 2023),
                    new Salary(94, 1150000f, 10, 2023),
                    new Salary(95, 1160000f, 11, 2023),
                    new Salary(96, 1170000f, 12, 2023)
                ), 1, 2029, "Innovative Tech");
                
                Employee emp9 = new Employee(9, "Ayaan", Arrays.asList(
                    new Salary(97, 1220000f, 1, 2023),
                    new Salary(98, 1230000f, 2, 2023),
                    new Salary(99, 1240000f, 3, 2023),
                    new Salary(100, 1250000f, 4, 2023),
                    new Salary(101, 1260000f, 5, 2023),
                    new Salary(102, 1270000f, 6, 2023),
                    new Salary(103, 1280000f, 7, 2023),
                    new Salary(104, 1290000f, 8, 2023),
                    new Salary(105, 1300000f, 9, 2023),
                    new Salary(106, 1310000f, 10, 2023),
                    new Salary(107, 1320000f, 11, 2023),
                    new Salary(108, 1330000f, 12, 2023)
                ), 1, 2030, "Tech Solutions Plus");
                
                employees.add(emp1);
                employees.add(emp2);
                employees.add(emp3);
                employees.add(emp4);
                employees.add(emp5);
                employees.add(emp6);
                employees.add(emp7);
                employees.add(emp8);
                employees.add(emp9);
                
        return employees;
    }
}

