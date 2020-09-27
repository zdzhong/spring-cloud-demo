# spring-cloud-demo
这是一个使用spring cloud搭建的微服务demo，使用eureka作为注册中心，config作为配置中心，远程调用使用的是openFeign

##  eureka-server 注册中心项目

注册中心，启动项目即可。

## config-demo 配置中心项目

作为配置中心服务端，对应的配置文件在[zdzhong-config](https://github.com/zdzhong/zdzhong-config)项目中。启动项目即可。

##  zdz-ordersystem 父项目

该项目为一个空壳项目，主要是有一个启动类，然后依赖子项目，将子项目的各种资源加载到spring容器中，在启动该项目时，要先打包好子项目。然后启动即可。

## order-trade 子项目

该项目主要是服务提供者，与持久层进行数据交互，依赖父项目启动。子项目不含启动类，提供openFeign调用接口。

## service-consumer-demo 服务消费者

该服务为服务消费者，依赖子项目的api和client，通过openFeign进行远程调用。

### 该项目的配置中心也可集成到eureka中，实现配置中心的极致高可用（eureka特性）
