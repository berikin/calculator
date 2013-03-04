/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package operations;

/**
 *
 * @author berik
 */
public enum OperationType {

    NONE(0), ADD(1), LESS(1), MULTIPLY(2), DIVIDE(2), BRACKETS(3), RECIPROC(0);
    private int priority;

    OperationType(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }
}
