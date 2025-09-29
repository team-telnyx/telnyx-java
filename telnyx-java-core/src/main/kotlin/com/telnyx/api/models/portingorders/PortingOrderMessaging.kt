// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.portingorders

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.Enum
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Information about messaging porting process. */
class PortingOrderMessaging
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val enableMessaging: JsonField<Boolean>,
    private val messagingCapable: JsonField<Boolean>,
    private val messagingPortCompleted: JsonField<Boolean>,
    private val messagingPortStatus: JsonField<MessagingPortStatus>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("enable_messaging")
        @ExcludeMissing
        enableMessaging: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("messaging_capable")
        @ExcludeMissing
        messagingCapable: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("messaging_port_completed")
        @ExcludeMissing
        messagingPortCompleted: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("messaging_port_status")
        @ExcludeMissing
        messagingPortStatus: JsonField<MessagingPortStatus> = JsonMissing.of(),
    ) : this(
        enableMessaging,
        messagingCapable,
        messagingPortCompleted,
        messagingPortStatus,
        mutableMapOf(),
    )

    /**
     * Indicates whether Telnyx will port messaging capabilities from the losing carrier. If false,
     * any messaging capabilities will stay with their current provider.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enableMessaging(): Optional<Boolean> = enableMessaging.getOptional("enable_messaging")

    /**
     * Indicates whether the porting order can also port messaging capabilities.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun messagingCapable(): Optional<Boolean> = messagingCapable.getOptional("messaging_capable")

    /**
     * Indicates whether the messaging porting has been completed.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun messagingPortCompleted(): Optional<Boolean> =
        messagingPortCompleted.getOptional("messaging_port_completed")

    /**
     * The current status of the messaging porting.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun messagingPortStatus(): Optional<MessagingPortStatus> =
        messagingPortStatus.getOptional("messaging_port_status")

    /**
     * Returns the raw JSON value of [enableMessaging].
     *
     * Unlike [enableMessaging], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("enable_messaging")
    @ExcludeMissing
    fun _enableMessaging(): JsonField<Boolean> = enableMessaging

    /**
     * Returns the raw JSON value of [messagingCapable].
     *
     * Unlike [messagingCapable], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("messaging_capable")
    @ExcludeMissing
    fun _messagingCapable(): JsonField<Boolean> = messagingCapable

    /**
     * Returns the raw JSON value of [messagingPortCompleted].
     *
     * Unlike [messagingPortCompleted], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("messaging_port_completed")
    @ExcludeMissing
    fun _messagingPortCompleted(): JsonField<Boolean> = messagingPortCompleted

    /**
     * Returns the raw JSON value of [messagingPortStatus].
     *
     * Unlike [messagingPortStatus], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("messaging_port_status")
    @ExcludeMissing
    fun _messagingPortStatus(): JsonField<MessagingPortStatus> = messagingPortStatus

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

        /** Returns a mutable builder for constructing an instance of [PortingOrderMessaging]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PortingOrderMessaging]. */
    class Builder internal constructor() {

        private var enableMessaging: JsonField<Boolean> = JsonMissing.of()
        private var messagingCapable: JsonField<Boolean> = JsonMissing.of()
        private var messagingPortCompleted: JsonField<Boolean> = JsonMissing.of()
        private var messagingPortStatus: JsonField<MessagingPortStatus> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(portingOrderMessaging: PortingOrderMessaging) = apply {
            enableMessaging = portingOrderMessaging.enableMessaging
            messagingCapable = portingOrderMessaging.messagingCapable
            messagingPortCompleted = portingOrderMessaging.messagingPortCompleted
            messagingPortStatus = portingOrderMessaging.messagingPortStatus
            additionalProperties = portingOrderMessaging.additionalProperties.toMutableMap()
        }

        /**
         * Indicates whether Telnyx will port messaging capabilities from the losing carrier. If
         * false, any messaging capabilities will stay with their current provider.
         */
        fun enableMessaging(enableMessaging: Boolean) =
            enableMessaging(JsonField.of(enableMessaging))

        /**
         * Sets [Builder.enableMessaging] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enableMessaging] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun enableMessaging(enableMessaging: JsonField<Boolean>) = apply {
            this.enableMessaging = enableMessaging
        }

        /** Indicates whether the porting order can also port messaging capabilities. */
        fun messagingCapable(messagingCapable: Boolean) =
            messagingCapable(JsonField.of(messagingCapable))

        /**
         * Sets [Builder.messagingCapable] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messagingCapable] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun messagingCapable(messagingCapable: JsonField<Boolean>) = apply {
            this.messagingCapable = messagingCapable
        }

        /** Indicates whether the messaging porting has been completed. */
        fun messagingPortCompleted(messagingPortCompleted: Boolean) =
            messagingPortCompleted(JsonField.of(messagingPortCompleted))

        /**
         * Sets [Builder.messagingPortCompleted] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messagingPortCompleted] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun messagingPortCompleted(messagingPortCompleted: JsonField<Boolean>) = apply {
            this.messagingPortCompleted = messagingPortCompleted
        }

        /** The current status of the messaging porting. */
        fun messagingPortStatus(messagingPortStatus: MessagingPortStatus) =
            messagingPortStatus(JsonField.of(messagingPortStatus))

        /**
         * Sets [Builder.messagingPortStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messagingPortStatus] with a well-typed
         * [MessagingPortStatus] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun messagingPortStatus(messagingPortStatus: JsonField<MessagingPortStatus>) = apply {
            this.messagingPortStatus = messagingPortStatus
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
         * Returns an immutable instance of [PortingOrderMessaging].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PortingOrderMessaging =
            PortingOrderMessaging(
                enableMessaging,
                messagingCapable,
                messagingPortCompleted,
                messagingPortStatus,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PortingOrderMessaging = apply {
        if (validated) {
            return@apply
        }

        enableMessaging()
        messagingCapable()
        messagingPortCompleted()
        messagingPortStatus().ifPresent { it.validate() }
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
        (if (enableMessaging.asKnown().isPresent) 1 else 0) +
            (if (messagingCapable.asKnown().isPresent) 1 else 0) +
            (if (messagingPortCompleted.asKnown().isPresent) 1 else 0) +
            (messagingPortStatus.asKnown().getOrNull()?.validity() ?: 0)

    /** The current status of the messaging porting. */
    class MessagingPortStatus
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val NOT_APPLICABLE = of("not_applicable")

            @JvmField val PENDING = of("pending")

            @JvmField val ACTIVATING = of("activating")

            @JvmField val EXCEPTION = of("exception")

            @JvmField val CANCELED = of("canceled")

            @JvmField val PARTIAL_PORT_COMPLETE = of("partial_port_complete")

            @JvmField val PORTED = of("ported")

            @JvmStatic fun of(value: String) = MessagingPortStatus(JsonField.of(value))
        }

        /** An enum containing [MessagingPortStatus]'s known values. */
        enum class Known {
            NOT_APPLICABLE,
            PENDING,
            ACTIVATING,
            EXCEPTION,
            CANCELED,
            PARTIAL_PORT_COMPLETE,
            PORTED,
        }

        /**
         * An enum containing [MessagingPortStatus]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [MessagingPortStatus] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NOT_APPLICABLE,
            PENDING,
            ACTIVATING,
            EXCEPTION,
            CANCELED,
            PARTIAL_PORT_COMPLETE,
            PORTED,
            /**
             * An enum member indicating that [MessagingPortStatus] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                NOT_APPLICABLE -> Value.NOT_APPLICABLE
                PENDING -> Value.PENDING
                ACTIVATING -> Value.ACTIVATING
                EXCEPTION -> Value.EXCEPTION
                CANCELED -> Value.CANCELED
                PARTIAL_PORT_COMPLETE -> Value.PARTIAL_PORT_COMPLETE
                PORTED -> Value.PORTED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws TelnyxInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                NOT_APPLICABLE -> Known.NOT_APPLICABLE
                PENDING -> Known.PENDING
                ACTIVATING -> Known.ACTIVATING
                EXCEPTION -> Known.EXCEPTION
                CANCELED -> Known.CANCELED
                PARTIAL_PORT_COMPLETE -> Known.PARTIAL_PORT_COMPLETE
                PORTED -> Known.PORTED
                else -> throw TelnyxInvalidDataException("Unknown MessagingPortStatus: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): MessagingPortStatus = apply {
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

            return other is MessagingPortStatus && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PortingOrderMessaging &&
            enableMessaging == other.enableMessaging &&
            messagingCapable == other.messagingCapable &&
            messagingPortCompleted == other.messagingPortCompleted &&
            messagingPortStatus == other.messagingPortStatus &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            enableMessaging,
            messagingCapable,
            messagingPortCompleted,
            messagingPortStatus,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PortingOrderMessaging{enableMessaging=$enableMessaging, messagingCapable=$messagingCapable, messagingPortCompleted=$messagingPortCompleted, messagingPortStatus=$messagingPortStatus, additionalProperties=$additionalProperties}"
}
