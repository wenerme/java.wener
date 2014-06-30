package me.wener.commons.patterns.structural.Adapter;

/**
 * Adapter for the company A legacy code.
 */
public class CompanyAAdapter implements EmployeeBrowser
{
    /**
     * Retrieve the employee information.
     *
     * @param direction  The employee direction.
     * @param division   The employee division.
     * @param department The employee department.
     * @param service    The employee service.
     * @param firstName  The employee firstName.
     * @param lastName   The employee lastName.
     * @return The employee object.
     */
    public Employee getEmployee(String direction, String division, String department, String service, String firstName, String lastName)
    {
        String distinguishedName = "SELECT *"
                + " FROM t_employee as employee"
                + " WHERE employee.company= 'COMPANY A'"
                + " AND employee.direction = " + direction
                + " AND employee.division = " + division
                + " AND employee.department = " + department
                + " AND employee.service = " + service
                + " AND employee.firstName = " + firstName
                + " AND employee.lastName = " + lastName;

        CompanyAEmployees companyAEmployees = new CompanyAEmployees();
        return companyAEmployees.getEmployee(distinguishedName);
    }
}
