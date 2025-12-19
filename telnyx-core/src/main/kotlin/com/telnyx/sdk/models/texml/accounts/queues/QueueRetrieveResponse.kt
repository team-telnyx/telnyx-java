// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts.queues

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class QueueRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val accountSid: JsonField<String>,
    private val averageWaitTime: JsonField<Long>,
    private val currentSize: JsonField<Long>,
    private val dateCreated: JsonField<String>,
    private val dateUpdated: JsonField<String>,
    private val maxSize: JsonField<Long>,
    private val sid: JsonField<String>,
    private val subresourceUris: JsonField<SubresourceUris>,
    private val uri: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("account_sid")
        @ExcludeMissing
        accountSid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("average_wait_time")
        @ExcludeMissing
        averageWaitTime: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("current_size")
        @ExcludeMissing
        currentSize: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("date_created")
        @ExcludeMissing
        dateCreated: JsonField<String> = JsonMissing.of(),
        @JsonProperty("date_updated")
        @ExcludeMissing
        dateUpdated: JsonField<String> = JsonMissing.of(),
        @JsonProperty("max_size") @ExcludeMissing maxSize: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("sid") @ExcludeMissing sid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("subresource_uris")
        @ExcludeMissing
        subresourceUris: JsonField<SubresourceUris> = JsonMissing.of(),
        @JsonProperty("uri") @ExcludeMissing uri: JsonField<String> = JsonMissing.of(),
    ) : this(
        accountSid,
        averageWaitTime,
        currentSize,
        dateCreated,
        dateUpdated,
        maxSize,
        sid,
        subresourceUris,
        uri,
        mutableMapOf(),
    )

    /**
     * The id of the account the resource belongs to.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountSid(): Optional<String> = accountSid.getOptional("account_sid")

    /**
     * The average wait time in seconds for members in the queue.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun averageWaitTime(): Optional<Long> = averageWaitTime.getOptional("average_wait_time")

    /**
     * The current number of members in the queue.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currentSize(): Optional<Long> = currentSize.getOptional("current_size")

    /**
     * The timestamp of when the resource was created.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dateCreated(): Optional<String> = dateCreated.getOptional("date_created")

    /**
     * The timestamp of when the resource was last updated.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dateUpdated(): Optional<String> = dateUpdated.getOptional("date_updated")

    /**
     * The maximum size of the queue.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxSize(): Optional<Long> = maxSize.getOptional("max_size")

    /**
     * The unique identifier of the queue.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sid(): Optional<String> = sid.getOptional("sid")

    /**
     * A list of related resources identified by their relative URIs.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subresourceUris(): Optional<SubresourceUris> =
        subresourceUris.getOptional("subresource_uris")

    /**
     * The relative URI for this queue.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun uri(): Optional<String> = uri.getOptional("uri")

    /**
     * Returns the raw JSON value of [accountSid].
     *
     * Unlike [accountSid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_sid") @ExcludeMissing fun _accountSid(): JsonField<String> = accountSid

    /**
     * Returns the raw JSON value of [averageWaitTime].
     *
     * Unlike [averageWaitTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("average_wait_time")
    @ExcludeMissing
    fun _averageWaitTime(): JsonField<Long> = averageWaitTime

    /**
     * Returns the raw JSON value of [currentSize].
     *
     * Unlike [currentSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("current_size") @ExcludeMissing fun _currentSize(): JsonField<Long> = currentSize

    /**
     * Returns the raw JSON value of [dateCreated].
     *
     * Unlike [dateCreated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("date_created")
    @ExcludeMissing
    fun _dateCreated(): JsonField<String> = dateCreated

    /**
     * Returns the raw JSON value of [dateUpdated].
     *
     * Unlike [dateUpdated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("date_updated")
    @ExcludeMissing
    fun _dateUpdated(): JsonField<String> = dateUpdated

    /**
     * Returns the raw JSON value of [maxSize].
     *
     * Unlike [maxSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("max_size") @ExcludeMissing fun _maxSize(): JsonField<Long> = maxSize

    /**
     * Returns the raw JSON value of [sid].
     *
     * Unlike [sid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sid") @ExcludeMissing fun _sid(): JsonField<String> = sid

    /**
     * Returns the raw JSON value of [subresourceUris].
     *
     * Unlike [subresourceUris], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subresource_uris")
    @ExcludeMissing
    fun _subresourceUris(): JsonField<SubresourceUris> = subresourceUris

    /**
     * Returns the raw JSON value of [uri].
     *
     * Unlike [uri], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("uri") @ExcludeMissing fun _uri(): JsonField<String> = uri

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

        /** Returns a mutable builder for constructing an instance of [QueueRetrieveResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [QueueRetrieveResponse]. */
    class Builder internal constructor() {

        private var accountSid: JsonField<String> = JsonMissing.of()
        private var averageWaitTime: JsonField<Long> = JsonMissing.of()
        private var currentSize: JsonField<Long> = JsonMissing.of()
        private var dateCreated: JsonField<String> = JsonMissing.of()
        private var dateUpdated: JsonField<String> = JsonMissing.of()
        private var maxSize: JsonField<Long> = JsonMissing.of()
        private var sid: JsonField<String> = JsonMissing.of()
        private var subresourceUris: JsonField<SubresourceUris> = JsonMissing.of()
        private var uri: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(queueRetrieveResponse: QueueRetrieveResponse) = apply {
            accountSid = queueRetrieveResponse.accountSid
            averageWaitTime = queueRetrieveResponse.averageWaitTime
            currentSize = queueRetrieveResponse.currentSize
            dateCreated = queueRetrieveResponse.dateCreated
            dateUpdated = queueRetrieveResponse.dateUpdated
            maxSize = queueRetrieveResponse.maxSize
            sid = queueRetrieveResponse.sid
            subresourceUris = queueRetrieveResponse.subresourceUris
            uri = queueRetrieveResponse.uri
            additionalProperties = queueRetrieveResponse.additionalProperties.toMutableMap()
        }

        /** The id of the account the resource belongs to. */
        fun accountSid(accountSid: String) = accountSid(JsonField.of(accountSid))

        /**
         * Sets [Builder.accountSid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountSid] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountSid(accountSid: JsonField<String>) = apply { this.accountSid = accountSid }

        /** The average wait time in seconds for members in the queue. */
        fun averageWaitTime(averageWaitTime: Long) = averageWaitTime(JsonField.of(averageWaitTime))

        /**
         * Sets [Builder.averageWaitTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.averageWaitTime] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun averageWaitTime(averageWaitTime: JsonField<Long>) = apply {
            this.averageWaitTime = averageWaitTime
        }

        /** The current number of members in the queue. */
        fun currentSize(currentSize: Long) = currentSize(JsonField.of(currentSize))

        /**
         * Sets [Builder.currentSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currentSize] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currentSize(currentSize: JsonField<Long>) = apply { this.currentSize = currentSize }

        /** The timestamp of when the resource was created. */
        fun dateCreated(dateCreated: String) = dateCreated(JsonField.of(dateCreated))

        /**
         * Sets [Builder.dateCreated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateCreated] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dateCreated(dateCreated: JsonField<String>) = apply { this.dateCreated = dateCreated }

        /** The timestamp of when the resource was last updated. */
        fun dateUpdated(dateUpdated: String) = dateUpdated(JsonField.of(dateUpdated))

        /**
         * Sets [Builder.dateUpdated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateUpdated] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dateUpdated(dateUpdated: JsonField<String>) = apply { this.dateUpdated = dateUpdated }

        /** The maximum size of the queue. */
        fun maxSize(maxSize: Long) = maxSize(JsonField.of(maxSize))

        /**
         * Sets [Builder.maxSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxSize] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun maxSize(maxSize: JsonField<Long>) = apply { this.maxSize = maxSize }

        /** The unique identifier of the queue. */
        fun sid(sid: String) = sid(JsonField.of(sid))

        /**
         * Sets [Builder.sid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sid] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sid(sid: JsonField<String>) = apply { this.sid = sid }

        /** A list of related resources identified by their relative URIs. */
        fun subresourceUris(subresourceUris: SubresourceUris) =
            subresourceUris(JsonField.of(subresourceUris))

        /**
         * Sets [Builder.subresourceUris] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subresourceUris] with a well-typed [SubresourceUris]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun subresourceUris(subresourceUris: JsonField<SubresourceUris>) = apply {
            this.subresourceUris = subresourceUris
        }

        /** The relative URI for this queue. */
        fun uri(uri: String) = uri(JsonField.of(uri))

        /**
         * Sets [Builder.uri] to an arbitrary JSON value.
         *
         * You should usually call [Builder.uri] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun uri(uri: JsonField<String>) = apply { this.uri = uri }

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
         * Returns an immutable instance of [QueueRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): QueueRetrieveResponse =
            QueueRetrieveResponse(
                accountSid,
                averageWaitTime,
                currentSize,
                dateCreated,
                dateUpdated,
                maxSize,
                sid,
                subresourceUris,
                uri,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): QueueRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        accountSid()
        averageWaitTime()
        currentSize()
        dateCreated()
        dateUpdated()
        maxSize()
        sid()
        subresourceUris().ifPresent { it.validate() }
        uri()
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
        (if (accountSid.asKnown().isPresent) 1 else 0) +
            (if (averageWaitTime.asKnown().isPresent) 1 else 0) +
            (if (currentSize.asKnown().isPresent) 1 else 0) +
            (if (dateCreated.asKnown().isPresent) 1 else 0) +
            (if (dateUpdated.asKnown().isPresent) 1 else 0) +
            (if (maxSize.asKnown().isPresent) 1 else 0) +
            (if (sid.asKnown().isPresent) 1 else 0) +
            (subresourceUris.asKnown().getOrNull()?.validity() ?: 0) +
            (if (uri.asKnown().isPresent) 1 else 0)

    /** A list of related resources identified by their relative URIs. */
    class SubresourceUris
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [SubresourceUris]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SubresourceUris]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(subresourceUris: SubresourceUris) = apply {
                additionalProperties = subresourceUris.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [SubresourceUris].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): SubresourceUris = SubresourceUris(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): SubresourceUris = apply {
            if (validated) {
                return@apply
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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SubresourceUris && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "SubresourceUris{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is QueueRetrieveResponse &&
            accountSid == other.accountSid &&
            averageWaitTime == other.averageWaitTime &&
            currentSize == other.currentSize &&
            dateCreated == other.dateCreated &&
            dateUpdated == other.dateUpdated &&
            maxSize == other.maxSize &&
            sid == other.sid &&
            subresourceUris == other.subresourceUris &&
            uri == other.uri &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            accountSid,
            averageWaitTime,
            currentSize,
            dateCreated,
            dateUpdated,
            maxSize,
            sid,
            subresourceUris,
            uri,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "QueueRetrieveResponse{accountSid=$accountSid, averageWaitTime=$averageWaitTime, currentSize=$currentSize, dateCreated=$dateCreated, dateUpdated=$dateUpdated, maxSize=$maxSize, sid=$sid, subresourceUris=$subresourceUris, uri=$uri, additionalProperties=$additionalProperties}"
}
