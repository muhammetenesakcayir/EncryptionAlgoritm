import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Metni Giriniz: ");
        String inputText = sc.nextLine();

        System.out.print("Öğrenci Numaranızı Girin: ");
        String studentNumber = sc.nextLine();

        String lastFiveDigitsOfStudentNumber;
        try {
            lastFiveDigitsOfStudentNumber = studentNumber.substring(studentNumber.length() - 5);
            Integer.parseInt(lastFiveDigitsOfStudentNumber);
        } catch (Exception e) {
            throw new IllegalArgumentException("Öğrenci numarası geçersiz");
        }

        System.out.print("Şifrelemek istiyorsanız '1' , Şifre çözmek istiyorsanız '2' ye basınız: ");

        try {
            int choice = Integer.parseInt(sc.nextLine());
            if (choice != 1 && choice != 2) {
                throw new Exception("Hatalı bir seçenek girdiniz");
            }
            Encryption encryption = new Encryption();
            String encryptionText = encryption.encryption(lastFiveDigitsOfStudentNumber, inputText, choice);
            System.out.println(encryptionText);
        } catch (Exception e) {
            System.out.println("Hatalı bir seçenek girdiniz");
        }
    }
}