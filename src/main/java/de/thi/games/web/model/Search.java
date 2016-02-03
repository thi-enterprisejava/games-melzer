package de.thi.games.web.model;

import de.thi.games.domain.Game;
import de.thi.games.services.GameServiceBean;


import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

@Named
@SessionScoped
public class Search implements Serializable {

    private GameServiceBean gameServiceBean;

    @Inject
    public Search(GameServiceBean gameServiceBean) {
        this.gameServiceBean = gameServiceBean;
    }

    public Search(){
    }

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

    public String doSearch() {

        System.out.println("doSearch");

        // Simulate search result
        result = gameServiceBean.findByName(searchPhrase);

        return "searchResult";

    }
}
