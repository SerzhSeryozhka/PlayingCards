import KSA.Suit;
import org.junit.Test;

import java.util.ArrayList;

import static KSA.Suit.Diamonds;
import static KSA.Suit.Hearts;

public class TestCrTr {
    @Test
    public void testReading(){
        ArrayList<Suit> playingCards=new ArrayList<>();
        playingCards.add(6, Diamonds);
        playingCards.add(7, Hearts);
        playingCards.add(8, Suit.Spades);
//        playingCards.add()
    }
}
