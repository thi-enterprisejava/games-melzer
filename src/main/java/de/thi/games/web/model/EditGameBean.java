package de.thi.games.web.model;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@SessionScoped
@Named
public class EditGameBean implements Serializable {

    @Inject
    private DummyGameListProducer gameListProducer;
    @Inject
    private GameProducer gameProducer;

    public String doSave(){
        if(gameProducer.isAddMode()){
            gameListProducer.getGames().add(gameProducer.getSelectedGame());
        }
        return "mygames";
    }

    public String doCancel() {
        return "mygames";
    }
}
