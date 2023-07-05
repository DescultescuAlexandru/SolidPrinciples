package singleresponsabilityprinciple.before;

/**
 * This Employee Class has 3 responsibilities: gathers employee data, calculates employee
 * salary and sends an email.
 *
 * This 3 responsibilities will be divided into 3 interfaces, that will, in their
 * turn, have 3 corresponding implementations.
 */

public class Employee {
      private String name;
      private int id;
      private double basicSalary;
      private double bonusSalary;

      public Employee(String name, int id, double basicSalary, double bonusSalary) {
            this.name = name;
            this.id = id;
            this.basicSalary = basicSalary;
            this.bonusSalary = bonusSalary;
      }

      public void calculateSalary() {
            double totalSalary = basicSalary + bonusSalary;

            sendSalaryEmail(totalSalary);
      }

      private void sendSalaryEmail(double totalSalary) {
            System.out.println("Email sent to " + name + " (ID: " + id + ")");
            System.out.println("Total Salary: $" + totalSalary);
      }
}