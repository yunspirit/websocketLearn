package learn_websocket.controller.v1;

import learn_websocket.model.InMessage;
import learn_websocket.model.OutMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;



@Controller
public class GameInfoController {

	
	@MessageMapping("/v1/chat")
	@SendTo("/topic/game_chat")
	public OutMessage gameInfo(InMessage message){

		System.out.println("GameInfoController -->> gameInfo");
		return new OutMessage(message.getContent());
	}


}



