# spring实战5
## 一些未解决的错误
### 2.3
`@Valid`注解失效，未解决：只有字段`ccNumber`会报错，感觉是`javax.validation.constraints`引入的问题。   
还有一个是`@NotBlank`已经被弃用。  
### 3.1
报错  

    Description:  
    Parameter 0 of constructor in tacos.web.DesignTacoController required a bean of type 'tacos.data.IngredientRepository' that could not be found.  
    Action:  
    Consider defining a bean of type 'tacos.data.IngredientRepository' in your configuration.  
    
未解决

