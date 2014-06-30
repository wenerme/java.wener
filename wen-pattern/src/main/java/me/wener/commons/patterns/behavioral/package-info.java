package me.wener.commons.patterns.behavioral;
/**
 http://stackoverflow.com/questions/15594905
 difference-between-observer-pub-sub-and-data-binding

 <p>
 Observer pattern is mostly implemented in a synchronous way,
 i.e. the observable calls the appropriate method of all its
 observers when some event occurs. The Pub/Sub pattern is mostly
 implemented in an asynchronous way (using message queue).
 </p>
 <p>
 Also, in the observer pattern, the observers are aware of the
 observable. Whereas, in Pub/Sub, neither the publishers, nor
 the consumers need to know each other. They simply communicate
 with the help of message queues.
 </p>
 <p>
 As you mentioned correctly, data binding is a generic term and
 it can be implemented using either Observer or Pub/Sub method.
 Data is the observable/publisher.
 </p>
 <p>
 简单来说, 观察者模式一般是同步的, 而 发布者/订阅者 一般是异步的,使用消息队列实现.
 在观察者模式中,一般观察者一般都知道被观察对象, 而发布者订阅者不一定.
 而数据绑定是一个泛指的词.
 </p>
 */