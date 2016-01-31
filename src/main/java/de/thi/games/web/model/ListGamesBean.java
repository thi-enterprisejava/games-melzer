package de.thi.games.web.model;

import de.thi.games.domain.Game;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@SessionScoped
@Named
public class ListGamesBean implements Serializable {

    @Inject
    private GameProducer gameProducer;

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
        System.out.println("Game deletion not implemented yet!");
    }

    public String doShowDetails(Game game) {
        gameProducer.setSelectedGame(game);
        return "gamedetails";
    }
    //DoSaveGame
}
