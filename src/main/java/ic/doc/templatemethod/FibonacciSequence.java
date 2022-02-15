package ic.doc.templatemethod;

import java.util.Iterator;

public class FibonacciSequence extends NumberSequence {

  @Override
  public int sequenceValue(int i) {
    if (i < 2) {
      return 1;
    } // First values
    return term(i - 1) + term(i - 2);
  }

}
