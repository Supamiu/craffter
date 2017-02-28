package com.supamiu.craffter.simulator.model.action;

import com.supamiu.craffter.simulator.model.Synthesis;

/**
 * @author Supamiu.
 *         <p>
 *         The abstract class of all actions.
 */
public abstract class AbstractAction {

    /**
     * Gets the name of the action, not i18n one yet, the i18n part will be manager
     * front-end and this will be replaced by an id
     *
     * @return a String representing the english name of the action.
     */
    public abstract String getName();

    /**
     * Getter for the cost of the action.
     *
     * @return The cost of the action, in CP.
     */
    public abstract int getCost();

    /**
     * Getter for the base success rate of the action.
     *
     * @return an Integer between 0 and 100
     */
    public abstract int getSuccessRate();

    /**
     * This is a method that checks if the synthesis meets the requirements of the action
     * It should return true in this class, this way there's no requirements, but if you need to implement one,
     * you have this method.
     *
     * @param synthesis The current synthesis state
     * @return Are the requirements met?
     */
    public boolean meetsRequirements(Synthesis synthesis) {
        /*TODO
        */
        return true;
    }
}
