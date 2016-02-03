package de.thi.games.web.model;

import de.thi.games.domain.Game;
import de.thi.games.domain.Genre;
import de.thi.games.domain.Platform;
import de.thi.games.services.GameService;
import de.thi.games.util.Events;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.event.Observes;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SessionScoped
public class DummyGameListProducer implements Serializable{

    @Inject
    private GameService gameService;

    private List<Game> games;

    @PostConstruct
    public void init() {
        games = gameService.getAllGames();
    }

    public void onGameAdded(@Observes @Events.Added Game game) {
        getGames().add(game);
    }

    public void onGameDelete(@Observes @Events.Deleted Game game) {
        getGames().remove(game);
    }

    @Named
    @Produces
    public List<Game> getGames() {
        return games;
    }

}
