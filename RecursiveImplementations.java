public static int count8(int n) {
  // The Base case: if there is nothing else to process
  if (n == 0) {
    return 0;
}
  // Checks the last digit
  int lastDigit = n % 10;

  // Checks the next digit
  int nextDigit = (n / 10) % 10;

  // Case 1: The last digit is 8 and followed by another 8 (count 2)
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

  // Case 1: If first two characters are hi,
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

  // Case 1: If first two characters are hi, print, if it has an x before it, skip
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

public static int count(String str, String sub) {
  // The Base case: if there is less characters than there is in the sub, then it won't work
  if (str.length() < sub.length()) {
    return 0;
}

  // Case 1: Match found, catch it and 
  if (str.startsWith(sub)) {
    return 1 + count(str.substring(sub.length()), sub) ;
  }

  // Case 2: character doesn't match with the sub, move on to the next
  else {
    return count(str.substring(1));
  }
}


public static String stringClean(String str) {
  // The Base case: if there is less than 2 characters, it will just skip to the end
  if (str.length() < 2) {
    return str;
}

  // Case 1: If matching character(s) found, duplicate characters are cleaned up, so only one of each remains
  if (str.charAt(0) == str.charAt(1)) {
    return stringClean(str.substring(1));
  }

  // Case 2: if there is no match, move on to the next character
  return str.charAt(0) + stringClean(str.substring(1));
}
