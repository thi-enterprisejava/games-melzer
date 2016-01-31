package de.thi.games.web.model;

import de.thi.games.domain.Game;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@SessionScoped
@Named
public class GameProducer implements Serializable {

    private enum Mode {
        EDIT, ADD
    }

    private Game game;
    private Mode mode;

    public Game getSelectedGame() {
        return game;
    }

    public void setSelectedGame(Game game) {
        this.game = game;
    }

    public Boolean isAddMode() {
        return mode == Mode.ADD;
    }

    public void prepareAddGame() {
        this.game = new Game();
        this.mode = Mode.ADD;
    }

    public void prepareEditGame(Game game) {
        this.game = game;
        this.mode = Mode.EDIT;
    }
}
