// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.pronunciationdicts

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.BaseDeserializer
import com.telnyx.sdk.core.BaseSerializer
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * A single pronunciation dictionary item. Use type 'alias' to replace matched text with a spoken
 * alias, or type 'phoneme' to specify exact pronunciation using IPA notation.
 */
@JsonDeserialize(using = PronunciationDictItem.Deserializer::class)
@JsonSerialize(using = PronunciationDictItem.Serializer::class)
class PronunciationDictItem
private constructor(
    private val alias: PronunciationDictAliasItem? = null,
    private val phoneme: PronunciationDictPhonemeItem? = null,
    private val _json: JsonValue? = null,
) {

    /**
     * An alias pronunciation item. When the `text` value is found in input, it is replaced with the
     * `alias` before speech synthesis.
     */
    fun alias(): Optional<PronunciationDictAliasItem> = Optional.ofNullable(alias)

    /**
     * A phoneme pronunciation item. When the `text` value is found in input, it is pronounced using
     * the specified IPA phoneme notation.
     */
    fun phoneme(): Optional<PronunciationDictPhonemeItem> = Optional.ofNullable(phoneme)

    fun isAlias(): Boolean = alias != null

    fun isPhoneme(): Boolean = phoneme != null

    /**
     * An alias pronunciation item. When the `text` value is found in input, it is replaced with the
     * `alias` before speech synthesis.
     */
    fun asAlias(): PronunciationDictAliasItem = alias.getOrThrow("alias")

    /**
     * A phoneme pronunciation item. When the `text` value is found in input, it is pronounced using
     * the specified IPA phoneme notation.
     */
    fun asPhoneme(): PronunciationDictPhonemeItem = phoneme.getOrThrow("phoneme")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    /**
     * Maps this instance's current variant to a value of type [T] using the given [visitor].
     *
     * Note that this method is _not_ forwards compatible with new variants from the API, unless
     * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of the
     * SDK gracefully, consider overriding [Visitor.unknown]:
     * ```java
     * import com.telnyx.sdk.core.JsonValue;
     * import java.util.Optional;
     *
     * Optional<String> result = pronunciationDictItem.accept(new PronunciationDictItem.Visitor<Optional<String>>() {
     *     @Override
     *     public Optional<String> visitAlias(PronunciationDictAliasItem alias) {
     *         return Optional.of(alias.toString());
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
     * @throws TelnyxInvalidDataException if [Visitor.unknown] is not overridden in [visitor] and
     *   the current variant is unknown.
     */
    fun <T> accept(visitor: Visitor<T>): T =
        when {
            alias != null -> visitor.visitAlias(alias)
            phoneme != null -> visitor.visitPhoneme(phoneme)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): PronunciationDictItem = apply {
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

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        accept(
            object : Visitor<Int> {
                override fun visitAlias(alias: PronunciationDictAliasItem) = alias.validity()

                override fun visitPhoneme(phoneme: PronunciationDictPhonemeItem) =
                    phoneme.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PronunciationDictItem && alias == other.alias && phoneme == other.phoneme
    }

    override fun hashCode(): Int = Objects.hash(alias, phoneme)

    override fun toString(): String =
        when {
            alias != null -> "PronunciationDictItem{alias=$alias}"
            phoneme != null -> "PronunciationDictItem{phoneme=$phoneme}"
            _json != null -> "PronunciationDictItem{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid PronunciationDictItem")
        }

    companion object {

        /**
         * An alias pronunciation item. When the `text` value is found in input, it is replaced with
         * the `alias` before speech synthesis.
         */
        @JvmStatic
        fun ofAlias(alias: PronunciationDictAliasItem) = PronunciationDictItem(alias = alias)

        /**
         * A phoneme pronunciation item. When the `text` value is found in input, it is pronounced
         * using the specified IPA phoneme notation.
         */
        @JvmStatic
        fun ofPhoneme(phoneme: PronunciationDictPhonemeItem) =
            PronunciationDictItem(phoneme = phoneme)
    }

    /**
     * An interface that defines how to map each variant of [PronunciationDictItem] to a value of
     * type [T].
     */
    interface Visitor<out T> {

        /**
         * An alias pronunciation item. When the `text` value is found in input, it is replaced with
         * the `alias` before speech synthesis.
         */
        fun visitAlias(alias: PronunciationDictAliasItem): T

        /**
         * A phoneme pronunciation item. When the `text` value is found in input, it is pronounced
         * using the specified IPA phoneme notation.
         */
        fun visitPhoneme(phoneme: PronunciationDictPhonemeItem): T

        /**
         * Maps an unknown variant of [PronunciationDictItem] to a value of type [T].
         *
         * An instance of [PronunciationDictItem] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws TelnyxInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw TelnyxInvalidDataException("Unknown PronunciationDictItem: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<PronunciationDictItem>(PronunciationDictItem::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): PronunciationDictItem {
            val json = JsonValue.fromJsonNode(node)
            val type = json.asObject().getOrNull()?.get("type")?.asString()?.getOrNull()

            when (type) {
                "alias" -> {
                    return tryDeserialize(node, jacksonTypeRef<PronunciationDictAliasItem>())?.let {
                        PronunciationDictItem(alias = it, _json = json)
                    } ?: PronunciationDictItem(_json = json)
                }
                "phoneme" -> {
                    return tryDeserialize(node, jacksonTypeRef<PronunciationDictPhonemeItem>())
                        ?.let { PronunciationDictItem(phoneme = it, _json = json) }
                        ?: PronunciationDictItem(_json = json)
                }
            }

            return PronunciationDictItem(_json = json)
        }
    }

    internal class Serializer :
        BaseSerializer<PronunciationDictItem>(PronunciationDictItem::class) {

        override fun serialize(
            value: PronunciationDictItem,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.alias != null -> generator.writeObject(value.alias)
                value.phoneme != null -> generator.writeObject(value.phoneme)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid PronunciationDictItem")
            }
        }
    }
}
