package ic.doc.strategy;

import java.util.Iterator;

public class SequenceGenerator implements Iterable<Integer> {
    // Context for the sequences
    sequenceValue sequence;

    public SequenceGenerator(sequenceValue s) {
        sequence = s;
    }

    public Iterator<Integer> iterator() {
        return new SequenceIterator();
    }

    private class SequenceIterator implements Iterator<Integer> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            return sequence.term(index++); // changed to sequence.term() from term()
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("remove is not implemented");
        }
    }

}
