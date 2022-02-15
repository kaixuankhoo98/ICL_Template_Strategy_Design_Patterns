package ic.doc.templatemethod;

import java.util.Iterator;

abstract class NumberSequence implements Iterable<Integer> {

    public int term(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Not defined for indices < 0");
        }
        return sequenceValue(i); // created abstract sequenceValue function to get next term.
    }

    abstract int sequenceValue(int i); // abstract function that's different between each class

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
            return term(index++);
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("remove is not implemented");
        }
    }
}
