import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class RockPaperScissorsTest {
    private RockPaperScissors rockPaperScissors;

    @Before
    public void setup() {
        rockPaperScissors = new RockPaperScissors();
    }

    @Test
    public void p1_Rock_p2_Paper() {
        RPS result = rockPaperScissors.result(RPS.ROCK, RPS.PAPER);


        assertThat(result, equalTo(RPS.P2_WINS));
    }
}
