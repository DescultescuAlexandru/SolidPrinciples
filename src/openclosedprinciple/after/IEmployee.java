package openclosedprinciple.after;

/**
 * All the existing or future roles will implement this interface and will
 * provide specific implementation of the methods according to the roles.
 *
 * Any time a new role emerges, all that is needed to be done is a new implementation
 * of this interface for the new role without modifying the existing code.
 */

public interface IEmployee {
      String getName();
      void performDuties();
}
