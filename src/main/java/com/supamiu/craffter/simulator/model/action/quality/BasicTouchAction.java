package com.supamiu.craffter.simulator.model.action.quality;

/**
 * @author Supamiu.
 *         <p>
 *         Increases quality. Efficiency: 100% Success Rate: 70%
 */
public class BasicTouchAction extends AbstractQualityAction {

    public BasicTouchAction() {
        super("Basic Touch", 70, 100, 0);
    }
}
