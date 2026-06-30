// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.phonenumbers

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PhoneNumberRetrieveConversationWindowResponse
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
         * [PhoneNumberRetrieveConversationWindowResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PhoneNumberRetrieveConversationWindowResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            phoneNumberRetrieveConversationWindowResponse:
                PhoneNumberRetrieveConversationWindowResponse
        ) = apply {
            data = phoneNumberRetrieveConversationWindowResponse.data
            additionalProperties =
                phoneNumberRetrieveConversationWindowResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [PhoneNumberRetrieveConversationWindowResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PhoneNumberRetrieveConversationWindowResponse =
            PhoneNumberRetrieveConversationWindowResponse(data, additionalProperties.toMutableMap())
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
    fun validate(): PhoneNumberRetrieveConversationWindowResponse = apply {
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
        private val lastUserMessageAt: JsonField<OffsetDateTime>,
        private val windowActive: JsonField<Boolean>,
        private val windowExpiresAt: JsonField<OffsetDateTime>,
        private val windowType: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("last_user_message_at")
            @ExcludeMissing
            lastUserMessageAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("window_active")
            @ExcludeMissing
            windowActive: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("window_expires_at")
            @ExcludeMissing
            windowExpiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("window_type")
            @ExcludeMissing
            windowType: JsonField<String> = JsonMissing.of(),
        ) : this(lastUserMessageAt, windowActive, windowExpiresAt, windowType, mutableMapOf())

        /**
         * Timestamp of the last inbound message that opened the window
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lastUserMessageAt(): Optional<OffsetDateTime> =
            lastUserMessageAt.getOptional("last_user_message_at")

        /**
         * Whether the 24-hour conversation window is currently open
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun windowActive(): Optional<Boolean> = windowActive.getOptional("window_active")

        /**
         * When the window closes. Null if no active window.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun windowExpiresAt(): Optional<OffsetDateTime> =
            windowExpiresAt.getOptional("window_expires_at")

        /**
         * Window type. Currently always 24h when present.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun windowType(): Optional<String> = windowType.getOptional("window_type")

        /**
         * Returns the raw JSON value of [lastUserMessageAt].
         *
         * Unlike [lastUserMessageAt], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("last_user_message_at")
        @ExcludeMissing
        fun _lastUserMessageAt(): JsonField<OffsetDateTime> = lastUserMessageAt

        /**
         * Returns the raw JSON value of [windowActive].
         *
         * Unlike [windowActive], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("window_active")
        @ExcludeMissing
        fun _windowActive(): JsonField<Boolean> = windowActive

        /**
         * Returns the raw JSON value of [windowExpiresAt].
         *
         * Unlike [windowExpiresAt], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("window_expires_at")
        @ExcludeMissing
        fun _windowExpiresAt(): JsonField<OffsetDateTime> = windowExpiresAt

        /**
         * Returns the raw JSON value of [windowType].
         *
         * Unlike [windowType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("window_type")
        @ExcludeMissing
        fun _windowType(): JsonField<String> = windowType

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

            private var lastUserMessageAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var windowActive: JsonField<Boolean> = JsonMissing.of()
            private var windowExpiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var windowType: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                lastUserMessageAt = data.lastUserMessageAt
                windowActive = data.windowActive
                windowExpiresAt = data.windowExpiresAt
                windowType = data.windowType
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Timestamp of the last inbound message that opened the window */
            fun lastUserMessageAt(lastUserMessageAt: OffsetDateTime) =
                lastUserMessageAt(JsonField.of(lastUserMessageAt))

            /**
             * Sets [Builder.lastUserMessageAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastUserMessageAt] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun lastUserMessageAt(lastUserMessageAt: JsonField<OffsetDateTime>) = apply {
                this.lastUserMessageAt = lastUserMessageAt
            }

            /** Whether the 24-hour conversation window is currently open */
            fun windowActive(windowActive: Boolean) = windowActive(JsonField.of(windowActive))

            /**
             * Sets [Builder.windowActive] to an arbitrary JSON value.
             *
             * You should usually call [Builder.windowActive] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun windowActive(windowActive: JsonField<Boolean>) = apply {
                this.windowActive = windowActive
            }

            /** When the window closes. Null if no active window. */
            fun windowExpiresAt(windowExpiresAt: OffsetDateTime) =
                windowExpiresAt(JsonField.of(windowExpiresAt))

            /**
             * Sets [Builder.windowExpiresAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.windowExpiresAt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun windowExpiresAt(windowExpiresAt: JsonField<OffsetDateTime>) = apply {
                this.windowExpiresAt = windowExpiresAt
            }

            /** Window type. Currently always 24h when present. */
            fun windowType(windowType: String) = windowType(JsonField.of(windowType))

            /**
             * Sets [Builder.windowType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.windowType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun windowType(windowType: JsonField<String>) = apply { this.windowType = windowType }

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
                    lastUserMessageAt,
                    windowActive,
                    windowExpiresAt,
                    windowType,
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

            lastUserMessageAt()
            windowActive()
            windowExpiresAt()
            windowType()
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
            (if (lastUserMessageAt.asKnown().isPresent) 1 else 0) +
                (if (windowActive.asKnown().isPresent) 1 else 0) +
                (if (windowExpiresAt.asKnown().isPresent) 1 else 0) +
                (if (windowType.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                lastUserMessageAt == other.lastUserMessageAt &&
                windowActive == other.windowActive &&
                windowExpiresAt == other.windowExpiresAt &&
                windowType == other.windowType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                lastUserMessageAt,
                windowActive,
                windowExpiresAt,
                windowType,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{lastUserMessageAt=$lastUserMessageAt, windowActive=$windowActive, windowExpiresAt=$windowExpiresAt, windowType=$windowType, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PhoneNumberRetrieveConversationWindowResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PhoneNumberRetrieveConversationWindowResponse{data=$data, additionalProperties=$additionalProperties}"
}
