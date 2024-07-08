package com.medium.vangamaheshkrishnareddy.understanding_recursion_with_java_a_deep_dive;

public class Factorial {
  // Instance or non-static methods
  public int factorial(int sampleInputNumber) {
      // Base condition
      if (sampleInputNumber == 0) return 1;
    return sampleInputNumber * this.factorial(sampleInputNumber - 1);
  }
}