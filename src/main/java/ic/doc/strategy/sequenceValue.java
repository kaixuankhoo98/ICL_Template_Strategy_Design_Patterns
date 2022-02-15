package ic.doc.strategy;

public interface sequenceValue {
    default int term(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Not defined for indices < 0");
        }
        return value(i);
    }

    int value(int i);
}
