public static int count8(int n) {
  // The Base case: if there is nothing else to process
  if (n == 0) {
    return 0;
}
  // Checks the last digit
  int lastDigit = n % 10;

  // Checks the next digit
  int nextDigit = (n / 10) % 10;

  // 1st case: The last digit is 8 and followed by another 8 (count 2)
  if (lastDigit == 8 && nextDigit == 8) {
    return 2 + count8(n / 10);
  }

  // Case 2: The last digit is 8 (count 1)
  else if (lastDigit == 8) {
    return 1 + count8(n / 10);
  }

  // Case 3: Digit isn't an 8 (skip)
  else {
    return count8(n / 10);
  }
}

public static int countHi(String str) {
  // The Base case: if there is only one character, it can't spell hi at all
  if (str.length() < 2) {
    return 0;
}

  // 1st case: If first two characters are hi,
  if (str.substring(0, 2).equals("hi")) {
    return 1 + countHi(str.substring(2));
  }

  // Case 2: Not hi, skips a character
  else {
    return countHi(str.substring(1));
  }
}

public static int countHi2(String str) {
  // The Base case: if there is only one character, it can't spell hi at all
  if (str.length() < 2) {
    return 0;
}

  // 1st case: If first two characters are hi, print, if it has an x before it, skip
  if (str.substring(0, 3).equals("xhi")) {
    return countHi2(str.substring(3));

  } else if (str.substring(0, 2).equals("hi")) {
    return 1 + countHi2(str.substring(2));
  }

  // Case 2: Not hi, skips a character
  else {
    return countHi2(str.substring(1));
  }
}
