package pl.kukla.krzys.designpatterns._1_creational._10_objectpool;

/**
 * when creating of objects are costly operations ( takes long time, performance etc.)  like connection external resources, database (BasicDatSource
 * class ), Sockets, JMS, Threads (  * ThreadPoolExecutor class ) and we need many such objects and we want to use object for the short duration only
 * then we can use Pool like ObjectPoll design pattern
 * ObjectPool allows to cache object in example ConnectionPool, ThreadPoolExecutor etc.
 * we need to provide Thread safe caching of objects in pool
 * next provides methods: to get object from Pool, and release ( zwolnić ) object again to Pool
 * im. java.util.concurrent.ThreadPoolExecutor class - we often use this class indirectly when we create ExecutorService using Executors class
 * Executors behind the scene using Pools of Threads ( ThreadPoolExecutor )
 * good candidates are objects which represent fixed quantity of external resources like threads, connection, sockets etc.
 * DON'T use Pool to save memory - unless we got Out of Memory Error
 * Don't pool long lived objects - negative impact performance is such issue
 * Pool must handle synchronisation effectively
 */
//each class which implement this interface can Pool object
public interface Poolable {
    //in all classes we want to reset their state to be able re-use object again from Pool
    //this method should be very costly
    void reset();

}
