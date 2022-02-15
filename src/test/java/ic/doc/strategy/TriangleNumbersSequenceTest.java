package ic.doc.strategy;

import static ic.doc.matchers.IterableBeginsWith.beginsWith;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.fail;

import org.junit.Test;

public class TriangleNumbersSequenceTest {

    final SequenceGenerator tri = new SequenceGenerator(new TriangleNumbersSequence());

    @Test
    public void definesFirstTermToBeOne() {
        assertThat(tri.sequence.term(0), is(1));
    }

    @Test
    public void definesSecondAndThirdTermsToBeThreeAndSix() {
        assertThat(tri.sequence.term(1), is(3));
        assertThat(tri.sequence.term(2), is(6));
    }

    @Test
    public void isUndefinedForNegativeIndices() {
        try {
            tri.sequence.term(-1);
            fail("should have thrown exception");
        } catch (IllegalArgumentException e) {
            assertThat(e.getMessage(), containsString("Not defined for indices < 0"));
        }
    }

    @Test
    public void canBeIteratedThrough() {
        assertThat(tri, beginsWith(1, 3, 6, 10, 15));
    }
}