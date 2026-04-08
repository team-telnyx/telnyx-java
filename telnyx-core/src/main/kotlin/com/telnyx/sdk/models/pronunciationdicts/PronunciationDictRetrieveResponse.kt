// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.pronunciationdicts

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
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Response containing a single pronunciation dictionary. */
class PronunciationDictRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<Data>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of()
    ) : this(data, mutableMapOf())

    /**
     * A pronunciation dictionary record.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): Optional<Data> = data.getOptional("data")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

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
         * [PronunciationDictRetrieveResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PronunciationDictRetrieveResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(pronunciationDictRetrieveResponse: PronunciationDictRetrieveResponse) =
            apply {
                data = pronunciationDictRetrieveResponse.data
                additionalProperties =
                    pronunciationDictRetrieveResponse.additionalProperties.toMutableMap()
            }

        /** A pronunciation dictionary record. */
        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

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
         * Returns an immutable instance of [PronunciationDictRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PronunciationDictRetrieveResponse =
            PronunciationDictRetrieveResponse(data, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): PronunciationDictRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        data().ifPresent { it.validate() }
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
    @JvmSynthetic internal fun validity(): Int = (data.asKnown().getOrNull()?.validity() ?: 0)

    /** A pronunciation dictionary record. */
    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val items: JsonField<List<Item>>,
        private val name: JsonField<String>,
        private val recordType: JsonField<RecordType>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val version: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("items") @ExcludeMissing items: JsonField<List<Item>> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<RecordType> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
        ) : this(id, createdAt, items, name, recordType, updatedAt, version, mutableMapOf())

        /**
         * Unique identifier for the pronunciation dictionary.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * ISO 8601 timestamp with millisecond precision.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

        /**
         * List of pronunciation items (alias or phoneme type).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun items(): Optional<List<Item>> = items.getOptional("items")

        /**
         * Human-readable name for the dictionary. Must be unique within the organization.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Identifies the resource type.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordType(): Optional<RecordType> = recordType.getOptional("record_type")

        /**
         * ISO 8601 timestamp with millisecond precision.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

        /**
         * Auto-incrementing version number. Increases by 1 on each update. Used for optimistic
         * concurrency control and cache invalidation.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun version(): Optional<Long> = version.getOptional("version")

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
         * Returns the raw JSON value of [items].
         *
         * Unlike [items], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("items") @ExcludeMissing fun _items(): JsonField<List<Item>> = items

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<RecordType> = recordType

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updated_at")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

        /**
         * Returns the raw JSON value of [version].
         *
         * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

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

            /** Returns a mutable builder for constructing an instance of [Data]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var items: JsonField<MutableList<Item>>? = null
            private var name: JsonField<String> = JsonMissing.of()
            private var recordType: JsonField<RecordType> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var version: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                createdAt = data.createdAt
                items = data.items.map { it.toMutableList() }
                name = data.name
                recordType = data.recordType
                updatedAt = data.updatedAt
                version = data.version
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Unique identifier for the pronunciation dictionary. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** ISO 8601 timestamp with millisecond precision. */
            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /** List of pronunciation items (alias or phoneme type). */
            fun items(items: List<Item>) = items(JsonField.of(items))

            /**
             * Sets [Builder.items] to an arbitrary JSON value.
             *
             * You should usually call [Builder.items] with a well-typed `List<Item>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun items(items: JsonField<List<Item>>) = apply {
                this.items = items.map { it.toMutableList() }
            }

            /**
             * Adds a single [Item] to [items].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addItem(item: Item) = apply {
                items =
                    (items ?: JsonField.of(mutableListOf())).also {
                        checkKnown("items", it).add(item)
                    }
            }

            /** Alias for calling [addItem] with `Item.ofAlias(alias)`. */
            fun addItem(alias: Item.Alias) = addItem(Item.ofAlias(alias))

            /** Alias for calling [addItem] with `Item.ofPhoneme(phoneme)`. */
            fun addItem(phoneme: Item.Phoneme) = addItem(Item.ofPhoneme(phoneme))

            /** Human-readable name for the dictionary. Must be unique within the organization. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Identifies the resource type. */
            fun recordType(recordType: RecordType) = recordType(JsonField.of(recordType))

            /**
             * Sets [Builder.recordType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordType] with a well-typed [RecordType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordType(recordType: JsonField<RecordType>) = apply {
                this.recordType = recordType
            }

            /** ISO 8601 timestamp with millisecond precision. */
            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

            /**
             * Auto-incrementing version number. Increases by 1 on each update. Used for optimistic
             * concurrency control and cache invalidation.
             */
            fun version(version: Long) = version(JsonField.of(version))

            /**
             * Sets [Builder.version] to an arbitrary JSON value.
             *
             * You should usually call [Builder.version] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun version(version: JsonField<Long>) = apply { this.version = version }

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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Data =
                Data(
                    id,
                    createdAt,
                    (items ?: JsonMissing.of()).map { it.toImmutable() },
                    name,
                    recordType,
                    updatedAt,
                    version,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            id()
            createdAt()
            items().ifPresent { it.forEach { it.validate() } }
            name()
            recordType().ifPresent { it.validate() }
            updatedAt()
            version()
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
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (items.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (recordType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0) +
                (if (version.asKnown().isPresent) 1 else 0)

        /**
         * A single pronunciation dictionary item. Use type 'alias' to replace matched text with a
         * spoken alias, or type 'phoneme' to specify exact pronunciation using IPA notation.
         */
        @JsonDeserialize(using = Item.Deserializer::class)
        @JsonSerialize(using = Item.Serializer::class)
        class Item
        private constructor(
            private val alias: Alias? = null,
            private val phoneme: Phoneme? = null,
            private val _json: JsonValue? = null,
        ) {

            /**
             * An alias pronunciation item. When the `text` value is found in input, it is replaced
             * with the `alias` before speech synthesis.
             */
            fun alias(): Optional<Alias> = Optional.ofNullable(alias)

            /**
             * A phoneme pronunciation item. When the `text` value is found in input, it is
             * pronounced using the specified IPA phoneme notation.
             */
            fun phoneme(): Optional<Phoneme> = Optional.ofNullable(phoneme)

            fun isAlias(): Boolean = alias != null

            fun isPhoneme(): Boolean = phoneme != null

            /**
             * An alias pronunciation item. When the `text` value is found in input, it is replaced
             * with the `alias` before speech synthesis.
             */
            fun asAlias(): Alias = alias.getOrThrow("alias")

            /**
             * A phoneme pronunciation item. When the `text` value is found in input, it is
             * pronounced using the specified IPA phoneme notation.
             */
            fun asPhoneme(): Phoneme = phoneme.getOrThrow("phoneme")

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
                        override fun visitAlias(alias: Alias) {
                            alias.validate()
                        }

                        override fun visitPhoneme(phoneme: Phoneme) {
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
                        override fun visitAlias(alias: Alias) = alias.validity()

                        override fun visitPhoneme(phoneme: Phoneme) = phoneme.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

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
                 * An alias pronunciation item. When the `text` value is found in input, it is
                 * replaced with the `alias` before speech synthesis.
                 */
                @JvmStatic fun ofAlias(alias: Alias) = Item(alias = alias)

                /**
                 * A phoneme pronunciation item. When the `text` value is found in input, it is
                 * pronounced using the specified IPA phoneme notation.
                 */
                @JvmStatic fun ofPhoneme(phoneme: Phoneme) = Item(phoneme = phoneme)
            }

            /**
             * An interface that defines how to map each variant of [Item] to a value of type [T].
             */
            interface Visitor<out T> {

                /**
                 * An alias pronunciation item. When the `text` value is found in input, it is
                 * replaced with the `alias` before speech synthesis.
                 */
                fun visitAlias(alias: Alias): T

                /**
                 * A phoneme pronunciation item. When the `text` value is found in input, it is
                 * pronounced using the specified IPA phoneme notation.
                 */
                fun visitPhoneme(phoneme: Phoneme): T

                /**
                 * Maps an unknown variant of [Item] to a value of type [T].
                 *
                 * An instance of [Item] can contain an unknown variant if it was deserialized from
                 * data that doesn't match any known variant. For example, if the SDK is on an older
                 * version than the API, then the API may respond with new variants that the SDK is
                 * unaware of.
                 *
                 * @throws TelnyxInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw TelnyxInvalidDataException("Unknown Item: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Item>(Item::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Item {
                    val json = JsonValue.fromJsonNode(node)
                    val type = json.asObject().getOrNull()?.get("type")?.asString()?.getOrNull()

                    when (type) {
                        "alias" -> {
                            return tryDeserialize(node, jacksonTypeRef<Alias>())?.let {
                                Item(alias = it, _json = json)
                            } ?: Item(_json = json)
                        }
                        "phoneme" -> {
                            return tryDeserialize(node, jacksonTypeRef<Phoneme>())?.let {
                                Item(phoneme = it, _json = json)
                            } ?: Item(_json = json)
                        }
                    }

                    return Item(_json = json)
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

            /**
             * An alias pronunciation item. When the `text` value is found in input, it is replaced
             * with the `alias` before speech synthesis.
             */
            class Alias
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val alias: JsonField<String>,
                private val text: JsonField<String>,
                private val type: JsonValue,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("alias")
                    @ExcludeMissing
                    alias: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("text")
                    @ExcludeMissing
                    text: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                ) : this(alias, text, type, mutableMapOf())

                /**
                 * The replacement text that will be spoken instead.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun alias(): String = alias.getRequired("alias")

                /**
                 * The text to match in the input. Case-insensitive matching is used during
                 * synthesis.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun text(): String = text.getRequired("text")

                /**
                 * The item type.
                 *
                 * Expected to always return the following:
                 * ```java
                 * JsonValue.from("alias")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                /**
                 * Returns the raw JSON value of [alias].
                 *
                 * Unlike [alias], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("alias") @ExcludeMissing fun _alias(): JsonField<String> = alias

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

                    /**
                     * Returns a mutable builder for constructing an instance of [Alias].
                     *
                     * The following fields are required:
                     * ```java
                     * .alias()
                     * .text()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Alias]. */
                class Builder internal constructor() {

                    private var alias: JsonField<String>? = null
                    private var text: JsonField<String>? = null
                    private var type: JsonValue = JsonValue.from("alias")
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(alias: Alias) = apply {
                        this.alias = alias.alias
                        text = alias.text
                        type = alias.type
                        additionalProperties = alias.additionalProperties.toMutableMap()
                    }

                    /** The replacement text that will be spoken instead. */
                    fun alias(alias: String) = alias(JsonField.of(alias))

                    /**
                     * Sets [Builder.alias] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.alias] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun alias(alias: JsonField<String>) = apply { this.alias = alias }

                    /**
                     * The text to match in the input. Case-insensitive matching is used during
                     * synthesis.
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

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```java
                     * JsonValue.from("alias")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun type(type: JsonValue) = apply { this.type = type }

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
                     * Returns an immutable instance of [Alias].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .alias()
                     * .text()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Alias =
                        Alias(
                            checkRequired("alias", alias),
                            checkRequired("text", text),
                            type,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Alias = apply {
                    if (validated) {
                        return@apply
                    }

                    alias()
                    text()
                    _type().let {
                        if (it != JsonValue.from("alias")) {
                            throw TelnyxInvalidDataException("'type' is invalid, received $it")
                        }
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
                    (if (alias.asKnown().isPresent) 1 else 0) +
                        (if (text.asKnown().isPresent) 1 else 0) +
                        type.let { if (it == JsonValue.from("alias")) 1 else 0 }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Alias &&
                        alias == other.alias &&
                        text == other.text &&
                        type == other.type &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(alias, text, type, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Alias{alias=$alias, text=$text, type=$type, additionalProperties=$additionalProperties}"
            }

            /**
             * A phoneme pronunciation item. When the `text` value is found in input, it is
             * pronounced using the specified IPA phoneme notation.
             */
            class Phoneme
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val alphabet: JsonField<Alphabet>,
                private val phoneme: JsonField<String>,
                private val text: JsonField<String>,
                private val type: JsonValue,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("alphabet")
                    @ExcludeMissing
                    alphabet: JsonField<Alphabet> = JsonMissing.of(),
                    @JsonProperty("phoneme")
                    @ExcludeMissing
                    phoneme: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("text")
                    @ExcludeMissing
                    text: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                ) : this(alphabet, phoneme, text, type, mutableMapOf())

                /**
                 * The phonetic alphabet used for the phoneme notation.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun alphabet(): Alphabet = alphabet.getRequired("alphabet")

                /**
                 * The phoneme notation representing the desired pronunciation.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun phoneme(): String = phoneme.getRequired("phoneme")

                /**
                 * The text to match in the input. Case-insensitive matching is used during
                 * synthesis.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun text(): String = text.getRequired("text")

                /**
                 * The item type.
                 *
                 * Expected to always return the following:
                 * ```java
                 * JsonValue.from("phoneme")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                /**
                 * Returns the raw JSON value of [alphabet].
                 *
                 * Unlike [alphabet], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("alphabet")
                @ExcludeMissing
                fun _alphabet(): JsonField<Alphabet> = alphabet

                /**
                 * Returns the raw JSON value of [phoneme].
                 *
                 * Unlike [phoneme], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("phoneme") @ExcludeMissing fun _phoneme(): JsonField<String> = phoneme

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

                    /**
                     * Returns a mutable builder for constructing an instance of [Phoneme].
                     *
                     * The following fields are required:
                     * ```java
                     * .alphabet()
                     * .phoneme()
                     * .text()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Phoneme]. */
                class Builder internal constructor() {

                    private var alphabet: JsonField<Alphabet>? = null
                    private var phoneme: JsonField<String>? = null
                    private var text: JsonField<String>? = null
                    private var type: JsonValue = JsonValue.from("phoneme")
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(phoneme: Phoneme) = apply {
                        alphabet = phoneme.alphabet
                        this.phoneme = phoneme.phoneme
                        text = phoneme.text
                        type = phoneme.type
                        additionalProperties = phoneme.additionalProperties.toMutableMap()
                    }

                    /** The phonetic alphabet used for the phoneme notation. */
                    fun alphabet(alphabet: Alphabet) = alphabet(JsonField.of(alphabet))

                    /**
                     * Sets [Builder.alphabet] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.alphabet] with a well-typed [Alphabet] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun alphabet(alphabet: JsonField<Alphabet>) = apply { this.alphabet = alphabet }

                    /** The phoneme notation representing the desired pronunciation. */
                    fun phoneme(phoneme: String) = phoneme(JsonField.of(phoneme))

                    /**
                     * Sets [Builder.phoneme] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.phoneme] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun phoneme(phoneme: JsonField<String>) = apply { this.phoneme = phoneme }

                    /**
                     * The text to match in the input. Case-insensitive matching is used during
                     * synthesis.
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

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```java
                     * JsonValue.from("phoneme")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun type(type: JsonValue) = apply { this.type = type }

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
                     * Returns an immutable instance of [Phoneme].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .alphabet()
                     * .phoneme()
                     * .text()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Phoneme =
                        Phoneme(
                            checkRequired("alphabet", alphabet),
                            checkRequired("phoneme", phoneme),
                            checkRequired("text", text),
                            type,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Phoneme = apply {
                    if (validated) {
                        return@apply
                    }

                    alphabet().validate()
                    phoneme()
                    text()
                    _type().let {
                        if (it != JsonValue.from("phoneme")) {
                            throw TelnyxInvalidDataException("'type' is invalid, received $it")
                        }
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
                    (alphabet.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (phoneme.asKnown().isPresent) 1 else 0) +
                        (if (text.asKnown().isPresent) 1 else 0) +
                        type.let { if (it == JsonValue.from("phoneme")) 1 else 0 }

                /** The phonetic alphabet used for the phoneme notation. */
                class Alphabet
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

                        @JvmField val IPA = of("ipa")

                        @JvmStatic fun of(value: String) = Alphabet(JsonField.of(value))
                    }

                    /** An enum containing [Alphabet]'s known values. */
                    enum class Known {
                        IPA
                    }

                    /**
                     * An enum containing [Alphabet]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [Alphabet] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        IPA,
                        /**
                         * An enum member indicating that [Alphabet] was instantiated with an
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
                            IPA -> Value.IPA
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
                            IPA -> Known.IPA
                            else -> throw TelnyxInvalidDataException("Unknown Alphabet: $value")
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

                    fun validate(): Alphabet = apply {
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

                        return other is Alphabet && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Phoneme &&
                        alphabet == other.alphabet &&
                        phoneme == other.phoneme &&
                        text == other.text &&
                        type == other.type &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(alphabet, phoneme, text, type, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Phoneme{alphabet=$alphabet, phoneme=$phoneme, text=$text, type=$type, additionalProperties=$additionalProperties}"
            }
        }

        /** Identifies the resource type. */
        class RecordType @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val PRONUNCIATION_DICT = of("pronunciation_dict")

                @JvmStatic fun of(value: String) = RecordType(JsonField.of(value))
            }

            /** An enum containing [RecordType]'s known values. */
            enum class Known {
                PRONUNCIATION_DICT
            }

            /**
             * An enum containing [RecordType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [RecordType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PRONUNCIATION_DICT,
                /**
                 * An enum member indicating that [RecordType] was instantiated with an unknown
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
                    PRONUNCIATION_DICT -> Value.PRONUNCIATION_DICT
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
                    PRONUNCIATION_DICT -> Known.PRONUNCIATION_DICT
                    else -> throw TelnyxInvalidDataException("Unknown RecordType: $value")
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

            return other is Data &&
                id == other.id &&
                createdAt == other.createdAt &&
                items == other.items &&
                name == other.name &&
                recordType == other.recordType &&
                updatedAt == other.updatedAt &&
                version == other.version &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                createdAt,
                items,
                name,
                recordType,
                updatedAt,
                version,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, createdAt=$createdAt, items=$items, name=$name, recordType=$recordType, updatedAt=$updatedAt, version=$version, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PronunciationDictRetrieveResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PronunciationDictRetrieveResponse{data=$data, additionalProperties=$additionalProperties}"
}
