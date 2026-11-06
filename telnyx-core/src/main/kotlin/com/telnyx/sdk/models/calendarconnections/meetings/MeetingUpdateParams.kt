// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calendarconnections.meetings

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Set an individual meeting override: true opts in, false opts out, null follows the connection
 * policy. A supported meeting link is required. Changes re-evaluate the meeting immediately; poll
 * the linked session for its final lifecycle outcome.
 */
class MeetingUpdateParams
private constructor(
    private val id: String,
    private val meetingId: String?,
    private val body: Body,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): String = id

    fun meetingId(): Optional<String> = Optional.ofNullable(meetingId)

    /**
     * True opts in, false opts out, null follows connection policy. A supported meeting URL is
     * still required.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun botWillJoin(): Optional<Boolean> = body.botWillJoin()

    /**
     * Returns the raw JSON value of [botWillJoin].
     *
     * Unlike [botWillJoin], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _botWillJoin(): JsonField<Boolean> = body._botWillJoin()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MeetingUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .botWillJoin()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MeetingUpdateParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var meetingId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(meetingUpdateParams: MeetingUpdateParams) = apply {
            id = meetingUpdateParams.id
            meetingId = meetingUpdateParams.meetingId
            body = meetingUpdateParams.body.toBuilder()
            additionalHeaders = meetingUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = meetingUpdateParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String) = apply { this.id = id }

        fun meetingId(meetingId: String?) = apply { this.meetingId = meetingId }

        /** Alias for calling [Builder.meetingId] with `meetingId.orElse(null)`. */
        fun meetingId(meetingId: Optional<String>) = meetingId(meetingId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [botWillJoin]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * True opts in, false opts out, null follows connection policy. A supported meeting URL is
         * still required.
         */
        fun botWillJoin(botWillJoin: Boolean?) = apply { body.botWillJoin(botWillJoin) }

        /**
         * Alias for [Builder.botWillJoin].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun botWillJoin(botWillJoin: Boolean) = botWillJoin(botWillJoin as Boolean?)

        /** Alias for calling [Builder.botWillJoin] with `botWillJoin.orElse(null)`. */
        fun botWillJoin(botWillJoin: Optional<Boolean>) = botWillJoin(botWillJoin.getOrNull())

        /**
         * Sets [Builder.botWillJoin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.botWillJoin] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun botWillJoin(botWillJoin: JsonField<Boolean>) = apply { body.botWillJoin(botWillJoin) }

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

        fun additionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) = apply {
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

        fun putAllAdditionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) = apply {
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

        fun replaceAllAdditionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) =
            apply {
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
         * Returns an immutable instance of [MeetingUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .botWillJoin()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MeetingUpdateParams =
            MeetingUpdateParams(
                checkRequired("id", id),
                meetingId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id
            1 -> meetingId ?: ""
            else -> ""
        }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val botWillJoin: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("bot_will_join")
            @ExcludeMissing
            botWillJoin: JsonField<Boolean> = JsonMissing.of()
        ) : this(botWillJoin, mutableMapOf())

        /**
         * True opts in, false opts out, null follows connection policy. A supported meeting URL is
         * still required.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun botWillJoin(): Optional<Boolean> = botWillJoin.getOptional("bot_will_join")

        /**
         * Returns the raw JSON value of [botWillJoin].
         *
         * Unlike [botWillJoin], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("bot_will_join")
        @ExcludeMissing
        fun _botWillJoin(): JsonField<Boolean> = botWillJoin

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
             * .botWillJoin()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var botWillJoin: JsonField<Boolean>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                botWillJoin = body.botWillJoin
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * True opts in, false opts out, null follows connection policy. A supported meeting URL
             * is still required.
             */
            fun botWillJoin(botWillJoin: Boolean?) = botWillJoin(JsonField.ofNullable(botWillJoin))

            /**
             * Alias for [Builder.botWillJoin].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun botWillJoin(botWillJoin: Boolean) = botWillJoin(botWillJoin as Boolean?)

            /** Alias for calling [Builder.botWillJoin] with `botWillJoin.orElse(null)`. */
            fun botWillJoin(botWillJoin: Optional<Boolean>) = botWillJoin(botWillJoin.getOrNull())

            /**
             * Sets [Builder.botWillJoin] to an arbitrary JSON value.
             *
             * You should usually call [Builder.botWillJoin] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun botWillJoin(botWillJoin: JsonField<Boolean>) = apply {
                this.botWillJoin = botWillJoin
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
             * .botWillJoin()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(checkRequired("botWillJoin", botWillJoin), additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            botWillJoin()
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
        @JvmSynthetic internal fun validity(): Int = (if (botWillJoin.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                botWillJoin == other.botWillJoin &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(botWillJoin, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{botWillJoin=$botWillJoin, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MeetingUpdateParams &&
            id == other.id &&
            meetingId == other.meetingId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(id, meetingId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "MeetingUpdateParams{id=$id, meetingId=$meetingId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
