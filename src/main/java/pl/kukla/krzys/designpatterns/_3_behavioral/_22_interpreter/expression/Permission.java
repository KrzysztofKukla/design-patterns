package pl.kukla.krzys.designpatterns._3_behavioral._22_interpreter.expression;

import pl.kukla.krzys.designpatterns._3_behavioral._22_interpreter.User;

/**
 * @author Krzysztof Kukla
 */
//Terminal Permission expression
//that means two rules: 'NOT ADMIN', 'FINANCE_USER AND ADMIN'
//that class represent that one particular rules
public class Permission implements PermissionExpression {
    private final String permission;

    public Permission(String permission) {
        this.permission = permission.toLowerCase();
    }

    //here we need to check if 'permission' is part of permissionCollection in User
    @Override
    public boolean interpret(User user) {
        return user.getPermissions().contains(permission);
    }

    @Override
    public String toString() {
        return permission;
    }

}
