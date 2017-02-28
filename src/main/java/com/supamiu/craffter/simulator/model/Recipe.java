package com.supamiu.craffter.simulator.model;

/**
 * @author Supamiu.
 *         <p>
 *         Represents a recipe, we don't care of the name of the recipe, only the stats of it.
 */
public class Recipe {

    /**
     * The maximum durability that this recipe can have.
     */
    private int durability;

    /**
     * The required progeess value to complete the recipe.
     */
    private int progress;

    /**
     * The maximum quality value.
     */
    private int quality;

    public Recipe(int durability, int progress, int quality) {
        this.durability = durability;
        this.progress = progress;
        this.quality = quality;
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
}
