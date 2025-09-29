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
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Synchronously refresh an Client Token to join a Room. Client Token is necessary to join a Telnyx
 * Room. Client Token will expire after `token_ttl_secs`.
 */
class ActionRefreshClientTokenParams
private constructor(
    private val roomId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun roomId(): Optional<String> = Optional.ofNullable(roomId)

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun refreshToken(): String = body.refreshToken()

    /**
     * The time to live in seconds of the Client Token, after that time the Client Token is invalid
     * and can't be used to join a Room.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tokenTtlSecs(): Optional<Long> = body.tokenTtlSecs()

    /**
     * Returns the raw JSON value of [refreshToken].
     *
     * Unlike [refreshToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _refreshToken(): JsonField<String> = body._refreshToken()

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

        /**
         * Returns a mutable builder for constructing an instance of
         * [ActionRefreshClientTokenParams].
         *
         * The following fields are required:
         * ```java
         * .refreshToken()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ActionRefreshClientTokenParams]. */
    class Builder internal constructor() {

        private var roomId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(actionRefreshClientTokenParams: ActionRefreshClientTokenParams) = apply {
            roomId = actionRefreshClientTokenParams.roomId
            body = actionRefreshClientTokenParams.body.toBuilder()
            additionalHeaders = actionRefreshClientTokenParams.additionalHeaders.toBuilder()
            additionalQueryParams = actionRefreshClientTokenParams.additionalQueryParams.toBuilder()
        }

        fun roomId(roomId: String?) = apply { this.roomId = roomId }

        /** Alias for calling [Builder.roomId] with `roomId.orElse(null)`. */
        fun roomId(roomId: Optional<String>) = roomId(roomId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [refreshToken]
         * - [tokenTtlSecs]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun refreshToken(refreshToken: String) = apply { body.refreshToken(refreshToken) }

        /**
         * Sets [Builder.refreshToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.refreshToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun refreshToken(refreshToken: JsonField<String>) = apply {
            body.refreshToken(refreshToken)
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
         * Returns an immutable instance of [ActionRefreshClientTokenParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .refreshToken()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ActionRefreshClientTokenParams =
            ActionRefreshClientTokenParams(
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
        private val refreshToken: JsonField<String>,
        private val tokenTtlSecs: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("refresh_token")
            @ExcludeMissing
            refreshToken: JsonField<String> = JsonMissing.of(),
            @JsonProperty("token_ttl_secs")
            @ExcludeMissing
            tokenTtlSecs: JsonField<Long> = JsonMissing.of(),
        ) : this(refreshToken, tokenTtlSecs, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun refreshToken(): String = refreshToken.getRequired("refresh_token")

        /**
         * The time to live in seconds of the Client Token, after that time the Client Token is
         * invalid and can't be used to join a Room.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tokenTtlSecs(): Optional<Long> = tokenTtlSecs.getOptional("token_ttl_secs")

        /**
         * Returns the raw JSON value of [refreshToken].
         *
         * Unlike [refreshToken], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("refresh_token")
        @ExcludeMissing
        fun _refreshToken(): JsonField<String> = refreshToken

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

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .refreshToken()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var refreshToken: JsonField<String>? = null
            private var tokenTtlSecs: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                refreshToken = body.refreshToken
                tokenTtlSecs = body.tokenTtlSecs
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun refreshToken(refreshToken: String) = refreshToken(JsonField.of(refreshToken))

            /**
             * Sets [Builder.refreshToken] to an arbitrary JSON value.
             *
             * You should usually call [Builder.refreshToken] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun refreshToken(refreshToken: JsonField<String>) = apply {
                this.refreshToken = refreshToken
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
             *
             * The following fields are required:
             * ```java
             * .refreshToken()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("refreshToken", refreshToken),
                    tokenTtlSecs,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            refreshToken()
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
            (if (refreshToken.asKnown().isPresent) 1 else 0) +
                (if (tokenTtlSecs.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                refreshToken == other.refreshToken &&
                tokenTtlSecs == other.tokenTtlSecs &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(refreshToken, tokenTtlSecs, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{refreshToken=$refreshToken, tokenTtlSecs=$tokenTtlSecs, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ActionRefreshClientTokenParams &&
            roomId == other.roomId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(roomId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ActionRefreshClientTokenParams{roomId=$roomId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
