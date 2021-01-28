import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class TestUnit4ProblemSet {

    @Test
    public void testPrimesCountFactors1() {

        // assertion
        assertEquals(8, Primes.countFactors(24));

    }

    @Test
    public void testPrimesCountFactors2() {

        // assertion
        assertEquals(6, Primes.countFactors(50));

    }

    @Test
    public void testPrimesIsPrime1() {

        // assertion
        assertFalse(Primes.isPrime(27));

    }

    @Test
    public void testPrimesIsPrime2() {

        // assertion
        assertTrue(Primes.isPrime(47));

    }

    @Test
    public void testPrimesCountPrimes1() {

        // assertion
        assertEquals(9, Primes.countPrimes(24));

    }

    @Test
    public void testPrimesCountPrimes2() {

        // assertion
        assertEquals(9592, Primes.countPrimes(100000));

    }

}