package Chapter_4;

import java.time.*;

/**
 * This program tests the Employee class.
 * @version 1.12 2015-05-08
 * @author Cay Horstmann
 */
public class EmployeeTest
{
    public static void main(String[] args)
    {
        // fill the staff array with three Employee objects
        NewEmployee[] staff = new NewEmployee[3];

        staff[0] = new NewEmployee("Carl Cracker", 75000, 1987, 12, 15);
        staff[1] = new NewEmployee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new NewEmployee("Tony Tester", 40000, 1990, 3, 15);

        // raise everyone's salary by 5%
        for (NewEmployee e : staff)
            e.raiseSalary(5);

        // print out information about all Employee objects
        for (NewEmployee e : staff)
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay="
                    + e.getHireDay());
    }
}

class NewEmployee
{
    private String name;
    private double salary;
    private LocalDate hireDay;

    public NewEmployee(String n, double s, int year, int month, int day)
    {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public LocalDate getHireDay()
    {
        return hireDay;
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}

