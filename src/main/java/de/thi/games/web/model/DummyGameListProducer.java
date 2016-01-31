package de.thi.games.web.model;

import de.thi.games.domain.Game;
import de.thi.games.domain.Genre;
import de.thi.games.domain.Platform;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@SessionScoped
@Named
public class DummyGameListProducer implements Serializable{

    private List<Game> games;

    public DummyGameListProducer(){
        games = createDummyGames();
    }

    public List<Game> getGames() {
        return games;
    }

    public List<Game> createDummyGames() {

        Game game1 = new Game();
        game1.setName("The Witcher");
        game1.setPublisher("CD Project RED");
        game1.setDescription("Cool Hack and Slay Adventure with awesome Storyline");
        game1.setMultiplayer(false);
        game1.setYear(2004);
        Platform p1 = new Platform();
        p1.setName("PC");
        game1.setPlatform(p1);
        Genre genre1 = new Genre();
        genre1.setName("Adventure");
        Genre genre2 = new Genre();
        genre2.setName("Hack'n'Slay");
        List<Genre> genres = new ArrayList<>();
        genres.add(genre1);
        genres.add(genre2);
        game1.setGenres(genres);

        Game game2 = new Game();
        game2.setName("The Elder Scrolls V - Skyrim");
        game2.setPublisher("Bethesda Softworks");
        game2.setDescription("Best Role-Play Game ever!!!");
        game2.setMultiplayer(false);
        game2.setYear(2011);
        Platform p2 = new Platform();
        p2.setName("Playstation 3");
        game2.setPlatform(p2);
        Genre genre3 = new Genre();
        genre3.setName("Role Play Game");
        List<Genre> genres2 = new ArrayList<>();
        genres2.add(genre1);
        genres2.add(genre3);
        game2.setGenres(genres2);

        Game game3 = new Game();
        game3.setName("Tekken 6");
        game3.setPublisher("Namco");
        game3.setDescription("Cool Fighting Game");
        game3.setMultiplayer(true);
        game3.setYear(2011);
        game3.setPlatform(p2);
        List<Genre> genres3 = new ArrayList<>();
        genres3.add(genre1);
        genres3.add(genre3);
        game3.setGenres(genres2);

        List<Game> retGames = new ArrayList<>();
        retGames.add(game1);
        retGames.add(game2);
        retGames.add(game3);
        return retGames;
    }
}
