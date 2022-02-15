package ic.doc.strategy;

import java.util.Iterator;

public class FibonacciSequence implements sequenceValue {
  @Override
  public int value(int i) {
    if (i < 2) {
      return 1;
    }
    return term(i - 1) + term(i - 2);
  }
}
