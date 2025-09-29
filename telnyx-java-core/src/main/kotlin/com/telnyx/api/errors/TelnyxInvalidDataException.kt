package com.telnyx.api.errors

class TelnyxInvalidDataException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : TelnyxException(message, cause)
