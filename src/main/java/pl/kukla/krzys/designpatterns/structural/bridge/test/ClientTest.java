package pl.kukla.krzys.designpatterns.structural.bridge.test;

import org.junit.jupiter.api.Test;
import pl.kukla.krzys.designpatterns.structural.bridge.FifoCollection;
import pl.kukla.krzys.designpatterns.structural.bridge.LinkedList;
import pl.kukla.krzys.designpatterns.structural.bridge.Queue;
import pl.kukla.krzys.designpatterns.structural.bridge.SinglyLinkedList;
import pl.kukla.krzys.designpatterns.structural.bridge.client.Client;

/**
 * @author Krzysztof Kukla
 */
public class ClientTest {

    @Test
    void bridgeTest() throws Exception {
        LinkedList<Integer> linkedList = new SinglyLinkedList<>();
        FifoCollection<Integer> queue = new Queue<>(linkedList);
        Client<Integer> client = new Client<>(queue);
        client.manageFifoCollection(10);
    }

}
