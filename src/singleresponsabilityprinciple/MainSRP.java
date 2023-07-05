package singleresponsabilityprinciple;

/**
 * Stands for the S in SOLID!
 *
 * The Single-responsibility Principle (SRP) focuses on the idea that a class or
 * module should have only one reason to change. By adhering to the SRP, we can
 * create more maintainable and flexible code.
 *
 * Through practical examples and code demonstrations in Java, we illustrate how
 * to identify and refactor code that violates the SRP. We also delve into the
 * concept of interfaces and their role in separating responsibilities, as well
 * as the use of facade classes to delegate responsibilities.
 *
 * A class should have one and only one reason to change, meaning that a class should have only one job.
 */

import singleresponsabilityprinciple.after.Employee;
import singleresponsabilityprinciple.after.PayrollFacade;
import singleresponsabilityprinciple.after.PermanentEmployee;

public class MainSRP {
      public static void main(String[] args) {
            Employee employee33 = new PermanentEmployee("Alex", 1234);
            PayrollFacade payrollFacade = new PayrollFacade();

            payrollFacade.calculateAndSendSalary(employee33);
      }
}
