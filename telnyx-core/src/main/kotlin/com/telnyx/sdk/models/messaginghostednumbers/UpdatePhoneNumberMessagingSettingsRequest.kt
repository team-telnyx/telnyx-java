// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messaginghostednumbers

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

class UpdatePhoneNumberMessagingSettingsRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val messagingProduct: JsonField<String>,
    private val messagingProfileId: JsonField<String>,
    private val tags: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("messaging_product")
        @ExcludeMissing
        messagingProduct: JsonField<String> = JsonMissing.of(),
        @JsonProperty("messaging_profile_id")
        @ExcludeMissing
        messagingProfileId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
    ) : this(messagingProduct, messagingProfileId, tags, mutableMapOf())

    /**
     * Configure the messaging product for this number:
     * * Omit this field or set its value to `null` to keep the current value.
     * * Set this field to a quoted product ID to set this phone number to that product
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun messagingProduct(): Optional<String> = messagingProduct.getOptional("messaging_product")

    /**
     * Configure the messaging profile this phone number is assigned to:
     * * Omit this field or set its value to `null` to keep the current value.
     * * Set this field to `""` to unassign the number from its messaging profile
     * * Set this field to a quoted UUID of a messaging profile to assign this number to that
     *   messaging profile
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun messagingProfileId(): Optional<String> =
        messagingProfileId.getOptional("messaging_profile_id")

    /**
     * Tags to set on this phone number.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tags(): Optional<List<String>> = tags.getOptional("tags")

    /**
     * Returns the raw JSON value of [messagingProduct].
     *
     * Unlike [messagingProduct], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("messaging_product")
    @ExcludeMissing
    fun _messagingProduct(): JsonField<String> = messagingProduct

    /**
     * Returns the raw JSON value of [messagingProfileId].
     *
     * Unlike [messagingProfileId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("messaging_profile_id")
    @ExcludeMissing
    fun _messagingProfileId(): JsonField<String> = messagingProfileId

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

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
         * [UpdatePhoneNumberMessagingSettingsRequest].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UpdatePhoneNumberMessagingSettingsRequest]. */
    class Builder internal constructor() {

        private var messagingProduct: JsonField<String> = JsonMissing.of()
        private var messagingProfileId: JsonField<String> = JsonMissing.of()
        private var tags: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            updatePhoneNumberMessagingSettingsRequest: UpdatePhoneNumberMessagingSettingsRequest
        ) = apply {
            messagingProduct = updatePhoneNumberMessagingSettingsRequest.messagingProduct
            messagingProfileId = updatePhoneNumberMessagingSettingsRequest.messagingProfileId
            tags = updatePhoneNumberMessagingSettingsRequest.tags.map { it.toMutableList() }
            additionalProperties =
                updatePhoneNumberMessagingSettingsRequest.additionalProperties.toMutableMap()
        }

        /**
         * Configure the messaging product for this number:
         * * Omit this field or set its value to `null` to keep the current value.
         * * Set this field to a quoted product ID to set this phone number to that product
         */
        fun messagingProduct(messagingProduct: String) =
            messagingProduct(JsonField.of(messagingProduct))

        /**
         * Sets [Builder.messagingProduct] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messagingProduct] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun messagingProduct(messagingProduct: JsonField<String>) = apply {
            this.messagingProduct = messagingProduct
        }

        /**
         * Configure the messaging profile this phone number is assigned to:
         * * Omit this field or set its value to `null` to keep the current value.
         * * Set this field to `""` to unassign the number from its messaging profile
         * * Set this field to a quoted UUID of a messaging profile to assign this number to that
         *   messaging profile
         */
        fun messagingProfileId(messagingProfileId: String) =
            messagingProfileId(JsonField.of(messagingProfileId))

        /**
         * Sets [Builder.messagingProfileId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messagingProfileId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun messagingProfileId(messagingProfileId: JsonField<String>) = apply {
            this.messagingProfileId = messagingProfileId
        }

        /** Tags to set on this phone number. */
        fun tags(tags: List<String>) = tags(JsonField.of(tags))

        /**
         * Sets [Builder.tags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tags] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tags(tags: JsonField<List<String>>) = apply {
            this.tags = tags.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [tags].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTag(tag: String) = apply {
            tags = (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
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
         * Returns an immutable instance of [UpdatePhoneNumberMessagingSettingsRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): UpdatePhoneNumberMessagingSettingsRequest =
            UpdatePhoneNumberMessagingSettingsRequest(
                messagingProduct,
                messagingProfileId,
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): UpdatePhoneNumberMessagingSettingsRequest = apply {
        if (validated) {
            return@apply
        }

        messagingProduct()
        messagingProfileId()
        tags()
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
        (if (messagingProduct.asKnown().isPresent) 1 else 0) +
            (if (messagingProfileId.asKnown().isPresent) 1 else 0) +
            (tags.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UpdatePhoneNumberMessagingSettingsRequest &&
            messagingProduct == other.messagingProduct &&
            messagingProfileId == other.messagingProfileId &&
            tags == other.tags &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(messagingProduct, messagingProfileId, tags, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UpdatePhoneNumberMessagingSettingsRequest{messagingProduct=$messagingProduct, messagingProfileId=$messagingProfileId, tags=$tags, additionalProperties=$additionalProperties}"
}
