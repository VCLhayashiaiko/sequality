package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  @Test
  public void testSumOf2And3() {
    Calculate calculate = new Calculate();
    int sum = calculate.sum(2, 3);
    double avg = sum / 2.0;
    assertEquals(5, sum);
    assertEquals(2.5, avg, 0.0001);
  }

  @Test
  public void testSumAndAverageOf1To10() {
    int sum = 0;
    for (int i = 1; i <= 10; i++) {
      sum += i;
    }
    double avg = sum / 10.0;
    assertEquals(55, sum);
    assertEquals(5.5, avg, 0.0001);
  }

  @Test
  public void testSumOfOddAndEvenFrom1To10() {
    int sumOdd = 0;
    int sumEven = 0;
    for (int i = 1; i <= 10; i++) {
      if (i % 2 == 0) {
        sumEven += i;
      } else {
        sumOdd += i;
      }
    }
    assertEquals(25, sumOdd);
    assertEquals(30, sumEven);
  }
}
