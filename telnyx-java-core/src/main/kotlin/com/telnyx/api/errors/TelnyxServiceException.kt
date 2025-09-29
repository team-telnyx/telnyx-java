// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.errors

import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.http.Headers

abstract class TelnyxServiceException
protected constructor(message: String, cause: Throwable? = null) : TelnyxException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
