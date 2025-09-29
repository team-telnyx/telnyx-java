// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.phonenumbers.voicemail

import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.Params
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.http.Headers
import com.telnyx.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Update voicemail settings for a phone number */
class VoicemailUpdateParams
private constructor(
    private val phoneNumberId: String?,
    private val voicemailRequest: VoicemailRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun phoneNumberId(): Optional<String> = Optional.ofNullable(phoneNumberId)

    fun voicemailRequest(): VoicemailRequest = voicemailRequest

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        voicemailRequest._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [VoicemailUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .voicemailRequest()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VoicemailUpdateParams]. */
    class Builder internal constructor() {

        private var phoneNumberId: String? = null
        private var voicemailRequest: VoicemailRequest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(voicemailUpdateParams: VoicemailUpdateParams) = apply {
            phoneNumberId = voicemailUpdateParams.phoneNumberId
            voicemailRequest = voicemailUpdateParams.voicemailRequest
            additionalHeaders = voicemailUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = voicemailUpdateParams.additionalQueryParams.toBuilder()
        }

        fun phoneNumberId(phoneNumberId: String?) = apply { this.phoneNumberId = phoneNumberId }

        /** Alias for calling [Builder.phoneNumberId] with `phoneNumberId.orElse(null)`. */
        fun phoneNumberId(phoneNumberId: Optional<String>) =
            phoneNumberId(phoneNumberId.getOrNull())

        fun voicemailRequest(voicemailRequest: VoicemailRequest) = apply {
            this.voicemailRequest = voicemailRequest
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [VoicemailUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .voicemailRequest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): VoicemailUpdateParams =
            VoicemailUpdateParams(
                phoneNumberId,
                checkRequired("voicemailRequest", voicemailRequest),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): VoicemailRequest = voicemailRequest

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> phoneNumberId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VoicemailUpdateParams &&
            phoneNumberId == other.phoneNumberId &&
            voicemailRequest == other.voicemailRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(phoneNumberId, voicemailRequest, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "VoicemailUpdateParams{phoneNumberId=$phoneNumberId, voicemailRequest=$voicemailRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
