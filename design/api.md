## 1.1后台管理端-商品列表页(商品id降序)

URL: /interviewProduct/search?product_name={product_name}&product_code={product_code}
Method：GET 

ResponseBody:  

```json
[
    {
        "product_id":1234,
        "main_pic_url ": "dbnsjadnlajdnjasndl.png",
        "product_name ": "Apple Cinema 30''",
        "product_code": "Product 15",
        "price": "$90.00",
        "stock_quantity": 988,
        "status": 0
    },
    {
        "product_id":1234,
        "main_pic_url ": "dbnsjadnlajdnjasndl.png",
        "product_name ": "Apple Cinema 30''",
        "product_code": "Product 15",
        "price": "$90.00",
        "stock_quantity": 988,
        "status": 0
    }
]

```

Request Field  

|  字段   |  类型   |           描述           |
| :-----: | :-----: | :----------------------: |
|product_name |非空，唯一索引  |商品名称  |
|product_code |索引  |商品代号  |

Response Field  

|    字段     |  类型   |          描述          |
| :---------: | :-----: | :--------------------: |
|product_id  |bigint  |主键 自增  |ID  |
|main_pic_url  |varchar(100) |  |主图  |
|product_name  |varchar(20)  |非空，唯一索引  |商品名称  |
|product_code  |varchar(100)  |索引  |商品代号  |
|price  |int  |非空  |价格  |
|product_abstract  |varchar(100)  |非空  |摘要  |
|status  |tinyint  |非空，默认启用 |状态(0为禁用，1为启用)  |


## 1.2 后台管理端-商品添加

URL: /addProduct/add
Method：POST  
Request Content-Type: multipart/formdata  
RequestParam: interviewId
RequestParam: addProduct  

ResponseBody:  

```json
[
    "http://xxx.com/xxx1.jpg",
    "http://xxx.com/xxx2.jpg"
]

```

Request Field  

|    字段     |  类型   |    描述     |
| :---------: | :-----: | :---------: |
|product_name  |varchar(20)  |非空，唯一索引  |商品名称  |
|product_abstract  |varchar(100)  |非空  |摘要  |


## 1.3 后台管理端-商品编辑

URL: /editProduct/edit
Method：POST  
Request Content-Type: multipart/formdata  
RequestParam: interviewId
RequestParam: editProduct  

ResponseBody:  

```json
[
    "http://xxx.com/xxx1.jpg",
    "http://xxx.com/xxx2.jpg"
]

```

Request Field  

|    字段     |  类型   |    描述     |
| :---------: | :-----: | :---------: |
|product_name  |varchar(20)  |非空，唯一索引  |商品名称  |
|product_abstract  |varchar(100)  |非空  |摘要  |




## 2.1后台管理端-客户列表页(客户id降序)

URL: /interviewCosumer/search?username={username}&real_name={real_name}
Method：GET 

ResponseBody:  

```json
[
    {
        "customer_id  ":1234,
        "username   ": "Alex Chan",
        "email  ": "cjf@bw.com",
        "default_address_id  ": 192.168.32.1,
        "status": 0
    },
   {
        "customer_id  ":1234,
        "username   ": "Alex Chan",
        "email  ": "cjf@bw.com",
        "default_address_id  ": 192.168.32.1,
        "status": 0
    }
]

```

Request Field  

|  字段   |  类型   |           描述           |
| :-----: | :-----: | :----------------------: |
|username  |varchar(20) |非空，唯一索引   |客户名 |
|real_name  |varchar(20) |索引 |姓名 |

Response Field  

|    字段     |  类型   |          描述          |
| :---------: | :-----: | :--------------------: |
|customer_id  |bigint  |主键，自增  |ID  |
|username  |varchar(20) |非空，唯一索引   |客户名 |
|email  |varchar(30)  |非空  |邮箱  |
|real_name  |varchar(20) |索引 |姓名 |
|default_address_id  |int  |非空  |默认地址id  |
|status  |tinyint  |非空，默认启用 |状态(0为禁用，1为启用)  |


