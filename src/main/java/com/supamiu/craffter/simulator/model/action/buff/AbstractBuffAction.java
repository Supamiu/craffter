package com.supamiu.craffter.simulator.model.action.buff;

import com.supamiu.craffter.simulator.model.action.AbstractAction;

/**
 * @author Supamiu.
 *         <p>
 *         A buff is basically an action with a 100% success rate, so we can fix that in an abstract class.
 */
public abstract class AbstractBuffAction  extends AbstractAction {

    @Override
    public int getSuccessRate() {
        return 100;
    }
}
