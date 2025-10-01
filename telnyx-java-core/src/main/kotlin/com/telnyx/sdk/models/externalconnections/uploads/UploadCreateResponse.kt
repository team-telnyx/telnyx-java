// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.externalconnections.uploads

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

class UploadCreateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val success: JsonField<Boolean>,
    private val ticketId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("success") @ExcludeMissing success: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("ticket_id") @ExcludeMissing ticketId: JsonField<String> = JsonMissing.of(),
    ) : this(success, ticketId, mutableMapOf())

    /**
     * Describes wether or not the operation was successful
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun success(): Optional<Boolean> = success.getOptional("success")

    /**
     * Ticket id of the upload request
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ticketId(): Optional<String> = ticketId.getOptional("ticket_id")

    /**
     * Returns the raw JSON value of [success].
     *
     * Unlike [success], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("success") @ExcludeMissing fun _success(): JsonField<Boolean> = success

    /**
     * Returns the raw JSON value of [ticketId].
     *
     * Unlike [ticketId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ticket_id") @ExcludeMissing fun _ticketId(): JsonField<String> = ticketId

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

        /** Returns a mutable builder for constructing an instance of [UploadCreateResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UploadCreateResponse]. */
    class Builder internal constructor() {

        private var success: JsonField<Boolean> = JsonMissing.of()
        private var ticketId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(uploadCreateResponse: UploadCreateResponse) = apply {
            success = uploadCreateResponse.success
            ticketId = uploadCreateResponse.ticketId
            additionalProperties = uploadCreateResponse.additionalProperties.toMutableMap()
        }

        /** Describes wether or not the operation was successful */
        fun success(success: Boolean) = success(JsonField.of(success))

        /**
         * Sets [Builder.success] to an arbitrary JSON value.
         *
         * You should usually call [Builder.success] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun success(success: JsonField<Boolean>) = apply { this.success = success }

        /** Ticket id of the upload request */
        fun ticketId(ticketId: String) = ticketId(JsonField.of(ticketId))

        /**
         * Sets [Builder.ticketId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ticketId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ticketId(ticketId: JsonField<String>) = apply { this.ticketId = ticketId }

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
         * Returns an immutable instance of [UploadCreateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): UploadCreateResponse =
            UploadCreateResponse(success, ticketId, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): UploadCreateResponse = apply {
        if (validated) {
            return@apply
        }

        success()
        ticketId()
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
        (if (success.asKnown().isPresent) 1 else 0) + (if (ticketId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UploadCreateResponse &&
            success == other.success &&
            ticketId == other.ticketId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(success, ticketId, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UploadCreateResponse{success=$success, ticketId=$ticketId, additionalProperties=$additionalProperties}"
}
