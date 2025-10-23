// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.simcards.actions

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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ActionValidateRegistrationCodesResponse
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
         * Returns a mutable builder for constructing an instance of
         * [ActionValidateRegistrationCodesResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ActionValidateRegistrationCodesResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            actionValidateRegistrationCodesResponse: ActionValidateRegistrationCodesResponse
        ) = apply {
            data = actionValidateRegistrationCodesResponse.data.map { it.toMutableList() }
            additionalProperties =
                actionValidateRegistrationCodesResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [ActionValidateRegistrationCodesResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ActionValidateRegistrationCodesResponse =
            ActionValidateRegistrationCodesResponse(
                (data ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ActionValidateRegistrationCodesResponse = apply {
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
        private val invalidDetail: JsonField<String>,
        private val recordType: JsonField<String>,
        private val registrationCode: JsonField<String>,
        private val valid: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("invalid_detail")
            @ExcludeMissing
            invalidDetail: JsonField<String> = JsonMissing.of(),
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("registration_code")
            @ExcludeMissing
            registrationCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("valid") @ExcludeMissing valid: JsonField<Boolean> = JsonMissing.of(),
        ) : this(invalidDetail, recordType, registrationCode, valid, mutableMapOf())

        /**
         * The validation message
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun invalidDetail(): Optional<String> = invalidDetail.getOptional("invalid_detail")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordType(): Optional<String> = recordType.getOptional("record_type")

        /**
         * The 10-digit SIM card registration code
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun registrationCode(): Optional<String> = registrationCode.getOptional("registration_code")

        /**
         * The attribute that denotes whether the code is valid or not
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun valid(): Optional<Boolean> = valid.getOptional("valid")

        /**
         * Returns the raw JSON value of [invalidDetail].
         *
         * Unlike [invalidDetail], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("invalid_detail")
        @ExcludeMissing
        fun _invalidDetail(): JsonField<String> = invalidDetail

        /**
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<String> = recordType

        /**
         * Returns the raw JSON value of [registrationCode].
         *
         * Unlike [registrationCode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("registration_code")
        @ExcludeMissing
        fun _registrationCode(): JsonField<String> = registrationCode

        /**
         * Returns the raw JSON value of [valid].
         *
         * Unlike [valid], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("valid") @ExcludeMissing fun _valid(): JsonField<Boolean> = valid

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

            private var invalidDetail: JsonField<String> = JsonMissing.of()
            private var recordType: JsonField<String> = JsonMissing.of()
            private var registrationCode: JsonField<String> = JsonMissing.of()
            private var valid: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                invalidDetail = data.invalidDetail
                recordType = data.recordType
                registrationCode = data.registrationCode
                valid = data.valid
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** The validation message */
            fun invalidDetail(invalidDetail: String?) =
                invalidDetail(JsonField.ofNullable(invalidDetail))

            /** Alias for calling [Builder.invalidDetail] with `invalidDetail.orElse(null)`. */
            fun invalidDetail(invalidDetail: Optional<String>) =
                invalidDetail(invalidDetail.getOrNull())

            /**
             * Sets [Builder.invalidDetail] to an arbitrary JSON value.
             *
             * You should usually call [Builder.invalidDetail] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun invalidDetail(invalidDetail: JsonField<String>) = apply {
                this.invalidDetail = invalidDetail
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

            /** The 10-digit SIM card registration code */
            fun registrationCode(registrationCode: String) =
                registrationCode(JsonField.of(registrationCode))

            /**
             * Sets [Builder.registrationCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.registrationCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun registrationCode(registrationCode: JsonField<String>) = apply {
                this.registrationCode = registrationCode
            }

            /** The attribute that denotes whether the code is valid or not */
            fun valid(valid: Boolean) = valid(JsonField.of(valid))

            /**
             * Sets [Builder.valid] to an arbitrary JSON value.
             *
             * You should usually call [Builder.valid] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun valid(valid: JsonField<Boolean>) = apply { this.valid = valid }

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
                    invalidDetail,
                    recordType,
                    registrationCode,
                    valid,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            invalidDetail()
            recordType()
            registrationCode()
            valid()
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
            (if (invalidDetail.asKnown().isPresent) 1 else 0) +
                (if (recordType.asKnown().isPresent) 1 else 0) +
                (if (registrationCode.asKnown().isPresent) 1 else 0) +
                (if (valid.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                invalidDetail == other.invalidDetail &&
                recordType == other.recordType &&
                registrationCode == other.registrationCode &&
                valid == other.valid &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(invalidDetail, recordType, registrationCode, valid, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{invalidDetail=$invalidDetail, recordType=$recordType, registrationCode=$registrationCode, valid=$valid, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ActionValidateRegistrationCodesResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ActionValidateRegistrationCodesResponse{data=$data, additionalProperties=$additionalProperties}"
}
