package com.telnyx.sdk.websocket

import com.telnyx.sdk.errors.TelnyxException

/**
 * Exception thrown when a WebSocket error occurs.
 */
class WebSocketError(
    message: String,
    cause: Throwable? = null,
    /**
     * The error data that the API sent back in an error event, if available.
     */
    val errorData: Any? = null
) : TelnyxException(message, cause)
