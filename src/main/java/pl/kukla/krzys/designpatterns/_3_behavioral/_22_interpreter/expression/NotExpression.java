package pl.kukla.krzys.designpatterns._3_behavioral._22_interpreter.expression;

import pl.kukla.krzys.designpatterns._3_behavioral._22_interpreter.User;

/**
 * @author Krzysztof Kukla
 */
//Non-Terminal expression
public class NotExpression implements PermissionExpression {
    private final PermissionExpression expression;

    public NotExpression(PermissionExpression expression) {
        this.expression = expression;
    }

    @Override
    public boolean interpret(User user) {
        return !expression.interpret(user);
    }

    @Override
    public String toString() {
        return "NOT expression=" + expression;
    }

}
