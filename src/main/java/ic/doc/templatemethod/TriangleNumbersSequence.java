package ic.doc.templatemethod;

import java.util.Iterator;

public class TriangleNumbersSequence extends NumberSequence {

    @Override
    public int sequenceValue(int i) {
        return ((i + 1) * (i + 2)) / 2;
    }
}
