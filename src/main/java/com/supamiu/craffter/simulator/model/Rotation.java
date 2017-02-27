package com.supamiu.craffter.simulator.model;

import java.util.List;

/**
 * @author Supamiu.
 *         <p>
 *         The model describing a rotation, used as a translator from a complete genom.
 */
public class Rotation {

    private Genome genome;

    private List<Action> actions;

    public Rotation(Genome genome) {
        this.genome = genome;
    }

    public Genome getGenome() {
        return this.genome;
    }
}
