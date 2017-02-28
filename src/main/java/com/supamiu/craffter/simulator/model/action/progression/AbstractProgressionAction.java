package com.supamiu.craffter.simulator.model.action.progression;

import com.supamiu.craffter.simulator.model.action.AbstractAction;

/**
 * @author Supamiu.
 *         <p>
 *         This is the parent of every progression actions, apart from actions like Muscle Memory and Piece by Piece
 *         because they are using a custom system (33% of progression).
 */
public abstract class AbstractProgressionAction extends AbstractAction {

    /**
     * The name of the action.
     */
    private String name;

    /**
     * The base success rate of the action.
     */
    private int successRate;

    /**
     * The base potency of the action.
     */
    private int potency;

    /**
     * The base cost of the action, in CP.
     */
    private int cost;

    public AbstractProgressionAction(String name, int successRate, int potency, int cost) {
        this.name = name;
        this.successRate = successRate;
        this.potency = potency;
        this.cost = cost;
    }

    @Override
    public int getSuccessRate() {
        return this.successRate;
    }

    @Override
    public int getCost(){
        return this.cost;
    }

    @Override
    public String getName(){
        return this.name;
    }

    public int getPotency() {
        return potency;
    }

    //TODO Implement a basic progression system, this way, creating basic actions will be easy
}
