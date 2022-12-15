package TicTacToe;

import TicTacToe.controllers.GameController;
import TicTacToe.factories.PlayerFactory;
import TicTacToe.models.Game;
import TicTacToe.models.User;
import TicTacToe.strategies.automove.RandomMoveStrategy;
import TicTacToe.strategies.winning.DefaultWinningStrategy;

public class Main {

    public static void main(String[] args) {
        Game game = Game.getBuilder()
                .addPlayer(
                        PlayerFactory.createHumanPlayer()
                            .setUser(new User())
                            .setSymbol('O')
                            .build())
                .addPlayer(
                        PlayerFactory.createBot()
                            .setMoveStrategy(new RandomMoveStrategy())
                            .setSymbol('X')
                            .build())
                .addWinningStrategy(new DefaultWinningStrategy())
                .setRows(3)
                .setColumns(3)
                .build();

        GameController.run(game);
    }
}