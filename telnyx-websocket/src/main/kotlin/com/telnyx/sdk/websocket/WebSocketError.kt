// Custom code for WebSocket streaming support - persists across codegen runs.

package com.telnyx.sdk.websocket

import com.telnyx.sdk.errors.TelnyxException

/**
 * Exception thrown when a WebSocket error occurs.
 */
class WebSocketError @JvmOverloads constructor(
    message: String,
    cause: Throwable? = null,
    val code: Int? = null,
    val errorData: Any? = null,
) : TelnyxException(message, cause)
