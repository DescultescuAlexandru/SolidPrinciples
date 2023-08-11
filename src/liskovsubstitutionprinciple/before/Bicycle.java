package liskovsubstitutionprinciple.before;

public class Bicycle implements Vehicle{
      @Override
      public void startEngine() {
            throw new UnsupportedOperationException("Bicycle doesn't have an engine!");
      }
}
