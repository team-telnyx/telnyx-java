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
import kotlin.jvm.optionals.getOrNull

class UploadPendingCountResponse
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
         * Returns a mutable builder for constructing an instance of [UploadPendingCountResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UploadPendingCountResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(uploadPendingCountResponse: UploadPendingCountResponse) = apply {
            data = uploadPendingCountResponse.data
            additionalProperties = uploadPendingCountResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [UploadPendingCountResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): UploadPendingCountResponse =
            UploadPendingCountResponse(data, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): UploadPendingCountResponse = apply {
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
        private val pendingNumbersCount: JsonField<Long>,
        private val pendingOrdersCount: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("pending_numbers_count")
            @ExcludeMissing
            pendingNumbersCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("pending_orders_count")
            @ExcludeMissing
            pendingOrdersCount: JsonField<Long> = JsonMissing.of(),
        ) : this(pendingNumbersCount, pendingOrdersCount, mutableMapOf())

        /**
         * The count of phone numbers that are pending assignment to the external connection.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pendingNumbersCount(): Optional<Long> =
            pendingNumbersCount.getOptional("pending_numbers_count")

        /**
         * The count of number uploads that have not yet been uploaded to Microsoft.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pendingOrdersCount(): Optional<Long> =
            pendingOrdersCount.getOptional("pending_orders_count")

        /**
         * Returns the raw JSON value of [pendingNumbersCount].
         *
         * Unlike [pendingNumbersCount], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("pending_numbers_count")
        @ExcludeMissing
        fun _pendingNumbersCount(): JsonField<Long> = pendingNumbersCount

        /**
         * Returns the raw JSON value of [pendingOrdersCount].
         *
         * Unlike [pendingOrdersCount], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("pending_orders_count")
        @ExcludeMissing
        fun _pendingOrdersCount(): JsonField<Long> = pendingOrdersCount

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

            private var pendingNumbersCount: JsonField<Long> = JsonMissing.of()
            private var pendingOrdersCount: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                pendingNumbersCount = data.pendingNumbersCount
                pendingOrdersCount = data.pendingOrdersCount
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /**
             * The count of phone numbers that are pending assignment to the external connection.
             */
            fun pendingNumbersCount(pendingNumbersCount: Long) =
                pendingNumbersCount(JsonField.of(pendingNumbersCount))

            /**
             * Sets [Builder.pendingNumbersCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pendingNumbersCount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pendingNumbersCount(pendingNumbersCount: JsonField<Long>) = apply {
                this.pendingNumbersCount = pendingNumbersCount
            }

            /** The count of number uploads that have not yet been uploaded to Microsoft. */
            fun pendingOrdersCount(pendingOrdersCount: Long) =
                pendingOrdersCount(JsonField.of(pendingOrdersCount))

            /**
             * Sets [Builder.pendingOrdersCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pendingOrdersCount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pendingOrdersCount(pendingOrdersCount: JsonField<Long>) = apply {
                this.pendingOrdersCount = pendingOrdersCount
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
                Data(pendingNumbersCount, pendingOrdersCount, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            pendingNumbersCount()
            pendingOrdersCount()
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
            (if (pendingNumbersCount.asKnown().isPresent) 1 else 0) +
                (if (pendingOrdersCount.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                pendingNumbersCount == other.pendingNumbersCount &&
                pendingOrdersCount == other.pendingOrdersCount &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(pendingNumbersCount, pendingOrdersCount, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{pendingNumbersCount=$pendingNumbersCount, pendingOrdersCount=$pendingOrdersCount, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UploadPendingCountResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UploadPendingCountResponse{data=$data, additionalProperties=$additionalProperties}"
}
