// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.email.ippools.ips

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class IpCreateResponse
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
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): Data = data.getRequired("data")

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
         * Returns a mutable builder for constructing an instance of [IpCreateResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [IpCreateResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(ipCreateResponse: IpCreateResponse) = apply {
            data = ipCreateResponse.data
            additionalProperties = ipCreateResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [IpCreateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): IpCreateResponse =
            IpCreateResponse(checkRequired("data", data), additionalProperties.toMutableMap())
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
    fun validate(): IpCreateResponse = apply {
        if (validated) {
            return@apply
        }

        data().validate()
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
        private val createdAt: JsonField<OffsetDateTime>,
        private val dedicatedIpId: JsonField<String>,
        private val poolId: JsonField<String>,
        private val weight: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("dedicated_ip_id")
            @ExcludeMissing
            dedicatedIpId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("pool_id") @ExcludeMissing poolId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("weight") @ExcludeMissing weight: JsonField<Long> = JsonMissing.of(),
        ) : this(createdAt, dedicatedIpId, poolId, weight, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dedicatedIpId(): Optional<String> = dedicatedIpId.getOptional("dedicated_ip_id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun poolId(): Optional<String> = poolId.getOptional("pool_id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun weight(): Optional<Long> = weight.getOptional("weight")

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [dedicatedIpId].
         *
         * Unlike [dedicatedIpId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("dedicated_ip_id")
        @ExcludeMissing
        fun _dedicatedIpId(): JsonField<String> = dedicatedIpId

        /**
         * Returns the raw JSON value of [poolId].
         *
         * Unlike [poolId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pool_id") @ExcludeMissing fun _poolId(): JsonField<String> = poolId

        /**
         * Returns the raw JSON value of [weight].
         *
         * Unlike [weight], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("weight") @ExcludeMissing fun _weight(): JsonField<Long> = weight

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

            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var dedicatedIpId: JsonField<String> = JsonMissing.of()
            private var poolId: JsonField<String> = JsonMissing.of()
            private var weight: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                createdAt = data.createdAt
                dedicatedIpId = data.dedicatedIpId
                poolId = data.poolId
                weight = data.weight
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun dedicatedIpId(dedicatedIpId: String) = dedicatedIpId(JsonField.of(dedicatedIpId))

            /**
             * Sets [Builder.dedicatedIpId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dedicatedIpId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dedicatedIpId(dedicatedIpId: JsonField<String>) = apply {
                this.dedicatedIpId = dedicatedIpId
            }

            fun poolId(poolId: String) = poolId(JsonField.of(poolId))

            /**
             * Sets [Builder.poolId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.poolId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun poolId(poolId: JsonField<String>) = apply { this.poolId = poolId }

            fun weight(weight: Long) = weight(JsonField.of(weight))

            /**
             * Sets [Builder.weight] to an arbitrary JSON value.
             *
             * You should usually call [Builder.weight] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun weight(weight: JsonField<Long>) = apply { this.weight = weight }

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
                Data(createdAt, dedicatedIpId, poolId, weight, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            createdAt()
            dedicatedIpId()
            poolId()
            weight()
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
            (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (dedicatedIpId.asKnown().isPresent) 1 else 0) +
                (if (poolId.asKnown().isPresent) 1 else 0) +
                (if (weight.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                createdAt == other.createdAt &&
                dedicatedIpId == other.dedicatedIpId &&
                poolId == other.poolId &&
                weight == other.weight &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(createdAt, dedicatedIpId, poolId, weight, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{createdAt=$createdAt, dedicatedIpId=$dedicatedIpId, poolId=$poolId, weight=$weight, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IpCreateResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "IpCreateResponse{data=$data, additionalProperties=$additionalProperties}"
}
