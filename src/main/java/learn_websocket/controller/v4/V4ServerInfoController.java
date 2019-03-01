package learn_websocket.controller.v4;

import learn_websocket.service.WebSocketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;


/**
 * 
 * 功能描述： 实时推送服务器的JVM负载，已用内存等消息
 *
 * <p> 创建时间：Jan 5, 2018 </p> 
 * <p> 贡献者：小D学院, 官网：www.xdclass.net </p>
 *
 * @author <a href="mailto:xd@xdclass.net">小D老师</a>
 * @since 0.0.1
 */

@Controller
public class V4ServerInfoController {

	@Autowired
	private WebSocketService ws;
	
	
	@MessageMapping("/v4/schedule/push")
	@Scheduled(fixedRate = 3000)   //该方法不能加任何参数,表示此方法会定时执行
	public void sendServerInfo(){
		ws.sendServerInfo();
	}
	
	
}
