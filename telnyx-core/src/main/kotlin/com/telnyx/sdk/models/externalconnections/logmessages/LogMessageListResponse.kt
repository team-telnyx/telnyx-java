// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.externalconnections.logmessages

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class LogMessageListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val code: JsonField<String>,
    private val title: JsonField<String>,
    private val detail: JsonField<String>,
    private val meta: JsonField<Meta>,
    private val source: JsonField<Source>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
        @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
        @JsonProperty("detail") @ExcludeMissing detail: JsonField<String> = JsonMissing.of(),
        @JsonProperty("meta") @ExcludeMissing meta: JsonField<Meta> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<Source> = JsonMissing.of(),
    ) : this(code, title, detail, meta, source, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun code(): String = code.getRequired("code")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun title(): String = title.getRequired("title")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun detail(): Optional<String> = detail.getOptional("detail")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun meta(): Optional<Meta> = meta.getOptional("meta")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun source(): Optional<Source> = source.getOptional("source")

    /**
     * Returns the raw JSON value of [code].
     *
     * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

    /**
     * Returns the raw JSON value of [title].
     *
     * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

    /**
     * Returns the raw JSON value of [detail].
     *
     * Unlike [detail], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("detail") @ExcludeMissing fun _detail(): JsonField<String> = detail

    /**
     * Returns the raw JSON value of [meta].
     *
     * Unlike [meta], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("meta") @ExcludeMissing fun _meta(): JsonField<Meta> = meta

    /**
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<Source> = source

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
         * Returns a mutable builder for constructing an instance of [LogMessageListResponse].
         *
         * The following fields are required:
         * ```java
         * .code()
         * .title()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LogMessageListResponse]. */
    class Builder internal constructor() {

        private var code: JsonField<String>? = null
        private var title: JsonField<String>? = null
        private var detail: JsonField<String> = JsonMissing.of()
        private var meta: JsonField<Meta> = JsonMissing.of()
        private var source: JsonField<Source> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(logMessageListResponse: LogMessageListResponse) = apply {
            code = logMessageListResponse.code
            title = logMessageListResponse.title
            detail = logMessageListResponse.detail
            meta = logMessageListResponse.meta
            source = logMessageListResponse.source
            additionalProperties = logMessageListResponse.additionalProperties.toMutableMap()
        }

        fun code(code: String) = code(JsonField.of(code))

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<String>) = apply { this.code = code }

        fun title(title: String) = title(JsonField.of(title))

        /**
         * Sets [Builder.title] to an arbitrary JSON value.
         *
         * You should usually call [Builder.title] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun title(title: JsonField<String>) = apply { this.title = title }

        fun detail(detail: String) = detail(JsonField.of(detail))

        /**
         * Sets [Builder.detail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.detail] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun detail(detail: JsonField<String>) = apply { this.detail = detail }

        fun meta(meta: Meta) = meta(JsonField.of(meta))

        /**
         * Sets [Builder.meta] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meta] with a well-typed [Meta] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun meta(meta: JsonField<Meta>) = apply { this.meta = meta }

        fun source(source: Source) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [Source] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun source(source: JsonField<Source>) = apply { this.source = source }

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
         * Returns an immutable instance of [LogMessageListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .code()
         * .title()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LogMessageListResponse =
            LogMessageListResponse(
                checkRequired("code", code),
                checkRequired("title", title),
                detail,
                meta,
                source,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): LogMessageListResponse = apply {
        if (validated) {
            return@apply
        }

        code()
        title()
        detail()
        meta().ifPresent { it.validate() }
        source().ifPresent { it.validate() }
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
        (if (code.asKnown().isPresent) 1 else 0) +
            (if (title.asKnown().isPresent) 1 else 0) +
            (if (detail.asKnown().isPresent) 1 else 0) +
            (meta.asKnown().getOrNull()?.validity() ?: 0) +
            (source.asKnown().getOrNull()?.validity() ?: 0)

    class Meta
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val externalConnectionId: JsonField<String>,
        private val telephoneNumber: JsonField<String>,
        private val ticketId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("external_connection_id")
            @ExcludeMissing
            externalConnectionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("telephone_number")
            @ExcludeMissing
            telephoneNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ticket_id")
            @ExcludeMissing
            ticketId: JsonField<String> = JsonMissing.of(),
        ) : this(externalConnectionId, telephoneNumber, ticketId, mutableMapOf())

        /**
         * The external connection the log message is associated with, if any.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun externalConnectionId(): Optional<String> =
            externalConnectionId.getOptional("external_connection_id")

        /**
         * The telephone number the log message is associated with, if any.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun telephoneNumber(): Optional<String> = telephoneNumber.getOptional("telephone_number")

        /**
         * The ticket ID for an operation that generated the log message, if any.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun ticketId(): Optional<String> = ticketId.getOptional("ticket_id")

        /**
         * Returns the raw JSON value of [externalConnectionId].
         *
         * Unlike [externalConnectionId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("external_connection_id")
        @ExcludeMissing
        fun _externalConnectionId(): JsonField<String> = externalConnectionId

        /**
         * Returns the raw JSON value of [telephoneNumber].
         *
         * Unlike [telephoneNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("telephone_number")
        @ExcludeMissing
        fun _telephoneNumber(): JsonField<String> = telephoneNumber

        /**
         * Returns the raw JSON value of [ticketId].
         *
         * Unlike [ticketId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ticket_id") @ExcludeMissing fun _ticketId(): JsonField<String> = ticketId

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

            /** Returns a mutable builder for constructing an instance of [Meta]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Meta]. */
        class Builder internal constructor() {

            private var externalConnectionId: JsonField<String> = JsonMissing.of()
            private var telephoneNumber: JsonField<String> = JsonMissing.of()
            private var ticketId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(meta: Meta) = apply {
                externalConnectionId = meta.externalConnectionId
                telephoneNumber = meta.telephoneNumber
                ticketId = meta.ticketId
                additionalProperties = meta.additionalProperties.toMutableMap()
            }

            /** The external connection the log message is associated with, if any. */
            fun externalConnectionId(externalConnectionId: String) =
                externalConnectionId(JsonField.of(externalConnectionId))

            /**
             * Sets [Builder.externalConnectionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalConnectionId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun externalConnectionId(externalConnectionId: JsonField<String>) = apply {
                this.externalConnectionId = externalConnectionId
            }

            /** The telephone number the log message is associated with, if any. */
            fun telephoneNumber(telephoneNumber: String) =
                telephoneNumber(JsonField.of(telephoneNumber))

            /**
             * Sets [Builder.telephoneNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.telephoneNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun telephoneNumber(telephoneNumber: JsonField<String>) = apply {
                this.telephoneNumber = telephoneNumber
            }

            /** The ticket ID for an operation that generated the log message, if any. */
            fun ticketId(ticketId: String) = ticketId(JsonField.of(ticketId))

            /**
             * Sets [Builder.ticketId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ticketId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ticketId(ticketId: JsonField<String>) = apply { this.ticketId = ticketId }

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
             * Returns an immutable instance of [Meta].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Meta =
                Meta(
                    externalConnectionId,
                    telephoneNumber,
                    ticketId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Meta = apply {
            if (validated) {
                return@apply
            }

            externalConnectionId()
            telephoneNumber()
            ticketId()
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
            (if (externalConnectionId.asKnown().isPresent) 1 else 0) +
                (if (telephoneNumber.asKnown().isPresent) 1 else 0) +
                (if (ticketId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Meta &&
                externalConnectionId == other.externalConnectionId &&
                telephoneNumber == other.telephoneNumber &&
                ticketId == other.ticketId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(externalConnectionId, telephoneNumber, ticketId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Meta{externalConnectionId=$externalConnectionId, telephoneNumber=$telephoneNumber, ticketId=$ticketId, additionalProperties=$additionalProperties}"
    }

    class Source
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val pointer: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("pointer") @ExcludeMissing pointer: JsonField<String> = JsonMissing.of()
        ) : this(pointer, mutableMapOf())

        /**
         * JSON pointer (RFC6901) to the offending entity.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pointer(): Optional<String> = pointer.getOptional("pointer")

        /**
         * Returns the raw JSON value of [pointer].
         *
         * Unlike [pointer], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pointer") @ExcludeMissing fun _pointer(): JsonField<String> = pointer

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

            /** Returns a mutable builder for constructing an instance of [Source]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Source]. */
        class Builder internal constructor() {

            private var pointer: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(source: Source) = apply {
                pointer = source.pointer
                additionalProperties = source.additionalProperties.toMutableMap()
            }

            /** JSON pointer (RFC6901) to the offending entity. */
            fun pointer(pointer: String) = pointer(JsonField.of(pointer))

            /**
             * Sets [Builder.pointer] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pointer] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pointer(pointer: JsonField<String>) = apply { this.pointer = pointer }

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
             * Returns an immutable instance of [Source].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Source = Source(pointer, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Source = apply {
            if (validated) {
                return@apply
            }

            pointer()
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
        @JvmSynthetic internal fun validity(): Int = (if (pointer.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Source &&
                pointer == other.pointer &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(pointer, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Source{pointer=$pointer, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LogMessageListResponse &&
            code == other.code &&
            title == other.title &&
            detail == other.detail &&
            meta == other.meta &&
            source == other.source &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(code, title, detail, meta, source, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LogMessageListResponse{code=$code, title=$title, detail=$detail, meta=$meta, source=$source, additionalProperties=$additionalProperties}"
}
