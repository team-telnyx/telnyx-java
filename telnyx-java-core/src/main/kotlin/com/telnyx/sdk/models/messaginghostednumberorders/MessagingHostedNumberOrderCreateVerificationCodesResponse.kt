// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messaginghostednumberorders

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.BaseDeserializer
import com.telnyx.sdk.core.BaseSerializer
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.allMaxBy
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class MessagingHostedNumberOrderCreateVerificationCodesResponse
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
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): List<Data> = data.getRequired("data")

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
         * [MessagingHostedNumberOrderCreateVerificationCodesResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MessagingHostedNumberOrderCreateVerificationCodesResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            messagingHostedNumberOrderCreateVerificationCodesResponse:
                MessagingHostedNumberOrderCreateVerificationCodesResponse
        ) = apply {
            data =
                messagingHostedNumberOrderCreateVerificationCodesResponse.data.map {
                    it.toMutableList()
                }
            additionalProperties =
                messagingHostedNumberOrderCreateVerificationCodesResponse.additionalProperties
                    .toMutableMap()
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

        /**
         * Alias for calling [addData] with
         * `Data.ofVerificationCodeSuccess(verificationCodeSuccess)`.
         */
        fun addData(verificationCodeSuccess: Data.VerificationCodeSuccess) =
            addData(Data.ofVerificationCodeSuccess(verificationCodeSuccess))

        /**
         * Alias for calling [addData] with `Data.ofVerificationCodeError(verificationCodeError)`.
         */
        fun addData(verificationCodeError: Data.VerificationCodeError) =
            addData(Data.ofVerificationCodeError(verificationCodeError))

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
         * [MessagingHostedNumberOrderCreateVerificationCodesResponse].
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
        fun build(): MessagingHostedNumberOrderCreateVerificationCodesResponse =
            MessagingHostedNumberOrderCreateVerificationCodesResponse(
                checkRequired("data", data).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MessagingHostedNumberOrderCreateVerificationCodesResponse = apply {
        if (validated) {
            return@apply
        }

        data().forEach { it.validate() }
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

    /** Successful verification code creation response */
    @JsonDeserialize(using = Data.Deserializer::class)
    @JsonSerialize(using = Data.Serializer::class)
    class Data
    private constructor(
        private val verificationCodeSuccess: VerificationCodeSuccess? = null,
        private val verificationCodeError: VerificationCodeError? = null,
        private val _json: JsonValue? = null,
    ) {

        /** Successful verification code creation response */
        fun verificationCodeSuccess(): Optional<VerificationCodeSuccess> =
            Optional.ofNullable(verificationCodeSuccess)

        /** Failed verification code creation response */
        fun verificationCodeError(): Optional<VerificationCodeError> =
            Optional.ofNullable(verificationCodeError)

        fun isVerificationCodeSuccess(): Boolean = verificationCodeSuccess != null

        fun isVerificationCodeError(): Boolean = verificationCodeError != null

        /** Successful verification code creation response */
        fun asVerificationCodeSuccess(): VerificationCodeSuccess =
            verificationCodeSuccess.getOrThrow("verificationCodeSuccess")

        /** Failed verification code creation response */
        fun asVerificationCodeError(): VerificationCodeError =
            verificationCodeError.getOrThrow("verificationCodeError")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                verificationCodeSuccess != null ->
                    visitor.visitVerificationCodeSuccess(verificationCodeSuccess)
                verificationCodeError != null ->
                    visitor.visitVerificationCodeError(verificationCodeError)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitVerificationCodeSuccess(
                        verificationCodeSuccess: VerificationCodeSuccess
                    ) {
                        verificationCodeSuccess.validate()
                    }

                    override fun visitVerificationCodeError(
                        verificationCodeError: VerificationCodeError
                    ) {
                        verificationCodeError.validate()
                    }
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitVerificationCodeSuccess(
                        verificationCodeSuccess: VerificationCodeSuccess
                    ) = verificationCodeSuccess.validity()

                    override fun visitVerificationCodeError(
                        verificationCodeError: VerificationCodeError
                    ) = verificationCodeError.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                verificationCodeSuccess == other.verificationCodeSuccess &&
                verificationCodeError == other.verificationCodeError
        }

        override fun hashCode(): Int = Objects.hash(verificationCodeSuccess, verificationCodeError)

        override fun toString(): String =
            when {
                verificationCodeSuccess != null ->
                    "Data{verificationCodeSuccess=$verificationCodeSuccess}"
                verificationCodeError != null ->
                    "Data{verificationCodeError=$verificationCodeError}"
                _json != null -> "Data{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Data")
            }

        companion object {

            /** Successful verification code creation response */
            @JvmStatic
            fun ofVerificationCodeSuccess(verificationCodeSuccess: VerificationCodeSuccess) =
                Data(verificationCodeSuccess = verificationCodeSuccess)

            /** Failed verification code creation response */
            @JvmStatic
            fun ofVerificationCodeError(verificationCodeError: VerificationCodeError) =
                Data(verificationCodeError = verificationCodeError)
        }

        /** An interface that defines how to map each variant of [Data] to a value of type [T]. */
        interface Visitor<out T> {

            /** Successful verification code creation response */
            fun visitVerificationCodeSuccess(verificationCodeSuccess: VerificationCodeSuccess): T

            /** Failed verification code creation response */
            fun visitVerificationCodeError(verificationCodeError: VerificationCodeError): T

            /**
             * Maps an unknown variant of [Data] to a value of type [T].
             *
             * An instance of [Data] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws TelnyxInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw TelnyxInvalidDataException("Unknown Data: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Data>(Data::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Data {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<VerificationCodeSuccess>())?.let {
                                Data(verificationCodeSuccess = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<VerificationCodeError>())?.let {
                                Data(verificationCodeError = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Data(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Data>(Data::class) {

            override fun serialize(
                value: Data,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.verificationCodeSuccess != null ->
                        generator.writeObject(value.verificationCodeSuccess)
                    value.verificationCodeError != null ->
                        generator.writeObject(value.verificationCodeError)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Data")
                }
            }
        }

        /** Successful verification code creation response */
        class VerificationCodeSuccess
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val phoneNumber: JsonField<String>,
            private val type: JsonField<Type>,
            private val verificationCodeId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("phone_number")
                @ExcludeMissing
                phoneNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                @JsonProperty("verification_code_id")
                @ExcludeMissing
                verificationCodeId: JsonField<String> = JsonMissing.of(),
            ) : this(phoneNumber, type, verificationCodeId, mutableMapOf())

            /**
             * Phone number for which the verification code was created
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun phoneNumber(): String = phoneNumber.getRequired("phone_number")

            /**
             * Type of verification method used
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * Unique identifier for the verification code
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun verificationCodeId(): String =
                verificationCodeId.getRequired("verification_code_id")

            /**
             * Returns the raw JSON value of [phoneNumber].
             *
             * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("phone_number")
            @ExcludeMissing
            fun _phoneNumber(): JsonField<String> = phoneNumber

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            /**
             * Returns the raw JSON value of [verificationCodeId].
             *
             * Unlike [verificationCodeId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("verification_code_id")
            @ExcludeMissing
            fun _verificationCodeId(): JsonField<String> = verificationCodeId

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
                 * [VerificationCodeSuccess].
                 *
                 * The following fields are required:
                 * ```java
                 * .phoneNumber()
                 * .type()
                 * .verificationCodeId()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [VerificationCodeSuccess]. */
            class Builder internal constructor() {

                private var phoneNumber: JsonField<String>? = null
                private var type: JsonField<Type>? = null
                private var verificationCodeId: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(verificationCodeSuccess: VerificationCodeSuccess) = apply {
                    phoneNumber = verificationCodeSuccess.phoneNumber
                    type = verificationCodeSuccess.type
                    verificationCodeId = verificationCodeSuccess.verificationCodeId
                    additionalProperties =
                        verificationCodeSuccess.additionalProperties.toMutableMap()
                }

                /** Phone number for which the verification code was created */
                fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

                /**
                 * Sets [Builder.phoneNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.phoneNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                    this.phoneNumber = phoneNumber
                }

                /** Type of verification method used */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                /** Unique identifier for the verification code */
                fun verificationCodeId(verificationCodeId: String) =
                    verificationCodeId(JsonField.of(verificationCodeId))

                /**
                 * Sets [Builder.verificationCodeId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.verificationCodeId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun verificationCodeId(verificationCodeId: JsonField<String>) = apply {
                    this.verificationCodeId = verificationCodeId
                }

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
                 * Returns an immutable instance of [VerificationCodeSuccess].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .phoneNumber()
                 * .type()
                 * .verificationCodeId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): VerificationCodeSuccess =
                    VerificationCodeSuccess(
                        checkRequired("phoneNumber", phoneNumber),
                        checkRequired("type", type),
                        checkRequired("verificationCodeId", verificationCodeId),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): VerificationCodeSuccess = apply {
                if (validated) {
                    return@apply
                }

                phoneNumber()
                type().validate()
                verificationCodeId()
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
                (if (phoneNumber.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (verificationCodeId.asKnown().isPresent) 1 else 0)

            /** Type of verification method used */
            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val SMS = of("sms")

                    @JvmField val CALL = of("call")

                    @JvmField val FLASHCALL = of("flashcall")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    SMS,
                    CALL,
                    FLASHCALL,
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    SMS,
                    CALL,
                    FLASHCALL,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        SMS -> Value.SMS
                        CALL -> Value.CALL
                        FLASHCALL -> Value.FLASHCALL
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        SMS -> Known.SMS
                        CALL -> Known.CALL
                        FLASHCALL -> Known.FLASHCALL
                        else -> throw TelnyxInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Type = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is VerificationCodeSuccess &&
                    phoneNumber == other.phoneNumber &&
                    type == other.type &&
                    verificationCodeId == other.verificationCodeId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(phoneNumber, type, verificationCodeId, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "VerificationCodeSuccess{phoneNumber=$phoneNumber, type=$type, verificationCodeId=$verificationCodeId, additionalProperties=$additionalProperties}"
        }

        /** Failed verification code creation response */
        class VerificationCodeError
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val error: JsonField<String>,
            private val phoneNumber: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("error") @ExcludeMissing error: JsonField<String> = JsonMissing.of(),
                @JsonProperty("phone_number")
                @ExcludeMissing
                phoneNumber: JsonField<String> = JsonMissing.of(),
            ) : this(error, phoneNumber, mutableMapOf())

            /**
             * Error message describing why the verification code creation failed
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun error(): String = error.getRequired("error")

            /**
             * Phone number for which the verification code creation failed
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun phoneNumber(): String = phoneNumber.getRequired("phone_number")

            /**
             * Returns the raw JSON value of [error].
             *
             * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<String> = error

            /**
             * Returns the raw JSON value of [phoneNumber].
             *
             * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("phone_number")
            @ExcludeMissing
            fun _phoneNumber(): JsonField<String> = phoneNumber

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
                 * [VerificationCodeError].
                 *
                 * The following fields are required:
                 * ```java
                 * .error()
                 * .phoneNumber()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [VerificationCodeError]. */
            class Builder internal constructor() {

                private var error: JsonField<String>? = null
                private var phoneNumber: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(verificationCodeError: VerificationCodeError) = apply {
                    error = verificationCodeError.error
                    phoneNumber = verificationCodeError.phoneNumber
                    additionalProperties = verificationCodeError.additionalProperties.toMutableMap()
                }

                /** Error message describing why the verification code creation failed */
                fun error(error: String) = error(JsonField.of(error))

                /**
                 * Sets [Builder.error] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.error] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun error(error: JsonField<String>) = apply { this.error = error }

                /** Phone number for which the verification code creation failed */
                fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

                /**
                 * Sets [Builder.phoneNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.phoneNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                    this.phoneNumber = phoneNumber
                }

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
                 * Returns an immutable instance of [VerificationCodeError].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .error()
                 * .phoneNumber()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): VerificationCodeError =
                    VerificationCodeError(
                        checkRequired("error", error),
                        checkRequired("phoneNumber", phoneNumber),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): VerificationCodeError = apply {
                if (validated) {
                    return@apply
                }

                error()
                phoneNumber()
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
                (if (error.asKnown().isPresent) 1 else 0) +
                    (if (phoneNumber.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is VerificationCodeError &&
                    error == other.error &&
                    phoneNumber == other.phoneNumber &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(error, phoneNumber, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "VerificationCodeError{error=$error, phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MessagingHostedNumberOrderCreateVerificationCodesResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MessagingHostedNumberOrderCreateVerificationCodesResponse{data=$data, additionalProperties=$additionalProperties}"
}
