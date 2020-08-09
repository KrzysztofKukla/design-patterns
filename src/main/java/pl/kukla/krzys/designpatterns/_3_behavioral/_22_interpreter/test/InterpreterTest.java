package pl.kukla.krzys.designpatterns._3_behavioral._22_interpreter.test;

import org.junit.jupiter.api.Test;
import pl.kukla.krzys.designpatterns._3_behavioral._22_interpreter.Report;
import pl.kukla.krzys.designpatterns._3_behavioral._22_interpreter.User;
import pl.kukla.krzys.designpatterns._3_behavioral._22_interpreter.expression.ExpressionBuilder;
import pl.kukla.krzys.designpatterns._3_behavioral._22_interpreter.expression.PermissionExpression;

/**
 * @author Krzysztof Kukla
 */
public class InterpreterTest {

    @Test
    void expressionDoeNotMatchWithUserPermission() throws Exception {
        Report report1 = new Report("Cashflow report", "NOT ADMIN");
        ExpressionBuilder builder = new ExpressionBuilder();

        //build operation is going to return single PermissionExpression that represents root of our abstract syntax tree
        PermissionExpression exp = builder.build(report1);
        System.out.println(exp);

        //for User we have two permission - "USER" permission and "ADMIN" permission
        User user1 = new User("username1", "USER", "ADMIN");

        //user is trying to get access to report
        //then interpret this user with given permission ("USER" and "ADMIN")
        //and checks if this matched with "NOT ADMIN" expression
        System.out.println("User access report " + exp.interpret(user1));
    }

    @Test
    void expressionMatchADMINPermission() throws Exception {
        Report report1 = new Report("Cashflow report", "ADMIN");
        ExpressionBuilder builder = new ExpressionBuilder();

        //build operation is going to return single PermissionExpression that represents root of our abstract syntax tree
        PermissionExpression exp = builder.build(report1);
        System.out.println(exp);

        //for User we have two permission - "USER" permission and "ADMIN" permission
        User user1 = new User("username1", "USER", "ADMIN");

        //user is trying to get access to report
        //then interpret this user with given permission ("USER" and "ADMIN")
        //and checks if this matched with "NOT ADMIN" expression
        System.out.println("User access report " + exp.interpret(user1));
    }

    @Test
    void expressionFINANCE_ADMINOrADMINPermission() throws Exception {
        Report report1 = new Report("Cashflow report", "FINANCE_ADMIN OR ADMIN");
        ExpressionBuilder builder = new ExpressionBuilder();

        //build operation is going to return single PermissionExpression that represents root of our abstract syntax tree
        PermissionExpression exp = builder.build(report1);
        System.out.println(exp);

        //for User we have two permission - "USER" permission and "ADMIN" permission
        User user1 = new User("username1", "USER", "ADMIN");

        //user is trying to get access to report
        //then interpret this user with given permission ("USER" and "ADMIN")
        //and checks if this matched with "NOT ADMIN" expression
        System.out.println("User access report " + exp.interpret(user1));
    }

    @Test
    void expressionUSERPermission() throws Exception {
        Report report1 = new Report("Cashflow report", "FINANCE_ADMIN OR ADMIN");
        ExpressionBuilder builder = new ExpressionBuilder();

        //build operation is going to return single PermissionExpression that represents root of our abstract syntax tree
        PermissionExpression exp = builder.build(report1);
        System.out.println(exp);

        //for User we have two permission - "USER" permission and "ADMIN" permission
        User user1 = new User("username1", "USER");

        //user is trying to get access to report
        //then interpret this user with given permission ("USER" and "ADMIN")
        //and checks if this matched with "NOT ADMIN" expression
        System.out.println("User access report " + exp.interpret(user1));
    }

}
