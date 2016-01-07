package de.thi.games.web.domain;

public class Genre {

    private String name;

    public Genre(){

    }

    public Genre(String name){
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

/**
 * - Multiplayer/Online
 * - Singleplayer -> Extra Attribut?
 *
 * - Actiom
 * - Adventure
 * - Strategie
 * - Simulation
 * - Miscellanious
 */
/**
 *
 * - Mehrspieler/Online-Spiel und Einzelspieler
 * - Actionspiele:
 *      Beat ’em up
 *      Ego-Shooter
 *      Taktik-Shooter
 *      Geschicklichkeitsspiel
 *      Hack & Slay
 *      Maze
 *      Jump ’n’ Run
 *      Plattform-Shooter
 *      Shoot ’em up
 *      Tanzspiel
 *      Third-Person-Shooter
 * - Abenteuerspiele:
 *      Action-Adventure
 *      Action-Rollenspiel (ARPG)
 *      Adventure
 *      Text-Adventure
 *      Point-and-Click
 *      Japanisches Adventure
 *      Rollenspiel
 *      MMORPG
 *      Strategie-Rollenspiel
 *      Survival-Horror
 * - Strategiespiele:
 *      Aufbaustrategie
 *      Echtzeitstrategiespiel
 *      Multiplayer Online Battle Arena
 *      Tower Defense
 *      Rundenbasiertes Strategiespiel
 *      Wirtschaftssimulation
 * - Simulationen:
 *      Flugsimulation
 *      Göttersimulation
 *      Lebenssimulation
 *      Marinesimulation
 *      Rennsimulation, Autosimulation
 *      Weltraum-Flugsimulation
 *      Wirtschaftssimulation
 *      Sportsimulation:
 *      Fußballsimulation
 *      Rennspiel
 *      Rennsimulation
 *      Olympiade-Spiele
 * - Sonstige:
 *      Retrospiel
 *      Puzzle
 *      Lernspiel
 *      Wimmelspiel
 */
