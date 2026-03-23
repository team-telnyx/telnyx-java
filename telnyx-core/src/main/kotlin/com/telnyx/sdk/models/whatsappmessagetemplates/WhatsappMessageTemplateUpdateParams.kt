// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsappmessagetemplates

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.BaseDeserializer
import com.telnyx.sdk.core.BaseSerializer
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.allMaxBy
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Update a Whatsapp message template */
class WhatsappMessageTemplateUpdateParams
private constructor(
    private val id: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun category(): Optional<Category> = body.category()

    /**
     * Updated template components. Same structure as the create request.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun components(): Optional<List<Component>> = body.components()

    /**
     * Returns the raw JSON value of [category].
     *
     * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _category(): JsonField<Category> = body._category()

    /**
     * Returns the raw JSON value of [components].
     *
     * Unlike [components], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _components(): JsonField<List<Component>> = body._components()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): WhatsappMessageTemplateUpdateParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [WhatsappMessageTemplateUpdateParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WhatsappMessageTemplateUpdateParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            whatsappMessageTemplateUpdateParams: WhatsappMessageTemplateUpdateParams
        ) = apply {
            id = whatsappMessageTemplateUpdateParams.id
            body = whatsappMessageTemplateUpdateParams.body.toBuilder()
            additionalHeaders = whatsappMessageTemplateUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                whatsappMessageTemplateUpdateParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [category]
         * - [components]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun category(category: Category) = apply { body.category(category) }

        /**
         * Sets [Builder.category] to an arbitrary JSON value.
         *
         * You should usually call [Builder.category] with a well-typed [Category] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun category(category: JsonField<Category>) = apply { body.category(category) }

        /** Updated template components. Same structure as the create request. */
        fun components(components: List<Component>) = apply { body.components(components) }

        /**
         * Sets [Builder.components] to an arbitrary JSON value.
         *
         * You should usually call [Builder.components] with a well-typed `List<Component>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun components(components: JsonField<List<Component>>) = apply {
            body.components(components)
        }

        /**
         * Adds a single [Component] to [components].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addComponent(component: Component) = apply { body.addComponent(component) }

        /**
         * Alias for calling [addComponent] with
         * `Component.ofWhatsappTemplateHeader(whatsappTemplateHeader)`.
         */
        fun addComponent(whatsappTemplateHeader: Component.WhatsappTemplateHeaderComponent) =
            apply {
                body.addComponent(whatsappTemplateHeader)
            }

        /**
         * Alias for calling [addComponent] with
         * `Component.ofWhatsappTemplateBody(whatsappTemplateBody)`.
         */
        fun addComponent(whatsappTemplateBody: Component.WhatsappTemplateBodyComponent) = apply {
            body.addComponent(whatsappTemplateBody)
        }

        /**
         * Alias for calling [addComponent] with
         * `Component.ofWhatsappTemplateFooter(whatsappTemplateFooter)`.
         */
        fun addComponent(whatsappTemplateFooter: Component.WhatsappTemplateFooterComponent) =
            apply {
                body.addComponent(whatsappTemplateFooter)
            }

        /**
         * Alias for calling [addComponent] with
         * `Component.ofWhatsappTemplateButtons(whatsappTemplateButtons)`.
         */
        fun addComponent(whatsappTemplateButtons: Component.WhatsappTemplateButtonsComponent) =
            apply {
                body.addComponent(whatsappTemplateButtons)
            }

        /**
         * Alias for calling [addComponent] with
         * `Component.ofWhatsappTemplateCarousel(whatsappTemplateCarousel)`.
         */
        fun addComponent(whatsappTemplateCarousel: Component.WhatsappTemplateCarouselComponent) =
            apply {
                body.addComponent(whatsappTemplateCarousel)
            }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [WhatsappMessageTemplateUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): WhatsappMessageTemplateUpdateParams =
            WhatsappMessageTemplateUpdateParams(
                id,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val category: JsonField<Category>,
        private val components: JsonField<List<Component>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("category")
            @ExcludeMissing
            category: JsonField<Category> = JsonMissing.of(),
            @JsonProperty("components")
            @ExcludeMissing
            components: JsonField<List<Component>> = JsonMissing.of(),
        ) : this(category, components, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun category(): Optional<Category> = category.getOptional("category")

        /**
         * Updated template components. Same structure as the create request.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun components(): Optional<List<Component>> = components.getOptional("components")

        /**
         * Returns the raw JSON value of [category].
         *
         * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<Category> = category

        /**
         * Returns the raw JSON value of [components].
         *
         * Unlike [components], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("components")
        @ExcludeMissing
        fun _components(): JsonField<List<Component>> = components

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var category: JsonField<Category> = JsonMissing.of()
            private var components: JsonField<MutableList<Component>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                category = body.category
                components = body.components.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun category(category: Category) = category(JsonField.of(category))

            /**
             * Sets [Builder.category] to an arbitrary JSON value.
             *
             * You should usually call [Builder.category] with a well-typed [Category] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun category(category: JsonField<Category>) = apply { this.category = category }

            /** Updated template components. Same structure as the create request. */
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

            /**
             * Alias for calling [addComponent] with
             * `Component.ofWhatsappTemplateHeader(whatsappTemplateHeader)`.
             */
            fun addComponent(whatsappTemplateHeader: Component.WhatsappTemplateHeaderComponent) =
                addComponent(Component.ofWhatsappTemplateHeader(whatsappTemplateHeader))

            /**
             * Alias for calling [addComponent] with
             * `Component.ofWhatsappTemplateBody(whatsappTemplateBody)`.
             */
            fun addComponent(whatsappTemplateBody: Component.WhatsappTemplateBodyComponent) =
                addComponent(Component.ofWhatsappTemplateBody(whatsappTemplateBody))

            /**
             * Alias for calling [addComponent] with
             * `Component.ofWhatsappTemplateFooter(whatsappTemplateFooter)`.
             */
            fun addComponent(whatsappTemplateFooter: Component.WhatsappTemplateFooterComponent) =
                addComponent(Component.ofWhatsappTemplateFooter(whatsappTemplateFooter))

            /**
             * Alias for calling [addComponent] with
             * `Component.ofWhatsappTemplateButtons(whatsappTemplateButtons)`.
             */
            fun addComponent(whatsappTemplateButtons: Component.WhatsappTemplateButtonsComponent) =
                addComponent(Component.ofWhatsappTemplateButtons(whatsappTemplateButtons))

            /**
             * Alias for calling [addComponent] with
             * `Component.ofWhatsappTemplateCarousel(whatsappTemplateCarousel)`.
             */
            fun addComponent(
                whatsappTemplateCarousel: Component.WhatsappTemplateCarouselComponent
            ) = addComponent(Component.ofWhatsappTemplateCarousel(whatsappTemplateCarousel))

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    category,
                    (components ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            category().ifPresent { it.validate() }
            components().ifPresent { it.forEach { it.validate() } }
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
            (category.asKnown().getOrNull()?.validity() ?: 0) +
                (components.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                category == other.category &&
                components == other.components &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(category, components, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{category=$category, components=$components, additionalProperties=$additionalProperties}"
    }

    class Category @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val MARKETING = of("MARKETING")

            @JvmField val UTILITY = of("UTILITY")

            @JvmField val AUTHENTICATION = of("AUTHENTICATION")

            @JvmStatic fun of(value: String) = Category(JsonField.of(value))
        }

        /** An enum containing [Category]'s known values. */
        enum class Known {
            MARKETING,
            UTILITY,
            AUTHENTICATION,
        }

        /**
         * An enum containing [Category]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Category] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            MARKETING,
            UTILITY,
            AUTHENTICATION,
            /** An enum member indicating that [Category] was instantiated with an unknown value. */
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
                MARKETING -> Value.MARKETING
                UTILITY -> Value.UTILITY
                AUTHENTICATION -> Value.AUTHENTICATION
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
                MARKETING -> Known.MARKETING
                UTILITY -> Known.UTILITY
                AUTHENTICATION -> Known.AUTHENTICATION
                else -> throw TelnyxInvalidDataException("Unknown Category: $value")
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

        fun validate(): Category = apply {
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

            return other is Category && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** A template component. Additional Meta component types not listed here are also accepted. */
    @JsonDeserialize(using = Component.Deserializer::class)
    @JsonSerialize(using = Component.Serializer::class)
    class Component
    private constructor(
        private val whatsappTemplateHeader: WhatsappTemplateHeaderComponent? = null,
        private val whatsappTemplateBody: WhatsappTemplateBodyComponent? = null,
        private val whatsappTemplateFooter: WhatsappTemplateFooterComponent? = null,
        private val whatsappTemplateButtons: WhatsappTemplateButtonsComponent? = null,
        private val whatsappTemplateCarousel: WhatsappTemplateCarouselComponent? = null,
        private val _json: JsonValue? = null,
    ) {

        /** Optional header displayed at the top of the message. */
        fun whatsappTemplateHeader(): Optional<WhatsappTemplateHeaderComponent> =
            Optional.ofNullable(whatsappTemplateHeader)

        /**
         * The main text content of the message. Supports multiple variable parameters ({{1}},
         * {{2}}, etc.). Variables cannot be at the start or end. Maximum 1024 characters.
         */
        fun whatsappTemplateBody(): Optional<WhatsappTemplateBodyComponent> =
            Optional.ofNullable(whatsappTemplateBody)

        /** Optional footer displayed at the bottom of the message. Does not support variables. */
        fun whatsappTemplateFooter(): Optional<WhatsappTemplateFooterComponent> =
            Optional.ofNullable(whatsappTemplateFooter)

        /** Optional interactive buttons. Maximum 3 buttons per template. */
        fun whatsappTemplateButtons(): Optional<WhatsappTemplateButtonsComponent> =
            Optional.ofNullable(whatsappTemplateButtons)

        /**
         * Carousel component for multi-card templates. Each card can contain its own header, body,
         * and buttons.
         */
        fun whatsappTemplateCarousel(): Optional<WhatsappTemplateCarouselComponent> =
            Optional.ofNullable(whatsappTemplateCarousel)

        fun isWhatsappTemplateHeader(): Boolean = whatsappTemplateHeader != null

        fun isWhatsappTemplateBody(): Boolean = whatsappTemplateBody != null

        fun isWhatsappTemplateFooter(): Boolean = whatsappTemplateFooter != null

        fun isWhatsappTemplateButtons(): Boolean = whatsappTemplateButtons != null

        fun isWhatsappTemplateCarousel(): Boolean = whatsappTemplateCarousel != null

        /** Optional header displayed at the top of the message. */
        fun asWhatsappTemplateHeader(): WhatsappTemplateHeaderComponent =
            whatsappTemplateHeader.getOrThrow("whatsappTemplateHeader")

        /**
         * The main text content of the message. Supports multiple variable parameters ({{1}},
         * {{2}}, etc.). Variables cannot be at the start or end. Maximum 1024 characters.
         */
        fun asWhatsappTemplateBody(): WhatsappTemplateBodyComponent =
            whatsappTemplateBody.getOrThrow("whatsappTemplateBody")

        /** Optional footer displayed at the bottom of the message. Does not support variables. */
        fun asWhatsappTemplateFooter(): WhatsappTemplateFooterComponent =
            whatsappTemplateFooter.getOrThrow("whatsappTemplateFooter")

        /** Optional interactive buttons. Maximum 3 buttons per template. */
        fun asWhatsappTemplateButtons(): WhatsappTemplateButtonsComponent =
            whatsappTemplateButtons.getOrThrow("whatsappTemplateButtons")

        /**
         * Carousel component for multi-card templates. Each card can contain its own header, body,
         * and buttons.
         */
        fun asWhatsappTemplateCarousel(): WhatsappTemplateCarouselComponent =
            whatsappTemplateCarousel.getOrThrow("whatsappTemplateCarousel")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                whatsappTemplateHeader != null ->
                    visitor.visitWhatsappTemplateHeader(whatsappTemplateHeader)
                whatsappTemplateBody != null ->
                    visitor.visitWhatsappTemplateBody(whatsappTemplateBody)
                whatsappTemplateFooter != null ->
                    visitor.visitWhatsappTemplateFooter(whatsappTemplateFooter)
                whatsappTemplateButtons != null ->
                    visitor.visitWhatsappTemplateButtons(whatsappTemplateButtons)
                whatsappTemplateCarousel != null ->
                    visitor.visitWhatsappTemplateCarousel(whatsappTemplateCarousel)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Component = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitWhatsappTemplateHeader(
                        whatsappTemplateHeader: WhatsappTemplateHeaderComponent
                    ) {
                        whatsappTemplateHeader.validate()
                    }

                    override fun visitWhatsappTemplateBody(
                        whatsappTemplateBody: WhatsappTemplateBodyComponent
                    ) {
                        whatsappTemplateBody.validate()
                    }

                    override fun visitWhatsappTemplateFooter(
                        whatsappTemplateFooter: WhatsappTemplateFooterComponent
                    ) {
                        whatsappTemplateFooter.validate()
                    }

                    override fun visitWhatsappTemplateButtons(
                        whatsappTemplateButtons: WhatsappTemplateButtonsComponent
                    ) {
                        whatsappTemplateButtons.validate()
                    }

                    override fun visitWhatsappTemplateCarousel(
                        whatsappTemplateCarousel: WhatsappTemplateCarouselComponent
                    ) {
                        whatsappTemplateCarousel.validate()
                    }
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitWhatsappTemplateHeader(
                        whatsappTemplateHeader: WhatsappTemplateHeaderComponent
                    ) = whatsappTemplateHeader.validity()

                    override fun visitWhatsappTemplateBody(
                        whatsappTemplateBody: WhatsappTemplateBodyComponent
                    ) = whatsappTemplateBody.validity()

                    override fun visitWhatsappTemplateFooter(
                        whatsappTemplateFooter: WhatsappTemplateFooterComponent
                    ) = whatsappTemplateFooter.validity()

                    override fun visitWhatsappTemplateButtons(
                        whatsappTemplateButtons: WhatsappTemplateButtonsComponent
                    ) = whatsappTemplateButtons.validity()

                    override fun visitWhatsappTemplateCarousel(
                        whatsappTemplateCarousel: WhatsappTemplateCarouselComponent
                    ) = whatsappTemplateCarousel.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Component &&
                whatsappTemplateHeader == other.whatsappTemplateHeader &&
                whatsappTemplateBody == other.whatsappTemplateBody &&
                whatsappTemplateFooter == other.whatsappTemplateFooter &&
                whatsappTemplateButtons == other.whatsappTemplateButtons &&
                whatsappTemplateCarousel == other.whatsappTemplateCarousel
        }

        override fun hashCode(): Int =
            Objects.hash(
                whatsappTemplateHeader,
                whatsappTemplateBody,
                whatsappTemplateFooter,
                whatsappTemplateButtons,
                whatsappTemplateCarousel,
            )

        override fun toString(): String =
            when {
                whatsappTemplateHeader != null ->
                    "Component{whatsappTemplateHeader=$whatsappTemplateHeader}"
                whatsappTemplateBody != null ->
                    "Component{whatsappTemplateBody=$whatsappTemplateBody}"
                whatsappTemplateFooter != null ->
                    "Component{whatsappTemplateFooter=$whatsappTemplateFooter}"
                whatsappTemplateButtons != null ->
                    "Component{whatsappTemplateButtons=$whatsappTemplateButtons}"
                whatsappTemplateCarousel != null ->
                    "Component{whatsappTemplateCarousel=$whatsappTemplateCarousel}"
                _json != null -> "Component{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Component")
            }

        companion object {

            /** Optional header displayed at the top of the message. */
            @JvmStatic
            fun ofWhatsappTemplateHeader(whatsappTemplateHeader: WhatsappTemplateHeaderComponent) =
                Component(whatsappTemplateHeader = whatsappTemplateHeader)

            /**
             * The main text content of the message. Supports multiple variable parameters ({{1}},
             * {{2}}, etc.). Variables cannot be at the start or end. Maximum 1024 characters.
             */
            @JvmStatic
            fun ofWhatsappTemplateBody(whatsappTemplateBody: WhatsappTemplateBodyComponent) =
                Component(whatsappTemplateBody = whatsappTemplateBody)

            /**
             * Optional footer displayed at the bottom of the message. Does not support variables.
             */
            @JvmStatic
            fun ofWhatsappTemplateFooter(whatsappTemplateFooter: WhatsappTemplateFooterComponent) =
                Component(whatsappTemplateFooter = whatsappTemplateFooter)

            /** Optional interactive buttons. Maximum 3 buttons per template. */
            @JvmStatic
            fun ofWhatsappTemplateButtons(
                whatsappTemplateButtons: WhatsappTemplateButtonsComponent
            ) = Component(whatsappTemplateButtons = whatsappTemplateButtons)

            /**
             * Carousel component for multi-card templates. Each card can contain its own header,
             * body, and buttons.
             */
            @JvmStatic
            fun ofWhatsappTemplateCarousel(
                whatsappTemplateCarousel: WhatsappTemplateCarouselComponent
            ) = Component(whatsappTemplateCarousel = whatsappTemplateCarousel)
        }

        /**
         * An interface that defines how to map each variant of [Component] to a value of type [T].
         */
        interface Visitor<out T> {

            /** Optional header displayed at the top of the message. */
            fun visitWhatsappTemplateHeader(
                whatsappTemplateHeader: WhatsappTemplateHeaderComponent
            ): T

            /**
             * The main text content of the message. Supports multiple variable parameters ({{1}},
             * {{2}}, etc.). Variables cannot be at the start or end. Maximum 1024 characters.
             */
            fun visitWhatsappTemplateBody(whatsappTemplateBody: WhatsappTemplateBodyComponent): T

            /**
             * Optional footer displayed at the bottom of the message. Does not support variables.
             */
            fun visitWhatsappTemplateFooter(
                whatsappTemplateFooter: WhatsappTemplateFooterComponent
            ): T

            /** Optional interactive buttons. Maximum 3 buttons per template. */
            fun visitWhatsappTemplateButtons(
                whatsappTemplateButtons: WhatsappTemplateButtonsComponent
            ): T

            /**
             * Carousel component for multi-card templates. Each card can contain its own header,
             * body, and buttons.
             */
            fun visitWhatsappTemplateCarousel(
                whatsappTemplateCarousel: WhatsappTemplateCarouselComponent
            ): T

            /**
             * Maps an unknown variant of [Component] to a value of type [T].
             *
             * An instance of [Component] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws TelnyxInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw TelnyxInvalidDataException("Unknown Component: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Component>(Component::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Component {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<WhatsappTemplateHeaderComponent>())
                                ?.let { Component(whatsappTemplateHeader = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<WhatsappTemplateBodyComponent>())
                                ?.let { Component(whatsappTemplateBody = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<WhatsappTemplateFooterComponent>())
                                ?.let { Component(whatsappTemplateFooter = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<WhatsappTemplateButtonsComponent>())
                                ?.let { Component(whatsappTemplateButtons = it, _json = json) },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<WhatsappTemplateCarouselComponent>(),
                                )
                                ?.let { Component(whatsappTemplateCarousel = it, _json = json) },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Component(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Component>(Component::class) {

            override fun serialize(
                value: Component,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.whatsappTemplateHeader != null ->
                        generator.writeObject(value.whatsappTemplateHeader)
                    value.whatsappTemplateBody != null ->
                        generator.writeObject(value.whatsappTemplateBody)
                    value.whatsappTemplateFooter != null ->
                        generator.writeObject(value.whatsappTemplateFooter)
                    value.whatsappTemplateButtons != null ->
                        generator.writeObject(value.whatsappTemplateButtons)
                    value.whatsappTemplateCarousel != null ->
                        generator.writeObject(value.whatsappTemplateCarousel)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Component")
                }
            }
        }

        /** Optional header displayed at the top of the message. */
        class WhatsappTemplateHeaderComponent
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val format: JsonField<Format>,
            private val type: JsonField<Type>,
            private val example: JsonField<Example>,
            private val text: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("format")
                @ExcludeMissing
                format: JsonField<Format> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                @JsonProperty("example")
                @ExcludeMissing
                example: JsonField<Example> = JsonMissing.of(),
                @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
            ) : this(format, type, example, text, mutableMapOf())

            /**
             * Header format type: TEXT (supports one variable), IMAGE, VIDEO, DOCUMENT, or
             * LOCATION.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun format(): Format = format.getRequired("format")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * Sample values for header variables.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun example(): Optional<Example> = example.getOptional("example")

            /**
             * Header text. Required when format is TEXT. Supports one variable ({{1}}). Variables
             * cannot be at the start or end.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun text(): Optional<String> = text.getOptional("text")

            /**
             * Returns the raw JSON value of [format].
             *
             * Unlike [format], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("format") @ExcludeMissing fun _format(): JsonField<Format> = format

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            /**
             * Returns the raw JSON value of [example].
             *
             * Unlike [example], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("example") @ExcludeMissing fun _example(): JsonField<Example> = example

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

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [WhatsappTemplateHeaderComponent].
                 *
                 * The following fields are required:
                 * ```java
                 * .format()
                 * .type()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [WhatsappTemplateHeaderComponent]. */
            class Builder internal constructor() {

                private var format: JsonField<Format>? = null
                private var type: JsonField<Type>? = null
                private var example: JsonField<Example> = JsonMissing.of()
                private var text: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    whatsappTemplateHeaderComponent: WhatsappTemplateHeaderComponent
                ) = apply {
                    format = whatsappTemplateHeaderComponent.format
                    type = whatsappTemplateHeaderComponent.type
                    example = whatsappTemplateHeaderComponent.example
                    text = whatsappTemplateHeaderComponent.text
                    additionalProperties =
                        whatsappTemplateHeaderComponent.additionalProperties.toMutableMap()
                }

                /**
                 * Header format type: TEXT (supports one variable), IMAGE, VIDEO, DOCUMENT, or
                 * LOCATION.
                 */
                fun format(format: Format) = format(JsonField.of(format))

                /**
                 * Sets [Builder.format] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.format] with a well-typed [Format] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun format(format: JsonField<Format>) = apply { this.format = format }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                /** Sample values for header variables. */
                fun example(example: Example) = example(JsonField.of(example))

                /**
                 * Sets [Builder.example] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.example] with a well-typed [Example] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun example(example: JsonField<Example>) = apply { this.example = example }

                /**
                 * Header text. Required when format is TEXT. Supports one variable ({{1}}).
                 * Variables cannot be at the start or end.
                 */
                fun text(text: String) = text(JsonField.of(text))

                /**
                 * Sets [Builder.text] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.text] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
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
                 * Returns an immutable instance of [WhatsappTemplateHeaderComponent].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .format()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): WhatsappTemplateHeaderComponent =
                    WhatsappTemplateHeaderComponent(
                        checkRequired("format", format),
                        checkRequired("type", type),
                        example,
                        text,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): WhatsappTemplateHeaderComponent = apply {
                if (validated) {
                    return@apply
                }

                format().validate()
                type().validate()
                example().ifPresent { it.validate() }
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
                (format.asKnown().getOrNull()?.validity() ?: 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0) +
                    (example.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (text.asKnown().isPresent) 1 else 0)

            /**
             * Header format type: TEXT (supports one variable), IMAGE, VIDEO, DOCUMENT, or
             * LOCATION.
             */
            class Format @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val TEXT = of("TEXT")

                    @JvmField val IMAGE = of("IMAGE")

                    @JvmField val VIDEO = of("VIDEO")

                    @JvmField val DOCUMENT = of("DOCUMENT")

                    @JvmField val LOCATION = of("LOCATION")

                    @JvmStatic fun of(value: String) = Format(JsonField.of(value))
                }

                /** An enum containing [Format]'s known values. */
                enum class Known {
                    TEXT,
                    IMAGE,
                    VIDEO,
                    DOCUMENT,
                    LOCATION,
                }

                /**
                 * An enum containing [Format]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Format] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    TEXT,
                    IMAGE,
                    VIDEO,
                    DOCUMENT,
                    LOCATION,
                    /**
                     * An enum member indicating that [Format] was instantiated with an unknown
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
                        TEXT -> Value.TEXT
                        IMAGE -> Value.IMAGE
                        VIDEO -> Value.VIDEO
                        DOCUMENT -> Value.DOCUMENT
                        LOCATION -> Value.LOCATION
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
                        TEXT -> Known.TEXT
                        IMAGE -> Known.IMAGE
                        VIDEO -> Known.VIDEO
                        DOCUMENT -> Known.DOCUMENT
                        LOCATION -> Known.LOCATION
                        else -> throw TelnyxInvalidDataException("Unknown Format: $value")
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

                fun validate(): Format = apply {
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

                    return other is Format && value == other.value
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

                    @JvmField val HEADER = of("HEADER")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    HEADER
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

            /** Sample values for header variables. */
            class Example
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val headerHandle: JsonField<List<String>>,
                private val headerText: JsonField<List<String>>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("header_handle")
                    @ExcludeMissing
                    headerHandle: JsonField<List<String>> = JsonMissing.of(),
                    @JsonProperty("header_text")
                    @ExcludeMissing
                    headerText: JsonField<List<String>> = JsonMissing.of(),
                ) : this(headerHandle, headerText, mutableMapOf())

                /**
                 * Media handle for IMAGE, VIDEO, or DOCUMENT headers.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun headerHandle(): Optional<List<String>> =
                    headerHandle.getOptional("header_handle")

                /**
                 * Sample values for text header variables.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun headerText(): Optional<List<String>> = headerText.getOptional("header_text")

                /**
                 * Returns the raw JSON value of [headerHandle].
                 *
                 * Unlike [headerHandle], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("header_handle")
                @ExcludeMissing
                fun _headerHandle(): JsonField<List<String>> = headerHandle

                /**
                 * Returns the raw JSON value of [headerText].
                 *
                 * Unlike [headerText], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("header_text")
                @ExcludeMissing
                fun _headerText(): JsonField<List<String>> = headerText

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

                    /** Returns a mutable builder for constructing an instance of [Example]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Example]. */
                class Builder internal constructor() {

                    private var headerHandle: JsonField<MutableList<String>>? = null
                    private var headerText: JsonField<MutableList<String>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(example: Example) = apply {
                        headerHandle = example.headerHandle.map { it.toMutableList() }
                        headerText = example.headerText.map { it.toMutableList() }
                        additionalProperties = example.additionalProperties.toMutableMap()
                    }

                    /** Media handle for IMAGE, VIDEO, or DOCUMENT headers. */
                    fun headerHandle(headerHandle: List<String>) =
                        headerHandle(JsonField.of(headerHandle))

                    /**
                     * Sets [Builder.headerHandle] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.headerHandle] with a well-typed
                     * `List<String>` value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun headerHandle(headerHandle: JsonField<List<String>>) = apply {
                        this.headerHandle = headerHandle.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [Builder.headerHandle].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addHeaderHandle(headerHandle: String) = apply {
                        this.headerHandle =
                            (this.headerHandle ?: JsonField.of(mutableListOf())).also {
                                checkKnown("headerHandle", it).add(headerHandle)
                            }
                    }

                    /** Sample values for text header variables. */
                    fun headerText(headerText: List<String>) = headerText(JsonField.of(headerText))

                    /**
                     * Sets [Builder.headerText] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.headerText] with a well-typed `List<String>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun headerText(headerText: JsonField<List<String>>) = apply {
                        this.headerText = headerText.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [Builder.headerText].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addHeaderText(headerText: String) = apply {
                        this.headerText =
                            (this.headerText ?: JsonField.of(mutableListOf())).also {
                                checkKnown("headerText", it).add(headerText)
                            }
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
                     * Returns an immutable instance of [Example].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Example =
                        Example(
                            (headerHandle ?: JsonMissing.of()).map { it.toImmutable() },
                            (headerText ?: JsonMissing.of()).map { it.toImmutable() },
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Example = apply {
                    if (validated) {
                        return@apply
                    }

                    headerHandle()
                    headerText()
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
                    (headerHandle.asKnown().getOrNull()?.size ?: 0) +
                        (headerText.asKnown().getOrNull()?.size ?: 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Example &&
                        headerHandle == other.headerHandle &&
                        headerText == other.headerText &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(headerHandle, headerText, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Example{headerHandle=$headerHandle, headerText=$headerText, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is WhatsappTemplateHeaderComponent &&
                    format == other.format &&
                    type == other.type &&
                    example == other.example &&
                    text == other.text &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(format, type, example, text, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "WhatsappTemplateHeaderComponent{format=$format, type=$type, example=$example, text=$text, additionalProperties=$additionalProperties}"
        }

        /**
         * The main text content of the message. Supports multiple variable parameters ({{1}},
         * {{2}}, etc.). Variables cannot be at the start or end. Maximum 1024 characters.
         */
        class WhatsappTemplateBodyComponent
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val type: JsonField<Type>,
            private val example: JsonField<Example>,
            private val text: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                @JsonProperty("example")
                @ExcludeMissing
                example: JsonField<Example> = JsonMissing.of(),
                @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
            ) : this(type, example, text, mutableMapOf())

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * Sample values for body variables. Required when body text contains parameters.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun example(): Optional<Example> = example.getOptional("example")

            /**
             * Body text content. Use {{1}}, {{2}}, etc. for variable placeholders. Required for
             * MARKETING and UTILITY templates. Optional for AUTHENTICATION templates where Meta
             * provides the built-in OTP body.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun text(): Optional<String> = text.getOptional("text")

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            /**
             * Returns the raw JSON value of [example].
             *
             * Unlike [example], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("example") @ExcludeMissing fun _example(): JsonField<Example> = example

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

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [WhatsappTemplateBodyComponent].
                 *
                 * The following fields are required:
                 * ```java
                 * .type()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [WhatsappTemplateBodyComponent]. */
            class Builder internal constructor() {

                private var type: JsonField<Type>? = null
                private var example: JsonField<Example> = JsonMissing.of()
                private var text: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(whatsappTemplateBodyComponent: WhatsappTemplateBodyComponent) =
                    apply {
                        type = whatsappTemplateBodyComponent.type
                        example = whatsappTemplateBodyComponent.example
                        text = whatsappTemplateBodyComponent.text
                        additionalProperties =
                            whatsappTemplateBodyComponent.additionalProperties.toMutableMap()
                    }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                /**
                 * Sample values for body variables. Required when body text contains parameters.
                 */
                fun example(example: Example) = example(JsonField.of(example))

                /**
                 * Sets [Builder.example] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.example] with a well-typed [Example] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun example(example: JsonField<Example>) = apply { this.example = example }

                /**
                 * Body text content. Use {{1}}, {{2}}, etc. for variable placeholders. Required for
                 * MARKETING and UTILITY templates. Optional for AUTHENTICATION templates where Meta
                 * provides the built-in OTP body.
                 */
                fun text(text: String) = text(JsonField.of(text))

                /**
                 * Sets [Builder.text] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.text] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
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
                 * Returns an immutable instance of [WhatsappTemplateBodyComponent].
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
                fun build(): WhatsappTemplateBodyComponent =
                    WhatsappTemplateBodyComponent(
                        checkRequired("type", type),
                        example,
                        text,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): WhatsappTemplateBodyComponent = apply {
                if (validated) {
                    return@apply
                }

                type().validate()
                example().ifPresent { it.validate() }
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
                (type.asKnown().getOrNull()?.validity() ?: 0) +
                    (example.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (text.asKnown().isPresent) 1 else 0)

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

                    @JvmField val BODY = of("BODY")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    BODY
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
                    BODY,
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
                        BODY -> Value.BODY
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
                        BODY -> Known.BODY
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

            /** Sample values for body variables. Required when body text contains parameters. */
            class Example
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val bodyText: JsonField<List<List<String>>>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("body_text")
                    @ExcludeMissing
                    bodyText: JsonField<List<List<String>>> = JsonMissing.of()
                ) : this(bodyText, mutableMapOf())

                /**
                 * Array containing one array of sample values, one per variable in order.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun bodyText(): Optional<List<List<String>>> = bodyText.getOptional("body_text")

                /**
                 * Returns the raw JSON value of [bodyText].
                 *
                 * Unlike [bodyText], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("body_text")
                @ExcludeMissing
                fun _bodyText(): JsonField<List<List<String>>> = bodyText

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

                    /** Returns a mutable builder for constructing an instance of [Example]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Example]. */
                class Builder internal constructor() {

                    private var bodyText: JsonField<MutableList<List<String>>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(example: Example) = apply {
                        bodyText = example.bodyText.map { it.toMutableList() }
                        additionalProperties = example.additionalProperties.toMutableMap()
                    }

                    /** Array containing one array of sample values, one per variable in order. */
                    fun bodyText(bodyText: List<List<String>>) = bodyText(JsonField.of(bodyText))

                    /**
                     * Sets [Builder.bodyText] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.bodyText] with a well-typed
                     * `List<List<String>>` value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun bodyText(bodyText: JsonField<List<List<String>>>) = apply {
                        this.bodyText = bodyText.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [List<String>] to [Builder.bodyText].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addBodyText(bodyText: List<String>) = apply {
                        this.bodyText =
                            (this.bodyText ?: JsonField.of(mutableListOf())).also {
                                checkKnown("bodyText", it).add(bodyText)
                            }
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
                     * Returns an immutable instance of [Example].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Example =
                        Example(
                            (bodyText ?: JsonMissing.of()).map { it.toImmutable() },
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Example = apply {
                    if (validated) {
                        return@apply
                    }

                    bodyText()
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
                    (bodyText.asKnown().getOrNull()?.sumOf { it.size.toInt() } ?: 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Example &&
                        bodyText == other.bodyText &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(bodyText, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Example{bodyText=$bodyText, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is WhatsappTemplateBodyComponent &&
                    type == other.type &&
                    example == other.example &&
                    text == other.text &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(type, example, text, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "WhatsappTemplateBodyComponent{type=$type, example=$example, text=$text, additionalProperties=$additionalProperties}"
        }

        /** Optional footer displayed at the bottom of the message. Does not support variables. */
        class WhatsappTemplateFooterComponent
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val type: JsonField<Type>,
            private val codeExpirationMinutes: JsonField<Long>,
            private val text: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                @JsonProperty("code_expiration_minutes")
                @ExcludeMissing
                codeExpirationMinutes: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
            ) : this(type, codeExpirationMinutes, text, mutableMapOf())

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * OTP code expiration time in minutes. Used in AUTHENTICATION template footers instead
             * of free-form text.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun codeExpirationMinutes(): Optional<Long> =
                codeExpirationMinutes.getOptional("code_expiration_minutes")

            /**
             * Footer text. Maximum 60 characters. For non-authentication templates.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun text(): Optional<String> = text.getOptional("text")

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            /**
             * Returns the raw JSON value of [codeExpirationMinutes].
             *
             * Unlike [codeExpirationMinutes], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("code_expiration_minutes")
            @ExcludeMissing
            fun _codeExpirationMinutes(): JsonField<Long> = codeExpirationMinutes

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

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [WhatsappTemplateFooterComponent].
                 *
                 * The following fields are required:
                 * ```java
                 * .type()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [WhatsappTemplateFooterComponent]. */
            class Builder internal constructor() {

                private var type: JsonField<Type>? = null
                private var codeExpirationMinutes: JsonField<Long> = JsonMissing.of()
                private var text: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    whatsappTemplateFooterComponent: WhatsappTemplateFooterComponent
                ) = apply {
                    type = whatsappTemplateFooterComponent.type
                    codeExpirationMinutes = whatsappTemplateFooterComponent.codeExpirationMinutes
                    text = whatsappTemplateFooterComponent.text
                    additionalProperties =
                        whatsappTemplateFooterComponent.additionalProperties.toMutableMap()
                }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                /**
                 * OTP code expiration time in minutes. Used in AUTHENTICATION template footers
                 * instead of free-form text.
                 */
                fun codeExpirationMinutes(codeExpirationMinutes: Long) =
                    codeExpirationMinutes(JsonField.of(codeExpirationMinutes))

                /**
                 * Sets [Builder.codeExpirationMinutes] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.codeExpirationMinutes] with a well-typed [Long]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun codeExpirationMinutes(codeExpirationMinutes: JsonField<Long>) = apply {
                    this.codeExpirationMinutes = codeExpirationMinutes
                }

                /** Footer text. Maximum 60 characters. For non-authentication templates. */
                fun text(text: String) = text(JsonField.of(text))

                /**
                 * Sets [Builder.text] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.text] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
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
                 * Returns an immutable instance of [WhatsappTemplateFooterComponent].
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
                fun build(): WhatsappTemplateFooterComponent =
                    WhatsappTemplateFooterComponent(
                        checkRequired("type", type),
                        codeExpirationMinutes,
                        text,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): WhatsappTemplateFooterComponent = apply {
                if (validated) {
                    return@apply
                }

                type().validate()
                codeExpirationMinutes()
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
                (type.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (codeExpirationMinutes.asKnown().isPresent) 1 else 0) +
                    (if (text.asKnown().isPresent) 1 else 0)

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

                    @JvmField val FOOTER = of("FOOTER")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    FOOTER
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
                    FOOTER,
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
                        FOOTER -> Value.FOOTER
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
                        FOOTER -> Known.FOOTER
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

                return other is WhatsappTemplateFooterComponent &&
                    type == other.type &&
                    codeExpirationMinutes == other.codeExpirationMinutes &&
                    text == other.text &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(type, codeExpirationMinutes, text, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "WhatsappTemplateFooterComponent{type=$type, codeExpirationMinutes=$codeExpirationMinutes, text=$text, additionalProperties=$additionalProperties}"
        }

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
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun buttons(): List<Button> = buttons.getRequired("buttons")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * Returns the raw JSON value of [buttons].
             *
             * Unlike [buttons], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("buttons")
            @ExcludeMissing
            fun _buttons(): JsonField<List<Button>> = buttons

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
                internal fun from(
                    whatsappTemplateButtonsComponent: WhatsappTemplateButtonsComponent
                ) = apply {
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
                 * You should usually call [Builder.buttons] with a well-typed `List<Button>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
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
                    @JsonProperty("flow_id")
                    @ExcludeMissing
                    flowId: JsonField<String> = JsonMissing.of(),
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
                    @JsonProperty("text")
                    @ExcludeMissing
                    text: JsonField<String> = JsonMissing.of(),
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
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun type(): Type = type.getRequired("type")

                /**
                 * Custom autofill button text for ONE_TAP OTP buttons.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun autofillText(): Optional<String> = autofillText.getOptional("autofill_text")

                /**
                 * Sample values for URL variable.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun example(): Optional<List<String>> = example.getOptional("example")

                /**
                 * Flow action type for FLOW-type buttons.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun flowAction(): Optional<FlowAction> = flowAction.getOptional("flow_action")

                /**
                 * Flow ID for FLOW-type buttons.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun flowId(): Optional<String> = flowId.getOptional("flow_id")

                /**
                 * Target screen name for FLOW buttons with navigate action.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun navigateScreen(): Optional<String> =
                    navigateScreen.getOptional("navigate_screen")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun otpType(): Optional<OtpType> = otpType.getOptional("otp_type")

                /**
                 * Android package name. Required for ONE_TAP OTP buttons.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun packageName(): Optional<String> = packageName.getOptional("package_name")

                /**
                 * Phone number in E.164 format.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phone_number")

                /**
                 * Android app signing key hash. Required for ONE_TAP OTP buttons.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun signatureHash(): Optional<String> = signatureHash.getOptional("signature_hash")

                /**
                 * Button label text. Maximum 25 characters. Required for URL, PHONE_NUMBER, and
                 * QUICK_REPLY buttons. Not required for OTP buttons (Meta supplies the label).
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun text(): Optional<String> = text.getOptional("text")

                /**
                 * URL for URL-type buttons. Supports one variable ({{1}}).
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun url(): Optional<String> = url.getOptional("url")

                /**
                 * Whether zero-tap terms have been accepted.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun zeroTapTermsAccepted(): Optional<Boolean> =
                    zeroTapTermsAccepted.getOptional("zero_tap_terms_accepted")

                /**
                 * Returns the raw JSON value of [type].
                 *
                 * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                /**
                 * Returns the raw JSON value of [autofillText].
                 *
                 * Unlike [autofillText], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("autofill_text")
                @ExcludeMissing
                fun _autofillText(): JsonField<String> = autofillText

                /**
                 * Returns the raw JSON value of [example].
                 *
                 * Unlike [example], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("example")
                @ExcludeMissing
                fun _example(): JsonField<List<String>> = example

                /**
                 * Returns the raw JSON value of [flowAction].
                 *
                 * Unlike [flowAction], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("flow_action")
                @ExcludeMissing
                fun _flowAction(): JsonField<FlowAction> = flowAction

                /**
                 * Returns the raw JSON value of [flowId].
                 *
                 * Unlike [flowId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("flow_id") @ExcludeMissing fun _flowId(): JsonField<String> = flowId

                /**
                 * Returns the raw JSON value of [navigateScreen].
                 *
                 * Unlike [navigateScreen], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("navigate_screen")
                @ExcludeMissing
                fun _navigateScreen(): JsonField<String> = navigateScreen

                /**
                 * Returns the raw JSON value of [otpType].
                 *
                 * Unlike [otpType], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("otp_type")
                @ExcludeMissing
                fun _otpType(): JsonField<OtpType> = otpType

                /**
                 * Returns the raw JSON value of [packageName].
                 *
                 * Unlike [packageName], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("package_name")
                @ExcludeMissing
                fun _packageName(): JsonField<String> = packageName

                /**
                 * Returns the raw JSON value of [phoneNumber].
                 *
                 * Unlike [phoneNumber], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("phone_number")
                @ExcludeMissing
                fun _phoneNumber(): JsonField<String> = phoneNumber

                /**
                 * Returns the raw JSON value of [signatureHash].
                 *
                 * Unlike [signatureHash], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("signature_hash")
                @ExcludeMissing
                fun _signatureHash(): JsonField<String> = signatureHash

                /**
                 * Returns the raw JSON value of [text].
                 *
                 * Unlike [text], this method doesn't throw if the JSON field has an unexpected
                 * type.
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
                     * You should usually call [Builder.type] with a well-typed [Type] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun type(type: JsonField<Type>) = apply { this.type = type }

                    /** Custom autofill button text for ONE_TAP OTP buttons. */
                    fun autofillText(autofillText: String) =
                        autofillText(JsonField.of(autofillText))

                    /**
                     * Sets [Builder.autofillText] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.autofillText] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun autofillText(autofillText: JsonField<String>) = apply {
                        this.autofillText = autofillText
                    }

                    /** Sample values for URL variable. */
                    fun example(example: List<String>) = example(JsonField.of(example))

                    /**
                     * Sets [Builder.example] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.example] with a well-typed `List<String>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
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
                     * You should usually call [Builder.flowAction] with a well-typed [FlowAction]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun flowAction(flowAction: JsonField<FlowAction>) = apply {
                        this.flowAction = flowAction
                    }

                    /** Flow ID for FLOW-type buttons. */
                    fun flowId(flowId: String) = flowId(JsonField.of(flowId))

                    /**
                     * Sets [Builder.flowId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.flowId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun flowId(flowId: JsonField<String>) = apply { this.flowId = flowId }

                    /** Target screen name for FLOW buttons with navigate action. */
                    fun navigateScreen(navigateScreen: String) =
                        navigateScreen(JsonField.of(navigateScreen))

                    /**
                     * Sets [Builder.navigateScreen] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.navigateScreen] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun navigateScreen(navigateScreen: JsonField<String>) = apply {
                        this.navigateScreen = navigateScreen
                    }

                    fun otpType(otpType: OtpType) = otpType(JsonField.of(otpType))

                    /**
                     * Sets [Builder.otpType] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.otpType] with a well-typed [OtpType] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun otpType(otpType: JsonField<OtpType>) = apply { this.otpType = otpType }

                    /** Android package name. Required for ONE_TAP OTP buttons. */
                    fun packageName(packageName: String) = packageName(JsonField.of(packageName))

                    /**
                     * Sets [Builder.packageName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.packageName] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun packageName(packageName: JsonField<String>) = apply {
                        this.packageName = packageName
                    }

                    /** Phone number in E.164 format. */
                    fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

                    /**
                     * Sets [Builder.phoneNumber] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.phoneNumber] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                        this.phoneNumber = phoneNumber
                    }

                    /** Android app signing key hash. Required for ONE_TAP OTP buttons. */
                    fun signatureHash(signatureHash: String) =
                        signatureHash(JsonField.of(signatureHash))

                    /**
                     * Sets [Builder.signatureHash] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.signatureHash] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
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
                     * You should usually call [Builder.text] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun text(text: JsonField<String>) = apply { this.text = text }

                    /** URL for URL-type buttons. Supports one variable ({{1}}). */
                    fun url(url: String) = url(JsonField.of(url))

                    /**
                     * Sets [Builder.url] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.url] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun url(url: JsonField<String>) = apply { this.url = url }

                    /** Whether zero-tap terms have been accepted. */
                    fun zeroTapTermsAccepted(zeroTapTermsAccepted: Boolean) =
                        zeroTapTermsAccepted(JsonField.of(zeroTapTermsAccepted))

                    /**
                     * Sets [Builder.zeroTapTermsAccepted] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.zeroTapTermsAccepted] with a well-typed
                     * [Boolean] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
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
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        URL,
                        PHONE_NUMBER,
                        QUICK_REPLY,
                        OTP,
                        COPY_CODE,
                        FLOW,
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
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws TelnyxInvalidDataException if this class instance's value is a not a
                     *   known member.
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

                /** Flow action type for FLOW-type buttons. */
                class FlowAction
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
                     * An enum containing [FlowAction]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [FlowAction] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        NAVIGATE,
                        DATA_EXCHANGE,
                        /**
                         * An enum member indicating that [FlowAction] was instantiated with an
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
                            NAVIGATE -> Value.NAVIGATE
                            DATA_EXCHANGE -> Value.DATA_EXCHANGE
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
                     * @throws TelnyxInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            TelnyxInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is FlowAction && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                class OtpType
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
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        COPY_CODE,
                        ONE_TAP,
                        /**
                         * An enum member indicating that [OtpType] was instantiated with an unknown
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
                            COPY_CODE -> Value.COPY_CODE
                            ONE_TAP -> Value.ONE_TAP
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
                     * @throws TelnyxInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            TelnyxInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    BUTTONS,
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
                        BUTTONS -> Value.BUTTONS
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
                        BUTTONS -> Known.BUTTONS
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

        /**
         * Carousel component for multi-card templates. Each card can contain its own header, body,
         * and buttons.
         */
        class WhatsappTemplateCarouselComponent
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val cards: JsonField<List<Card>>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("cards")
                @ExcludeMissing
                cards: JsonField<List<Card>> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(cards, type, mutableMapOf())

            /**
             * Array of card objects, each with its own components.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun cards(): List<Card> = cards.getRequired("cards")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * Returns the raw JSON value of [cards].
             *
             * Unlike [cards], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("cards") @ExcludeMissing fun _cards(): JsonField<List<Card>> = cards

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
                 * [WhatsappTemplateCarouselComponent].
                 *
                 * The following fields are required:
                 * ```java
                 * .cards()
                 * .type()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [WhatsappTemplateCarouselComponent]. */
            class Builder internal constructor() {

                private var cards: JsonField<MutableList<Card>>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    whatsappTemplateCarouselComponent: WhatsappTemplateCarouselComponent
                ) = apply {
                    cards = whatsappTemplateCarouselComponent.cards.map { it.toMutableList() }
                    type = whatsappTemplateCarouselComponent.type
                    additionalProperties =
                        whatsappTemplateCarouselComponent.additionalProperties.toMutableMap()
                }

                /** Array of card objects, each with its own components. */
                fun cards(cards: List<Card>) = cards(JsonField.of(cards))

                /**
                 * Sets [Builder.cards] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cards] with a well-typed `List<Card>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * Returns an immutable instance of [WhatsappTemplateCarouselComponent].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .cards()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): WhatsappTemplateCarouselComponent =
                    WhatsappTemplateCarouselComponent(
                        checkRequired("cards", cards).map { it.toImmutable() },
                        checkRequired("type", type),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): WhatsappTemplateCarouselComponent = apply {
                if (validated) {
                    return@apply
                }

                cards().forEach { it.validate() }
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (cards.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

            class Card
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val components: JsonField<List<InnerComponent>>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("components")
                    @ExcludeMissing
                    components: JsonField<List<InnerComponent>> = JsonMissing.of()
                ) : this(components, mutableMapOf())

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun components(): Optional<List<InnerComponent>> =
                    components.getOptional("components")

                /**
                 * Returns the raw JSON value of [components].
                 *
                 * Unlike [components], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("components")
                @ExcludeMissing
                fun _components(): JsonField<List<InnerComponent>> = components

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

                    private var components: JsonField<MutableList<InnerComponent>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(card: Card) = apply {
                        components = card.components.map { it.toMutableList() }
                        additionalProperties = card.additionalProperties.toMutableMap()
                    }

                    fun components(components: List<InnerComponent>) =
                        components(JsonField.of(components))

                    /**
                     * Sets [Builder.components] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.components] with a well-typed
                     * `List<InnerComponent>` value instead. This method is primarily for setting
                     * the field to an undocumented or not yet supported value.
                     */
                    fun components(components: JsonField<List<InnerComponent>>) = apply {
                        this.components = components.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [InnerComponent] to [components].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addComponent(component: InnerComponent) = apply {
                        components =
                            (components ?: JsonField.of(mutableListOf())).also {
                                checkKnown("components", it).add(component)
                            }
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
                     * Returns an immutable instance of [Card].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Card =
                        Card(
                            (components ?: JsonMissing.of()).map { it.toImmutable() },
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Card = apply {
                    if (validated) {
                        return@apply
                    }

                    components().ifPresent { it.forEach { it.validate() } }
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
                    (components.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

                class InnerComponent
                @JsonCreator
                private constructor(
                    @com.fasterxml.jackson.annotation.JsonValue
                    private val additionalProperties: Map<String, JsonValue>
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of
                         * [InnerComponent].
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [InnerComponent]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(innerComponent: InnerComponent) = apply {
                            additionalProperties =
                                innerComponent.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [InnerComponent].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): InnerComponent =
                            InnerComponent(additionalProperties.toImmutable())
                    }

                    private var validated: Boolean = false

                    fun validate(): InnerComponent = apply {
                        if (validated) {
                            return@apply
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
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int =
                        additionalProperties.count { (_, value) ->
                            !value.isNull() && !value.isMissing()
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is InnerComponent &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "InnerComponent{additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Card &&
                        components == other.components &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(components, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Card{components=$components, additionalProperties=$additionalProperties}"
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

                    @JvmField val CAROUSEL = of("CAROUSEL")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    CAROUSEL
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
                    CAROUSEL,
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
                        CAROUSEL -> Value.CAROUSEL
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
                        CAROUSEL -> Known.CAROUSEL
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

                return other is WhatsappTemplateCarouselComponent &&
                    cards == other.cards &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(cards, type, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "WhatsappTemplateCarouselComponent{cards=$cards, type=$type, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WhatsappMessageTemplateUpdateParams &&
            id == other.id &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(id, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "WhatsappMessageTemplateUpdateParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
