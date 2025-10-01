package com.telnyx.sdk.errors

open class TelnyxException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : RuntimeException(message, cause)
