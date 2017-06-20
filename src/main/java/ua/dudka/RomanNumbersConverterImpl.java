package ua.dudka;

/**
 * @author Rostislav Dudka
 */
public class RomanNumbersConverterImpl implements RomanNumbersConverter {

    private static final char DEFAULT_ROMAN_NUMBER = '0';

    @Override
    public int convert(String romanNumbers) {
        char[] numbers = romanNumbers.toCharArray();
        int sum = 0;

        for (int currentIndex = 0; currentIndex < numbers.length; currentIndex++) {
            int numeric = toNumeric(numbers[currentIndex]);
            int nextNumeric = toNumeric(nextRomanNumber(numbers, currentIndex));

            if (isNumberLtNext(numeric, nextNumeric)) {
                sum += nextNumeric - numeric;
                currentIndex++;
            } else {
                sum += numeric;
            }
        }

        return sum;

    }

    private boolean isNumberLtNext(int numericNumber, int nextNumericNumber) {
        return numericNumber < nextNumericNumber;
    }

    private char nextRomanNumber(char[] numbers, int numberIndex) {
        char romanNumber;
        int nextIndex = numberIndex + 1;
        if (isValuePresentByIndex(numbers, nextIndex)) {
            romanNumber = numbers[nextIndex];
        } else {
            romanNumber = DEFAULT_ROMAN_NUMBER;
        }
        return romanNumber;
    }

    private boolean isValuePresentByIndex(char[] numbers, int i) {
        return i < numbers.length;
    }

    private int toNumeric(char firstRomanNumber) {
        switch (firstRomanNumber) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;

            case 'D':
                return 500;

            case 'M':
                return 1000;

            default:
                return 0;
        }
    }
}