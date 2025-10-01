// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.simcards

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

class SimCardGetDeviceDetailsResponse
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
         * [SimCardGetDeviceDetailsResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SimCardGetDeviceDetailsResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(simCardGetDeviceDetailsResponse: SimCardGetDeviceDetailsResponse) =
            apply {
                data = simCardGetDeviceDetailsResponse.data
                additionalProperties =
                    simCardGetDeviceDetailsResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [SimCardGetDeviceDetailsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SimCardGetDeviceDetailsResponse =
            SimCardGetDeviceDetailsResponse(data, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): SimCardGetDeviceDetailsResponse = apply {
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
        private val brandName: JsonField<String>,
        private val deviceType: JsonField<String>,
        private val imei: JsonField<String>,
        private val modelName: JsonField<String>,
        private val operatingSystem: JsonField<String>,
        private val recordType: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("brand_name")
            @ExcludeMissing
            brandName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("device_type")
            @ExcludeMissing
            deviceType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("imei") @ExcludeMissing imei: JsonField<String> = JsonMissing.of(),
            @JsonProperty("model_name")
            @ExcludeMissing
            modelName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("operating_system")
            @ExcludeMissing
            operatingSystem: JsonField<String> = JsonMissing.of(),
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<String> = JsonMissing.of(),
        ) : this(
            brandName,
            deviceType,
            imei,
            modelName,
            operatingSystem,
            recordType,
            mutableMapOf(),
        )

        /**
         * Brand of the device where the SIM card is being used in.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun brandName(): Optional<String> = brandName.getOptional("brand_name")

        /**
         * Type of the device where the SIM card is being used in.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun deviceType(): Optional<String> = deviceType.getOptional("device_type")

        /**
         * IMEI of the device where the SIM card is being used in.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun imei(): Optional<String> = imei.getOptional("imei")

        /**
         * Brand of the device where the SIM card is being used in.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun modelName(): Optional<String> = modelName.getOptional("model_name")

        /**
         * Operating system of the device where the SIM card is being used in.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun operatingSystem(): Optional<String> = operatingSystem.getOptional("operating_system")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordType(): Optional<String> = recordType.getOptional("record_type")

        /**
         * Returns the raw JSON value of [brandName].
         *
         * Unlike [brandName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("brand_name") @ExcludeMissing fun _brandName(): JsonField<String> = brandName

        /**
         * Returns the raw JSON value of [deviceType].
         *
         * Unlike [deviceType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("device_type")
        @ExcludeMissing
        fun _deviceType(): JsonField<String> = deviceType

        /**
         * Returns the raw JSON value of [imei].
         *
         * Unlike [imei], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("imei") @ExcludeMissing fun _imei(): JsonField<String> = imei

        /**
         * Returns the raw JSON value of [modelName].
         *
         * Unlike [modelName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model_name") @ExcludeMissing fun _modelName(): JsonField<String> = modelName

        /**
         * Returns the raw JSON value of [operatingSystem].
         *
         * Unlike [operatingSystem], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("operating_system")
        @ExcludeMissing
        fun _operatingSystem(): JsonField<String> = operatingSystem

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

            private var brandName: JsonField<String> = JsonMissing.of()
            private var deviceType: JsonField<String> = JsonMissing.of()
            private var imei: JsonField<String> = JsonMissing.of()
            private var modelName: JsonField<String> = JsonMissing.of()
            private var operatingSystem: JsonField<String> = JsonMissing.of()
            private var recordType: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                brandName = data.brandName
                deviceType = data.deviceType
                imei = data.imei
                modelName = data.modelName
                operatingSystem = data.operatingSystem
                recordType = data.recordType
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Brand of the device where the SIM card is being used in. */
            fun brandName(brandName: String) = brandName(JsonField.of(brandName))

            /**
             * Sets [Builder.brandName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.brandName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun brandName(brandName: JsonField<String>) = apply { this.brandName = brandName }

            /** Type of the device where the SIM card is being used in. */
            fun deviceType(deviceType: String) = deviceType(JsonField.of(deviceType))

            /**
             * Sets [Builder.deviceType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deviceType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun deviceType(deviceType: JsonField<String>) = apply { this.deviceType = deviceType }

            /** IMEI of the device where the SIM card is being used in. */
            fun imei(imei: String) = imei(JsonField.of(imei))

            /**
             * Sets [Builder.imei] to an arbitrary JSON value.
             *
             * You should usually call [Builder.imei] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun imei(imei: JsonField<String>) = apply { this.imei = imei }

            /** Brand of the device where the SIM card is being used in. */
            fun modelName(modelName: String) = modelName(JsonField.of(modelName))

            /**
             * Sets [Builder.modelName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.modelName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun modelName(modelName: JsonField<String>) = apply { this.modelName = modelName }

            /** Operating system of the device where the SIM card is being used in. */
            fun operatingSystem(operatingSystem: String) =
                operatingSystem(JsonField.of(operatingSystem))

            /**
             * Sets [Builder.operatingSystem] to an arbitrary JSON value.
             *
             * You should usually call [Builder.operatingSystem] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun operatingSystem(operatingSystem: JsonField<String>) = apply {
                this.operatingSystem = operatingSystem
            }

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
                    brandName,
                    deviceType,
                    imei,
                    modelName,
                    operatingSystem,
                    recordType,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            brandName()
            deviceType()
            imei()
            modelName()
            operatingSystem()
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
            (if (brandName.asKnown().isPresent) 1 else 0) +
                (if (deviceType.asKnown().isPresent) 1 else 0) +
                (if (imei.asKnown().isPresent) 1 else 0) +
                (if (modelName.asKnown().isPresent) 1 else 0) +
                (if (operatingSystem.asKnown().isPresent) 1 else 0) +
                (if (recordType.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                brandName == other.brandName &&
                deviceType == other.deviceType &&
                imei == other.imei &&
                modelName == other.modelName &&
                operatingSystem == other.operatingSystem &&
                recordType == other.recordType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                brandName,
                deviceType,
                imei,
                modelName,
                operatingSystem,
                recordType,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{brandName=$brandName, deviceType=$deviceType, imei=$imei, modelName=$modelName, operatingSystem=$operatingSystem, recordType=$recordType, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SimCardGetDeviceDetailsResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SimCardGetDeviceDetailsResponse{data=$data, additionalProperties=$additionalProperties}"
}
