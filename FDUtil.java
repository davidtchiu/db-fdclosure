import java.util.HashSet;
import java.util.Set;

/**
 * This utility class cannot be instantiated and provides useful methods on FD sets.
 * Input structures must not be modified by any method.
 *
 * @author <<YOUR NAME>>
 * @version <<DATE>>
 */
public final class FDUtil {
  /**
   * A private constructor prevents people from accidentally instantiating this class.
   * DO NOT MODIFY
   */
  private FDUtil() {}

  /**
   * TODO TODO TODO
   * Generates trivial FDs for left-hand sides appearing in the input FD set.
   * FDs with empty right-hand sides are omitted.
   *
   * @param fdset input FD set; must not be modified
   * @return a new set of trivial FDs
   */
  public static FDSet trivial(final FDSet fdset) {
    // TODO
    
    return null;
  }

  /**
   * Augments both sides of every input FD with the given attributes.
   *
   * @param fdset input FD set; must not be modified
   * @param attrs attributes to union with both sides; must not be modified
   * @return a new set of augmented FDs
   */
  public static FDSet augment(final FDSet fdset, final Set<String> attrs) {
    // TODO

    return null;
  }

  /**
   * Repeatedly applies transitivity until no new FDs can be generated.
   * Given X -> Y and Z -> W, generate X -> W when Z is a subset of Y.
   *
   * @param fdset input FD set; must not be modified
   * @return newly derived FDs, excluding FDs already in the input set
   */
  public static FDSet transitive(final FDSet fdset) {
    // TODO

    return null;
  }

  /**
   * Generates the closure of the input FD set, omitting FDs with empty
   * right-hand sides. The relation's attributes are assumed to be exactly
   * those appearing on either side of the input FDs.
   *
   * @param fdset input FD set; must not be modified
   * @return a new FD set containing the closure
   */
  public static FDSet fdSetClosure(final FDSet fdset) {
    // TODO

    return null;
  }

  /**
   * Generates the power set of the input set, including the empty subset.
   *
   * @param set input set; must not be modified
   * @return a new set containing all subsets of the input set
   */
  public static <E> Set<Set<E>> powerSet(final Set<E> set) {
    // Base case: the power set of the empty set contains just the empty set.
    if (set.isEmpty()) {
      Set<Set<E>> basePset = new HashSet<>();
      basePset.add(new HashSet<>());
      return basePset;
    }

    // Recursive case

    // TODO: Choose an element and create a copy of the input set without it.

    // TODO: Recursively obtain the power set of the reduced set.

    // TODO: For each subset returned by recursion, create a new copy that
    // also contains the chosen element. Collect these new subsets separately.
    // Do not modify subsets already stored in a HashSet.

    // TODO: Combine the subsets without the chosen element and the new
    // subsets containing it, then return the result.

    return null;
  }
}