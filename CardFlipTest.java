

import anz.card.game.CardFlip;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CardFlipTest {

    @Test
    @DisplayName("Test with input U,U,U,U,U")
    public void testWithInput1(){
        CardFlip cardFlip = new CardFlip();
        char[] input = {'U', 'U', 'U','U' ,'U'};

        Assertions.assertEquals(0, cardFlip.maximumMoves(input,input.length));
        Assertions.assertEquals(0, cardFlip.minimumMoves(input,input.length));
    }

    @Test
    @DisplayName("Test with input D,D,D,D,D")
    public void testWithInput2(){

        CardFlip cardFlip = new CardFlip();
        char[] input = {'D','D','D','D','D'};

        Assertions.assertEquals(120, cardFlip.maximumMoves(input,input.length));
        Assertions.assertEquals(3, cardFlip.minimumMoves(input,input.length));
    }

    @Test
    @DisplayName("Test with input D,D,D,U,D,U")
    public void testWithInput3(){

        CardFlip cardFlip = new CardFlip();
        char[] input = {'D', 'D', 'D', 'U', 'D', 'U'};

        Assertions.assertEquals(26, cardFlip.maximumMoves(input,input.length));
        Assertions.assertEquals(3, cardFlip.minimumMoves(input,input.length));
    }

    @Test
    @DisplayName("Test with input D,U,D,D,D,U,D,U")
    public void testWithInput4(){

        CardFlip cardFlip = new CardFlip();
        char[] input = {'D', 'U', 'D', 'D', 'D', 'U', 'D', 'U'};

        Assertions.assertEquals(123, cardFlip.maximumMoves(input,input.length));
        Assertions.assertEquals(5, cardFlip.minimumMoves(input,input.length));
    }

    @Test
    @DisplayName("Test with input D, D, D, U, D, U")
    public void testWithInput5(){

        CardFlip cardFlip = new CardFlip();
        char[] input = {'D', 'D', 'D', 'D', 'U', 'D', 'U'};

        Assertions.assertEquals(122, cardFlip.maximumMoves(input,input.length));
        Assertions.assertEquals(4, cardFlip.minimumMoves(input,input.length));
    }

    @Test
    @DisplayName("Test with input D, U, D, D, D, U, D, U")
    public void testWithInput6(){

        CardFlip cardFlip = new CardFlip();
        char[] input = {'D', 'U', 'D', 'D', 'D', 'U', 'D','U'};

        Assertions.assertEquals(123, cardFlip.maximumMoves(input,input.length));
        Assertions.assertEquals(5, cardFlip.minimumMoves(input,input.length));
    }
}
