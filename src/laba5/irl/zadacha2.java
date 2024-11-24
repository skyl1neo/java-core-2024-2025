package laba5.irl;

public class zadacha2 {
    private final char startChar;
    private final char endChar;

    public zadacha2(char startChar, char endChar) {
        this.startChar = startChar;
        this.endChar = endChar;
    }

    public void printCharRange() {
        char lower = (char) Math.min(startChar, endChar);
        char upper = (char) Math.max(startChar, endChar);

        System.out.print("Символы в диапазоне: ");
        for (char c = lower; c <= upper; c++) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        zadacha2 charRange = new zadacha2('A', 'D');

        charRange.printCharRange();

        zadacha2 charRange2 = new zadacha2('d', 'a');
        charRange2.printCharRange();
    }
}

