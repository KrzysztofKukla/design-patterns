package pl.kukla.krzys.designpatterns._2_structural._13_bridge.test;

import org.junit.jupiter.api.Test;
import pl.kukla.krzys.designpatterns._2_structural._13_bridge.FifoCollection;
import pl.kukla.krzys.designpatterns._2_structural._13_bridge.MyLinkedList;
import pl.kukla.krzys.designpatterns._2_structural._13_bridge.Queue;
import pl.kukla.krzys.designpatterns._2_structural._13_bridge.SinglyMyLinkedList;
import pl.kukla.krzys.designpatterns._2_structural._13_bridge.client.Client;

/**
 * @author Krzysztof Kukla
 */
public class ClientTest {

    @Test
    void bridgeTest() throws Exception {
        MyLinkedList<Integer> myLinkedList = new SinglyMyLinkedList<>();
        FifoCollection<Integer> queue = new Queue<>(myLinkedList);
        Client<Integer> client = new Client<>(queue);
        client.manageFifoCollection(10);
    }

}
