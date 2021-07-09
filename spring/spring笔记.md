## 1,Spring简介
    spring理念:使现有的技术更加容易使用,本身是一个大杂烩,整合了现有的技术框架
    
        SSH:Struct2 +Spring +Hibernate
        SSM:SpringMVC+ Spring +Mybatis
    
        官网:https://spring.io/projects/spring-framework
#### 1.1 Spring优点
Spring是一个开源的免费的框架(容器)
        Spring是一个轻量级的,非入侵的框架
        控制反转(IOC),面向切面编程(AOP)
        支持事务处理,对框架整合的处理

  总结一句话,Spring就是一个轻量级的控制反转(IOC)和面向切面编程(AOP)的框架
Spring Boot
        一个快速开发的脚手架
        基于Spring Boot可以快速的开发单个微服务
        约定大于配置

Spring Cloud
    Spring Cloud是基于SpringBoot实现的

因为现在大多数公司都在使用SpringBoot开发,学习SpringBoot的前提,需要完全掌握Spring即SpringMVC

spring弊端:
    发展太久之后,违背了原来的理念,配置十分繁琐,人称"配置地狱"

## 2.IOC理论推导
 IOC本质是一种设计思想,DI(依赖注入)是实现IOC的一种方法,也有人认为,DI只是IOC的另一种说法,没有IOC的
        程序中,我们使用面向对象编程,对象的创建与对象间的依赖关系完全编码在程序当中,对象的创建由程序自己控制
        控制反转之后,将对象的创建交给了第三方,个人认为所谓的控制反转就是:获得依赖对象的方式反转了

  采用XML配置Bean的时候,Bean的定义信息是实现分离的,而采用注解的方式可以把两者合为一体,Bean的
    定义信息直接以注解的形式定义在实现类中,从而达到了零配置的目的

控制反转是一种通过描述(XML或注解)并通过第三方去生产获取特定对象的方式,在Spring中实现控制反转
    的是IOC容器,其实现方式是依赖注入 (Dependence Injection,DI)
## HelloSpring
详见com.doer.pojo.Hello.java
```xml
<!--使用spring创建我们的对象,,在Spring这些都成为Bean
            这里的bean = 对象, 相当于new Hello();
            java的 代码层面是
            类型   变量名  = new 类型()
            Hello hello = new Hello();

            这里的id 就是变量名
            class 就是new 的对象
            property相当于给属性设置的一个值
        -->
    <bean id="hello" class="com.doer.pojo.Hello">
        <property name="str" value="Spring"/>
    </bean>
```
这是测试类
```java
public class MyTest {
        public static void main(String[] args) {
            //获取Spring的上下文对象
            ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
            //我们的对象现在都在Spring中管理了,我们要使用,直接去里面取出来即可
            Hello hello = (Hello) context.getBean("hello");
            System.out.println(hello.toString());
        }
    }
```
问题Hello 对象是有谁创建的?  ===>Hello对象是由Spring创建的,属性也是Spring容器设置的

这个过程就叫做控制反转,
控制:谁来控制对象的创建,传统应用程序的对象是由程序本身控制创建的,使用Spring后,对象是由Spring来创建的
反转:程序本身不创建对象,而变成被动的接收对象

依赖注入:就是利用set方法来进行注入的,
IOC是一种编程思想,由主动的编程编程被动的编程

所谓的IOC一句话搞定,对象由Spring来创建,管理,装配

## IOC创建对象的方式
####1.使用无参构造创建对象,默认是无参构造方法
####2.使用有参构造创建对象
①.下标赋值
   详见test.java.com.doer.MyTest02.java
   ```xml
<bean id="user" class="com.doer.ioc.User">
    <constructor-arg index="0" value="Doer"/>
</bean>
```
②通过类型创建对象
```xml
<!--    第二种方式,通过类型创建,不建议使用,因为如果有参构造方法的参数有两个就会出现问题 -->
 <!--    <bean id="user" class="com.doer.ioc.User">-->
<!--        <constructor-arg type="java.lang.String" value="Doer"/>-->
<!--    </bean>-->
```
③直接通过参数名来创建对象
```xml
<bean id="user" class="com.doer.ioc.User">
    <constructor-arg name="name" value="Doer"/>
</bean>
```
总结:在配置文件加载的时候,容器中管理的对象就已经初始化了
## Spring配置
#### 5.1,别名
```xml
<!--    通过别名也可以获取到这个对象-->
<alias name="user" alias="nihaoshijie"/>

```
#### 5.2,Bean的配置
```xml
<!--
id: bean的唯一标识符,也就是相当于我们javaSE阶段的对象名,引用
class:bean对象所对应的全限定名 :包名+类名
name :也是别名,而且name可以同时起多个别名
-->

<bean id="user2" class="com.doer.ioc.User2" name="user22,user23">
    <property name="name" value="doer"/>
</bean>
```
#### 5.3,import导入
    这个import,一半用于团队开发使用,它可以将多个配置文件,导入合并为一个
            假设现在项目中有多个人开发,这三个人负责不同的类开发,不同的类需要注册在不同的bean中,我们可以利用import
            将所有人的beans.xml合并为一个总的.
                - 张三
                - 李四
                - 王五
                - applicationContext.xml
 ```xml
<import resource="beans.xml"/>
<import resource="beans2.xml"/>

```    
使用的时候,直接使用总的配置就可以了

## 6DI依赖注入 详见spring01-dic模块
####6.1构造器注入
           就是4中的构造器方式,无参构造和有参构造
#### 6.2set方式注入[重点]
           
 依赖注入 set注入
        依赖:bean对象的创建依赖于容器
        注入:bean对象中的所有属性,由容器来注入

