使用kotlinc编译.kt文件  
`kotlinc HelloKotlin.kt`

使用kotlin执行编译后的文件  
`kotlin HelloKotlinKt`

使用javap 反编译class文件  
`javap HelloKotlinKt.class`
`javap -c HelloKotlinKt.class`

使用kotlinc打jar包  
`kotlinc HelloKotlin.kt -include-runtime -d HelloKotlin.jar`

使用java运行jar包  
`java -jar HelloKotlin.jar`