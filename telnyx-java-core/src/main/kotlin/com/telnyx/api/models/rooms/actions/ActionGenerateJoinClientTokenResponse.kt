// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.rooms.actions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ActionGenerateJoinClientTokenResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<Data>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of()
    ) : this(data, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): Optional<Data> = data.getOptional("data")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

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
         * Returns a mutable builder for constructing an instance of
         * [ActionGenerateJoinClientTokenResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ActionGenerateJoinClientTokenResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            actionGenerateJoinClientTokenResponse: ActionGenerateJoinClientTokenResponse
        ) = apply {
            data = actionGenerateJoinClientTokenResponse.data
            additionalProperties =
                actionGenerateJoinClientTokenResponse.additionalProperties.toMutableMap()
        }

        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

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
         * Returns an immutable instance of [ActionGenerateJoinClientTokenResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ActionGenerateJoinClientTokenResponse =
            ActionGenerateJoinClientTokenResponse(data, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): ActionGenerateJoinClientTokenResponse = apply {
        if (validated) {
            return@apply
        }

        data().ifPresent { it.validate() }
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic internal fun validity(): Int = (data.asKnown().getOrNull()?.validity() ?: 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val token: JsonField<String>,
        private val refreshToken: JsonField<String>,
        private val refreshTokenExpiresAt: JsonField<OffsetDateTime>,
        private val tokenExpiresAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
            @JsonProperty("refresh_token")
            @ExcludeMissing
            refreshToken: JsonField<String> = JsonMissing.of(),
            @JsonProperty("refresh_token_expires_at")
            @ExcludeMissing
            refreshTokenExpiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("token_expires_at")
            @ExcludeMissing
            tokenExpiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(token, refreshToken, refreshTokenExpiresAt, tokenExpiresAt, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun token(): Optional<String> = token.getOptional("token")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun refreshToken(): Optional<String> = refreshToken.getOptional("refresh_token")

        /**
         * ISO 8601 timestamp when the refresh token expires.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun refreshTokenExpiresAt(): Optional<OffsetDateTime> =
            refreshTokenExpiresAt.getOptional("refresh_token_expires_at")

        /**
         * ISO 8601 timestamp when the token expires.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tokenExpiresAt(): Optional<OffsetDateTime> =
            tokenExpiresAt.getOptional("token_expires_at")

        /**
         * Returns the raw JSON value of [token].
         *
         * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

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
         * Returns the raw JSON value of [refreshTokenExpiresAt].
         *
         * Unlike [refreshTokenExpiresAt], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("refresh_token_expires_at")
        @ExcludeMissing
        fun _refreshTokenExpiresAt(): JsonField<OffsetDateTime> = refreshTokenExpiresAt

        /**
         * Returns the raw JSON value of [tokenExpiresAt].
         *
         * Unlike [tokenExpiresAt], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("token_expires_at")
        @ExcludeMissing
        fun _tokenExpiresAt(): JsonField<OffsetDateTime> = tokenExpiresAt

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

            /** Returns a mutable builder for constructing an instance of [Data]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var token: JsonField<String> = JsonMissing.of()
            private var refreshToken: JsonField<String> = JsonMissing.of()
            private var refreshTokenExpiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var tokenExpiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                token = data.token
                refreshToken = data.refreshToken
                refreshTokenExpiresAt = data.refreshTokenExpiresAt
                tokenExpiresAt = data.tokenExpiresAt
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun token(token: String) = token(JsonField.of(token))

            /**
             * Sets [Builder.token] to an arbitrary JSON value.
             *
             * You should usually call [Builder.token] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun token(token: JsonField<String>) = apply { this.token = token }

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

            /** ISO 8601 timestamp when the refresh token expires. */
            fun refreshTokenExpiresAt(refreshTokenExpiresAt: OffsetDateTime) =
                refreshTokenExpiresAt(JsonField.of(refreshTokenExpiresAt))

            /**
             * Sets [Builder.refreshTokenExpiresAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.refreshTokenExpiresAt] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun refreshTokenExpiresAt(refreshTokenExpiresAt: JsonField<OffsetDateTime>) = apply {
                this.refreshTokenExpiresAt = refreshTokenExpiresAt
            }

            /** ISO 8601 timestamp when the token expires. */
            fun tokenExpiresAt(tokenExpiresAt: OffsetDateTime) =
                tokenExpiresAt(JsonField.of(tokenExpiresAt))

            /**
             * Sets [Builder.tokenExpiresAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tokenExpiresAt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun tokenExpiresAt(tokenExpiresAt: JsonField<OffsetDateTime>) = apply {
                this.tokenExpiresAt = tokenExpiresAt
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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Data =
                Data(
                    token,
                    refreshToken,
                    refreshTokenExpiresAt,
                    tokenExpiresAt,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            token()
            refreshToken()
            refreshTokenExpiresAt()
            tokenExpiresAt()
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
            (if (token.asKnown().isPresent) 1 else 0) +
                (if (refreshToken.asKnown().isPresent) 1 else 0) +
                (if (refreshTokenExpiresAt.asKnown().isPresent) 1 else 0) +
                (if (tokenExpiresAt.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                token == other.token &&
                refreshToken == other.refreshToken &&
                refreshTokenExpiresAt == other.refreshTokenExpiresAt &&
                tokenExpiresAt == other.tokenExpiresAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                token,
                refreshToken,
                refreshTokenExpiresAt,
                tokenExpiresAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{token=$token, refreshToken=$refreshToken, refreshTokenExpiresAt=$refreshTokenExpiresAt, tokenExpiresAt=$tokenExpiresAt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ActionGenerateJoinClientTokenResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ActionGenerateJoinClientTokenResponse{data=$data, additionalProperties=$additionalProperties}"
}
