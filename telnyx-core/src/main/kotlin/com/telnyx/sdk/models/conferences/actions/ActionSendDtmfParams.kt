// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.conferences.actions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Send DTMF tones to one or more conference participants. */
class ActionSendDtmfParams
private constructor(
    private val id: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /**
     * DTMF digits to send. Valid characters: 0-9, A-D, *, #, w (0.5s pause), W (1s pause).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun digits(): String = body.digits()

    /**
     * Array of participant call control IDs to send DTMF to. When empty, DTMF will be sent to all
     * participants.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun callControlIds(): Optional<List<String>> = body.callControlIds()

    /**
     * Use this field to add state to every subsequent webhook. Must be a valid Base-64 encoded
     * string.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun clientState(): Optional<String> = body.clientState()

    /**
     * Duration of each DTMF digit in milliseconds.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun durationMillis(): Optional<Long> = body.durationMillis()

    /**
     * Returns the raw JSON value of [digits].
     *
     * Unlike [digits], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _digits(): JsonField<String> = body._digits()

    /**
     * Returns the raw JSON value of [callControlIds].
     *
     * Unlike [callControlIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _callControlIds(): JsonField<List<String>> = body._callControlIds()

    /**
     * Returns the raw JSON value of [clientState].
     *
     * Unlike [clientState], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _clientState(): JsonField<String> = body._clientState()

    /**
     * Returns the raw JSON value of [durationMillis].
     *
     * Unlike [durationMillis], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _durationMillis(): JsonField<Long> = body._durationMillis()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ActionSendDtmfParams].
         *
         * The following fields are required:
         * ```java
         * .digits()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ActionSendDtmfParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(actionSendDtmfParams: ActionSendDtmfParams) = apply {
            id = actionSendDtmfParams.id
            body = actionSendDtmfParams.body.toBuilder()
            additionalHeaders = actionSendDtmfParams.additionalHeaders.toBuilder()
            additionalQueryParams = actionSendDtmfParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [digits]
         * - [callControlIds]
         * - [clientState]
         * - [durationMillis]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** DTMF digits to send. Valid characters: 0-9, A-D, *, #, w (0.5s pause), W (1s pause). */
        fun digits(digits: String) = apply { body.digits(digits) }

        /**
         * Sets [Builder.digits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.digits] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun digits(digits: JsonField<String>) = apply { body.digits(digits) }

        /**
         * Array of participant call control IDs to send DTMF to. When empty, DTMF will be sent to
         * all participants.
         */
        fun callControlIds(callControlIds: List<String>) = apply {
            body.callControlIds(callControlIds)
        }

        /**
         * Sets [Builder.callControlIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callControlIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun callControlIds(callControlIds: JsonField<List<String>>) = apply {
            body.callControlIds(callControlIds)
        }

        /**
         * Adds a single [String] to [callControlIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCallControlId(callControlId: String) = apply { body.addCallControlId(callControlId) }

        /**
         * Use this field to add state to every subsequent webhook. Must be a valid Base-64 encoded
         * string.
         */
        fun clientState(clientState: String) = apply { body.clientState(clientState) }

        /**
         * Sets [Builder.clientState] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clientState] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun clientState(clientState: JsonField<String>) = apply { body.clientState(clientState) }

        /** Duration of each DTMF digit in milliseconds. */
        fun durationMillis(durationMillis: Long) = apply { body.durationMillis(durationMillis) }

        /**
         * Sets [Builder.durationMillis] to an arbitrary JSON value.
         *
         * You should usually call [Builder.durationMillis] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun durationMillis(durationMillis: JsonField<Long>) = apply {
            body.durationMillis(durationMillis)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
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
         * Returns an immutable instance of [ActionSendDtmfParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .digits()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ActionSendDtmfParams =
            ActionSendDtmfParams(
                id,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val digits: JsonField<String>,
        private val callControlIds: JsonField<List<String>>,
        private val clientState: JsonField<String>,
        private val durationMillis: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("digits") @ExcludeMissing digits: JsonField<String> = JsonMissing.of(),
            @JsonProperty("call_control_ids")
            @ExcludeMissing
            callControlIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("client_state")
            @ExcludeMissing
            clientState: JsonField<String> = JsonMissing.of(),
            @JsonProperty("duration_millis")
            @ExcludeMissing
            durationMillis: JsonField<Long> = JsonMissing.of(),
        ) : this(digits, callControlIds, clientState, durationMillis, mutableMapOf())

        /**
         * DTMF digits to send. Valid characters: 0-9, A-D, *, #, w (0.5s pause), W (1s pause).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun digits(): String = digits.getRequired("digits")

        /**
         * Array of participant call control IDs to send DTMF to. When empty, DTMF will be sent to
         * all participants.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun callControlIds(): Optional<List<String>> =
            callControlIds.getOptional("call_control_ids")

        /**
         * Use this field to add state to every subsequent webhook. Must be a valid Base-64 encoded
         * string.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun clientState(): Optional<String> = clientState.getOptional("client_state")

        /**
         * Duration of each DTMF digit in milliseconds.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun durationMillis(): Optional<Long> = durationMillis.getOptional("duration_millis")

        /**
         * Returns the raw JSON value of [digits].
         *
         * Unlike [digits], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("digits") @ExcludeMissing fun _digits(): JsonField<String> = digits

        /**
         * Returns the raw JSON value of [callControlIds].
         *
         * Unlike [callControlIds], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("call_control_ids")
        @ExcludeMissing
        fun _callControlIds(): JsonField<List<String>> = callControlIds

        /**
         * Returns the raw JSON value of [clientState].
         *
         * Unlike [clientState], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("client_state")
        @ExcludeMissing
        fun _clientState(): JsonField<String> = clientState

        /**
         * Returns the raw JSON value of [durationMillis].
         *
         * Unlike [durationMillis], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("duration_millis")
        @ExcludeMissing
        fun _durationMillis(): JsonField<Long> = durationMillis

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .digits()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var digits: JsonField<String>? = null
            private var callControlIds: JsonField<MutableList<String>>? = null
            private var clientState: JsonField<String> = JsonMissing.of()
            private var durationMillis: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                digits = body.digits
                callControlIds = body.callControlIds.map { it.toMutableList() }
                clientState = body.clientState
                durationMillis = body.durationMillis
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * DTMF digits to send. Valid characters: 0-9, A-D, *, #, w (0.5s pause), W (1s pause).
             */
            fun digits(digits: String) = digits(JsonField.of(digits))

            /**
             * Sets [Builder.digits] to an arbitrary JSON value.
             *
             * You should usually call [Builder.digits] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun digits(digits: JsonField<String>) = apply { this.digits = digits }

            /**
             * Array of participant call control IDs to send DTMF to. When empty, DTMF will be sent
             * to all participants.
             */
            fun callControlIds(callControlIds: List<String>) =
                callControlIds(JsonField.of(callControlIds))

            /**
             * Sets [Builder.callControlIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callControlIds] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun callControlIds(callControlIds: JsonField<List<String>>) = apply {
                this.callControlIds = callControlIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [callControlIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCallControlId(callControlId: String) = apply {
                callControlIds =
                    (callControlIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("callControlIds", it).add(callControlId)
                    }
            }

            /**
             * Use this field to add state to every subsequent webhook. Must be a valid Base-64
             * encoded string.
             */
            fun clientState(clientState: String) = clientState(JsonField.of(clientState))

            /**
             * Sets [Builder.clientState] to an arbitrary JSON value.
             *
             * You should usually call [Builder.clientState] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun clientState(clientState: JsonField<String>) = apply {
                this.clientState = clientState
            }

            /** Duration of each DTMF digit in milliseconds. */
            fun durationMillis(durationMillis: Long) = durationMillis(JsonField.of(durationMillis))

            /**
             * Sets [Builder.durationMillis] to an arbitrary JSON value.
             *
             * You should usually call [Builder.durationMillis] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun durationMillis(durationMillis: JsonField<Long>) = apply {
                this.durationMillis = durationMillis
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .digits()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("digits", digits),
                    (callControlIds ?: JsonMissing.of()).map { it.toImmutable() },
                    clientState,
                    durationMillis,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            digits()
            callControlIds()
            clientState()
            durationMillis()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: TelnyxInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (digits.asKnown().isPresent) 1 else 0) +
                (callControlIds.asKnown().getOrNull()?.size ?: 0) +
                (if (clientState.asKnown().isPresent) 1 else 0) +
                (if (durationMillis.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                digits == other.digits &&
                callControlIds == other.callControlIds &&
                clientState == other.clientState &&
                durationMillis == other.durationMillis &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(digits, callControlIds, clientState, durationMillis, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{digits=$digits, callControlIds=$callControlIds, clientState=$clientState, durationMillis=$durationMillis, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ActionSendDtmfParams &&
            id == other.id &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(id, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ActionSendDtmfParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
