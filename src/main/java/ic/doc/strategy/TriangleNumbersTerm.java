package ic.doc.strategy;

public class TriangleNumbersTerm implements TermGenerator {
    @Override
    public int term(int i) {
        return ((i + 1) * (i + 2)) / 2;
    }
}