## 2.2 前台商店端-用户注册

URL: /CosumerRigister/customer_id  
Method：GET 

ResponseBody:  

```json
[
    {
        "customer_id  ":1234,
        "username   ": "Alex Chan",
        "email": "cjf@bw.com",
        "mobile ": 192168321222,
        "password": 1315156,
    },
   {
        "customer_id  ":1234,
        "username   ": "Alex Chan",
        "email  ": "cjf@bw.com",
        "default_address_id  ": 192.168.32.1,
         "password": 1315156
    }
]

```

Response Field  

|    字段     |  类型   |          描述          |
| :---------: | :-----: | :--------------------: |
|customer_id  |bigint  |主键，自增  |ID  |
|username  |varchar(20) |非空，唯一索引   |客户名 |
|email  |varchar(30)  |非空  |邮箱  |
|real_name  |varchar(20) |索引 |姓名 |
|default_address_id  |int  |非空  |默认地址id  |
|status  |tinyint  |非空，默认启用 |状态(0为禁用，1为启用)  |


## 2.1后台管理端-客户列表页(客户id降序)

URL: /interviewCosumer/search?username={username}&real_name={real_name}
Method：GET 

ResponseBody:  

```json
[
    {
        "customer_id  ":1234,
        "username   ": "Alex Chan",
        "email  ": "cjf@bw.com",
        "default_address_id  ": 192.168.32.1,
        "status": 0
    },
   {
        "customer_id  ":1234,
        "username   ": "Alex Chan",
        "email  ": "cjf@bw.com",
        "default_address_id  ": 192.168.32.1,
        "status": 0
    }
]

```

Request Field  

|  字段   |  类型   |           描述           |
| :-----: | :-----: | :----------------------: |
|username  |varchar(20) |非空，唯一索引   |客户名 |
|real_name  |varchar(20) |索引 |姓名 |

Response Field  

|    字段     |  类型   |          描述          |
| :---------: | :-----: | :--------------------: |
|customer_id  |bigint  |主键，自增  |ID  |
|username  |varchar(20) |非空，唯一索引   |客户名 |
|email  |varchar(30)  |非空  |邮箱  |
|real_name  |varchar(20) |索引 |姓名 |
|default_address_id  |int  |非空  |默认地址id  |
|status  |tinyint  |非空，默认启用 |状态(0为禁用，1为启用)  |


## 2.3  前台商店端-地址添加页

URL: /CosumerAddAddress/customer_id  
Method：GET 

ResponseBody:  

```json
[
    {
        "address_id  ":1234,
        "username   ": "Alex Chan",
        "email": "cjf@bw.com",
        "mobile ": 192168321222
    },
   {
        "address_id  ":1234,
        "username   ": "Alex Chan",
        "email  ": "cjf@bw.com",
        "mobile ": 192168321222
    }
]

```

Response Field  

|    字段     |  类型   |          描述          |
| :---------: | :-----: | :--------------------: |
|customer_id  |bigint  |主键，自增  |ID  |
|username  |varchar(20) |非空，唯一索引   |客户名 |
|real_name  |varchar(20) |索引 |姓名 |
|default_address_id  |int  |非空  |默认地址id  |
|address_id  |bigint  |主键，自增  |地址ID  |

## 3.1  后台管理端-订单列表页
URL: /interviewOrders/search?cusomer_id={cusomer_id}
Method：GET 

ResponseBody:  

```json
[
    {
        "order_id  ":1234,
        "total_price   ": "$306.00",
        "create_time  ": "31/01/2020",
        "update_time  ": "31/01/2020",
        "status": 0
    },
   {
        "order_id  ":1234,
        "total_price   ": "$306.00",
        "create_time  ": "31/01/2020",
        "update_time  ": "31/01/2020",
        "status": 0
    }
]

```

Request Field  

