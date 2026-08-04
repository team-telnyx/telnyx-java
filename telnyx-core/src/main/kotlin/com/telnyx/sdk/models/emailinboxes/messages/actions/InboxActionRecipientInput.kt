// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailinboxes.messages.actions

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
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.allMaxBy
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

/**
 * One recipient or a recipient array. Each recipient may be an email string or an object with
 * `email` and optional `name`.
 */
@JsonDeserialize(using = InboxActionRecipientInput.Deserializer::class)
@JsonSerialize(using = InboxActionRecipientInput.Serializer::class)
class InboxActionRecipientInput
private constructor(
    private val string: String? = null,
    private val unionMember1: UnionMember1? = null,
    private val emailAddressInputs: List<InboxActionEmailAddressInput>? = null,
    private val _json: JsonValue? = null,
) {

    fun string(): Optional<String> = Optional.ofNullable(string)

    fun unionMember1(): Optional<UnionMember1> = Optional.ofNullable(unionMember1)

    fun emailAddressInputs(): Optional<List<InboxActionEmailAddressInput>> =
        Optional.ofNullable(emailAddressInputs)

    fun isString(): Boolean = string != null

    fun isUnionMember1(): Boolean = unionMember1 != null

    fun isEmailAddressInputs(): Boolean = emailAddressInputs != null

    fun asString(): String = string.getOrThrow("string")

    fun asUnionMember1(): UnionMember1 = unionMember1.getOrThrow("unionMember1")

    fun asEmailAddressInputs(): List<InboxActionEmailAddressInput> =
        emailAddressInputs.getOrThrow("emailAddressInputs")

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
     * Optional<String> result = inboxActionRecipientInput.accept(new InboxActionRecipientInput.Visitor<Optional<String>>() {
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
            unionMember1 != null -> visitor.visitUnionMember1(unionMember1)
            emailAddressInputs != null -> visitor.visitEmailAddressInputs(emailAddressInputs)
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
    fun validate(): InboxActionRecipientInput = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitString(string: String) {}

                override fun visitUnionMember1(unionMember1: UnionMember1) {
                    unionMember1.validate()
                }

                override fun visitEmailAddressInputs(
                    emailAddressInputs: List<InboxActionEmailAddressInput>
                ) {
                    emailAddressInputs.forEach { it.validate() }
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

                override fun visitUnionMember1(unionMember1: UnionMember1) = unionMember1.validity()

                override fun visitEmailAddressInputs(
                    emailAddressInputs: List<InboxActionEmailAddressInput>
                ) = emailAddressInputs.sumOf { it.validity().toInt() }

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InboxActionRecipientInput &&
            string == other.string &&
            unionMember1 == other.unionMember1 &&
            emailAddressInputs == other.emailAddressInputs
    }

    override fun hashCode(): Int = Objects.hash(string, unionMember1, emailAddressInputs)

    override fun toString(): String =
        when {
            string != null -> "InboxActionRecipientInput{string=$string}"
            unionMember1 != null -> "InboxActionRecipientInput{unionMember1=$unionMember1}"
            emailAddressInputs != null ->
                "InboxActionRecipientInput{emailAddressInputs=$emailAddressInputs}"
            _json != null -> "InboxActionRecipientInput{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid InboxActionRecipientInput")
        }

    companion object {

        @JvmStatic fun ofString(string: String) = InboxActionRecipientInput(string = string)

        @JvmStatic
        fun ofUnionMember1(unionMember1: UnionMember1) =
            InboxActionRecipientInput(unionMember1 = unionMember1)

        @JvmStatic
        fun ofEmailAddressInputs(emailAddressInputs: List<InboxActionEmailAddressInput>) =
            InboxActionRecipientInput(emailAddressInputs = emailAddressInputs.toImmutable())
    }

    /**
     * An interface that defines how to map each variant of [InboxActionRecipientInput] to a value
     * of type [T].
     */
    interface Visitor<out T> {

        fun visitString(string: String): T

        fun visitUnionMember1(unionMember1: UnionMember1): T

        fun visitEmailAddressInputs(emailAddressInputs: List<InboxActionEmailAddressInput>): T

        /**
         * Maps an unknown variant of [InboxActionRecipientInput] to a value of type [T].
         *
         * An instance of [InboxActionRecipientInput] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws TelnyxInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw TelnyxInvalidDataException("Unknown InboxActionRecipientInput: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<InboxActionRecipientInput>(InboxActionRecipientInput::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): InboxActionRecipientInput {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<UnionMember1>())?.let {
                            InboxActionRecipientInput(unionMember1 = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<String>())?.let {
                            InboxActionRecipientInput(string = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<List<InboxActionEmailAddressInput>>())
                            ?.let {
                                InboxActionRecipientInput(emailAddressInputs = it, _json = json)
                            },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> InboxActionRecipientInput(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer :
        BaseSerializer<InboxActionRecipientInput>(InboxActionRecipientInput::class) {

        override fun serialize(
            value: InboxActionRecipientInput,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.string != null -> generator.writeObject(value.string)
                value.unionMember1 != null -> generator.writeObject(value.unionMember1)
                value.emailAddressInputs != null -> generator.writeObject(value.emailAddressInputs)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid InboxActionRecipientInput")
            }
        }
    }

    class UnionMember1
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val email: JsonField<String>,
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        ) : this(email, name, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun email(): String = email.getRequired("email")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Returns the raw JSON value of [email].
         *
         * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
             * Returns a mutable builder for constructing an instance of [UnionMember1].
             *
             * The following fields are required:
             * ```java
             * .email()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [UnionMember1]. */
        class Builder internal constructor() {

            private var email: JsonField<String>? = null
            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(unionMember1: UnionMember1) = apply {
                email = unionMember1.email
                name = unionMember1.name
                additionalProperties = unionMember1.additionalProperties.toMutableMap()
            }

            fun email(email: String) = email(JsonField.of(email))

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

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
             * Returns an immutable instance of [UnionMember1].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .email()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): UnionMember1 =
                UnionMember1(
                    checkRequired("email", email),
                    name,
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
        fun validate(): UnionMember1 = apply {
            if (validated) {
                return@apply
            }

            email()
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

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (email.asKnown().isPresent) 1 else 0) + (if (name.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UnionMember1 &&
                email == other.email &&
                name == other.name &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(email, name, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UnionMember1{email=$email, name=$name, additionalProperties=$additionalProperties}"
    }
}
