package x.y.javalin.websocket;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import io.javalin.websocket.WsContext;

public class Collab {
    public String doc;
    public Set<WsContext> clients;

    public Collab() {
        this.doc = "";
        this.clients = ConcurrentHashMap.newKeySet();
    }
}
