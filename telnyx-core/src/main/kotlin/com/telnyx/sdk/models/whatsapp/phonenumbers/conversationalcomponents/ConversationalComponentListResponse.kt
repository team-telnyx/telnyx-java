// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.phonenumbers.conversationalcomponents

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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

class ConversationalComponentListResponse
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
         * [ConversationalComponentListResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ConversationalComponentListResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            conversationalComponentListResponse: ConversationalComponentListResponse
        ) = apply {
            data = conversationalComponentListResponse.data
            additionalProperties =
                conversationalComponentListResponse.additionalProperties.toMutableMap()
        }

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
         * Returns an immutable instance of [ConversationalComponentListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ConversationalComponentListResponse =
            ConversationalComponentListResponse(data, additionalProperties.toMutableMap())
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
    fun validate(): ConversationalComponentListResponse = apply {
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

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val commands: JsonField<List<Command>>,
        private val iceBreakers: JsonField<List<String>>,
        private val phoneNumber: JsonField<String>,
        private val recordType: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("commands")
            @ExcludeMissing
            commands: JsonField<List<Command>> = JsonMissing.of(),
            @JsonProperty("ice_breakers")
            @ExcludeMissing
            iceBreakers: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("phone_number")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<String> = JsonMissing.of(),
        ) : this(commands, iceBreakers, phoneNumber, recordType, mutableMapOf())

        /**
         * List of commands
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun commands(): Optional<List<Command>> = commands.getOptional("commands")

        /**
         * List of ice breakers
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun iceBreakers(): Optional<List<String>> = iceBreakers.getOptional("ice_breakers")

        /**
         * Phone number in E164 format
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phone_number")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordType(): Optional<String> = recordType.getOptional("record_type")

        /**
         * Returns the raw JSON value of [commands].
         *
         * Unlike [commands], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("commands")
        @ExcludeMissing
        fun _commands(): JsonField<List<Command>> = commands

        /**
         * Returns the raw JSON value of [iceBreakers].
         *
         * Unlike [iceBreakers], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ice_breakers")
        @ExcludeMissing
        fun _iceBreakers(): JsonField<List<String>> = iceBreakers

        /**
         * Returns the raw JSON value of [phoneNumber].
         *
         * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phone_number")
        @ExcludeMissing
        fun _phoneNumber(): JsonField<String> = phoneNumber

        /**
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<String> = recordType

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

            private var commands: JsonField<MutableList<Command>>? = null
            private var iceBreakers: JsonField<MutableList<String>>? = null
            private var phoneNumber: JsonField<String> = JsonMissing.of()
            private var recordType: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                commands = data.commands.map { it.toMutableList() }
                iceBreakers = data.iceBreakers.map { it.toMutableList() }
                phoneNumber = data.phoneNumber
                recordType = data.recordType
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** List of commands */
            fun commands(commands: List<Command>) = commands(JsonField.of(commands))

            /**
             * Sets [Builder.commands] to an arbitrary JSON value.
             *
             * You should usually call [Builder.commands] with a well-typed `List<Command>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun commands(commands: JsonField<List<Command>>) = apply {
                this.commands = commands.map { it.toMutableList() }
            }

            /**
             * Adds a single [Command] to [commands].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCommand(command: Command) = apply {
                commands =
                    (commands ?: JsonField.of(mutableListOf())).also {
                        checkKnown("commands", it).add(command)
                    }
            }

            /** List of ice breakers */
            fun iceBreakers(iceBreakers: List<String>) = iceBreakers(JsonField.of(iceBreakers))

            /**
             * Sets [Builder.iceBreakers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.iceBreakers] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun iceBreakers(iceBreakers: JsonField<List<String>>) = apply {
                this.iceBreakers = iceBreakers.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [iceBreakers].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addIceBreaker(iceBreaker: String) = apply {
                iceBreakers =
                    (iceBreakers ?: JsonField.of(mutableListOf())).also {
                        checkKnown("iceBreakers", it).add(iceBreaker)
                    }
            }

            /** Phone number in E164 format */
            fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

            /**
             * Sets [Builder.phoneNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                this.phoneNumber = phoneNumber
            }

            fun recordType(recordType: String) = recordType(JsonField.of(recordType))

            /**
             * Sets [Builder.recordType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

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
                    (commands ?: JsonMissing.of()).map { it.toImmutable() },
                    (iceBreakers ?: JsonMissing.of()).map { it.toImmutable() },
                    phoneNumber,
                    recordType,
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
        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            commands().ifPresent { it.forEach { it.validate() } }
            iceBreakers()
            phoneNumber()
            recordType()
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
            (commands.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (iceBreakers.asKnown().getOrNull()?.size ?: 0) +
                (if (phoneNumber.asKnown().isPresent) 1 else 0) +
                (if (recordType.asKnown().isPresent) 1 else 0)

        class Command
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val command: JsonField<String>,
            private val description: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("command")
                @ExcludeMissing
                command: JsonField<String> = JsonMissing.of(),
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of(),
            ) : this(command, description, mutableMapOf())

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun command(): Optional<String> = command.getOptional("command")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun description(): Optional<String> = description.getOptional("description")

            /**
             * Returns the raw JSON value of [command].
             *
             * Unlike [command], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("command") @ExcludeMissing fun _command(): JsonField<String> = command

            /**
             * Returns the raw JSON value of [description].
             *
             * Unlike [description], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

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

                /** Returns a mutable builder for constructing an instance of [Command]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Command]. */
            class Builder internal constructor() {

                private var command: JsonField<String> = JsonMissing.of()
                private var description: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(command: Command) = apply {
                    this.command = command.command
                    description = command.description
                    additionalProperties = command.additionalProperties.toMutableMap()
                }

                fun command(command: String) = command(JsonField.of(command))

                /**
                 * Sets [Builder.command] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.command] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun command(command: JsonField<String>) = apply { this.command = command }

                fun description(description: String) = description(JsonField.of(description))

                /**
                 * Sets [Builder.description] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.description] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun description(description: JsonField<String>) = apply {
                    this.description = description
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
                 * Returns an immutable instance of [Command].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Command =
                    Command(command, description, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Command = apply {
                if (validated) {
                    return@apply
                }

                command()
                description()
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
                (if (command.asKnown().isPresent) 1 else 0) +
                    (if (description.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Command &&
                    command == other.command &&
                    description == other.description &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(command, description, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Command{command=$command, description=$description, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                commands == other.commands &&
                iceBreakers == other.iceBreakers &&
                phoneNumber == other.phoneNumber &&
                recordType == other.recordType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(commands, iceBreakers, phoneNumber, recordType, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{commands=$commands, iceBreakers=$iceBreakers, phoneNumber=$phoneNumber, recordType=$recordType, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ConversationalComponentListResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ConversationalComponentListResponse{data=$data, additionalProperties=$additionalProperties}"
}
