// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.templates

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

/** Optional interactive buttons. Maximum 3 buttons per template. */
class WhatsappTemplateButtonsComponent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val buttons: JsonField<List<Button>>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("buttons")
        @ExcludeMissing
        buttons: JsonField<List<Button>> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(buttons, type, mutableMapOf())

    /**
     * Array of button objects. Meta supports various combinations of button types.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun buttons(): List<Button> = buttons.getRequired("buttons")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Returns the raw JSON value of [buttons].
     *
     * Unlike [buttons], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("buttons") @ExcludeMissing fun _buttons(): JsonField<List<Button>> = buttons

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
         * [WhatsappTemplateButtonsComponent].
         *
         * The following fields are required:
         * ```java
         * .buttons()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WhatsappTemplateButtonsComponent]. */
    class Builder internal constructor() {

        private var buttons: JsonField<MutableList<Button>>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(whatsappTemplateButtonsComponent: WhatsappTemplateButtonsComponent) =
            apply {
                buttons = whatsappTemplateButtonsComponent.buttons.map { it.toMutableList() }
                type = whatsappTemplateButtonsComponent.type
                additionalProperties =
                    whatsappTemplateButtonsComponent.additionalProperties.toMutableMap()
            }

        /** Array of button objects. Meta supports various combinations of button types. */
        fun buttons(buttons: List<Button>) = buttons(JsonField.of(buttons))

        /**
         * Sets [Builder.buttons] to an arbitrary JSON value.
         *
         * You should usually call [Builder.buttons] with a well-typed `List<Button>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun buttons(buttons: JsonField<List<Button>>) = apply {
            this.buttons = buttons.map { it.toMutableList() }
        }

        /**
         * Adds a single [Button] to [buttons].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addButton(button: Button) = apply {
            buttons =
                (buttons ?: JsonField.of(mutableListOf())).also {
                    checkKnown("buttons", it).add(button)
                }
        }

        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

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
         * Returns an immutable instance of [WhatsappTemplateButtonsComponent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .buttons()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WhatsappTemplateButtonsComponent =
            WhatsappTemplateButtonsComponent(
                checkRequired("buttons", buttons).map { it.toImmutable() },
                checkRequired("type", type),
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
    fun validate(): WhatsappTemplateButtonsComponent = apply {
        if (validated) {
            return@apply
        }

        buttons().forEach { it.validate() }
        type().validate()
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
        (buttons.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0)

    class Button
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val type: JsonField<Type>,
        private val autofillText: JsonField<String>,
        private val example: JsonField<List<String>>,
        private val flowAction: JsonField<FlowAction>,
        private val flowId: JsonField<String>,
        private val navigateScreen: JsonField<String>,
        private val otpType: JsonField<OtpType>,
        private val packageName: JsonField<String>,
        private val phoneNumber: JsonField<String>,
        private val signatureHash: JsonField<String>,
        private val text: JsonField<String>,
        private val url: JsonField<String>,
        private val zeroTapTermsAccepted: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("autofill_text")
            @ExcludeMissing
            autofillText: JsonField<String> = JsonMissing.of(),
            @JsonProperty("example")
            @ExcludeMissing
            example: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("flow_action")
            @ExcludeMissing
            flowAction: JsonField<FlowAction> = JsonMissing.of(),
            @JsonProperty("flow_id") @ExcludeMissing flowId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("navigate_screen")
            @ExcludeMissing
            navigateScreen: JsonField<String> = JsonMissing.of(),
            @JsonProperty("otp_type")
            @ExcludeMissing
            otpType: JsonField<OtpType> = JsonMissing.of(),
            @JsonProperty("package_name")
            @ExcludeMissing
            packageName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("phone_number")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("signature_hash")
            @ExcludeMissing
            signatureHash: JsonField<String> = JsonMissing.of(),
            @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
            @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
            @JsonProperty("zero_tap_terms_accepted")
            @ExcludeMissing
            zeroTapTermsAccepted: JsonField<Boolean> = JsonMissing.of(),
        ) : this(
            type,
            autofillText,
            example,
            flowAction,
            flowId,
            navigateScreen,
            otpType,
            packageName,
            phoneNumber,
            signatureHash,
            text,
            url,
            zeroTapTermsAccepted,
            mutableMapOf(),
        )

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * Custom autofill button text for ONE_TAP OTP buttons.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun autofillText(): Optional<String> = autofillText.getOptional("autofill_text")

        /**
         * Sample values for URL variable.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun example(): Optional<List<String>> = example.getOptional("example")

        /**
         * Flow action type for FLOW-type buttons.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun flowAction(): Optional<FlowAction> = flowAction.getOptional("flow_action")

        /**
         * Flow ID for FLOW-type buttons.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun flowId(): Optional<String> = flowId.getOptional("flow_id")

        /**
         * Target screen name for FLOW buttons with navigate action.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun navigateScreen(): Optional<String> = navigateScreen.getOptional("navigate_screen")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun otpType(): Optional<OtpType> = otpType.getOptional("otp_type")

        /**
         * Android package name. Required for ONE_TAP OTP buttons.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun packageName(): Optional<String> = packageName.getOptional("package_name")

        /**
         * Phone number in E.164 format.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phone_number")

        /**
         * Android app signing key hash. Required for ONE_TAP OTP buttons.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun signatureHash(): Optional<String> = signatureHash.getOptional("signature_hash")

        /**
         * Button label text. Maximum 25 characters. Required for URL, PHONE_NUMBER, and QUICK_REPLY
         * buttons. Not required for OTP buttons (Meta supplies the label).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun text(): Optional<String> = text.getOptional("text")

        /**
         * URL for URL-type buttons. Supports one variable ({{1}}).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun url(): Optional<String> = url.getOptional("url")

        /**
         * Whether zero-tap terms have been accepted.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun zeroTapTermsAccepted(): Optional<Boolean> =
            zeroTapTermsAccepted.getOptional("zero_tap_terms_accepted")

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [autofillText].
         *
         * Unlike [autofillText], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("autofill_text")
        @ExcludeMissing
        fun _autofillText(): JsonField<String> = autofillText

        /**
         * Returns the raw JSON value of [example].
         *
         * Unlike [example], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("example") @ExcludeMissing fun _example(): JsonField<List<String>> = example

        /**
         * Returns the raw JSON value of [flowAction].
         *
         * Unlike [flowAction], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("flow_action")
        @ExcludeMissing
        fun _flowAction(): JsonField<FlowAction> = flowAction

        /**
         * Returns the raw JSON value of [flowId].
         *
         * Unlike [flowId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("flow_id") @ExcludeMissing fun _flowId(): JsonField<String> = flowId

        /**
         * Returns the raw JSON value of [navigateScreen].
         *
         * Unlike [navigateScreen], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("navigate_screen")
        @ExcludeMissing
        fun _navigateScreen(): JsonField<String> = navigateScreen

        /**
         * Returns the raw JSON value of [otpType].
         *
         * Unlike [otpType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("otp_type") @ExcludeMissing fun _otpType(): JsonField<OtpType> = otpType

        /**
         * Returns the raw JSON value of [packageName].
         *
         * Unlike [packageName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("package_name")
        @ExcludeMissing
        fun _packageName(): JsonField<String> = packageName

        /**
         * Returns the raw JSON value of [phoneNumber].
         *
         * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phone_number")
        @ExcludeMissing
        fun _phoneNumber(): JsonField<String> = phoneNumber

        /**
         * Returns the raw JSON value of [signatureHash].
         *
         * Unlike [signatureHash], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("signature_hash")
        @ExcludeMissing
        fun _signatureHash(): JsonField<String> = signatureHash

        /**
         * Returns the raw JSON value of [text].
         *
         * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

        /**
         * Returns the raw JSON value of [url].
         *
         * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

        /**
         * Returns the raw JSON value of [zeroTapTermsAccepted].
         *
         * Unlike [zeroTapTermsAccepted], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("zero_tap_terms_accepted")
        @ExcludeMissing
        fun _zeroTapTermsAccepted(): JsonField<Boolean> = zeroTapTermsAccepted

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
             * Returns a mutable builder for constructing an instance of [Button].
             *
             * The following fields are required:
             * ```java
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Button]. */
        class Builder internal constructor() {

            private var type: JsonField<Type>? = null
            private var autofillText: JsonField<String> = JsonMissing.of()
            private var example: JsonField<MutableList<String>>? = null
            private var flowAction: JsonField<FlowAction> = JsonMissing.of()
            private var flowId: JsonField<String> = JsonMissing.of()
            private var navigateScreen: JsonField<String> = JsonMissing.of()
            private var otpType: JsonField<OtpType> = JsonMissing.of()
            private var packageName: JsonField<String> = JsonMissing.of()
            private var phoneNumber: JsonField<String> = JsonMissing.of()
            private var signatureHash: JsonField<String> = JsonMissing.of()
            private var text: JsonField<String> = JsonMissing.of()
            private var url: JsonField<String> = JsonMissing.of()
            private var zeroTapTermsAccepted: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(button: Button) = apply {
                type = button.type
                autofillText = button.autofillText
                example = button.example.map { it.toMutableList() }
                flowAction = button.flowAction
                flowId = button.flowId
                navigateScreen = button.navigateScreen
                otpType = button.otpType
                packageName = button.packageName
                phoneNumber = button.phoneNumber
                signatureHash = button.signatureHash
                text = button.text
                url = button.url
                zeroTapTermsAccepted = button.zeroTapTermsAccepted
                additionalProperties = button.additionalProperties.toMutableMap()
            }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /** Custom autofill button text for ONE_TAP OTP buttons. */
            fun autofillText(autofillText: String) = autofillText(JsonField.of(autofillText))

            /**
             * Sets [Builder.autofillText] to an arbitrary JSON value.
             *
             * You should usually call [Builder.autofillText] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun autofillText(autofillText: JsonField<String>) = apply {
                this.autofillText = autofillText
            }

            /** Sample values for URL variable. */
            fun example(example: List<String>) = example(JsonField.of(example))

            /**
             * Sets [Builder.example] to an arbitrary JSON value.
             *
             * You should usually call [Builder.example] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun example(example: JsonField<List<String>>) = apply {
                this.example = example.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.example].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addExample(example: String) = apply {
                this.example =
                    (this.example ?: JsonField.of(mutableListOf())).also {
                        checkKnown("example", it).add(example)
                    }
            }

            /** Flow action type for FLOW-type buttons. */
            fun flowAction(flowAction: FlowAction) = flowAction(JsonField.of(flowAction))

            /**
             * Sets [Builder.flowAction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.flowAction] with a well-typed [FlowAction] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun flowAction(flowAction: JsonField<FlowAction>) = apply {
                this.flowAction = flowAction
            }

            /** Flow ID for FLOW-type buttons. */
            fun flowId(flowId: String) = flowId(JsonField.of(flowId))

            /**
             * Sets [Builder.flowId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.flowId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun flowId(flowId: JsonField<String>) = apply { this.flowId = flowId }

            /** Target screen name for FLOW buttons with navigate action. */
            fun navigateScreen(navigateScreen: String) =
                navigateScreen(JsonField.of(navigateScreen))

            /**
             * Sets [Builder.navigateScreen] to an arbitrary JSON value.
             *
             * You should usually call [Builder.navigateScreen] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun navigateScreen(navigateScreen: JsonField<String>) = apply {
                this.navigateScreen = navigateScreen
            }

            fun otpType(otpType: OtpType) = otpType(JsonField.of(otpType))

            /**
             * Sets [Builder.otpType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.otpType] with a well-typed [OtpType] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun otpType(otpType: JsonField<OtpType>) = apply { this.otpType = otpType }

            /** Android package name. Required for ONE_TAP OTP buttons. */
            fun packageName(packageName: String) = packageName(JsonField.of(packageName))

            /**
             * Sets [Builder.packageName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.packageName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun packageName(packageName: JsonField<String>) = apply {
                this.packageName = packageName
            }

            /** Phone number in E.164 format. */
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

            /** Android app signing key hash. Required for ONE_TAP OTP buttons. */
            fun signatureHash(signatureHash: String) = signatureHash(JsonField.of(signatureHash))

            /**
             * Sets [Builder.signatureHash] to an arbitrary JSON value.
             *
             * You should usually call [Builder.signatureHash] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun signatureHash(signatureHash: JsonField<String>) = apply {
                this.signatureHash = signatureHash
            }

            /**
             * Button label text. Maximum 25 characters. Required for URL, PHONE_NUMBER, and
             * QUICK_REPLY buttons. Not required for OTP buttons (Meta supplies the label).
             */
            fun text(text: String) = text(JsonField.of(text))

            /**
             * Sets [Builder.text] to an arbitrary JSON value.
             *
             * You should usually call [Builder.text] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun text(text: JsonField<String>) = apply { this.text = text }

            /** URL for URL-type buttons. Supports one variable ({{1}}). */
            fun url(url: String) = url(JsonField.of(url))

            /**
             * Sets [Builder.url] to an arbitrary JSON value.
             *
             * You should usually call [Builder.url] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun url(url: JsonField<String>) = apply { this.url = url }

            /** Whether zero-tap terms have been accepted. */
            fun zeroTapTermsAccepted(zeroTapTermsAccepted: Boolean) =
                zeroTapTermsAccepted(JsonField.of(zeroTapTermsAccepted))

            /**
             * Sets [Builder.zeroTapTermsAccepted] to an arbitrary JSON value.
             *
             * You should usually call [Builder.zeroTapTermsAccepted] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun zeroTapTermsAccepted(zeroTapTermsAccepted: JsonField<Boolean>) = apply {
                this.zeroTapTermsAccepted = zeroTapTermsAccepted
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
             * Returns an immutable instance of [Button].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Button =
                Button(
                    checkRequired("type", type),
                    autofillText,
                    (example ?: JsonMissing.of()).map { it.toImmutable() },
                    flowAction,
                    flowId,
                    navigateScreen,
                    otpType,
                    packageName,
                    phoneNumber,
                    signatureHash,
                    text,
                    url,
                    zeroTapTermsAccepted,
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
        fun validate(): Button = apply {
            if (validated) {
                return@apply
            }

            type().validate()
            autofillText()
            example()
            flowAction().ifPresent { it.validate() }
            flowId()
            navigateScreen()
            otpType().ifPresent { it.validate() }
            packageName()
            phoneNumber()
            signatureHash()
            text()
            url()
            zeroTapTermsAccepted()
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
            (type.asKnown().getOrNull()?.validity() ?: 0) +
                (if (autofillText.asKnown().isPresent) 1 else 0) +
                (example.asKnown().getOrNull()?.size ?: 0) +
                (flowAction.asKnown().getOrNull()?.validity() ?: 0) +
                (if (flowId.asKnown().isPresent) 1 else 0) +
                (if (navigateScreen.asKnown().isPresent) 1 else 0) +
                (otpType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (packageName.asKnown().isPresent) 1 else 0) +
                (if (phoneNumber.asKnown().isPresent) 1 else 0) +
                (if (signatureHash.asKnown().isPresent) 1 else 0) +
                (if (text.asKnown().isPresent) 1 else 0) +
                (if (url.asKnown().isPresent) 1 else 0) +
                (if (zeroTapTermsAccepted.asKnown().isPresent) 1 else 0)

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val URL = of("URL")

                @JvmField val PHONE_NUMBER = of("PHONE_NUMBER")

                @JvmField val QUICK_REPLY = of("QUICK_REPLY")

                @JvmField val OTP = of("OTP")

                @JvmField val COPY_CODE = of("COPY_CODE")

                @JvmField val FLOW = of("FLOW")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                URL,
                PHONE_NUMBER,
                QUICK_REPLY,
                OTP,
                COPY_CODE,
                FLOW,
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                URL,
                PHONE_NUMBER,
                QUICK_REPLY,
                OTP,
                COPY_CODE,
                FLOW,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                    URL -> Value.URL
                    PHONE_NUMBER -> Value.PHONE_NUMBER
                    QUICK_REPLY -> Value.QUICK_REPLY
                    OTP -> Value.OTP
                    COPY_CODE -> Value.COPY_CODE
                    FLOW -> Value.FLOW
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
                    URL -> Known.URL
                    PHONE_NUMBER -> Known.PHONE_NUMBER
                    QUICK_REPLY -> Known.QUICK_REPLY
                    OTP -> Known.OTP
                    COPY_CODE -> Known.COPY_CODE
                    FLOW -> Known.FLOW
                    else -> throw TelnyxInvalidDataException("Unknown Type: $value")
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

        /** Flow action type for FLOW-type buttons. */
        class FlowAction @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val NAVIGATE = of("navigate")

                @JvmField val DATA_EXCHANGE = of("data_exchange")

                @JvmStatic fun of(value: String) = FlowAction(JsonField.of(value))
            }

            /** An enum containing [FlowAction]'s known values. */
            enum class Known {
                NAVIGATE,
                DATA_EXCHANGE,
            }

            /**
             * An enum containing [FlowAction]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [FlowAction] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                NAVIGATE,
                DATA_EXCHANGE,
                /**
                 * An enum member indicating that [FlowAction] was instantiated with an unknown
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
                    NAVIGATE -> Value.NAVIGATE
                    DATA_EXCHANGE -> Value.DATA_EXCHANGE
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
                    NAVIGATE -> Known.NAVIGATE
                    DATA_EXCHANGE -> Known.DATA_EXCHANGE
                    else -> throw TelnyxInvalidDataException("Unknown FlowAction: $value")
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
            fun validate(): FlowAction = apply {
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

                return other is FlowAction && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class OtpType @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val COPY_CODE = of("COPY_CODE")

                @JvmField val ONE_TAP = of("ONE_TAP")

                @JvmStatic fun of(value: String) = OtpType(JsonField.of(value))
            }

            /** An enum containing [OtpType]'s known values. */
            enum class Known {
                COPY_CODE,
                ONE_TAP,
            }

            /**
             * An enum containing [OtpType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [OtpType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                COPY_CODE,
                ONE_TAP,
                /**
                 * An enum member indicating that [OtpType] was instantiated with an unknown value.
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
                    COPY_CODE -> Value.COPY_CODE
                    ONE_TAP -> Value.ONE_TAP
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
                    COPY_CODE -> Known.COPY_CODE
                    ONE_TAP -> Known.ONE_TAP
                    else -> throw TelnyxInvalidDataException("Unknown OtpType: $value")
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
            fun validate(): OtpType = apply {
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

                return other is OtpType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Button &&
                type == other.type &&
                autofillText == other.autofillText &&
                example == other.example &&
                flowAction == other.flowAction &&
                flowId == other.flowId &&
                navigateScreen == other.navigateScreen &&
                otpType == other.otpType &&
                packageName == other.packageName &&
                phoneNumber == other.phoneNumber &&
                signatureHash == other.signatureHash &&
                text == other.text &&
                url == other.url &&
                zeroTapTermsAccepted == other.zeroTapTermsAccepted &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                type,
                autofillText,
                example,
                flowAction,
                flowId,
                navigateScreen,
                otpType,
                packageName,
                phoneNumber,
                signatureHash,
                text,
                url,
                zeroTapTermsAccepted,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Button{type=$type, autofillText=$autofillText, example=$example, flowAction=$flowAction, flowId=$flowId, navigateScreen=$navigateScreen, otpType=$otpType, packageName=$packageName, phoneNumber=$phoneNumber, signatureHash=$signatureHash, text=$text, url=$url, zeroTapTermsAccepted=$zeroTapTermsAccepted, additionalProperties=$additionalProperties}"
    }

    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val BUTTONS = of("BUTTONS")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            BUTTONS
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BUTTONS,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                BUTTONS -> Value.BUTTONS
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
                BUTTONS -> Known.BUTTONS
                else -> throw TelnyxInvalidDataException("Unknown Type: $value")
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

        return other is WhatsappTemplateButtonsComponent &&
            buttons == other.buttons &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(buttons, type, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WhatsappTemplateButtonsComponent{buttons=$buttons, type=$type, additionalProperties=$additionalProperties}"
}
