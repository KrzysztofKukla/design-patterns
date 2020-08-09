package pl.kukla.krzys.designpatterns._3_behavioral._22_interpreter;

import lombok.Getter;

/**
 * @author Krzysztof Kukla
 */
@Getter
public class Report {
    private final String name;

    //'NOT ADMIN', 'FINANCE_USER AND ADMIN'
    //we will give access to this report base on 'permissions'
    //user can access to this report if permission is 'FINANCE_USER AND ADMIN'
    //so this 'permission' is going to form ( formować ) rules for interpreting users permission
    //we will use this 'permission' expression to build abstract syntax, transform this expression to tree of expression
    private final String permission;

    public Report(String name, String permission) {
        this.name = name;
        this.permission = permission;
    }

}
