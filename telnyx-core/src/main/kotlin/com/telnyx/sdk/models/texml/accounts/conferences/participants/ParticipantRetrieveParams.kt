// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts.conferences.participants

import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Gets conference participant resource */
class ParticipantRetrieveParams
private constructor(
    private val accountSid: String,
    private val conferenceSid: String,
    private val callSidOrParticipantLabel: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun accountSid(): String = accountSid

    fun conferenceSid(): String = conferenceSid

    fun callSidOrParticipantLabel(): Optional<String> =
        Optional.ofNullable(callSidOrParticipantLabel)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ParticipantRetrieveParams].
         *
         * The following fields are required:
         * ```java
         * .accountSid()
         * .conferenceSid()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ParticipantRetrieveParams]. */
    class Builder internal constructor() {

        private var accountSid: String? = null
        private var conferenceSid: String? = null
        private var callSidOrParticipantLabel: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(participantRetrieveParams: ParticipantRetrieveParams) = apply {
            accountSid = participantRetrieveParams.accountSid
            conferenceSid = participantRetrieveParams.conferenceSid
            callSidOrParticipantLabel = participantRetrieveParams.callSidOrParticipantLabel
            additionalHeaders = participantRetrieveParams.additionalHeaders.toBuilder()
            additionalQueryParams = participantRetrieveParams.additionalQueryParams.toBuilder()
        }

        fun accountSid(accountSid: String) = apply { this.accountSid = accountSid }

        fun conferenceSid(conferenceSid: String) = apply { this.conferenceSid = conferenceSid }

        fun callSidOrParticipantLabel(callSidOrParticipantLabel: String?) = apply {
            this.callSidOrParticipantLabel = callSidOrParticipantLabel
        }

        /**
         * Alias for calling [Builder.callSidOrParticipantLabel] with
         * `callSidOrParticipantLabel.orElse(null)`.
         */
        fun callSidOrParticipantLabel(callSidOrParticipantLabel: Optional<String>) =
            callSidOrParticipantLabel(callSidOrParticipantLabel.getOrNull())

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
         * Returns an immutable instance of [ParticipantRetrieveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .accountSid()
         * .conferenceSid()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ParticipantRetrieveParams =
            ParticipantRetrieveParams(
                checkRequired("accountSid", accountSid),
                checkRequired("conferenceSid", conferenceSid),
                callSidOrParticipantLabel,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> accountSid
            1 -> conferenceSid
            2 -> callSidOrParticipantLabel ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ParticipantRetrieveParams &&
            accountSid == other.accountSid &&
            conferenceSid == other.conferenceSid &&
            callSidOrParticipantLabel == other.callSidOrParticipantLabel &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            accountSid,
            conferenceSid,
            callSidOrParticipantLabel,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "ParticipantRetrieveParams{accountSid=$accountSid, conferenceSid=$conferenceSid, callSidOrParticipantLabel=$callSidOrParticipantLabel, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
