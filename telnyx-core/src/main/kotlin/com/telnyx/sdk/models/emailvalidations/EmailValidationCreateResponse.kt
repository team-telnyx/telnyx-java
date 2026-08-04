// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailvalidations

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

class EmailValidationCreateResponse
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
         * Returns a mutable builder for constructing an instance of
         * [EmailValidationCreateResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EmailValidationCreateResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(emailValidationCreateResponse: EmailValidationCreateResponse) = apply {
            data = emailValidationCreateResponse.data
            additionalProperties = emailValidationCreateResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [EmailValidationCreateResponse].
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
        fun build(): EmailValidationCreateResponse =
            EmailValidationCreateResponse(
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
    fun validate(): EmailValidationCreateResponse = apply {
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
        private val checks: JsonField<Checks>,
        private val email: JsonField<String>,
        private val recordType: JsonField<RecordType>,
        private val riskScore: JsonField<Float>,
        private val valid: JsonField<Boolean>,
        private val didYouMean: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("checks") @ExcludeMissing checks: JsonField<Checks> = JsonMissing.of(),
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<RecordType> = JsonMissing.of(),
            @JsonProperty("risk_score")
            @ExcludeMissing
            riskScore: JsonField<Float> = JsonMissing.of(),
            @JsonProperty("valid") @ExcludeMissing valid: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("did_you_mean")
            @ExcludeMissing
            didYouMean: JsonField<String> = JsonMissing.of(),
        ) : this(checks, email, recordType, riskScore, valid, didYouMean, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun checks(): Checks = checks.getRequired("checks")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun email(): String = email.getRequired("email")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun recordType(): RecordType = recordType.getRequired("record_type")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun riskScore(): Float = riskScore.getRequired("risk_score")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun valid(): Boolean = valid.getRequired("valid")

        /**
         * Suggested correction for typo. Omitted when nil.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun didYouMean(): Optional<String> = didYouMean.getOptional("did_you_mean")

        /**
         * Returns the raw JSON value of [checks].
         *
         * Unlike [checks], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("checks") @ExcludeMissing fun _checks(): JsonField<Checks> = checks

        /**
         * Returns the raw JSON value of [email].
         *
         * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /**
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<RecordType> = recordType

        /**
         * Returns the raw JSON value of [riskScore].
         *
         * Unlike [riskScore], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("risk_score") @ExcludeMissing fun _riskScore(): JsonField<Float> = riskScore

        /**
         * Returns the raw JSON value of [valid].
         *
         * Unlike [valid], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("valid") @ExcludeMissing fun _valid(): JsonField<Boolean> = valid

        /**
         * Returns the raw JSON value of [didYouMean].
         *
         * Unlike [didYouMean], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("did_you_mean")
        @ExcludeMissing
        fun _didYouMean(): JsonField<String> = didYouMean

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
             * .checks()
             * .email()
             * .recordType()
             * .riskScore()
             * .valid()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var checks: JsonField<Checks>? = null
            private var email: JsonField<String>? = null
            private var recordType: JsonField<RecordType>? = null
            private var riskScore: JsonField<Float>? = null
            private var valid: JsonField<Boolean>? = null
            private var didYouMean: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                checks = data.checks
                email = data.email
                recordType = data.recordType
                riskScore = data.riskScore
                valid = data.valid
                didYouMean = data.didYouMean
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun checks(checks: Checks) = checks(JsonField.of(checks))

            /**
             * Sets [Builder.checks] to an arbitrary JSON value.
             *
             * You should usually call [Builder.checks] with a well-typed [Checks] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun checks(checks: JsonField<Checks>) = apply { this.checks = checks }

            fun email(email: String) = email(JsonField.of(email))

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

            fun recordType(recordType: RecordType) = recordType(JsonField.of(recordType))

            /**
             * Sets [Builder.recordType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordType] with a well-typed [RecordType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordType(recordType: JsonField<RecordType>) = apply {
                this.recordType = recordType
            }

            fun riskScore(riskScore: Float) = riskScore(JsonField.of(riskScore))

            /**
             * Sets [Builder.riskScore] to an arbitrary JSON value.
             *
             * You should usually call [Builder.riskScore] with a well-typed [Float] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun riskScore(riskScore: JsonField<Float>) = apply { this.riskScore = riskScore }

            fun valid(valid: Boolean) = valid(JsonField.of(valid))

            /**
             * Sets [Builder.valid] to an arbitrary JSON value.
             *
             * You should usually call [Builder.valid] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun valid(valid: JsonField<Boolean>) = apply { this.valid = valid }

            /** Suggested correction for typo. Omitted when nil. */
            fun didYouMean(didYouMean: String) = didYouMean(JsonField.of(didYouMean))

            /**
             * Sets [Builder.didYouMean] to an arbitrary JSON value.
             *
             * You should usually call [Builder.didYouMean] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun didYouMean(didYouMean: JsonField<String>) = apply { this.didYouMean = didYouMean }

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
             * .checks()
             * .email()
             * .recordType()
             * .riskScore()
             * .valid()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("checks", checks),
                    checkRequired("email", email),
                    checkRequired("recordType", recordType),
                    checkRequired("riskScore", riskScore),
                    checkRequired("valid", valid),
                    didYouMean,
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

            checks().validate()
            email()
            recordType().validate()
            riskScore()
            valid()
            didYouMean()
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
            (checks.asKnown().getOrNull()?.validity() ?: 0) +
                (if (email.asKnown().isPresent) 1 else 0) +
                (recordType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (riskScore.asKnown().isPresent) 1 else 0) +
                (if (valid.asKnown().isPresent) 1 else 0) +
                (if (didYouMean.asKnown().isPresent) 1 else 0)

        class Checks
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val disposable: JsonField<EmailValidationCheck>,
            private val mx: JsonField<EmailValidationCheck>,
            private val roleBased: JsonField<EmailValidationCheck>,
            private val syntax: JsonField<EmailValidationCheck>,
            private val typo: JsonField<Typo>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("disposable")
                @ExcludeMissing
                disposable: JsonField<EmailValidationCheck> = JsonMissing.of(),
                @JsonProperty("mx")
                @ExcludeMissing
                mx: JsonField<EmailValidationCheck> = JsonMissing.of(),
                @JsonProperty("role_based")
                @ExcludeMissing
                roleBased: JsonField<EmailValidationCheck> = JsonMissing.of(),
                @JsonProperty("syntax")
                @ExcludeMissing
                syntax: JsonField<EmailValidationCheck> = JsonMissing.of(),
                @JsonProperty("typo") @ExcludeMissing typo: JsonField<Typo> = JsonMissing.of(),
            ) : this(disposable, mx, roleBased, syntax, typo, mutableMapOf())

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun disposable(): EmailValidationCheck = disposable.getRequired("disposable")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun mx(): EmailValidationCheck = mx.getRequired("mx")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun roleBased(): EmailValidationCheck = roleBased.getRequired("role_based")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun syntax(): EmailValidationCheck = syntax.getRequired("syntax")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun typo(): Typo = typo.getRequired("typo")

            /**
             * Returns the raw JSON value of [disposable].
             *
             * Unlike [disposable], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("disposable")
            @ExcludeMissing
            fun _disposable(): JsonField<EmailValidationCheck> = disposable

            /**
             * Returns the raw JSON value of [mx].
             *
             * Unlike [mx], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("mx") @ExcludeMissing fun _mx(): JsonField<EmailValidationCheck> = mx

            /**
             * Returns the raw JSON value of [roleBased].
             *
             * Unlike [roleBased], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("role_based")
            @ExcludeMissing
            fun _roleBased(): JsonField<EmailValidationCheck> = roleBased

            /**
             * Returns the raw JSON value of [syntax].
             *
             * Unlike [syntax], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("syntax")
            @ExcludeMissing
            fun _syntax(): JsonField<EmailValidationCheck> = syntax

            /**
             * Returns the raw JSON value of [typo].
             *
             * Unlike [typo], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("typo") @ExcludeMissing fun _typo(): JsonField<Typo> = typo

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
                 * Returns a mutable builder for constructing an instance of [Checks].
                 *
                 * The following fields are required:
                 * ```java
                 * .disposable()
                 * .mx()
                 * .roleBased()
                 * .syntax()
                 * .typo()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Checks]. */
            class Builder internal constructor() {

                private var disposable: JsonField<EmailValidationCheck>? = null
                private var mx: JsonField<EmailValidationCheck>? = null
                private var roleBased: JsonField<EmailValidationCheck>? = null
                private var syntax: JsonField<EmailValidationCheck>? = null
                private var typo: JsonField<Typo>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(checks: Checks) = apply {
                    disposable = checks.disposable
                    mx = checks.mx
                    roleBased = checks.roleBased
                    syntax = checks.syntax
                    typo = checks.typo
                    additionalProperties = checks.additionalProperties.toMutableMap()
                }

                fun disposable(disposable: EmailValidationCheck) =
                    disposable(JsonField.of(disposable))

                /**
                 * Sets [Builder.disposable] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.disposable] with a well-typed
                 * [EmailValidationCheck] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun disposable(disposable: JsonField<EmailValidationCheck>) = apply {
                    this.disposable = disposable
                }

                fun mx(mx: EmailValidationCheck) = mx(JsonField.of(mx))

                /**
                 * Sets [Builder.mx] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.mx] with a well-typed [EmailValidationCheck]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun mx(mx: JsonField<EmailValidationCheck>) = apply { this.mx = mx }

                fun roleBased(roleBased: EmailValidationCheck) = roleBased(JsonField.of(roleBased))

                /**
                 * Sets [Builder.roleBased] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.roleBased] with a well-typed
                 * [EmailValidationCheck] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun roleBased(roleBased: JsonField<EmailValidationCheck>) = apply {
                    this.roleBased = roleBased
                }

                fun syntax(syntax: EmailValidationCheck) = syntax(JsonField.of(syntax))

                /**
                 * Sets [Builder.syntax] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.syntax] with a well-typed [EmailValidationCheck]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun syntax(syntax: JsonField<EmailValidationCheck>) = apply { this.syntax = syntax }

                fun typo(typo: Typo) = typo(JsonField.of(typo))

                /**
                 * Sets [Builder.typo] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.typo] with a well-typed [Typo] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun typo(typo: JsonField<Typo>) = apply { this.typo = typo }

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
                 * Returns an immutable instance of [Checks].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .disposable()
                 * .mx()
                 * .roleBased()
                 * .syntax()
                 * .typo()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Checks =
                    Checks(
                        checkRequired("disposable", disposable),
                        checkRequired("mx", mx),
                        checkRequired("roleBased", roleBased),
                        checkRequired("syntax", syntax),
                        checkRequired("typo", typo),
                        additionalProperties.toMutableMap(),
                    )
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
            fun validate(): Checks = apply {
                if (validated) {
                    return@apply
                }

                disposable().validate()
                mx().validate()
                roleBased().validate()
                syntax().validate()
                typo().validate()
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
                (disposable.asKnown().getOrNull()?.validity() ?: 0) +
                    (mx.asKnown().getOrNull()?.validity() ?: 0) +
                    (roleBased.asKnown().getOrNull()?.validity() ?: 0) +
                    (syntax.asKnown().getOrNull()?.validity() ?: 0) +
                    (typo.asKnown().getOrNull()?.validity() ?: 0)

            class Typo
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val pass: JsonField<Boolean>,
                private val details: JsonField<String>,
                private val suggestion: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("pass")
                    @ExcludeMissing
                    pass: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("details")
                    @ExcludeMissing
                    details: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("suggestion")
                    @ExcludeMissing
                    suggestion: JsonField<String> = JsonMissing.of(),
                ) : this(pass, details, suggestion, mutableMapOf())

                fun toEmailValidationCheck(): EmailValidationCheck =
                    EmailValidationCheck.builder().pass(pass).details(details).build()

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun pass(): Boolean = pass.getRequired("pass")

                /**
                 * Human-readable check detail. Omitted when nil.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun details(): Optional<String> = details.getOptional("details")

                /**
                 * Suggested correction for common typos. Omitted when nil.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun suggestion(): Optional<String> = suggestion.getOptional("suggestion")

                /**
                 * Returns the raw JSON value of [pass].
                 *
                 * Unlike [pass], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("pass") @ExcludeMissing fun _pass(): JsonField<Boolean> = pass

                /**
                 * Returns the raw JSON value of [details].
                 *
                 * Unlike [details], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("details") @ExcludeMissing fun _details(): JsonField<String> = details

                /**
                 * Returns the raw JSON value of [suggestion].
                 *
                 * Unlike [suggestion], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("suggestion")
                @ExcludeMissing
                fun _suggestion(): JsonField<String> = suggestion

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
                     * Returns a mutable builder for constructing an instance of [Typo].
                     *
                     * The following fields are required:
                     * ```java
                     * .pass()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Typo]. */
                class Builder internal constructor() {

                    private var pass: JsonField<Boolean>? = null
                    private var details: JsonField<String> = JsonMissing.of()
                    private var suggestion: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(typo: Typo) = apply {
                        pass = typo.pass
                        details = typo.details
                        suggestion = typo.suggestion
                        additionalProperties = typo.additionalProperties.toMutableMap()
                    }

                    fun pass(pass: Boolean) = pass(JsonField.of(pass))

                    /**
                     * Sets [Builder.pass] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.pass] with a well-typed [Boolean] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun pass(pass: JsonField<Boolean>) = apply { this.pass = pass }

                    /** Human-readable check detail. Omitted when nil. */
                    fun details(details: String) = details(JsonField.of(details))

                    /**
                     * Sets [Builder.details] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.details] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun details(details: JsonField<String>) = apply { this.details = details }

                    /** Suggested correction for common typos. Omitted when nil. */
                    fun suggestion(suggestion: String) = suggestion(JsonField.of(suggestion))

                    /**
                     * Sets [Builder.suggestion] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.suggestion] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun suggestion(suggestion: JsonField<String>) = apply {
                        this.suggestion = suggestion
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
                     * Returns an immutable instance of [Typo].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .pass()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Typo =
                        Typo(
                            checkRequired("pass", pass),
                            details,
                            suggestion,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Typo = apply {
                    if (validated) {
                        return@apply
                    }

                    pass()
                    details()
                    suggestion()
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
                    (if (pass.asKnown().isPresent) 1 else 0) +
                        (if (details.asKnown().isPresent) 1 else 0) +
                        (if (suggestion.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Typo &&
                        pass == other.pass &&
                        details == other.details &&
                        suggestion == other.suggestion &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(pass, details, suggestion, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Typo{pass=$pass, details=$details, suggestion=$suggestion, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Checks &&
                    disposable == other.disposable &&
                    mx == other.mx &&
                    roleBased == other.roleBased &&
                    syntax == other.syntax &&
                    typo == other.typo &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(disposable, mx, roleBased, syntax, typo, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Checks{disposable=$disposable, mx=$mx, roleBased=$roleBased, syntax=$syntax, typo=$typo, additionalProperties=$additionalProperties}"
        }

        class RecordType @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val EMAIL_VALIDATION = of("email_validation")

                @JvmStatic fun of(value: String) = RecordType(JsonField.of(value))
            }

            /** An enum containing [RecordType]'s known values. */
            enum class Known {
                EMAIL_VALIDATION
            }

            /**
             * An enum containing [RecordType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [RecordType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                EMAIL_VALIDATION,
                /**
                 * An enum member indicating that [RecordType] was instantiated with an unknown
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
                    EMAIL_VALIDATION -> Value.EMAIL_VALIDATION
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
                    EMAIL_VALIDATION -> Known.EMAIL_VALIDATION
                    else -> throw TelnyxInvalidDataException("Unknown RecordType: $value")
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
            fun validate(): RecordType = apply {
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

                return other is RecordType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                checks == other.checks &&
                email == other.email &&
                recordType == other.recordType &&
                riskScore == other.riskScore &&
                valid == other.valid &&
                didYouMean == other.didYouMean &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                checks,
                email,
                recordType,
                riskScore,
                valid,
                didYouMean,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{checks=$checks, email=$email, recordType=$recordType, riskScore=$riskScore, valid=$valid, didYouMean=$didYouMean, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmailValidationCreateResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EmailValidationCreateResponse{data=$data, additionalProperties=$additionalProperties}"
}
