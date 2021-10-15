package com.company;

import java.util.Random;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    static List cardsValue = new ArrayList();
    static List cardType = new ArrayList();

    static void listOfCards() {

        cardsValue.add("Ace");
        cardsValue.add("2");
        cardsValue.add("3");
        cardsValue.add("4");
        cardsValue.add("5");
        cardsValue.add("6");
        cardsValue.add("7");
        cardsValue.add("8");
        cardsValue.add("9");
        cardsValue.add("10");
        cardsValue.add("Jack");
        cardsValue.add("Queen");
        cardsValue.add("King");


        cardType.add("Of Spades");
        cardType.add("Of Hearts");
        cardType.add("Of Clubs");
        cardType.add("Of Diamonds");
    }

    static void randomCard() {
        listOfCards();
        Random random = new Random();
        int cardsValueElement = random.nextInt(cardsValue.size());
        String cardNumberDealt = String.valueOf(cardsValue.get(cardsValueElement));
        int cardTypeElement = random.nextInt(cardType.size());
        String cardTypeDealt = String.valueOf(cardType.get(cardTypeElement));
        System.out.println(cardNumberDealt + " " + cardTypeDealt);
    }

    public static void main(String[] args) {
        List userCards = new ArrayList();
        Scanner input = new Scanner(System.in);
        int gameBegin = 0;
        do {
            System.out.println("Would you like to play Blackjack?");
            String gameStart = input.next();
            if (gameStart.equals("yes")) {
                gameBegin = gameBegin + 1;
            } else {
                System.out.println("Thank you");
                System.exit(0);
            }

        }
        while (gameBegin == 0);

        System.out.println("Here is your first card");
        randomCard();
        System.out.println("Here is your second card");
        randomCard();


        int hit = 0;

        do {
            System.out.println("Would you like to hit or stand?");
            String userChoice = input.next();
            if (userChoice.equals("hit")) {
                randomCard();
            } else {
                hit = hit + 1;

            }


        } while (hit == 0);

    }
}