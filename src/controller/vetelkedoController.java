/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Random;
import model.doorModel;
import view.vetelkedoView;

/**
 *
 * @author viczai.p.milan
 */
public class vetelkedoController {
    
    private doorModel[] ajtok = new doorModel[3];
    
    public vetelkedoController() {
        ajtokLetrehozasa();
    }
    
    
    private void ajtokLetrehozasa() {
        Random rand = new Random();
        int winningDoor = rand.nextInt(3) + 1; // 1–3

        for (int i = 0; i < 3; i++) {
            int doorId = i + 1;
            int prize = (doorId == winningDoor) ? 1 : 0;
            ajtok[i] = new doorModel(doorId, prize, "src/view/kepek/csukottajto.png");
        }
    }

    public doorModel[] getDoors() {
        return ajtok;
    }
    
}
    
