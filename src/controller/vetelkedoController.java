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
    
    private doorModel ajto1;
    private doorModel ajto2;
    private doorModel ajto3;
    private vetelkedoView nezet;
    
    public vetelkedoController() {
        ajtokLetrehozasa();
    }
    
    
    private void ajtokLetrehozasa() {
        Random rnd = new Random();


        int gyoztesajto = rnd.nextInt(3) + 1; 

        ajto1 = new doorModel(1, (gyoztesajto == 1 ? 1 : 0), "src/view/kepek/csukottajto.png");
        ajto2 = new doorModel(2, (gyoztesajto == 2 ? 1 : 0), "src/view/kepek/csukottajto.png");
        ajto3 = new doorModel(3, (gyoztesajto == 3 ? 1 : 0), "src/view/kepek/csukottajto.png");
    }

    public doorModel getDoor1() { 
        return ajto1; 
    }
    public doorModel getDoor2() { 
        return ajto2; 
    }
    public doorModel getDoor3() { 
        return ajto3; 
    }
    
}
    
