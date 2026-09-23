// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.botchallenge

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class BotChallengeCreateResponse
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
         * Returns a mutable builder for constructing an instance of [BotChallengeCreateResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BotChallengeCreateResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(botChallengeCreateResponse: BotChallengeCreateResponse) = apply {
            data = botChallengeCreateResponse.data
            additionalProperties = botChallengeCreateResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [BotChallengeCreateResponse].
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
        fun build(): BotChallengeCreateResponse =
            BotChallengeCreateResponse(
                checkRequired("data", data),
                additionalProperties.toMutableMap(),
            )
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
    fun validate(): BotChallengeCreateResponse = apply {
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
        private val challengeType: JsonField<ChallengeType>,
        private val nonce: JsonField<String>,
        private val privacyPolicyUrl: JsonField<String>,
        private val problem: JsonField<String>,
        private val termsAndConditionsUrl: JsonField<String>,
        private val precision: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("challenge_type")
            @ExcludeMissing
            challengeType: JsonField<ChallengeType> = JsonMissing.of(),
            @JsonProperty("nonce") @ExcludeMissing nonce: JsonField<String> = JsonMissing.of(),
            @JsonProperty("privacy_policy_url")
            @ExcludeMissing
            privacyPolicyUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("problem") @ExcludeMissing problem: JsonField<String> = JsonMissing.of(),
            @JsonProperty("terms_and_conditions_url")
            @ExcludeMissing
            termsAndConditionsUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("precision") @ExcludeMissing precision: JsonField<Long> = JsonMissing.of(),
        ) : this(
            challengeType,
            nonce,
            privacyPolicyUrl,
            problem,
            termsAndConditionsUrl,
            precision,
            mutableMapOf(),
        )

        /**
         * Type of challenge.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun challengeType(): ChallengeType = challengeType.getRequired("challenge_type")

        /**
         * Single-use challenge identifier. Submit it as `bot_challenge_nonce` on the signup
         * request.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun nonce(): String = nonce.getRequired("nonce")

        /**
         * Current privacy-policy URL. Echo this back on the signup request.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun privacyPolicyUrl(): String = privacyPolicyUrl.getRequired("privacy_policy_url")

        /**
         * Problem text to solve. Math problems are obfuscated and end with an unobfuscated rounding
         * instruction; string and binary problems are returned as-is.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun problem(): String = problem.getRequired("problem")

        /**
         * Current terms-and-conditions URL. Echo this back on the signup request.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun termsAndConditionsUrl(): String =
            termsAndConditionsUrl.getRequired("terms_and_conditions_url")

        /**
         * Decimal places expected in the answer. Present only for math challenges.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun precision(): Optional<Long> = precision.getOptional("precision")

        /**
         * Returns the raw JSON value of [challengeType].
         *
         * Unlike [challengeType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("challenge_type")
        @ExcludeMissing
        fun _challengeType(): JsonField<ChallengeType> = challengeType

        /**
         * Returns the raw JSON value of [nonce].
         *
         * Unlike [nonce], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("nonce") @ExcludeMissing fun _nonce(): JsonField<String> = nonce

        /**
         * Returns the raw JSON value of [privacyPolicyUrl].
         *
         * Unlike [privacyPolicyUrl], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("privacy_policy_url")
        @ExcludeMissing
        fun _privacyPolicyUrl(): JsonField<String> = privacyPolicyUrl

        /**
         * Returns the raw JSON value of [problem].
         *
         * Unlike [problem], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("problem") @ExcludeMissing fun _problem(): JsonField<String> = problem

        /**
         * Returns the raw JSON value of [termsAndConditionsUrl].
         *
         * Unlike [termsAndConditionsUrl], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("terms_and_conditions_url")
        @ExcludeMissing
        fun _termsAndConditionsUrl(): JsonField<String> = termsAndConditionsUrl

        /**
         * Returns the raw JSON value of [precision].
         *
         * Unlike [precision], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("precision") @ExcludeMissing fun _precision(): JsonField<Long> = precision

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
             * Returns a mutable builder for constructing an instance of [Data].
             *
             * The following fields are required:
             * ```java
             * .challengeType()
             * .nonce()
             * .privacyPolicyUrl()
             * .problem()
             * .termsAndConditionsUrl()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var challengeType: JsonField<ChallengeType>? = null
            private var nonce: JsonField<String>? = null
            private var privacyPolicyUrl: JsonField<String>? = null
            private var problem: JsonField<String>? = null
            private var termsAndConditionsUrl: JsonField<String>? = null
            private var precision: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                challengeType = data.challengeType
                nonce = data.nonce
                privacyPolicyUrl = data.privacyPolicyUrl
                problem = data.problem
                termsAndConditionsUrl = data.termsAndConditionsUrl
                precision = data.precision
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Type of challenge. */
            fun challengeType(challengeType: ChallengeType) =
                challengeType(JsonField.of(challengeType))

            /**
             * Sets [Builder.challengeType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.challengeType] with a well-typed [ChallengeType]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun challengeType(challengeType: JsonField<ChallengeType>) = apply {
                this.challengeType = challengeType
            }

            /**
             * Single-use challenge identifier. Submit it as `bot_challenge_nonce` on the signup
             * request.
             */
            fun nonce(nonce: String) = nonce(JsonField.of(nonce))

            /**
             * Sets [Builder.nonce] to an arbitrary JSON value.
             *
             * You should usually call [Builder.nonce] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun nonce(nonce: JsonField<String>) = apply { this.nonce = nonce }

            /** Current privacy-policy URL. Echo this back on the signup request. */
            fun privacyPolicyUrl(privacyPolicyUrl: String) =
                privacyPolicyUrl(JsonField.of(privacyPolicyUrl))

            /**
             * Sets [Builder.privacyPolicyUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.privacyPolicyUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun privacyPolicyUrl(privacyPolicyUrl: JsonField<String>) = apply {
                this.privacyPolicyUrl = privacyPolicyUrl
            }

            /**
             * Problem text to solve. Math problems are obfuscated and end with an unobfuscated
             * rounding instruction; string and binary problems are returned as-is.
             */
            fun problem(problem: String) = problem(JsonField.of(problem))

            /**
             * Sets [Builder.problem] to an arbitrary JSON value.
             *
             * You should usually call [Builder.problem] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun problem(problem: JsonField<String>) = apply { this.problem = problem }

            /** Current terms-and-conditions URL. Echo this back on the signup request. */
            fun termsAndConditionsUrl(termsAndConditionsUrl: String) =
                termsAndConditionsUrl(JsonField.of(termsAndConditionsUrl))

            /**
             * Sets [Builder.termsAndConditionsUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.termsAndConditionsUrl] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun termsAndConditionsUrl(termsAndConditionsUrl: JsonField<String>) = apply {
                this.termsAndConditionsUrl = termsAndConditionsUrl
            }

            /** Decimal places expected in the answer. Present only for math challenges. */
            fun precision(precision: Long) = precision(JsonField.of(precision))

            /**
             * Sets [Builder.precision] to an arbitrary JSON value.
             *
             * You should usually call [Builder.precision] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun precision(precision: JsonField<Long>) = apply { this.precision = precision }

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
             *
             * The following fields are required:
             * ```java
             * .challengeType()
             * .nonce()
             * .privacyPolicyUrl()
             * .problem()
             * .termsAndConditionsUrl()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("challengeType", challengeType),
                    checkRequired("nonce", nonce),
                    checkRequired("privacyPolicyUrl", privacyPolicyUrl),
                    checkRequired("problem", problem),
                    checkRequired("termsAndConditionsUrl", termsAndConditionsUrl),
                    precision,
                    additionalProperties.toMutableMap(),
                )
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

            challengeType().validate()
            nonce()
            privacyPolicyUrl()
            problem()
            termsAndConditionsUrl()
            precision()
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
            (challengeType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (nonce.asKnown().isPresent) 1 else 0) +
                (if (privacyPolicyUrl.asKnown().isPresent) 1 else 0) +
                (if (problem.asKnown().isPresent) 1 else 0) +
                (if (termsAndConditionsUrl.asKnown().isPresent) 1 else 0) +
                (if (precision.asKnown().isPresent) 1 else 0)

        /** Type of challenge. */
        class ChallengeType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val MATH = of("math")

                @JvmField val STRING = of("string")

                @JvmField val BINARY = of("binary")

                @JvmStatic fun of(value: String) = ChallengeType(JsonField.of(value))
            }

            /** An enum containing [ChallengeType]'s known values. */
            enum class Known {
                MATH,
                STRING,
                BINARY,
            }

            /**
             * An enum containing [ChallengeType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [ChallengeType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                MATH,
                STRING,
                BINARY,
                /**
                 * An enum member indicating that [ChallengeType] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    MATH -> Value.MATH
                    STRING -> Value.STRING
                    BINARY -> Value.BINARY
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    MATH -> Known.MATH
                    STRING -> Known.STRING
                    BINARY -> Known.BINARY
                    else -> throw TelnyxInvalidDataException("Unknown ChallengeType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    TelnyxInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): ChallengeType = apply {
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

                return other is ChallengeType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                challengeType == other.challengeType &&
                nonce == other.nonce &&
                privacyPolicyUrl == other.privacyPolicyUrl &&
                problem == other.problem &&
                termsAndConditionsUrl == other.termsAndConditionsUrl &&
                precision == other.precision &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                challengeType,
                nonce,
                privacyPolicyUrl,
                problem,
                termsAndConditionsUrl,
                precision,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{challengeType=$challengeType, nonce=$nonce, privacyPolicyUrl=$privacyPolicyUrl, problem=$problem, termsAndConditionsUrl=$termsAndConditionsUrl, precision=$precision, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BotChallengeCreateResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BotChallengeCreateResponse{data=$data, additionalProperties=$additionalProperties}"
}
