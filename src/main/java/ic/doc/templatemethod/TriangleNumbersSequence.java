package ic.doc.templatemethod;

import java.util.Iterator;

public class TriangleNumbersSequence extends NumberSequence {

    @Override
    public int sequenceValue(int i) {
        if (i < 1) {
            return 1;
        } // First value
        return ((i + 1) * (i + 2)) / 2;
    }
}
