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
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class RcsAgentMessage
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val contentMessage: JsonField<ContentMessage>,
    private val event: JsonField<Event>,
    private val expireTime: JsonField<OffsetDateTime>,
    private val ttl: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("content_message")
        @ExcludeMissing
        contentMessage: JsonField<ContentMessage> = JsonMissing.of(),
        @JsonProperty("event") @ExcludeMissing event: JsonField<Event> = JsonMissing.of(),
        @JsonProperty("expire_time")
        @ExcludeMissing
        expireTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("ttl") @ExcludeMissing ttl: JsonField<String> = JsonMissing.of(),
    ) : this(contentMessage, event, expireTime, ttl, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contentMessage(): Optional<ContentMessage> = contentMessage.getOptional("content_message")

    /**
     * RCS Event to send to the recipient
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun event(): Optional<Event> = event.getOptional("event")

    /**
     * Timestamp in UTC of when this message is considered expired
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expireTime(): Optional<OffsetDateTime> = expireTime.getOptional("expire_time")

    /**
     * Duration in seconds ending with 's'
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ttl(): Optional<String> = ttl.getOptional("ttl")

    /**
     * Returns the raw JSON value of [contentMessage].
     *
     * Unlike [contentMessage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("content_message")
    @ExcludeMissing
    fun _contentMessage(): JsonField<ContentMessage> = contentMessage

    /**
     * Returns the raw JSON value of [event].
     *
     * Unlike [event], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("event") @ExcludeMissing fun _event(): JsonField<Event> = event

    /**
     * Returns the raw JSON value of [expireTime].
     *
     * Unlike [expireTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expire_time")
    @ExcludeMissing
    fun _expireTime(): JsonField<OffsetDateTime> = expireTime

    /**
     * Returns the raw JSON value of [ttl].
     *
     * Unlike [ttl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ttl") @ExcludeMissing fun _ttl(): JsonField<String> = ttl

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

        /** Returns a mutable builder for constructing an instance of [RcsAgentMessage]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RcsAgentMessage]. */
    class Builder internal constructor() {

        private var contentMessage: JsonField<ContentMessage> = JsonMissing.of()
        private var event: JsonField<Event> = JsonMissing.of()
        private var expireTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var ttl: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(rcsAgentMessage: RcsAgentMessage) = apply {
            contentMessage = rcsAgentMessage.contentMessage
            event = rcsAgentMessage.event
            expireTime = rcsAgentMessage.expireTime
            ttl = rcsAgentMessage.ttl
            additionalProperties = rcsAgentMessage.additionalProperties.toMutableMap()
        }

        fun contentMessage(contentMessage: ContentMessage) =
            contentMessage(JsonField.of(contentMessage))

        /**
         * Sets [Builder.contentMessage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contentMessage] with a well-typed [ContentMessage] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun contentMessage(contentMessage: JsonField<ContentMessage>) = apply {
            this.contentMessage = contentMessage
        }

        /** RCS Event to send to the recipient */
        fun event(event: Event) = event(JsonField.of(event))

        /**
         * Sets [Builder.event] to an arbitrary JSON value.
         *
         * You should usually call [Builder.event] with a well-typed [Event] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun event(event: JsonField<Event>) = apply { this.event = event }

        /** Timestamp in UTC of when this message is considered expired */
        fun expireTime(expireTime: OffsetDateTime) = expireTime(JsonField.of(expireTime))

        /**
         * Sets [Builder.expireTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expireTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expireTime(expireTime: JsonField<OffsetDateTime>) = apply {
            this.expireTime = expireTime
        }

        /** Duration in seconds ending with 's' */
        fun ttl(ttl: String) = ttl(JsonField.of(ttl))

        /**
         * Sets [Builder.ttl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ttl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ttl(ttl: JsonField<String>) = apply { this.ttl = ttl }

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
         * Returns an immutable instance of [RcsAgentMessage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RcsAgentMessage =
            RcsAgentMessage(
                contentMessage,
                event,
                expireTime,
                ttl,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RcsAgentMessage = apply {
        if (validated) {
            return@apply
        }

        contentMessage().ifPresent { it.validate() }
        event().ifPresent { it.validate() }
        expireTime()
        ttl()
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
        (contentMessage.asKnown().getOrNull()?.validity() ?: 0) +
            (event.asKnown().getOrNull()?.validity() ?: 0) +
            (if (expireTime.asKnown().isPresent) 1 else 0) +
            (if (ttl.asKnown().isPresent) 1 else 0)

    class ContentMessage
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val contentInfo: JsonField<RcsContentInfo>,
        private val richCard: JsonField<RichCard>,
        private val suggestions: JsonField<List<RcsSuggestion>>,
        private val text: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("content_info")
            @ExcludeMissing
            contentInfo: JsonField<RcsContentInfo> = JsonMissing.of(),
            @JsonProperty("rich_card")
            @ExcludeMissing
            richCard: JsonField<RichCard> = JsonMissing.of(),
            @JsonProperty("suggestions")
            @ExcludeMissing
            suggestions: JsonField<List<RcsSuggestion>> = JsonMissing.of(),
            @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
        ) : this(contentInfo, richCard, suggestions, text, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun contentInfo(): Optional<RcsContentInfo> = contentInfo.getOptional("content_info")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun richCard(): Optional<RichCard> = richCard.getOptional("rich_card")

        /**
         * List of suggested actions and replies
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun suggestions(): Optional<List<RcsSuggestion>> = suggestions.getOptional("suggestions")

        /**
         * Text (maximum 3072 characters)
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun text(): Optional<String> = text.getOptional("text")

        /**
         * Returns the raw JSON value of [contentInfo].
         *
         * Unlike [contentInfo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("content_info")
        @ExcludeMissing
        fun _contentInfo(): JsonField<RcsContentInfo> = contentInfo

        /**
         * Returns the raw JSON value of [richCard].
         *
         * Unlike [richCard], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rich_card") @ExcludeMissing fun _richCard(): JsonField<RichCard> = richCard

        /**
         * Returns the raw JSON value of [suggestions].
         *
         * Unlike [suggestions], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("suggestions")
        @ExcludeMissing
        fun _suggestions(): JsonField<List<RcsSuggestion>> = suggestions

        /**
         * Returns the raw JSON value of [text].
         *
         * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

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

            /** Returns a mutable builder for constructing an instance of [ContentMessage]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ContentMessage]. */
        class Builder internal constructor() {

            private var contentInfo: JsonField<RcsContentInfo> = JsonMissing.of()
            private var richCard: JsonField<RichCard> = JsonMissing.of()
            private var suggestions: JsonField<MutableList<RcsSuggestion>>? = null
            private var text: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(contentMessage: ContentMessage) = apply {
                contentInfo = contentMessage.contentInfo
                richCard = contentMessage.richCard
                suggestions = contentMessage.suggestions.map { it.toMutableList() }
                text = contentMessage.text
                additionalProperties = contentMessage.additionalProperties.toMutableMap()
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

            fun richCard(richCard: RichCard) = richCard(JsonField.of(richCard))

            /**
             * Sets [Builder.richCard] to an arbitrary JSON value.
             *
             * You should usually call [Builder.richCard] with a well-typed [RichCard] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun richCard(richCard: JsonField<RichCard>) = apply { this.richCard = richCard }

            /** List of suggested actions and replies */
            fun suggestions(suggestions: List<RcsSuggestion>) =
                suggestions(JsonField.of(suggestions))

            /**
             * Sets [Builder.suggestions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.suggestions] with a well-typed `List<RcsSuggestion>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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

            /** Text (maximum 3072 characters) */
            fun text(text: String) = text(JsonField.of(text))

            /**
             * Sets [Builder.text] to an arbitrary JSON value.
             *
             * You should usually call [Builder.text] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun text(text: JsonField<String>) = apply { this.text = text }

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
             * Returns an immutable instance of [ContentMessage].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ContentMessage =
                ContentMessage(
                    contentInfo,
                    richCard,
                    (suggestions ?: JsonMissing.of()).map { it.toImmutable() },
                    text,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ContentMessage = apply {
            if (validated) {
                return@apply
            }

            contentInfo().ifPresent { it.validate() }
            richCard().ifPresent { it.validate() }
            suggestions().ifPresent { it.forEach { it.validate() } }
            text()
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
                (richCard.asKnown().getOrNull()?.validity() ?: 0) +
                (suggestions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (text.asKnown().isPresent) 1 else 0)

        class RichCard
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val carouselCard: JsonField<CarouselCard>,
            private val standaloneCard: JsonField<StandaloneCard>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("carousel_card")
                @ExcludeMissing
                carouselCard: JsonField<CarouselCard> = JsonMissing.of(),
                @JsonProperty("standalone_card")
                @ExcludeMissing
                standaloneCard: JsonField<StandaloneCard> = JsonMissing.of(),
            ) : this(carouselCard, standaloneCard, mutableMapOf())

            /**
             * Carousel of cards.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun carouselCard(): Optional<CarouselCard> = carouselCard.getOptional("carousel_card")

            /**
             * Standalone card
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun standaloneCard(): Optional<StandaloneCard> =
                standaloneCard.getOptional("standalone_card")

            /**
             * Returns the raw JSON value of [carouselCard].
             *
             * Unlike [carouselCard], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("carousel_card")
            @ExcludeMissing
            fun _carouselCard(): JsonField<CarouselCard> = carouselCard

            /**
             * Returns the raw JSON value of [standaloneCard].
             *
             * Unlike [standaloneCard], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("standalone_card")
            @ExcludeMissing
            fun _standaloneCard(): JsonField<StandaloneCard> = standaloneCard

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

                /** Returns a mutable builder for constructing an instance of [RichCard]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [RichCard]. */
            class Builder internal constructor() {

                private var carouselCard: JsonField<CarouselCard> = JsonMissing.of()
                private var standaloneCard: JsonField<StandaloneCard> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(richCard: RichCard) = apply {
                    carouselCard = richCard.carouselCard
                    standaloneCard = richCard.standaloneCard
                    additionalProperties = richCard.additionalProperties.toMutableMap()
                }

                /** Carousel of cards. */
                fun carouselCard(carouselCard: CarouselCard) =
                    carouselCard(JsonField.of(carouselCard))

                /**
                 * Sets [Builder.carouselCard] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.carouselCard] with a well-typed [CarouselCard]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun carouselCard(carouselCard: JsonField<CarouselCard>) = apply {
                    this.carouselCard = carouselCard
                }

                /** Standalone card */
                fun standaloneCard(standaloneCard: StandaloneCard) =
                    standaloneCard(JsonField.of(standaloneCard))

                /**
                 * Sets [Builder.standaloneCard] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.standaloneCard] with a well-typed
                 * [StandaloneCard] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun standaloneCard(standaloneCard: JsonField<StandaloneCard>) = apply {
                    this.standaloneCard = standaloneCard
                }

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
                 * Returns an immutable instance of [RichCard].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): RichCard =
                    RichCard(carouselCard, standaloneCard, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): RichCard = apply {
                if (validated) {
                    return@apply
                }

                carouselCard().ifPresent { it.validate() }
                standaloneCard().ifPresent { it.validate() }
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
                (carouselCard.asKnown().getOrNull()?.validity() ?: 0) +
                    (standaloneCard.asKnown().getOrNull()?.validity() ?: 0)

            /** Carousel of cards. */
            class CarouselCard
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val cardContents: JsonField<List<RcsCardContent>>,
                private val cardWidth: JsonField<CardWidth>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("card_contents")
                    @ExcludeMissing
                    cardContents: JsonField<List<RcsCardContent>> = JsonMissing.of(),
                    @JsonProperty("card_width")
                    @ExcludeMissing
                    cardWidth: JsonField<CardWidth> = JsonMissing.of(),
                ) : this(cardContents, cardWidth, mutableMapOf())

                /**
                 * The list of contents for each card in the carousel. A carousel can have a minimum
                 * of 2 cards and a maximum 10 cards.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun cardContents(): List<RcsCardContent> = cardContents.getRequired("card_contents")

                /**
                 * The width of the cards in the carousel.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun cardWidth(): CardWidth = cardWidth.getRequired("card_width")

                /**
                 * Returns the raw JSON value of [cardContents].
                 *
                 * Unlike [cardContents], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("card_contents")
                @ExcludeMissing
                fun _cardContents(): JsonField<List<RcsCardContent>> = cardContents

                /**
                 * Returns the raw JSON value of [cardWidth].
                 *
                 * Unlike [cardWidth], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("card_width")
                @ExcludeMissing
                fun _cardWidth(): JsonField<CardWidth> = cardWidth

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
                     * Returns a mutable builder for constructing an instance of [CarouselCard].
                     *
                     * The following fields are required:
                     * ```java
                     * .cardContents()
                     * .cardWidth()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [CarouselCard]. */
                class Builder internal constructor() {

                    private var cardContents: JsonField<MutableList<RcsCardContent>>? = null
                    private var cardWidth: JsonField<CardWidth>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(carouselCard: CarouselCard) = apply {
                        cardContents = carouselCard.cardContents.map { it.toMutableList() }
                        cardWidth = carouselCard.cardWidth
                        additionalProperties = carouselCard.additionalProperties.toMutableMap()
                    }

                    /**
                     * The list of contents for each card in the carousel. A carousel can have a
                     * minimum of 2 cards and a maximum 10 cards.
                     */
                    fun cardContents(cardContents: List<RcsCardContent>) =
                        cardContents(JsonField.of(cardContents))

                    /**
                     * Sets [Builder.cardContents] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.cardContents] with a well-typed
                     * `List<RcsCardContent>` value instead. This method is primarily for setting
                     * the field to an undocumented or not yet supported value.
                     */
                    fun cardContents(cardContents: JsonField<List<RcsCardContent>>) = apply {
                        this.cardContents = cardContents.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [RcsCardContent] to [cardContents].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addCardContent(cardContent: RcsCardContent) = apply {
                        cardContents =
                            (cardContents ?: JsonField.of(mutableListOf())).also {
                                checkKnown("cardContents", it).add(cardContent)
                            }
                    }

                    /** The width of the cards in the carousel. */
                    fun cardWidth(cardWidth: CardWidth) = cardWidth(JsonField.of(cardWidth))

                    /**
                     * Sets [Builder.cardWidth] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.cardWidth] with a well-typed [CardWidth]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun cardWidth(cardWidth: JsonField<CardWidth>) = apply {
                        this.cardWidth = cardWidth
                    }

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
                     * Returns an immutable instance of [CarouselCard].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .cardContents()
                     * .cardWidth()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): CarouselCard =
                        CarouselCard(
                            checkRequired("cardContents", cardContents).map { it.toImmutable() },
                            checkRequired("cardWidth", cardWidth),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): CarouselCard = apply {
                    if (validated) {
                        return@apply
                    }

                    cardContents().forEach { it.validate() }
                    cardWidth().validate()
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
                    (cardContents.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                        (cardWidth.asKnown().getOrNull()?.validity() ?: 0)

                /** The width of the cards in the carousel. */
                class CardWidth
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

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

                        @JvmField val CARD_WIDTH_UNSPECIFIED = of("CARD_WIDTH_UNSPECIFIED")

                        @JvmField val SMALL = of("SMALL")

                        @JvmField val MEDIUM = of("MEDIUM")

                        @JvmStatic fun of(value: String) = CardWidth(JsonField.of(value))
                    }

                    /** An enum containing [CardWidth]'s known values. */
                    enum class Known {
                        CARD_WIDTH_UNSPECIFIED,
                        SMALL,
                        MEDIUM,
                    }

                    /**
                     * An enum containing [CardWidth]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [CardWidth] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        CARD_WIDTH_UNSPECIFIED,
                        SMALL,
                        MEDIUM,
                        /**
                         * An enum member indicating that [CardWidth] was instantiated with an
                         * unknown value.
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
                            CARD_WIDTH_UNSPECIFIED -> Value.CARD_WIDTH_UNSPECIFIED
                            SMALL -> Value.SMALL
                            MEDIUM -> Value.MEDIUM
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
                            CARD_WIDTH_UNSPECIFIED -> Known.CARD_WIDTH_UNSPECIFIED
                            SMALL -> Known.SMALL
                            MEDIUM -> Known.MEDIUM
                            else -> throw TelnyxInvalidDataException("Unknown CardWidth: $value")
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

                    fun validate(): CardWidth = apply {
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

                        return other is CardWidth && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CarouselCard &&
                        cardContents == other.cardContents &&
                        cardWidth == other.cardWidth &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(cardContents, cardWidth, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "CarouselCard{cardContents=$cardContents, cardWidth=$cardWidth, additionalProperties=$additionalProperties}"
            }

            /** Standalone card */
            class StandaloneCard
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val cardContent: JsonField<RcsCardContent>,
                private val cardOrientation: JsonField<CardOrientation>,
                private val thumbnailImageAlignment: JsonField<ThumbnailImageAlignment>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("card_content")
                    @ExcludeMissing
                    cardContent: JsonField<RcsCardContent> = JsonMissing.of(),
                    @JsonProperty("card_orientation")
                    @ExcludeMissing
                    cardOrientation: JsonField<CardOrientation> = JsonMissing.of(),
                    @JsonProperty("thumbnail_image_alignment")
                    @ExcludeMissing
                    thumbnailImageAlignment: JsonField<ThumbnailImageAlignment> = JsonMissing.of(),
                ) : this(cardContent, cardOrientation, thumbnailImageAlignment, mutableMapOf())

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun cardContent(): RcsCardContent = cardContent.getRequired("card_content")

                /**
                 * Orientation of the card.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun cardOrientation(): CardOrientation =
                    cardOrientation.getRequired("card_orientation")

                /**
                 * Image preview alignment for standalone cards with horizontal layout.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun thumbnailImageAlignment(): ThumbnailImageAlignment =
                    thumbnailImageAlignment.getRequired("thumbnail_image_alignment")

                /**
                 * Returns the raw JSON value of [cardContent].
                 *
                 * Unlike [cardContent], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("card_content")
                @ExcludeMissing
                fun _cardContent(): JsonField<RcsCardContent> = cardContent

                /**
                 * Returns the raw JSON value of [cardOrientation].
                 *
                 * Unlike [cardOrientation], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("card_orientation")
                @ExcludeMissing
                fun _cardOrientation(): JsonField<CardOrientation> = cardOrientation

                /**
                 * Returns the raw JSON value of [thumbnailImageAlignment].
                 *
                 * Unlike [thumbnailImageAlignment], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("thumbnail_image_alignment")
                @ExcludeMissing
                fun _thumbnailImageAlignment(): JsonField<ThumbnailImageAlignment> =
                    thumbnailImageAlignment

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
                     * Returns a mutable builder for constructing an instance of [StandaloneCard].
                     *
                     * The following fields are required:
                     * ```java
                     * .cardContent()
                     * .cardOrientation()
                     * .thumbnailImageAlignment()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [StandaloneCard]. */
                class Builder internal constructor() {

                    private var cardContent: JsonField<RcsCardContent>? = null
                    private var cardOrientation: JsonField<CardOrientation>? = null
                    private var thumbnailImageAlignment: JsonField<ThumbnailImageAlignment>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(standaloneCard: StandaloneCard) = apply {
                        cardContent = standaloneCard.cardContent
                        cardOrientation = standaloneCard.cardOrientation
                        thumbnailImageAlignment = standaloneCard.thumbnailImageAlignment
                        additionalProperties = standaloneCard.additionalProperties.toMutableMap()
                    }

                    fun cardContent(cardContent: RcsCardContent) =
                        cardContent(JsonField.of(cardContent))

                    /**
                     * Sets [Builder.cardContent] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.cardContent] with a well-typed
                     * [RcsCardContent] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun cardContent(cardContent: JsonField<RcsCardContent>) = apply {
                        this.cardContent = cardContent
                    }

                    /** Orientation of the card. */
                    fun cardOrientation(cardOrientation: CardOrientation) =
                        cardOrientation(JsonField.of(cardOrientation))

                    /**
                     * Sets [Builder.cardOrientation] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.cardOrientation] with a well-typed
                     * [CardOrientation] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun cardOrientation(cardOrientation: JsonField<CardOrientation>) = apply {
                        this.cardOrientation = cardOrientation
                    }

                    /** Image preview alignment for standalone cards with horizontal layout. */
                    fun thumbnailImageAlignment(thumbnailImageAlignment: ThumbnailImageAlignment) =
                        thumbnailImageAlignment(JsonField.of(thumbnailImageAlignment))

                    /**
                     * Sets [Builder.thumbnailImageAlignment] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.thumbnailImageAlignment] with a well-typed
                     * [ThumbnailImageAlignment] value instead. This method is primarily for setting
                     * the field to an undocumented or not yet supported value.
                     */
                    fun thumbnailImageAlignment(
                        thumbnailImageAlignment: JsonField<ThumbnailImageAlignment>
                    ) = apply { this.thumbnailImageAlignment = thumbnailImageAlignment }

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
                     * Returns an immutable instance of [StandaloneCard].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .cardContent()
                     * .cardOrientation()
                     * .thumbnailImageAlignment()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): StandaloneCard =
                        StandaloneCard(
                            checkRequired("cardContent", cardContent),
                            checkRequired("cardOrientation", cardOrientation),
                            checkRequired("thumbnailImageAlignment", thumbnailImageAlignment),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): StandaloneCard = apply {
                    if (validated) {
                        return@apply
                    }

                    cardContent().validate()
                    cardOrientation().validate()
                    thumbnailImageAlignment().validate()
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
                    (cardContent.asKnown().getOrNull()?.validity() ?: 0) +
                        (cardOrientation.asKnown().getOrNull()?.validity() ?: 0) +
                        (thumbnailImageAlignment.asKnown().getOrNull()?.validity() ?: 0)

                /** Orientation of the card. */
                class CardOrientation
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

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

                        @JvmField
                        val CARD_ORIENTATION_UNSPECIFIED = of("CARD_ORIENTATION_UNSPECIFIED")

                        @JvmField val HORIZONTAL = of("HORIZONTAL")

                        @JvmField val VERTICAL = of("VERTICAL")

                        @JvmStatic fun of(value: String) = CardOrientation(JsonField.of(value))
                    }

                    /** An enum containing [CardOrientation]'s known values. */
                    enum class Known {
                        CARD_ORIENTATION_UNSPECIFIED,
                        HORIZONTAL,
                        VERTICAL,
                    }

                    /**
                     * An enum containing [CardOrientation]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [CardOrientation] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        CARD_ORIENTATION_UNSPECIFIED,
                        HORIZONTAL,
                        VERTICAL,
                        /**
                         * An enum member indicating that [CardOrientation] was instantiated with an
                         * unknown value.
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
                            CARD_ORIENTATION_UNSPECIFIED -> Value.CARD_ORIENTATION_UNSPECIFIED
                            HORIZONTAL -> Value.HORIZONTAL
                            VERTICAL -> Value.VERTICAL
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
                            CARD_ORIENTATION_UNSPECIFIED -> Known.CARD_ORIENTATION_UNSPECIFIED
                            HORIZONTAL -> Known.HORIZONTAL
                            VERTICAL -> Known.VERTICAL
                            else ->
                                throw TelnyxInvalidDataException("Unknown CardOrientation: $value")
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

                    fun validate(): CardOrientation = apply {
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

                        return other is CardOrientation && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /** Image preview alignment for standalone cards with horizontal layout. */
                class ThumbnailImageAlignment
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

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

                        @JvmField
                        val THUMBNAIL_IMAGE_ALIGNMENT_UNSPECIFIED =
                            of("THUMBNAIL_IMAGE_ALIGNMENT_UNSPECIFIED")

                        @JvmField val LEFT = of("LEFT")

                        @JvmField val RIGHT = of("RIGHT")

                        @JvmStatic
                        fun of(value: String) = ThumbnailImageAlignment(JsonField.of(value))
                    }

                    /** An enum containing [ThumbnailImageAlignment]'s known values. */
                    enum class Known {
                        THUMBNAIL_IMAGE_ALIGNMENT_UNSPECIFIED,
                        LEFT,
                        RIGHT,
                    }

                    /**
                     * An enum containing [ThumbnailImageAlignment]'s known values, as well as an
                     * [_UNKNOWN] member.
                     *
                     * An instance of [ThumbnailImageAlignment] can contain an unknown value in a
                     * couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        THUMBNAIL_IMAGE_ALIGNMENT_UNSPECIFIED,
                        LEFT,
                        RIGHT,
                        /**
                         * An enum member indicating that [ThumbnailImageAlignment] was instantiated
                         * with an unknown value.
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
                            THUMBNAIL_IMAGE_ALIGNMENT_UNSPECIFIED ->
                                Value.THUMBNAIL_IMAGE_ALIGNMENT_UNSPECIFIED
                            LEFT -> Value.LEFT
                            RIGHT -> Value.RIGHT
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
                            THUMBNAIL_IMAGE_ALIGNMENT_UNSPECIFIED ->
                                Known.THUMBNAIL_IMAGE_ALIGNMENT_UNSPECIFIED
                            LEFT -> Known.LEFT
                            RIGHT -> Known.RIGHT
                            else ->
                                throw TelnyxInvalidDataException(
                                    "Unknown ThumbnailImageAlignment: $value"
                                )
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

                    fun validate(): ThumbnailImageAlignment = apply {
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

                        return other is ThumbnailImageAlignment && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is StandaloneCard &&
                        cardContent == other.cardContent &&
                        cardOrientation == other.cardOrientation &&
                        thumbnailImageAlignment == other.thumbnailImageAlignment &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        cardContent,
                        cardOrientation,
                        thumbnailImageAlignment,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "StandaloneCard{cardContent=$cardContent, cardOrientation=$cardOrientation, thumbnailImageAlignment=$thumbnailImageAlignment, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is RichCard &&
                    carouselCard == other.carouselCard &&
                    standaloneCard == other.standaloneCard &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(carouselCard, standaloneCard, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "RichCard{carouselCard=$carouselCard, standaloneCard=$standaloneCard, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ContentMessage &&
                contentInfo == other.contentInfo &&
                richCard == other.richCard &&
                suggestions == other.suggestions &&
                text == other.text &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(contentInfo, richCard, suggestions, text, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ContentMessage{contentInfo=$contentInfo, richCard=$richCard, suggestions=$suggestions, text=$text, additionalProperties=$additionalProperties}"
    }

    /** RCS Event to send to the recipient */
    class Event
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val eventType: JsonField<EventType>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("event_type")
            @ExcludeMissing
            eventType: JsonField<EventType> = JsonMissing.of()
        ) : this(eventType, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun eventType(): Optional<EventType> = eventType.getOptional("event_type")

        /**
         * Returns the raw JSON value of [eventType].
         *
         * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("event_type")
        @ExcludeMissing
        fun _eventType(): JsonField<EventType> = eventType

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

            /** Returns a mutable builder for constructing an instance of [Event]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Event]. */
        class Builder internal constructor() {

            private var eventType: JsonField<EventType> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(event: Event) = apply {
                eventType = event.eventType
                additionalProperties = event.additionalProperties.toMutableMap()
            }

            fun eventType(eventType: EventType) = eventType(JsonField.of(eventType))

            /**
             * Sets [Builder.eventType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.eventType] with a well-typed [EventType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun eventType(eventType: JsonField<EventType>) = apply { this.eventType = eventType }

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
             * Returns an immutable instance of [Event].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Event = Event(eventType, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Event = apply {
            if (validated) {
                return@apply
            }

            eventType().ifPresent { it.validate() }
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
        internal fun validity(): Int = (eventType.asKnown().getOrNull()?.validity() ?: 0)

        class EventType @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val TYPE_UNSPECIFIED = of("TYPE_UNSPECIFIED")

                @JvmField val IS_TYPING = of("IS_TYPING")

                @JvmField val READ = of("READ")

                @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
            }

            /** An enum containing [EventType]'s known values. */
            enum class Known {
                TYPE_UNSPECIFIED,
                IS_TYPING,
                READ,
            }

            /**
             * An enum containing [EventType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [EventType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                TYPE_UNSPECIFIED,
                IS_TYPING,
                READ,
                /**
                 * An enum member indicating that [EventType] was instantiated with an unknown
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
                    TYPE_UNSPECIFIED -> Value.TYPE_UNSPECIFIED
                    IS_TYPING -> Value.IS_TYPING
                    READ -> Value.READ
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
                    TYPE_UNSPECIFIED -> Known.TYPE_UNSPECIFIED
                    IS_TYPING -> Known.IS_TYPING
                    READ -> Known.READ
                    else -> throw TelnyxInvalidDataException("Unknown EventType: $value")
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

            fun validate(): EventType = apply {
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

                return other is EventType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Event &&
                eventType == other.eventType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(eventType, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Event{eventType=$eventType, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RcsAgentMessage &&
            contentMessage == other.contentMessage &&
            event == other.event &&
            expireTime == other.expireTime &&
            ttl == other.ttl &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(contentMessage, event, expireTime, ttl, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RcsAgentMessage{contentMessage=$contentMessage, event=$event, expireTime=$expireTime, ttl=$ttl, additionalProperties=$additionalProperties}"
}
