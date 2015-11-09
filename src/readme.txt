

/**
 * 广西联通-订购关系(应该和重庆联通是一样的)
 * http://119.254.84.182:9071/axiswebservice/services/SyncNotifySPServiceService?wsdl
 *
 * 
 * axis2 通过第三方提供的wsdl生成服务端代码  
 * 
 * 
 * 应用场景，第三方提供接口，我们作为服务端实现此接口
 * 
 * 
 * 首先通过wsdl生成java源码
 * wsdl2java -uri VacSyncService_SPClient.wsdl   -p com.bxtel.ltgx.bo  -d adb -s -ss -sd -ssi -o build\service
 * 编译源码然后生成wsdl和services.xml文件
 * cd build\service
 * ant jar.server
 * 生成的源码拷贝到src, 修改当前类(通过)ApplicationContextHolder来获取spring上下文,但是你必须要在spring上下文加上这句,这句的目的是spring加载的时候将spring上下文放到一个静态变量里面	<bean id="applicationContext"  class="org.apache.axis2.extensions.spring.receivers.ApplicationContextHolder" ></bean>
 * 将生成后的配置文件(wsdl和services.xml)SyncNotifySPServiceService目录拷贝到WEB-INFO/services目录
 */




http://171.221.35.87:9001/axiswebservice/services/SyncNotifySPServiceService?wsdl