[环境搭建]
1.复杂类型
```java
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {
    private String name;
    private Address address;
    private String[] books;
    private List<String> hobbys;
    private Map<String,String> card;//学生卡
    private Set<String> game;
    private Properties info;
    private String wife;
}
```
2.真实测试对象
```java
@Setter
@Getter
public class Address {
    private Address address;
}
```
3,bean
```xml
<bean id="address" class="com.doer.Address">
    <property name="address" value="西安"/>
</bean>
<bean id="student" class="com.doer.Student">

    <!--第一种:普通值的注入,value的方式-->
    <property name="name" value="朵儿"/>

    <!--第二种注入,bean注入,使用ref注入-->
    <property name="address" ref="address"/>

    <!--数组注入-->
    <property name="books" >
        <array>
            <value>红楼梦</value>
            <value>西游记</value>
            <value>水浒传</value>
            <value>三国演义</value>
        </array>
    </property>


    <!--List注入-->
    <property name="hobbys">
        <list>
            <value>听歌</value>
            <value>敲代码</value>
            <value>看电影</value>
        </list>
    </property>


    <!--Map注入-->
    <property name="card">
        <map>
            <entry key="身份证" value="6101010"/>
            <entry key="银行卡" value="464546"/>
        </map>
    </property>

    <!--Set-->
    <property name="game">
        <set>
            <value>lol</value>
            <value>coc</value>
            <value>bob</value>
        </set>
    </property>

    <!--null-->
    <property name="wife">
        <null></null>
    </property>

    <!--Properties-->
    <property name="info">
        <props>
            <prop key="学号">18050412106</prop>
            <prop key="性别">男</prop>
            <prop key="username">root</prop>
            <prop key="password">123456</prop>
        </props>
    </property>
</bean>
```
#### 6.3 扩展方式注入
我们可以使用p命名空间和c命名空间注入
```xml

<!--p命名空间的注入需要依赖第三方 set方式的注入
       xmlns:p="http://www.springframework.org/schema/p"
-->
<bean id="user" class="com.doer.User" p:name="朵儿" p:age="18"/>

<!-- c命令空间的注入,构造器的方式注入-->
<bean id="user2" class="com.doer.User" c:age="18" c:name="doer"/>

```

####6.4 bean的作用域
1.单例模式,(Spring默认机制)
```xml
<bean id="user2" class="com.doer.User" c:age="18" c:name="doer" scope="singleton"/>

```
2.原型模式

    每次从容器中getBean的时候都会产生一个新的对象

            scope="singleton

3.其余的 request,session,application 这些只能在web开发中使用

##7.Bean的自动装配 详见spring02-Autowired模块
自动装配是Spring满足bean依赖的一种方式
Spring会在上下文中自动寻找,并自动给Bean装配属性

在Spring中有三种装配的方式
    1.在xml中显示的配置
    2.在java中显示配置
    3.隐式的自动装配bean[重要]
#### 7.1测试
环境搭配:一个人有两个宠物
#### 7.2ByName自动装配
```xml
<!--
    byName: 会自动在容器上下文路径中查找,和自己对象set方法后面的值对应的 bean的id
-->

<bean id="people" class="com.doer.pojo.People" autowire="byName">
    <property name="name" value="doer"/>

```
####7.3 ByType自动装配
byType: 会自动子容器上下文中查抄,和自己对象属性类型相同的bean
```xml
<bean id="people" class="com.doer.pojo.People" autowire="byType">
    <property name="name" value="doer"/>
<!--        <property name="cat" ref="cat"/>-->
<!--        <property name="dog" ref="dog"/>-->


```
小结:byName的时候,需要保证所有的bean的id唯一,并且这个bean需要和自动注入的属性的set方法的值一样
        byType的时候,需要保证所有bean的class唯一,并且这个bean需要和自动注入的属性类型一致
####  7.4 使用注解实现自动装配


基于注解的配置的引入提出了这种方法是否比 XML“更好”的问题

要使用注解须知:
1.导入约束 context约束
2.配置注解的支持
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:context="http://www.springframework.org/schema/context"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context
        https://www.springframework.org/schema/context/spring-context.xsd">

    <context:annotation-config/>

</beans>
```

#### @Autowired
@Autowired是自动化注入,首先按照类型注入,如果bean的类型只有一个则成功,如果bean的类型十多个
则会按照byName名称注入,如果找到了则成功,否则失败
直接在属性上使用即可
使用Autowired我们可以不用编写Set方法,前提是你这个自动装配的属性在IOC(Spring)容器中存在,且名字是
byName!

#### @Nullable

@Nullable 字段标记了这个注解,说明这个字段可以为null
```java
public @interface Autowired {
    boolean required() default true;
}
```
就是如果显式定义了Autowired的required属性为false,说明这个对象可以为null,否则不允许为空

如果Autowired自动装配的环境比较复杂,自动装配无法通过一个注解[@Autowired]完成的时候,我们可以使用
       @Qualifier(value="???")去配合@Autowired的使用,指定一个唯一的bean对象

####@Resource注解
```java
public class People{
    @Resource(name="cat2")
    private Cat cat;

    @Resource
    private Dog dog
}
```
小结:
@Resource 和 @Autowired
都是用来自动装配,都可以放在属性字段上
@Autowired默认是通过ByType方式实现,bean的class类型只有一个则会成功,class类型如果是多个则会通过
    byName方式进行匹配实现,如果id类型也不匹配,则装配失败,而且必须要求这个对象存在

@Resource 和@Autowired刚好相反,先用ByName在这是ByType


********************************************