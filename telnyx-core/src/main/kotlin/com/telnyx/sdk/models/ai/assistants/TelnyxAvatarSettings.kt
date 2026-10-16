// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

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
import kotlin.jvm.optionals.getOrNull

/**
 * **Beta:** Configuration for the Telnyx open-source avatar provider. Use a stock avatar or an
 * organization-owned custom avatar returned by the Avatars API. Discover the available stock
 * catalog with GET /v2/ai/avatars and filter[avatar_type]=stock; follow meta.total_pages to load
 * every page. Supported backgrounds are office, studio, and reception.
 */
class TelnyxAvatarSettings
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val avatarId: JsonField<String>,
    private val backgroundId: JsonField<BackgroundId>,
    private val model: JsonField<Model>,
    private val provider: JsonValue,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("avatar_id") @ExcludeMissing avatarId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("background_id")
        @ExcludeMissing
        backgroundId: JsonField<BackgroundId> = JsonMissing.of(),
        @JsonProperty("model") @ExcludeMissing model: JsonField<Model> = JsonMissing.of(),
        @JsonProperty("provider") @ExcludeMissing provider: JsonValue = JsonMissing.of(),
    ) : this(avatarId, backgroundId, model, provider, mutableMapOf())

    /**
     * The Telnyx stock avatar or organization-owned custom avatar to render.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun avatarId(): String = avatarId.getRequired("avatar_id")

    /**
     * The background to render.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun backgroundId(): BackgroundId = backgroundId.getRequired("background_id")

    /**
     * Required avatar model identifier, separate from `avatar_id`. The supported value is
     * `foxtrot-1`. Omission, null, and unsupported model identifiers are rejected.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun model(): Model = model.getRequired("model")

    /**
     * Selects the Telnyx open-source avatar provider.
     *
     * Expected to always return the following:
     * ```java
     * JsonValue.from("telnyx")
     * ```
     *
     * However, this method can be useful for debugging and logging (e.g. if the server responded
     * with an unexpected value).
     */
    @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonValue = provider

    /**
     * Returns the raw JSON value of [avatarId].
     *
     * Unlike [avatarId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("avatar_id") @ExcludeMissing fun _avatarId(): JsonField<String> = avatarId

    /**
     * Returns the raw JSON value of [backgroundId].
     *
     * Unlike [backgroundId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("background_id")
    @ExcludeMissing
    fun _backgroundId(): JsonField<BackgroundId> = backgroundId

    /**
     * Returns the raw JSON value of [model].
     *
     * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<Model> = model

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
         * Returns a mutable builder for constructing an instance of [TelnyxAvatarSettings].
         *
         * The following fields are required:
         * ```java
         * .avatarId()
         * .backgroundId()
         * .model()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TelnyxAvatarSettings]. */
    class Builder internal constructor() {

        private var avatarId: JsonField<String>? = null
        private var backgroundId: JsonField<BackgroundId>? = null
        private var model: JsonField<Model>? = null
        private var provider: JsonValue = JsonValue.from("telnyx")
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(telnyxAvatarSettings: TelnyxAvatarSettings) = apply {
            avatarId = telnyxAvatarSettings.avatarId
            backgroundId = telnyxAvatarSettings.backgroundId
            model = telnyxAvatarSettings.model
            provider = telnyxAvatarSettings.provider
            additionalProperties = telnyxAvatarSettings.additionalProperties.toMutableMap()
        }

        /** The Telnyx stock avatar or organization-owned custom avatar to render. */
        fun avatarId(avatarId: String) = avatarId(JsonField.of(avatarId))

        /**
         * Sets [Builder.avatarId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.avatarId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun avatarId(avatarId: JsonField<String>) = apply { this.avatarId = avatarId }

        /** The background to render. */
        fun backgroundId(backgroundId: BackgroundId) = backgroundId(JsonField.of(backgroundId))

        /**
         * Sets [Builder.backgroundId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.backgroundId] with a well-typed [BackgroundId] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun backgroundId(backgroundId: JsonField<BackgroundId>) = apply {
            this.backgroundId = backgroundId
        }

        /**
         * Required avatar model identifier, separate from `avatar_id`. The supported value is
         * `foxtrot-1`. Omission, null, and unsupported model identifiers are rejected.
         */
        fun model(model: Model) = model(JsonField.of(model))

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [Model] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: JsonField<Model>) = apply { this.model = model }

        /**
         * Sets the field to an arbitrary JSON value.
         *
         * It is usually unnecessary to call this method because the field defaults to the
         * following:
         * ```java
         * JsonValue.from("telnyx")
         * ```
         *
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun provider(provider: JsonValue) = apply { this.provider = provider }

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
         * Returns an immutable instance of [TelnyxAvatarSettings].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .avatarId()
         * .backgroundId()
         * .model()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TelnyxAvatarSettings =
            TelnyxAvatarSettings(
                checkRequired("avatarId", avatarId),
                checkRequired("backgroundId", backgroundId),
                checkRequired("model", model),
                provider,
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
    fun validate(): TelnyxAvatarSettings = apply {
        if (validated) {
            return@apply
        }

        avatarId()
        backgroundId().validate()
        model().validate()
        _provider().let {
            if (it != JsonValue.from("telnyx")) {
                throw TelnyxInvalidDataException("'provider' is invalid, received $it")
            }
        }
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
        (if (avatarId.asKnown().isPresent) 1 else 0) +
            (backgroundId.asKnown().getOrNull()?.validity() ?: 0) +
            (model.asKnown().getOrNull()?.validity() ?: 0) +
            provider.let { if (it == JsonValue.from("telnyx")) 1 else 0 }

    /** The background to render. */
    class BackgroundId @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val OFFICE = of("office")

            @JvmField val STUDIO = of("studio")

            @JvmField val RECEPTION = of("reception")

            @JvmStatic fun of(value: String) = BackgroundId(JsonField.of(value))
        }

        /** An enum containing [BackgroundId]'s known values. */
        enum class Known {
            OFFICE,
            STUDIO,
            RECEPTION,
        }

        /**
         * An enum containing [BackgroundId]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [BackgroundId] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            OFFICE,
            STUDIO,
            RECEPTION,
            /**
             * An enum member indicating that [BackgroundId] was instantiated with an unknown value.
             */
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
                OFFICE -> Value.OFFICE
                STUDIO -> Value.STUDIO
                RECEPTION -> Value.RECEPTION
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
                OFFICE -> Known.OFFICE
                STUDIO -> Known.STUDIO
                RECEPTION -> Known.RECEPTION
                else -> throw TelnyxInvalidDataException("Unknown BackgroundId: $value")
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
        fun validate(): BackgroundId = apply {
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

            return other is BackgroundId && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Required avatar model identifier, separate from `avatar_id`. The supported value is
     * `foxtrot-1`. Omission, null, and unsupported model identifiers are rejected.
     */
    class Model @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val FOXTROT_1 = of("foxtrot-1")

            @JvmStatic fun of(value: String) = Model(JsonField.of(value))
        }

        /** An enum containing [Model]'s known values. */
        enum class Known {
            FOXTROT_1
        }

        /**
         * An enum containing [Model]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Model] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            FOXTROT_1,
            /** An enum member indicating that [Model] was instantiated with an unknown value. */
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
                FOXTROT_1 -> Value.FOXTROT_1
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
                FOXTROT_1 -> Known.FOXTROT_1
                else -> throw TelnyxInvalidDataException("Unknown Model: $value")
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
        fun validate(): Model = apply {
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

            return other is Model && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TelnyxAvatarSettings &&
            avatarId == other.avatarId &&
            backgroundId == other.backgroundId &&
            model == other.model &&
            provider == other.provider &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(avatarId, backgroundId, model, provider, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TelnyxAvatarSettings{avatarId=$avatarId, backgroundId=$backgroundId, model=$model, provider=$provider, additionalProperties=$additionalProperties}"
}
