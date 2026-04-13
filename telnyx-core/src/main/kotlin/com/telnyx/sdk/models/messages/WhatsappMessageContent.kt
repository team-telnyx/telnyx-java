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
import com.telnyx.sdk.core.checkRequired
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
    private val template: JsonField<Template>,
    private val text: JsonField<Text>,
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
        @JsonProperty("template") @ExcludeMissing template: JsonField<Template> = JsonMissing.of(),
        @JsonProperty("text") @ExcludeMissing text: JsonField<Text> = JsonMissing.of(),
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
        template,
        text,
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
     * Template message object. Provide either template_id or name + language to identify the
     * template.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun template(): Optional<Template> = template.getOptional("template")

    /**
     * Text message content. Can only be sent within a 24-hour customer service window.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun text(): Optional<Text> = text.getOptional("text")

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
     * Returns the raw JSON value of [template].
     *
     * Unlike [template], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("template") @ExcludeMissing fun _template(): JsonField<Template> = template

    /**
     * Returns the raw JSON value of [text].
     *
     * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<Text> = text

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
        private var template: JsonField<Template> = JsonMissing.of()
        private var text: JsonField<Text> = JsonMissing.of()
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
            template = whatsappMessageContent.template
            text = whatsappMessageContent.text
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

        /**
         * Template message object. Provide either template_id or name + language to identify the
         * template.
         */
        fun template(template: Template) = template(JsonField.of(template))

        /**
         * Sets [Builder.template] to an arbitrary JSON value.
         *
         * You should usually call [Builder.template] with a well-typed [Template] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun template(template: JsonField<Template>) = apply { this.template = template }

        /** Text message content. Can only be sent within a 24-hour customer service window. */
        fun text(text: Text) = text(JsonField.of(text))

        /**
         * Sets [Builder.text] to an arbitrary JSON value.
         *
         * You should usually call [Builder.text] with a well-typed [Text] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun text(text: JsonField<Text>) = apply { this.text = text }

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
                template,
                text,
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
        template().ifPresent { it.validate() }
        text().ifPresent { it.validate() }
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
            (template.asKnown().getOrNull()?.validity() ?: 0) +
            (text.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (video.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * Template message object. Provide either template_id or name + language to identify the
     * template.
     */
    class Template
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val components: JsonField<List<Component>>,
        private val language: JsonField<Language>,
        private val name: JsonField<String>,
        private val templateId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("components")
            @ExcludeMissing
            components: JsonField<List<Component>> = JsonMissing.of(),
            @JsonProperty("language")
            @ExcludeMissing
            language: JsonField<Language> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("template_id")
            @ExcludeMissing
            templateId: JsonField<String> = JsonMissing.of(),
        ) : this(components, language, name, templateId, mutableMapOf())

        /**
         * Template parameter values for header, body, and button components.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun components(): Optional<List<Component>> = components.getOptional("components")

        /**
         * Template language. Required unless template_id is provided.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun language(): Optional<Language> = language.getOptional("language")

        /**
         * Template name as registered with Meta. Required unless template_id is provided.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Telnyx template ID (the id field from template list/get responses). When provided, name
         * and language are resolved automatically.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun templateId(): Optional<String> = templateId.getOptional("template_id")

        /**
         * Returns the raw JSON value of [components].
         *
         * Unlike [components], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("components")
        @ExcludeMissing
        fun _components(): JsonField<List<Component>> = components

        /**
         * Returns the raw JSON value of [language].
         *
         * Unlike [language], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("language") @ExcludeMissing fun _language(): JsonField<Language> = language

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [templateId].
         *
         * Unlike [templateId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("template_id")
        @ExcludeMissing
        fun _templateId(): JsonField<String> = templateId

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

            /** Returns a mutable builder for constructing an instance of [Template]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Template]. */
        class Builder internal constructor() {

            private var components: JsonField<MutableList<Component>>? = null
            private var language: JsonField<Language> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var templateId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(template: Template) = apply {
                components = template.components.map { it.toMutableList() }
                language = template.language
                name = template.name
                templateId = template.templateId
                additionalProperties = template.additionalProperties.toMutableMap()
            }

            /** Template parameter values for header, body, and button components. */
            fun components(components: List<Component>) = components(JsonField.of(components))

            /**
             * Sets [Builder.components] to an arbitrary JSON value.
             *
             * You should usually call [Builder.components] with a well-typed `List<Component>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun components(components: JsonField<List<Component>>) = apply {
                this.components = components.map { it.toMutableList() }
            }

            /**
             * Adds a single [Component] to [components].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addComponent(component: Component) = apply {
                components =
                    (components ?: JsonField.of(mutableListOf())).also {
                        checkKnown("components", it).add(component)
                    }
            }

            /** Template language. Required unless template_id is provided. */
            fun language(language: Language) = language(JsonField.of(language))

            /**
             * Sets [Builder.language] to an arbitrary JSON value.
             *
             * You should usually call [Builder.language] with a well-typed [Language] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun language(language: JsonField<Language>) = apply { this.language = language }

            /** Template name as registered with Meta. Required unless template_id is provided. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * Telnyx template ID (the id field from template list/get responses). When provided,
             * name and language are resolved automatically.
             */
            fun templateId(templateId: String) = templateId(JsonField.of(templateId))

            /**
             * Sets [Builder.templateId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.templateId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun templateId(templateId: JsonField<String>) = apply { this.templateId = templateId }

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
             * Returns an immutable instance of [Template].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Template =
                Template(
                    (components ?: JsonMissing.of()).map { it.toImmutable() },
                    language,
                    name,
                    templateId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Template = apply {
            if (validated) {
                return@apply
            }

            components().ifPresent { it.forEach { it.validate() } }
            language().ifPresent { it.validate() }
            name()
            templateId()
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
            (components.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (language.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (templateId.asKnown().isPresent) 1 else 0)

        class Component
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val index: JsonField<Long>,
            private val parameters: JsonField<List<Parameter>>,
            private val subType: JsonField<SubType>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("index") @ExcludeMissing index: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("parameters")
                @ExcludeMissing
                parameters: JsonField<List<Parameter>> = JsonMissing.of(),
                @JsonProperty("sub_type")
                @ExcludeMissing
                subType: JsonField<SubType> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(index, parameters, subType, type, mutableMapOf())

            /**
             * Button index (required for button components)
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun index(): Optional<Long> = index.getOptional("index")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun parameters(): Optional<List<Parameter>> = parameters.getOptional("parameters")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun subType(): Optional<SubType> = subType.getOptional("sub_type")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun type(): Optional<Type> = type.getOptional("type")

            /**
             * Returns the raw JSON value of [index].
             *
             * Unlike [index], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("index") @ExcludeMissing fun _index(): JsonField<Long> = index

            /**
             * Returns the raw JSON value of [parameters].
             *
             * Unlike [parameters], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("parameters")
            @ExcludeMissing
            fun _parameters(): JsonField<List<Parameter>> = parameters

            /**
             * Returns the raw JSON value of [subType].
             *
             * Unlike [subType], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("sub_type") @ExcludeMissing fun _subType(): JsonField<SubType> = subType

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

                /** Returns a mutable builder for constructing an instance of [Component]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Component]. */
            class Builder internal constructor() {

                private var index: JsonField<Long> = JsonMissing.of()
                private var parameters: JsonField<MutableList<Parameter>>? = null
                private var subType: JsonField<SubType> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(component: Component) = apply {
                    index = component.index
                    parameters = component.parameters.map { it.toMutableList() }
                    subType = component.subType
                    type = component.type
                    additionalProperties = component.additionalProperties.toMutableMap()
                }

                /** Button index (required for button components) */
                fun index(index: Long) = index(JsonField.of(index))

                /**
                 * Sets [Builder.index] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.index] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun index(index: JsonField<Long>) = apply { this.index = index }

                fun parameters(parameters: List<Parameter>) = parameters(JsonField.of(parameters))

                /**
                 * Sets [Builder.parameters] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.parameters] with a well-typed `List<Parameter>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun parameters(parameters: JsonField<List<Parameter>>) = apply {
                    this.parameters = parameters.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Parameter] to [parameters].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addParameter(parameter: Parameter) = apply {
                    parameters =
                        (parameters ?: JsonField.of(mutableListOf())).also {
                            checkKnown("parameters", it).add(parameter)
                        }
                }

                fun subType(subType: SubType) = subType(JsonField.of(subType))

                /**
                 * Sets [Builder.subType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.subType] with a well-typed [SubType] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun subType(subType: JsonField<SubType>) = apply { this.subType = subType }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

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
                 * Returns an immutable instance of [Component].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Component =
                    Component(
                        index,
                        (parameters ?: JsonMissing.of()).map { it.toImmutable() },
                        subType,
                        type,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Component = apply {
                if (validated) {
                    return@apply
                }

                index()
                parameters().ifPresent { it.forEach { it.validate() } }
                subType().ifPresent { it.validate() }
                type().ifPresent { it.validate() }
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
                (if (index.asKnown().isPresent) 1 else 0) +
                    (parameters.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (subType.asKnown().getOrNull()?.validity() ?: 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

            class Parameter
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val text: JsonField<String>,
                private val type: JsonField<Type>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("text")
                    @ExcludeMissing
                    text: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                ) : this(text, type, mutableMapOf())

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun text(): Optional<String> = text.getOptional("text")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun type(): Optional<Type> = type.getOptional("type")

                /**
                 * Returns the raw JSON value of [text].
                 *
                 * Unlike [text], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

                /**
                 * Returns the raw JSON value of [type].
                 *
                 * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                 * type.
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

                    /** Returns a mutable builder for constructing an instance of [Parameter]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Parameter]. */
                class Builder internal constructor() {

                    private var text: JsonField<String> = JsonMissing.of()
                    private var type: JsonField<Type> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(parameter: Parameter) = apply {
                        text = parameter.text
                        type = parameter.type
                        additionalProperties = parameter.additionalProperties.toMutableMap()
                    }

                    fun text(text: String) = text(JsonField.of(text))

                    /**
                     * Sets [Builder.text] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.text] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun text(text: JsonField<String>) = apply { this.text = text }

                    fun type(type: Type) = type(JsonField.of(type))

                    /**
                     * Sets [Builder.type] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.type] with a well-typed [Type] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun type(type: JsonField<Type>) = apply { this.type = type }

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
                     * Returns an immutable instance of [Parameter].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Parameter =
                        Parameter(text, type, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): Parameter = apply {
                    if (validated) {
                        return@apply
                    }

                    text()
                    type().ifPresent { it.validate() }
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
                    (if (text.asKnown().isPresent) 1 else 0) +
                        (type.asKnown().getOrNull()?.validity() ?: 0)

                class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                    Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val TEXT = of("text")

                        @JvmField val IMAGE = of("image")

                        @JvmField val VIDEO = of("video")

                        @JvmField val DOCUMENT = of("document")

                        @JvmField val CURRENCY = of("currency")

                        @JvmField val DATE_TIME = of("date_time")

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    /** An enum containing [Type]'s known values. */
                    enum class Known {
                        TEXT,
                        IMAGE,
                        VIDEO,
                        DOCUMENT,
                        CURRENCY,
                        DATE_TIME,
                    }

                    /**
                     * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Type] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        TEXT,
                        IMAGE,
                        VIDEO,
                        DOCUMENT,
                        CURRENCY,
                        DATE_TIME,
                        /**
                         * An enum member indicating that [Type] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            TEXT -> Value.TEXT
                            IMAGE -> Value.IMAGE
                            VIDEO -> Value.VIDEO
                            DOCUMENT -> Value.DOCUMENT
                            CURRENCY -> Value.CURRENCY
                            DATE_TIME -> Value.DATE_TIME
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws TelnyxInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            TEXT -> Known.TEXT
                            IMAGE -> Known.IMAGE
                            VIDEO -> Known.VIDEO
                            DOCUMENT -> Known.DOCUMENT
                            CURRENCY -> Known.CURRENCY
                            DATE_TIME -> Known.DATE_TIME
                            else -> throw TelnyxInvalidDataException("Unknown Type: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws TelnyxInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            TelnyxInvalidDataException("Value is not a String")
                        }

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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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

                    return other is Parameter &&
                        text == other.text &&
                        type == other.type &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(text, type, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Parameter{text=$text, type=$type, additionalProperties=$additionalProperties}"
            }

            class SubType @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val QUICK_REPLY = of("quick_reply")

                    @JvmField val URL = of("url")

                    @JvmStatic fun of(value: String) = SubType(JsonField.of(value))
                }

                /** An enum containing [SubType]'s known values. */
                enum class Known {
                    QUICK_REPLY,
                    URL,
                }

                /**
                 * An enum containing [SubType]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [SubType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    QUICK_REPLY,
                    URL,
                    /**
                     * An enum member indicating that [SubType] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        QUICK_REPLY -> Value.QUICK_REPLY
                        URL -> Value.URL
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        QUICK_REPLY -> Known.QUICK_REPLY
                        URL -> Known.URL
                        else -> throw TelnyxInvalidDataException("Unknown SubType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): SubType = apply {
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

                    return other is SubType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val HEADER = of("header")

                    @JvmField val BODY = of("body")

                    @JvmField val BUTTON = of("button")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    HEADER,
                    BODY,
                    BUTTON,
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    HEADER,
                    BODY,
                    BUTTON,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        HEADER -> Value.HEADER
                        BODY -> Value.BODY
                        BUTTON -> Value.BUTTON
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        HEADER -> Known.HEADER
                        BODY -> Known.BODY
                        BUTTON -> Known.BUTTON
                        else -> throw TelnyxInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

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

                return other is Component &&
                    index == other.index &&
                    parameters == other.parameters &&
                    subType == other.subType &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(index, parameters, subType, type, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Component{index=$index, parameters=$parameters, subType=$subType, type=$type, additionalProperties=$additionalProperties}"
        }

        /** Template language. Required unless template_id is provided. */
        class Language
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val code: JsonField<String>,
            private val policy: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
                @JsonProperty("policy") @ExcludeMissing policy: JsonField<String> = JsonMissing.of(),
            ) : this(code, policy, mutableMapOf())

            /**
             * Language code (e.g. en_US)
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun code(): String = code.getRequired("code")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun policy(): Optional<String> = policy.getOptional("policy")

            /**
             * Returns the raw JSON value of [code].
             *
             * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

            /**
             * Returns the raw JSON value of [policy].
             *
             * Unlike [policy], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("policy") @ExcludeMissing fun _policy(): JsonField<String> = policy

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
                 * Returns a mutable builder for constructing an instance of [Language].
                 *
                 * The following fields are required:
                 * ```java
                 * .code()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Language]. */
            class Builder internal constructor() {

                private var code: JsonField<String>? = null
                private var policy: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(language: Language) = apply {
                    code = language.code
                    policy = language.policy
                    additionalProperties = language.additionalProperties.toMutableMap()
                }

                /** Language code (e.g. en_US) */
                fun code(code: String) = code(JsonField.of(code))

                /**
                 * Sets [Builder.code] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.code] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun code(code: JsonField<String>) = apply { this.code = code }

                fun policy(policy: String) = policy(JsonField.of(policy))

                /**
                 * Sets [Builder.policy] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.policy] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun policy(policy: JsonField<String>) = apply { this.policy = policy }

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
                 * Returns an immutable instance of [Language].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .code()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Language =
                    Language(
                        checkRequired("code", code),
                        policy,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Language = apply {
                if (validated) {
                    return@apply
                }

                code()
                policy()
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
                (if (code.asKnown().isPresent) 1 else 0) +
                    (if (policy.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Language &&
                    code == other.code &&
                    policy == other.policy &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(code, policy, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Language{code=$code, policy=$policy, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Template &&
                components == other.components &&
                language == other.language &&
                name == other.name &&
                templateId == other.templateId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(components, language, name, templateId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Template{components=$components, language=$language, name=$name, templateId=$templateId, additionalProperties=$additionalProperties}"
    }

    /** Text message content. Can only be sent within a 24-hour customer service window. */
    class Text
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val body: JsonField<String>,
        private val previewUrl: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("body") @ExcludeMissing body: JsonField<String> = JsonMissing.of(),
            @JsonProperty("preview_url")
            @ExcludeMissing
            previewUrl: JsonField<Boolean> = JsonMissing.of(),
        ) : this(body, previewUrl, mutableMapOf())

        /**
         * The text message body.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun body(): String = body.getRequired("body")

        /**
         * Whether to show a URL preview in the message.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun previewUrl(): Optional<Boolean> = previewUrl.getOptional("preview_url")

        /**
         * Returns the raw JSON value of [body].
         *
         * Unlike [body], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("body") @ExcludeMissing fun _body(): JsonField<String> = body

        /**
         * Returns the raw JSON value of [previewUrl].
         *
         * Unlike [previewUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("preview_url")
        @ExcludeMissing
        fun _previewUrl(): JsonField<Boolean> = previewUrl

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
             * Returns a mutable builder for constructing an instance of [Text].
             *
             * The following fields are required:
             * ```java
             * .body()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Text]. */
        class Builder internal constructor() {

            private var body: JsonField<String>? = null
            private var previewUrl: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(text: Text) = apply {
                body = text.body
                previewUrl = text.previewUrl
                additionalProperties = text.additionalProperties.toMutableMap()
            }

            /** The text message body. */
            fun body(body: String) = body(JsonField.of(body))

            /**
             * Sets [Builder.body] to an arbitrary JSON value.
             *
             * You should usually call [Builder.body] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun body(body: JsonField<String>) = apply { this.body = body }

            /** Whether to show a URL preview in the message. */
            fun previewUrl(previewUrl: Boolean) = previewUrl(JsonField.of(previewUrl))

            /**
             * Sets [Builder.previewUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.previewUrl] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun previewUrl(previewUrl: JsonField<Boolean>) = apply { this.previewUrl = previewUrl }

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
             * Returns an immutable instance of [Text].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .body()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Text =
                Text(checkRequired("body", body), previewUrl, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Text = apply {
            if (validated) {
                return@apply
            }

            body()
            previewUrl()
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
            (if (body.asKnown().isPresent) 1 else 0) +
                (if (previewUrl.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Text &&
                body == other.body &&
                previewUrl == other.previewUrl &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(body, previewUrl, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Text{body=$body, previewUrl=$previewUrl, additionalProperties=$additionalProperties}"
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

            @JvmField val TEXT = of("text")

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
            TEXT,
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
            TEXT,
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
                TEXT -> Value.TEXT
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
                TEXT -> Known.TEXT
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
            template == other.template &&
            text == other.text &&
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
            template,
            text,
            type,
            video,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WhatsappMessageContent{audio=$audio, bizOpaqueCallbackData=$bizOpaqueCallbackData, contacts=$contacts, document=$document, image=$image, interactive=$interactive, location=$location, reaction=$reaction, sticker=$sticker, template=$template, text=$text, type=$type, video=$video, additionalProperties=$additionalProperties}"
}
