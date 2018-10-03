import javax.websocket.OnMessage;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.nio.ByteBuffer;

@ServerEndpoint("/socket")
public class WebSocketEndpoint {
    @OnMessage
    public void handleTextMessage(Session session, String message) throws IOException {
        System.out.println("New Text Message Received");
        session.getAsyncRemote().sendText(message);
    }

    @OnMessage(maxMessageSize = 1024000)
    public void handleBinaryMessage(Session session, byte[] buffer) throws IOException {
        System.out.println("New Binary Message Received");
        session.getAsyncRemote().sendBinary(ByteBuffer.wrap(buffer));
    }
}