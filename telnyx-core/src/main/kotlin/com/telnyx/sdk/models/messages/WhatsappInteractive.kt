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

class WhatsappInteractive
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val action: JsonField<Action>,
    private val body: JsonField<InteractiveBody>,
    private val footer: JsonField<Footer>,
    private val header: JsonField<Header>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("action") @ExcludeMissing action: JsonField<Action> = JsonMissing.of(),
        @JsonProperty("body") @ExcludeMissing body: JsonField<InteractiveBody> = JsonMissing.of(),
        @JsonProperty("footer") @ExcludeMissing footer: JsonField<Footer> = JsonMissing.of(),
        @JsonProperty("header") @ExcludeMissing header: JsonField<Header> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(action, body, footer, header, type, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun action(): Optional<Action> = action.getOptional("action")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun body(): Optional<InteractiveBody> = body.getOptional("body")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun footer(): Optional<Footer> = footer.getOptional("footer")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun header(): Optional<Header> = header.getOptional("header")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun type(): Optional<Type> = type.getOptional("type")

    /**
     * Returns the raw JSON value of [action].
     *
     * Unlike [action], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("action") @ExcludeMissing fun _action(): JsonField<Action> = action

    /**
     * Returns the raw JSON value of [body].
     *
     * Unlike [body], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("body") @ExcludeMissing fun _body(): JsonField<InteractiveBody> = body

    /**
     * Returns the raw JSON value of [footer].
     *
     * Unlike [footer], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("footer") @ExcludeMissing fun _footer(): JsonField<Footer> = footer

    /**
     * Returns the raw JSON value of [header].
     *
     * Unlike [header], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("header") @ExcludeMissing fun _header(): JsonField<Header> = header

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

        /** Returns a mutable builder for constructing an instance of [WhatsappInteractive]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WhatsappInteractive]. */
    class Builder internal constructor() {

        private var action: JsonField<Action> = JsonMissing.of()
        private var body: JsonField<InteractiveBody> = JsonMissing.of()
        private var footer: JsonField<Footer> = JsonMissing.of()
        private var header: JsonField<Header> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(whatsappInteractive: WhatsappInteractive) = apply {
            action = whatsappInteractive.action
            body = whatsappInteractive.body
            footer = whatsappInteractive.footer
            header = whatsappInteractive.header
            type = whatsappInteractive.type
            additionalProperties = whatsappInteractive.additionalProperties.toMutableMap()
        }

        fun action(action: Action) = action(JsonField.of(action))

        /**
         * Sets [Builder.action] to an arbitrary JSON value.
         *
         * You should usually call [Builder.action] with a well-typed [Action] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun action(action: JsonField<Action>) = apply { this.action = action }

        fun body(body: InteractiveBody) = body(JsonField.of(body))

        /**
         * Sets [Builder.body] to an arbitrary JSON value.
         *
         * You should usually call [Builder.body] with a well-typed [InteractiveBody] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun body(body: JsonField<InteractiveBody>) = apply { this.body = body }

        fun footer(footer: Footer) = footer(JsonField.of(footer))

        /**
         * Sets [Builder.footer] to an arbitrary JSON value.
         *
         * You should usually call [Builder.footer] with a well-typed [Footer] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun footer(footer: JsonField<Footer>) = apply { this.footer = footer }

        fun header(header: Header) = header(JsonField.of(header))

        /**
         * Sets [Builder.header] to an arbitrary JSON value.
         *
         * You should usually call [Builder.header] with a well-typed [Header] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun header(header: JsonField<Header>) = apply { this.header = header }

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
         * Returns an immutable instance of [WhatsappInteractive].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): WhatsappInteractive =
            WhatsappInteractive(
                action,
                body,
                footer,
                header,
                type,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): WhatsappInteractive = apply {
        if (validated) {
            return@apply
        }

        action().ifPresent { it.validate() }
        body().ifPresent { it.validate() }
        footer().ifPresent { it.validate() }
        header().ifPresent { it.validate() }
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (action.asKnown().getOrNull()?.validity() ?: 0) +
            (body.asKnown().getOrNull()?.validity() ?: 0) +
            (footer.asKnown().getOrNull()?.validity() ?: 0) +
            (header.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0)

    class Action
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val button: JsonField<String>,
        private val buttons: JsonField<List<Button>>,
        private val cards: JsonField<List<Card>>,
        private val catalogId: JsonField<String>,
        private val mode: JsonField<String>,
        private val name: JsonField<String>,
        private val parameters: JsonField<Parameters>,
        private val productRetailerId: JsonField<String>,
        private val sections: JsonField<List<Section>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("button") @ExcludeMissing button: JsonField<String> = JsonMissing.of(),
            @JsonProperty("buttons")
            @ExcludeMissing
            buttons: JsonField<List<Button>> = JsonMissing.of(),
            @JsonProperty("cards") @ExcludeMissing cards: JsonField<List<Card>> = JsonMissing.of(),
            @JsonProperty("catalog_id")
            @ExcludeMissing
            catalogId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("mode") @ExcludeMissing mode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("parameters")
            @ExcludeMissing
            parameters: JsonField<Parameters> = JsonMissing.of(),
            @JsonProperty("product_retailer_id")
            @ExcludeMissing
            productRetailerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sections")
            @ExcludeMissing
            sections: JsonField<List<Section>> = JsonMissing.of(),
        ) : this(
            button,
            buttons,
            cards,
            catalogId,
            mode,
            name,
            parameters,
            productRetailerId,
            sections,
            mutableMapOf(),
        )

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun button(): Optional<String> = button.getOptional("button")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun buttons(): Optional<List<Button>> = buttons.getOptional("buttons")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cards(): Optional<List<Card>> = cards.getOptional("cards")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun catalogId(): Optional<String> = catalogId.getOptional("catalog_id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun mode(): Optional<String> = mode.getOptional("mode")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun parameters(): Optional<Parameters> = parameters.getOptional("parameters")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun productRetailerId(): Optional<String> =
            productRetailerId.getOptional("product_retailer_id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sections(): Optional<List<Section>> = sections.getOptional("sections")

        /**
         * Returns the raw JSON value of [button].
         *
         * Unlike [button], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("button") @ExcludeMissing fun _button(): JsonField<String> = button

        /**
         * Returns the raw JSON value of [buttons].
         *
         * Unlike [buttons], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("buttons") @ExcludeMissing fun _buttons(): JsonField<List<Button>> = buttons

        /**
         * Returns the raw JSON value of [cards].
         *
         * Unlike [cards], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cards") @ExcludeMissing fun _cards(): JsonField<List<Card>> = cards

        /**
         * Returns the raw JSON value of [catalogId].
         *
         * Unlike [catalogId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("catalog_id") @ExcludeMissing fun _catalogId(): JsonField<String> = catalogId

        /**
         * Returns the raw JSON value of [mode].
         *
         * Unlike [mode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mode") @ExcludeMissing fun _mode(): JsonField<String> = mode

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [parameters].
         *
         * Unlike [parameters], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("parameters")
        @ExcludeMissing
        fun _parameters(): JsonField<Parameters> = parameters

        /**
         * Returns the raw JSON value of [productRetailerId].
         *
         * Unlike [productRetailerId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("product_retailer_id")
        @ExcludeMissing
        fun _productRetailerId(): JsonField<String> = productRetailerId

        /**
         * Returns the raw JSON value of [sections].
         *
         * Unlike [sections], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sections")
        @ExcludeMissing
        fun _sections(): JsonField<List<Section>> = sections

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

            /** Returns a mutable builder for constructing an instance of [Action]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Action]. */
        class Builder internal constructor() {

            private var button: JsonField<String> = JsonMissing.of()
            private var buttons: JsonField<MutableList<Button>>? = null
            private var cards: JsonField<MutableList<Card>>? = null
            private var catalogId: JsonField<String> = JsonMissing.of()
            private var mode: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var parameters: JsonField<Parameters> = JsonMissing.of()
            private var productRetailerId: JsonField<String> = JsonMissing.of()
            private var sections: JsonField<MutableList<Section>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(action: Action) = apply {
                button = action.button
                buttons = action.buttons.map { it.toMutableList() }
                cards = action.cards.map { it.toMutableList() }
                catalogId = action.catalogId
                mode = action.mode
                name = action.name
                parameters = action.parameters
                productRetailerId = action.productRetailerId
                sections = action.sections.map { it.toMutableList() }
                additionalProperties = action.additionalProperties.toMutableMap()
            }

            fun button(button: String) = button(JsonField.of(button))

            /**
             * Sets [Builder.button] to an arbitrary JSON value.
             *
             * You should usually call [Builder.button] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun button(button: JsonField<String>) = apply { this.button = button }

            fun buttons(buttons: List<Button>) = buttons(JsonField.of(buttons))

            /**
             * Sets [Builder.buttons] to an arbitrary JSON value.
             *
             * You should usually call [Builder.buttons] with a well-typed `List<Button>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            fun cards(cards: List<Card>) = cards(JsonField.of(cards))

            /**
             * Sets [Builder.cards] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cards] with a well-typed `List<Card>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cards(cards: JsonField<List<Card>>) = apply {
                this.cards = cards.map { it.toMutableList() }
            }

            /**
             * Adds a single [Card] to [cards].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCard(card: Card) = apply {
                cards =
                    (cards ?: JsonField.of(mutableListOf())).also {
                        checkKnown("cards", it).add(card)
                    }
            }

            fun catalogId(catalogId: String) = catalogId(JsonField.of(catalogId))

            /**
             * Sets [Builder.catalogId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.catalogId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun catalogId(catalogId: JsonField<String>) = apply { this.catalogId = catalogId }

            fun mode(mode: String) = mode(JsonField.of(mode))

            /**
             * Sets [Builder.mode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mode] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun mode(mode: JsonField<String>) = apply { this.mode = mode }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun parameters(parameters: Parameters) = parameters(JsonField.of(parameters))

            /**
             * Sets [Builder.parameters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.parameters] with a well-typed [Parameters] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun parameters(parameters: JsonField<Parameters>) = apply {
                this.parameters = parameters
            }

            fun productRetailerId(productRetailerId: String) =
                productRetailerId(JsonField.of(productRetailerId))

            /**
             * Sets [Builder.productRetailerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.productRetailerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun productRetailerId(productRetailerId: JsonField<String>) = apply {
                this.productRetailerId = productRetailerId
            }

            fun sections(sections: List<Section>) = sections(JsonField.of(sections))

            /**
             * Sets [Builder.sections] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sections] with a well-typed `List<Section>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sections(sections: JsonField<List<Section>>) = apply {
                this.sections = sections.map { it.toMutableList() }
            }

            /**
             * Adds a single [Section] to [sections].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSection(section: Section) = apply {
                sections =
                    (sections ?: JsonField.of(mutableListOf())).also {
                        checkKnown("sections", it).add(section)
                    }
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
             * Returns an immutable instance of [Action].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Action =
                Action(
                    button,
                    (buttons ?: JsonMissing.of()).map { it.toImmutable() },
                    (cards ?: JsonMissing.of()).map { it.toImmutable() },
                    catalogId,
                    mode,
                    name,
                    parameters,
                    productRetailerId,
                    (sections ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Action = apply {
            if (validated) {
                return@apply
            }

            button()
            buttons().ifPresent { it.forEach { it.validate() } }
            cards().ifPresent { it.forEach { it.validate() } }
            catalogId()
            mode()
            name()
            parameters().ifPresent { it.validate() }
            productRetailerId()
            sections().ifPresent { it.forEach { it.validate() } }
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
            (if (button.asKnown().isPresent) 1 else 0) +
                (buttons.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (cards.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (catalogId.asKnown().isPresent) 1 else 0) +
                (if (mode.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (parameters.asKnown().getOrNull()?.validity() ?: 0) +
                (if (productRetailerId.asKnown().isPresent) 1 else 0) +
                (sections.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        class Button
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val reply: JsonField<Reply>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("reply") @ExcludeMissing reply: JsonField<Reply> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(reply, type, mutableMapOf())

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun reply(): Optional<Reply> = reply.getOptional("reply")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun type(): Optional<Type> = type.getOptional("type")

            /**
             * Returns the raw JSON value of [reply].
             *
             * Unlike [reply], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("reply") @ExcludeMissing fun _reply(): JsonField<Reply> = reply

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

                /** Returns a mutable builder for constructing an instance of [Button]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Button]. */
            class Builder internal constructor() {

                private var reply: JsonField<Reply> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(button: Button) = apply {
                    reply = button.reply
                    type = button.type
                    additionalProperties = button.additionalProperties.toMutableMap()
                }

                fun reply(reply: Reply) = reply(JsonField.of(reply))

                /**
                 * Sets [Builder.reply] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reply] with a well-typed [Reply] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun reply(reply: JsonField<Reply>) = apply { this.reply = reply }

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
                 * Returns an immutable instance of [Button].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Button = Button(reply, type, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Button = apply {
                if (validated) {
                    return@apply
                }

                reply().ifPresent { it.validate() }
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
                (reply.asKnown().getOrNull()?.validity() ?: 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

            class Reply
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val id: JsonField<String>,
                private val title: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("title")
                    @ExcludeMissing
                    title: JsonField<String> = JsonMissing.of(),
                ) : this(id, title, mutableMapOf())

                /**
                 * unique identifier for each button, 256 character maximum
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun id(): Optional<String> = id.getOptional("id")

                /**
                 * button label, 20 character maximum
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun title(): Optional<String> = title.getOptional("title")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [title].
                 *
                 * Unlike [title], this method doesn't throw if the JSON field has an unexpected
                 * type.
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

                    /** Returns a mutable builder for constructing an instance of [Reply]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Reply]. */
                class Builder internal constructor() {

                    private var id: JsonField<String> = JsonMissing.of()
                    private var title: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(reply: Reply) = apply {
                        id = reply.id
                        title = reply.title
                        additionalProperties = reply.additionalProperties.toMutableMap()
                    }

                    /** unique identifier for each button, 256 character maximum */
                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    /** button label, 20 character maximum */
                    fun title(title: String) = title(JsonField.of(title))

                    /**
                     * Sets [Builder.title] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.title] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun title(title: JsonField<String>) = apply { this.title = title }

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
                     * Returns an immutable instance of [Reply].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Reply = Reply(id, title, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): Reply = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (id.asKnown().isPresent) 1 else 0) +
                        (if (title.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Reply &&
                        id == other.id &&
                        title == other.title &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(id, title, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Reply{id=$id, title=$title, additionalProperties=$additionalProperties}"
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

                    @JvmField val REPLY = of("reply")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    REPLY
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
                    REPLY,
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
                        REPLY -> Value.REPLY
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
                        REPLY -> Known.REPLY
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

                return other is Button &&
                    reply == other.reply &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(reply, type, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Button{reply=$reply, type=$type, additionalProperties=$additionalProperties}"
        }

        class Card
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val action: JsonField<CardAction>,
            private val body: JsonField<CardBody>,
            private val cardIndex: JsonField<Long>,
            private val header: JsonField<Header>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("action")
                @ExcludeMissing
                action: JsonField<CardAction> = JsonMissing.of(),
                @JsonProperty("body") @ExcludeMissing body: JsonField<CardBody> = JsonMissing.of(),
                @JsonProperty("card_index")
                @ExcludeMissing
                cardIndex: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("header")
                @ExcludeMissing
                header: JsonField<Header> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(action, body, cardIndex, header, type, mutableMapOf())

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun action(): Optional<CardAction> = action.getOptional("action")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun body(): Optional<CardBody> = body.getOptional("body")

            /**
             * unique index for each card (0-9)
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun cardIndex(): Optional<Long> = cardIndex.getOptional("card_index")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun header(): Optional<Header> = header.getOptional("header")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun type(): Optional<Type> = type.getOptional("type")

            /**
             * Returns the raw JSON value of [action].
             *
             * Unlike [action], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("action") @ExcludeMissing fun _action(): JsonField<CardAction> = action

            /**
             * Returns the raw JSON value of [body].
             *
             * Unlike [body], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("body") @ExcludeMissing fun _body(): JsonField<CardBody> = body

            /**
             * Returns the raw JSON value of [cardIndex].
             *
             * Unlike [cardIndex], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("card_index")
            @ExcludeMissing
            fun _cardIndex(): JsonField<Long> = cardIndex

            /**
             * Returns the raw JSON value of [header].
             *
             * Unlike [header], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("header") @ExcludeMissing fun _header(): JsonField<Header> = header

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

                /** Returns a mutable builder for constructing an instance of [Card]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Card]. */
            class Builder internal constructor() {

                private var action: JsonField<CardAction> = JsonMissing.of()
                private var body: JsonField<CardBody> = JsonMissing.of()
                private var cardIndex: JsonField<Long> = JsonMissing.of()
                private var header: JsonField<Header> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(card: Card) = apply {
                    action = card.action
                    body = card.body
                    cardIndex = card.cardIndex
                    header = card.header
                    type = card.type
                    additionalProperties = card.additionalProperties.toMutableMap()
                }

                fun action(action: CardAction) = action(JsonField.of(action))

                /**
                 * Sets [Builder.action] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.action] with a well-typed [CardAction] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun action(action: JsonField<CardAction>) = apply { this.action = action }

                fun body(body: CardBody) = body(JsonField.of(body))

                /**
                 * Sets [Builder.body] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.body] with a well-typed [CardBody] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun body(body: JsonField<CardBody>) = apply { this.body = body }

                /** unique index for each card (0-9) */
                fun cardIndex(cardIndex: Long) = cardIndex(JsonField.of(cardIndex))

                /**
                 * Sets [Builder.cardIndex] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cardIndex] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun cardIndex(cardIndex: JsonField<Long>) = apply { this.cardIndex = cardIndex }

                fun header(header: Header) = header(JsonField.of(header))

                /**
                 * Sets [Builder.header] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.header] with a well-typed [Header] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun header(header: JsonField<Header>) = apply { this.header = header }

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
                 * Returns an immutable instance of [Card].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Card =
                    Card(action, body, cardIndex, header, type, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Card = apply {
                if (validated) {
                    return@apply
                }

                action().ifPresent { it.validate() }
                body().ifPresent { it.validate() }
                cardIndex()
                header().ifPresent { it.validate() }
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
                (action.asKnown().getOrNull()?.validity() ?: 0) +
                    (body.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (cardIndex.asKnown().isPresent) 1 else 0) +
                    (header.asKnown().getOrNull()?.validity() ?: 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

            class CardAction
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val catalogId: JsonField<String>,
                private val productRetailerId: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("catalog_id")
                    @ExcludeMissing
                    catalogId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("product_retailer_id")
                    @ExcludeMissing
                    productRetailerId: JsonField<String> = JsonMissing.of(),
                ) : this(catalogId, productRetailerId, mutableMapOf())

                /**
                 * the unique ID of the catalog
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun catalogId(): Optional<String> = catalogId.getOptional("catalog_id")

                /**
                 * the unique retailer ID of the product
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun productRetailerId(): Optional<String> =
                    productRetailerId.getOptional("product_retailer_id")

                /**
                 * Returns the raw JSON value of [catalogId].
                 *
                 * Unlike [catalogId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("catalog_id")
                @ExcludeMissing
                fun _catalogId(): JsonField<String> = catalogId

                /**
                 * Returns the raw JSON value of [productRetailerId].
                 *
                 * Unlike [productRetailerId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("product_retailer_id")
                @ExcludeMissing
                fun _productRetailerId(): JsonField<String> = productRetailerId

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

                    /** Returns a mutable builder for constructing an instance of [CardAction]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [CardAction]. */
                class Builder internal constructor() {

                    private var catalogId: JsonField<String> = JsonMissing.of()
                    private var productRetailerId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(cardAction: CardAction) = apply {
                        catalogId = cardAction.catalogId
                        productRetailerId = cardAction.productRetailerId
                        additionalProperties = cardAction.additionalProperties.toMutableMap()
                    }

                    /** the unique ID of the catalog */
                    fun catalogId(catalogId: String) = catalogId(JsonField.of(catalogId))

                    /**
                     * Sets [Builder.catalogId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.catalogId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun catalogId(catalogId: JsonField<String>) = apply {
                        this.catalogId = catalogId
                    }

                    /** the unique retailer ID of the product */
                    fun productRetailerId(productRetailerId: String) =
                        productRetailerId(JsonField.of(productRetailerId))

                    /**
                     * Sets [Builder.productRetailerId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.productRetailerId] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun productRetailerId(productRetailerId: JsonField<String>) = apply {
                        this.productRetailerId = productRetailerId
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
                     * Returns an immutable instance of [CardAction].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): CardAction =
                        CardAction(
                            catalogId,
                            productRetailerId,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): CardAction = apply {
                    if (validated) {
                        return@apply
                    }

                    catalogId()
                    productRetailerId()
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
                    (if (catalogId.asKnown().isPresent) 1 else 0) +
                        (if (productRetailerId.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CardAction &&
                        catalogId == other.catalogId &&
                        productRetailerId == other.productRetailerId &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(catalogId, productRetailerId, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "CardAction{catalogId=$catalogId, productRetailerId=$productRetailerId, additionalProperties=$additionalProperties}"
            }

            class CardBody
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val text: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of()
                ) : this(text, mutableMapOf())

                /**
                 * 160 character maximum, up to 2 line breaks
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun text(): Optional<String> = text.getOptional("text")

                /**
                 * Returns the raw JSON value of [text].
                 *
                 * Unlike [text], this method doesn't throw if the JSON field has an unexpected
                 * type.
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

                    /** Returns a mutable builder for constructing an instance of [CardBody]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [CardBody]. */
                class Builder internal constructor() {

                    private var text: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(cardBody: CardBody) = apply {
                        text = cardBody.text
                        additionalProperties = cardBody.additionalProperties.toMutableMap()
                    }

                    /** 160 character maximum, up to 2 line breaks */
                    fun text(text: String) = text(JsonField.of(text))

                    /**
                     * Sets [Builder.text] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.text] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun text(text: JsonField<String>) = apply { this.text = text }

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
                     * Returns an immutable instance of [CardBody].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): CardBody = CardBody(text, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): CardBody = apply {
                    if (validated) {
                        return@apply
                    }

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
                internal fun validity(): Int = (if (text.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CardBody &&
                        text == other.text &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(text, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "CardBody{text=$text, additionalProperties=$additionalProperties}"
            }

            class Header
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val image: JsonField<WhatsappMedia>,
                private val type: JsonField<Type>,
                private val video: JsonField<WhatsappMedia>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("image")
                    @ExcludeMissing
                    image: JsonField<WhatsappMedia> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                    @JsonProperty("video")
                    @ExcludeMissing
                    video: JsonField<WhatsappMedia> = JsonMissing.of(),
                ) : this(image, type, video, mutableMapOf())

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun image(): Optional<WhatsappMedia> = image.getOptional("image")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun type(): Optional<Type> = type.getOptional("type")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun video(): Optional<WhatsappMedia> = video.getOptional("video")

                /**
                 * Returns the raw JSON value of [image].
                 *
                 * Unlike [image], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("image")
                @ExcludeMissing
                fun _image(): JsonField<WhatsappMedia> = image

                /**
                 * Returns the raw JSON value of [type].
                 *
                 * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                /**
                 * Returns the raw JSON value of [video].
                 *
                 * Unlike [video], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("video")
                @ExcludeMissing
                fun _video(): JsonField<WhatsappMedia> = video

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

                    /** Returns a mutable builder for constructing an instance of [Header]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Header]. */
                class Builder internal constructor() {

                    private var image: JsonField<WhatsappMedia> = JsonMissing.of()
                    private var type: JsonField<Type> = JsonMissing.of()
                    private var video: JsonField<WhatsappMedia> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(header: Header) = apply {
                        image = header.image
                        type = header.type
                        video = header.video
                        additionalProperties = header.additionalProperties.toMutableMap()
                    }

                    fun image(image: WhatsappMedia) = image(JsonField.of(image))

                    /**
                     * Sets [Builder.image] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.image] with a well-typed [WhatsappMedia]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun image(image: JsonField<WhatsappMedia>) = apply { this.image = image }

                    fun type(type: Type) = type(JsonField.of(type))

                    /**
                     * Sets [Builder.type] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.type] with a well-typed [Type] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun type(type: JsonField<Type>) = apply { this.type = type }

                    fun video(video: WhatsappMedia) = video(JsonField.of(video))

                    /**
                     * Sets [Builder.video] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.video] with a well-typed [WhatsappMedia]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun video(video: JsonField<WhatsappMedia>) = apply { this.video = video }

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
                     * Returns an immutable instance of [Header].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Header =
                        Header(image, type, video, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): Header = apply {
                    if (validated) {
                        return@apply
                    }

                    image().ifPresent { it.validate() }
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (image.asKnown().getOrNull()?.validity() ?: 0) +
                        (type.asKnown().getOrNull()?.validity() ?: 0) +
                        (video.asKnown().getOrNull()?.validity() ?: 0)

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

                        @JvmField val IMAGE = of("image")

                        @JvmField val VIDEO = of("video")

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    /** An enum containing [Type]'s known values. */
                    enum class Known {
                        IMAGE,
                        VIDEO,
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
                        IMAGE,
                        VIDEO,
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
                            IMAGE -> Value.IMAGE
                            VIDEO -> Value.VIDEO
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
                            IMAGE -> Known.IMAGE
                            VIDEO -> Known.VIDEO
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

                    return other is Header &&
                        image == other.image &&
                        type == other.type &&
                        video == other.video &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(image, type, video, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Header{image=$image, type=$type, video=$video, additionalProperties=$additionalProperties}"
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

                    @JvmField val CTA_URL = of("cta_url")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    CTA_URL
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
                    CTA_URL,
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
                        CTA_URL -> Value.CTA_URL
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
                        CTA_URL -> Known.CTA_URL
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

                return other is Card &&
                    action == other.action &&
                    body == other.body &&
                    cardIndex == other.cardIndex &&
                    header == other.header &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(action, body, cardIndex, header, type, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Card{action=$action, body=$body, cardIndex=$cardIndex, header=$header, type=$type, additionalProperties=$additionalProperties}"
        }

        class Parameters
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val displayText: JsonField<String>,
            private val url: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("display_text")
                @ExcludeMissing
                displayText: JsonField<String> = JsonMissing.of(),
                @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
            ) : this(displayText, url, mutableMapOf())

            /**
             * button label text, 20 character maximum
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun displayText(): Optional<String> = displayText.getOptional("display_text")

            /**
             * button URL to load when tapped by the user
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun url(): Optional<String> = url.getOptional("url")

            /**
             * Returns the raw JSON value of [displayText].
             *
             * Unlike [displayText], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("display_text")
            @ExcludeMissing
            fun _displayText(): JsonField<String> = displayText

            /**
             * Returns the raw JSON value of [url].
             *
             * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

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

                /** Returns a mutable builder for constructing an instance of [Parameters]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Parameters]. */
            class Builder internal constructor() {

                private var displayText: JsonField<String> = JsonMissing.of()
                private var url: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(parameters: Parameters) = apply {
                    displayText = parameters.displayText
                    url = parameters.url
                    additionalProperties = parameters.additionalProperties.toMutableMap()
                }

                /** button label text, 20 character maximum */
                fun displayText(displayText: String) = displayText(JsonField.of(displayText))

                /**
                 * Sets [Builder.displayText] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.displayText] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun displayText(displayText: JsonField<String>) = apply {
                    this.displayText = displayText
                }

                /** button URL to load when tapped by the user */
                fun url(url: String) = url(JsonField.of(url))

                /**
                 * Sets [Builder.url] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.url] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun url(url: JsonField<String>) = apply { this.url = url }

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
                 * Returns an immutable instance of [Parameters].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Parameters =
                    Parameters(displayText, url, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Parameters = apply {
                if (validated) {
                    return@apply
                }

                displayText()
                url()
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
                (if (displayText.asKnown().isPresent) 1 else 0) +
                    (if (url.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Parameters &&
                    displayText == other.displayText &&
                    url == other.url &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(displayText, url, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Parameters{displayText=$displayText, url=$url, additionalProperties=$additionalProperties}"
        }

        class Section
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val productItems: JsonField<List<ProductItem>>,
            private val rows: JsonField<List<Row>>,
            private val title: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("product_items")
                @ExcludeMissing
                productItems: JsonField<List<ProductItem>> = JsonMissing.of(),
                @JsonProperty("rows") @ExcludeMissing rows: JsonField<List<Row>> = JsonMissing.of(),
                @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
            ) : this(productItems, rows, title, mutableMapOf())

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun productItems(): Optional<List<ProductItem>> =
                productItems.getOptional("product_items")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun rows(): Optional<List<Row>> = rows.getOptional("rows")

            /**
             * section title, 24 character maximum
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun title(): Optional<String> = title.getOptional("title")

            /**
             * Returns the raw JSON value of [productItems].
             *
             * Unlike [productItems], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("product_items")
            @ExcludeMissing
            fun _productItems(): JsonField<List<ProductItem>> = productItems

            /**
             * Returns the raw JSON value of [rows].
             *
             * Unlike [rows], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("rows") @ExcludeMissing fun _rows(): JsonField<List<Row>> = rows

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

                /** Returns a mutable builder for constructing an instance of [Section]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Section]. */
            class Builder internal constructor() {

                private var productItems: JsonField<MutableList<ProductItem>>? = null
                private var rows: JsonField<MutableList<Row>>? = null
                private var title: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(section: Section) = apply {
                    productItems = section.productItems.map { it.toMutableList() }
                    rows = section.rows.map { it.toMutableList() }
                    title = section.title
                    additionalProperties = section.additionalProperties.toMutableMap()
                }

                fun productItems(productItems: List<ProductItem>) =
                    productItems(JsonField.of(productItems))

                /**
                 * Sets [Builder.productItems] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.productItems] with a well-typed
                 * `List<ProductItem>` value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun productItems(productItems: JsonField<List<ProductItem>>) = apply {
                    this.productItems = productItems.map { it.toMutableList() }
                }

                /**
                 * Adds a single [ProductItem] to [productItems].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addProductItem(productItem: ProductItem) = apply {
                    productItems =
                        (productItems ?: JsonField.of(mutableListOf())).also {
                            checkKnown("productItems", it).add(productItem)
                        }
                }

                fun rows(rows: List<Row>) = rows(JsonField.of(rows))

                /**
                 * Sets [Builder.rows] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.rows] with a well-typed `List<Row>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun rows(rows: JsonField<List<Row>>) = apply {
                    this.rows = rows.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Row] to [rows].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addRow(row: Row) = apply {
                    rows =
                        (rows ?: JsonField.of(mutableListOf())).also {
                            checkKnown("rows", it).add(row)
                        }
                }

                /** section title, 24 character maximum */
                fun title(title: String) = title(JsonField.of(title))

                /**
                 * Sets [Builder.title] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.title] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun title(title: JsonField<String>) = apply { this.title = title }

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
                 * Returns an immutable instance of [Section].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Section =
                    Section(
                        (productItems ?: JsonMissing.of()).map { it.toImmutable() },
                        (rows ?: JsonMissing.of()).map { it.toImmutable() },
                        title,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Section = apply {
                if (validated) {
                    return@apply
                }

                productItems().ifPresent { it.forEach { it.validate() } }
                rows().ifPresent { it.forEach { it.validate() } }
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (productItems.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (rows.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (title.asKnown().isPresent) 1 else 0)

            class ProductItem
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val productRetailerId: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("product_retailer_id")
                    @ExcludeMissing
                    productRetailerId: JsonField<String> = JsonMissing.of()
                ) : this(productRetailerId, mutableMapOf())

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun productRetailerId(): Optional<String> =
                    productRetailerId.getOptional("product_retailer_id")

                /**
                 * Returns the raw JSON value of [productRetailerId].
                 *
                 * Unlike [productRetailerId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("product_retailer_id")
                @ExcludeMissing
                fun _productRetailerId(): JsonField<String> = productRetailerId

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

                    /** Returns a mutable builder for constructing an instance of [ProductItem]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [ProductItem]. */
                class Builder internal constructor() {

                    private var productRetailerId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(productItem: ProductItem) = apply {
                        productRetailerId = productItem.productRetailerId
                        additionalProperties = productItem.additionalProperties.toMutableMap()
                    }

                    fun productRetailerId(productRetailerId: String) =
                        productRetailerId(JsonField.of(productRetailerId))

                    /**
                     * Sets [Builder.productRetailerId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.productRetailerId] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun productRetailerId(productRetailerId: JsonField<String>) = apply {
                        this.productRetailerId = productRetailerId
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
                     * Returns an immutable instance of [ProductItem].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): ProductItem =
                        ProductItem(productRetailerId, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): ProductItem = apply {
                    if (validated) {
                        return@apply
                    }

                    productRetailerId()
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
                internal fun validity(): Int = (if (productRetailerId.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ProductItem &&
                        productRetailerId == other.productRetailerId &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(productRetailerId, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ProductItem{productRetailerId=$productRetailerId, additionalProperties=$additionalProperties}"
            }

            class Row
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val id: JsonField<String>,
                private val description: JsonField<String>,
                private val title: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("description")
                    @ExcludeMissing
                    description: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("title")
                    @ExcludeMissing
                    title: JsonField<String> = JsonMissing.of(),
                ) : this(id, description, title, mutableMapOf())

                /**
                 * arbitrary string identifying the row, 200 character maximum
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun id(): Optional<String> = id.getOptional("id")

                /**
                 * row description, 72 character maximum
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun description(): Optional<String> = description.getOptional("description")

                /**
                 * row title, 24 character maximum
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun title(): Optional<String> = title.getOptional("title")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [description].
                 *
                 * Unlike [description], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("description")
                @ExcludeMissing
                fun _description(): JsonField<String> = description

                /**
                 * Returns the raw JSON value of [title].
                 *
                 * Unlike [title], this method doesn't throw if the JSON field has an unexpected
                 * type.
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

                    /** Returns a mutable builder for constructing an instance of [Row]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Row]. */
                class Builder internal constructor() {

                    private var id: JsonField<String> = JsonMissing.of()
                    private var description: JsonField<String> = JsonMissing.of()
                    private var title: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(row: Row) = apply {
                        id = row.id
                        description = row.description
                        title = row.title
                        additionalProperties = row.additionalProperties.toMutableMap()
                    }

                    /** arbitrary string identifying the row, 200 character maximum */
                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    /** row description, 72 character maximum */
                    fun description(description: String) = description(JsonField.of(description))

                    /**
                     * Sets [Builder.description] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.description] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun description(description: JsonField<String>) = apply {
                        this.description = description
                    }

                    /** row title, 24 character maximum */
                    fun title(title: String) = title(JsonField.of(title))

                    /**
                     * Sets [Builder.title] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.title] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun title(title: JsonField<String>) = apply { this.title = title }

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
                     * Returns an immutable instance of [Row].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Row =
                        Row(id, description, title, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): Row = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    description()
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (id.asKnown().isPresent) 1 else 0) +
                        (if (description.asKnown().isPresent) 1 else 0) +
                        (if (title.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Row &&
                        id == other.id &&
                        description == other.description &&
                        title == other.title &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(id, description, title, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Row{id=$id, description=$description, title=$title, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Section &&
                    productItems == other.productItems &&
                    rows == other.rows &&
                    title == other.title &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(productItems, rows, title, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Section{productItems=$productItems, rows=$rows, title=$title, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Action &&
                button == other.button &&
                buttons == other.buttons &&
                cards == other.cards &&
                catalogId == other.catalogId &&
                mode == other.mode &&
                name == other.name &&
                parameters == other.parameters &&
                productRetailerId == other.productRetailerId &&
                sections == other.sections &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                button,
                buttons,
                cards,
                catalogId,
                mode,
                name,
                parameters,
                productRetailerId,
                sections,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Action{button=$button, buttons=$buttons, cards=$cards, catalogId=$catalogId, mode=$mode, name=$name, parameters=$parameters, productRetailerId=$productRetailerId, sections=$sections, additionalProperties=$additionalProperties}"
    }

    class InteractiveBody
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val text: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of()
        ) : this(text, mutableMapOf())

        /**
         * body text, 1024 character maximum
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun text(): Optional<String> = text.getOptional("text")

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

            /** Returns a mutable builder for constructing an instance of [InteractiveBody]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [InteractiveBody]. */
        class Builder internal constructor() {

            private var text: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(interactiveBody: InteractiveBody) = apply {
                text = interactiveBody.text
                additionalProperties = interactiveBody.additionalProperties.toMutableMap()
            }

            /** body text, 1024 character maximum */
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
             * Returns an immutable instance of [InteractiveBody].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): InteractiveBody =
                InteractiveBody(text, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): InteractiveBody = apply {
            if (validated) {
                return@apply
            }

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
        @JvmSynthetic internal fun validity(): Int = (if (text.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is InteractiveBody &&
                text == other.text &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(text, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InteractiveBody{text=$text, additionalProperties=$additionalProperties}"
    }

    class Footer
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val text: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of()
        ) : this(text, mutableMapOf())

        /**
         * footer text, 60 character maximum
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun text(): Optional<String> = text.getOptional("text")

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

            /** Returns a mutable builder for constructing an instance of [Footer]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Footer]. */
        class Builder internal constructor() {

            private var text: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(footer: Footer) = apply {
                text = footer.text
                additionalProperties = footer.additionalProperties.toMutableMap()
            }

            /** footer text, 60 character maximum */
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
             * Returns an immutable instance of [Footer].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Footer = Footer(text, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Footer = apply {
            if (validated) {
                return@apply
            }

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
        @JvmSynthetic internal fun validity(): Int = (if (text.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Footer &&
                text == other.text &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(text, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Footer{text=$text, additionalProperties=$additionalProperties}"
    }

    class Header
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val document: JsonField<WhatsappMedia>,
        private val image: JsonField<WhatsappMedia>,
        private val subText: JsonField<String>,
        private val text: JsonField<String>,
        private val video: JsonField<WhatsappMedia>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("document")
            @ExcludeMissing
            document: JsonField<WhatsappMedia> = JsonMissing.of(),
            @JsonProperty("image")
            @ExcludeMissing
            image: JsonField<WhatsappMedia> = JsonMissing.of(),
            @JsonProperty("sub_text") @ExcludeMissing subText: JsonField<String> = JsonMissing.of(),
            @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
            @JsonProperty("video")
            @ExcludeMissing
            video: JsonField<WhatsappMedia> = JsonMissing.of(),
        ) : this(document, image, subText, text, video, mutableMapOf())

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
        fun subText(): Optional<String> = subText.getOptional("sub_text")

        /**
         * header text, 60 character maximum
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun text(): Optional<String> = text.getOptional("text")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun video(): Optional<WhatsappMedia> = video.getOptional("video")

        /**
         * Returns the raw JSON value of [document].
         *
         * Unlike [document], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("document")
        @ExcludeMissing
        fun _document(): JsonField<WhatsappMedia> = document

        /**
         * Returns the raw JSON value of [image].
         *
         * Unlike [image], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("image") @ExcludeMissing fun _image(): JsonField<WhatsappMedia> = image

        /**
         * Returns the raw JSON value of [subText].
         *
         * Unlike [subText], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sub_text") @ExcludeMissing fun _subText(): JsonField<String> = subText

        /**
         * Returns the raw JSON value of [text].
         *
         * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

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

            /** Returns a mutable builder for constructing an instance of [Header]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Header]. */
        class Builder internal constructor() {

            private var document: JsonField<WhatsappMedia> = JsonMissing.of()
            private var image: JsonField<WhatsappMedia> = JsonMissing.of()
            private var subText: JsonField<String> = JsonMissing.of()
            private var text: JsonField<String> = JsonMissing.of()
            private var video: JsonField<WhatsappMedia> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(header: Header) = apply {
                document = header.document
                image = header.image
                subText = header.subText
                text = header.text
                video = header.video
                additionalProperties = header.additionalProperties.toMutableMap()
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
             * You should usually call [Builder.image] with a well-typed [WhatsappMedia] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun image(image: JsonField<WhatsappMedia>) = apply { this.image = image }

            fun subText(subText: String) = subText(JsonField.of(subText))

            /**
             * Sets [Builder.subText] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subText] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun subText(subText: JsonField<String>) = apply { this.subText = subText }

            /** header text, 60 character maximum */
            fun text(text: String) = text(JsonField.of(text))

            /**
             * Sets [Builder.text] to an arbitrary JSON value.
             *
             * You should usually call [Builder.text] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun text(text: JsonField<String>) = apply { this.text = text }

            fun video(video: WhatsappMedia) = video(JsonField.of(video))

            /**
             * Sets [Builder.video] to an arbitrary JSON value.
             *
             * You should usually call [Builder.video] with a well-typed [WhatsappMedia] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [Header].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Header =
                Header(document, image, subText, text, video, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Header = apply {
            if (validated) {
                return@apply
            }

            document().ifPresent { it.validate() }
            image().ifPresent { it.validate() }
            subText()
            text()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (document.asKnown().getOrNull()?.validity() ?: 0) +
                (image.asKnown().getOrNull()?.validity() ?: 0) +
                (if (subText.asKnown().isPresent) 1 else 0) +
                (if (text.asKnown().isPresent) 1 else 0) +
                (video.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Header &&
                document == other.document &&
                image == other.image &&
                subText == other.subText &&
                text == other.text &&
                video == other.video &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(document, image, subText, text, video, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Header{document=$document, image=$image, subText=$subText, text=$text, video=$video, additionalProperties=$additionalProperties}"
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

            @JvmField val CTA_URL = of("cta_url")

            @JvmField val LIST = of("list")

            @JvmField val CAROUSEL = of("carousel")

            @JvmField val BUTTON = of("button")

            @JvmField val LOCATION_REQUEST_MESSAGE = of("location_request_message")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            CTA_URL,
            LIST,
            CAROUSEL,
            BUTTON,
            LOCATION_REQUEST_MESSAGE,
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
            CTA_URL,
            LIST,
            CAROUSEL,
            BUTTON,
            LOCATION_REQUEST_MESSAGE,
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
                CTA_URL -> Value.CTA_URL
                LIST -> Value.LIST
                CAROUSEL -> Value.CAROUSEL
                BUTTON -> Value.BUTTON
                LOCATION_REQUEST_MESSAGE -> Value.LOCATION_REQUEST_MESSAGE
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
                CTA_URL -> Known.CTA_URL
                LIST -> Known.LIST
                CAROUSEL -> Known.CAROUSEL
                BUTTON -> Known.BUTTON
                LOCATION_REQUEST_MESSAGE -> Known.LOCATION_REQUEST_MESSAGE
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

        return other is WhatsappInteractive &&
            action == other.action &&
            body == other.body &&
            footer == other.footer &&
            header == other.header &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(action, body, footer, header, type, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WhatsappInteractive{action=$action, body=$body, footer=$footer, header=$header, type=$type, additionalProperties=$additionalProperties}"
}
