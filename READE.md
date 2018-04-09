# springboot url和参数忽略大小写

# 配置方法
## url忽略大小写
``` 
在WebConfig中添加一个自定义的Matcher
```

## 参数忽略大小写
* 自定义Request
* 在过滤器中使用自定义的request封装