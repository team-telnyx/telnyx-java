// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.portingorders

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.checkKnown
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PortingOrderPhoneNumberConfiguration
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val billingGroupId: JsonField<String>,
    private val connectionId: JsonField<String>,
    private val emergencyAddressId: JsonField<String>,
    private val messagingProfileId: JsonField<String>,
    private val tags: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("billing_group_id")
        @ExcludeMissing
        billingGroupId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("connection_id")
        @ExcludeMissing
        connectionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("emergency_address_id")
        @ExcludeMissing
        emergencyAddressId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("messaging_profile_id")
        @ExcludeMissing
        messagingProfileId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
    ) : this(
        billingGroupId,
        connectionId,
        emergencyAddressId,
        messagingProfileId,
        tags,
        mutableMapOf(),
    )

    /**
     * identifies the billing group to set on the numbers when ported
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billingGroupId(): Optional<String> = billingGroupId.getOptional("billing_group_id")

    /**
     * identifies the connection to set on the numbers when ported
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun connectionId(): Optional<String> = connectionId.getOptional("connection_id")

    /**
     * identifies the emergency address to set on the numbers when ported
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun emergencyAddressId(): Optional<String> =
        emergencyAddressId.getOptional("emergency_address_id")

    /**
     * identifies the messaging profile to set on the numbers when ported
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun messagingProfileId(): Optional<String> =
        messagingProfileId.getOptional("messaging_profile_id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tags(): Optional<List<String>> = tags.getOptional("tags")

    /**
     * Returns the raw JSON value of [billingGroupId].
     *
     * Unlike [billingGroupId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("billing_group_id")
    @ExcludeMissing
    fun _billingGroupId(): JsonField<String> = billingGroupId

    /**
     * Returns the raw JSON value of [connectionId].
     *
     * Unlike [connectionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("connection_id")
    @ExcludeMissing
    fun _connectionId(): JsonField<String> = connectionId

    /**
     * Returns the raw JSON value of [emergencyAddressId].
     *
     * Unlike [emergencyAddressId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("emergency_address_id")
    @ExcludeMissing
    fun _emergencyAddressId(): JsonField<String> = emergencyAddressId

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
         * [PortingOrderPhoneNumberConfiguration].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PortingOrderPhoneNumberConfiguration]. */
    class Builder internal constructor() {

        private var billingGroupId: JsonField<String> = JsonMissing.of()
        private var connectionId: JsonField<String> = JsonMissing.of()
        private var emergencyAddressId: JsonField<String> = JsonMissing.of()
        private var messagingProfileId: JsonField<String> = JsonMissing.of()
        private var tags: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            portingOrderPhoneNumberConfiguration: PortingOrderPhoneNumberConfiguration
        ) = apply {
            billingGroupId = portingOrderPhoneNumberConfiguration.billingGroupId
            connectionId = portingOrderPhoneNumberConfiguration.connectionId
            emergencyAddressId = portingOrderPhoneNumberConfiguration.emergencyAddressId
            messagingProfileId = portingOrderPhoneNumberConfiguration.messagingProfileId
            tags = portingOrderPhoneNumberConfiguration.tags.map { it.toMutableList() }
            additionalProperties =
                portingOrderPhoneNumberConfiguration.additionalProperties.toMutableMap()
        }

        /** identifies the billing group to set on the numbers when ported */
        fun billingGroupId(billingGroupId: String) = billingGroupId(JsonField.of(billingGroupId))

        /**
         * Sets [Builder.billingGroupId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingGroupId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun billingGroupId(billingGroupId: JsonField<String>) = apply {
            this.billingGroupId = billingGroupId
        }

        /** identifies the connection to set on the numbers when ported */
        fun connectionId(connectionId: String) = connectionId(JsonField.of(connectionId))

        /**
         * Sets [Builder.connectionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.connectionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun connectionId(connectionId: JsonField<String>) = apply {
            this.connectionId = connectionId
        }

        /** identifies the emergency address to set on the numbers when ported */
        fun emergencyAddressId(emergencyAddressId: String) =
            emergencyAddressId(JsonField.of(emergencyAddressId))

        /**
         * Sets [Builder.emergencyAddressId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.emergencyAddressId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun emergencyAddressId(emergencyAddressId: JsonField<String>) = apply {
            this.emergencyAddressId = emergencyAddressId
        }

        /** identifies the messaging profile to set on the numbers when ported */
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
         * Returns an immutable instance of [PortingOrderPhoneNumberConfiguration].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PortingOrderPhoneNumberConfiguration =
            PortingOrderPhoneNumberConfiguration(
                billingGroupId,
                connectionId,
                emergencyAddressId,
                messagingProfileId,
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PortingOrderPhoneNumberConfiguration = apply {
        if (validated) {
            return@apply
        }

        billingGroupId()
        connectionId()
        emergencyAddressId()
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
        (if (billingGroupId.asKnown().isPresent) 1 else 0) +
            (if (connectionId.asKnown().isPresent) 1 else 0) +
            (if (emergencyAddressId.asKnown().isPresent) 1 else 0) +
            (if (messagingProfileId.asKnown().isPresent) 1 else 0) +
            (tags.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PortingOrderPhoneNumberConfiguration &&
            billingGroupId == other.billingGroupId &&
            connectionId == other.connectionId &&
            emergencyAddressId == other.emergencyAddressId &&
            messagingProfileId == other.messagingProfileId &&
            tags == other.tags &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            billingGroupId,
            connectionId,
            emergencyAddressId,
            messagingProfileId,
            tags,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PortingOrderPhoneNumberConfiguration{billingGroupId=$billingGroupId, connectionId=$connectionId, emergencyAddressId=$emergencyAddressId, messagingProfileId=$messagingProfileId, tags=$tags, additionalProperties=$additionalProperties}"
}
