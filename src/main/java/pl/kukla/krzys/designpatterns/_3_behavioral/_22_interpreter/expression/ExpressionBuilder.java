package pl.kukla.krzys.designpatterns._3_behavioral._22_interpreter.expression;

import lombok.extern.slf4j.Slf4j;
import pl.kukla.krzys.designpatterns._3_behavioral._22_interpreter.Report;

import java.util.Stack;
import java.util.StringTokenizer;

/**
 * @author Krzysztof Kukla
 */
//Non-Terminal expression
@Slf4j
//Parse and builds abstract syntax tree
public class ExpressionBuilder {
    private Stack<PermissionExpression> permissions = new Stack<>();
    private Stack<String> operators = new Stack<>();

    public PermissionExpression build(Report report) {
        parse(report.getPermission());
        buildExpressions();
        if (permissions.size() > 1 || !operators.isEmpty()) {
            log.error("ERROR!");
        }
        return permissions.pop();
    }

    private void parse(String permission) {
        StringTokenizer tokenizer = new StringTokenizer(permission.toLowerCase());
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            switch (token) {
                case "and":
                    operators.push("and");
                    break;
                case "or":
                    operators.push("or");
                    break;
                case "not":
                    operators.push("not");
                    break;
                default:
                    permissions.push(new Permission(token));
            }
        }
    }

    private void buildExpressions() {
        while (!operators.isEmpty()) {
            String operator = operators.pop();
            PermissionExpression perm1;
            PermissionExpression perm2;
            PermissionExpression exp;

            switch (operator) {
                case "not":
                    perm1 = permissions.pop();
                    exp = new NotExpression(perm1);
                    break;
                case "and":
                    perm1 = permissions.pop();
                    perm2 = permissions.peek();
                    exp = new AndExpression(perm1, perm2);
                    break;
                case "or":
                    perm1 = permissions.pop();
                    perm2 = permissions.pop();
                    exp = new OrExpression(perm1, perm2);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown operator" + operator);
            }
            permissions.push(exp);
        }
    }

}
