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
   */
  private FDUtil() {}

  /**
   * Generates trivial FDs for left-hand sides appearing in the input FD set.
   * FDs with empty right-hand sides are omitted.
   *
   * @param fdset input FD set; must not be modified
   * @return a new set of trivial FDs
   */
  public static FDSet trivial(final FDSet fdset) {
    // TODO: Obtain the power set of each FD's left-hand attributes.
    // For each non-empty subset, create an FD with the original left-hand
    // side and that subset as its right-hand side. Add it to a new FDSet.

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
    // TODO: Copy each FD in the input set, union both sides with attrs,
    // and add the augmented FD to a new FDSet.

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
    // TODO: Create a working copy of the input FD set.
    // Examine pairs of FDs and apply the rule described above.
    // Newly derived FDs must participate in subsequent iterations.
    // Collect additions separately to avoid modifying a set while iterating.
    // Repeat until no new FDs are found.
    // Return the derived FDs that were not in the original input.

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
    // TODO: Use the FDSet copy constructor to deep copy the input FD set.

    // TODO: Collect all attributes appearing on either side of the input FDs
    // into a set R, then compute powerSet(R).

    // TODO: For every non-empty subset X of R, add X -> X to the working FD set.

    // TODO: Repeatedly apply the following:
    // 1. For every subset Z of R, augment the working FD set with Z
    //    and add the results to the working FD set.
    // 2. Generate trivial FDs and add them to the working FD set.
    // 3. Generate transitive FDs and add them to the working FD set.
    // Stop when the size of the working FD set no longer changes.

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