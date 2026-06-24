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
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import com.telnyx.sdk.models.whatsapp.templates.WhatsappTemplateBodyComponent
import com.telnyx.sdk.models.whatsapp.templates.WhatsappTemplateButtonsComponent
import com.telnyx.sdk.models.whatsapp.templates.WhatsappTemplateCarouselComponent
import com.telnyx.sdk.models.whatsapp.templates.WhatsappTemplateFooterComponent
import com.telnyx.sdk.models.whatsapp.templates.WhatsappTemplateHeaderComponent
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

        /** Alias for calling [addComponent] with `Component.ofHeader(header)`. */
        fun addComponent(header: WhatsappTemplateHeaderComponent) = apply {
            body.addComponent(header)
        }

        /**
         * Alias for calling [addComponent] with the following:
         * ```java
         * WhatsappTemplateHeaderComponent.builder()
         *     .type(WhatsappTemplateHeaderComponent.Type.HEADER)
         *     .format(format)
         *     .build()
         * ```
         */
        fun addHeaderComponent(format: WhatsappTemplateHeaderComponent.Format) = apply {
            body.addHeaderComponent(format)
        }

        /** Alias for calling [addComponent] with `Component.ofBody(body)`. */
        fun addComponent(body: WhatsappTemplateBodyComponent) = apply {
            this.body.addComponent(body)
        }

        /** Alias for calling [addComponent] with `Component.ofFooter(footer)`. */
        fun addComponent(footer: WhatsappTemplateFooterComponent) = apply {
            body.addComponent(footer)
        }

        /** Alias for calling [addComponent] with `Component.ofButtons(buttons)`. */
        fun addComponent(buttons: WhatsappTemplateButtonsComponent) = apply {
            body.addComponent(buttons)
        }

        /**
         * Alias for calling [addComponent] with the following:
         * ```java
         * WhatsappTemplateButtonsComponent.builder()
         *     .type(WhatsappTemplateButtonsComponent.Type.BUTTONS)
         *     .buttons(buttons)
         *     .build()
         * ```
         */
        fun addButtonsComponent(buttons: List<WhatsappTemplateButtonsComponent.Button>) = apply {
            body.addButtonsComponent(buttons)
        }

        /** Alias for calling [addComponent] with `Component.ofCarousel(carousel)`. */
        fun addComponent(carousel: WhatsappTemplateCarouselComponent) = apply {
            body.addComponent(carousel)
        }

        /**
         * Alias for calling [addComponent] with the following:
         * ```java
         * WhatsappTemplateCarouselComponent.builder()
         *     .type(WhatsappTemplateCarouselComponent.Type.CAROUSEL)
         *     .cards(cards)
         *     .build()
         * ```
         */
        fun addCarouselComponent(cards: List<WhatsappTemplateCarouselComponent.Card>) = apply {
            body.addCarouselComponent(cards)
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

            /** Alias for calling [addComponent] with `Component.ofHeader(header)`. */
            fun addComponent(header: WhatsappTemplateHeaderComponent) =
                addComponent(Component.ofHeader(header))

            /**
             * Alias for calling [addComponent] with the following:
             * ```java
             * WhatsappTemplateHeaderComponent.builder()
             *     .type(WhatsappTemplateHeaderComponent.Type.HEADER)
             *     .format(format)
             *     .build()
             * ```
             */
            fun addHeaderComponent(format: WhatsappTemplateHeaderComponent.Format) =
                addComponent(
                    WhatsappTemplateHeaderComponent.builder()
                        .type(WhatsappTemplateHeaderComponent.Type.HEADER)
                        .format(format)
                        .build()
                )

            /** Alias for calling [addComponent] with `Component.ofBody(body)`. */
            fun addComponent(body: WhatsappTemplateBodyComponent) =
                addComponent(Component.ofBody(body))

            /** Alias for calling [addComponent] with `Component.ofFooter(footer)`. */
            fun addComponent(footer: WhatsappTemplateFooterComponent) =
                addComponent(Component.ofFooter(footer))

            /** Alias for calling [addComponent] with `Component.ofButtons(buttons)`. */
            fun addComponent(buttons: WhatsappTemplateButtonsComponent) =
                addComponent(Component.ofButtons(buttons))

            /**
             * Alias for calling [addComponent] with the following:
             * ```java
             * WhatsappTemplateButtonsComponent.builder()
             *     .type(WhatsappTemplateButtonsComponent.Type.BUTTONS)
             *     .buttons(buttons)
             *     .build()
             * ```
             */
            fun addButtonsComponent(buttons: List<WhatsappTemplateButtonsComponent.Button>) =
                addComponent(
                    WhatsappTemplateButtonsComponent.builder()
                        .type(WhatsappTemplateButtonsComponent.Type.BUTTONS)
                        .buttons(buttons)
                        .build()
                )

            /** Alias for calling [addComponent] with `Component.ofCarousel(carousel)`. */
            fun addComponent(carousel: WhatsappTemplateCarouselComponent) =
                addComponent(Component.ofCarousel(carousel))

            /**
             * Alias for calling [addComponent] with the following:
             * ```java
             * WhatsappTemplateCarouselComponent.builder()
             *     .type(WhatsappTemplateCarouselComponent.Type.CAROUSEL)
             *     .cards(cards)
             *     .build()
             * ```
             */
            fun addCarouselComponent(cards: List<WhatsappTemplateCarouselComponent.Card>) =
                addComponent(
                    WhatsappTemplateCarouselComponent.builder()
                        .type(WhatsappTemplateCarouselComponent.Type.CAROUSEL)
                        .cards(cards)
                        .build()
                )

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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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
        private val header: WhatsappTemplateHeaderComponent? = null,
        private val body: WhatsappTemplateBodyComponent? = null,
        private val footer: WhatsappTemplateFooterComponent? = null,
        private val buttons: WhatsappTemplateButtonsComponent? = null,
        private val carousel: WhatsappTemplateCarouselComponent? = null,
        private val _json: JsonValue? = null,
    ) {

        /** Optional header displayed at the top of the message. */
        fun header(): Optional<WhatsappTemplateHeaderComponent> = Optional.ofNullable(header)

        /**
         * The main text content of the message. Supports multiple variable parameters ({{1}},
         * {{2}}, etc.). Variables cannot be at the start or end. Maximum 1024 characters.
         */
        fun body(): Optional<WhatsappTemplateBodyComponent> = Optional.ofNullable(body)

        /** Optional footer displayed at the bottom of the message. Does not support variables. */
        fun footer(): Optional<WhatsappTemplateFooterComponent> = Optional.ofNullable(footer)

        /** Optional interactive buttons. Maximum 3 buttons per template. */
        fun buttons(): Optional<WhatsappTemplateButtonsComponent> = Optional.ofNullable(buttons)

        /**
         * Carousel component for multi-card templates. Each card can contain its own header, body,
         * and buttons.
         */
        fun carousel(): Optional<WhatsappTemplateCarouselComponent> = Optional.ofNullable(carousel)

        fun isHeader(): Boolean = header != null

        fun isBody(): Boolean = body != null

        fun isFooter(): Boolean = footer != null

        fun isButtons(): Boolean = buttons != null

        fun isCarousel(): Boolean = carousel != null

        /** Optional header displayed at the top of the message. */
        fun asHeader(): WhatsappTemplateHeaderComponent = header.getOrThrow("header")

        /**
         * The main text content of the message. Supports multiple variable parameters ({{1}},
         * {{2}}, etc.). Variables cannot be at the start or end. Maximum 1024 characters.
         */
        fun asBody(): WhatsappTemplateBodyComponent = body.getOrThrow("body")

        /** Optional footer displayed at the bottom of the message. Does not support variables. */
        fun asFooter(): WhatsappTemplateFooterComponent = footer.getOrThrow("footer")

        /** Optional interactive buttons. Maximum 3 buttons per template. */
        fun asButtons(): WhatsappTemplateButtonsComponent = buttons.getOrThrow("buttons")

        /**
         * Carousel component for multi-card templates. Each card can contain its own header, body,
         * and buttons.
         */
        fun asCarousel(): WhatsappTemplateCarouselComponent = carousel.getOrThrow("carousel")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
         * ```java
         * import com.telnyx.sdk.core.JsonValue;
         * import java.util.Optional;
         *
         * Optional<String> result = component.accept(new Component.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitHeader(WhatsappTemplateHeaderComponent header) {
         *         return Optional.of(header.toString());
         *     }
         *
         *     // ...
         *
         *     @Override
         *     public Optional<String> unknown(JsonValue json) {
         *         // Or inspect the `json`.
         *         return Optional.empty();
         *     }
         * });
         * ```
         *
         * @throws TelnyxInvalidDataException if [Visitor.unknown] is not overridden in [visitor]
         *   and the current variant is unknown.
         */
        fun <T> accept(visitor: Visitor<T>): T =
            when {
                header != null -> visitor.visitHeader(header)
                body != null -> visitor.visitBody(body)
                footer != null -> visitor.visitFooter(footer)
                buttons != null -> visitor.visitButtons(buttons)
                carousel != null -> visitor.visitCarousel(carousel)
                else -> visitor.unknown(_json)
            }

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
        fun validate(): Component = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitHeader(header: WhatsappTemplateHeaderComponent) {
                        header.validate()
                    }

                    override fun visitBody(body: WhatsappTemplateBodyComponent) {
                        body.validate()
                    }

                    override fun visitFooter(footer: WhatsappTemplateFooterComponent) {
                        footer.validate()
                    }

                    override fun visitButtons(buttons: WhatsappTemplateButtonsComponent) {
                        buttons.validate()
                    }

                    override fun visitCarousel(carousel: WhatsappTemplateCarouselComponent) {
                        carousel.validate()
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
                    override fun visitHeader(header: WhatsappTemplateHeaderComponent) =
                        header.validity()

                    override fun visitBody(body: WhatsappTemplateBodyComponent) = body.validity()

                    override fun visitFooter(footer: WhatsappTemplateFooterComponent) =
                        footer.validity()

                    override fun visitButtons(buttons: WhatsappTemplateButtonsComponent) =
                        buttons.validity()

                    override fun visitCarousel(carousel: WhatsappTemplateCarouselComponent) =
                        carousel.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Component &&
                header == other.header &&
                body == other.body &&
                footer == other.footer &&
                buttons == other.buttons &&
                carousel == other.carousel
        }

        override fun hashCode(): Int = Objects.hash(header, body, footer, buttons, carousel)

        override fun toString(): String =
            when {
                header != null -> "Component{header=$header}"
                body != null -> "Component{body=$body}"
                footer != null -> "Component{footer=$footer}"
                buttons != null -> "Component{buttons=$buttons}"
                carousel != null -> "Component{carousel=$carousel}"
                _json != null -> "Component{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Component")
            }

        companion object {

            /** Optional header displayed at the top of the message. */
            @JvmStatic
            fun ofHeader(header: WhatsappTemplateHeaderComponent) = Component(header = header)

            /**
             * The main text content of the message. Supports multiple variable parameters ({{1}},
             * {{2}}, etc.). Variables cannot be at the start or end. Maximum 1024 characters.
             */
            @JvmStatic fun ofBody(body: WhatsappTemplateBodyComponent) = Component(body = body)

            /**
             * Optional footer displayed at the bottom of the message. Does not support variables.
             */
            @JvmStatic
            fun ofFooter(footer: WhatsappTemplateFooterComponent) = Component(footer = footer)

            /** Optional interactive buttons. Maximum 3 buttons per template. */
            @JvmStatic
            fun ofButtons(buttons: WhatsappTemplateButtonsComponent) = Component(buttons = buttons)

            /**
             * Carousel component for multi-card templates. Each card can contain its own header,
             * body, and buttons.
             */
            @JvmStatic
            fun ofCarousel(carousel: WhatsappTemplateCarouselComponent) =
                Component(carousel = carousel)
        }

        /**
         * An interface that defines how to map each variant of [Component] to a value of type [T].
         */
        interface Visitor<out T> {

            /** Optional header displayed at the top of the message. */
            fun visitHeader(header: WhatsappTemplateHeaderComponent): T

            /**
             * The main text content of the message. Supports multiple variable parameters ({{1}},
             * {{2}}, etc.). Variables cannot be at the start or end. Maximum 1024 characters.
             */
            fun visitBody(body: WhatsappTemplateBodyComponent): T

            /**
             * Optional footer displayed at the bottom of the message. Does not support variables.
             */
            fun visitFooter(footer: WhatsappTemplateFooterComponent): T

            /** Optional interactive buttons. Maximum 3 buttons per template. */
            fun visitButtons(buttons: WhatsappTemplateButtonsComponent): T

            /**
             * Carousel component for multi-card templates. Each card can contain its own header,
             * body, and buttons.
             */
            fun visitCarousel(carousel: WhatsappTemplateCarouselComponent): T

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
                val type = json.asObject().getOrNull()?.get("type")?.asString()?.getOrNull()

                when (type) {
                    "HEADER" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<WhatsappTemplateHeaderComponent>(),
                            )
                            ?.let { Component(header = it, _json = json) }
                            ?: Component(_json = json)
                    }
                    "BODY" -> {
                        return tryDeserialize(node, jacksonTypeRef<WhatsappTemplateBodyComponent>())
                            ?.let { Component(body = it, _json = json) } ?: Component(_json = json)
                    }
                    "FOOTER" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<WhatsappTemplateFooterComponent>(),
                            )
                            ?.let { Component(footer = it, _json = json) }
                            ?: Component(_json = json)
                    }
                    "BUTTONS" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<WhatsappTemplateButtonsComponent>(),
                            )
                            ?.let { Component(buttons = it, _json = json) }
                            ?: Component(_json = json)
                    }
                    "CAROUSEL" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<WhatsappTemplateCarouselComponent>(),
                            )
                            ?.let { Component(carousel = it, _json = json) }
                            ?: Component(_json = json)
                    }
                }

                return Component(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Component>(Component::class) {

            override fun serialize(
                value: Component,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.header != null -> generator.writeObject(value.header)
                    value.body != null -> generator.writeObject(value.body)
                    value.footer != null -> generator.writeObject(value.footer)
                    value.buttons != null -> generator.writeObject(value.buttons)
                    value.carousel != null -> generator.writeObject(value.carousel)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Component")
                }
            }
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
