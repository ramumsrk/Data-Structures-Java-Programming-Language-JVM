package com.medium.vangamaheshkrishnareddy.understanding_recursion_with_java_a_deep_dive;

import java.util.logging.Logger;
import java.util.stream.IntStream;

public class FactorialDemo {
  private static final Logger LOGGER =
    Logger.getLogger(FactorialDemo.class.getName());
  // Java program execution starts from
  // built-in `main()' method
  public static void main(String... args) {
      Factorial factorial = new Factorial();
      IntStream.range(0,11).forEach(
        sampleInputNumber -> LOGGER.info(
          String.format(
            "Factorial of '%d' is '%d'\n",
            sampleInputNumber,
            factorial.factorial(sampleInputNumber)
          )
        )
      );
    return;
  }
} 