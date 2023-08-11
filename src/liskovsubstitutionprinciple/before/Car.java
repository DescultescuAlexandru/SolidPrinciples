package liskovsubstitutionprinciple.before;

public class Car implements Vehicle{
      @Override
      public void startEngine() {
            System.out.println("Starting a car!");
      }
}
