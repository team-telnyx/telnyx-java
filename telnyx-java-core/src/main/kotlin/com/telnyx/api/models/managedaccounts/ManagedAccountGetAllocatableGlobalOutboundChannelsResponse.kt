// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.managedaccounts

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
import kotlin.jvm.optionals.getOrNull

class ManagedAccountGetAllocatableGlobalOutboundChannelsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<Data>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of()
    ) : this(data, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): Optional<Data> = data.getOptional("data")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

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
         * [ManagedAccountGetAllocatableGlobalOutboundChannelsResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ManagedAccountGetAllocatableGlobalOutboundChannelsResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            managedAccountGetAllocatableGlobalOutboundChannelsResponse:
                ManagedAccountGetAllocatableGlobalOutboundChannelsResponse
        ) = apply {
            data = managedAccountGetAllocatableGlobalOutboundChannelsResponse.data
            additionalProperties =
                managedAccountGetAllocatableGlobalOutboundChannelsResponse.additionalProperties
                    .toMutableMap()
        }

        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

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
         * Returns an immutable instance of
         * [ManagedAccountGetAllocatableGlobalOutboundChannelsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ManagedAccountGetAllocatableGlobalOutboundChannelsResponse =
            ManagedAccountGetAllocatableGlobalOutboundChannelsResponse(
                data,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ManagedAccountGetAllocatableGlobalOutboundChannelsResponse = apply {
        if (validated) {
            return@apply
        }

        data().ifPresent { it.validate() }
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
    @JvmSynthetic internal fun validity(): Int = (data.asKnown().getOrNull()?.validity() ?: 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val allocatableGlobalOutboundChannels: JsonField<Long>,
        private val managedAccountAllowCustomPricing: JsonField<Boolean>,
        private val recordType: JsonField<String>,
        private val totalGlobalChannelsAllocated: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("allocatable_global_outbound_channels")
            @ExcludeMissing
            allocatableGlobalOutboundChannels: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("managed_account_allow_custom_pricing")
            @ExcludeMissing
            managedAccountAllowCustomPricing: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("total_global_channels_allocated")
            @ExcludeMissing
            totalGlobalChannelsAllocated: JsonField<Long> = JsonMissing.of(),
        ) : this(
            allocatableGlobalOutboundChannels,
            managedAccountAllowCustomPricing,
            recordType,
            totalGlobalChannelsAllocated,
            mutableMapOf(),
        )

        /**
         * The total amount of allocatable global outbound channels available to the authenticated
         * manager. Will be 0 if the feature is not enabled for their account.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun allocatableGlobalOutboundChannels(): Optional<Long> =
            allocatableGlobalOutboundChannels.getOptional("allocatable_global_outbound_channels")

        /**
         * Boolean value that indicates if the managed account is able to have custom pricing set
         * for it or not. If false, uses the pricing of the manager account. Defaults to false. This
         * value may be changed, but there may be time lag between when the value is changed and
         * pricing changes take effect.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun managedAccountAllowCustomPricing(): Optional<Boolean> =
            managedAccountAllowCustomPricing.getOptional("managed_account_allow_custom_pricing")

        /**
         * The type of the data contained in this record.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordType(): Optional<String> = recordType.getOptional("record_type")

        /**
         * The total number of allocatable global outbound channels currently allocated across all
         * managed accounts for the authenticated user. This includes any amount of channels
         * allocated by default at managed account creation time. Will be 0 if the feature is not
         * enabled for their account.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun totalGlobalChannelsAllocated(): Optional<Long> =
            totalGlobalChannelsAllocated.getOptional("total_global_channels_allocated")

        /**
         * Returns the raw JSON value of [allocatableGlobalOutboundChannels].
         *
         * Unlike [allocatableGlobalOutboundChannels], this method doesn't throw if the JSON field
         * has an unexpected type.
         */
        @JsonProperty("allocatable_global_outbound_channels")
        @ExcludeMissing
        fun _allocatableGlobalOutboundChannels(): JsonField<Long> =
            allocatableGlobalOutboundChannels

        /**
         * Returns the raw JSON value of [managedAccountAllowCustomPricing].
         *
         * Unlike [managedAccountAllowCustomPricing], this method doesn't throw if the JSON field
         * has an unexpected type.
         */
        @JsonProperty("managed_account_allow_custom_pricing")
        @ExcludeMissing
        fun _managedAccountAllowCustomPricing(): JsonField<Boolean> =
            managedAccountAllowCustomPricing

        /**
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<String> = recordType

        /**
         * Returns the raw JSON value of [totalGlobalChannelsAllocated].
         *
         * Unlike [totalGlobalChannelsAllocated], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("total_global_channels_allocated")
        @ExcludeMissing
        fun _totalGlobalChannelsAllocated(): JsonField<Long> = totalGlobalChannelsAllocated

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

            /** Returns a mutable builder for constructing an instance of [Data]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var allocatableGlobalOutboundChannels: JsonField<Long> = JsonMissing.of()
            private var managedAccountAllowCustomPricing: JsonField<Boolean> = JsonMissing.of()
            private var recordType: JsonField<String> = JsonMissing.of()
            private var totalGlobalChannelsAllocated: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                allocatableGlobalOutboundChannels = data.allocatableGlobalOutboundChannels
                managedAccountAllowCustomPricing = data.managedAccountAllowCustomPricing
                recordType = data.recordType
                totalGlobalChannelsAllocated = data.totalGlobalChannelsAllocated
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /**
             * The total amount of allocatable global outbound channels available to the
             * authenticated manager. Will be 0 if the feature is not enabled for their account.
             */
            fun allocatableGlobalOutboundChannels(allocatableGlobalOutboundChannels: Long) =
                allocatableGlobalOutboundChannels(JsonField.of(allocatableGlobalOutboundChannels))

            /**
             * Sets [Builder.allocatableGlobalOutboundChannels] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allocatableGlobalOutboundChannels] with a well-typed
             * [Long] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun allocatableGlobalOutboundChannels(
                allocatableGlobalOutboundChannels: JsonField<Long>
            ) = apply { this.allocatableGlobalOutboundChannels = allocatableGlobalOutboundChannels }

            /**
             * Boolean value that indicates if the managed account is able to have custom pricing
             * set for it or not. If false, uses the pricing of the manager account. Defaults to
             * false. This value may be changed, but there may be time lag between when the value is
             * changed and pricing changes take effect.
             */
            fun managedAccountAllowCustomPricing(managedAccountAllowCustomPricing: Boolean) =
                managedAccountAllowCustomPricing(JsonField.of(managedAccountAllowCustomPricing))

            /**
             * Sets [Builder.managedAccountAllowCustomPricing] to an arbitrary JSON value.
             *
             * You should usually call [Builder.managedAccountAllowCustomPricing] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun managedAccountAllowCustomPricing(
                managedAccountAllowCustomPricing: JsonField<Boolean>
            ) = apply { this.managedAccountAllowCustomPricing = managedAccountAllowCustomPricing }

            /** The type of the data contained in this record. */
            fun recordType(recordType: String) = recordType(JsonField.of(recordType))

            /**
             * Sets [Builder.recordType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

            /**
             * The total number of allocatable global outbound channels currently allocated across
             * all managed accounts for the authenticated user. This includes any amount of channels
             * allocated by default at managed account creation time. Will be 0 if the feature is
             * not enabled for their account.
             */
            fun totalGlobalChannelsAllocated(totalGlobalChannelsAllocated: Long) =
                totalGlobalChannelsAllocated(JsonField.of(totalGlobalChannelsAllocated))

            /**
             * Sets [Builder.totalGlobalChannelsAllocated] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalGlobalChannelsAllocated] with a well-typed
             * [Long] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun totalGlobalChannelsAllocated(totalGlobalChannelsAllocated: JsonField<Long>) =
                apply {
                    this.totalGlobalChannelsAllocated = totalGlobalChannelsAllocated
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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Data =
                Data(
                    allocatableGlobalOutboundChannels,
                    managedAccountAllowCustomPricing,
                    recordType,
                    totalGlobalChannelsAllocated,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            allocatableGlobalOutboundChannels()
            managedAccountAllowCustomPricing()
            recordType()
            totalGlobalChannelsAllocated()
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
            (if (allocatableGlobalOutboundChannels.asKnown().isPresent) 1 else 0) +
                (if (managedAccountAllowCustomPricing.asKnown().isPresent) 1 else 0) +
                (if (recordType.asKnown().isPresent) 1 else 0) +
                (if (totalGlobalChannelsAllocated.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                allocatableGlobalOutboundChannels == other.allocatableGlobalOutboundChannels &&
                managedAccountAllowCustomPricing == other.managedAccountAllowCustomPricing &&
                recordType == other.recordType &&
                totalGlobalChannelsAllocated == other.totalGlobalChannelsAllocated &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                allocatableGlobalOutboundChannels,
                managedAccountAllowCustomPricing,
                recordType,
                totalGlobalChannelsAllocated,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{allocatableGlobalOutboundChannels=$allocatableGlobalOutboundChannels, managedAccountAllowCustomPricing=$managedAccountAllowCustomPricing, recordType=$recordType, totalGlobalChannelsAllocated=$totalGlobalChannelsAllocated, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ManagedAccountGetAllocatableGlobalOutboundChannelsResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ManagedAccountGetAllocatableGlobalOutboundChannelsResponse{data=$data, additionalProperties=$additionalProperties}"
}
