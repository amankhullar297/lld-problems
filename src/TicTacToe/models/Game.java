package TicTacToe.models;

import TicTacToe.exceptions.DuplicateSymbolException;
import TicTacToe.exceptions.InvalidPlayersQuantityException;
import TicTacToe.strategies.winning.IWinningStrategy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Game {
    private List<Player> players = new ArrayList<>();
    private Board board;
    private List<IWinningStrategy> winningStrategies = new ArrayList<>();

    public List<Player> getPlayers() {
        return players;
    }

    private void setPlayers(List<Player> players) {
        this.players = players;
    }

    public void printBoard() {
        board.printBoard();
    }


    private void setBoard(Board board) {
        this.board = board;
    }

    private void setWinningStrategies(List<IWinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public static class Builder {
        private Game game;
        private int rows;
        private int columns;

        Builder() {
            this.game = new Game();
        }

        public Builder addPlayer(Player player) {
            game.getPlayers().add(player);
            return this;
        }

        public Builder addWinningStrategy(IWinningStrategy strategy) {
            game.winningStrategies.add(strategy);
            return this;
        }

        public Builder setRows(int rows) {
            this.rows = rows;
            return this;
        }

        public Builder setColumns(int columns) {
            this.columns = columns;
            return this;
        }

        public Game build() {
            if (game.getPlayers().size() < 2)
                throw new InvalidPlayersQuantityException();

            if(rows < game.players.size())
                throw new InvalidPlayersQuantityException();

            Set<Character> symbols = new HashSet<>();

            for (Player player: game.getPlayers()) {
                if (symbols.contains(player.symbol.getSymbol()))
                    throw new DuplicateSymbolException();
            }

            Board board = new Board(rows, columns);

            game.setBoard(board);
            return game;
        }
    }
}