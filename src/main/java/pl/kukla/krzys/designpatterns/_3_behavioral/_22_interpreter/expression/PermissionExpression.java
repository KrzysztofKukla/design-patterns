package pl.kukla.krzys.designpatterns._3_behavioral._22_interpreter.expression;

import pl.kukla.krzys.designpatterns._3_behavioral._22_interpreter.User;

/**
 * Interpreter represents language rules or grammar as object structure
 * Interpreter allows to interpret the rules of language or grammar in data structure and then interpret statement/ meaning in that language
 * for example File access requires USER and ADMIN rules to be able to read/write file ( access to file )
 * each Rule in that language becomes ( staje się ) class as expression ( grammar for our rule )
 * Terminal expression provides implementation of interpret method - it carry out the interpretation and return its result ( does NOT have any
 * child expression )
 * Non-Terminal expression contains other expressions and delegate interpret to its children ( Terminal expression ) - think about that as Composite
 * and optionally can do some interpretation of its own
 * then Context which has global information
 * this pattern does not provide any solution to parse string that we get, so have to be done separated
 * we have AbstractExpression and the subclasses: Terminal-expression and Non-terminal expression
 * examples: java.util.regex.Pattern using to perform regular expressing matching in Java
 * Pattern pattern = Pattern.compile("ADMIN", Pattern.CASE_INSENSITIVE);
 * Matcher matcher = pattern.matcher("admin, USER");
 * while (matcher.find()) {
 * System.out.println("Has required permission " + matcher.group());
 * }
 */
//abstract expression
public interface PermissionExpression {
    boolean interpret(User user);

}
