// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects

/**
 * One authorization to include when creating or updating a DIR: an approved BPO (Business Process
 * Outsourcer) account plus the signed Letter of Authorization the Brand Owner granted it.
 */
class BpoAuthorizationInput
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val bpoEnterpriseId: JsonField<String>,
    private val loaDocumentId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("bpo_enterprise_id")
        @ExcludeMissing
        bpoEnterpriseId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("loa_document_id")
        @ExcludeMissing
        loaDocumentId: JsonField<String> = JsonMissing.of(),
    ) : this(bpoEnterpriseId, loaDocumentId, mutableMapOf())

    /**
     * Enterprise id of an approved BPO (Business Process Outsourcer) account on your organization
     * to authorize for this DIR.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun bpoEnterpriseId(): String = bpoEnterpriseId.getRequired("bpo_enterprise_id")

    /**
     * Id of the signed Letter of Authorization document (uploaded via the Telnyx Documents API) in
     * which the Brand Owner authorizes this BPO.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun loaDocumentId(): String = loaDocumentId.getRequired("loa_document_id")

    /**
     * Returns the raw JSON value of [bpoEnterpriseId].
     *
     * Unlike [bpoEnterpriseId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bpo_enterprise_id")
    @ExcludeMissing
    fun _bpoEnterpriseId(): JsonField<String> = bpoEnterpriseId

    /**
     * Returns the raw JSON value of [loaDocumentId].
     *
     * Unlike [loaDocumentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("loa_document_id")
    @ExcludeMissing
    fun _loaDocumentId(): JsonField<String> = loaDocumentId

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
         * Returns a mutable builder for constructing an instance of [BpoAuthorizationInput].
         *
         * The following fields are required:
         * ```java
         * .bpoEnterpriseId()
         * .loaDocumentId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BpoAuthorizationInput]. */
    class Builder internal constructor() {

        private var bpoEnterpriseId: JsonField<String>? = null
        private var loaDocumentId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(bpoAuthorizationInput: BpoAuthorizationInput) = apply {
            bpoEnterpriseId = bpoAuthorizationInput.bpoEnterpriseId
            loaDocumentId = bpoAuthorizationInput.loaDocumentId
            additionalProperties = bpoAuthorizationInput.additionalProperties.toMutableMap()
        }

        /**
         * Enterprise id of an approved BPO (Business Process Outsourcer) account on your
         * organization to authorize for this DIR.
         */
        fun bpoEnterpriseId(bpoEnterpriseId: String) =
            bpoEnterpriseId(JsonField.of(bpoEnterpriseId))

        /**
         * Sets [Builder.bpoEnterpriseId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bpoEnterpriseId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun bpoEnterpriseId(bpoEnterpriseId: JsonField<String>) = apply {
            this.bpoEnterpriseId = bpoEnterpriseId
        }

        /**
         * Id of the signed Letter of Authorization document (uploaded via the Telnyx Documents API)
         * in which the Brand Owner authorizes this BPO.
         */
        fun loaDocumentId(loaDocumentId: String) = loaDocumentId(JsonField.of(loaDocumentId))

        /**
         * Sets [Builder.loaDocumentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.loaDocumentId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun loaDocumentId(loaDocumentId: JsonField<String>) = apply {
            this.loaDocumentId = loaDocumentId
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
         * Returns an immutable instance of [BpoAuthorizationInput].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .bpoEnterpriseId()
         * .loaDocumentId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BpoAuthorizationInput =
            BpoAuthorizationInput(
                checkRequired("bpoEnterpriseId", bpoEnterpriseId),
                checkRequired("loaDocumentId", loaDocumentId),
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
    fun validate(): BpoAuthorizationInput = apply {
        if (validated) {
            return@apply
        }

        bpoEnterpriseId()
        loaDocumentId()
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
        (if (bpoEnterpriseId.asKnown().isPresent) 1 else 0) +
            (if (loaDocumentId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BpoAuthorizationInput &&
            bpoEnterpriseId == other.bpoEnterpriseId &&
            loaDocumentId == other.loaDocumentId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(bpoEnterpriseId, loaDocumentId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BpoAuthorizationInput{bpoEnterpriseId=$bpoEnterpriseId, loaDocumentId=$loaDocumentId, additionalProperties=$additionalProperties}"
}
