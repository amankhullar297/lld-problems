package ChessGame.services.implementations;

import ChessGame.models.Game;
import ChessGame.models.Player;
import ChessGame.services.GameService;

public class GameServiceImpl implements GameService {
    @Override
    public Game startNewGame(Player player1, Player player2) {
        Game game = new Game(player1, player2);
        initializeBoard(game);
        return game;
    }

    private void initializeBoard(Game game){

    }
}
