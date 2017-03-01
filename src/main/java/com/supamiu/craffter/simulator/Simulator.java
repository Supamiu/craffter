package com.supamiu.craffter.simulator;

import com.supamiu.craffter.simulator.model.Recipe;
import com.supamiu.craffter.simulator.model.Rotation;
import com.supamiu.craffter.simulator.model.Stats;
import com.supamiu.craffter.simulator.model.Synthesis;
import com.supamiu.craffter.simulator.model.action.AbstractAction;

import java.util.List;

/**
 * @author Supamiu.
 *         <p>
 *         Class used to run a craft simulation based on a rotation.
 */
public class Simulator {

    /**
     * The current rotation to simulate.
     */
    private Rotation rotation;

    /**
     * The stats used for the simulation.
     */
    private Stats stats;

    /**
     * The recipe to use fot the simulation.
     */
    private Recipe recipe;

    public Simulator(Rotation rotation, Stats stats, Recipe recipe) {
        this.rotation = rotation;
        this.stats = stats;
        this.recipe = recipe;
    }

    /**
     * Runs the simulator on the given recipe.
     *
     * @return The final state of the synthesis.
     */
    public Synthesis run() {
        Synthesis synthesis = new Synthesis(stats, recipe);
        List<AbstractAction> actions = rotation.getActions();
        for (AbstractAction action : actions) {
            synthesis = action.use(stats, synthesis);
            synthesis.step++;
        }
        return synthesis;
    }
}
