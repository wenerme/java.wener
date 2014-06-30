package me.wener.commons.patterns.creational.AbstractFactory;
/**

 <p>
 Provide an interface for creating families of related or dependent objects
 without specifying their concrete classes.
 </p>

 <ul>
 <li><a href="http://zh.wikipedia.org/wiki/抽象工厂模式">中文维基</a></li>
 <li><a href="http://en.wikipedia.org/wiki/Abstract_factory_pattern">英文维基</a></li>
 </ul>

 <p>
 定义:
 抽象工厂模式的实质是“提供接口，创建一系列相关或独立的对象，而不指定这些对象的具体类。”
 </p>
 <p>
 适用性:<br>
 一个系统要独立于它的产品的创建、组合和表示时。<br>
 一个系统要由多个产品系列中的一个来配置时。<br>
 需要强调一系列相关的产品对象的设计以便进行联合使用时。<br>
 提供一个产品类库，而只想显示它们的接口而不是实现时。<br>
 </p>
 <p>
 优点:<br>
 具体产品从客户代码中被分离出来<br>
 容易改变产品的系列<br>
 将一个系列的产品族统一到一起创建<br>
 </p>
 <p>
 缺点:
 在产品族中扩展新的产品是很困难的，它需要修改抽象工厂的接口
 </p>
 */