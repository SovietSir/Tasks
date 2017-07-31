package javase01.t04;

import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FindMaxSumTest {


    @Test
    void findMaxSum() {
        assertThat(FindMaxSum.findMaxSum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), Is.is(11.0));
        assertThat(FindMaxSum.findMaxSum(2, 3), Is.is(5.0));
        assertThat(FindMaxSum.findMaxSum(), Is.is(0.0));
        assertThat(FindMaxSum.findMaxSum(1), Is.is(0.0));
        assertThat(FindMaxSum.findMaxSum(4, 8, 15, 16, 23, 42), Is.is(46.0));
    }

}