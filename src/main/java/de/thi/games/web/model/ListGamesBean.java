package de.thi.games.web.model;

import de.thi.games.domain.Game;
import de.thi.games.util.Events;

import javax.enterprise.event.Event;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@ViewScoped
@Named
public class ListGamesBean implements Serializable {

    @Inject
    private GameProducer gameProducer;

    @Inject @Events.Deleted
    private Event<Game> gameDeleteEvent;

    private Game gameToDelete;

    public String doAddGame(){
        gameProducer.prepareAddGame();
        return "addgame";
    }

    public String doEditGame(Game game){
        gameProducer.prepareEditGame(game);
        return "addgame";
    }

    /*public String doListGames(){
        System.out.println("List Games");
        return "mygames";
    }*/

    public void doDeleteGame(Game game) {
        this.gameToDelete = game;
        System.out.println("Game is to be deleted");
    }

    public void commitDeleteGame() {
        gameDeleteEvent.fire(gameToDelete);
    }

    public String doShowDetails(Game game) {
        gameProducer.setSelectedGame(game);
        return "gamedetails";
    }
}
