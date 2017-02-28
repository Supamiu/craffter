package com.supamiu.craffter.simulator;

import com.supamiu.craffter.simulator.model.Rotation;

/**
 * @author Supamiu.
 *
 * Class used to run a craft simulation based on a rotation.
 */
public class Simulator {

    /**
     * The current rotation to simulate.
     */
    private Rotation rotation;

    public Simulator(Rotation rotation){
        this.rotation = rotation;
    }
}
