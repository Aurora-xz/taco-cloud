# spring实战5  
# 强烈建议学习前先下载配套的源码 且该书不适合Spring初学者！！！
## 只 ~学到~ 看到Spring Security     网页版[《Spring实战》第五版](https://potoyang.gitbook.io/spring-in-action-v5/)
## 环境
- IDEA 2022.3.1 
- JDK17  
- spring-boot 3.1.0
- Maven
## 代码  
代码未按章节区分，如需获取各章节源码，请移步[异步社区](https://www.epubit.com/bookDetails?id=UB6cb48474abc65&typeName=%E6%90%9C%E7%B4%A2)免费下载。  
用过的代码后期弃用的我都放在了`abandonedClass`包中
## 一些问题
### 2.3
`@Valid`注解失效，未解决：只有字段`ccNumber`会报错，感觉是`javax.validation.constraints`引入的问题。   
还有一个是`@NotBlank`已经被弃用。  
### 3.1  
使用的数据库是***MYSql***  
其中的一些错误（如：类型转化，`String`与`Ingredient`）[解决来源](https://blog.csdn.net/TickTick123/article/details/119176871#%E5%85%B6%E4%BB%96)  
### 4.2
`WebSecurityConfigurerAdapter`被弃用  所以...这一章节的部分的内容均来自《Spring实战》（第六版）[第五章节](https://silvershaded.github.io/Spring-Save/Chapter-05/5.2-Configuring-authentication/Introduction.html)  
`mvcMatchers`一直爆红`Cannot resolve method 'mvcMatchers' in 'ExpressionInterceptUrlRegistry'`  
学不动了 拓展的东西太多
## 后面的章节不再更新 有点身心俱疲的感觉 不适合我这种小白初学


