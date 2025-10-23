// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.rooms.actions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Synchronously create an Client Token to join a Room. Client Token is necessary to join a Telnyx
 * Room. Client Token will expire after `token_ttl_secs`, a Refresh Token is also provided to
 * refresh a Client Token, the Refresh Token expires after `refresh_token_ttl_secs`.
 */
class ActionGenerateJoinClientTokenParams
private constructor(
    private val roomId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun roomId(): Optional<String> = Optional.ofNullable(roomId)

    /**
     * The time to live in seconds of the Refresh Token, after that time the Refresh Token is
     * invalid and can't be used to refresh Client Token.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun refreshTokenTtlSecs(): Optional<Long> = body.refreshTokenTtlSecs()

    /**
     * The time to live in seconds of the Client Token, after that time the Client Token is invalid
     * and can't be used to join a Room.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tokenTtlSecs(): Optional<Long> = body.tokenTtlSecs()

    /**
     * Returns the raw JSON value of [refreshTokenTtlSecs].
     *
     * Unlike [refreshTokenTtlSecs], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _refreshTokenTtlSecs(): JsonField<Long> = body._refreshTokenTtlSecs()

    /**
     * Returns the raw JSON value of [tokenTtlSecs].
     *
     * Unlike [tokenTtlSecs], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tokenTtlSecs(): JsonField<Long> = body._tokenTtlSecs()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ActionGenerateJoinClientTokenParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [ActionGenerateJoinClientTokenParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ActionGenerateJoinClientTokenParams]. */
    class Builder internal constructor() {

        private var roomId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            actionGenerateJoinClientTokenParams: ActionGenerateJoinClientTokenParams
        ) = apply {
            roomId = actionGenerateJoinClientTokenParams.roomId
            body = actionGenerateJoinClientTokenParams.body.toBuilder()
            additionalHeaders = actionGenerateJoinClientTokenParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                actionGenerateJoinClientTokenParams.additionalQueryParams.toBuilder()
        }

        fun roomId(roomId: String?) = apply { this.roomId = roomId }

        /** Alias for calling [Builder.roomId] with `roomId.orElse(null)`. */
        fun roomId(roomId: Optional<String>) = roomId(roomId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [refreshTokenTtlSecs]
         * - [tokenTtlSecs]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * The time to live in seconds of the Refresh Token, after that time the Refresh Token is
         * invalid and can't be used to refresh Client Token.
         */
        fun refreshTokenTtlSecs(refreshTokenTtlSecs: Long) = apply {
            body.refreshTokenTtlSecs(refreshTokenTtlSecs)
        }

        /**
         * Sets [Builder.refreshTokenTtlSecs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.refreshTokenTtlSecs] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun refreshTokenTtlSecs(refreshTokenTtlSecs: JsonField<Long>) = apply {
            body.refreshTokenTtlSecs(refreshTokenTtlSecs)
        }

        /**
         * The time to live in seconds of the Client Token, after that time the Client Token is
         * invalid and can't be used to join a Room.
         */
        fun tokenTtlSecs(tokenTtlSecs: Long) = apply { body.tokenTtlSecs(tokenTtlSecs) }

        /**
         * Sets [Builder.tokenTtlSecs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tokenTtlSecs] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tokenTtlSecs(tokenTtlSecs: JsonField<Long>) = apply { body.tokenTtlSecs(tokenTtlSecs) }

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
         * Returns an immutable instance of [ActionGenerateJoinClientTokenParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ActionGenerateJoinClientTokenParams =
            ActionGenerateJoinClientTokenParams(
                roomId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> roomId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val refreshTokenTtlSecs: JsonField<Long>,
        private val tokenTtlSecs: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("refresh_token_ttl_secs")
            @ExcludeMissing
            refreshTokenTtlSecs: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("token_ttl_secs")
            @ExcludeMissing
            tokenTtlSecs: JsonField<Long> = JsonMissing.of(),
        ) : this(refreshTokenTtlSecs, tokenTtlSecs, mutableMapOf())

        /**
         * The time to live in seconds of the Refresh Token, after that time the Refresh Token is
         * invalid and can't be used to refresh Client Token.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun refreshTokenTtlSecs(): Optional<Long> =
            refreshTokenTtlSecs.getOptional("refresh_token_ttl_secs")

        /**
         * The time to live in seconds of the Client Token, after that time the Client Token is
         * invalid and can't be used to join a Room.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tokenTtlSecs(): Optional<Long> = tokenTtlSecs.getOptional("token_ttl_secs")

        /**
         * Returns the raw JSON value of [refreshTokenTtlSecs].
         *
         * Unlike [refreshTokenTtlSecs], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("refresh_token_ttl_secs")
        @ExcludeMissing
        fun _refreshTokenTtlSecs(): JsonField<Long> = refreshTokenTtlSecs

        /**
         * Returns the raw JSON value of [tokenTtlSecs].
         *
         * Unlike [tokenTtlSecs], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("token_ttl_secs")
        @ExcludeMissing
        fun _tokenTtlSecs(): JsonField<Long> = tokenTtlSecs

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var refreshTokenTtlSecs: JsonField<Long> = JsonMissing.of()
            private var tokenTtlSecs: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                refreshTokenTtlSecs = body.refreshTokenTtlSecs
                tokenTtlSecs = body.tokenTtlSecs
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * The time to live in seconds of the Refresh Token, after that time the Refresh Token
             * is invalid and can't be used to refresh Client Token.
             */
            fun refreshTokenTtlSecs(refreshTokenTtlSecs: Long) =
                refreshTokenTtlSecs(JsonField.of(refreshTokenTtlSecs))

            /**
             * Sets [Builder.refreshTokenTtlSecs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.refreshTokenTtlSecs] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun refreshTokenTtlSecs(refreshTokenTtlSecs: JsonField<Long>) = apply {
                this.refreshTokenTtlSecs = refreshTokenTtlSecs
            }

            /**
             * The time to live in seconds of the Client Token, after that time the Client Token is
             * invalid and can't be used to join a Room.
             */
            fun tokenTtlSecs(tokenTtlSecs: Long) = tokenTtlSecs(JsonField.of(tokenTtlSecs))

            /**
             * Sets [Builder.tokenTtlSecs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tokenTtlSecs] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tokenTtlSecs(tokenTtlSecs: JsonField<Long>) = apply {
                this.tokenTtlSecs = tokenTtlSecs
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
             */
            fun build(): Body =
                Body(refreshTokenTtlSecs, tokenTtlSecs, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            refreshTokenTtlSecs()
            tokenTtlSecs()
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
            (if (refreshTokenTtlSecs.asKnown().isPresent) 1 else 0) +
                (if (tokenTtlSecs.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                refreshTokenTtlSecs == other.refreshTokenTtlSecs &&
                tokenTtlSecs == other.tokenTtlSecs &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(refreshTokenTtlSecs, tokenTtlSecs, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{refreshTokenTtlSecs=$refreshTokenTtlSecs, tokenTtlSecs=$tokenTtlSecs, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ActionGenerateJoinClientTokenParams &&
            roomId == other.roomId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(roomId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ActionGenerateJoinClientTokenParams{roomId=$roomId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
