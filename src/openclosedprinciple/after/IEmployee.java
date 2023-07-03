package openclosedprinciple.after;

/**
 * The Open-Closed Principle, states that software entities should be open for
 * extension but closed for modification. What does this mean?
 * It means that once you write code, you shouldn't need to change it every
 * time you want to add new functionality.
 *
 *  Using a Java example with employees, it shows how to extend code without
 *  modifying it. You'll see how to easily add new features or behaviors without
 *  breaking existing code.
 */

public interface IEmployee {
      String getName();
      void performDuties();
}
