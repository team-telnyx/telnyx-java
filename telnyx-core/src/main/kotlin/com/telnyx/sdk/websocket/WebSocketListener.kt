package com.telnyx.sdk.websocket

/**
 * Listener interface for WebSocket events.
 *
 * @param T The type of server events this listener handles.
 */
interface WebSocketListener<T> {
    /**
     * Called when the WebSocket connection is opened.
     */
    fun onOpen() {}

    /**
     * Called when a message is received from the server.
     *
     * @param event The parsed server event.
     */
    fun onEvent(event: T)

    /**
     * Called when an error occurs.
     *
     * @param error The error that occurred.
     */
    fun onError(error: WebSocketError) {}

    /**
     * Called when the WebSocket connection is closed.
     *
     * @param code The close code.
     * @param reason The close reason.
     */
    fun onClose(code: Int, reason: String) {}
}
