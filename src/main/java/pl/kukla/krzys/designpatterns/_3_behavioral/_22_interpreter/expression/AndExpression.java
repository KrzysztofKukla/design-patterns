package pl.kukla.krzys.designpatterns._3_behavioral._22_interpreter.expression;

import pl.kukla.krzys.designpatterns._3_behavioral._22_interpreter.User;

/**
 * @author Krzysztof Kukla
 */
//Non-Terminal expression
//it checks if 'finance_user' and 'admin_expression' is true
public class AndExpression implements PermissionExpression {

    private final PermissionExpression expression1;
    private final PermissionExpression expression2;

    public AndExpression(PermissionExpression expression1, PermissionExpression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(User user) {
        return expression1.interpret(user) && expression2.interpret(user);
    }

    @Override
    public String toString() {
        return "expression1=" + expression1 + " AND " + expression2;
    }

}
