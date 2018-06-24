package httpServer;

/**
 * Represents the state of the request/response transaction
 */
class StateBean {
    boolean responseSent;
    StringBuilder content;

    StateBean() {
        responseSent = false;
        content = new StringBuilder();
    }
}
