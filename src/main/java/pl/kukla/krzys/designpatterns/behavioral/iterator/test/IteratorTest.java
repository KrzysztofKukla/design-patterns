package pl.kukla.krzys.designpatterns.behavioral.iterator.test;

import org.junit.jupiter.api.Test;
import pl.kukla.krzys.designpatterns.behavioral.iterator.Iterator;
import pl.kukla.krzys.designpatterns.behavioral.iterator.ThemeColor;

/**
 * @author Krzysztof Kukla
 */
public class IteratorTest {

    @Test
    void iteratorTest() throws Exception {
        Iterator<ThemeColor> themeColorIterator = ThemeColor.getIterator();
        while (themeColorIterator.hasNext()) {
            System.out.println(themeColorIterator.next());
        }
    }

}
