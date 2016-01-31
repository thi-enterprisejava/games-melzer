package de.thi.games.web.model;

import de.thi.games.domain.Game;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

@Named
@SessionScoped
public class Search implements Serializable {

    private String searchPhrase;
    private List<Game> result;

    public String getSearchPhrase() {
        return searchPhrase;
    }

    public void setSearchPhrase(String searchPhrase) {
        this.searchPhrase = searchPhrase;
    }

    public List<Game> getResult() {
        return result;
    }

    public void setResult(List<Game> result) {
        this.result = result;
    }

    public String doSearch() {

        System.out.println("doSearch");

        // Simulate search result
        result = Arrays.asList(
                new Game("The Witcher"),
                new Game("Tekken 3"),
                new Game("Resident Evil 6")
        );

        return "searchResult";

    }
}
