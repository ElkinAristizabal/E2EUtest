package utest.utils;

import java.security.SecureRandom;
import java.util.Random;

public class RandomGenerator {

    public static String email() {
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        int minLength = 5;
        int maxLength = 8;
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        int length = random.nextInt(maxLength - minLength + 1) + minLength;

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            char randomChar = characters.charAt(index);
            sb.append(randomChar);
        }
        String randomString = sb.toString();
        String randomEmail = randomString + "@gmail.com";
        return randomEmail;
    }

    public static String month() {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        Random random = new Random();
        String month = months[random.nextInt(months.length)];
        return month;
    }

    public static String day() {
        Random random = new Random();
        int intDay = random.nextInt(28) + 1;
        String day = Integer.toString(intDay);
        return day;
    }

    public static String city() {
        String[] colombianCities = {
                "Bogotá, Colombia", "Medellín, Colombia", "Cali, Colombia", "Barranquilla, Colombia",
                "Cartagena, Colombia", "Cúcuta, Colombia", "Soledad, Colombia", "Ibagué, Colombia",
                "Bucaramanga, Colombia", "Santa Marta, Colombia", "Valledupar, Colombia", "Manizales, Colombia",
                "Pereira, Colombia", "Pasto, Colombia", "Villavicencio, Colombia", "Montería, Colombia",
                "Neiva, Colombia", "Sincelejo, Colombia", "Popayán, Colombia", "Floridablanca, Colombia"
        };;
        Random random = new Random();
        int randomIndex = random.nextInt(colombianCities.length);
        String randomCity = colombianCities[randomIndex];
        return randomCity;
    }

    public static  String postalCode (){
        Random random = new Random();
        int randomNumber = random.nextInt(900000) + 100000;
        String PostalCode = Integer.toString(randomNumber);
        return PostalCode;
    }

    public static String password() {
        SecureRandom random = new SecureRandom();
        String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";

        String allCharacters = upperCaseLetters + lowerCaseLetters + numbers;

        StringBuilder randomString = new StringBuilder();

        randomString.append(upperCaseLetters.charAt(random.nextInt(upperCaseLetters.length())));
        randomString.append(lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length())));
        randomString.append(numbers.charAt(random.nextInt(numbers.length())));

        for (int i = 3; i < 19; i++) {
            randomString.append(allCharacters.charAt(random.nextInt(allCharacters.length())));
        }
        String password = randomString.toString();
        return password;
    }

}
