// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messages.rcs

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
import com.telnyx.sdk.models.messages.RcsAgentMessage
import com.telnyx.sdk.models.messages.RcsToItem
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class RcSendResponse
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

        /** Returns a mutable builder for constructing an instance of [RcSendResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RcSendResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(rcSendResponse: RcSendResponse) = apply {
            data = rcSendResponse.data
            additionalProperties = rcSendResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [RcSendResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RcSendResponse = RcSendResponse(data, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): RcSendResponse = apply {
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
        private val id: JsonField<String>,
        private val body: JsonField<RcsAgentMessage>,
        private val direction: JsonField<String>,
        private val encoding: JsonField<String>,
        private val from: JsonField<From>,
        private val messagingProfileId: JsonField<String>,
        private val organizationId: JsonField<String>,
        private val receivedAt: JsonField<OffsetDateTime>,
        private val recordType: JsonField<String>,
        private val to: JsonField<List<RcsToItem>>,
        private val type: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("body")
            @ExcludeMissing
            body: JsonField<RcsAgentMessage> = JsonMissing.of(),
            @JsonProperty("direction")
            @ExcludeMissing
            direction: JsonField<String> = JsonMissing.of(),
            @JsonProperty("encoding")
            @ExcludeMissing
            encoding: JsonField<String> = JsonMissing.of(),
            @JsonProperty("from") @ExcludeMissing from: JsonField<From> = JsonMissing.of(),
            @JsonProperty("messaging_profile_id")
            @ExcludeMissing
            messagingProfileId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("organization_id")
            @ExcludeMissing
            organizationId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("received_at")
            @ExcludeMissing
            receivedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("to") @ExcludeMissing to: JsonField<List<RcsToItem>> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            body,
            direction,
            encoding,
            from,
            messagingProfileId,
            organizationId,
            receivedAt,
            recordType,
            to,
            type,
            mutableMapOf(),
        )

        /**
         * message ID
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun body(): Optional<RcsAgentMessage> = body.getOptional("body")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun direction(): Optional<String> = direction.getOptional("direction")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun encoding(): Optional<String> = encoding.getOptional("encoding")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun from(): Optional<From> = from.getOptional("from")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun messagingProfileId(): Optional<String> =
            messagingProfileId.getOptional("messaging_profile_id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun organizationId(): Optional<String> = organizationId.getOptional("organization_id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun receivedAt(): Optional<OffsetDateTime> = receivedAt.getOptional("received_at")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordType(): Optional<String> = recordType.getOptional("record_type")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun to(): Optional<List<RcsToItem>> = to.getOptional("to")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Optional<String> = type.getOptional("type")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [body].
         *
         * Unlike [body], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("body") @ExcludeMissing fun _body(): JsonField<RcsAgentMessage> = body

        /**
         * Returns the raw JSON value of [direction].
         *
         * Unlike [direction], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("direction") @ExcludeMissing fun _direction(): JsonField<String> = direction

        /**
         * Returns the raw JSON value of [encoding].
         *
         * Unlike [encoding], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("encoding") @ExcludeMissing fun _encoding(): JsonField<String> = encoding

        /**
         * Returns the raw JSON value of [from].
         *
         * Unlike [from], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("from") @ExcludeMissing fun _from(): JsonField<From> = from

        /**
         * Returns the raw JSON value of [messagingProfileId].
         *
         * Unlike [messagingProfileId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("messaging_profile_id")
        @ExcludeMissing
        fun _messagingProfileId(): JsonField<String> = messagingProfileId

        /**
         * Returns the raw JSON value of [organizationId].
         *
         * Unlike [organizationId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("organization_id")
        @ExcludeMissing
        fun _organizationId(): JsonField<String> = organizationId

        /**
         * Returns the raw JSON value of [receivedAt].
         *
         * Unlike [receivedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("received_at")
        @ExcludeMissing
        fun _receivedAt(): JsonField<OffsetDateTime> = receivedAt

        /**
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<String> = recordType

        /**
         * Returns the raw JSON value of [to].
         *
         * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("to") @ExcludeMissing fun _to(): JsonField<List<RcsToItem>> = to

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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
            private var body: JsonField<RcsAgentMessage> = JsonMissing.of()
            private var direction: JsonField<String> = JsonMissing.of()
            private var encoding: JsonField<String> = JsonMissing.of()
            private var from: JsonField<From> = JsonMissing.of()
            private var messagingProfileId: JsonField<String> = JsonMissing.of()
            private var organizationId: JsonField<String> = JsonMissing.of()
            private var receivedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var recordType: JsonField<String> = JsonMissing.of()
            private var to: JsonField<MutableList<RcsToItem>>? = null
            private var type: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                body = data.body
                direction = data.direction
                encoding = data.encoding
                from = data.from
                messagingProfileId = data.messagingProfileId
                organizationId = data.organizationId
                receivedAt = data.receivedAt
                recordType = data.recordType
                to = data.to.map { it.toMutableList() }
                type = data.type
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** message ID */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun body(body: RcsAgentMessage) = body(JsonField.of(body))

            /**
             * Sets [Builder.body] to an arbitrary JSON value.
             *
             * You should usually call [Builder.body] with a well-typed [RcsAgentMessage] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun body(body: JsonField<RcsAgentMessage>) = apply { this.body = body }

            fun direction(direction: String) = direction(JsonField.of(direction))

            /**
             * Sets [Builder.direction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.direction] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun direction(direction: JsonField<String>) = apply { this.direction = direction }

            fun encoding(encoding: String) = encoding(JsonField.of(encoding))

            /**
             * Sets [Builder.encoding] to an arbitrary JSON value.
             *
             * You should usually call [Builder.encoding] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun encoding(encoding: JsonField<String>) = apply { this.encoding = encoding }

            fun from(from: From) = from(JsonField.of(from))

            /**
             * Sets [Builder.from] to an arbitrary JSON value.
             *
             * You should usually call [Builder.from] with a well-typed [From] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun from(from: JsonField<From>) = apply { this.from = from }

            fun messagingProfileId(messagingProfileId: String) =
                messagingProfileId(JsonField.of(messagingProfileId))

            /**
             * Sets [Builder.messagingProfileId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.messagingProfileId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun messagingProfileId(messagingProfileId: JsonField<String>) = apply {
                this.messagingProfileId = messagingProfileId
            }

            fun organizationId(organizationId: String) =
                organizationId(JsonField.of(organizationId))

            /**
             * Sets [Builder.organizationId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.organizationId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun organizationId(organizationId: JsonField<String>) = apply {
                this.organizationId = organizationId
            }

            fun receivedAt(receivedAt: OffsetDateTime) = receivedAt(JsonField.of(receivedAt))

            /**
             * Sets [Builder.receivedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.receivedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun receivedAt(receivedAt: JsonField<OffsetDateTime>) = apply {
                this.receivedAt = receivedAt
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

            fun to(to: List<RcsToItem>) = to(JsonField.of(to))

            /**
             * Sets [Builder.to] to an arbitrary JSON value.
             *
             * You should usually call [Builder.to] with a well-typed `List<RcsToItem>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun to(to: JsonField<List<RcsToItem>>) = apply {
                this.to = to.map { it.toMutableList() }
            }

            /**
             * Adds a single [RcsToItem] to [Builder.to].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTo(to: RcsToItem) = apply {
                this.to =
                    (this.to ?: JsonField.of(mutableListOf())).also { checkKnown("to", it).add(to) }
            }

            fun type(type: String) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<String>) = apply { this.type = type }

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
                    body,
                    direction,
                    encoding,
                    from,
                    messagingProfileId,
                    organizationId,
                    receivedAt,
                    recordType,
                    (to ?: JsonMissing.of()).map { it.toImmutable() },
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            id()
            body().ifPresent { it.validate() }
            direction()
            encoding()
            from().ifPresent { it.validate() }
            messagingProfileId()
            organizationId()
            receivedAt()
            recordType()
            to().ifPresent { it.forEach { it.validate() } }
            type()
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
                (body.asKnown().getOrNull()?.validity() ?: 0) +
                (if (direction.asKnown().isPresent) 1 else 0) +
                (if (encoding.asKnown().isPresent) 1 else 0) +
                (from.asKnown().getOrNull()?.validity() ?: 0) +
                (if (messagingProfileId.asKnown().isPresent) 1 else 0) +
                (if (organizationId.asKnown().isPresent) 1 else 0) +
                (if (receivedAt.asKnown().isPresent) 1 else 0) +
                (if (recordType.asKnown().isPresent) 1 else 0) +
                (to.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (type.asKnown().isPresent) 1 else 0)

        class From
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val agentId: JsonField<String>,
            private val agentName: JsonField<String>,
            private val carrier: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("agent_id")
                @ExcludeMissing
                agentId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("agent_name")
                @ExcludeMissing
                agentName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("carrier")
                @ExcludeMissing
                carrier: JsonField<String> = JsonMissing.of(),
            ) : this(agentId, agentName, carrier, mutableMapOf())

            /**
             * agent ID
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun agentId(): Optional<String> = agentId.getOptional("agent_id")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun agentName(): Optional<String> = agentName.getOptional("agent_name")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun carrier(): Optional<String> = carrier.getOptional("carrier")

            /**
             * Returns the raw JSON value of [agentId].
             *
             * Unlike [agentId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("agent_id") @ExcludeMissing fun _agentId(): JsonField<String> = agentId

            /**
             * Returns the raw JSON value of [agentName].
             *
             * Unlike [agentName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("agent_name")
            @ExcludeMissing
            fun _agentName(): JsonField<String> = agentName

            /**
             * Returns the raw JSON value of [carrier].
             *
             * Unlike [carrier], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("carrier") @ExcludeMissing fun _carrier(): JsonField<String> = carrier

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

                /** Returns a mutable builder for constructing an instance of [From]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [From]. */
            class Builder internal constructor() {

                private var agentId: JsonField<String> = JsonMissing.of()
                private var agentName: JsonField<String> = JsonMissing.of()
                private var carrier: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(from: From) = apply {
                    agentId = from.agentId
                    agentName = from.agentName
                    carrier = from.carrier
                    additionalProperties = from.additionalProperties.toMutableMap()
                }

                /** agent ID */
                fun agentId(agentId: String) = agentId(JsonField.of(agentId))

                /**
                 * Sets [Builder.agentId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.agentId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun agentId(agentId: JsonField<String>) = apply { this.agentId = agentId }

                fun agentName(agentName: String) = agentName(JsonField.of(agentName))

                /**
                 * Sets [Builder.agentName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.agentName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun agentName(agentName: JsonField<String>) = apply { this.agentName = agentName }

                fun carrier(carrier: String) = carrier(JsonField.of(carrier))

                /**
                 * Sets [Builder.carrier] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.carrier] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun carrier(carrier: JsonField<String>) = apply { this.carrier = carrier }

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
                 * Returns an immutable instance of [From].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): From =
                    From(agentId, agentName, carrier, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): From = apply {
                if (validated) {
                    return@apply
                }

                agentId()
                agentName()
                carrier()
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
                (if (agentId.asKnown().isPresent) 1 else 0) +
                    (if (agentName.asKnown().isPresent) 1 else 0) +
                    (if (carrier.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is From &&
                    agentId == other.agentId &&
                    agentName == other.agentName &&
                    carrier == other.carrier &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(agentId, agentName, carrier, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "From{agentId=$agentId, agentName=$agentName, carrier=$carrier, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                id == other.id &&
                body == other.body &&
                direction == other.direction &&
                encoding == other.encoding &&
                from == other.from &&
                messagingProfileId == other.messagingProfileId &&
                organizationId == other.organizationId &&
                receivedAt == other.receivedAt &&
                recordType == other.recordType &&
                to == other.to &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                body,
                direction,
                encoding,
                from,
                messagingProfileId,
                organizationId,
                receivedAt,
                recordType,
                to,
                type,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, body=$body, direction=$direction, encoding=$encoding, from=$from, messagingProfileId=$messagingProfileId, organizationId=$organizationId, receivedAt=$receivedAt, recordType=$recordType, to=$to, type=$type, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RcSendResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RcSendResponse{data=$data, additionalProperties=$additionalProperties}"
}
