package pl.kukla.krzys.designpatterns._3_behavioral._24_iterator.test;

import org.junit.jupiter.api.Test;
import pl.kukla.krzys.designpatterns._3_behavioral._24_iterator.Iterator;
import pl.kukla.krzys.designpatterns._3_behavioral._24_iterator.ThemeColor;

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
