package com.supamiu.craffter.simulator.model;

/**
 * @author Supamiu.
 *         <p>
 *         Enumerates the list of synthesis states.
 */
public enum Condition {
    NORMAL(1f),
    GOOD(1.5f),
    EXCELLENT(4f),
    BAD(0.5f);


    private float multiplier;

    Condition(float multiplier) {
        this.multiplier = multiplier;
    }

    public float getMultiplier() {
        return this.multiplier;
    }
}
