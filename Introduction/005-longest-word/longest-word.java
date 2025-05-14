class Source {
  public static String longestWord(String sentence) {
    String longestWord = "";
    for(String word : sentence.split(" ")) {
      if(word.length() >= longestWord.length()) {
        longestWord = word;
      }
    }
    return longestWord;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function, but should not remove it
  }
}