import java.util.ArrayList;
import java.util.List;

public class Encryption {

    private final List<Crypto> cryptoList = new ArrayList<Crypto>(){{
        add(new Encrypt());
        add(new Decrypt());
    }};

    public String encryption(String studentNo, String inputText, Integer choice) {
        StringBuilder convertedText = new StringBuilder();
        for (int i = 0; i < inputText.length(); i++) {
            char letter = inputText.charAt(i);
            int number = 1;
            if (i < 5) {
                number = Character.getNumericValue(studentNo.charAt(i));
            }
            Crypto crypto = cryptoList.stream()
                    .filter(cryptoOperation -> cryptoOperation.getChoice() == choice)
                    .findFirst()
                    .orElseThrow(RuntimeException::new);

            char convertedLetter = crypto.execute(number, letter);
            convertedText.append(convertedLetter);
        }
        return convertedText.toString();
    }
}
