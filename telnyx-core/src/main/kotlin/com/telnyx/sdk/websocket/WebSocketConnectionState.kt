package com.telnyx.sdk.websocket

/**
 * Represents the state of a WebSocket connection.
 */
enum class WebSocketConnectionState {
    /**
     * The connection is being established.
     */
    CONNECTING,

    /**
     * The connection is open and ready to send/receive data.
     */
    OPEN,

    /**
     * The connection is in the process of closing.
     */
    CLOSING,

    /**
     * The connection is closed.
     */
    CLOSED
}
