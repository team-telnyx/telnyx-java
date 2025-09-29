// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.oauth

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class OAuthRetrieveJwksResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val keys: JsonField<List<Key>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("keys") @ExcludeMissing keys: JsonField<List<Key>> = JsonMissing.of()
    ) : this(keys, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun keys(): Optional<List<Key>> = keys.getOptional("keys")

    /**
     * Returns the raw JSON value of [keys].
     *
     * Unlike [keys], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("keys") @ExcludeMissing fun _keys(): JsonField<List<Key>> = keys

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
         * Returns a mutable builder for constructing an instance of [OAuthRetrieveJwksResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OAuthRetrieveJwksResponse]. */
    class Builder internal constructor() {

        private var keys: JsonField<MutableList<Key>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(oauthRetrieveJwksResponse: OAuthRetrieveJwksResponse) = apply {
            keys = oauthRetrieveJwksResponse.keys.map { it.toMutableList() }
            additionalProperties = oauthRetrieveJwksResponse.additionalProperties.toMutableMap()
        }

        fun keys(keys: List<Key>) = keys(JsonField.of(keys))

        /**
         * Sets [Builder.keys] to an arbitrary JSON value.
         *
         * You should usually call [Builder.keys] with a well-typed `List<Key>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun keys(keys: JsonField<List<Key>>) = apply { this.keys = keys.map { it.toMutableList() } }

        /**
         * Adds a single [Key] to [keys].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addKey(key: Key) = apply {
            keys = (keys ?: JsonField.of(mutableListOf())).also { checkKnown("keys", it).add(key) }
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
         * Returns an immutable instance of [OAuthRetrieveJwksResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): OAuthRetrieveJwksResponse =
            OAuthRetrieveJwksResponse(
                (keys ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): OAuthRetrieveJwksResponse = apply {
        if (validated) {
            return@apply
        }

        keys().ifPresent { it.forEach { it.validate() } }
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
    @JvmSynthetic
    internal fun validity(): Int =
        (keys.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Key
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val alg: JsonField<String>,
        private val kid: JsonField<String>,
        private val kty: JsonField<String>,
        private val use: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("alg") @ExcludeMissing alg: JsonField<String> = JsonMissing.of(),
            @JsonProperty("kid") @ExcludeMissing kid: JsonField<String> = JsonMissing.of(),
            @JsonProperty("kty") @ExcludeMissing kty: JsonField<String> = JsonMissing.of(),
            @JsonProperty("use") @ExcludeMissing use: JsonField<String> = JsonMissing.of(),
        ) : this(alg, kid, kty, use, mutableMapOf())

        /**
         * Algorithm
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun alg(): Optional<String> = alg.getOptional("alg")

        /**
         * Key ID
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun kid(): Optional<String> = kid.getOptional("kid")

        /**
         * Key type
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun kty(): Optional<String> = kty.getOptional("kty")

        /**
         * Key use
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun use(): Optional<String> = use.getOptional("use")

        /**
         * Returns the raw JSON value of [alg].
         *
         * Unlike [alg], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("alg") @ExcludeMissing fun _alg(): JsonField<String> = alg

        /**
         * Returns the raw JSON value of [kid].
         *
         * Unlike [kid], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("kid") @ExcludeMissing fun _kid(): JsonField<String> = kid

        /**
         * Returns the raw JSON value of [kty].
         *
         * Unlike [kty], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("kty") @ExcludeMissing fun _kty(): JsonField<String> = kty

        /**
         * Returns the raw JSON value of [use].
         *
         * Unlike [use], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("use") @ExcludeMissing fun _use(): JsonField<String> = use

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

            /** Returns a mutable builder for constructing an instance of [Key]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Key]. */
        class Builder internal constructor() {

            private var alg: JsonField<String> = JsonMissing.of()
            private var kid: JsonField<String> = JsonMissing.of()
            private var kty: JsonField<String> = JsonMissing.of()
            private var use: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(key: Key) = apply {
                alg = key.alg
                kid = key.kid
                kty = key.kty
                use = key.use
                additionalProperties = key.additionalProperties.toMutableMap()
            }

            /** Algorithm */
            fun alg(alg: String) = alg(JsonField.of(alg))

            /**
             * Sets [Builder.alg] to an arbitrary JSON value.
             *
             * You should usually call [Builder.alg] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun alg(alg: JsonField<String>) = apply { this.alg = alg }

            /** Key ID */
            fun kid(kid: String) = kid(JsonField.of(kid))

            /**
             * Sets [Builder.kid] to an arbitrary JSON value.
             *
             * You should usually call [Builder.kid] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun kid(kid: JsonField<String>) = apply { this.kid = kid }

            /** Key type */
            fun kty(kty: String) = kty(JsonField.of(kty))

            /**
             * Sets [Builder.kty] to an arbitrary JSON value.
             *
             * You should usually call [Builder.kty] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun kty(kty: JsonField<String>) = apply { this.kty = kty }

            /** Key use */
            fun use(use: String) = use(JsonField.of(use))

            /**
             * Sets [Builder.use] to an arbitrary JSON value.
             *
             * You should usually call [Builder.use] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun use(use: JsonField<String>) = apply { this.use = use }

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
             * Returns an immutable instance of [Key].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Key = Key(alg, kid, kty, use, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Key = apply {
            if (validated) {
                return@apply
            }

            alg()
            kid()
            kty()
            use()
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
            (if (alg.asKnown().isPresent) 1 else 0) +
                (if (kid.asKnown().isPresent) 1 else 0) +
                (if (kty.asKnown().isPresent) 1 else 0) +
                (if (use.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Key &&
                alg == other.alg &&
                kid == other.kid &&
                kty == other.kty &&
                use == other.use &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(alg, kid, kty, use, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Key{alg=$alg, kid=$kid, kty=$kty, use=$use, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OAuthRetrieveJwksResponse &&
            keys == other.keys &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(keys, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OAuthRetrieveJwksResponse{keys=$keys, additionalProperties=$additionalProperties}"
}
