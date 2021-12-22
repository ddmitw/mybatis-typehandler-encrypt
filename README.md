# Mybatis使用typeHandlers对数据库字段加密/解密

接口测试：

## 1.新增

```
GET: localhost:8080/addCustomer?phone=209182&address=北京市
```

## 2.查询

```
GET: http://localhost:8080/findCustomer?phone=209182
```

返回示例：

```
{"id":1,"phone":{"value":"209182"},"address":"北京市"}
```

参考： [typeHandlers](https://mybatis.org/mybatis-3/configuration.html#typeHandlers);