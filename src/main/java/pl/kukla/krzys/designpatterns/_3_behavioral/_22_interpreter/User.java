package pl.kukla.krzys.designpatterns._3_behavioral._22_interpreter;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Krzysztof Kukla
 */
@Getter
public class User {
    //permission stored in db
    // this permissions for User have to be check with permissions from Report
    // if permission expression is 'NOT_ADMIN' then User cannot read Report Object
    //so we gonna to interpret list of permission with rules given by Report permission
    private List<String> permissions;

    private String username;

    public User(String username, String... permissions) {
        this.username = username;
        this.permissions = new ArrayList<>();
        Stream.of(permissions).forEach(p -> this.permissions.add(p.toLowerCase()));
    }

}
