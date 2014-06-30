package me.wener.commons.patterns.concurrency.ActiveObject;
/**
 The active object design pattern decouples method execution from method invocation
 for objects that each reside in their own thread of control. The goal is to introduce
 concurrency, by using asynchronous method invocation and a scheduler for handling requests.

 <br>
 The pattern consists of six elements:

 A proxy, which provides an interface towards clients with publicly accessible methods.
 An interface which defines the method request on an active object.
 A list of pending requests from clients.
 A scheduler, which decides which request to execute next.
 The implementation of the active object method.
 A callback or variable for the client to receive the result.


 活动对象 设计模式 将方法执行从对象所属线程的方法调用中解耦出来.目的通过异步方法调用和一个处理
 请求的调度器来引入并行.

 该模式由六个元素组成
 一个代理对象,提供了客户端访问的公共方法.
 提供一个对活动对象进行访问的接口.
 一系列从客户端发起的请求
 一个用于决定接下来执行什么的调度器.
 动态对象方法的实现.
 一个用于客户端接收结果的回调方法或变量.

 */