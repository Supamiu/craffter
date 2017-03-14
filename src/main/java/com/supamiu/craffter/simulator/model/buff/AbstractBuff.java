package com.supamiu.craffter.simulator.model.buff;

/**
 * @author Supamiu.
 *         <p>
 *         The parent class of every buffs.
 */
public abstract class AbstractBuff {

    /**
     * The duration of our buff, in turns.
     */
    private int duration;

    protected AbstractBuff(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
