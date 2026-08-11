// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.rcs.agents

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

class AgentConsentConfiguration
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val callToAction: JsonField<String>,
    private val doubleOptIn: JsonField<Boolean>,
    private val helpResponse: JsonField<String>,
    private val optInMessage: JsonField<String>,
    private val optInMethods: JsonField<List<OptInMethod>>,
    private val optOutResponse: JsonField<String>,
    private val callToActionMediaUrl: JsonField<String>,
    private val callToActionUrl: JsonField<String>,
    private val doubleOptInMessage: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("call_to_action")
        @ExcludeMissing
        callToAction: JsonField<String> = JsonMissing.of(),
        @JsonProperty("double_opt_in")
        @ExcludeMissing
        doubleOptIn: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("help_response")
        @ExcludeMissing
        helpResponse: JsonField<String> = JsonMissing.of(),
        @JsonProperty("opt_in_message")
        @ExcludeMissing
        optInMessage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("opt_in_methods")
        @ExcludeMissing
        optInMethods: JsonField<List<OptInMethod>> = JsonMissing.of(),
        @JsonProperty("opt_out_response")
        @ExcludeMissing
        optOutResponse: JsonField<String> = JsonMissing.of(),
        @JsonProperty("call_to_action_media_url")
        @ExcludeMissing
        callToActionMediaUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("call_to_action_url")
        @ExcludeMissing
        callToActionUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("double_opt_in_message")
        @ExcludeMissing
        doubleOptInMessage: JsonField<String> = JsonMissing.of(),
    ) : this(
        callToAction,
        doubleOptIn,
        helpResponse,
        optInMessage,
        optInMethods,
        optOutResponse,
        callToActionMediaUrl,
        callToActionUrl,
        doubleOptInMessage,
        mutableMapOf(),
    )

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun callToAction(): String = callToAction.getRequired("call_to_action")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun doubleOptIn(): Boolean = doubleOptIn.getRequired("double_opt_in")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun helpResponse(): String = helpResponse.getRequired("help_response")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun optInMessage(): String = optInMessage.getRequired("opt_in_message")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun optInMethods(): List<OptInMethod> = optInMethods.getRequired("opt_in_methods")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun optOutResponse(): String = optOutResponse.getRequired("opt_out_response")

    /**
     * Required when an opt-in method is `WEBSITE` or `MOBILE_APP`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun callToActionMediaUrl(): Optional<String> =
        callToActionMediaUrl.getOptional("call_to_action_media_url")

    /**
     * Required when an opt-in method is `WEBSITE`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun callToActionUrl(): Optional<String> = callToActionUrl.getOptional("call_to_action_url")

    /**
     * Required when double_opt_in is true.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun doubleOptInMessage(): Optional<String> =
        doubleOptInMessage.getOptional("double_opt_in_message")

    /**
     * Returns the raw JSON value of [callToAction].
     *
     * Unlike [callToAction], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("call_to_action")
    @ExcludeMissing
    fun _callToAction(): JsonField<String> = callToAction

    /**
     * Returns the raw JSON value of [doubleOptIn].
     *
     * Unlike [doubleOptIn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("double_opt_in")
    @ExcludeMissing
    fun _doubleOptIn(): JsonField<Boolean> = doubleOptIn

    /**
     * Returns the raw JSON value of [helpResponse].
     *
     * Unlike [helpResponse], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("help_response")
    @ExcludeMissing
    fun _helpResponse(): JsonField<String> = helpResponse

    /**
     * Returns the raw JSON value of [optInMessage].
     *
     * Unlike [optInMessage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("opt_in_message")
    @ExcludeMissing
    fun _optInMessage(): JsonField<String> = optInMessage

    /**
     * Returns the raw JSON value of [optInMethods].
     *
     * Unlike [optInMethods], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("opt_in_methods")
    @ExcludeMissing
    fun _optInMethods(): JsonField<List<OptInMethod>> = optInMethods

    /**
     * Returns the raw JSON value of [optOutResponse].
     *
     * Unlike [optOutResponse], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("opt_out_response")
    @ExcludeMissing
    fun _optOutResponse(): JsonField<String> = optOutResponse

    /**
     * Returns the raw JSON value of [callToActionMediaUrl].
     *
     * Unlike [callToActionMediaUrl], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("call_to_action_media_url")
    @ExcludeMissing
    fun _callToActionMediaUrl(): JsonField<String> = callToActionMediaUrl

    /**
     * Returns the raw JSON value of [callToActionUrl].
     *
     * Unlike [callToActionUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("call_to_action_url")
    @ExcludeMissing
    fun _callToActionUrl(): JsonField<String> = callToActionUrl

    /**
     * Returns the raw JSON value of [doubleOptInMessage].
     *
     * Unlike [doubleOptInMessage], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("double_opt_in_message")
    @ExcludeMissing
    fun _doubleOptInMessage(): JsonField<String> = doubleOptInMessage

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
         * Returns a mutable builder for constructing an instance of [AgentConsentConfiguration].
         *
         * The following fields are required:
         * ```java
         * .callToAction()
         * .doubleOptIn()
         * .helpResponse()
         * .optInMessage()
         * .optInMethods()
         * .optOutResponse()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AgentConsentConfiguration]. */
    class Builder internal constructor() {

        private var callToAction: JsonField<String>? = null
        private var doubleOptIn: JsonField<Boolean>? = null
        private var helpResponse: JsonField<String>? = null
        private var optInMessage: JsonField<String>? = null
        private var optInMethods: JsonField<MutableList<OptInMethod>>? = null
        private var optOutResponse: JsonField<String>? = null
        private var callToActionMediaUrl: JsonField<String> = JsonMissing.of()
        private var callToActionUrl: JsonField<String> = JsonMissing.of()
        private var doubleOptInMessage: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(agentConsentConfiguration: AgentConsentConfiguration) = apply {
            callToAction = agentConsentConfiguration.callToAction
            doubleOptIn = agentConsentConfiguration.doubleOptIn
            helpResponse = agentConsentConfiguration.helpResponse
            optInMessage = agentConsentConfiguration.optInMessage
            optInMethods = agentConsentConfiguration.optInMethods.map { it.toMutableList() }
            optOutResponse = agentConsentConfiguration.optOutResponse
            callToActionMediaUrl = agentConsentConfiguration.callToActionMediaUrl
            callToActionUrl = agentConsentConfiguration.callToActionUrl
            doubleOptInMessage = agentConsentConfiguration.doubleOptInMessage
            additionalProperties = agentConsentConfiguration.additionalProperties.toMutableMap()
        }

        fun callToAction(callToAction: String) = callToAction(JsonField.of(callToAction))

        /**
         * Sets [Builder.callToAction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callToAction] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun callToAction(callToAction: JsonField<String>) = apply {
            this.callToAction = callToAction
        }

        fun doubleOptIn(doubleOptIn: Boolean) = doubleOptIn(JsonField.of(doubleOptIn))

        /**
         * Sets [Builder.doubleOptIn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.doubleOptIn] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun doubleOptIn(doubleOptIn: JsonField<Boolean>) = apply { this.doubleOptIn = doubleOptIn }

        fun helpResponse(helpResponse: String) = helpResponse(JsonField.of(helpResponse))

        /**
         * Sets [Builder.helpResponse] to an arbitrary JSON value.
         *
         * You should usually call [Builder.helpResponse] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun helpResponse(helpResponse: JsonField<String>) = apply {
            this.helpResponse = helpResponse
        }

        fun optInMessage(optInMessage: String) = optInMessage(JsonField.of(optInMessage))

        /**
         * Sets [Builder.optInMessage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.optInMessage] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun optInMessage(optInMessage: JsonField<String>) = apply {
            this.optInMessage = optInMessage
        }

        fun optInMethods(optInMethods: List<OptInMethod>) = optInMethods(JsonField.of(optInMethods))

        /**
         * Sets [Builder.optInMethods] to an arbitrary JSON value.
         *
         * You should usually call [Builder.optInMethods] with a well-typed `List<OptInMethod>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun optInMethods(optInMethods: JsonField<List<OptInMethod>>) = apply {
            this.optInMethods = optInMethods.map { it.toMutableList() }
        }

        /**
         * Adds a single [OptInMethod] to [optInMethods].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOptInMethod(optInMethod: OptInMethod) = apply {
            optInMethods =
                (optInMethods ?: JsonField.of(mutableListOf())).also {
                    checkKnown("optInMethods", it).add(optInMethod)
                }
        }

        fun optOutResponse(optOutResponse: String) = optOutResponse(JsonField.of(optOutResponse))

        /**
         * Sets [Builder.optOutResponse] to an arbitrary JSON value.
         *
         * You should usually call [Builder.optOutResponse] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun optOutResponse(optOutResponse: JsonField<String>) = apply {
            this.optOutResponse = optOutResponse
        }

        /** Required when an opt-in method is `WEBSITE` or `MOBILE_APP`. */
        fun callToActionMediaUrl(callToActionMediaUrl: String?) =
            callToActionMediaUrl(JsonField.ofNullable(callToActionMediaUrl))

        /**
         * Alias for calling [Builder.callToActionMediaUrl] with
         * `callToActionMediaUrl.orElse(null)`.
         */
        fun callToActionMediaUrl(callToActionMediaUrl: Optional<String>) =
            callToActionMediaUrl(callToActionMediaUrl.getOrNull())

        /**
         * Sets [Builder.callToActionMediaUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callToActionMediaUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun callToActionMediaUrl(callToActionMediaUrl: JsonField<String>) = apply {
            this.callToActionMediaUrl = callToActionMediaUrl
        }

        /** Required when an opt-in method is `WEBSITE`. */
        fun callToActionUrl(callToActionUrl: String?) =
            callToActionUrl(JsonField.ofNullable(callToActionUrl))

        /** Alias for calling [Builder.callToActionUrl] with `callToActionUrl.orElse(null)`. */
        fun callToActionUrl(callToActionUrl: Optional<String>) =
            callToActionUrl(callToActionUrl.getOrNull())

        /**
         * Sets [Builder.callToActionUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callToActionUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun callToActionUrl(callToActionUrl: JsonField<String>) = apply {
            this.callToActionUrl = callToActionUrl
        }

        /** Required when double_opt_in is true. */
        fun doubleOptInMessage(doubleOptInMessage: String?) =
            doubleOptInMessage(JsonField.ofNullable(doubleOptInMessage))

        /**
         * Alias for calling [Builder.doubleOptInMessage] with `doubleOptInMessage.orElse(null)`.
         */
        fun doubleOptInMessage(doubleOptInMessage: Optional<String>) =
            doubleOptInMessage(doubleOptInMessage.getOrNull())

        /**
         * Sets [Builder.doubleOptInMessage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.doubleOptInMessage] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun doubleOptInMessage(doubleOptInMessage: JsonField<String>) = apply {
            this.doubleOptInMessage = doubleOptInMessage
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
         * Returns an immutable instance of [AgentConsentConfiguration].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .callToAction()
         * .doubleOptIn()
         * .helpResponse()
         * .optInMessage()
         * .optInMethods()
         * .optOutResponse()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AgentConsentConfiguration =
            AgentConsentConfiguration(
                checkRequired("callToAction", callToAction),
                checkRequired("doubleOptIn", doubleOptIn),
                checkRequired("helpResponse", helpResponse),
                checkRequired("optInMessage", optInMessage),
                checkRequired("optInMethods", optInMethods).map { it.toImmutable() },
                checkRequired("optOutResponse", optOutResponse),
                callToActionMediaUrl,
                callToActionUrl,
                doubleOptInMessage,
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
    fun validate(): AgentConsentConfiguration = apply {
        if (validated) {
            return@apply
        }

        callToAction()
        doubleOptIn()
        helpResponse()
        optInMessage()
        optInMethods().forEach { it.validate() }
        optOutResponse()
        callToActionMediaUrl()
        callToActionUrl()
        doubleOptInMessage()
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
        (if (callToAction.asKnown().isPresent) 1 else 0) +
            (if (doubleOptIn.asKnown().isPresent) 1 else 0) +
            (if (helpResponse.asKnown().isPresent) 1 else 0) +
            (if (optInMessage.asKnown().isPresent) 1 else 0) +
            (optInMethods.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (optOutResponse.asKnown().isPresent) 1 else 0) +
            (if (callToActionMediaUrl.asKnown().isPresent) 1 else 0) +
            (if (callToActionUrl.asKnown().isPresent) 1 else 0) +
            (if (doubleOptInMessage.asKnown().isPresent) 1 else 0)

    class OptInMethod
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val methodType: JsonField<MethodType>,
        private val description: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("method_type")
            @ExcludeMissing
            methodType: JsonField<MethodType> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
        ) : this(methodType, description, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun methodType(): MethodType = methodType.getRequired("method_type")

        /**
         * Required when method_type is `OTHER`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * Returns the raw JSON value of [methodType].
         *
         * Unlike [methodType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("method_type")
        @ExcludeMissing
        fun _methodType(): JsonField<MethodType> = methodType

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

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
             * Returns a mutable builder for constructing an instance of [OptInMethod].
             *
             * The following fields are required:
             * ```java
             * .methodType()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [OptInMethod]. */
        class Builder internal constructor() {

            private var methodType: JsonField<MethodType>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(optInMethod: OptInMethod) = apply {
                methodType = optInMethod.methodType
                description = optInMethod.description
                additionalProperties = optInMethod.additionalProperties.toMutableMap()
            }

            fun methodType(methodType: MethodType) = methodType(JsonField.of(methodType))

            /**
             * Sets [Builder.methodType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.methodType] with a well-typed [MethodType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun methodType(methodType: JsonField<MethodType>) = apply {
                this.methodType = methodType
            }

            /** Required when method_type is `OTHER`. */
            fun description(description: String?) = description(JsonField.ofNullable(description))

            /** Alias for calling [Builder.description] with `description.orElse(null)`. */
            fun description(description: Optional<String>) = description(description.getOrNull())

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
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
             * Returns an immutable instance of [OptInMethod].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .methodType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): OptInMethod =
                OptInMethod(
                    checkRequired("methodType", methodType),
                    description,
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
        fun validate(): OptInMethod = apply {
            if (validated) {
                return@apply
            }

            methodType().validate()
            description()
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
            (methodType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (description.asKnown().isPresent) 1 else 0)

        class MethodType @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val SMS = of("SMS")

                @JvmField val WEBSITE = of("WEBSITE")

                @JvmField val MOBILE_APP = of("MOBILE_APP")

                @JvmField val QR_CODE = of("QR_CODE")

                @JvmField val SALE_POINT = of("SALE_POINT")

                @JvmField val OTHER = of("OTHER")

                @JvmStatic fun of(value: String) = MethodType(JsonField.of(value))
            }

            /** An enum containing [MethodType]'s known values. */
            enum class Known {
                SMS,
                WEBSITE,
                MOBILE_APP,
                QR_CODE,
                SALE_POINT,
                OTHER,
            }

            /**
             * An enum containing [MethodType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [MethodType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                SMS,
                WEBSITE,
                MOBILE_APP,
                QR_CODE,
                SALE_POINT,
                OTHER,
                /**
                 * An enum member indicating that [MethodType] was instantiated with an unknown
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
                    SMS -> Value.SMS
                    WEBSITE -> Value.WEBSITE
                    MOBILE_APP -> Value.MOBILE_APP
                    QR_CODE -> Value.QR_CODE
                    SALE_POINT -> Value.SALE_POINT
                    OTHER -> Value.OTHER
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
                    SMS -> Known.SMS
                    WEBSITE -> Known.WEBSITE
                    MOBILE_APP -> Known.MOBILE_APP
                    QR_CODE -> Known.QR_CODE
                    SALE_POINT -> Known.SALE_POINT
                    OTHER -> Known.OTHER
                    else -> throw TelnyxInvalidDataException("Unknown MethodType: $value")
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
            fun validate(): MethodType = apply {
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

                return other is MethodType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is OptInMethod &&
                methodType == other.methodType &&
                description == other.description &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(methodType, description, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "OptInMethod{methodType=$methodType, description=$description, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentConsentConfiguration &&
            callToAction == other.callToAction &&
            doubleOptIn == other.doubleOptIn &&
            helpResponse == other.helpResponse &&
            optInMessage == other.optInMessage &&
            optInMethods == other.optInMethods &&
            optOutResponse == other.optOutResponse &&
            callToActionMediaUrl == other.callToActionMediaUrl &&
            callToActionUrl == other.callToActionUrl &&
            doubleOptInMessage == other.doubleOptInMessage &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            callToAction,
            doubleOptIn,
            helpResponse,
            optInMessage,
            optInMethods,
            optOutResponse,
            callToActionMediaUrl,
            callToActionUrl,
            doubleOptInMessage,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AgentConsentConfiguration{callToAction=$callToAction, doubleOptIn=$doubleOptIn, helpResponse=$helpResponse, optInMessage=$optInMessage, optInMethods=$optInMethods, optOutResponse=$optOutResponse, callToActionMediaUrl=$callToActionMediaUrl, callToActionUrl=$callToActionUrl, doubleOptInMessage=$doubleOptInMessage, additionalProperties=$additionalProperties}"
}
