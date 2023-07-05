package singleresponsabilityprinciple.after;

public class BasicSalaryCalculator implements SalaryCalculator {
      @Override
      public double calculateBasicSalary(Employee employee) {
            return 10000.0;
      }

      @Override
      public double calculateBonusSalary(Employee employee) {
            return 3000.0;
      }
}
