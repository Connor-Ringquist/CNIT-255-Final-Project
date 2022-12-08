/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package1;

import package2.Gear_Jacket;

/**
 *
 * @author sport
 */
public class Story {
    Game game;
    GUI gui;
    whatShows showing;
    Player player = new Player();    
    public Story(Game g, GUI guInterface, whatShows shows) {
        game = g;
        gui = guInterface;
        showing = shows;
    }
    
    public void defaultSetup() {
        player.hp = 10;
        gui.hpNumber.setText("" + player.hp);
        player.condition = "None";
        gui.conditionName.setText("" + player.condition);
        player.currentGear = new Gear_Jacket();
        gui.gearName.setText(player.currentGear.name);
    }
}
