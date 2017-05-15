package com.example.aleix.calculadorasenzilla;


import java.io.Serializable;
import java.util.List;

/**
 * Created by aleix on 13/05/2017.
 */

public class Operations implements Serializable {
    private List<Operation> opsList;

    public Operations(){

    }

    public List<Operation> getOpsList() {
        return opsList;
    }

    public void setOpsList(List<Operation> opsList) {
        this.opsList = opsList;
    }
}