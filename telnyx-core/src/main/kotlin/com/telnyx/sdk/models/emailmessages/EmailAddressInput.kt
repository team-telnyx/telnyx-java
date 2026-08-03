// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailmessages

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
import com.telnyx.sdk.core.allMaxBy
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import com.telnyx.sdk.models.emailinboxes.drafts.EmailAddress
import java.util.Objects
import java.util.Optional

@JsonDeserialize(using = EmailAddressInput.Deserializer::class)
@JsonSerialize(using = EmailAddressInput.Serializer::class)
class EmailAddressInput
private constructor(
    private val string: String? = null,
    private val emailAddress: EmailAddress? = null,
    private val _json: JsonValue? = null,
) {

    fun string(): Optional<String> = Optional.ofNullable(string)

    fun emailAddress(): Optional<EmailAddress> = Optional.ofNullable(emailAddress)

    fun isString(): Boolean = string != null

    fun isEmailAddress(): Boolean = emailAddress != null

    fun asString(): String = string.getOrThrow("string")

    fun asEmailAddress(): EmailAddress = emailAddress.getOrThrow("emailAddress")

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
     * Optional<String> result = emailAddressInput.accept(new EmailAddressInput.Visitor<Optional<String>>() {
     *     @Override
     *     public Optional<String> visitString(String string) {
     *         return Optional.of(string.toString());
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
            string != null -> visitor.visitString(string)
            emailAddress != null -> visitor.visitEmailAddress(emailAddress)
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
    fun validate(): EmailAddressInput = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitString(string: String) {}

                override fun visitEmailAddress(emailAddress: EmailAddress) {
                    emailAddress.validate()
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
                override fun visitString(string: String) = 1

                override fun visitEmailAddress(emailAddress: EmailAddress) = emailAddress.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmailAddressInput &&
            string == other.string &&
            emailAddress == other.emailAddress
    }

    override fun hashCode(): Int = Objects.hash(string, emailAddress)

    override fun toString(): String =
        when {
            string != null -> "EmailAddressInput{string=$string}"
            emailAddress != null -> "EmailAddressInput{emailAddress=$emailAddress}"
            _json != null -> "EmailAddressInput{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid EmailAddressInput")
        }

    companion object {

        @JvmStatic fun ofString(string: String) = EmailAddressInput(string = string)

        @JvmStatic
        fun ofEmailAddress(emailAddress: EmailAddress) =
            EmailAddressInput(emailAddress = emailAddress)
    }

    /**
     * An interface that defines how to map each variant of [EmailAddressInput] to a value of type
     * [T].
     */
    interface Visitor<out T> {

        fun visitString(string: String): T

        fun visitEmailAddress(emailAddress: EmailAddress): T

        /**
         * Maps an unknown variant of [EmailAddressInput] to a value of type [T].
         *
         * An instance of [EmailAddressInput] can contain an unknown variant if it was deserialized
         * from data that doesn't match any known variant. For example, if the SDK is on an older
         * version than the API, then the API may respond with new variants that the SDK is unaware
         * of.
         *
         * @throws TelnyxInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw TelnyxInvalidDataException("Unknown EmailAddressInput: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<EmailAddressInput>(EmailAddressInput::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): EmailAddressInput {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<EmailAddress>())?.let {
                            EmailAddressInput(emailAddress = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<String>())?.let {
                            EmailAddressInput(string = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> EmailAddressInput(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<EmailAddressInput>(EmailAddressInput::class) {

        override fun serialize(
            value: EmailAddressInput,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.string != null -> generator.writeObject(value.string)
                value.emailAddress != null -> generator.writeObject(value.emailAddress)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid EmailAddressInput")
            }
        }
    }
}
