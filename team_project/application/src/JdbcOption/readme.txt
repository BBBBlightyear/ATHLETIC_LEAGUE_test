##############################################
Utils是druid连接池，使用到的用户密码和url全在druid.properties里，连接后需要及时关闭
dao负责读写相应Table，BaseDao有基础增删查改，继承就行
domain负责建立表中对象，实现读取数据的保存
#############################################