package com.supamiu.craffter.simulator.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Supamiu.
 *         <p>
 *         The models representing a synthesis, handles the current state (good, normal, etc)
 *         and the global progression of the synthesis itself.
 */
public class Synthesis {

    /**
     * The current buffs applied to the synthesis.
     */
    private List<AbstractBuff> buffs;

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
    public int step = 0;

    /**
     * The recipe of the current synthesis.
     */
    private Recipe recipe;

    /**
     * The stats used for this synthesis.
     */
    private Stats stats;

    public Synthesis(Stats stats, Recipe recipe) {
        this.stats = stats;
        this.recipe = recipe;
        this.reset();
    }

    public void reset() {
        this.buffs = new ArrayList<>();
        this.quality = 0;
        this.progress = 0;
        this.durability = recipe.getDurability();
        this.step = 0;
    }

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

    /**
     * Adds progress to the current progression.
     *
     * @param progress The base progression value to add.
     */
    public void addProgress(int progress) {
        this.progress += progress;
    }

    /**
     * Adds quality to the current quality value.
     *
     * @param quality The base quality value to add.
     */
    public void addQuality(int quality) {
        this.quality += quality;
    }

    /*********************
     *
     *  Getters and Setters.
     *
     *********************/

    public List<AbstractBuff> getBuffs() {
        return buffs;
    }

    public Stats getStats() {
        return stats;
    }

    public Condition getCondition() {
        return condition;
    }

    public int getDurability() {
        return durability;
    }

    public int getProgress() {
        return progress;
    }

    public int getQuality() {
        return quality;
    }

    public Recipe getRecipe() {
        return recipe;
    }
}
