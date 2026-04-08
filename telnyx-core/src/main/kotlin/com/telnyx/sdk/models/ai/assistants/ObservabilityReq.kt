// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ObservabilityReq
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val host: JsonField<String>,
    private val publicKeyRef: JsonField<String>,
    private val secretKeyRef: JsonField<String>,
    private val status: JsonField<Status>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("host") @ExcludeMissing host: JsonField<String> = JsonMissing.of(),
        @JsonProperty("public_key_ref")
        @ExcludeMissing
        publicKeyRef: JsonField<String> = JsonMissing.of(),
        @JsonProperty("secret_key_ref")
        @ExcludeMissing
        secretKeyRef: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
    ) : this(host, publicKeyRef, secretKeyRef, status, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun host(): Optional<String> = host.getOptional("host")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun publicKeyRef(): Optional<String> = publicKeyRef.getOptional("public_key_ref")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun secretKeyRef(): Optional<String> = secretKeyRef.getOptional("secret_key_ref")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<Status> = status.getOptional("status")

    /**
     * Returns the raw JSON value of [host].
     *
     * Unlike [host], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("host") @ExcludeMissing fun _host(): JsonField<String> = host

    /**
     * Returns the raw JSON value of [publicKeyRef].
     *
     * Unlike [publicKeyRef], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("public_key_ref")
    @ExcludeMissing
    fun _publicKeyRef(): JsonField<String> = publicKeyRef

    /**
     * Returns the raw JSON value of [secretKeyRef].
     *
     * Unlike [secretKeyRef], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("secret_key_ref")
    @ExcludeMissing
    fun _secretKeyRef(): JsonField<String> = secretKeyRef

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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

        /** Returns a mutable builder for constructing an instance of [ObservabilityReq]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ObservabilityReq]. */
    class Builder internal constructor() {

        private var host: JsonField<String> = JsonMissing.of()
        private var publicKeyRef: JsonField<String> = JsonMissing.of()
        private var secretKeyRef: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(observabilityReq: ObservabilityReq) = apply {
            host = observabilityReq.host
            publicKeyRef = observabilityReq.publicKeyRef
            secretKeyRef = observabilityReq.secretKeyRef
            status = observabilityReq.status
            additionalProperties = observabilityReq.additionalProperties.toMutableMap()
        }

        fun host(host: String) = host(JsonField.of(host))

        /**
         * Sets [Builder.host] to an arbitrary JSON value.
         *
         * You should usually call [Builder.host] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun host(host: JsonField<String>) = apply { this.host = host }

        fun publicKeyRef(publicKeyRef: String) = publicKeyRef(JsonField.of(publicKeyRef))

        /**
         * Sets [Builder.publicKeyRef] to an arbitrary JSON value.
         *
         * You should usually call [Builder.publicKeyRef] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun publicKeyRef(publicKeyRef: JsonField<String>) = apply {
            this.publicKeyRef = publicKeyRef
        }

        fun secretKeyRef(secretKeyRef: String) = secretKeyRef(JsonField.of(secretKeyRef))

        /**
         * Sets [Builder.secretKeyRef] to an arbitrary JSON value.
         *
         * You should usually call [Builder.secretKeyRef] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun secretKeyRef(secretKeyRef: JsonField<String>) = apply {
            this.secretKeyRef = secretKeyRef
        }

        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

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
         * Returns an immutable instance of [ObservabilityReq].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ObservabilityReq =
            ObservabilityReq(
                host,
                publicKeyRef,
                secretKeyRef,
                status,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ObservabilityReq = apply {
        if (validated) {
            return@apply
        }

        host()
        publicKeyRef()
        secretKeyRef()
        status().ifPresent { it.validate() }
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
        (if (host.asKnown().isPresent) 1 else 0) +
            (if (publicKeyRef.asKnown().isPresent) 1 else 0) +
            (if (secretKeyRef.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0)

    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ENABLED = of("enabled")

            @JvmField val DISABLED = of("disabled")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            ENABLED,
            DISABLED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ENABLED,
            DISABLED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                ENABLED -> Value.ENABLED
                DISABLED -> Value.DISABLED
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
                ENABLED -> Known.ENABLED
                DISABLED -> Known.DISABLED
                else -> throw TelnyxInvalidDataException("Unknown Status: $value")
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

        fun validate(): Status = apply {
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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ObservabilityReq &&
            host == other.host &&
            publicKeyRef == other.publicKeyRef &&
            secretKeyRef == other.secretKeyRef &&
            status == other.status &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(host, publicKeyRef, secretKeyRef, status, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ObservabilityReq{host=$host, publicKeyRef=$publicKeyRef, secretKeyRef=$secretKeyRef, status=$status, additionalProperties=$additionalProperties}"
}
