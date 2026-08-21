// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.rcs.brands

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

@JsonDeserialize(using = BrandIdentifier.Deserializer::class)
@JsonSerialize(using = BrandIdentifier.Serializer::class)
class BrandIdentifier
private constructor(
    private val ein: EinBrandIdentifier? = null,
    private val stockSymbol: StockSymbolBrandIdentifier? = null,
    private val _json: JsonValue? = null,
) {

    fun ein(): Optional<EinBrandIdentifier> = Optional.ofNullable(ein)

    fun stockSymbol(): Optional<StockSymbolBrandIdentifier> = Optional.ofNullable(stockSymbol)

    fun isEin(): Boolean = ein != null

    fun isStockSymbol(): Boolean = stockSymbol != null

    fun asEin(): EinBrandIdentifier = ein.getOrThrow("ein")

    fun asStockSymbol(): StockSymbolBrandIdentifier = stockSymbol.getOrThrow("stockSymbol")

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
     * Optional<String> result = brandIdentifier.accept(new BrandIdentifier.Visitor<Optional<String>>() {
     *     @Override
     *     public Optional<String> visitEin(EinBrandIdentifier ein) {
     *         return Optional.of(ein.toString());
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
            ein != null -> visitor.visitEin(ein)
            stockSymbol != null -> visitor.visitStockSymbol(stockSymbol)
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
    fun validate(): BrandIdentifier = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitEin(ein: EinBrandIdentifier) {
                    ein.validate()
                }

                override fun visitStockSymbol(stockSymbol: StockSymbolBrandIdentifier) {
                    stockSymbol.validate()
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
                override fun visitEin(ein: EinBrandIdentifier) = ein.validity()

                override fun visitStockSymbol(stockSymbol: StockSymbolBrandIdentifier) =
                    stockSymbol.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BrandIdentifier && ein == other.ein && stockSymbol == other.stockSymbol
    }

    override fun hashCode(): Int = Objects.hash(ein, stockSymbol)

    override fun toString(): String =
        when {
            ein != null -> "BrandIdentifier{ein=$ein}"
            stockSymbol != null -> "BrandIdentifier{stockSymbol=$stockSymbol}"
            _json != null -> "BrandIdentifier{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid BrandIdentifier")
        }

    companion object {

        @JvmStatic fun ofEin(ein: EinBrandIdentifier) = BrandIdentifier(ein = ein)

        @JvmStatic
        fun ofStockSymbol(stockSymbol: StockSymbolBrandIdentifier) =
            BrandIdentifier(stockSymbol = stockSymbol)
    }

    /**
     * An interface that defines how to map each variant of [BrandIdentifier] to a value of type
     * [T].
     */
    interface Visitor<out T> {

        fun visitEin(ein: EinBrandIdentifier): T

        fun visitStockSymbol(stockSymbol: StockSymbolBrandIdentifier): T

        /**
         * Maps an unknown variant of [BrandIdentifier] to a value of type [T].
         *
         * An instance of [BrandIdentifier] can contain an unknown variant if it was deserialized
         * from data that doesn't match any known variant. For example, if the SDK is on an older
         * version than the API, then the API may respond with new variants that the SDK is unaware
         * of.
         *
         * @throws TelnyxInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw TelnyxInvalidDataException("Unknown BrandIdentifier: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<BrandIdentifier>(BrandIdentifier::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): BrandIdentifier {
            val json = JsonValue.fromJsonNode(node)
            val identifierType =
                json.asObject().getOrNull()?.get("identifier_type")?.asString()?.getOrNull()

            when (identifierType) {
                "EIN" -> {
                    return tryDeserialize(node, jacksonTypeRef<EinBrandIdentifier>())?.let {
                        BrandIdentifier(ein = it, _json = json)
                    } ?: BrandIdentifier(_json = json)
                }
                "STOCK_SYMBOL" -> {
                    return tryDeserialize(node, jacksonTypeRef<StockSymbolBrandIdentifier>())?.let {
                        BrandIdentifier(stockSymbol = it, _json = json)
                    } ?: BrandIdentifier(_json = json)
                }
            }

            return BrandIdentifier(_json = json)
        }
    }

    internal class Serializer : BaseSerializer<BrandIdentifier>(BrandIdentifier::class) {

        override fun serialize(
            value: BrandIdentifier,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.ein != null -> generator.writeObject(value.ein)
                value.stockSymbol != null -> generator.writeObject(value.stockSymbol)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid BrandIdentifier")
            }
        }
    }
}
