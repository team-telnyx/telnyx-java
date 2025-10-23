// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.errors

import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.http.Headers

abstract class TelnyxServiceException
protected constructor(message: String, cause: Throwable? = null) : TelnyxException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