|  字段   |  类型   |           描述           |
| :-----: | :-----: | :----------------------: |
|cusomer_id  |int  |非空，索引，外键  |客户ID  |

Response Field  

|    字段     |  类型   |          描述          |
| :---------: | :-----: | :--------------------: |
|order_id  |bigint  |主键，自增  |ID  |
|cusomer_id  |int  |非空，索引，外键  |客户ID  |
|status  |tinyint  |非空,默认开启  |状态(0为禁用，1为启用)  |
|total_price  |double  |非空  |总金额  |
|create_time  |varchar(100)  |非空  |创建时间  |
|update_time  |varchar(100)  |非空  |修改时间  |

## 3.2 后台管理端-订单详情（概要）
URL: /interviewOrders/search?cusomer_id={cusomer_id}
Method：GET 

ResponseBody:  

```json
[
     {
        "order_id  ":1234,
        "total_price   ": "$306.00",
        "create_time  ": "31/01/2020",
        "update_time  ": "31/01/2020",
        "status": 0,
         "ship_addres": "上海市奉贤区",
         "invoice_address": "上海市奉贤区",
         "ship_pricre": "￥5.00",
    },
   {
        "order_id  ":1234,
        "total_price   ": "$306.00",
        "create_time  ": "31/01/2020",
        "update_time  ": "31/01/2020",
        "status": 0,
         "ship_addres": "上海市奉贤区",
         "invoice_address": "上海市奉贤区",
         "ship_pricre": "￥5.00",
    }
]

```

Request Field  

|  字段   |  类型   |           描述           |
| :-----: | :-----: | :----------------------: |
|cusomer_id  |int  |非空，索引，外键  |客户ID  |

Response Field  

|    字段     |  类型   |          描述          |
| :---------: | :-----: | :--------------------: |
|order_id  |bigint  |主键，自增  |ID  |
|cusomer_id  |int  |非空，索引，外键  |客户ID  |
|total_price  |double  |非空  |总金额  |
|create_time  |varchar(100)  |非空  |创建时间  |
|update_time  |varchar(100)  |非空  |修改时间  |
|ship_addres  |varchar(100)|非空  |寄送地址  |
|invoice_address  |varchar(100)|非空  |发送地址  |
|ship_pricre  |double  |非空  |邮费  |



## 3.3 后台管理端-订单详情（历史部分）
URL: /interviewOrders/search?cusomer_id={cusomer_id}
Method：GET 

ResponseBody:  

```json
[
     {
        "order_id  ":1234,
        "total_price   ": "$306.00",
        "create_time  ": "31/01/2020",
        "update_time  ": "31/01/2020",
        "status": 0,
         "customer_notified": "NO"
    },
   {
        "order_id  ":1234,
        "total_price   ": "$306.00",
        "create_time  ": "31/01/2020",
        "update_time  ": "31/01/2020",
        "status": 0,
         "customer_notified": "NO"
    }
]

```

Request Field  

|  字段   |  类型   |           描述           |
| :-----: | :-----: | :----------------------: |
|cusomer_id  |int  |非空，索引，外键  |客户ID   |

Response Field  

|    字段     |  类型   |          描述          |
| :---------: | :-----: | :--------------------: |
|order_history_id  |bigint  |主键，自增  |ID  |
|create_time  |varchar(100)  |非空  |创建时间  |
|comment  |varchar(100)  |  |备注  |
|order_status  |tingint  |非空，默认开启  |状态(0为禁用，1为启用)  |
|customer_notified  |varchar(100)  |  |通知用户  |



## 4.1 后台管理端-退货申请列表页
URL: /interviewReturnList/search?order_id={order_id}&customer_name={customer_name}&product_code={product_code}&opened={opened}&product_name ={product_name }
Method：GET 

ResponseBody:  

