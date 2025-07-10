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
