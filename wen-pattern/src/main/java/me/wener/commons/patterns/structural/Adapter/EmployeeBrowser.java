package me.wener.commons.patterns.structural.Adapter;

/**
 * Retrieve information about the employees.
 */
interface EmployeeBrowser
{
    /**
     * Retrieve the employee information.
     *
     * @param direction  The employee direction.
     * @param division   The employee division.
     * @param department The employee departement.
     * @param service    The employee service.
     * @param firstName  The employee firstName.
     * @param lastName   The employee lastName.
     * @return The employee object.
     */
    Employee getEmployee(String direction, String division, String department, String service, String firstName, String lastName);
}
