package ic.doc.strategy;

import java.util.Iterator;

public class TriangleNumbersSequence implements sequenceValue {
    @Override
    public int value(int i) {
        return ((i + 1) * (i + 2)) / 2;
    }
}
