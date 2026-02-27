// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingnumbersbulkupdates

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
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

class BulkMessagingSettingsUpdatePhoneNumbers
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val failed: JsonField<List<String>>,
    private val orderId: JsonField<String>,
    private val pending: JsonField<List<String>>,
    private val recordType: JsonField<RecordType>,
    private val success: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("failed") @ExcludeMissing failed: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("order_id") @ExcludeMissing orderId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pending")
        @ExcludeMissing
        pending: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<RecordType> = JsonMissing.of(),
        @JsonProperty("success") @ExcludeMissing success: JsonField<List<String>> = JsonMissing.of(),
    ) : this(failed, orderId, pending, recordType, success, mutableMapOf())

    /**
     * Phone numbers that failed to update.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun failed(): Optional<List<String>> = failed.getOptional("failed")

    /**
     * Order ID to verify bulk update status.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun orderId(): Optional<String> = orderId.getOptional("order_id")

    /**
     * Phone numbers pending to be updated.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pending(): Optional<List<String>> = pending.getOptional("pending")

    /**
     * Identifies the type of the resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordType(): Optional<RecordType> = recordType.getOptional("record_type")

    /**
     * Phoned numbers updated successfully.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun success(): Optional<List<String>> = success.getOptional("success")

    /**
     * Returns the raw JSON value of [failed].
     *
     * Unlike [failed], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("failed") @ExcludeMissing fun _failed(): JsonField<List<String>> = failed

    /**
     * Returns the raw JSON value of [orderId].
     *
     * Unlike [orderId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("order_id") @ExcludeMissing fun _orderId(): JsonField<String> = orderId

    /**
     * Returns the raw JSON value of [pending].
     *
     * Unlike [pending], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pending") @ExcludeMissing fun _pending(): JsonField<List<String>> = pending

    /**
     * Returns the raw JSON value of [recordType].
     *
     * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("record_type")
    @ExcludeMissing
    fun _recordType(): JsonField<RecordType> = recordType

    /**
     * Returns the raw JSON value of [success].
     *
     * Unlike [success], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("success") @ExcludeMissing fun _success(): JsonField<List<String>> = success

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
         * [BulkMessagingSettingsUpdatePhoneNumbers].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BulkMessagingSettingsUpdatePhoneNumbers]. */
    class Builder internal constructor() {

        private var failed: JsonField<MutableList<String>>? = null
        private var orderId: JsonField<String> = JsonMissing.of()
        private var pending: JsonField<MutableList<String>>? = null
        private var recordType: JsonField<RecordType> = JsonMissing.of()
        private var success: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            bulkMessagingSettingsUpdatePhoneNumbers: BulkMessagingSettingsUpdatePhoneNumbers
        ) = apply {
            failed = bulkMessagingSettingsUpdatePhoneNumbers.failed.map { it.toMutableList() }
            orderId = bulkMessagingSettingsUpdatePhoneNumbers.orderId
            pending = bulkMessagingSettingsUpdatePhoneNumbers.pending.map { it.toMutableList() }
            recordType = bulkMessagingSettingsUpdatePhoneNumbers.recordType
            success = bulkMessagingSettingsUpdatePhoneNumbers.success.map { it.toMutableList() }
            additionalProperties =
                bulkMessagingSettingsUpdatePhoneNumbers.additionalProperties.toMutableMap()
        }

        /** Phone numbers that failed to update. */
        fun failed(failed: List<String>) = failed(JsonField.of(failed))

        /**
         * Sets [Builder.failed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.failed] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun failed(failed: JsonField<List<String>>) = apply {
            this.failed = failed.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.failed].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFailed(failed: String) = apply {
            this.failed =
                (this.failed ?: JsonField.of(mutableListOf())).also {
                    checkKnown("failed", it).add(failed)
                }
        }

        /** Order ID to verify bulk update status. */
        fun orderId(orderId: String) = orderId(JsonField.of(orderId))

        /**
         * Sets [Builder.orderId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.orderId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun orderId(orderId: JsonField<String>) = apply { this.orderId = orderId }

        /** Phone numbers pending to be updated. */
        fun pending(pending: List<String>) = pending(JsonField.of(pending))

        /**
         * Sets [Builder.pending] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pending] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pending(pending: JsonField<List<String>>) = apply {
            this.pending = pending.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.pending].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPending(pending: String) = apply {
            this.pending =
                (this.pending ?: JsonField.of(mutableListOf())).also {
                    checkKnown("pending", it).add(pending)
                }
        }

        /** Identifies the type of the resource. */
        fun recordType(recordType: RecordType) = recordType(JsonField.of(recordType))

        /**
         * Sets [Builder.recordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordType] with a well-typed [RecordType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recordType(recordType: JsonField<RecordType>) = apply { this.recordType = recordType }

        /** Phoned numbers updated successfully. */
        fun success(success: List<String>) = success(JsonField.of(success))

        /**
         * Sets [Builder.success] to an arbitrary JSON value.
         *
         * You should usually call [Builder.success] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun success(success: JsonField<List<String>>) = apply {
            this.success = success.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.success].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSuccess(success: String) = apply {
            this.success =
                (this.success ?: JsonField.of(mutableListOf())).also {
                    checkKnown("success", it).add(success)
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
         * Returns an immutable instance of [BulkMessagingSettingsUpdatePhoneNumbers].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BulkMessagingSettingsUpdatePhoneNumbers =
            BulkMessagingSettingsUpdatePhoneNumbers(
                (failed ?: JsonMissing.of()).map { it.toImmutable() },
                orderId,
                (pending ?: JsonMissing.of()).map { it.toImmutable() },
                recordType,
                (success ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BulkMessagingSettingsUpdatePhoneNumbers = apply {
        if (validated) {
            return@apply
        }

        failed()
        orderId()
        pending()
        recordType().ifPresent { it.validate() }
        success()
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
        (failed.asKnown().getOrNull()?.size ?: 0) +
            (if (orderId.asKnown().isPresent) 1 else 0) +
            (pending.asKnown().getOrNull()?.size ?: 0) +
            (recordType.asKnown().getOrNull()?.validity() ?: 0) +
            (success.asKnown().getOrNull()?.size ?: 0)

    /** Identifies the type of the resource. */
    class RecordType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val MESSAGING_NUMBERS_BULK_UPDATE = of("messaging_numbers_bulk_update")

            @JvmStatic fun of(value: String) = RecordType(JsonField.of(value))
        }

        /** An enum containing [RecordType]'s known values. */
        enum class Known {
            MESSAGING_NUMBERS_BULK_UPDATE
        }

        /**
         * An enum containing [RecordType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RecordType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            MESSAGING_NUMBERS_BULK_UPDATE,
            /**
             * An enum member indicating that [RecordType] was instantiated with an unknown value.
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
                MESSAGING_NUMBERS_BULK_UPDATE -> Value.MESSAGING_NUMBERS_BULK_UPDATE
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
                MESSAGING_NUMBERS_BULK_UPDATE -> Known.MESSAGING_NUMBERS_BULK_UPDATE
                else -> throw TelnyxInvalidDataException("Unknown RecordType: $value")
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

        fun validate(): RecordType = apply {
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

            return other is RecordType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BulkMessagingSettingsUpdatePhoneNumbers &&
            failed == other.failed &&
            orderId == other.orderId &&
            pending == other.pending &&
            recordType == other.recordType &&
            success == other.success &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(failed, orderId, pending, recordType, success, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BulkMessagingSettingsUpdatePhoneNumbers{failed=$failed, orderId=$orderId, pending=$pending, recordType=$recordType, success=$success, additionalProperties=$additionalProperties}"
}
