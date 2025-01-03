public class makeWords {
  public static void makeWords(int remainingLetters, String result, String alphabet) {
    if (remainingLetters == 0) {
      System.out.println(result);
    }

    else {
      remainingLetters--;
      for (int i=1; i<alphabet.length(); i++) {
        result+=alphabet.substring(i-1, i);
      }
    }
  }

  public static void main(String[] args) {
    makeWords(2, "", "abc");
  }
}
