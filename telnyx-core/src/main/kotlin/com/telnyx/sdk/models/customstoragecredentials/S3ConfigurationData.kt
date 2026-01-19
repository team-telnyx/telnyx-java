// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.customstoragecredentials

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

class S3ConfigurationData
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val backend: JsonField<Backend>,
    private val awsAccessKeyId: JsonField<String>,
    private val awsSecretAccessKey: JsonField<String>,
    private val bucket: JsonField<String>,
    private val region: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("backend") @ExcludeMissing backend: JsonField<Backend> = JsonMissing.of(),
        @JsonProperty("aws_access_key_id")
        @ExcludeMissing
        awsAccessKeyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("aws_secret_access_key")
        @ExcludeMissing
        awsSecretAccessKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("bucket") @ExcludeMissing bucket: JsonField<String> = JsonMissing.of(),
        @JsonProperty("region") @ExcludeMissing region: JsonField<String> = JsonMissing.of(),
    ) : this(backend, awsAccessKeyId, awsSecretAccessKey, bucket, region, mutableMapOf())

    /**
     * Storage backend type
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun backend(): Backend = backend.getRequired("backend")

    /**
     * AWS credentials access key id.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun awsAccessKeyId(): Optional<String> = awsAccessKeyId.getOptional("aws_access_key_id")

    /**
     * AWS secret access key.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun awsSecretAccessKey(): Optional<String> =
        awsSecretAccessKey.getOptional("aws_secret_access_key")

    /**
     * Name of the bucket to be used to store recording files.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bucket(): Optional<String> = bucket.getOptional("bucket")

    /**
     * Region where the bucket is located.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun region(): Optional<String> = region.getOptional("region")

    /**
     * Returns the raw JSON value of [backend].
     *
     * Unlike [backend], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("backend") @ExcludeMissing fun _backend(): JsonField<Backend> = backend

    /**
     * Returns the raw JSON value of [awsAccessKeyId].
     *
     * Unlike [awsAccessKeyId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("aws_access_key_id")
    @ExcludeMissing
    fun _awsAccessKeyId(): JsonField<String> = awsAccessKeyId

    /**
     * Returns the raw JSON value of [awsSecretAccessKey].
     *
     * Unlike [awsSecretAccessKey], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("aws_secret_access_key")
    @ExcludeMissing
    fun _awsSecretAccessKey(): JsonField<String> = awsSecretAccessKey

    /**
     * Returns the raw JSON value of [bucket].
     *
     * Unlike [bucket], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bucket") @ExcludeMissing fun _bucket(): JsonField<String> = bucket

    /**
     * Returns the raw JSON value of [region].
     *
     * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

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
         * Returns a mutable builder for constructing an instance of [S3ConfigurationData].
         *
         * The following fields are required:
         * ```java
         * .backend()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [S3ConfigurationData]. */
    class Builder internal constructor() {

        private var backend: JsonField<Backend>? = null
        private var awsAccessKeyId: JsonField<String> = JsonMissing.of()
        private var awsSecretAccessKey: JsonField<String> = JsonMissing.of()
        private var bucket: JsonField<String> = JsonMissing.of()
        private var region: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(s3ConfigurationData: S3ConfigurationData) = apply {
            backend = s3ConfigurationData.backend
            awsAccessKeyId = s3ConfigurationData.awsAccessKeyId
            awsSecretAccessKey = s3ConfigurationData.awsSecretAccessKey
            bucket = s3ConfigurationData.bucket
            region = s3ConfigurationData.region
            additionalProperties = s3ConfigurationData.additionalProperties.toMutableMap()
        }

        /** Storage backend type */
        fun backend(backend: Backend) = backend(JsonField.of(backend))

        /**
         * Sets [Builder.backend] to an arbitrary JSON value.
         *
         * You should usually call [Builder.backend] with a well-typed [Backend] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun backend(backend: JsonField<Backend>) = apply { this.backend = backend }

        /** AWS credentials access key id. */
        fun awsAccessKeyId(awsAccessKeyId: String) = awsAccessKeyId(JsonField.of(awsAccessKeyId))

        /**
         * Sets [Builder.awsAccessKeyId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.awsAccessKeyId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun awsAccessKeyId(awsAccessKeyId: JsonField<String>) = apply {
            this.awsAccessKeyId = awsAccessKeyId
        }

        /** AWS secret access key. */
        fun awsSecretAccessKey(awsSecretAccessKey: String) =
            awsSecretAccessKey(JsonField.of(awsSecretAccessKey))

        /**
         * Sets [Builder.awsSecretAccessKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.awsSecretAccessKey] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun awsSecretAccessKey(awsSecretAccessKey: JsonField<String>) = apply {
            this.awsSecretAccessKey = awsSecretAccessKey
        }

        /** Name of the bucket to be used to store recording files. */
        fun bucket(bucket: String) = bucket(JsonField.of(bucket))

        /**
         * Sets [Builder.bucket] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bucket] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun bucket(bucket: JsonField<String>) = apply { this.bucket = bucket }

        /** Region where the bucket is located. */
        fun region(region: String) = region(JsonField.of(region))

        /**
         * Sets [Builder.region] to an arbitrary JSON value.
         *
         * You should usually call [Builder.region] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun region(region: JsonField<String>) = apply { this.region = region }

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
         * Returns an immutable instance of [S3ConfigurationData].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .backend()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): S3ConfigurationData =
            S3ConfigurationData(
                checkRequired("backend", backend),
                awsAccessKeyId,
                awsSecretAccessKey,
                bucket,
                region,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): S3ConfigurationData = apply {
        if (validated) {
            return@apply
        }

        backend().validate()
        awsAccessKeyId()
        awsSecretAccessKey()
        bucket()
        region()
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
        (backend.asKnown().getOrNull()?.validity() ?: 0) +
            (if (awsAccessKeyId.asKnown().isPresent) 1 else 0) +
            (if (awsSecretAccessKey.asKnown().isPresent) 1 else 0) +
            (if (bucket.asKnown().isPresent) 1 else 0) +
            (if (region.asKnown().isPresent) 1 else 0)

    /** Storage backend type */
    class Backend @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val S3 = of("s3")

            @JvmStatic fun of(value: String) = Backend(JsonField.of(value))
        }

        /** An enum containing [Backend]'s known values. */
        enum class Known {
            S3
        }

        /**
         * An enum containing [Backend]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Backend] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            S3,
            /** An enum member indicating that [Backend] was instantiated with an unknown value. */
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
                S3 -> Value.S3
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
                S3 -> Known.S3
                else -> throw TelnyxInvalidDataException("Unknown Backend: $value")
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

        fun validate(): Backend = apply {
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

            return other is Backend && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is S3ConfigurationData &&
            backend == other.backend &&
            awsAccessKeyId == other.awsAccessKeyId &&
            awsSecretAccessKey == other.awsSecretAccessKey &&
            bucket == other.bucket &&
            region == other.region &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            backend,
            awsAccessKeyId,
            awsSecretAccessKey,
            bucket,
            region,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "S3ConfigurationData{backend=$backend, awsAccessKeyId=$awsAccessKeyId, awsSecretAccessKey=$awsSecretAccessKey, bucket=$bucket, region=$region, additionalProperties=$additionalProperties}"
}
