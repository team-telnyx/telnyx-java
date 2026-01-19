// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.rooms.sessions.actions

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
import com.telnyx.sdk.core.allMaxBy
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ActionsParticipantsRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val exclude: JsonField<List<String>>,
    private val participants: JsonField<Participants>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("exclude")
        @ExcludeMissing
        exclude: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("participants")
        @ExcludeMissing
        participants: JsonField<Participants> = JsonMissing.of(),
    ) : this(exclude, participants, mutableMapOf())

    /**
     * List of participant id to exclude from the action.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun exclude(): Optional<List<String>> = exclude.getOptional("exclude")

    /**
     * Either a list of participant id to perform the action on, or the keyword "all" to perform the
     * action on all participant.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun participants(): Optional<Participants> = participants.getOptional("participants")

    /**
     * Returns the raw JSON value of [exclude].
     *
     * Unlike [exclude], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("exclude") @ExcludeMissing fun _exclude(): JsonField<List<String>> = exclude

    /**
     * Returns the raw JSON value of [participants].
     *
     * Unlike [participants], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("participants")
    @ExcludeMissing
    fun _participants(): JsonField<Participants> = participants

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
         * Returns a mutable builder for constructing an instance of [ActionsParticipantsRequest].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ActionsParticipantsRequest]. */
    class Builder internal constructor() {

        private var exclude: JsonField<MutableList<String>>? = null
        private var participants: JsonField<Participants> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(actionsParticipantsRequest: ActionsParticipantsRequest) = apply {
            exclude = actionsParticipantsRequest.exclude.map { it.toMutableList() }
            participants = actionsParticipantsRequest.participants
            additionalProperties = actionsParticipantsRequest.additionalProperties.toMutableMap()
        }

        /** List of participant id to exclude from the action. */
        fun exclude(exclude: List<String>) = exclude(JsonField.of(exclude))

        /**
         * Sets [Builder.exclude] to an arbitrary JSON value.
         *
         * You should usually call [Builder.exclude] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun exclude(exclude: JsonField<List<String>>) = apply {
            this.exclude = exclude.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.exclude].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addExclude(exclude: String) = apply {
            this.exclude =
                (this.exclude ?: JsonField.of(mutableListOf())).also {
                    checkKnown("exclude", it).add(exclude)
                }
        }

        /**
         * Either a list of participant id to perform the action on, or the keyword "all" to perform
         * the action on all participant.
         */
        fun participants(participants: Participants) = participants(JsonField.of(participants))

        /**
         * Sets [Builder.participants] to an arbitrary JSON value.
         *
         * You should usually call [Builder.participants] with a well-typed [Participants] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun participants(participants: JsonField<Participants>) = apply {
            this.participants = participants
        }

        /** Alias for calling [participants] with `Participants.ofAll(all)`. */
        fun participants(all: Participants.AllParticipants) = participants(Participants.ofAll(all))

        /** Alias for calling [participants] with `Participants.ofStrings(strings)`. */
        fun participantsOfStrings(strings: List<String>) =
            participants(Participants.ofStrings(strings))

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
         * Returns an immutable instance of [ActionsParticipantsRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ActionsParticipantsRequest =
            ActionsParticipantsRequest(
                (exclude ?: JsonMissing.of()).map { it.toImmutable() },
                participants,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ActionsParticipantsRequest = apply {
        if (validated) {
            return@apply
        }

        exclude()
        participants().ifPresent { it.validate() }
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
        (exclude.asKnown().getOrNull()?.size ?: 0) +
            (participants.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * Either a list of participant id to perform the action on, or the keyword "all" to perform the
     * action on all participant.
     */
    @JsonDeserialize(using = Participants.Deserializer::class)
    @JsonSerialize(using = Participants.Serializer::class)
    class Participants
    private constructor(
        private val all: AllParticipants? = null,
        private val strings: List<String>? = null,
        private val _json: JsonValue? = null,
    ) {

        fun all(): Optional<AllParticipants> = Optional.ofNullable(all)

        fun strings(): Optional<List<String>> = Optional.ofNullable(strings)

        fun isAll(): Boolean = all != null

        fun isStrings(): Boolean = strings != null

        fun asAll(): AllParticipants = all.getOrThrow("all")

        fun asStrings(): List<String> = strings.getOrThrow("strings")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                all != null -> visitor.visitAll(all)
                strings != null -> visitor.visitStrings(strings)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Participants = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitAll(all: AllParticipants) {
                        all.validate()
                    }

                    override fun visitStrings(strings: List<String>) {}
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
                    override fun visitAll(all: AllParticipants) = all.validity()

                    override fun visitStrings(strings: List<String>) = strings.size

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Participants && all == other.all && strings == other.strings
        }

        override fun hashCode(): Int = Objects.hash(all, strings)

        override fun toString(): String =
            when {
                all != null -> "Participants{all=$all}"
                strings != null -> "Participants{strings=$strings}"
                _json != null -> "Participants{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Participants")
            }

        companion object {

            @JvmStatic fun ofAll(all: AllParticipants) = Participants(all = all)

            @JvmStatic
            fun ofStrings(strings: List<String>) = Participants(strings = strings.toImmutable())
        }

        /**
         * An interface that defines how to map each variant of [Participants] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitAll(all: AllParticipants): T

            fun visitStrings(strings: List<String>): T

            /**
             * Maps an unknown variant of [Participants] to a value of type [T].
             *
             * An instance of [Participants] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws TelnyxInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw TelnyxInvalidDataException("Unknown Participants: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Participants>(Participants::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Participants {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<AllParticipants>())?.let {
                                Participants(all = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                                Participants(strings = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Participants(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Participants>(Participants::class) {

            override fun serialize(
                value: Participants,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.all != null -> generator.writeObject(value.all)
                    value.strings != null -> generator.writeObject(value.strings)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Participants")
                }
            }
        }

        class AllParticipants
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val ALL = of("all")

                @JvmStatic fun of(value: String) = AllParticipants(JsonField.of(value))
            }

            /** An enum containing [AllParticipants]'s known values. */
            enum class Known {
                ALL
            }

            /**
             * An enum containing [AllParticipants]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [AllParticipants] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ALL,
                /**
                 * An enum member indicating that [AllParticipants] was instantiated with an unknown
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
                    ALL -> Value.ALL
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
                    ALL -> Known.ALL
                    else -> throw TelnyxInvalidDataException("Unknown AllParticipants: $value")
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

            fun validate(): AllParticipants = apply {
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

                return other is AllParticipants && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ActionsParticipantsRequest &&
            exclude == other.exclude &&
            participants == other.participants &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(exclude, participants, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ActionsParticipantsRequest{exclude=$exclude, participants=$participants, additionalProperties=$additionalProperties}"
}
