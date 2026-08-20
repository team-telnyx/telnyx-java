// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailvalidations

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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class EmailValidationChecks
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
        @JsonProperty("mx") @ExcludeMissing mx: JsonField<EmailValidationCheck> = JsonMissing.of(),
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
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun disposable(): EmailValidationCheck = disposable.getRequired("disposable")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun mx(): EmailValidationCheck = mx.getRequired("mx")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun roleBased(): EmailValidationCheck = roleBased.getRequired("role_based")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun syntax(): EmailValidationCheck = syntax.getRequired("syntax")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun typo(): Typo = typo.getRequired("typo")

    /**
     * Returns the raw JSON value of [disposable].
     *
     * Unlike [disposable], this method doesn't throw if the JSON field has an unexpected type.
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
     * Unlike [roleBased], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("role_based")
    @ExcludeMissing
    fun _roleBased(): JsonField<EmailValidationCheck> = roleBased

    /**
     * Returns the raw JSON value of [syntax].
     *
     * Unlike [syntax], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("syntax") @ExcludeMissing fun _syntax(): JsonField<EmailValidationCheck> = syntax

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
         * Returns a mutable builder for constructing an instance of [EmailValidationChecks].
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

    /** A builder for [EmailValidationChecks]. */
    class Builder internal constructor() {

        private var disposable: JsonField<EmailValidationCheck>? = null
        private var mx: JsonField<EmailValidationCheck>? = null
        private var roleBased: JsonField<EmailValidationCheck>? = null
        private var syntax: JsonField<EmailValidationCheck>? = null
        private var typo: JsonField<Typo>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(emailValidationChecks: EmailValidationChecks) = apply {
            disposable = emailValidationChecks.disposable
            mx = emailValidationChecks.mx
            roleBased = emailValidationChecks.roleBased
            syntax = emailValidationChecks.syntax
            typo = emailValidationChecks.typo
            additionalProperties = emailValidationChecks.additionalProperties.toMutableMap()
        }

        fun disposable(disposable: EmailValidationCheck) = disposable(JsonField.of(disposable))

        /**
         * Sets [Builder.disposable] to an arbitrary JSON value.
         *
         * You should usually call [Builder.disposable] with a well-typed [EmailValidationCheck]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun disposable(disposable: JsonField<EmailValidationCheck>) = apply {
            this.disposable = disposable
        }

        fun mx(mx: EmailValidationCheck) = mx(JsonField.of(mx))

        /**
         * Sets [Builder.mx] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mx] with a well-typed [EmailValidationCheck] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun mx(mx: JsonField<EmailValidationCheck>) = apply { this.mx = mx }

        fun roleBased(roleBased: EmailValidationCheck) = roleBased(JsonField.of(roleBased))

        /**
         * Sets [Builder.roleBased] to an arbitrary JSON value.
         *
         * You should usually call [Builder.roleBased] with a well-typed [EmailValidationCheck]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun roleBased(roleBased: JsonField<EmailValidationCheck>) = apply {
            this.roleBased = roleBased
        }

        fun syntax(syntax: EmailValidationCheck) = syntax(JsonField.of(syntax))

        /**
         * Sets [Builder.syntax] to an arbitrary JSON value.
         *
         * You should usually call [Builder.syntax] with a well-typed [EmailValidationCheck] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun syntax(syntax: JsonField<EmailValidationCheck>) = apply { this.syntax = syntax }

        fun typo(typo: Typo) = typo(JsonField.of(typo))

        /**
         * Sets [Builder.typo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.typo] with a well-typed [Typo] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun typo(typo: JsonField<Typo>) = apply { this.typo = typo }

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
         * Returns an immutable instance of [EmailValidationChecks].
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
        fun build(): EmailValidationChecks =
            EmailValidationChecks(
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
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): EmailValidationChecks = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
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
            @JsonProperty("pass") @ExcludeMissing pass: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("details") @ExcludeMissing details: JsonField<String> = JsonMissing.of(),
            @JsonProperty("suggestion")
            @ExcludeMissing
            suggestion: JsonField<String> = JsonMissing.of(),
        ) : this(pass, details, suggestion, mutableMapOf())

        fun toEmailValidationCheck(): EmailValidationCheck =
            EmailValidationCheck.builder().pass(pass).details(details).build()

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun pass(): Boolean = pass.getRequired("pass")

        /**
         * Human-readable check detail. Omitted when nil.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun details(): Optional<String> = details.getOptional("details")

        /**
         * Suggested correction for common typos. Omitted when nil.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun suggestion(): Optional<String> = suggestion.getOptional("suggestion")

        /**
         * Returns the raw JSON value of [pass].
         *
         * Unlike [pass], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pass") @ExcludeMissing fun _pass(): JsonField<Boolean> = pass

        /**
         * Returns the raw JSON value of [details].
         *
         * Unlike [details], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("details") @ExcludeMissing fun _details(): JsonField<String> = details

        /**
         * Returns the raw JSON value of [suggestion].
         *
         * Unlike [suggestion], this method doesn't throw if the JSON field has an unexpected type.
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
             * You should usually call [Builder.pass] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pass(pass: JsonField<Boolean>) = apply { this.pass = pass }

            /** Human-readable check detail. Omitted when nil. */
            fun details(details: String) = details(JsonField.of(details))

            /**
             * Sets [Builder.details] to an arbitrary JSON value.
             *
             * You should usually call [Builder.details] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun details(details: JsonField<String>) = apply { this.details = details }

            /** Suggested correction for common typos. Omitted when nil. */
            fun suggestion(suggestion: String) = suggestion(JsonField.of(suggestion))

            /**
             * Sets [Builder.suggestion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.suggestion] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun suggestion(suggestion: JsonField<String>) = apply { this.suggestion = suggestion }

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
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
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

        return other is EmailValidationChecks &&
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
        "EmailValidationChecks{disposable=$disposable, mx=$mx, roleBased=$roleBased, syntax=$syntax, typo=$typo, additionalProperties=$additionalProperties}"
}
