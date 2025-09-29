// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.customstoragecredentials

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class S3ConfigurationData
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val awsAccessKeyId: JsonField<String>,
    private val awsSecretAccessKey: JsonField<String>,
    private val bucket: JsonField<String>,
    private val region: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("aws_access_key_id")
        @ExcludeMissing
        awsAccessKeyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("aws_secret_access_key")
        @ExcludeMissing
        awsSecretAccessKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("bucket") @ExcludeMissing bucket: JsonField<String> = JsonMissing.of(),
        @JsonProperty("region") @ExcludeMissing region: JsonField<String> = JsonMissing.of(),
    ) : this(awsAccessKeyId, awsSecretAccessKey, bucket, region, mutableMapOf())

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

        /** Returns a mutable builder for constructing an instance of [S3ConfigurationData]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [S3ConfigurationData]. */
    class Builder internal constructor() {

        private var awsAccessKeyId: JsonField<String> = JsonMissing.of()
        private var awsSecretAccessKey: JsonField<String> = JsonMissing.of()
        private var bucket: JsonField<String> = JsonMissing.of()
        private var region: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(s3ConfigurationData: S3ConfigurationData) = apply {
            awsAccessKeyId = s3ConfigurationData.awsAccessKeyId
            awsSecretAccessKey = s3ConfigurationData.awsSecretAccessKey
            bucket = s3ConfigurationData.bucket
            region = s3ConfigurationData.region
            additionalProperties = s3ConfigurationData.additionalProperties.toMutableMap()
        }

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
         */
        fun build(): S3ConfigurationData =
            S3ConfigurationData(
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
        (if (awsAccessKeyId.asKnown().isPresent) 1 else 0) +
            (if (awsSecretAccessKey.asKnown().isPresent) 1 else 0) +
            (if (bucket.asKnown().isPresent) 1 else 0) +
            (if (region.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is S3ConfigurationData &&
            awsAccessKeyId == other.awsAccessKeyId &&
            awsSecretAccessKey == other.awsSecretAccessKey &&
            bucket == other.bucket &&
            region == other.region &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(awsAccessKeyId, awsSecretAccessKey, bucket, region, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "S3ConfigurationData{awsAccessKeyId=$awsAccessKeyId, awsSecretAccessKey=$awsSecretAccessKey, bucket=$bucket, region=$region, additionalProperties=$additionalProperties}"
}
