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

class AzureConfigurationData
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val accountKey: JsonField<String>,
    private val accountName: JsonField<String>,
    private val bucket: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("account_key")
        @ExcludeMissing
        accountKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_name")
        @ExcludeMissing
        accountName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("bucket") @ExcludeMissing bucket: JsonField<String> = JsonMissing.of(),
    ) : this(accountKey, accountName, bucket, mutableMapOf())

    /**
     * Azure Blob Storage account key.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountKey(): Optional<String> = accountKey.getOptional("account_key")

    /**
     * Azure Blob Storage account name.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountName(): Optional<String> = accountName.getOptional("account_name")

    /**
     * Name of the bucket to be used to store recording files.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bucket(): Optional<String> = bucket.getOptional("bucket")

    /**
     * Returns the raw JSON value of [accountKey].
     *
     * Unlike [accountKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_key") @ExcludeMissing fun _accountKey(): JsonField<String> = accountKey

    /**
     * Returns the raw JSON value of [accountName].
     *
     * Unlike [accountName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_name")
    @ExcludeMissing
    fun _accountName(): JsonField<String> = accountName

    /**
     * Returns the raw JSON value of [bucket].
     *
     * Unlike [bucket], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bucket") @ExcludeMissing fun _bucket(): JsonField<String> = bucket

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

        /** Returns a mutable builder for constructing an instance of [AzureConfigurationData]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AzureConfigurationData]. */
    class Builder internal constructor() {

        private var accountKey: JsonField<String> = JsonMissing.of()
        private var accountName: JsonField<String> = JsonMissing.of()
        private var bucket: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(azureConfigurationData: AzureConfigurationData) = apply {
            accountKey = azureConfigurationData.accountKey
            accountName = azureConfigurationData.accountName
            bucket = azureConfigurationData.bucket
            additionalProperties = azureConfigurationData.additionalProperties.toMutableMap()
        }

        /** Azure Blob Storage account key. */
        fun accountKey(accountKey: String) = accountKey(JsonField.of(accountKey))

        /**
         * Sets [Builder.accountKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountKey] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountKey(accountKey: JsonField<String>) = apply { this.accountKey = accountKey }

        /** Azure Blob Storage account name. */
        fun accountName(accountName: String) = accountName(JsonField.of(accountName))

        /**
         * Sets [Builder.accountName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountName(accountName: JsonField<String>) = apply { this.accountName = accountName }

        /** Name of the bucket to be used to store recording files. */
        fun bucket(bucket: String) = bucket(JsonField.of(bucket))

        /**
         * Sets [Builder.bucket] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bucket] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun bucket(bucket: JsonField<String>) = apply { this.bucket = bucket }

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
         * Returns an immutable instance of [AzureConfigurationData].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AzureConfigurationData =
            AzureConfigurationData(
                accountKey,
                accountName,
                bucket,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AzureConfigurationData = apply {
        if (validated) {
            return@apply
        }

        accountKey()
        accountName()
        bucket()
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
        (if (accountKey.asKnown().isPresent) 1 else 0) +
            (if (accountName.asKnown().isPresent) 1 else 0) +
            (if (bucket.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AzureConfigurationData &&
            accountKey == other.accountKey &&
            accountName == other.accountName &&
            bucket == other.bucket &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(accountKey, accountName, bucket, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AzureConfigurationData{accountKey=$accountKey, accountName=$accountName, bucket=$bucket, additionalProperties=$additionalProperties}"
}
