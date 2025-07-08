## TeamPlugin

### 简介
使用前请先创建以下Index
````
CREATE INDEX time_ ON co_block (time);
CREATE INDEX time_ ON co_container (time);
````

### 其他
如果出现报错: Lock wait timeout exceeded; try restarting transaction
解决方式: 在Co数据库执行指令
```
CREATE INDEX time_ ON co_block (time);
CREATE INDEX time_ ON co_container (time);
```