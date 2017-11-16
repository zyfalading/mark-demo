package testdubbo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * @描述：启动Dubbo服务用的MainClass.
 * @版本: 1.0 .
 * @author zhaoyifei
 *
 */
public class DubboProvice {
	private static final Log log = LogFactory.getLog(DubboProvice.class);
	public static void main(String[] args) {
		try {
			ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("classpath:spring-context.xml");	
			context.start();
		} catch (Exception e) {
			e.printStackTrace();
			log.error("==DubboProvice context start error:",e);
		}
		log.info("容器加载完成");
	synchronized (DubboProvice.class) {
		while(true)
		{
			try {
				DubboProvice.class.wait();
			} catch (InterruptedException e) {
				log.error("== synchronized error:",e);
			}
		}
	}
	}
	
	
}
