package com.supamiu.craffter.simulator.model;

/**
 * @author Supamiu.
 *         <p>
 *         The models representing a synthesis, handles the current state (good, normal, etc)
 *         and the global progression of the synthesis itself.
 */
public class Synthesis {

    /**
     * The current state of the synthesis
     * Every synthesis starts at a normal state so we can set it here.
     */
    private Condition condition = Condition.NORMAL;

    /**
     * The current durability of the synthesis.
     */
    private int durability;

    /**
     * The current progress of the synthesis.
     */
    private int progress;

    /**
     * The current quality of the synthesis.
     */
    private int quality;

    /**
     * The current step of the synthesis.
     */
    private int step = 1;

    /**
     * The recipe of the current synthesis.
     */
    private Recipe recipe;

    /**
     * Checks if the synthesis can go further
     * (if it is not broken and the current progression is below the max progression).
     *
     * @return a boolean that represents the validity of the synthesis.
     */
    public boolean isValid() {
        return this.durability > 0 || this.progress <= this.recipe.getProgress();
    }

    /**
     * Gets the Hq percent chances based on the current quality.
     *
     * @return an integer between 0 and 100.
     */
    public int getHQPercent() {
        if (quality == 0) {
            return 1;
        } else if (quality >= 100) {
            return 100;
        }
        float x = quality / recipe.getQuality();
        return (int) Math.round(Math.pow(-0.0000056604 * x, 4) + Math.pow(0.0015369705 * x, 3)
                - Math.pow(0.1426469573 * x, 2) + 5.6122722959 * x - 5.5950384565);
    }

}
