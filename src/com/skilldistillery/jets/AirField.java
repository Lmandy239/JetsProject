package com.skilldistillery.jets;

import java.util.ArrayList;

public class AirField {
    private ArrayList<Jet> jets;

    public AirField() {
        this.jets = new ArrayList<>();
    }

    public void addJet(Jet jet) {
        jets.add(jet);
    }

    public void removeJet(int index) {
        jets.remove(index);
    }

    public ArrayList<Jet> getJets() {
        return jets;
    }
}