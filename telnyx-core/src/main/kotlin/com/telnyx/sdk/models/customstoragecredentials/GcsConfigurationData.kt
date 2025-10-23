// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.customstoragecredentials

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class GcsConfigurationData
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val bucket: JsonField<String>,
    private val credentials: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("bucket") @ExcludeMissing bucket: JsonField<String> = JsonMissing.of(),
        @JsonProperty("credentials")
        @ExcludeMissing
        credentials: JsonField<String> = JsonMissing.of(),
    ) : this(bucket, credentials, mutableMapOf())

    /**
     * Name of the bucket to be used to store recording files.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bucket(): Optional<String> = bucket.getOptional("bucket")

    /**
     * Opaque credential token used to authenticate and authorize with storage provider.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun credentials(): Optional<String> = credentials.getOptional("credentials")

    /**
     * Returns the raw JSON value of [bucket].
     *
     * Unlike [bucket], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bucket") @ExcludeMissing fun _bucket(): JsonField<String> = bucket

    /**
     * Returns the raw JSON value of [credentials].
     *
     * Unlike [credentials], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("credentials") @ExcludeMissing fun _credentials(): JsonField<String> = credentials

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

        /** Returns a mutable builder for constructing an instance of [GcsConfigurationData]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [GcsConfigurationData]. */
    class Builder internal constructor() {

        private var bucket: JsonField<String> = JsonMissing.of()
        private var credentials: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(gcsConfigurationData: GcsConfigurationData) = apply {
            bucket = gcsConfigurationData.bucket
            credentials = gcsConfigurationData.credentials
            additionalProperties = gcsConfigurationData.additionalProperties.toMutableMap()
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

        /** Opaque credential token used to authenticate and authorize with storage provider. */
        fun credentials(credentials: String) = credentials(JsonField.of(credentials))

        /**
         * Sets [Builder.credentials] to an arbitrary JSON value.
         *
         * You should usually call [Builder.credentials] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun credentials(credentials: JsonField<String>) = apply { this.credentials = credentials }

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
         * Returns an immutable instance of [GcsConfigurationData].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): GcsConfigurationData =
            GcsConfigurationData(bucket, credentials, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): GcsConfigurationData = apply {
        if (validated) {
            return@apply
        }

        bucket()
        credentials()
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
        (if (bucket.asKnown().isPresent) 1 else 0) + (if (credentials.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is GcsConfigurationData &&
            bucket == other.bucket &&
            credentials == other.credentials &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(bucket, credentials, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "GcsConfigurationData{bucket=$bucket, credentials=$credentials, additionalProperties=$additionalProperties}"
}
