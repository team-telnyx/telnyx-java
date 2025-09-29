// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.assistants

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.Enum
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ImportMetadata
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val importId: JsonField<String>,
    private val importProvider: JsonField<ImportProvider>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("import_id") @ExcludeMissing importId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("import_provider")
        @ExcludeMissing
        importProvider: JsonField<ImportProvider> = JsonMissing.of(),
    ) : this(importId, importProvider, mutableMapOf())

    /**
     * ID of the assistant in the provider's system.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun importId(): Optional<String> = importId.getOptional("import_id")

    /**
     * Provider the assistant was imported from.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun importProvider(): Optional<ImportProvider> = importProvider.getOptional("import_provider")

    /**
     * Returns the raw JSON value of [importId].
     *
     * Unlike [importId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("import_id") @ExcludeMissing fun _importId(): JsonField<String> = importId

    /**
     * Returns the raw JSON value of [importProvider].
     *
     * Unlike [importProvider], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("import_provider")
    @ExcludeMissing
    fun _importProvider(): JsonField<ImportProvider> = importProvider

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

        /** Returns a mutable builder for constructing an instance of [ImportMetadata]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ImportMetadata]. */
    class Builder internal constructor() {

        private var importId: JsonField<String> = JsonMissing.of()
        private var importProvider: JsonField<ImportProvider> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(importMetadata: ImportMetadata) = apply {
            importId = importMetadata.importId
            importProvider = importMetadata.importProvider
            additionalProperties = importMetadata.additionalProperties.toMutableMap()
        }

        /** ID of the assistant in the provider's system. */
        fun importId(importId: String) = importId(JsonField.of(importId))

        /**
         * Sets [Builder.importId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.importId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun importId(importId: JsonField<String>) = apply { this.importId = importId }

        /** Provider the assistant was imported from. */
        fun importProvider(importProvider: ImportProvider) =
            importProvider(JsonField.of(importProvider))

        /**
         * Sets [Builder.importProvider] to an arbitrary JSON value.
         *
         * You should usually call [Builder.importProvider] with a well-typed [ImportProvider] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun importProvider(importProvider: JsonField<ImportProvider>) = apply {
            this.importProvider = importProvider
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
         * Returns an immutable instance of [ImportMetadata].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ImportMetadata =
            ImportMetadata(importId, importProvider, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): ImportMetadata = apply {
        if (validated) {
            return@apply
        }

        importId()
        importProvider().ifPresent { it.validate() }
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
        (if (importId.asKnown().isPresent) 1 else 0) +
            (importProvider.asKnown().getOrNull()?.validity() ?: 0)

    /** Provider the assistant was imported from. */
    class ImportProvider @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val ELEVENLABS = of("elevenlabs")

            @JvmField val VAPI = of("vapi")

            @JvmStatic fun of(value: String) = ImportProvider(JsonField.of(value))
        }

        /** An enum containing [ImportProvider]'s known values. */
        enum class Known {
            ELEVENLABS,
            VAPI,
        }

        /**
         * An enum containing [ImportProvider]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ImportProvider] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ELEVENLABS,
            VAPI,
            /**
             * An enum member indicating that [ImportProvider] was instantiated with an unknown
             * value.
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
                ELEVENLABS -> Value.ELEVENLABS
                VAPI -> Value.VAPI
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
                ELEVENLABS -> Known.ELEVENLABS
                VAPI -> Known.VAPI
                else -> throw TelnyxInvalidDataException("Unknown ImportProvider: $value")
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

        fun validate(): ImportProvider = apply {
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

            return other is ImportProvider && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ImportMetadata &&
            importId == other.importId &&
            importProvider == other.importProvider &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(importId, importProvider, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ImportMetadata{importId=$importId, importProvider=$importProvider, additionalProperties=$additionalProperties}"
}
