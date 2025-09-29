// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.list

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
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ListRetrieveByZoneResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<List<Data>>,
    private val meta: JsonField<PaginationMeta>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<List<Data>> = JsonMissing.of(),
        @JsonProperty("meta") @ExcludeMissing meta: JsonField<PaginationMeta> = JsonMissing.of(),
    ) : this(data, meta, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): Optional<List<Data>> = data.getOptional("data")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun meta(): Optional<PaginationMeta> = meta.getOptional("meta")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Data>> = data

    /**
     * Returns the raw JSON value of [meta].
     *
     * Unlike [meta], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("meta") @ExcludeMissing fun _meta(): JsonField<PaginationMeta> = meta

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
         * Returns a mutable builder for constructing an instance of [ListRetrieveByZoneResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ListRetrieveByZoneResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var meta: JsonField<PaginationMeta> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(listRetrieveByZoneResponse: ListRetrieveByZoneResponse) = apply {
            data = listRetrieveByZoneResponse.data.map { it.toMutableList() }
            meta = listRetrieveByZoneResponse.meta
            additionalProperties = listRetrieveByZoneResponse.additionalProperties.toMutableMap()
        }

        fun data(data: List<Data>) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed `List<Data>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<List<Data>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        /**
         * Adds a single [Data] to [Builder.data].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addData(data: Data) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).also {
                    checkKnown("data", it).add(data)
                }
        }

        fun meta(meta: PaginationMeta) = meta(JsonField.of(meta))

        /**
         * Sets [Builder.meta] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meta] with a well-typed [PaginationMeta] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun meta(meta: JsonField<PaginationMeta>) = apply { this.meta = meta }

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
         * Returns an immutable instance of [ListRetrieveByZoneResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ListRetrieveByZoneResponse =
            ListRetrieveByZoneResponse(
                (data ?: JsonMissing.of()).map { it.toImmutable() },
                meta,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ListRetrieveByZoneResponse = apply {
        if (validated) {
            return@apply
        }

        data().ifPresent { it.forEach { it.validate() } }
        meta().ifPresent { it.validate() }
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
        (data.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (meta.asKnown().getOrNull()?.validity() ?: 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val numberOfChannels: JsonField<Long>,
        private val numbers: JsonField<List<Number>>,
        private val zoneId: JsonField<String>,
        private val zoneName: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("number_of_channels")
            @ExcludeMissing
            numberOfChannels: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("numbers")
            @ExcludeMissing
            numbers: JsonField<List<Number>> = JsonMissing.of(),
            @JsonProperty("zone_id") @ExcludeMissing zoneId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("zone_name")
            @ExcludeMissing
            zoneName: JsonField<String> = JsonMissing.of(),
        ) : this(numberOfChannels, numbers, zoneId, zoneName, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun numberOfChannels(): Optional<Long> = numberOfChannels.getOptional("number_of_channels")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun numbers(): Optional<List<Number>> = numbers.getOptional("numbers")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun zoneId(): Optional<String> = zoneId.getOptional("zone_id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun zoneName(): Optional<String> = zoneName.getOptional("zone_name")

        /**
         * Returns the raw JSON value of [numberOfChannels].
         *
         * Unlike [numberOfChannels], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("number_of_channels")
        @ExcludeMissing
        fun _numberOfChannels(): JsonField<Long> = numberOfChannels

        /**
         * Returns the raw JSON value of [numbers].
         *
         * Unlike [numbers], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("numbers") @ExcludeMissing fun _numbers(): JsonField<List<Number>> = numbers

        /**
         * Returns the raw JSON value of [zoneId].
         *
         * Unlike [zoneId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("zone_id") @ExcludeMissing fun _zoneId(): JsonField<String> = zoneId

        /**
         * Returns the raw JSON value of [zoneName].
         *
         * Unlike [zoneName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("zone_name") @ExcludeMissing fun _zoneName(): JsonField<String> = zoneName

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

            private var numberOfChannels: JsonField<Long> = JsonMissing.of()
            private var numbers: JsonField<MutableList<Number>>? = null
            private var zoneId: JsonField<String> = JsonMissing.of()
            private var zoneName: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                numberOfChannels = data.numberOfChannels
                numbers = data.numbers.map { it.toMutableList() }
                zoneId = data.zoneId
                zoneName = data.zoneName
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun numberOfChannels(numberOfChannels: Long) =
                numberOfChannels(JsonField.of(numberOfChannels))

            /**
             * Sets [Builder.numberOfChannels] to an arbitrary JSON value.
             *
             * You should usually call [Builder.numberOfChannels] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun numberOfChannels(numberOfChannels: JsonField<Long>) = apply {
                this.numberOfChannels = numberOfChannels
            }

            fun numbers(numbers: List<Number>) = numbers(JsonField.of(numbers))

            /**
             * Sets [Builder.numbers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.numbers] with a well-typed `List<Number>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun numbers(numbers: JsonField<List<Number>>) = apply {
                this.numbers = numbers.map { it.toMutableList() }
            }

            /**
             * Adds a single [Number] to [numbers].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addNumber(number: Number) = apply {
                numbers =
                    (numbers ?: JsonField.of(mutableListOf())).also {
                        checkKnown("numbers", it).add(number)
                    }
            }

            fun zoneId(zoneId: String) = zoneId(JsonField.of(zoneId))

            /**
             * Sets [Builder.zoneId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.zoneId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun zoneId(zoneId: JsonField<String>) = apply { this.zoneId = zoneId }

            fun zoneName(zoneName: String) = zoneName(JsonField.of(zoneName))

            /**
             * Sets [Builder.zoneName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.zoneName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun zoneName(zoneName: JsonField<String>) = apply { this.zoneName = zoneName }

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
                    numberOfChannels,
                    (numbers ?: JsonMissing.of()).map { it.toImmutable() },
                    zoneId,
                    zoneName,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            numberOfChannels()
            numbers().ifPresent { it.forEach { it.validate() } }
            zoneId()
            zoneName()
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
            (if (numberOfChannels.asKnown().isPresent) 1 else 0) +
                (numbers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (zoneId.asKnown().isPresent) 1 else 0) +
                (if (zoneName.asKnown().isPresent) 1 else 0)

        class Number
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val country: JsonField<String>,
            private val number: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("country")
                @ExcludeMissing
                country: JsonField<String> = JsonMissing.of(),
                @JsonProperty("number") @ExcludeMissing number: JsonField<String> = JsonMissing.of(),
            ) : this(country, number, mutableMapOf())

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun country(): Optional<String> = country.getOptional("country")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun number(): Optional<String> = number.getOptional("number")

            /**
             * Returns the raw JSON value of [country].
             *
             * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

            /**
             * Returns the raw JSON value of [number].
             *
             * Unlike [number], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("number") @ExcludeMissing fun _number(): JsonField<String> = number

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

                /** Returns a mutable builder for constructing an instance of [Number]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Number]. */
            class Builder internal constructor() {

                private var country: JsonField<String> = JsonMissing.of()
                private var number: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(number: Number) = apply {
                    country = number.country
                    this.number = number.number
                    additionalProperties = number.additionalProperties.toMutableMap()
                }

                fun country(country: String) = country(JsonField.of(country))

                /**
                 * Sets [Builder.country] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.country] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun country(country: JsonField<String>) = apply { this.country = country }

                fun number(number: String) = number(JsonField.of(number))

                /**
                 * Sets [Builder.number] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.number] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun number(number: JsonField<String>) = apply { this.number = number }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Number].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Number = Number(country, number, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Number = apply {
                if (validated) {
                    return@apply
                }

                country()
                number()
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
                (if (country.asKnown().isPresent) 1 else 0) +
                    (if (number.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Number &&
                    country == other.country &&
                    number == other.number &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(country, number, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Number{country=$country, number=$number, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                numberOfChannels == other.numberOfChannels &&
                numbers == other.numbers &&
                zoneId == other.zoneId &&
                zoneName == other.zoneName &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(numberOfChannels, numbers, zoneId, zoneName, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{numberOfChannels=$numberOfChannels, numbers=$numbers, zoneId=$zoneId, zoneName=$zoneName, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ListRetrieveByZoneResponse &&
            data == other.data &&
            meta == other.meta &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, meta, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ListRetrieveByZoneResponse{data=$data, meta=$meta, additionalProperties=$additionalProperties}"
}
