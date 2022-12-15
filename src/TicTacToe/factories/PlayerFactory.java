package TicTacToe.factories;

import TicTacToe.models.Bot;
import TicTacToe.models.HumanPlayer;

public class PlayerFactory {
    public static HumanPlayer.Builder createHumanPlayer() {
        return HumanPlayer.getBuilder();
    }

    public static Bot.Builder createBot() {
        return Bot.getBuilder();
    }
}
