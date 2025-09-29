// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage.migrationsources

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class MigrationSourceParams
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val bucketName: JsonField<String>,
    private val provider: JsonField<Provider>,
    private val providerAuth: JsonField<ProviderAuth>,
    private val id: JsonField<String>,
    private val sourceRegion: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("bucket_name")
        @ExcludeMissing
        bucketName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("provider") @ExcludeMissing provider: JsonField<Provider> = JsonMissing.of(),
        @JsonProperty("provider_auth")
        @ExcludeMissing
        providerAuth: JsonField<ProviderAuth> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source_region")
        @ExcludeMissing
        sourceRegion: JsonField<String> = JsonMissing.of(),
    ) : this(bucketName, provider, providerAuth, id, sourceRegion, mutableMapOf())

    /**
     * Bucket name to migrate the data from.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun bucketName(): String = bucketName.getRequired("bucket_name")

    /**
     * Cloud provider from which to migrate data. Use 'telnyx' if you want to migrate data from one
     * Telnyx bucket to another.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun provider(): Provider = provider.getRequired("provider")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun providerAuth(): ProviderAuth = providerAuth.getRequired("provider_auth")

    /**
     * Unique identifier for the data migration source.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * For intra-Telnyx buckets migration, specify the source bucket region in this field.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sourceRegion(): Optional<String> = sourceRegion.getOptional("source_region")

    /**
     * Returns the raw JSON value of [bucketName].
     *
     * Unlike [bucketName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bucket_name") @ExcludeMissing fun _bucketName(): JsonField<String> = bucketName

    /**
     * Returns the raw JSON value of [provider].
     *
     * Unlike [provider], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonField<Provider> = provider

    /**
     * Returns the raw JSON value of [providerAuth].
     *
     * Unlike [providerAuth], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("provider_auth")
    @ExcludeMissing
    fun _providerAuth(): JsonField<ProviderAuth> = providerAuth

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [sourceRegion].
     *
     * Unlike [sourceRegion], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source_region")
    @ExcludeMissing
    fun _sourceRegion(): JsonField<String> = sourceRegion

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
         * Returns a mutable builder for constructing an instance of [MigrationSourceParams].
         *
         * The following fields are required:
         * ```java
         * .bucketName()
         * .provider()
         * .providerAuth()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MigrationSourceParams]. */
    class Builder internal constructor() {

        private var bucketName: JsonField<String>? = null
        private var provider: JsonField<Provider>? = null
        private var providerAuth: JsonField<ProviderAuth>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var sourceRegion: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(migrationSourceParams: MigrationSourceParams) = apply {
            bucketName = migrationSourceParams.bucketName
            provider = migrationSourceParams.provider
            providerAuth = migrationSourceParams.providerAuth
            id = migrationSourceParams.id
            sourceRegion = migrationSourceParams.sourceRegion
            additionalProperties = migrationSourceParams.additionalProperties.toMutableMap()
        }

        /** Bucket name to migrate the data from. */
        fun bucketName(bucketName: String) = bucketName(JsonField.of(bucketName))

        /**
         * Sets [Builder.bucketName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bucketName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun bucketName(bucketName: JsonField<String>) = apply { this.bucketName = bucketName }

        /**
         * Cloud provider from which to migrate data. Use 'telnyx' if you want to migrate data from
         * one Telnyx bucket to another.
         */
        fun provider(provider: Provider) = provider(JsonField.of(provider))

        /**
         * Sets [Builder.provider] to an arbitrary JSON value.
         *
         * You should usually call [Builder.provider] with a well-typed [Provider] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun provider(provider: JsonField<Provider>) = apply { this.provider = provider }

        fun providerAuth(providerAuth: ProviderAuth) = providerAuth(JsonField.of(providerAuth))

        /**
         * Sets [Builder.providerAuth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.providerAuth] with a well-typed [ProviderAuth] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun providerAuth(providerAuth: JsonField<ProviderAuth>) = apply {
            this.providerAuth = providerAuth
        }

        /** Unique identifier for the data migration source. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** For intra-Telnyx buckets migration, specify the source bucket region in this field. */
        fun sourceRegion(sourceRegion: String) = sourceRegion(JsonField.of(sourceRegion))

        /**
         * Sets [Builder.sourceRegion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceRegion] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sourceRegion(sourceRegion: JsonField<String>) = apply {
            this.sourceRegion = sourceRegion
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
         * Returns an immutable instance of [MigrationSourceParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .bucketName()
         * .provider()
         * .providerAuth()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MigrationSourceParams =
            MigrationSourceParams(
                checkRequired("bucketName", bucketName),
                checkRequired("provider", provider),
                checkRequired("providerAuth", providerAuth),
                id,
                sourceRegion,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MigrationSourceParams = apply {
        if (validated) {
            return@apply
        }

        bucketName()
        provider().validate()
        providerAuth().validate()
        id()
        sourceRegion()
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
        (if (bucketName.asKnown().isPresent) 1 else 0) +
            (provider.asKnown().getOrNull()?.validity() ?: 0) +
            (providerAuth.asKnown().getOrNull()?.validity() ?: 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (sourceRegion.asKnown().isPresent) 1 else 0)

    /**
     * Cloud provider from which to migrate data. Use 'telnyx' if you want to migrate data from one
     * Telnyx bucket to another.
     */
    class Provider @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val AWS = of("aws")

            @JvmField val TELNYX = of("telnyx")

            @JvmStatic fun of(value: String) = Provider(JsonField.of(value))
        }

        /** An enum containing [Provider]'s known values. */
        enum class Known {
            AWS,
            TELNYX,
        }

        /**
         * An enum containing [Provider]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Provider] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AWS,
            TELNYX,
            /** An enum member indicating that [Provider] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                AWS -> Value.AWS
                TELNYX -> Value.TELNYX
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws TelnyxInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                AWS -> Known.AWS
                TELNYX -> Known.TELNYX
                else -> throw TelnyxInvalidDataException("Unknown Provider: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): Provider = apply {
            if (validated) {
                return@apply
            }

            known()
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Provider && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class ProviderAuth
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accessKey: JsonField<String>,
        private val secretAccessKey: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("access_key")
            @ExcludeMissing
            accessKey: JsonField<String> = JsonMissing.of(),
            @JsonProperty("secret_access_key")
            @ExcludeMissing
            secretAccessKey: JsonField<String> = JsonMissing.of(),
        ) : this(accessKey, secretAccessKey, mutableMapOf())

        /**
         * AWS Access Key. For Telnyx-to-Telnyx migrations, use your Telnyx API key here.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun accessKey(): Optional<String> = accessKey.getOptional("access_key")

        /**
         * AWS Secret Access Key. For Telnyx-to-Telnyx migrations, use your Telnyx API key here as
         * well.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun secretAccessKey(): Optional<String> = secretAccessKey.getOptional("secret_access_key")

        /**
         * Returns the raw JSON value of [accessKey].
         *
         * Unlike [accessKey], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("access_key") @ExcludeMissing fun _accessKey(): JsonField<String> = accessKey

        /**
         * Returns the raw JSON value of [secretAccessKey].
         *
         * Unlike [secretAccessKey], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("secret_access_key")
        @ExcludeMissing
        fun _secretAccessKey(): JsonField<String> = secretAccessKey

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

            /** Returns a mutable builder for constructing an instance of [ProviderAuth]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ProviderAuth]. */
        class Builder internal constructor() {

            private var accessKey: JsonField<String> = JsonMissing.of()
            private var secretAccessKey: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(providerAuth: ProviderAuth) = apply {
                accessKey = providerAuth.accessKey
                secretAccessKey = providerAuth.secretAccessKey
                additionalProperties = providerAuth.additionalProperties.toMutableMap()
            }

            /** AWS Access Key. For Telnyx-to-Telnyx migrations, use your Telnyx API key here. */
            fun accessKey(accessKey: String) = accessKey(JsonField.of(accessKey))

            /**
             * Sets [Builder.accessKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accessKey] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accessKey(accessKey: JsonField<String>) = apply { this.accessKey = accessKey }

            /**
             * AWS Secret Access Key. For Telnyx-to-Telnyx migrations, use your Telnyx API key here
             * as well.
             */
            fun secretAccessKey(secretAccessKey: String) =
                secretAccessKey(JsonField.of(secretAccessKey))

            /**
             * Sets [Builder.secretAccessKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.secretAccessKey] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun secretAccessKey(secretAccessKey: JsonField<String>) = apply {
                this.secretAccessKey = secretAccessKey
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
             * Returns an immutable instance of [ProviderAuth].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ProviderAuth =
                ProviderAuth(accessKey, secretAccessKey, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): ProviderAuth = apply {
            if (validated) {
                return@apply
            }

            accessKey()
            secretAccessKey()
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
            (if (accessKey.asKnown().isPresent) 1 else 0) +
                (if (secretAccessKey.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ProviderAuth &&
                accessKey == other.accessKey &&
                secretAccessKey == other.secretAccessKey &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(accessKey, secretAccessKey, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ProviderAuth{accessKey=$accessKey, secretAccessKey=$secretAccessKey, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MigrationSourceParams &&
            bucketName == other.bucketName &&
            provider == other.provider &&
            providerAuth == other.providerAuth &&
            id == other.id &&
            sourceRegion == other.sourceRegion &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(bucketName, provider, providerAuth, id, sourceRegion, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MigrationSourceParams{bucketName=$bucketName, provider=$provider, providerAuth=$providerAuth, id=$id, sourceRegion=$sourceRegion, additionalProperties=$additionalProperties}"
}
