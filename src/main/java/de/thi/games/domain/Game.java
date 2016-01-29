package de.thi.games.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Game implements Serializable{

    private String name;
    private String description;
    private String publisher;
    private Platform platform;
    private List<Genre> genres = new ArrayList();
    private int year;
    private Boolean multiplayer;
    private byte[] cover;

    public Game(){}

    public Game(String name){
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Boolean getMultiplayer() {
        return multiplayer;
    }

    public void setMultiplayer(Boolean multiplayer) {
        this.multiplayer = multiplayer;
    }

    public byte[] getCover() { return cover; }

    public void setCover(byte[] cover) { this.cover = cover; }
}
