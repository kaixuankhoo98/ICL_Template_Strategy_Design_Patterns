package ic.doc.strategy;

import java.util.Iterator;

public class Sequence implements Iterable<Integer> {
    private TermGenerator sequence;

    public Sequence(TermGenerator s) {
        sequence = s;
    }

    public int getNthTerm(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Not defined for indices < 0");
        } // negative index handling
        return sequence.term(i);
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
