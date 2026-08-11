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
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Updates the conversational components configured for the specified WhatsApp phone number. */
class ConversationalComponentPatchAllParams
private constructor(
    private val phoneNumber: String?,
    private val body: Body,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun phoneNumber(): Optional<String> = Optional.ofNullable(phoneNumber)

    /**
     * List of commands
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun commands(): Optional<List<Command>> = body.commands()

    /**
     * List of ice breakers
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun iceBreakers(): Optional<List<String>> = body.iceBreakers()

    /**
     * Returns the raw JSON value of [commands].
     *
     * Unlike [commands], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _commands(): JsonField<List<Command>> = body._commands()

    /**
     * Returns the raw JSON value of [iceBreakers].
     *
     * Unlike [iceBreakers], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _iceBreakers(): JsonField<List<String>> = body._iceBreakers()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ConversationalComponentPatchAllParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [ConversationalComponentPatchAllParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ConversationalComponentPatchAllParams]. */
    class Builder internal constructor() {

        private var phoneNumber: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            conversationalComponentPatchAllParams: ConversationalComponentPatchAllParams
        ) = apply {
            phoneNumber = conversationalComponentPatchAllParams.phoneNumber
            body = conversationalComponentPatchAllParams.body.toBuilder()
            additionalHeaders = conversationalComponentPatchAllParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                conversationalComponentPatchAllParams.additionalQueryParams.toBuilder()
        }

        fun phoneNumber(phoneNumber: String?) = apply { this.phoneNumber = phoneNumber }

        /** Alias for calling [Builder.phoneNumber] with `phoneNumber.orElse(null)`. */
        fun phoneNumber(phoneNumber: Optional<String>) = phoneNumber(phoneNumber.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [commands]
         * - [iceBreakers]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** List of commands */
        fun commands(commands: List<Command>) = apply { body.commands(commands) }

        /**
         * Sets [Builder.commands] to an arbitrary JSON value.
         *
         * You should usually call [Builder.commands] with a well-typed `List<Command>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun commands(commands: JsonField<List<Command>>) = apply { body.commands(commands) }

        /**
         * Adds a single [Command] to [commands].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCommand(command: Command) = apply { body.addCommand(command) }

        /** List of ice breakers */
        fun iceBreakers(iceBreakers: List<String>) = apply { body.iceBreakers(iceBreakers) }

        /**
         * Sets [Builder.iceBreakers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.iceBreakers] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun iceBreakers(iceBreakers: JsonField<List<String>>) = apply {
            body.iceBreakers(iceBreakers)
        }

        /**
         * Adds a single [String] to [iceBreakers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addIceBreaker(iceBreaker: String) = apply { body.addIceBreaker(iceBreaker) }

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

        fun additionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) = apply {
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

        fun putAllAdditionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) = apply {
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

        fun replaceAllAdditionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) =
            apply {
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
         * Returns an immutable instance of [ConversationalComponentPatchAllParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ConversationalComponentPatchAllParams =
            ConversationalComponentPatchAllParams(
                phoneNumber,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> phoneNumber ?: ""
            else -> ""
        }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val commands: JsonField<List<Command>>,
        private val iceBreakers: JsonField<List<String>>,
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
        ) : this(commands, iceBreakers, mutableMapOf())

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

            private var commands: JsonField<MutableList<Command>>? = null
            private var iceBreakers: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                commands = body.commands.map { it.toMutableList() }
                iceBreakers = body.iceBreakers.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
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
                    (commands ?: JsonMissing.of()).map { it.toImmutable() },
                    (iceBreakers ?: JsonMissing.of()).map { it.toImmutable() },
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

            commands().ifPresent { it.forEach { it.validate() } }
            iceBreakers()
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
                (iceBreakers.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                commands == other.commands &&
                iceBreakers == other.iceBreakers &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(commands, iceBreakers, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{commands=$commands, iceBreakers=$iceBreakers, additionalProperties=$additionalProperties}"
    }

    class Command
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val command: JsonField<String>,
        private val description: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("command") @ExcludeMissing command: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
        ) : this(command, description, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun command(): Optional<String> = command.getOptional("command")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
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
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
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
             * You should usually call [Builder.command] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun command(command: JsonField<String>) = apply { this.command = command }

            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

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
         * This method is _not_ forwards compatible with new types from the API for existing fields.
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

        return other is ConversationalComponentPatchAllParams &&
            phoneNumber == other.phoneNumber &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(phoneNumber, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ConversationalComponentPatchAllParams{phoneNumber=$phoneNumber, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
