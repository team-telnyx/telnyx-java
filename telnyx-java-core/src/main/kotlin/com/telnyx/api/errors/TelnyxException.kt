package com.telnyx.api.errors

open class TelnyxException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : RuntimeException(message, cause)
