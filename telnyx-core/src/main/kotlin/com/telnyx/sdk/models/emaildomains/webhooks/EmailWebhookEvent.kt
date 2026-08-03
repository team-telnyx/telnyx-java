// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emaildomains.webhooks

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.errors.TelnyxInvalidDataException

/**
 * Event types a webhook may subscribe to. The union of email.* events (published by email-api) and
 * email_domain.* lifecycle events (published by this service). An event not listed here can never
 * be subscribed to and is silently dropped.
 */
class EmailWebhookEvent @JsonCreator private constructor(private val value: JsonField<String>) :
    Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val EMAIL_SCHEDULED = of("email.scheduled")

        @JvmField val EMAIL_SANDBOX = of("email.sandbox")

        @JvmField val EMAIL_QUEUED = of("email.queued")

        @JvmField val EMAIL_SENDING = of("email.sending")

        @JvmField val EMAIL_SENT = of("email.sent")

        @JvmField val EMAIL_DELIVERED = of("email.delivered")

        @JvmField val EMAIL_DEFERRED = of("email.deferred")

        @JvmField val EMAIL_BOUNCED = of("email.bounced")

        @JvmField val EMAIL_FAILED = of("email.failed")

        @JvmField val EMAIL_COMPLAINED = of("email.complained")

        @JvmField val EMAIL_OPENED = of("email.opened")

        @JvmField val EMAIL_CLICKED = of("email.clicked")

        @JvmField val EMAIL_UNSUBSCRIBED = of("email.unsubscribed")

        @JvmField val EMAIL_RECEIVED = of("email.received")

        @JvmField val EMAIL_DOMAIN_CREATED = of("email_domain.created")

        @JvmField val EMAIL_DOMAIN_VERIFIED = of("email_domain.verified")

        @JvmField val EMAIL_DOMAIN_DEGRADED = of("email_domain.degraded")

        @JvmField val EMAIL_DOMAIN_SUSPENDED = of("email_domain.suspended")

        @JvmField val EMAIL_DOMAIN_DELETED = of("email_domain.deleted")

        @JvmStatic fun of(value: String) = EmailWebhookEvent(JsonField.of(value))
    }

    /** An enum containing [EmailWebhookEvent]'s known values. */
    enum class Known {
        EMAIL_SCHEDULED,
        EMAIL_SANDBOX,
        EMAIL_QUEUED,
        EMAIL_SENDING,
        EMAIL_SENT,
        EMAIL_DELIVERED,
        EMAIL_DEFERRED,
        EMAIL_BOUNCED,
        EMAIL_FAILED,
        EMAIL_COMPLAINED,
        EMAIL_OPENED,
        EMAIL_CLICKED,
        EMAIL_UNSUBSCRIBED,
        EMAIL_RECEIVED,
        EMAIL_DOMAIN_CREATED,
        EMAIL_DOMAIN_VERIFIED,
        EMAIL_DOMAIN_DEGRADED,
        EMAIL_DOMAIN_SUSPENDED,
        EMAIL_DOMAIN_DELETED,
    }

    /**
     * An enum containing [EmailWebhookEvent]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [EmailWebhookEvent] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        EMAIL_SCHEDULED,
        EMAIL_SANDBOX,
        EMAIL_QUEUED,
        EMAIL_SENDING,
        EMAIL_SENT,
        EMAIL_DELIVERED,
        EMAIL_DEFERRED,
        EMAIL_BOUNCED,
        EMAIL_FAILED,
        EMAIL_COMPLAINED,
        EMAIL_OPENED,
        EMAIL_CLICKED,
        EMAIL_UNSUBSCRIBED,
        EMAIL_RECEIVED,
        EMAIL_DOMAIN_CREATED,
        EMAIL_DOMAIN_VERIFIED,
        EMAIL_DOMAIN_DEGRADED,
        EMAIL_DOMAIN_SUSPENDED,
        EMAIL_DOMAIN_DELETED,
        /**
         * An enum member indicating that [EmailWebhookEvent] was instantiated with an unknown
         * value.
         */
        _UNKNOWN,
    }

    /**
     * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if
     * the class was instantiated with an unknown value.
     *
     * Use the [known] method instead if you're certain the value is always known or if you want to
     * throw for the unknown case.
     */
    fun value(): Value =
        when (this) {
            EMAIL_SCHEDULED -> Value.EMAIL_SCHEDULED
            EMAIL_SANDBOX -> Value.EMAIL_SANDBOX
            EMAIL_QUEUED -> Value.EMAIL_QUEUED
            EMAIL_SENDING -> Value.EMAIL_SENDING
            EMAIL_SENT -> Value.EMAIL_SENT
            EMAIL_DELIVERED -> Value.EMAIL_DELIVERED
            EMAIL_DEFERRED -> Value.EMAIL_DEFERRED
            EMAIL_BOUNCED -> Value.EMAIL_BOUNCED
            EMAIL_FAILED -> Value.EMAIL_FAILED
            EMAIL_COMPLAINED -> Value.EMAIL_COMPLAINED
            EMAIL_OPENED -> Value.EMAIL_OPENED
            EMAIL_CLICKED -> Value.EMAIL_CLICKED
            EMAIL_UNSUBSCRIBED -> Value.EMAIL_UNSUBSCRIBED
            EMAIL_RECEIVED -> Value.EMAIL_RECEIVED
            EMAIL_DOMAIN_CREATED -> Value.EMAIL_DOMAIN_CREATED
            EMAIL_DOMAIN_VERIFIED -> Value.EMAIL_DOMAIN_VERIFIED
            EMAIL_DOMAIN_DEGRADED -> Value.EMAIL_DOMAIN_DEGRADED
            EMAIL_DOMAIN_SUSPENDED -> Value.EMAIL_DOMAIN_SUSPENDED
            EMAIL_DOMAIN_DELETED -> Value.EMAIL_DOMAIN_DELETED
            else -> Value._UNKNOWN
        }

    /**
     * Returns an enum member corresponding to this class instance's value.
     *
     * Use the [value] method instead if you're uncertain the value is always known and don't want
     * to throw for the unknown case.
     *
     * @throws TelnyxInvalidDataException if this class instance's value is a not a known member.
     */
    fun known(): Known =
        when (this) {
            EMAIL_SCHEDULED -> Known.EMAIL_SCHEDULED
            EMAIL_SANDBOX -> Known.EMAIL_SANDBOX
            EMAIL_QUEUED -> Known.EMAIL_QUEUED
            EMAIL_SENDING -> Known.EMAIL_SENDING
            EMAIL_SENT -> Known.EMAIL_SENT
            EMAIL_DELIVERED -> Known.EMAIL_DELIVERED
            EMAIL_DEFERRED -> Known.EMAIL_DEFERRED
            EMAIL_BOUNCED -> Known.EMAIL_BOUNCED
            EMAIL_FAILED -> Known.EMAIL_FAILED
            EMAIL_COMPLAINED -> Known.EMAIL_COMPLAINED
            EMAIL_OPENED -> Known.EMAIL_OPENED
            EMAIL_CLICKED -> Known.EMAIL_CLICKED
            EMAIL_UNSUBSCRIBED -> Known.EMAIL_UNSUBSCRIBED
            EMAIL_RECEIVED -> Known.EMAIL_RECEIVED
            EMAIL_DOMAIN_CREATED -> Known.EMAIL_DOMAIN_CREATED
            EMAIL_DOMAIN_VERIFIED -> Known.EMAIL_DOMAIN_VERIFIED
            EMAIL_DOMAIN_DEGRADED -> Known.EMAIL_DOMAIN_DEGRADED
            EMAIL_DOMAIN_SUSPENDED -> Known.EMAIL_DOMAIN_SUSPENDED
            EMAIL_DOMAIN_DELETED -> Known.EMAIL_DOMAIN_DELETED
            else -> throw TelnyxInvalidDataException("Unknown EmailWebhookEvent: $value")
        }

    /**
     * Returns this class instance's primitive wire representation.
     *
     * This differs from the [toString] method because that method is primarily for debugging and
     * generally doesn't throw.
     *
     * @throws TelnyxInvalidDataException if this class instance's value does not have the expected
     *   primitive type.
     */
    fun asString(): String =
        _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): EmailWebhookEvent = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmailWebhookEvent && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
