##常用依赖
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
##注解说明
- @Autowired 自动装配,通过类型,名字
@Autowired是自动化注入,首先按照类型注入,如果bean的类型只有一个则成功,如果bean的类型十多个
                则会按照byName名称注入,如果找到了则成功,否则失败
- @Nullable字段标记了这个注解,说明这个字段可以为null
- @Resource注解 自动装配通过名字,类型
- @Component:组件,放在类上,说明这个类被Spring管理了,就是bean