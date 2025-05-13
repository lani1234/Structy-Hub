class Source {
  public static double maxValue(double[] numbers) {
    double max = Double.NEGATIVE_INFINITY;
    for(double number : numbers) {
      max = Math.max(max, number);
    }
    return max;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function, but should not remove it
  }
}