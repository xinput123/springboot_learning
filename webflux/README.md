## 一、webflux-demo 模块
- webflux-hello 最简单的示例，helloworld
- webflux-curd  简单的增删改查
- webflux-mongo WebFlux整合MongoDB
- webflux-thymeleaf 整合 Thymeleaf
- webflux-redis WebFlux整合Redis
- webflux-WebSocket WebFlux整合WebSocket




## 二、webFlux
#### 1、优点
- 非阻塞
- 异步

#### 2、Mono 是响应流 Publisher 具有基础 rx 操作符，可以成功发布元素或者错误
常用方法如下：
- Mono.create()：使用 MonoSink 来创建 Mono。
- Mono.justOrEmpty()：从一个 Optional 对象或 null 对象中创建 Mono。
- Mono.error()：创建一个只包含错误消息的 Mono。
- Mono.never()：创建一个不包含任何消息通知的 Mono。
- Mono.delay()：在指定的延迟时间之后，创建一个 Mono，产生数字 0 作为唯一值。


#### 3、Flux 响应流 Publisher 具有基础 rx 操作符，可以成功发布 0 到 N 个元素或者错误。Flux 其实是 Mono 的一个补充
Flux 最值得一提的是 fromIterable 方法，fromIterable(Iterable it) 可以发布 Iterable 类型的元素。当然，Flux 也包含了基础的操作：
- map
- merge 
- concat 
- flatMap
- take

#### 4、Spring Data Reactive Repositories 目前支持 Mongo、Cassandra、Redis、Couchbase。不支持 MySQL，那究竟为啥呢？
Spring Data Reactive Repositories 突出点是 Reactive，即非阻塞的。区别如下：
- 基于 JDBC 实现的 Spring Data，比如 Spring Data JPA 是阻塞的。原理是基于阻塞 IO 模型 消耗每个调用数据库的线程（Connection）。
- 事务只能在一个 java.sql.Connection 使用，即一个事务一个操作。

#### 5、模板语言：数据（Data）、模板(Template)、模板引擎（Template）和结果文档(Result  Documents)
- 数据： 是信息的表现形式和载体，可以是符号、文字、数字、语音、图像、视频等。数据和信息是不可分离的，数据是信息的表达，信息是数据的内涵。数据本身没有意义，数据只有对实体行为产生影响时才成为信息。

- 模板：是一个蓝图，即一个与类型无关的类。编译器在使用模板时，会根据模板实参对模板进行实例化，得到一个与类型相关的类。

- 模板引擎：是为了使用户界面与业务数据（内容）分离而产生的，它可以生成特定格式的文档，用于网站的模板引擎就会生成一个标准的 HTML 文档。

- 结果文档：一种特定格式的文档，比如用于网站的模板引擎就会生成一个标准的 HTML 文档。

