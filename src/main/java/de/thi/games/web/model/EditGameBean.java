package de.thi.games.web.model;

import de.thi.games.domain.Game;
import de.thi.games.util.Events;

import javax.enterprise.context.SessionScoped;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@SessionScoped
@Named
public class EditGameBean implements Serializable {

    @Inject
    private GameProducer gameProducer;
    @Inject @Events.Added
    private Event<Game> gameAddEvent;

    public String doSave(){
        if(gameProducer.isAddMode()){
            gameAddEvent.fire(gameProducer.getSelectedGame());
        }
        return "mygames";
    }

    public String doCancel() {
        return "mygames";
    }
}
