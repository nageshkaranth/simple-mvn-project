package com.evolutionnext.model;

import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CalcStatsTest {
 @Test
 public void testMininumValueWithNoElements() {
  List<Integer> integers = new ArrayList<Integer>();
  CalcStats calcStats = new CalcStats(integers);
  assertNull(calcStats.getMinimum());
 }
}
