package openclosedprinciple;

/**
 * Stands for the O in SOLID!
 *
 * The Open-Closed Principle, states that software entities should be open for
 * extension but closed for modification. What does this mean?
 * It means that once you write code, you shouldn't need to change it every
 * time you want to add new functionality.
 *
 *  Using a Java example with employees, we show how to extend code without
 *  modifying it. We'll see how to easily add new features or behaviors without
 *  breaking existing code.
 *
 *  We want to allow our code to be able to be extended, but closed for modification.
 */

import openclosedprinciple.after.Developer;
import openclosedprinciple.after.IEmployee;
import openclosedprinciple.after.ScrumMaster;

public class MainOC {
      public static void main(String[] args) {
            IEmployee iEmployee44 = new Developer("Alex");
            iEmployee44.performDuties();

            IEmployee iEmployee22 = new ScrumMaster("George");
            iEmployee22.performDuties();
      }
}
