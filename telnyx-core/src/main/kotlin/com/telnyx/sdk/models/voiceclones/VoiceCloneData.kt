// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.voiceclones

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
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** A voice clone object. */
class VoiceCloneData
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val gender: JsonField<Gender>,
    private val label: JsonField<String>,
    private val language: JsonField<String>,
    private val name: JsonField<String>,
    private val provider: JsonField<Provider>,
    private val providerSupportedModels: JsonField<List<String>>,
    private val providerVoiceId: JsonField<String>,
    private val recordType: JsonField<RecordType>,
    private val sourceVoiceDesignId: JsonField<String>,
    private val sourceVoiceDesignVersion: JsonField<Long>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("gender") @ExcludeMissing gender: JsonField<Gender> = JsonMissing.of(),
        @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
        @JsonProperty("language") @ExcludeMissing language: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("provider") @ExcludeMissing provider: JsonField<Provider> = JsonMissing.of(),
        @JsonProperty("provider_supported_models")
        @ExcludeMissing
        providerSupportedModels: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("provider_voice_id")
        @ExcludeMissing
        providerVoiceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<RecordType> = JsonMissing.of(),
        @JsonProperty("source_voice_design_id")
        @ExcludeMissing
        sourceVoiceDesignId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source_voice_design_version")
        @ExcludeMissing
        sourceVoiceDesignVersion: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        gender,
        label,
        language,
        name,
        provider,
        providerSupportedModels,
        providerVoiceId,
        recordType,
        sourceVoiceDesignId,
        sourceVoiceDesignVersion,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * Unique identifier for the voice clone.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Timestamp when the voice clone was created.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * Gender of the voice clone.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun gender(): Optional<Gender> = gender.getOptional("gender")

    /**
     * Voice style description. If not explicitly set on upload, falls back to the source design's
     * prompt text.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun label(): Optional<String> = label.getOptional("label")

    /**
     * ISO 639-1 language code of the voice clone.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun language(): Optional<String> = language.getOptional("language")

    /**
     * Name of the voice clone.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * Voice synthesis provider used for this clone.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun provider(): Optional<Provider> = provider.getOptional("provider")

    /**
     * List of TTS model identifiers supported by this clone's provider.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun providerSupportedModels(): Optional<List<String>> =
        providerSupportedModels.getOptional("provider_supported_models")

    /**
     * Provider-specific voice identifier used for TTS synthesis. For Telnyx clones this equals the
     * clone ID; for Minimax it is the Minimax-assigned voice ID.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun providerVoiceId(): Optional<String> = providerVoiceId.getOptional("provider_voice_id")

    /**
     * Identifies the resource type.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordType(): Optional<RecordType> = recordType.getOptional("record_type")

    /**
     * UUID of the source voice design. `null` for upload-based clones.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sourceVoiceDesignId(): Optional<String> =
        sourceVoiceDesignId.getOptional("source_voice_design_id")

    /**
     * Version of the source voice design used. `null` for upload-based clones.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sourceVoiceDesignVersion(): Optional<Long> =
        sourceVoiceDesignVersion.getOptional("source_voice_design_version")

    /**
     * Timestamp when the voice clone was last updated.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [gender].
     *
     * Unlike [gender], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("gender") @ExcludeMissing fun _gender(): JsonField<Gender> = gender

    /**
     * Returns the raw JSON value of [label].
     *
     * Unlike [label], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("label") @ExcludeMissing fun _label(): JsonField<String> = label

    /**
     * Returns the raw JSON value of [language].
     *
     * Unlike [language], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("language") @ExcludeMissing fun _language(): JsonField<String> = language

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [provider].
     *
     * Unlike [provider], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonField<Provider> = provider

    /**
     * Returns the raw JSON value of [providerSupportedModels].
     *
     * Unlike [providerSupportedModels], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("provider_supported_models")
    @ExcludeMissing
    fun _providerSupportedModels(): JsonField<List<String>> = providerSupportedModels

    /**
     * Returns the raw JSON value of [providerVoiceId].
     *
     * Unlike [providerVoiceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("provider_voice_id")
    @ExcludeMissing
    fun _providerVoiceId(): JsonField<String> = providerVoiceId

    /**
     * Returns the raw JSON value of [recordType].
     *
     * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("record_type")
    @ExcludeMissing
    fun _recordType(): JsonField<RecordType> = recordType

    /**
     * Returns the raw JSON value of [sourceVoiceDesignId].
     *
     * Unlike [sourceVoiceDesignId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("source_voice_design_id")
    @ExcludeMissing
    fun _sourceVoiceDesignId(): JsonField<String> = sourceVoiceDesignId

    /**
     * Returns the raw JSON value of [sourceVoiceDesignVersion].
     *
     * Unlike [sourceVoiceDesignVersion], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("source_voice_design_version")
    @ExcludeMissing
    fun _sourceVoiceDesignVersion(): JsonField<Long> = sourceVoiceDesignVersion

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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

        /** Returns a mutable builder for constructing an instance of [VoiceCloneData]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VoiceCloneData]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var gender: JsonField<Gender> = JsonMissing.of()
        private var label: JsonField<String> = JsonMissing.of()
        private var language: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var provider: JsonField<Provider> = JsonMissing.of()
        private var providerSupportedModels: JsonField<MutableList<String>>? = null
        private var providerVoiceId: JsonField<String> = JsonMissing.of()
        private var recordType: JsonField<RecordType> = JsonMissing.of()
        private var sourceVoiceDesignId: JsonField<String> = JsonMissing.of()
        private var sourceVoiceDesignVersion: JsonField<Long> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(voiceCloneData: VoiceCloneData) = apply {
            id = voiceCloneData.id
            createdAt = voiceCloneData.createdAt
            gender = voiceCloneData.gender
            label = voiceCloneData.label
            language = voiceCloneData.language
            name = voiceCloneData.name
            provider = voiceCloneData.provider
            providerSupportedModels =
                voiceCloneData.providerSupportedModels.map { it.toMutableList() }
            providerVoiceId = voiceCloneData.providerVoiceId
            recordType = voiceCloneData.recordType
            sourceVoiceDesignId = voiceCloneData.sourceVoiceDesignId
            sourceVoiceDesignVersion = voiceCloneData.sourceVoiceDesignVersion
            updatedAt = voiceCloneData.updatedAt
            additionalProperties = voiceCloneData.additionalProperties.toMutableMap()
        }

        /** Unique identifier for the voice clone. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Timestamp when the voice clone was created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Gender of the voice clone. */
        fun gender(gender: Gender?) = gender(JsonField.ofNullable(gender))

        /** Alias for calling [Builder.gender] with `gender.orElse(null)`. */
        fun gender(gender: Optional<Gender>) = gender(gender.getOrNull())

        /**
         * Sets [Builder.gender] to an arbitrary JSON value.
         *
         * You should usually call [Builder.gender] with a well-typed [Gender] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun gender(gender: JsonField<Gender>) = apply { this.gender = gender }

        /**
         * Voice style description. If not explicitly set on upload, falls back to the source
         * design's prompt text.
         */
        fun label(label: String?) = label(JsonField.ofNullable(label))

        /** Alias for calling [Builder.label] with `label.orElse(null)`. */
        fun label(label: Optional<String>) = label(label.getOrNull())

        /**
         * Sets [Builder.label] to an arbitrary JSON value.
         *
         * You should usually call [Builder.label] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun label(label: JsonField<String>) = apply { this.label = label }

        /** ISO 639-1 language code of the voice clone. */
        fun language(language: String?) = language(JsonField.ofNullable(language))

        /** Alias for calling [Builder.language] with `language.orElse(null)`. */
        fun language(language: Optional<String>) = language(language.getOrNull())

        /**
         * Sets [Builder.language] to an arbitrary JSON value.
         *
         * You should usually call [Builder.language] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun language(language: JsonField<String>) = apply { this.language = language }

        /** Name of the voice clone. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Voice synthesis provider used for this clone. */
        fun provider(provider: Provider) = provider(JsonField.of(provider))

        /**
         * Sets [Builder.provider] to an arbitrary JSON value.
         *
         * You should usually call [Builder.provider] with a well-typed [Provider] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun provider(provider: JsonField<Provider>) = apply { this.provider = provider }

        /** List of TTS model identifiers supported by this clone's provider. */
        fun providerSupportedModels(providerSupportedModels: List<String>) =
            providerSupportedModels(JsonField.of(providerSupportedModels))

        /**
         * Sets [Builder.providerSupportedModels] to an arbitrary JSON value.
         *
         * You should usually call [Builder.providerSupportedModels] with a well-typed
         * `List<String>` value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun providerSupportedModels(providerSupportedModels: JsonField<List<String>>) = apply {
            this.providerSupportedModels = providerSupportedModels.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [providerSupportedModels].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addProviderSupportedModel(providerSupportedModel: String) = apply {
            providerSupportedModels =
                (providerSupportedModels ?: JsonField.of(mutableListOf())).also {
                    checkKnown("providerSupportedModels", it).add(providerSupportedModel)
                }
        }

        /**
         * Provider-specific voice identifier used for TTS synthesis. For Telnyx clones this equals
         * the clone ID; for Minimax it is the Minimax-assigned voice ID.
         */
        fun providerVoiceId(providerVoiceId: String?) =
            providerVoiceId(JsonField.ofNullable(providerVoiceId))

        /** Alias for calling [Builder.providerVoiceId] with `providerVoiceId.orElse(null)`. */
        fun providerVoiceId(providerVoiceId: Optional<String>) =
            providerVoiceId(providerVoiceId.getOrNull())

        /**
         * Sets [Builder.providerVoiceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.providerVoiceId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun providerVoiceId(providerVoiceId: JsonField<String>) = apply {
            this.providerVoiceId = providerVoiceId
        }

        /** Identifies the resource type. */
        fun recordType(recordType: RecordType) = recordType(JsonField.of(recordType))

        /**
         * Sets [Builder.recordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordType] with a well-typed [RecordType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recordType(recordType: JsonField<RecordType>) = apply { this.recordType = recordType }

        /** UUID of the source voice design. `null` for upload-based clones. */
        fun sourceVoiceDesignId(sourceVoiceDesignId: String?) =
            sourceVoiceDesignId(JsonField.ofNullable(sourceVoiceDesignId))

        /**
         * Alias for calling [Builder.sourceVoiceDesignId] with `sourceVoiceDesignId.orElse(null)`.
         */
        fun sourceVoiceDesignId(sourceVoiceDesignId: Optional<String>) =
            sourceVoiceDesignId(sourceVoiceDesignId.getOrNull())

        /**
         * Sets [Builder.sourceVoiceDesignId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceVoiceDesignId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sourceVoiceDesignId(sourceVoiceDesignId: JsonField<String>) = apply {
            this.sourceVoiceDesignId = sourceVoiceDesignId
        }

        /** Version of the source voice design used. `null` for upload-based clones. */
        fun sourceVoiceDesignVersion(sourceVoiceDesignVersion: Long?) =
            sourceVoiceDesignVersion(JsonField.ofNullable(sourceVoiceDesignVersion))

        /**
         * Alias for [Builder.sourceVoiceDesignVersion].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun sourceVoiceDesignVersion(sourceVoiceDesignVersion: Long) =
            sourceVoiceDesignVersion(sourceVoiceDesignVersion as Long?)

        /**
         * Alias for calling [Builder.sourceVoiceDesignVersion] with
         * `sourceVoiceDesignVersion.orElse(null)`.
         */
        fun sourceVoiceDesignVersion(sourceVoiceDesignVersion: Optional<Long>) =
            sourceVoiceDesignVersion(sourceVoiceDesignVersion.getOrNull())

        /**
         * Sets [Builder.sourceVoiceDesignVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceVoiceDesignVersion] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sourceVoiceDesignVersion(sourceVoiceDesignVersion: JsonField<Long>) = apply {
            this.sourceVoiceDesignVersion = sourceVoiceDesignVersion
        }

        /** Timestamp when the voice clone was last updated. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [VoiceCloneData].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): VoiceCloneData =
            VoiceCloneData(
                id,
                createdAt,
                gender,
                label,
                language,
                name,
                provider,
                (providerSupportedModels ?: JsonMissing.of()).map { it.toImmutable() },
                providerVoiceId,
                recordType,
                sourceVoiceDesignId,
                sourceVoiceDesignVersion,
                updatedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): VoiceCloneData = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        gender().ifPresent { it.validate() }
        label()
        language()
        name()
        provider().ifPresent { it.validate() }
        providerSupportedModels()
        providerVoiceId()
        recordType().ifPresent { it.validate() }
        sourceVoiceDesignId()
        sourceVoiceDesignVersion()
        updatedAt()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (gender.asKnown().getOrNull()?.validity() ?: 0) +
            (if (label.asKnown().isPresent) 1 else 0) +
            (if (language.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (provider.asKnown().getOrNull()?.validity() ?: 0) +
            (providerSupportedModels.asKnown().getOrNull()?.size ?: 0) +
            (if (providerVoiceId.asKnown().isPresent) 1 else 0) +
            (recordType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (sourceVoiceDesignId.asKnown().isPresent) 1 else 0) +
            (if (sourceVoiceDesignVersion.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    /** Gender of the voice clone. */
    class Gender @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val MALE = of("male")

            @JvmField val FEMALE = of("female")

            @JvmField val NEUTRAL = of("neutral")

            @JvmStatic fun of(value: String) = Gender(JsonField.of(value))
        }

        /** An enum containing [Gender]'s known values. */
        enum class Known {
            MALE,
            FEMALE,
            NEUTRAL,
        }

        /**
         * An enum containing [Gender]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Gender] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            MALE,
            FEMALE,
            NEUTRAL,
            /** An enum member indicating that [Gender] was instantiated with an unknown value. */
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
                MALE -> Value.MALE
                FEMALE -> Value.FEMALE
                NEUTRAL -> Value.NEUTRAL
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
                MALE -> Known.MALE
                FEMALE -> Known.FEMALE
                NEUTRAL -> Known.NEUTRAL
                else -> throw TelnyxInvalidDataException("Unknown Gender: $value")
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

        fun validate(): Gender = apply {
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

            return other is Gender && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Voice synthesis provider used for this clone. */
    class Provider @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val TELNYX = of("telnyx")

            @JvmField val MINIMAX = of("minimax")

            @JvmField val TELNYX = of("Telnyx")

            @JvmField val MINIMAX = of("Minimax")

            @JvmStatic fun of(value: String) = Provider(JsonField.of(value))
        }

        /** An enum containing [Provider]'s known values. */
        enum class Known {
            TELNYX,
            MINIMAX,
            TELNYX,
            MINIMAX,
        }

        /**
         * An enum containing [Provider]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Provider] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TELNYX,
            MINIMAX,
            TELNYX,
            MINIMAX,
            /** An enum member indicating that [Provider] was instantiated with an unknown value. */
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
                TELNYX -> Value.TELNYX
                MINIMAX -> Value.MINIMAX
                TELNYX -> Value.TELNYX
                MINIMAX -> Value.MINIMAX
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
                TELNYX -> Known.TELNYX
                MINIMAX -> Known.MINIMAX
                TELNYX -> Known.TELNYX
                MINIMAX -> Known.MINIMAX
                else -> throw TelnyxInvalidDataException("Unknown Provider: $value")
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

        fun validate(): Provider = apply {
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

            return other is Provider && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Identifies the resource type. */
    class RecordType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val VOICE_CLONE = of("voice_clone")

            @JvmStatic fun of(value: String) = RecordType(JsonField.of(value))
        }

        /** An enum containing [RecordType]'s known values. */
        enum class Known {
            VOICE_CLONE
        }

        /**
         * An enum containing [RecordType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RecordType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            VOICE_CLONE,
            /**
             * An enum member indicating that [RecordType] was instantiated with an unknown value.
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
                VOICE_CLONE -> Value.VOICE_CLONE
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
                VOICE_CLONE -> Known.VOICE_CLONE
                else -> throw TelnyxInvalidDataException("Unknown RecordType: $value")
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

        return other is VoiceCloneData &&
            id == other.id &&
            createdAt == other.createdAt &&
            gender == other.gender &&
            label == other.label &&
            language == other.language &&
            name == other.name &&
            provider == other.provider &&
            providerSupportedModels == other.providerSupportedModels &&
            providerVoiceId == other.providerVoiceId &&
            recordType == other.recordType &&
            sourceVoiceDesignId == other.sourceVoiceDesignId &&
            sourceVoiceDesignVersion == other.sourceVoiceDesignVersion &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            gender,
            label,
            language,
            name,
            provider,
            providerSupportedModels,
            providerVoiceId,
            recordType,
            sourceVoiceDesignId,
            sourceVoiceDesignVersion,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "VoiceCloneData{id=$id, createdAt=$createdAt, gender=$gender, label=$label, language=$language, name=$name, provider=$provider, providerSupportedModels=$providerSupportedModels, providerVoiceId=$providerVoiceId, recordType=$recordType, sourceVoiceDesignId=$sourceVoiceDesignId, sourceVoiceDesignVersion=$sourceVoiceDesignVersion, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
