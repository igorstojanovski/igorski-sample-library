package co.igorski;

import org.apache.commons.lang3.RandomStringUtils;

public class Main {

  public static void main(String[] args) {
      RandomStringGenerator generator = new RandomStringGenerator.Builder()
          .withinRange('a', 'z').build();
      String randomLetters = generator.generate(20);
    System.out.println(
        RandomStringUtils.random(
            Integer.parseInt(args[0]),
            Boolean.parseBoolean(args[0]),
            Boolean.parseBoolean(args[0])));
    ;
  }
}
