package com.supamiu.craffter.simulator.model;

import com.supamiu.craffter.simulator.model.action.AbstractAction;

import java.util.List;

/**
 * @author Supamiu.
 *         <p>
 *         The model describing a rotation, used as a translator from a complete genom.
 */
public class Rotation {

    /**
     * The genome that created this rotation.
     */
    private Genome genome;

    /**
     * The list of actions parsed from the genome.
     */
    private List<AbstractAction> actions;

    public Rotation(Genome genome) {
        this.genome = genome;
    }

    /**
     * Simple getter for the genome, as we don't want it to be changed during the rotation.
     *
     * @return the current genome.
     */
    public Genome getGenome() {
        return this.genome;
    }

    /**
     * Simple getter for the list of actions, as we don't want it to be changed during the rotation.
     *
     * @return the current list of actions parsed from the genome.
     */
    public List<AbstractAction> getActions() {
        return actions;
    }
}
