package KSA;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CardTrick {
    public static ArrayList<PlayingCards> readNextCard(String file) {
        try {
            Scanner scanner = new Scanner(new File(file));
            ArrayList<PlayingCards> cards = new ArrayList<>();
            while (scanner.hasNext()) {
                String s = scanner.nextLine();
                Suit sv =Suit.valueOf(scanner.next());
                PlayingCards playingCards = new PlayingCards(s,sv);
                cards.add(playingCards);
            }
            System.out.println(cards);
            scanner.close();
            return cards;
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }

        }

//    private static PlayingCards makePCFromFile(String s) {
//        ArrayList<PlayingCards> card = readNextCard("6 3 4 7 8 2 4 K J T");
//        return card;
//    }
}
