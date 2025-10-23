// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.externalconnections

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
import kotlin.jvm.optionals.getOrNull

class ExternalConnectionUpdateLocationResponse
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
         * [ExternalConnectionUpdateLocationResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalConnectionUpdateLocationResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            externalConnectionUpdateLocationResponse: ExternalConnectionUpdateLocationResponse
        ) = apply {
            data = externalConnectionUpdateLocationResponse.data
            additionalProperties =
                externalConnectionUpdateLocationResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [ExternalConnectionUpdateLocationResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ExternalConnectionUpdateLocationResponse =
            ExternalConnectionUpdateLocationResponse(data, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): ExternalConnectionUpdateLocationResponse = apply {
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
        private val acceptedAddressSuggestions: JsonField<Boolean>,
        private val locationId: JsonField<String>,
        private val staticEmergencyAddressId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("accepted_address_suggestions")
            @ExcludeMissing
            acceptedAddressSuggestions: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("location_id")
            @ExcludeMissing
            locationId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("static_emergency_address_id")
            @ExcludeMissing
            staticEmergencyAddressId: JsonField<String> = JsonMissing.of(),
        ) : this(acceptedAddressSuggestions, locationId, staticEmergencyAddressId, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun acceptedAddressSuggestions(): Optional<Boolean> =
            acceptedAddressSuggestions.getOptional("accepted_address_suggestions")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun locationId(): Optional<String> = locationId.getOptional("location_id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun staticEmergencyAddressId(): Optional<String> =
            staticEmergencyAddressId.getOptional("static_emergency_address_id")

        /**
         * Returns the raw JSON value of [acceptedAddressSuggestions].
         *
         * Unlike [acceptedAddressSuggestions], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("accepted_address_suggestions")
        @ExcludeMissing
        fun _acceptedAddressSuggestions(): JsonField<Boolean> = acceptedAddressSuggestions

        /**
         * Returns the raw JSON value of [locationId].
         *
         * Unlike [locationId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("location_id")
        @ExcludeMissing
        fun _locationId(): JsonField<String> = locationId

        /**
         * Returns the raw JSON value of [staticEmergencyAddressId].
         *
         * Unlike [staticEmergencyAddressId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("static_emergency_address_id")
        @ExcludeMissing
        fun _staticEmergencyAddressId(): JsonField<String> = staticEmergencyAddressId

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

            private var acceptedAddressSuggestions: JsonField<Boolean> = JsonMissing.of()
            private var locationId: JsonField<String> = JsonMissing.of()
            private var staticEmergencyAddressId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                acceptedAddressSuggestions = data.acceptedAddressSuggestions
                locationId = data.locationId
                staticEmergencyAddressId = data.staticEmergencyAddressId
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun acceptedAddressSuggestions(acceptedAddressSuggestions: Boolean) =
                acceptedAddressSuggestions(JsonField.of(acceptedAddressSuggestions))

            /**
             * Sets [Builder.acceptedAddressSuggestions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.acceptedAddressSuggestions] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun acceptedAddressSuggestions(acceptedAddressSuggestions: JsonField<Boolean>) = apply {
                this.acceptedAddressSuggestions = acceptedAddressSuggestions
            }

            fun locationId(locationId: String) = locationId(JsonField.of(locationId))

            /**
             * Sets [Builder.locationId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.locationId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun locationId(locationId: JsonField<String>) = apply { this.locationId = locationId }

            fun staticEmergencyAddressId(staticEmergencyAddressId: String) =
                staticEmergencyAddressId(JsonField.of(staticEmergencyAddressId))

            /**
             * Sets [Builder.staticEmergencyAddressId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.staticEmergencyAddressId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun staticEmergencyAddressId(staticEmergencyAddressId: JsonField<String>) = apply {
                this.staticEmergencyAddressId = staticEmergencyAddressId
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
                    acceptedAddressSuggestions,
                    locationId,
                    staticEmergencyAddressId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            acceptedAddressSuggestions()
            locationId()
            staticEmergencyAddressId()
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
            (if (acceptedAddressSuggestions.asKnown().isPresent) 1 else 0) +
                (if (locationId.asKnown().isPresent) 1 else 0) +
                (if (staticEmergencyAddressId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                acceptedAddressSuggestions == other.acceptedAddressSuggestions &&
                locationId == other.locationId &&
                staticEmergencyAddressId == other.staticEmergencyAddressId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                acceptedAddressSuggestions,
                locationId,
                staticEmergencyAddressId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{acceptedAddressSuggestions=$acceptedAddressSuggestions, locationId=$locationId, staticEmergencyAddressId=$staticEmergencyAddressId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalConnectionUpdateLocationResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExternalConnectionUpdateLocationResponse{data=$data, additionalProperties=$additionalProperties}"
}
