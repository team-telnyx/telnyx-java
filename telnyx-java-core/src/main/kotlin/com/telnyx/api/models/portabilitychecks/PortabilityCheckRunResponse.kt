// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.portabilitychecks

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

class PortabilityCheckRunResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<List<Data>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<List<Data>> = JsonMissing.of()
    ) : this(data, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): Optional<List<Data>> = data.getOptional("data")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Data>> = data

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
         * Returns a mutable builder for constructing an instance of [PortabilityCheckRunResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PortabilityCheckRunResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(portabilityCheckRunResponse: PortabilityCheckRunResponse) = apply {
            data = portabilityCheckRunResponse.data.map { it.toMutableList() }
            additionalProperties = portabilityCheckRunResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [PortabilityCheckRunResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PortabilityCheckRunResponse =
            PortabilityCheckRunResponse(
                (data ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PortabilityCheckRunResponse = apply {
        if (validated) {
            return@apply
        }

        data().ifPresent { it.forEach { it.validate() } }
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
        (data.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val fastPortable: JsonField<Boolean>,
        private val notPortableReason: JsonField<String>,
        private val phoneNumber: JsonField<String>,
        private val portable: JsonField<Boolean>,
        private val recordType: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("fast_portable")
            @ExcludeMissing
            fastPortable: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("not_portable_reason")
            @ExcludeMissing
            notPortableReason: JsonField<String> = JsonMissing.of(),
            @JsonProperty("phone_number")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("portable")
            @ExcludeMissing
            portable: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<String> = JsonMissing.of(),
        ) : this(fastPortable, notPortableReason, phoneNumber, portable, recordType, mutableMapOf())

        /**
         * Indicates whether this phone number is FastPort eligible
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun fastPortable(): Optional<Boolean> = fastPortable.getOptional("fast_portable")

        /**
         * If this phone number is not portable, explains why. Empty string if the number is
         * portable.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun notPortableReason(): Optional<String> =
            notPortableReason.getOptional("not_portable_reason")

        /**
         * The +E.164 formatted phone number this result is about
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phone_number")

        /**
         * Indicates whether this phone number is portable
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun portable(): Optional<Boolean> = portable.getOptional("portable")

        /**
         * Identifies the type of the resource.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordType(): Optional<String> = recordType.getOptional("record_type")

        /**
         * Returns the raw JSON value of [fastPortable].
         *
         * Unlike [fastPortable], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("fast_portable")
        @ExcludeMissing
        fun _fastPortable(): JsonField<Boolean> = fastPortable

        /**
         * Returns the raw JSON value of [notPortableReason].
         *
         * Unlike [notPortableReason], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("not_portable_reason")
        @ExcludeMissing
        fun _notPortableReason(): JsonField<String> = notPortableReason

        /**
         * Returns the raw JSON value of [phoneNumber].
         *
         * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phone_number")
        @ExcludeMissing
        fun _phoneNumber(): JsonField<String> = phoneNumber

        /**
         * Returns the raw JSON value of [portable].
         *
         * Unlike [portable], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("portable") @ExcludeMissing fun _portable(): JsonField<Boolean> = portable

        /**
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<String> = recordType

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

            private var fastPortable: JsonField<Boolean> = JsonMissing.of()
            private var notPortableReason: JsonField<String> = JsonMissing.of()
            private var phoneNumber: JsonField<String> = JsonMissing.of()
            private var portable: JsonField<Boolean> = JsonMissing.of()
            private var recordType: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                fastPortable = data.fastPortable
                notPortableReason = data.notPortableReason
                phoneNumber = data.phoneNumber
                portable = data.portable
                recordType = data.recordType
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Indicates whether this phone number is FastPort eligible */
            fun fastPortable(fastPortable: Boolean) = fastPortable(JsonField.of(fastPortable))

            /**
             * Sets [Builder.fastPortable] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fastPortable] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fastPortable(fastPortable: JsonField<Boolean>) = apply {
                this.fastPortable = fastPortable
            }

            /**
             * If this phone number is not portable, explains why. Empty string if the number is
             * portable.
             */
            fun notPortableReason(notPortableReason: String) =
                notPortableReason(JsonField.of(notPortableReason))

            /**
             * Sets [Builder.notPortableReason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.notPortableReason] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun notPortableReason(notPortableReason: JsonField<String>) = apply {
                this.notPortableReason = notPortableReason
            }

            /** The +E.164 formatted phone number this result is about */
            fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

            /**
             * Sets [Builder.phoneNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                this.phoneNumber = phoneNumber
            }

            /** Indicates whether this phone number is portable */
            fun portable(portable: Boolean) = portable(JsonField.of(portable))

            /**
             * Sets [Builder.portable] to an arbitrary JSON value.
             *
             * You should usually call [Builder.portable] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun portable(portable: JsonField<Boolean>) = apply { this.portable = portable }

            /** Identifies the type of the resource. */
            fun recordType(recordType: String) = recordType(JsonField.of(recordType))

            /**
             * Sets [Builder.recordType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

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
                    fastPortable,
                    notPortableReason,
                    phoneNumber,
                    portable,
                    recordType,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            fastPortable()
            notPortableReason()
            phoneNumber()
            portable()
            recordType()
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
            (if (fastPortable.asKnown().isPresent) 1 else 0) +
                (if (notPortableReason.asKnown().isPresent) 1 else 0) +
                (if (phoneNumber.asKnown().isPresent) 1 else 0) +
                (if (portable.asKnown().isPresent) 1 else 0) +
                (if (recordType.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                fastPortable == other.fastPortable &&
                notPortableReason == other.notPortableReason &&
                phoneNumber == other.phoneNumber &&
                portable == other.portable &&
                recordType == other.recordType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                fastPortable,
                notPortableReason,
                phoneNumber,
                portable,
                recordType,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{fastPortable=$fastPortable, notPortableReason=$notPortableReason, phoneNumber=$phoneNumber, portable=$portable, recordType=$recordType, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PortabilityCheckRunResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PortabilityCheckRunResponse{data=$data, additionalProperties=$additionalProperties}"
}
