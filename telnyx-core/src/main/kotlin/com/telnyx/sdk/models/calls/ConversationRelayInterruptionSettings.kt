// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import com.telnyx.sdk.models.calls.actions.ConversationRelayInterruptible
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Settings for handling caller interruptions during Conversation Relay speech. */
class ConversationRelayInterruptionSettings
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val enable: JsonField<Boolean>,
    private val interruptible: JsonField<ConversationRelayInterruptible>,
    private val interruptibleGreeting: JsonField<ConversationRelayInterruptible>,
    private val welcomeGreetingInterruptible: JsonField<ConversationRelayInterruptible>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("enable") @ExcludeMissing enable: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("interruptible")
        @ExcludeMissing
        interruptible: JsonField<ConversationRelayInterruptible> = JsonMissing.of(),
        @JsonProperty("interruptible_greeting")
        @ExcludeMissing
        interruptibleGreeting: JsonField<ConversationRelayInterruptible> = JsonMissing.of(),
        @JsonProperty("welcome_greeting_interruptible")
        @ExcludeMissing
        welcomeGreetingInterruptible: JsonField<ConversationRelayInterruptible> = JsonMissing.of(),
    ) : this(
        enable,
        interruptible,
        interruptibleGreeting,
        welcomeGreetingInterruptible,
        mutableMapOf(),
    )

    /**
     * Legacy boolean form. `true` is equivalent to `interruptible=any`; `false` is equivalent to
     * `interruptible=none`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enable(): Optional<Boolean> = enable.getOptional("enable")

    /**
     * Controls when caller input can interrupt assistant speech. `any` allows speech or DTMF
     * interruptions; `none` disables interruptions; `speech` allows speech only; `dtmf` allows DTMF
     * only.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun interruptible(): Optional<ConversationRelayInterruptible> =
        interruptible.getOptional("interruptible")

    /**
     * Controls when caller input can interrupt assistant speech. `any` allows speech or DTMF
     * interruptions; `none` disables interruptions; `speech` allows speech only; `dtmf` allows DTMF
     * only.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun interruptibleGreeting(): Optional<ConversationRelayInterruptible> =
        interruptibleGreeting.getOptional("interruptible_greeting")

    /**
     * Controls when caller input can interrupt assistant speech. `any` allows speech or DTMF
     * interruptions; `none` disables interruptions; `speech` allows speech only; `dtmf` allows DTMF
     * only.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun welcomeGreetingInterruptible(): Optional<ConversationRelayInterruptible> =
        welcomeGreetingInterruptible.getOptional("welcome_greeting_interruptible")

    /**
     * Returns the raw JSON value of [enable].
     *
     * Unlike [enable], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("enable") @ExcludeMissing fun _enable(): JsonField<Boolean> = enable

    /**
     * Returns the raw JSON value of [interruptible].
     *
     * Unlike [interruptible], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("interruptible")
    @ExcludeMissing
    fun _interruptible(): JsonField<ConversationRelayInterruptible> = interruptible

    /**
     * Returns the raw JSON value of [interruptibleGreeting].
     *
     * Unlike [interruptibleGreeting], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("interruptible_greeting")
    @ExcludeMissing
    fun _interruptibleGreeting(): JsonField<ConversationRelayInterruptible> = interruptibleGreeting

    /**
     * Returns the raw JSON value of [welcomeGreetingInterruptible].
     *
     * Unlike [welcomeGreetingInterruptible], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("welcome_greeting_interruptible")
    @ExcludeMissing
    fun _welcomeGreetingInterruptible(): JsonField<ConversationRelayInterruptible> =
        welcomeGreetingInterruptible

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
         * [ConversationRelayInterruptionSettings].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ConversationRelayInterruptionSettings]. */
    class Builder internal constructor() {

        private var enable: JsonField<Boolean> = JsonMissing.of()
        private var interruptible: JsonField<ConversationRelayInterruptible> = JsonMissing.of()
        private var interruptibleGreeting: JsonField<ConversationRelayInterruptible> =
            JsonMissing.of()
        private var welcomeGreetingInterruptible: JsonField<ConversationRelayInterruptible> =
            JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            conversationRelayInterruptionSettings: ConversationRelayInterruptionSettings
        ) = apply {
            enable = conversationRelayInterruptionSettings.enable
            interruptible = conversationRelayInterruptionSettings.interruptible
            interruptibleGreeting = conversationRelayInterruptionSettings.interruptibleGreeting
            welcomeGreetingInterruptible =
                conversationRelayInterruptionSettings.welcomeGreetingInterruptible
            additionalProperties =
                conversationRelayInterruptionSettings.additionalProperties.toMutableMap()
        }

        /**
         * Legacy boolean form. `true` is equivalent to `interruptible=any`; `false` is equivalent
         * to `interruptible=none`.
         */
        fun enable(enable: Boolean) = enable(JsonField.of(enable))

        /**
         * Sets [Builder.enable] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enable] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun enable(enable: JsonField<Boolean>) = apply { this.enable = enable }

        /**
         * Controls when caller input can interrupt assistant speech. `any` allows speech or DTMF
         * interruptions; `none` disables interruptions; `speech` allows speech only; `dtmf` allows
         * DTMF only.
         */
        fun interruptible(interruptible: ConversationRelayInterruptible) =
            interruptible(JsonField.of(interruptible))

        /**
         * Sets [Builder.interruptible] to an arbitrary JSON value.
         *
         * You should usually call [Builder.interruptible] with a well-typed
         * [ConversationRelayInterruptible] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun interruptible(interruptible: JsonField<ConversationRelayInterruptible>) = apply {
            this.interruptible = interruptible
        }

        /**
         * Controls when caller input can interrupt assistant speech. `any` allows speech or DTMF
         * interruptions; `none` disables interruptions; `speech` allows speech only; `dtmf` allows
         * DTMF only.
         */
        fun interruptibleGreeting(interruptibleGreeting: ConversationRelayInterruptible) =
            interruptibleGreeting(JsonField.of(interruptibleGreeting))

        /**
         * Sets [Builder.interruptibleGreeting] to an arbitrary JSON value.
         *
         * You should usually call [Builder.interruptibleGreeting] with a well-typed
         * [ConversationRelayInterruptible] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun interruptibleGreeting(
            interruptibleGreeting: JsonField<ConversationRelayInterruptible>
        ) = apply { this.interruptibleGreeting = interruptibleGreeting }

        /**
         * Controls when caller input can interrupt assistant speech. `any` allows speech or DTMF
         * interruptions; `none` disables interruptions; `speech` allows speech only; `dtmf` allows
         * DTMF only.
         */
        fun welcomeGreetingInterruptible(
            welcomeGreetingInterruptible: ConversationRelayInterruptible
        ) = welcomeGreetingInterruptible(JsonField.of(welcomeGreetingInterruptible))

        /**
         * Sets [Builder.welcomeGreetingInterruptible] to an arbitrary JSON value.
         *
         * You should usually call [Builder.welcomeGreetingInterruptible] with a well-typed
         * [ConversationRelayInterruptible] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun welcomeGreetingInterruptible(
            welcomeGreetingInterruptible: JsonField<ConversationRelayInterruptible>
        ) = apply { this.welcomeGreetingInterruptible = welcomeGreetingInterruptible }

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
         * Returns an immutable instance of [ConversationRelayInterruptionSettings].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ConversationRelayInterruptionSettings =
            ConversationRelayInterruptionSettings(
                enable,
                interruptible,
                interruptibleGreeting,
                welcomeGreetingInterruptible,
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
    fun validate(): ConversationRelayInterruptionSettings = apply {
        if (validated) {
            return@apply
        }

        enable()
        interruptible().ifPresent { it.validate() }
        interruptibleGreeting().ifPresent { it.validate() }
        welcomeGreetingInterruptible().ifPresent { it.validate() }
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
        (if (enable.asKnown().isPresent) 1 else 0) +
            (interruptible.asKnown().getOrNull()?.validity() ?: 0) +
            (interruptibleGreeting.asKnown().getOrNull()?.validity() ?: 0) +
            (welcomeGreetingInterruptible.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ConversationRelayInterruptionSettings &&
            enable == other.enable &&
            interruptible == other.interruptible &&
            interruptibleGreeting == other.interruptibleGreeting &&
            welcomeGreetingInterruptible == other.welcomeGreetingInterruptible &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            enable,
            interruptible,
            interruptibleGreeting,
            welcomeGreetingInterruptible,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ConversationRelayInterruptionSettings{enable=$enable, interruptible=$interruptible, interruptibleGreeting=$interruptibleGreeting, welcomeGreetingInterruptible=$welcomeGreetingInterruptible, additionalProperties=$additionalProperties}"
}
