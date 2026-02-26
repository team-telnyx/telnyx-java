// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messages

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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class WhatsappMessageContent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val audio: JsonField<WhatsappMedia>,
    private val bizOpaqueCallbackData: JsonField<String>,
    private val contacts: JsonField<List<WhatsappContact>>,
    private val document: JsonField<WhatsappMedia>,
    private val image: JsonField<WhatsappMedia>,
    private val interactive: JsonField<WhatsappInteractive>,
    private val location: JsonField<WhatsappLocation>,
    private val reaction: JsonField<WhatsappReaction>,
    private val sticker: JsonField<WhatsappMedia>,
    private val type: JsonField<Type>,
    private val video: JsonField<WhatsappMedia>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("audio") @ExcludeMissing audio: JsonField<WhatsappMedia> = JsonMissing.of(),
        @JsonProperty("biz_opaque_callback_data")
        @ExcludeMissing
        bizOpaqueCallbackData: JsonField<String> = JsonMissing.of(),
        @JsonProperty("contacts")
        @ExcludeMissing
        contacts: JsonField<List<WhatsappContact>> = JsonMissing.of(),
        @JsonProperty("document")
        @ExcludeMissing
        document: JsonField<WhatsappMedia> = JsonMissing.of(),
        @JsonProperty("image") @ExcludeMissing image: JsonField<WhatsappMedia> = JsonMissing.of(),
        @JsonProperty("interactive")
        @ExcludeMissing
        interactive: JsonField<WhatsappInteractive> = JsonMissing.of(),
        @JsonProperty("location")
        @ExcludeMissing
        location: JsonField<WhatsappLocation> = JsonMissing.of(),
        @JsonProperty("reaction")
        @ExcludeMissing
        reaction: JsonField<WhatsappReaction> = JsonMissing.of(),
        @JsonProperty("sticker")
        @ExcludeMissing
        sticker: JsonField<WhatsappMedia> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("video") @ExcludeMissing video: JsonField<WhatsappMedia> = JsonMissing.of(),
    ) : this(
        audio,
        bizOpaqueCallbackData,
        contacts,
        document,
        image,
        interactive,
        location,
        reaction,
        sticker,
        type,
        video,
        mutableMapOf(),
    )

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun audio(): Optional<WhatsappMedia> = audio.getOptional("audio")

    /**
     * custom data to return with status update
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bizOpaqueCallbackData(): Optional<String> =
        bizOpaqueCallbackData.getOptional("biz_opaque_callback_data")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contacts(): Optional<List<WhatsappContact>> = contacts.getOptional("contacts")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun document(): Optional<WhatsappMedia> = document.getOptional("document")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun image(): Optional<WhatsappMedia> = image.getOptional("image")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun interactive(): Optional<WhatsappInteractive> = interactive.getOptional("interactive")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun location(): Optional<WhatsappLocation> = location.getOptional("location")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reaction(): Optional<WhatsappReaction> = reaction.getOptional("reaction")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sticker(): Optional<WhatsappMedia> = sticker.getOptional("sticker")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun type(): Optional<Type> = type.getOptional("type")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun video(): Optional<WhatsappMedia> = video.getOptional("video")

    /**
     * Returns the raw JSON value of [audio].
     *
     * Unlike [audio], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("audio") @ExcludeMissing fun _audio(): JsonField<WhatsappMedia> = audio

    /**
     * Returns the raw JSON value of [bizOpaqueCallbackData].
     *
     * Unlike [bizOpaqueCallbackData], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("biz_opaque_callback_data")
    @ExcludeMissing
    fun _bizOpaqueCallbackData(): JsonField<String> = bizOpaqueCallbackData

    /**
     * Returns the raw JSON value of [contacts].
     *
     * Unlike [contacts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("contacts")
    @ExcludeMissing
    fun _contacts(): JsonField<List<WhatsappContact>> = contacts

    /**
     * Returns the raw JSON value of [document].
     *
     * Unlike [document], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("document") @ExcludeMissing fun _document(): JsonField<WhatsappMedia> = document

    /**
     * Returns the raw JSON value of [image].
     *
     * Unlike [image], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("image") @ExcludeMissing fun _image(): JsonField<WhatsappMedia> = image

    /**
     * Returns the raw JSON value of [interactive].
     *
     * Unlike [interactive], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("interactive")
    @ExcludeMissing
    fun _interactive(): JsonField<WhatsappInteractive> = interactive

    /**
     * Returns the raw JSON value of [location].
     *
     * Unlike [location], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("location")
    @ExcludeMissing
    fun _location(): JsonField<WhatsappLocation> = location

    /**
     * Returns the raw JSON value of [reaction].
     *
     * Unlike [reaction], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reaction")
    @ExcludeMissing
    fun _reaction(): JsonField<WhatsappReaction> = reaction

    /**
     * Returns the raw JSON value of [sticker].
     *
     * Unlike [sticker], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sticker") @ExcludeMissing fun _sticker(): JsonField<WhatsappMedia> = sticker

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [video].
     *
     * Unlike [video], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("video") @ExcludeMissing fun _video(): JsonField<WhatsappMedia> = video

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

        /** Returns a mutable builder for constructing an instance of [WhatsappMessageContent]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WhatsappMessageContent]. */
    class Builder internal constructor() {

        private var audio: JsonField<WhatsappMedia> = JsonMissing.of()
        private var bizOpaqueCallbackData: JsonField<String> = JsonMissing.of()
        private var contacts: JsonField<MutableList<WhatsappContact>>? = null
        private var document: JsonField<WhatsappMedia> = JsonMissing.of()
        private var image: JsonField<WhatsappMedia> = JsonMissing.of()
        private var interactive: JsonField<WhatsappInteractive> = JsonMissing.of()
        private var location: JsonField<WhatsappLocation> = JsonMissing.of()
        private var reaction: JsonField<WhatsappReaction> = JsonMissing.of()
        private var sticker: JsonField<WhatsappMedia> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var video: JsonField<WhatsappMedia> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(whatsappMessageContent: WhatsappMessageContent) = apply {
            audio = whatsappMessageContent.audio
            bizOpaqueCallbackData = whatsappMessageContent.bizOpaqueCallbackData
            contacts = whatsappMessageContent.contacts.map { it.toMutableList() }
            document = whatsappMessageContent.document
            image = whatsappMessageContent.image
            interactive = whatsappMessageContent.interactive
            location = whatsappMessageContent.location
            reaction = whatsappMessageContent.reaction
            sticker = whatsappMessageContent.sticker
            type = whatsappMessageContent.type
            video = whatsappMessageContent.video
            additionalProperties = whatsappMessageContent.additionalProperties.toMutableMap()
        }

        fun audio(audio: WhatsappMedia) = audio(JsonField.of(audio))

        /**
         * Sets [Builder.audio] to an arbitrary JSON value.
         *
         * You should usually call [Builder.audio] with a well-typed [WhatsappMedia] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun audio(audio: JsonField<WhatsappMedia>) = apply { this.audio = audio }

        /** custom data to return with status update */
        fun bizOpaqueCallbackData(bizOpaqueCallbackData: String) =
            bizOpaqueCallbackData(JsonField.of(bizOpaqueCallbackData))

        /**
         * Sets [Builder.bizOpaqueCallbackData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bizOpaqueCallbackData] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun bizOpaqueCallbackData(bizOpaqueCallbackData: JsonField<String>) = apply {
            this.bizOpaqueCallbackData = bizOpaqueCallbackData
        }

        fun contacts(contacts: List<WhatsappContact>) = contacts(JsonField.of(contacts))

        /**
         * Sets [Builder.contacts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contacts] with a well-typed `List<WhatsappContact>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun contacts(contacts: JsonField<List<WhatsappContact>>) = apply {
            this.contacts = contacts.map { it.toMutableList() }
        }

        /**
         * Adds a single [WhatsappContact] to [contacts].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addContact(contact: WhatsappContact) = apply {
            contacts =
                (contacts ?: JsonField.of(mutableListOf())).also {
                    checkKnown("contacts", it).add(contact)
                }
        }

        fun document(document: WhatsappMedia) = document(JsonField.of(document))

        /**
         * Sets [Builder.document] to an arbitrary JSON value.
         *
         * You should usually call [Builder.document] with a well-typed [WhatsappMedia] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun document(document: JsonField<WhatsappMedia>) = apply { this.document = document }

        fun image(image: WhatsappMedia) = image(JsonField.of(image))

        /**
         * Sets [Builder.image] to an arbitrary JSON value.
         *
         * You should usually call [Builder.image] with a well-typed [WhatsappMedia] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun image(image: JsonField<WhatsappMedia>) = apply { this.image = image }

        fun interactive(interactive: WhatsappInteractive) = interactive(JsonField.of(interactive))

        /**
         * Sets [Builder.interactive] to an arbitrary JSON value.
         *
         * You should usually call [Builder.interactive] with a well-typed [WhatsappInteractive]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun interactive(interactive: JsonField<WhatsappInteractive>) = apply {
            this.interactive = interactive
        }

        fun location(location: WhatsappLocation) = location(JsonField.of(location))

        /**
         * Sets [Builder.location] to an arbitrary JSON value.
         *
         * You should usually call [Builder.location] with a well-typed [WhatsappLocation] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun location(location: JsonField<WhatsappLocation>) = apply { this.location = location }

        fun reaction(reaction: WhatsappReaction) = reaction(JsonField.of(reaction))

        /**
         * Sets [Builder.reaction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reaction] with a well-typed [WhatsappReaction] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun reaction(reaction: JsonField<WhatsappReaction>) = apply { this.reaction = reaction }

        fun sticker(sticker: WhatsappMedia) = sticker(JsonField.of(sticker))

        /**
         * Sets [Builder.sticker] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sticker] with a well-typed [WhatsappMedia] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sticker(sticker: JsonField<WhatsappMedia>) = apply { this.sticker = sticker }

        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        fun video(video: WhatsappMedia) = video(JsonField.of(video))

        /**
         * Sets [Builder.video] to an arbitrary JSON value.
         *
         * You should usually call [Builder.video] with a well-typed [WhatsappMedia] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun video(video: JsonField<WhatsappMedia>) = apply { this.video = video }

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
         * Returns an immutable instance of [WhatsappMessageContent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): WhatsappMessageContent =
            WhatsappMessageContent(
                audio,
                bizOpaqueCallbackData,
                (contacts ?: JsonMissing.of()).map { it.toImmutable() },
                document,
                image,
                interactive,
                location,
                reaction,
                sticker,
                type,
                video,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): WhatsappMessageContent = apply {
        if (validated) {
            return@apply
        }

        audio().ifPresent { it.validate() }
        bizOpaqueCallbackData()
        contacts().ifPresent { it.forEach { it.validate() } }
        document().ifPresent { it.validate() }
        image().ifPresent { it.validate() }
        interactive().ifPresent { it.validate() }
        location().ifPresent { it.validate() }
        reaction().ifPresent { it.validate() }
        sticker().ifPresent { it.validate() }
        type().ifPresent { it.validate() }
        video().ifPresent { it.validate() }
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
        (audio.asKnown().getOrNull()?.validity() ?: 0) +
            (if (bizOpaqueCallbackData.asKnown().isPresent) 1 else 0) +
            (contacts.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (document.asKnown().getOrNull()?.validity() ?: 0) +
            (image.asKnown().getOrNull()?.validity() ?: 0) +
            (interactive.asKnown().getOrNull()?.validity() ?: 0) +
            (location.asKnown().getOrNull()?.validity() ?: 0) +
            (reaction.asKnown().getOrNull()?.validity() ?: 0) +
            (sticker.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (video.asKnown().getOrNull()?.validity() ?: 0)

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

            @JvmField val AUDIO = of("audio")

            @JvmField val DOCUMENT = of("document")

            @JvmField val IMAGE = of("image")

            @JvmField val STICKER = of("sticker")

            @JvmField val VIDEO = of("video")

            @JvmField val INTERACTIVE = of("interactive")

            @JvmField val LOCATION = of("location")

            @JvmField val TEMPLATE = of("template")

            @JvmField val REACTION = of("reaction")

            @JvmField val CONTACTS = of("contacts")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            AUDIO,
            DOCUMENT,
            IMAGE,
            STICKER,
            VIDEO,
            INTERACTIVE,
            LOCATION,
            TEMPLATE,
            REACTION,
            CONTACTS,
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
            AUDIO,
            DOCUMENT,
            IMAGE,
            STICKER,
            VIDEO,
            INTERACTIVE,
            LOCATION,
            TEMPLATE,
            REACTION,
            CONTACTS,
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
                AUDIO -> Value.AUDIO
                DOCUMENT -> Value.DOCUMENT
                IMAGE -> Value.IMAGE
                STICKER -> Value.STICKER
                VIDEO -> Value.VIDEO
                INTERACTIVE -> Value.INTERACTIVE
                LOCATION -> Value.LOCATION
                TEMPLATE -> Value.TEMPLATE
                REACTION -> Value.REACTION
                CONTACTS -> Value.CONTACTS
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
                AUDIO -> Known.AUDIO
                DOCUMENT -> Known.DOCUMENT
                IMAGE -> Known.IMAGE
                STICKER -> Known.STICKER
                VIDEO -> Known.VIDEO
                INTERACTIVE -> Known.INTERACTIVE
                LOCATION -> Known.LOCATION
                TEMPLATE -> Known.TEMPLATE
                REACTION -> Known.REACTION
                CONTACTS -> Known.CONTACTS
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

        return other is WhatsappMessageContent &&
            audio == other.audio &&
            bizOpaqueCallbackData == other.bizOpaqueCallbackData &&
            contacts == other.contacts &&
            document == other.document &&
            image == other.image &&
            interactive == other.interactive &&
            location == other.location &&
            reaction == other.reaction &&
            sticker == other.sticker &&
            type == other.type &&
            video == other.video &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            audio,
            bizOpaqueCallbackData,
            contacts,
            document,
            image,
            interactive,
            location,
            reaction,
            sticker,
            type,
            video,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WhatsappMessageContent{audio=$audio, bizOpaqueCallbackData=$bizOpaqueCallbackData, contacts=$contacts, document=$document, image=$image, interactive=$interactive, location=$location, reaction=$reaction, sticker=$sticker, type=$type, video=$video, additionalProperties=$additionalProperties}"
}
