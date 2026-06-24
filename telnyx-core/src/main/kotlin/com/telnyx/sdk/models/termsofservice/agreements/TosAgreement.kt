// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.termsofservice.agreements

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * A recorded user agreement to a product's Terms of Service. The `user_id` is intentionally NOT
 * echoed back on this public surface - the caller already knows their own identity.
 */
class TosAgreement
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val agreedAt: JsonField<OffsetDateTime>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val productType: JsonField<TosProductType>,
    private val termsVersion: JsonField<String>,
    private val version: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("agreed_at")
        @ExcludeMissing
        agreedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("product_type")
        @ExcludeMissing
        productType: JsonField<TosProductType> = JsonMissing.of(),
        @JsonProperty("terms_version")
        @ExcludeMissing
        termsVersion: JsonField<String> = JsonMissing.of(),
        @JsonProperty("version") @ExcludeMissing version: JsonField<String> = JsonMissing.of(),
    ) : this(id, agreedAt, createdAt, productType, termsVersion, version, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun agreedAt(): Optional<OffsetDateTime> = agreedAt.getOptional("agreed_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * Telnyx product the Terms of Service apply to.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun productType(): Optional<TosProductType> = productType.getOptional("product_type")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun termsVersion(): Optional<String> = termsVersion.getOptional("terms_version")

    /**
     * Convenience alias of `terms_version`. Both keys are present on every response.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun version(): Optional<String> = version.getOptional("version")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [agreedAt].
     *
     * Unlike [agreedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("agreed_at") @ExcludeMissing fun _agreedAt(): JsonField<OffsetDateTime> = agreedAt

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [productType].
     *
     * Unlike [productType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("product_type")
    @ExcludeMissing
    fun _productType(): JsonField<TosProductType> = productType

    /**
     * Returns the raw JSON value of [termsVersion].
     *
     * Unlike [termsVersion], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("terms_version")
    @ExcludeMissing
    fun _termsVersion(): JsonField<String> = termsVersion

    /**
     * Returns the raw JSON value of [version].
     *
     * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<String> = version

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

        /** Returns a mutable builder for constructing an instance of [TosAgreement]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TosAgreement]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var agreedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var productType: JsonField<TosProductType> = JsonMissing.of()
        private var termsVersion: JsonField<String> = JsonMissing.of()
        private var version: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(tosAgreement: TosAgreement) = apply {
            id = tosAgreement.id
            agreedAt = tosAgreement.agreedAt
            createdAt = tosAgreement.createdAt
            productType = tosAgreement.productType
            termsVersion = tosAgreement.termsVersion
            version = tosAgreement.version
            additionalProperties = tosAgreement.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun agreedAt(agreedAt: OffsetDateTime) = agreedAt(JsonField.of(agreedAt))

        /**
         * Sets [Builder.agreedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agreedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun agreedAt(agreedAt: JsonField<OffsetDateTime>) = apply { this.agreedAt = agreedAt }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Telnyx product the Terms of Service apply to. */
        fun productType(productType: TosProductType) = productType(JsonField.of(productType))

        /**
         * Sets [Builder.productType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.productType] with a well-typed [TosProductType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun productType(productType: JsonField<TosProductType>) = apply {
            this.productType = productType
        }

        fun termsVersion(termsVersion: String) = termsVersion(JsonField.of(termsVersion))

        /**
         * Sets [Builder.termsVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.termsVersion] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun termsVersion(termsVersion: JsonField<String>) = apply {
            this.termsVersion = termsVersion
        }

        /** Convenience alias of `terms_version`. Both keys are present on every response. */
        fun version(version: String) = version(JsonField.of(version))

        /**
         * Sets [Builder.version] to an arbitrary JSON value.
         *
         * You should usually call [Builder.version] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun version(version: JsonField<String>) = apply { this.version = version }

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
         * Returns an immutable instance of [TosAgreement].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TosAgreement =
            TosAgreement(
                id,
                agreedAt,
                createdAt,
                productType,
                termsVersion,
                version,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): TosAgreement = apply {
        if (validated) {
            return@apply
        }

        id()
        agreedAt()
        createdAt()
        productType().ifPresent { it.validate() }
        termsVersion()
        version()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (agreedAt.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (productType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (termsVersion.asKnown().isPresent) 1 else 0) +
            (if (version.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TosAgreement &&
            id == other.id &&
            agreedAt == other.agreedAt &&
            createdAt == other.createdAt &&
            productType == other.productType &&
            termsVersion == other.termsVersion &&
            version == other.version &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            agreedAt,
            createdAt,
            productType,
            termsVersion,
            version,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TosAgreement{id=$id, agreedAt=$agreedAt, createdAt=$createdAt, productType=$productType, termsVersion=$termsVersion, version=$version, additionalProperties=$additionalProperties}"
}
