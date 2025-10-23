// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messsages

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

class RcsCardContent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val description: JsonField<String>,
    private val media: JsonField<Media>,
    private val suggestions: JsonField<List<RcsSuggestion>>,
    private val title: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("media") @ExcludeMissing media: JsonField<Media> = JsonMissing.of(),
        @JsonProperty("suggestions")
        @ExcludeMissing
        suggestions: JsonField<List<RcsSuggestion>> = JsonMissing.of(),
        @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
    ) : this(description, media, suggestions, title, mutableMapOf())

    /**
     * Description of the card (at most 2000 characters)
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * A media file within a rich card.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun media(): Optional<Media> = media.getOptional("media")

    /**
     * List of suggestions to include in the card. Maximum 10 suggestions.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun suggestions(): Optional<List<RcsSuggestion>> = suggestions.getOptional("suggestions")

    /**
     * Title of the card (at most 200 characters)
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun title(): Optional<String> = title.getOptional("title")

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [media].
     *
     * Unlike [media], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("media") @ExcludeMissing fun _media(): JsonField<Media> = media

    /**
     * Returns the raw JSON value of [suggestions].
     *
     * Unlike [suggestions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("suggestions")
    @ExcludeMissing
    fun _suggestions(): JsonField<List<RcsSuggestion>> = suggestions

    /**
     * Returns the raw JSON value of [title].
     *
     * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

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

        /** Returns a mutable builder for constructing an instance of [RcsCardContent]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RcsCardContent]. */
    class Builder internal constructor() {

        private var description: JsonField<String> = JsonMissing.of()
        private var media: JsonField<Media> = JsonMissing.of()
        private var suggestions: JsonField<MutableList<RcsSuggestion>>? = null
        private var title: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(rcsCardContent: RcsCardContent) = apply {
            description = rcsCardContent.description
            media = rcsCardContent.media
            suggestions = rcsCardContent.suggestions.map { it.toMutableList() }
            title = rcsCardContent.title
            additionalProperties = rcsCardContent.additionalProperties.toMutableMap()
        }

        /** Description of the card (at most 2000 characters) */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** A media file within a rich card. */
        fun media(media: Media) = media(JsonField.of(media))

        /**
         * Sets [Builder.media] to an arbitrary JSON value.
         *
         * You should usually call [Builder.media] with a well-typed [Media] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun media(media: JsonField<Media>) = apply { this.media = media }

        /** List of suggestions to include in the card. Maximum 10 suggestions. */
        fun suggestions(suggestions: List<RcsSuggestion>) = suggestions(JsonField.of(suggestions))

        /**
         * Sets [Builder.suggestions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.suggestions] with a well-typed `List<RcsSuggestion>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun suggestions(suggestions: JsonField<List<RcsSuggestion>>) = apply {
            this.suggestions = suggestions.map { it.toMutableList() }
        }

        /**
         * Adds a single [RcsSuggestion] to [suggestions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSuggestion(suggestion: RcsSuggestion) = apply {
            suggestions =
                (suggestions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("suggestions", it).add(suggestion)
                }
        }

        /** Title of the card (at most 200 characters) */
        fun title(title: String) = title(JsonField.of(title))

        /**
         * Sets [Builder.title] to an arbitrary JSON value.
         *
         * You should usually call [Builder.title] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun title(title: JsonField<String>) = apply { this.title = title }

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
         * Returns an immutable instance of [RcsCardContent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RcsCardContent =
            RcsCardContent(
                description,
                media,
                (suggestions ?: JsonMissing.of()).map { it.toImmutable() },
                title,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RcsCardContent = apply {
        if (validated) {
            return@apply
        }

        description()
        media().ifPresent { it.validate() }
        suggestions().ifPresent { it.forEach { it.validate() } }
        title()
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
        (if (description.asKnown().isPresent) 1 else 0) +
            (media.asKnown().getOrNull()?.validity() ?: 0) +
            (suggestions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (title.asKnown().isPresent) 1 else 0)

    /** A media file within a rich card. */
    class Media
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val contentInfo: JsonField<RcsContentInfo>,
        private val height: JsonField<Height>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("content_info")
            @ExcludeMissing
            contentInfo: JsonField<RcsContentInfo> = JsonMissing.of(),
            @JsonProperty("height") @ExcludeMissing height: JsonField<Height> = JsonMissing.of(),
        ) : this(contentInfo, height, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun contentInfo(): Optional<RcsContentInfo> = contentInfo.getOptional("content_info")

        /**
         * The height of the media within a rich card with a vertical layout. For a standalone card
         * with horizontal layout, height is not customizable, and this field is ignored.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun height(): Optional<Height> = height.getOptional("height")

        /**
         * Returns the raw JSON value of [contentInfo].
         *
         * Unlike [contentInfo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("content_info")
        @ExcludeMissing
        fun _contentInfo(): JsonField<RcsContentInfo> = contentInfo

        /**
         * Returns the raw JSON value of [height].
         *
         * Unlike [height], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("height") @ExcludeMissing fun _height(): JsonField<Height> = height

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

            /** Returns a mutable builder for constructing an instance of [Media]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Media]. */
        class Builder internal constructor() {

            private var contentInfo: JsonField<RcsContentInfo> = JsonMissing.of()
            private var height: JsonField<Height> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(media: Media) = apply {
                contentInfo = media.contentInfo
                height = media.height
                additionalProperties = media.additionalProperties.toMutableMap()
            }

            fun contentInfo(contentInfo: RcsContentInfo) = contentInfo(JsonField.of(contentInfo))

            /**
             * Sets [Builder.contentInfo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contentInfo] with a well-typed [RcsContentInfo]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun contentInfo(contentInfo: JsonField<RcsContentInfo>) = apply {
                this.contentInfo = contentInfo
            }

            /**
             * The height of the media within a rich card with a vertical layout. For a standalone
             * card with horizontal layout, height is not customizable, and this field is ignored.
             */
            fun height(height: Height) = height(JsonField.of(height))

            /**
             * Sets [Builder.height] to an arbitrary JSON value.
             *
             * You should usually call [Builder.height] with a well-typed [Height] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun height(height: JsonField<Height>) = apply { this.height = height }

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
             * Returns an immutable instance of [Media].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Media = Media(contentInfo, height, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Media = apply {
            if (validated) {
                return@apply
            }

            contentInfo().ifPresent { it.validate() }
            height().ifPresent { it.validate() }
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
            (contentInfo.asKnown().getOrNull()?.validity() ?: 0) +
                (height.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * The height of the media within a rich card with a vertical layout. For a standalone card
         * with horizontal layout, height is not customizable, and this field is ignored.
         */
        class Height @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val HEIGHT_UNSPECIFIED = of("HEIGHT_UNSPECIFIED")

                @JvmField val SHORT = of("SHORT")

                @JvmField val MEDIUM = of("MEDIUM")

                @JvmField val TALL = of("TALL")

                @JvmStatic fun of(value: String) = Height(JsonField.of(value))
            }

            /** An enum containing [Height]'s known values. */
            enum class Known {
                HEIGHT_UNSPECIFIED,
                SHORT,
                MEDIUM,
                TALL,
            }

            /**
             * An enum containing [Height]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Height] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                HEIGHT_UNSPECIFIED,
                SHORT,
                MEDIUM,
                TALL,
                /**
                 * An enum member indicating that [Height] was instantiated with an unknown value.
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
                    HEIGHT_UNSPECIFIED -> Value.HEIGHT_UNSPECIFIED
                    SHORT -> Value.SHORT
                    MEDIUM -> Value.MEDIUM
                    TALL -> Value.TALL
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
                    HEIGHT_UNSPECIFIED -> Known.HEIGHT_UNSPECIFIED
                    SHORT -> Known.SHORT
                    MEDIUM -> Known.MEDIUM
                    TALL -> Known.TALL
                    else -> throw TelnyxInvalidDataException("Unknown Height: $value")
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

            fun validate(): Height = apply {
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

                return other is Height && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Media &&
                contentInfo == other.contentInfo &&
                height == other.height &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(contentInfo, height, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Media{contentInfo=$contentInfo, height=$height, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RcsCardContent &&
            description == other.description &&
            media == other.media &&
            suggestions == other.suggestions &&
            title == other.title &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(description, media, suggestions, title, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RcsCardContent{description=$description, media=$media, suggestions=$suggestions, title=$title, additionalProperties=$additionalProperties}"
}
