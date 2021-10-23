/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizgrafos;

import java.util.ArrayList;

/**
 *
 * @author Diego Vivas
 */
public class Graph {
    
    private ArrayList<Vertex> vertices;
    private boolean isWeighted;
    private boolean isDirected;
    
    public Graph(boolean inputIsWeighted, boolean inputIsDirected){
        this.vertices = new ArrayList<Vertex>();
        this.isWeighted = inputIsWeighted;
        this.isDirected = inputIsDirected;
    }

}
