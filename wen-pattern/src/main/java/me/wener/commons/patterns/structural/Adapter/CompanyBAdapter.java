package me.wener.commons.patterns.structural.Adapter;

/**
 * Adapter for the company B legacy code.
 */
public class CompanyBAdapter implements EmployeeBrowser
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
        String distinguishedName = "ov1 = " + direction
                + ", ov2 = " + division
                + ", ov3 = " + department
                + ", ov4 = " + service
                + ", cn = " + firstName + lastName;

        CompanyBEmployees companyBEmployees = new CompanyBEmployees();
        return companyBEmployees.getEmployee(distinguishedName);
    }
}
