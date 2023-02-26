public class Encrypt implements Crypto {

    @Override
    public char execute(int number, char letter) {
        KeyMatch keyMatch = new KeyMatch();
        for (int j = 0; j < number; j++) {
            letter = keyMatch.getValue(letter);
        }
        return letter;
    }

    @Override
    public int getChoice() {
        return 1;
    }
}