```json
[
     {
        "return_id  ":1234,
        "order_id  ":1234,
        "customer_name" :"Si Li",
        "product_name   ": "iphone",
        "product_code":"product 11",
        "create_time  ": "31/01/2020",
        "update_time  ": "31/01/2020",
        "status": 0
    },
  {
        "return_id  ":1234,
        "order_id  ":1234,
        "customer_name" :"Si Li",
        "product_name   ": "iphone",
        "product_code":"product 11",
        "create_time  ": "31/01/2020",
        "update_time  ": "31/01/2020",
        "status": 0
    }
]

```

Request Field  

|  字段   |  类型   |           描述           |
| :-----: | :-----: | :----------------------: |
|order_id  |int  |非空，索引，外键  |订单ID  |
|customer_name  |varchar(100)  |非空，索引  |客户姓名  |
|product_code  |varchar(100)  |索引  |商品代号  |
|product_name  |varchar(20)  |非空，唯一索引  |商品名称  |
|opened  |varchar(20)  |索引  |开封  |

Response Field  

|    字段     |  类型   |          描述          |
| :---------: | :-----: | :--------------------: |
|return_id  |bigint  |主键，自增  |ID  |
|order_id  |int  |非空，索引，外键  |订单ID  |
|order_time  |varchar(100)  |非空  |订单创建时间  |
|customer_name  |varchar(100)  |非空，索引  |客户姓名  |
|product_code  |varchar(100)  |索引  |商品代号  |
|product_name  |varchar(20)  |非空，唯一索引  |商品名称  |


## 4.2  后台管理端-退货历史页
URL: /interviewReturnHistory/search?return_history_id={return_history_id}&return_id  ={return_id}
Method：GET 

ResponseBody:  

```json
[
     {
        "return_history_id  ":1234,
        "create_time  ": "31/01/2020",
        "comment  ": "待检验",
        "status": 0,
        "return_notified": "NO"
    },
   {
        "return_history_id  ":1234,
        "create_time  ": "31/01/2020",
        "comment  ": "待检验",
        "status": 0,
        "return_notified": "NO"
    }
]

```

Request Field  

|  字段   |  类型   |           描述           |
| :-----: | :-----: | :----------------------: |
|return_id  |bigint  |主键，自增  |ID  |
|return_history_id  |bigint  |主键，自增  |ID  |

Response Field  

|    字段     |  类型   |          描述          |
| :---------: | :-----: | :--------------------: |
|return_id  |bigint  |主键，自增  |ID  |
|order_time  |varchar(100)  |非空  |订单创建时间  |
|return_history_id  |bigint  |主键，自增  |ID  |
|return_ststus  |tinyint  |非空，默认启用 |状态(0为禁用，1为启用)  |
|comment  |varchar(100)  |  |备注  |
|customer_notified  |varchar(100)  |  |通知客户  |



## 5.1 后台管理端-管理员列表页
URL: /interviewAdmin/search?username={username}&real_name={real_name}&email={email}
Method：GET 

ResponseBody:  

```json
[
     {
        "adminstrator_id  ":1234,
        "username  ": "admin",
        "status": 0,
        "create_time  ": "31/01/2020"
    },
   {
        "adminstrator_id  ":1234,
        "username  ": "admin",
        "status": 0,
        "create_time  ": "31/01/2020"
    }
]

```

Request Field  

|  字段   |  类型   |           描述           |
| :-----: | :-----: | :----------------------: |
|username  |varchar(20)  |非空，唯一索引   |用户名  |
|real_name  |varchar(20)  |索引  |真实姓名  |
|email  |varchar(100)  |索引  |邮箱 |

Response Field  

|    字段     |  类型   |          描述          |
| :---------: | :-----: | :--------------------: |
|adminstrator_id  |bigint  |主键 自增  | ID  |
|username  |varchar(20)  |非空，唯一索引   |用户名  |
|real_name  |varchar(20)  |索引  |真实姓名  |
|status  |tinyint  |非空，默认启用   |状态（0禁用，1启用） |
|email  |varchar(100)  |索引  |邮箱 |
|create_time  |datetime  |非空  |创建时间  |