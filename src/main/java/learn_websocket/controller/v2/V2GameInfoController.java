package learn_websocket.controller.v2;


import learn_websocket.model.InMessage;
import learn_websocket.service.WebSocketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;

@Controller
public class V2GameInfoController {


    @Autowired
    private WebSocketService ws;

    @MessageMapping("/v2/chat")
    public void gameInfo(InMessage message) throws InterruptedException{

        ws.sendTopicMessage("/topic/game_rank",message);
    }



}
