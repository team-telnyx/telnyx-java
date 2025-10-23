// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders

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

class PortingOrderRetrieveSubRequestResponse
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
         * [PortingOrderRetrieveSubRequestResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PortingOrderRetrieveSubRequestResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            portingOrderRetrieveSubRequestResponse: PortingOrderRetrieveSubRequestResponse
        ) = apply {
            data = portingOrderRetrieveSubRequestResponse.data
            additionalProperties =
                portingOrderRetrieveSubRequestResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [PortingOrderRetrieveSubRequestResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PortingOrderRetrieveSubRequestResponse =
            PortingOrderRetrieveSubRequestResponse(data, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): PortingOrderRetrieveSubRequestResponse = apply {
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
        private val portRequestId: JsonField<String>,
        private val subRequestId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("port_request_id")
            @ExcludeMissing
            portRequestId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sub_request_id")
            @ExcludeMissing
            subRequestId: JsonField<String> = JsonMissing.of(),
        ) : this(portRequestId, subRequestId, mutableMapOf())

        /**
         * Identifies the Port Request associated with the Porting Order
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun portRequestId(): Optional<String> = portRequestId.getOptional("port_request_id")

        /**
         * Identifies the Sub Request associated with the Porting Order
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun subRequestId(): Optional<String> = subRequestId.getOptional("sub_request_id")

        /**
         * Returns the raw JSON value of [portRequestId].
         *
         * Unlike [portRequestId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("port_request_id")
        @ExcludeMissing
        fun _portRequestId(): JsonField<String> = portRequestId

        /**
         * Returns the raw JSON value of [subRequestId].
         *
         * Unlike [subRequestId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("sub_request_id")
        @ExcludeMissing
        fun _subRequestId(): JsonField<String> = subRequestId

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

            private var portRequestId: JsonField<String> = JsonMissing.of()
            private var subRequestId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                portRequestId = data.portRequestId
                subRequestId = data.subRequestId
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Identifies the Port Request associated with the Porting Order */
            fun portRequestId(portRequestId: String) = portRequestId(JsonField.of(portRequestId))

            /**
             * Sets [Builder.portRequestId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.portRequestId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun portRequestId(portRequestId: JsonField<String>) = apply {
                this.portRequestId = portRequestId
            }

            /** Identifies the Sub Request associated with the Porting Order */
            fun subRequestId(subRequestId: String) = subRequestId(JsonField.of(subRequestId))

            /**
             * Sets [Builder.subRequestId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subRequestId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun subRequestId(subRequestId: JsonField<String>) = apply {
                this.subRequestId = subRequestId
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
                Data(portRequestId, subRequestId, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            portRequestId()
            subRequestId()
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
            (if (portRequestId.asKnown().isPresent) 1 else 0) +
                (if (subRequestId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                portRequestId == other.portRequestId &&
                subRequestId == other.subRequestId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(portRequestId, subRequestId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{portRequestId=$portRequestId, subRequestId=$subRequestId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PortingOrderRetrieveSubRequestResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PortingOrderRetrieveSubRequestResponse{data=$data, additionalProperties=$additionalProperties}"
}
