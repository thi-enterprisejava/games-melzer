package de.thi.games.services;

import de.thi.games.domain.Game;

import javax.enterprise.context.RequestScoped;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RequestScoped
public class GameServiceBean implements GameService {

    List<Game> game = new ArrayList<>();

    @Override
    public List<Game> getAllGames() {
        return new ArrayList<Game>();
    }

    public List<Game> findByName(String name){
        // System.out.println("Test " + game.get(0));
        return game.stream().filter(game ->
                game.getName().contains(name)).collect(Collectors.toList());
    }
}
