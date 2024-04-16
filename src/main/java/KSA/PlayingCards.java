package KSA;

import java.util.Objects;

public class PlayingCards {
    String quality;
    Suit colorit;

    public PlayingCards(String quality, Suit colorit) {
        this.quality = quality;
        this.colorit = colorit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlayingCards that = (PlayingCards) o;
        return Objects.equals(quality, that.quality) && colorit == that.colorit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(quality, colorit);
    }

    @Override
    public String toString() {
        return "PlayingCards{" +
                "quality='" + quality + '\'' +
                ", colorit=" + colorit +
                '}';
    }

}
