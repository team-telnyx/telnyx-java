// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.pronunciationdicts

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.telnyx.sdk.core.BaseSerializer
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.MultipartField
import com.telnyx.sdk.core.Params
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

/**
 * Create a new pronunciation dictionary for the authenticated organization. Each dictionary
 * contains a list of items that control how specific words are spoken. Items can be alias type
 * (text replacement) or phoneme type (IPA pronunciation notation).
 *
 * As an alternative to providing items directly as JSON, you can upload a dictionary file (PLS/XML
 * or plain text format, max 1MB) using multipart/form-data. PLS files use the standard W3C
 * Pronunciation Lexicon Specification XML format. Text files use a line-based format: `word=alias`
 * for aliases, `word:/phoneme/` for IPA phonemes.
 *
 * Limits:
 * - Maximum 50 dictionaries per organization
 * - Maximum 100 items per dictionary
 * - Text: max 200 characters
 * - Alias/phoneme value: max 500 characters
 * - File upload: max 1MB (1,048,576 bytes)
 */
class PronunciationDictCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * List of pronunciation items (alias or phoneme type). At least one item is required.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun items(): List<Item> = body.items()

    /**
     * Human-readable name. Must be unique within the organization.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * Returns the raw multipart value of [items].
     *
     * Unlike [items], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _items(): MultipartField<List<Item>> = body._items()

    /**
     * Returns the raw multipart value of [name].
     *
     * Unlike [name], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _name(): MultipartField<String> = body._name()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PronunciationDictCreateParams].
         *
         * The following fields are required:
         * ```java
         * .items()
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PronunciationDictCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(pronunciationDictCreateParams: PronunciationDictCreateParams) = apply {
            body = pronunciationDictCreateParams.body.toBuilder()
            additionalHeaders = pronunciationDictCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = pronunciationDictCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [items]
         * - [name]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** List of pronunciation items (alias or phoneme type). At least one item is required. */
        fun items(items: List<Item>) = apply { body.items(items) }

        /**
         * Sets [Builder.items] to an arbitrary multipart value.
         *
         * You should usually call [Builder.items] with a well-typed `List<Item>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun items(items: MultipartField<List<Item>>) = apply { body.items(items) }

        /**
         * Adds a single [Item] to [items].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addItem(item: Item) = apply { body.addItem(item) }

        /** Alias for calling [addItem] with `Item.ofAlias(alias)`. */
        fun addItem(alias: PronunciationDictAliasItem) = apply { body.addItem(alias) }

        /** Alias for calling [addItem] with `Item.ofPhoneme(phoneme)`. */
        fun addItem(phoneme: PronunciationDictPhonemeItem) = apply { body.addItem(phoneme) }

        /** Human-readable name. Must be unique within the organization. */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary multipart value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: MultipartField<String>) = apply { body.name(name) }

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
         * Returns an immutable instance of [PronunciationDictCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .items()
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PronunciationDictCreateParams =
            PronunciationDictCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Map<String, MultipartField<*>> =
        (mapOf("items" to _items(), "name" to _name()) +
                _additionalBodyProperties().mapValues { (_, value) -> MultipartField.of(value) })
            .toImmutable()

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Request body for creating a pronunciation dictionary. */
    class Body
    private constructor(
        private val items: MultipartField<List<Item>>,
        private val name: MultipartField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        /**
         * List of pronunciation items (alias or phoneme type). At least one item is required.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun items(): List<Item> = items.value.getRequired("items")

        /**
         * Human-readable name. Must be unique within the organization.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.value.getRequired("name")

        /**
         * Returns the raw multipart value of [items].
         *
         * Unlike [items], this method doesn't throw if the multipart field has an unexpected type.
         */
        @JsonProperty("items") @ExcludeMissing fun _items(): MultipartField<List<Item>> = items

        /**
         * Returns the raw multipart value of [name].
         *
         * Unlike [name], this method doesn't throw if the multipart field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): MultipartField<String> = name

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .items()
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var items: MultipartField<MutableList<Item>>? = null
            private var name: MultipartField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                items = body.items.map { it.toMutableList() }
                name = body.name
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * List of pronunciation items (alias or phoneme type). At least one item is required.
             */
            fun items(items: List<Item>) = items(MultipartField.of(items))

            /**
             * Sets [Builder.items] to an arbitrary multipart value.
             *
             * You should usually call [Builder.items] with a well-typed `List<Item>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun items(items: MultipartField<List<Item>>) = apply {
                this.items = items.map { it.toMutableList() }
            }

            /**
             * Adds a single [Item] to [items].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addItem(item: Item) = apply {
                items =
                    (items ?: MultipartField.of(mutableListOf())).also {
                        checkKnown("items", it).add(item)
                    }
            }

            /** Alias for calling [addItem] with `Item.ofAlias(alias)`. */
            fun addItem(alias: PronunciationDictAliasItem) = addItem(Item.ofAlias(alias))

            /** Alias for calling [addItem] with `Item.ofPhoneme(phoneme)`. */
            fun addItem(phoneme: PronunciationDictPhonemeItem) = addItem(Item.ofPhoneme(phoneme))

            /** Human-readable name. Must be unique within the organization. */
            fun name(name: String) = name(MultipartField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary multipart value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: MultipartField<String>) = apply { this.name = name }

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
             *
             * The following fields are required:
             * ```java
             * .items()
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("items", items).map { it.toImmutable() },
                    checkRequired("name", name),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            items().forEach { it.validate() }
            name()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: TelnyxInvalidDataException) {
                false
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                items == other.items &&
                name == other.name &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(items, name, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{items=$items, name=$name, additionalProperties=$additionalProperties}"
    }

    /**
     * A single pronunciation dictionary item. Use type 'alias' to replace matched text with a
     * spoken alias, or type 'phoneme' to specify exact pronunciation using IPA notation.
     */
    @JsonSerialize(using = Item.Serializer::class)
    class Item
    private constructor(
        private val alias: PronunciationDictAliasItem? = null,
        private val phoneme: PronunciationDictPhonemeItem? = null,
        private val _json: JsonValue? = null,
    ) {

        /**
         * An alias pronunciation item. When the `text` value is found in input, it is replaced with
         * the `alias` before speech synthesis.
         */
        fun alias(): Optional<PronunciationDictAliasItem> = Optional.ofNullable(alias)

        /**
         * A phoneme pronunciation item. When the `text` value is found in input, it is pronounced
         * using the specified IPA phoneme notation.
         */
        fun phoneme(): Optional<PronunciationDictPhonemeItem> = Optional.ofNullable(phoneme)

        fun isAlias(): Boolean = alias != null

        fun isPhoneme(): Boolean = phoneme != null

        /**
         * An alias pronunciation item. When the `text` value is found in input, it is replaced with
         * the `alias` before speech synthesis.
         */
        fun asAlias(): PronunciationDictAliasItem = alias.getOrThrow("alias")

        /**
         * A phoneme pronunciation item. When the `text` value is found in input, it is pronounced
         * using the specified IPA phoneme notation.
         */
        fun asPhoneme(): PronunciationDictPhonemeItem = phoneme.getOrThrow("phoneme")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                alias != null -> visitor.visitAlias(alias)
                phoneme != null -> visitor.visitPhoneme(phoneme)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Item = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitAlias(alias: PronunciationDictAliasItem) {
                        alias.validate()
                    }

                    override fun visitPhoneme(phoneme: PronunciationDictPhonemeItem) {
                        phoneme.validate()
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Item && alias == other.alias && phoneme == other.phoneme
        }

        override fun hashCode(): Int = Objects.hash(alias, phoneme)

        override fun toString(): String =
            when {
                alias != null -> "Item{alias=$alias}"
                phoneme != null -> "Item{phoneme=$phoneme}"
                _json != null -> "Item{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Item")
            }

        companion object {

            /**
             * An alias pronunciation item. When the `text` value is found in input, it is replaced
             * with the `alias` before speech synthesis.
             */
            @JvmStatic fun ofAlias(alias: PronunciationDictAliasItem) = Item(alias = alias)

            /**
             * A phoneme pronunciation item. When the `text` value is found in input, it is
             * pronounced using the specified IPA phoneme notation.
             */
            @JvmStatic
            fun ofPhoneme(phoneme: PronunciationDictPhonemeItem) = Item(phoneme = phoneme)
        }

        /** An interface that defines how to map each variant of [Item] to a value of type [T]. */
        interface Visitor<out T> {

            /**
             * An alias pronunciation item. When the `text` value is found in input, it is replaced
             * with the `alias` before speech synthesis.
             */
            fun visitAlias(alias: PronunciationDictAliasItem): T

            /**
             * A phoneme pronunciation item. When the `text` value is found in input, it is
             * pronounced using the specified IPA phoneme notation.
             */
            fun visitPhoneme(phoneme: PronunciationDictPhonemeItem): T

            /**
             * Maps an unknown variant of [Item] to a value of type [T].
             *
             * An instance of [Item] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws TelnyxInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw TelnyxInvalidDataException("Unknown Item: $json")
            }
        }

        internal class Serializer : BaseSerializer<Item>(Item::class) {

            override fun serialize(
                value: Item,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.alias != null -> generator.writeObject(value.alias)
                    value.phoneme != null -> generator.writeObject(value.phoneme)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Item")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PronunciationDictCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PronunciationDictCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
