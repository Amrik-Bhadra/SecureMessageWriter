package securemessagewriter_vf;

import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class AESUtility {
    // this function is used to generate the secret key
    // first we need to provide the algorithm which we are gonna use (for us its AES: Advanced Encryption Standard)
    public static String generateKey() throws Exception {
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(128); // here we give key size in bits, minimum ; higher the size, more secure it is
        SecretKey generatedKey = keyGen.generateKey();
        String generatedSecretKey = Base64.getEncoder().encodeToString(generatedKey.getEncoded());
        return generatedSecretKey;
    }

    // this function is going to encrypt the secret message
    // we need to provide the plain text and secret key
    public static String encryptMessage(String plainText, String key) throws Exception {
        byte[] decodedKey = Base64.getDecoder().decode(key);
        SecretKeySpec secretKeySpec = new SecretKeySpec(decodedKey, "AES");

        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);

        byte[] encryptedBytes = cipher.doFinal(plainText.getBytes());
        String cipherText = Base64.getEncoder().encodeToString(encryptedBytes);
        return cipherText;
    }

    // this function is going to decrypt the secret message
    // we need to provide the cipher text and secret key
    public static String decryptMessage(String cipherText, String key) throws Exception {
        byte[] decodedKey = Base64.getDecoder().decode(key);
        SecretKeySpec secretKeySpec = new SecretKeySpec(decodedKey, "AES");

        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);

        byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(cipherText));
        return new String(decryptedBytes); // Return the decrypted message
    }

   
}
