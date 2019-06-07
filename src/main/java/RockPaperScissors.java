class RockPaperScissors {
    RPS play(RPS p1, RPS p2) {
        if (p2.equals(RPS.PAPER)) {
            return RPS.P2_WINS;
        }
        return RPS.P1_WINS;
    }
}