package com.supamiu.craffter.simulator.engine;

import com.supamiu.craffter.simulator.model.buff.AbstractBuff;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Supamiu.
 *         <Description>
 */
public class BuffEngine {

    private Set<AbstractBuff> buffs = new HashSet<>();

    public void addBuff(AbstractBuff buff) {
        this.buffs.add(buff);
    }

    /**
     * Gets a buff in the engine based on its class.
     *
     * @param clazz The class of the buff you want.
     * @param <T> The type of the buff you want.
     * @return An instance of the buff you want, null if it's no in the buffs.
     */
    public <T extends AbstractBuff> T getBuff(Class<T> clazz){
        for(AbstractBuff buff : buffs){
            if(clazz.isInstance(buff)){
                return (T)buff;
            }
        }
        return null;
    }

    /**
     * Method used to change duration of each buff.
     */
    public void newTurn() {
        for (AbstractBuff buff : this.buffs) {
            buff.setDuration(buff.getDuration() - 1);
            if(buff.getDuration() <= 0){
                buffs.remove(buff);
            }
        }
    }
}
