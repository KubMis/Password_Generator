package com.company;


import java.util.Random;
import java.util.Scanner;


public class Generator {

    public void passwordGenerator() {
        Password password = new Password();
        Scanner scan = new Scanner(System.in);
        Random random = new Random();


        System.out.println("Password Length");
        password.Length = scan.nextInt();

        System.out.println("Should contain number ?(true/false)");
        password.Numbers = scan.nextBoolean();

        System.out.println("Should contain special character ?(true/false");
        password.specialCharacters = scan.nextBoolean();


        char[] generatedPassword = new char[password.Length];
        for (int i = 0; i < password.Length; i++) {

            int r1 = (int) (Math.random() * 25);
            char randomizedCharacter = (char) (random.nextInt(r1 + 1) + 'a');
            generatedPassword[i] = randomizedCharacter;

        }


        if (password.specialCharacters == true) {

            String specialChar = "!@#$%^&*()?/.,[]{}|`~";
            int randomInt = random.nextInt(specialChar.length());
            char randomChar = specialChar.charAt(randomInt);
            int insert = (int) (Math.random() * password.Length);
            generatedPassword[insert] = randomChar;

        }


        if (password.Numbers == true) {

            String number = "0123456789";
            int randomInt = random.nextInt(number.length());
            char randomNumber = number.charAt(randomInt);
            int insert = (int) (Math.random() * password.Length);
            generatedPassword[insert] = randomNumber;

            }

            for (int i = 0; i < password.Length; i++)
                System.out.print(generatedPassword[i]);

        }
    }

