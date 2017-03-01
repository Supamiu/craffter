package com.supamiu.craffter.simulator.model;

/**
 * @author Supamiu.
 *         <p>
 *         The model handling stats of the crafter and its CP pool.
 */
public class Stats {

    private int craftsmanship;

    private int control;

    private int bonusControl;

    private int maxCP;

    private int currentCP;

    public Stats(int craftsmanship, int control, int maxCP) {
        this.craftsmanship = craftsmanship;
        this.control = control;
        this.maxCP = maxCP;
        this.currentCP = maxCP;
    }

    public void regenCP(int amount) {
        this.currentCP += amount;
        if (this.currentCP > this.maxCP) {
            this.currentCP = this.maxCP;
        }
    }

    public int getCraftsmanship() {
        return craftsmanship;
    }

    public int getControl() {
        return control + bonusControl;
    }

    public void setBonusControl(int value) {
        bonusControl = value;
    }

    public int getMaxCP() {
        return maxCP;
    }

    public int getCurrentCP() {
        return currentCP;
    }
}
