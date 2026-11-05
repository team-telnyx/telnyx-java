// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.policies

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Ordered steps that run in place of the policy's guardrails running independently. */
class AgentGatewayPolicyPipeline
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val hook: JsonField<Hook>,
    private val steps: JsonField<List<Step>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("hook") @ExcludeMissing hook: JsonField<Hook> = JsonMissing.of(),
        @JsonProperty("steps") @ExcludeMissing steps: JsonField<List<Step>> = JsonMissing.of(),
    ) : this(hook, steps, mutableMapOf())

    /**
     * `before_request` runs the steps on the request, and `after_request` on the model's response.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hook(): Hook = hook.getRequired("hook")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun steps(): List<Step> = steps.getRequired("steps")

    /**
     * Returns the raw JSON value of [hook].
     *
     * Unlike [hook], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hook") @ExcludeMissing fun _hook(): JsonField<Hook> = hook

    /**
     * Returns the raw JSON value of [steps].
     *
     * Unlike [steps], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("steps") @ExcludeMissing fun _steps(): JsonField<List<Step>> = steps

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
         * Returns a mutable builder for constructing an instance of [AgentGatewayPolicyPipeline].
         *
         * The following fields are required:
         * ```java
         * .hook()
         * .steps()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AgentGatewayPolicyPipeline]. */
    class Builder internal constructor() {

        private var hook: JsonField<Hook>? = null
        private var steps: JsonField<MutableList<Step>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(agentGatewayPolicyPipeline: AgentGatewayPolicyPipeline) = apply {
            hook = agentGatewayPolicyPipeline.hook
            steps = agentGatewayPolicyPipeline.steps.map { it.toMutableList() }
            additionalProperties = agentGatewayPolicyPipeline.additionalProperties.toMutableMap()
        }

        /**
         * `before_request` runs the steps on the request, and `after_request` on the model's
         * response.
         */
        fun hook(hook: Hook) = hook(JsonField.of(hook))

        /**
         * Sets [Builder.hook] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hook] with a well-typed [Hook] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hook(hook: JsonField<Hook>) = apply { this.hook = hook }

        fun steps(steps: List<Step>) = steps(JsonField.of(steps))

        /**
         * Sets [Builder.steps] to an arbitrary JSON value.
         *
         * You should usually call [Builder.steps] with a well-typed `List<Step>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun steps(steps: JsonField<List<Step>>) = apply {
            this.steps = steps.map { it.toMutableList() }
        }

        /**
         * Adds a single [Step] to [steps].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addStep(step: Step) = apply {
            steps =
                (steps ?: JsonField.of(mutableListOf())).also { checkKnown("steps", it).add(step) }
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
         * Returns an immutable instance of [AgentGatewayPolicyPipeline].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .hook()
         * .steps()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AgentGatewayPolicyPipeline =
            AgentGatewayPolicyPipeline(
                checkRequired("hook", hook),
                checkRequired("steps", steps).map { it.toImmutable() },
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
    fun validate(): AgentGatewayPolicyPipeline = apply {
        if (validated) {
            return@apply
        }

        hook().validate()
        steps().forEach { it.validate() }
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
        (hook.asKnown().getOrNull()?.validity() ?: 0) +
            (steps.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    /**
     * `before_request` runs the steps on the request, and `after_request` on the model's response.
     */
    class Hook @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val BEFORE_REQUEST = of("before_request")

            @JvmField val AFTER_REQUEST = of("after_request")

            @JvmStatic fun of(value: String) = Hook(JsonField.of(value))
        }

        /** An enum containing [Hook]'s known values. */
        enum class Known {
            BEFORE_REQUEST,
            AFTER_REQUEST,
        }

        /**
         * An enum containing [Hook]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Hook] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BEFORE_REQUEST,
            AFTER_REQUEST,
            /** An enum member indicating that [Hook] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                BEFORE_REQUEST -> Value.BEFORE_REQUEST
                AFTER_REQUEST -> Value.AFTER_REQUEST
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws TelnyxInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                BEFORE_REQUEST -> Known.BEFORE_REQUEST
                AFTER_REQUEST -> Known.AFTER_REQUEST
                else -> throw TelnyxInvalidDataException("Unknown Hook: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

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
        fun validate(): Hook = apply {
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

            return other is Hook && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** One pipeline step: a guardrail, and what happens when it passes, fails, or errors. */
    class Step
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val guardrail: JsonField<String>,
        private val message: JsonField<String>,
        private val onError: JsonField<OnError>,
        private val onFail: JsonField<OnFail>,
        private val onPass: JsonField<OnPass>,
        private val passData: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("guardrail")
            @ExcludeMissing
            guardrail: JsonField<String> = JsonMissing.of(),
            @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
            @JsonProperty("on_error")
            @ExcludeMissing
            onError: JsonField<OnError> = JsonMissing.of(),
            @JsonProperty("on_fail") @ExcludeMissing onFail: JsonField<OnFail> = JsonMissing.of(),
            @JsonProperty("on_pass") @ExcludeMissing onPass: JsonField<OnPass> = JsonMissing.of(),
            @JsonProperty("pass_data")
            @ExcludeMissing
            passData: JsonField<Boolean> = JsonMissing.of(),
        ) : this(guardrail, message, onError, onFail, onPass, passData, mutableMapOf())

        /**
         * A guardrail on the instance, by name.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun guardrail(): String = guardrail.getRequired("guardrail")

        /**
         * The response that replaces the model's when an outcome is `respond`. Required with
         * `respond`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun message(): Optional<String> = message.getOptional("message")

        /**
         * What happens when the guardrail errors. Left out, the same as `on_fail`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun onError(): Optional<OnError> = onError.getOptional("on_error")

        /**
         * What happens when the guardrail fails.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun onFail(): Optional<OnFail> = onFail.getOptional("on_fail")

        /**
         * What happens when the guardrail passes. `next` goes on to the next step, `allow` allows
         * the request, `block` blocks it, and `respond` answers with `message`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun onPass(): Optional<OnPass> = onPass.getOptional("on_pass")

        /**
         * `true` hands the step's modified request, such as masked text, to the next step.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun passData(): Optional<Boolean> = passData.getOptional("pass_data")

        /**
         * Returns the raw JSON value of [guardrail].
         *
         * Unlike [guardrail], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("guardrail") @ExcludeMissing fun _guardrail(): JsonField<String> = guardrail

        /**
         * Returns the raw JSON value of [message].
         *
         * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

        /**
         * Returns the raw JSON value of [onError].
         *
         * Unlike [onError], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("on_error") @ExcludeMissing fun _onError(): JsonField<OnError> = onError

        /**
         * Returns the raw JSON value of [onFail].
         *
         * Unlike [onFail], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("on_fail") @ExcludeMissing fun _onFail(): JsonField<OnFail> = onFail

        /**
         * Returns the raw JSON value of [onPass].
         *
         * Unlike [onPass], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("on_pass") @ExcludeMissing fun _onPass(): JsonField<OnPass> = onPass

        /**
         * Returns the raw JSON value of [passData].
         *
         * Unlike [passData], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pass_data") @ExcludeMissing fun _passData(): JsonField<Boolean> = passData

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
             * Returns a mutable builder for constructing an instance of [Step].
             *
             * The following fields are required:
             * ```java
             * .guardrail()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Step]. */
        class Builder internal constructor() {

            private var guardrail: JsonField<String>? = null
            private var message: JsonField<String> = JsonMissing.of()
            private var onError: JsonField<OnError> = JsonMissing.of()
            private var onFail: JsonField<OnFail> = JsonMissing.of()
            private var onPass: JsonField<OnPass> = JsonMissing.of()
            private var passData: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(step: Step) = apply {
                guardrail = step.guardrail
                message = step.message
                onError = step.onError
                onFail = step.onFail
                onPass = step.onPass
                passData = step.passData
                additionalProperties = step.additionalProperties.toMutableMap()
            }

            /** A guardrail on the instance, by name. */
            fun guardrail(guardrail: String) = guardrail(JsonField.of(guardrail))

            /**
             * Sets [Builder.guardrail] to an arbitrary JSON value.
             *
             * You should usually call [Builder.guardrail] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun guardrail(guardrail: JsonField<String>) = apply { this.guardrail = guardrail }

            /**
             * The response that replaces the model's when an outcome is `respond`. Required with
             * `respond`.
             */
            fun message(message: String?) = message(JsonField.ofNullable(message))

            /** Alias for calling [Builder.message] with `message.orElse(null)`. */
            fun message(message: Optional<String>) = message(message.getOrNull())

            /**
             * Sets [Builder.message] to an arbitrary JSON value.
             *
             * You should usually call [Builder.message] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun message(message: JsonField<String>) = apply { this.message = message }

            /** What happens when the guardrail errors. Left out, the same as `on_fail`. */
            fun onError(onError: OnError?) = onError(JsonField.ofNullable(onError))

            /** Alias for calling [Builder.onError] with `onError.orElse(null)`. */
            fun onError(onError: Optional<OnError>) = onError(onError.getOrNull())

            /**
             * Sets [Builder.onError] to an arbitrary JSON value.
             *
             * You should usually call [Builder.onError] with a well-typed [OnError] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun onError(onError: JsonField<OnError>) = apply { this.onError = onError }

            /** What happens when the guardrail fails. */
            fun onFail(onFail: OnFail) = onFail(JsonField.of(onFail))

            /**
             * Sets [Builder.onFail] to an arbitrary JSON value.
             *
             * You should usually call [Builder.onFail] with a well-typed [OnFail] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun onFail(onFail: JsonField<OnFail>) = apply { this.onFail = onFail }

            /**
             * What happens when the guardrail passes. `next` goes on to the next step, `allow`
             * allows the request, `block` blocks it, and `respond` answers with `message`.
             */
            fun onPass(onPass: OnPass) = onPass(JsonField.of(onPass))

            /**
             * Sets [Builder.onPass] to an arbitrary JSON value.
             *
             * You should usually call [Builder.onPass] with a well-typed [OnPass] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun onPass(onPass: JsonField<OnPass>) = apply { this.onPass = onPass }

            /** `true` hands the step's modified request, such as masked text, to the next step. */
            fun passData(passData: Boolean) = passData(JsonField.of(passData))

            /**
             * Sets [Builder.passData] to an arbitrary JSON value.
             *
             * You should usually call [Builder.passData] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun passData(passData: JsonField<Boolean>) = apply { this.passData = passData }

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
             * Returns an immutable instance of [Step].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .guardrail()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Step =
                Step(
                    checkRequired("guardrail", guardrail),
                    message,
                    onError,
                    onFail,
                    onPass,
                    passData,
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
        fun validate(): Step = apply {
            if (validated) {
                return@apply
            }

            guardrail()
            message()
            onError().ifPresent { it.validate() }
            onFail().ifPresent { it.validate() }
            onPass().ifPresent { it.validate() }
            passData()
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
            (if (guardrail.asKnown().isPresent) 1 else 0) +
                (if (message.asKnown().isPresent) 1 else 0) +
                (onError.asKnown().getOrNull()?.validity() ?: 0) +
                (onFail.asKnown().getOrNull()?.validity() ?: 0) +
                (onPass.asKnown().getOrNull()?.validity() ?: 0) +
                (if (passData.asKnown().isPresent) 1 else 0)

        /** What happens when the guardrail errors. Left out, the same as `on_fail`. */
        class OnError @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val NEXT = of("next")

                @JvmField val ALLOW = of("allow")

                @JvmField val BLOCK = of("block")

                @JvmField val RESPOND = of("respond")

                @JvmStatic fun of(value: String) = OnError(JsonField.of(value))
            }

            /** An enum containing [OnError]'s known values. */
            enum class Known {
                NEXT,
                ALLOW,
                BLOCK,
                RESPOND,
            }

            /**
             * An enum containing [OnError]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [OnError] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                NEXT,
                ALLOW,
                BLOCK,
                RESPOND,
                /**
                 * An enum member indicating that [OnError] was instantiated with an unknown value.
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
                    NEXT -> Value.NEXT
                    ALLOW -> Value.ALLOW
                    BLOCK -> Value.BLOCK
                    RESPOND -> Value.RESPOND
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
                    NEXT -> Known.NEXT
                    ALLOW -> Known.ALLOW
                    BLOCK -> Known.BLOCK
                    RESPOND -> Known.RESPOND
                    else -> throw TelnyxInvalidDataException("Unknown OnError: $value")
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
            fun validate(): OnError = apply {
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

                return other is OnError && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** What happens when the guardrail fails. */
        class OnFail @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val NEXT = of("next")

                @JvmField val ALLOW = of("allow")

                @JvmField val BLOCK = of("block")

                @JvmField val RESPOND = of("respond")

                @JvmStatic fun of(value: String) = OnFail(JsonField.of(value))
            }

            /** An enum containing [OnFail]'s known values. */
            enum class Known {
                NEXT,
                ALLOW,
                BLOCK,
                RESPOND,
            }

            /**
             * An enum containing [OnFail]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [OnFail] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                NEXT,
                ALLOW,
                BLOCK,
                RESPOND,
                /**
                 * An enum member indicating that [OnFail] was instantiated with an unknown value.
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
                    NEXT -> Value.NEXT
                    ALLOW -> Value.ALLOW
                    BLOCK -> Value.BLOCK
                    RESPOND -> Value.RESPOND
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
                    NEXT -> Known.NEXT
                    ALLOW -> Known.ALLOW
                    BLOCK -> Known.BLOCK
                    RESPOND -> Known.RESPOND
                    else -> throw TelnyxInvalidDataException("Unknown OnFail: $value")
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
            fun validate(): OnFail = apply {
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

                return other is OnFail && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * What happens when the guardrail passes. `next` goes on to the next step, `allow` allows
         * the request, `block` blocks it, and `respond` answers with `message`.
         */
        class OnPass @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val NEXT = of("next")

                @JvmField val ALLOW = of("allow")

                @JvmField val BLOCK = of("block")

                @JvmField val RESPOND = of("respond")

                @JvmStatic fun of(value: String) = OnPass(JsonField.of(value))
            }

            /** An enum containing [OnPass]'s known values. */
            enum class Known {
                NEXT,
                ALLOW,
                BLOCK,
                RESPOND,
            }

            /**
             * An enum containing [OnPass]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [OnPass] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                NEXT,
                ALLOW,
                BLOCK,
                RESPOND,
                /**
                 * An enum member indicating that [OnPass] was instantiated with an unknown value.
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
                    NEXT -> Value.NEXT
                    ALLOW -> Value.ALLOW
                    BLOCK -> Value.BLOCK
                    RESPOND -> Value.RESPOND
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
                    NEXT -> Known.NEXT
                    ALLOW -> Known.ALLOW
                    BLOCK -> Known.BLOCK
                    RESPOND -> Known.RESPOND
                    else -> throw TelnyxInvalidDataException("Unknown OnPass: $value")
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
            fun validate(): OnPass = apply {
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

                return other is OnPass && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Step &&
                guardrail == other.guardrail &&
                message == other.message &&
                onError == other.onError &&
                onFail == other.onFail &&
                onPass == other.onPass &&
                passData == other.passData &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                guardrail,
                message,
                onError,
                onFail,
                onPass,
                passData,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Step{guardrail=$guardrail, message=$message, onError=$onError, onFail=$onFail, onPass=$onPass, passData=$passData, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentGatewayPolicyPipeline &&
            hook == other.hook &&
            steps == other.steps &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(hook, steps, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AgentGatewayPolicyPipeline{hook=$hook, steps=$steps, additionalProperties=$additionalProperties}"
}
