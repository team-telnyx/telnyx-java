// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumbers.jobs

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.BaseDeserializer
import com.telnyx.sdk.core.BaseSerializer
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.allMaxBy
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import com.telnyx.sdk.models.PhoneNumbersJobPhoneNumber
import com.telnyx.sdk.models.phonenumbers.NumbersError73c9788e53
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class NumbersPhoneNumbersJob
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<String>,
    private val etc: JsonField<OffsetDateTime>,
    private val failedOperations: JsonField<List<FailedOperation>>,
    private val parameters: JsonField<Parameters>,
    private val pendingOperations: JsonField<List<PendingOperation>>,
    private val phoneNumbers: JsonField<List<PhoneNumbersJobPhoneNumber>>,
    private val recordType: JsonField<String>,
    private val status: JsonField<Status>,
    private val successfulOperations: JsonField<List<SuccessfulOperation>>,
    private val type: JsonField<Type>,
    private val updatedAt: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at") @ExcludeMissing createdAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("etc") @ExcludeMissing etc: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("failed_operations")
        @ExcludeMissing
        failedOperations: JsonField<List<FailedOperation>> = JsonMissing.of(),
        @JsonProperty("parameters")
        @ExcludeMissing
        parameters: JsonField<Parameters> = JsonMissing.of(),
        @JsonProperty("pending_operations")
        @ExcludeMissing
        pendingOperations: JsonField<List<PendingOperation>> = JsonMissing.of(),
        @JsonProperty("phone_numbers")
        @ExcludeMissing
        phoneNumbers: JsonField<List<PhoneNumbersJobPhoneNumber>> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("successful_operations")
        @ExcludeMissing
        successfulOperations: JsonField<List<SuccessfulOperation>> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("updated_at") @ExcludeMissing updatedAt: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        etc,
        failedOperations,
        parameters,
        pendingOperations,
        phoneNumbers,
        recordType,
        status,
        successfulOperations,
        type,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * Identifies the resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * ISO 8601 formatted date indicating when the resource was created.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<String> = createdAt.getOptional("created_at")

    /**
     * ISO 8601 formatted date indicating when the estimated time of completion of the background
     * job.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun etc(): Optional<OffsetDateTime> = etc.getOptional("etc")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun failedOperations(): Optional<List<FailedOperation>> =
        failedOperations.getOptional("failed_operations")

    /**
     * Effective parameters saved when the job was created, not a snapshot of the original HTTP
     * request or current phone-number settings. Update jobs include the saved update fields;
     * emergency-settings jobs include the saved emergency fields; delete jobs include only targets.
     * Absent fields are omitted, and saved false, null and empty values are preserved. Tags may be
     * normalized to arrays; filter-created jobs contain resolved target identifiers rather than the
     * original filters. Historical jobs with no saved arguments return an empty object.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parameters(): Optional<Parameters> = parameters.getOptional("parameters")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pendingOperations(): Optional<List<PendingOperation>> =
        pendingOperations.getOptional("pending_operations")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun phoneNumbers(): Optional<List<PhoneNumbersJobPhoneNumber>> =
        phoneNumbers.getOptional("phone_numbers")

    /**
     * Identifies the type of the resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordType(): Optional<String> = recordType.getOptional("record_type")

    /**
     * Indicates the completion status of the background update.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<Status> = status.getOptional("status")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun successfulOperations(): Optional<List<SuccessfulOperation>> =
        successfulOperations.getOptional("successful_operations")

    /**
     * Identifies the type of the background job.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun type(): Optional<Type> = type.getOptional("type")

    /**
     * ISO 8601 formatted date indicating when the resource was updated.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<String> = updatedAt.getOptional("updated_at")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<String> = createdAt

    /**
     * Returns the raw JSON value of [etc].
     *
     * Unlike [etc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("etc") @ExcludeMissing fun _etc(): JsonField<OffsetDateTime> = etc

    /**
     * Returns the raw JSON value of [failedOperations].
     *
     * Unlike [failedOperations], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("failed_operations")
    @ExcludeMissing
    fun _failedOperations(): JsonField<List<FailedOperation>> = failedOperations

    /**
     * Returns the raw JSON value of [parameters].
     *
     * Unlike [parameters], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("parameters")
    @ExcludeMissing
    fun _parameters(): JsonField<Parameters> = parameters

    /**
     * Returns the raw JSON value of [pendingOperations].
     *
     * Unlike [pendingOperations], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("pending_operations")
    @ExcludeMissing
    fun _pendingOperations(): JsonField<List<PendingOperation>> = pendingOperations

    /**
     * Returns the raw JSON value of [phoneNumbers].
     *
     * Unlike [phoneNumbers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phone_numbers")
    @ExcludeMissing
    fun _phoneNumbers(): JsonField<List<PhoneNumbersJobPhoneNumber>> = phoneNumbers

    /**
     * Returns the raw JSON value of [recordType].
     *
     * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("record_type") @ExcludeMissing fun _recordType(): JsonField<String> = recordType

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [successfulOperations].
     *
     * Unlike [successfulOperations], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("successful_operations")
    @ExcludeMissing
    fun _successfulOperations(): JsonField<List<SuccessfulOperation>> = successfulOperations

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt(): JsonField<String> = updatedAt

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

        /** Returns a mutable builder for constructing an instance of [NumbersPhoneNumbersJob]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NumbersPhoneNumbersJob]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<String> = JsonMissing.of()
        private var etc: JsonField<OffsetDateTime> = JsonMissing.of()
        private var failedOperations: JsonField<MutableList<FailedOperation>>? = null
        private var parameters: JsonField<Parameters> = JsonMissing.of()
        private var pendingOperations: JsonField<MutableList<PendingOperation>>? = null
        private var phoneNumbers: JsonField<MutableList<PhoneNumbersJobPhoneNumber>>? = null
        private var recordType: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var successfulOperations: JsonField<MutableList<SuccessfulOperation>>? = null
        private var type: JsonField<Type> = JsonMissing.of()
        private var updatedAt: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(numbersPhoneNumbersJob: NumbersPhoneNumbersJob) = apply {
            id = numbersPhoneNumbersJob.id
            createdAt = numbersPhoneNumbersJob.createdAt
            etc = numbersPhoneNumbersJob.etc
            failedOperations = numbersPhoneNumbersJob.failedOperations.map { it.toMutableList() }
            parameters = numbersPhoneNumbersJob.parameters
            pendingOperations = numbersPhoneNumbersJob.pendingOperations.map { it.toMutableList() }
            phoneNumbers = numbersPhoneNumbersJob.phoneNumbers.map { it.toMutableList() }
            recordType = numbersPhoneNumbersJob.recordType
            status = numbersPhoneNumbersJob.status
            successfulOperations =
                numbersPhoneNumbersJob.successfulOperations.map { it.toMutableList() }
            type = numbersPhoneNumbersJob.type
            updatedAt = numbersPhoneNumbersJob.updatedAt
            additionalProperties = numbersPhoneNumbersJob.additionalProperties.toMutableMap()
        }

        /** Identifies the resource. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** ISO 8601 formatted date indicating when the resource was created. */
        fun createdAt(createdAt: String) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdAt(createdAt: JsonField<String>) = apply { this.createdAt = createdAt }

        /**
         * ISO 8601 formatted date indicating when the estimated time of completion of the
         * background job.
         */
        fun etc(etc: OffsetDateTime) = etc(JsonField.of(etc))

        /**
         * Sets [Builder.etc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.etc] with a well-typed [OffsetDateTime] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun etc(etc: JsonField<OffsetDateTime>) = apply { this.etc = etc }

        fun failedOperations(failedOperations: List<FailedOperation>) =
            failedOperations(JsonField.of(failedOperations))

        /**
         * Sets [Builder.failedOperations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.failedOperations] with a well-typed
         * `List<FailedOperation>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun failedOperations(failedOperations: JsonField<List<FailedOperation>>) = apply {
            this.failedOperations = failedOperations.map { it.toMutableList() }
        }

        /**
         * Adds a single [FailedOperation] to [failedOperations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFailedOperation(failedOperation: FailedOperation) = apply {
            failedOperations =
                (failedOperations ?: JsonField.of(mutableListOf())).also {
                    checkKnown("failedOperations", it).add(failedOperation)
                }
        }

        /**
         * Effective parameters saved when the job was created, not a snapshot of the original HTTP
         * request or current phone-number settings. Update jobs include the saved update fields;
         * emergency-settings jobs include the saved emergency fields; delete jobs include only
         * targets. Absent fields are omitted, and saved false, null and empty values are preserved.
         * Tags may be normalized to arrays; filter-created jobs contain resolved target identifiers
         * rather than the original filters. Historical jobs with no saved arguments return an empty
         * object.
         */
        fun parameters(parameters: Parameters) = parameters(JsonField.of(parameters))

        /**
         * Sets [Builder.parameters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parameters] with a well-typed [Parameters] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun parameters(parameters: JsonField<Parameters>) = apply { this.parameters = parameters }

        fun pendingOperations(pendingOperations: List<PendingOperation>) =
            pendingOperations(JsonField.of(pendingOperations))

        /**
         * Sets [Builder.pendingOperations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pendingOperations] with a well-typed
         * `List<PendingOperation>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun pendingOperations(pendingOperations: JsonField<List<PendingOperation>>) = apply {
            this.pendingOperations = pendingOperations.map { it.toMutableList() }
        }

        /**
         * Adds a single [PendingOperation] to [pendingOperations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPendingOperation(pendingOperation: PendingOperation) = apply {
            pendingOperations =
                (pendingOperations ?: JsonField.of(mutableListOf())).also {
                    checkKnown("pendingOperations", it).add(pendingOperation)
                }
        }

        fun phoneNumbers(phoneNumbers: List<PhoneNumbersJobPhoneNumber>) =
            phoneNumbers(JsonField.of(phoneNumbers))

        /**
         * Sets [Builder.phoneNumbers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumbers] with a well-typed
         * `List<PhoneNumbersJobPhoneNumber>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun phoneNumbers(phoneNumbers: JsonField<List<PhoneNumbersJobPhoneNumber>>) = apply {
            this.phoneNumbers = phoneNumbers.map { it.toMutableList() }
        }

        /**
         * Adds a single [PhoneNumbersJobPhoneNumber] to [phoneNumbers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPhoneNumber(phoneNumber: PhoneNumbersJobPhoneNumber) = apply {
            phoneNumbers =
                (phoneNumbers ?: JsonField.of(mutableListOf())).also {
                    checkKnown("phoneNumbers", it).add(phoneNumber)
                }
        }

        /** Identifies the type of the resource. */
        fun recordType(recordType: String) = recordType(JsonField.of(recordType))

        /**
         * Sets [Builder.recordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

        /** Indicates the completion status of the background update. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun successfulOperations(successfulOperations: List<SuccessfulOperation>) =
            successfulOperations(JsonField.of(successfulOperations))

        /**
         * Sets [Builder.successfulOperations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.successfulOperations] with a well-typed
         * `List<SuccessfulOperation>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun successfulOperations(successfulOperations: JsonField<List<SuccessfulOperation>>) =
            apply {
                this.successfulOperations = successfulOperations.map { it.toMutableList() }
            }

        /**
         * Adds a single [SuccessfulOperation] to [successfulOperations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSuccessfulOperation(successfulOperation: SuccessfulOperation) = apply {
            successfulOperations =
                (successfulOperations ?: JsonField.of(mutableListOf())).also {
                    checkKnown("successfulOperations", it).add(successfulOperation)
                }
        }

        /** Identifies the type of the background job. */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** ISO 8601 formatted date indicating when the resource was updated. */
        fun updatedAt(updatedAt: String) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun updatedAt(updatedAt: JsonField<String>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [NumbersPhoneNumbersJob].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): NumbersPhoneNumbersJob =
            NumbersPhoneNumbersJob(
                id,
                createdAt,
                etc,
                (failedOperations ?: JsonMissing.of()).map { it.toImmutable() },
                parameters,
                (pendingOperations ?: JsonMissing.of()).map { it.toImmutable() },
                (phoneNumbers ?: JsonMissing.of()).map { it.toImmutable() },
                recordType,
                status,
                (successfulOperations ?: JsonMissing.of()).map { it.toImmutable() },
                type,
                updatedAt,
                additionalProperties.toMutableMap(),
            )
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
    fun validate(): NumbersPhoneNumbersJob = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        etc()
        failedOperations().ifPresent { it.forEach { it.validate() } }
        parameters().ifPresent { it.validate() }
        pendingOperations().ifPresent { it.forEach { it.validate() } }
        phoneNumbers().ifPresent { it.forEach { it.validate() } }
        recordType()
        status().ifPresent { it.validate() }
        successfulOperations().ifPresent { it.forEach { it.validate() } }
        type().ifPresent { it.validate() }
        updatedAt()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (etc.asKnown().isPresent) 1 else 0) +
            (failedOperations.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (parameters.asKnown().getOrNull()?.validity() ?: 0) +
            (pendingOperations.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (phoneNumbers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (recordType.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (successfulOperations.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    class FailedOperation
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val errors: JsonField<List<NumbersError73c9788e53>>,
        private val phoneNumber: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("errors")
            @ExcludeMissing
            errors: JsonField<List<NumbersError73c9788e53>> = JsonMissing.of(),
            @JsonProperty("phone_number")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of(),
        ) : this(id, errors, phoneNumber, mutableMapOf())

        /**
         * The phone number's ID
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun errors(): Optional<List<NumbersError73c9788e53>> = errors.getOptional("errors")

        /**
         * The phone number in e164 format.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phone_number")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [errors].
         *
         * Unlike [errors], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("errors")
        @ExcludeMissing
        fun _errors(): JsonField<List<NumbersError73c9788e53>> = errors

        /**
         * Returns the raw JSON value of [phoneNumber].
         *
         * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phone_number")
        @ExcludeMissing
        fun _phoneNumber(): JsonField<String> = phoneNumber

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

            /** Returns a mutable builder for constructing an instance of [FailedOperation]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [FailedOperation]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var errors: JsonField<MutableList<NumbersError73c9788e53>>? = null
            private var phoneNumber: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(failedOperation: FailedOperation) = apply {
                id = failedOperation.id
                errors = failedOperation.errors.map { it.toMutableList() }
                phoneNumber = failedOperation.phoneNumber
                additionalProperties = failedOperation.additionalProperties.toMutableMap()
            }

            /** The phone number's ID */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun errors(errors: List<NumbersError73c9788e53>) = errors(JsonField.of(errors))

            /**
             * Sets [Builder.errors] to an arbitrary JSON value.
             *
             * You should usually call [Builder.errors] with a well-typed
             * `List<NumbersError73c9788e53>` value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun errors(errors: JsonField<List<NumbersError73c9788e53>>) = apply {
                this.errors = errors.map { it.toMutableList() }
            }

            /**
             * Adds a single [NumbersError73c9788e53] to [errors].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addError(error: NumbersError73c9788e53) = apply {
                errors =
                    (errors ?: JsonField.of(mutableListOf())).also {
                        checkKnown("errors", it).add(error)
                    }
            }

            /** The phone number in e164 format. */
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
             * Returns an immutable instance of [FailedOperation].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): FailedOperation =
                FailedOperation(
                    id,
                    (errors ?: JsonMissing.of()).map { it.toImmutable() },
                    phoneNumber,
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
        fun validate(): FailedOperation = apply {
            if (validated) {
                return@apply
            }

            id()
            errors().ifPresent { it.forEach { it.validate() } }
            phoneNumber()
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
                (errors.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (phoneNumber.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FailedOperation &&
                id == other.id &&
                errors == other.errors &&
                phoneNumber == other.phoneNumber &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(id, errors, phoneNumber, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "FailedOperation{id=$id, errors=$errors, phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
    }

    /**
     * Effective parameters saved when the job was created, not a snapshot of the original HTTP
     * request or current phone-number settings. Update jobs include the saved update fields;
     * emergency-settings jobs include the saved emergency fields; delete jobs include only targets.
     * Absent fields are omitted, and saved false, null and empty values are preserved. Tags may be
     * normalized to arrays; filter-created jobs contain resolved target identifiers rather than the
     * original filters. Historical jobs with no saved arguments return an empty object.
     */
    class Parameters
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val addTags: JsonField<List<String>>,
        private val billingGroupId: JsonField<String>,
        private val connectionId: JsonField<String>,
        private val customerReference: JsonField<String>,
        private val deletionLockEnabled: JsonField<Boolean>,
        private val emergencyAddressId: JsonField<String>,
        private val emergencyEnabled: JsonField<Boolean>,
        private val externalPin: JsonField<String>,
        private val hdVoiceEnabled: JsonField<Boolean>,
        private val phoneNumbers: JsonField<List<PhoneNumber>>,
        private val removeTags: JsonField<List<String>>,
        private val tags: JsonField<List<String>>,
        private val voice: JsonField<Voice>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("add_tags")
            @ExcludeMissing
            addTags: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("billing_group_id")
            @ExcludeMissing
            billingGroupId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("connection_id")
            @ExcludeMissing
            connectionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("customer_reference")
            @ExcludeMissing
            customerReference: JsonField<String> = JsonMissing.of(),
            @JsonProperty("deletion_lock_enabled")
            @ExcludeMissing
            deletionLockEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("emergency_address_id")
            @ExcludeMissing
            emergencyAddressId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("emergency_enabled")
            @ExcludeMissing
            emergencyEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("external_pin")
            @ExcludeMissing
            externalPin: JsonField<String> = JsonMissing.of(),
            @JsonProperty("hd_voice_enabled")
            @ExcludeMissing
            hdVoiceEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("phone_numbers")
            @ExcludeMissing
            phoneNumbers: JsonField<List<PhoneNumber>> = JsonMissing.of(),
            @JsonProperty("remove_tags")
            @ExcludeMissing
            removeTags: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("voice") @ExcludeMissing voice: JsonField<Voice> = JsonMissing.of(),
        ) : this(
            addTags,
            billingGroupId,
            connectionId,
            customerReference,
            deletionLockEnabled,
            emergencyAddressId,
            emergencyEnabled,
            externalPin,
            hdVoiceEnabled,
            phoneNumbers,
            removeTags,
            tags,
            voice,
            mutableMapOf(),
        )

        /**
         * Saved add_tags for an update_phone_numbers job. Values reflect creation-time
         * normalization.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun addTags(): Optional<List<String>> = addTags.getOptional("add_tags")

        /**
         * Saved billing_group_id supplied for an update_phone_numbers job.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun billingGroupId(): Optional<String> = billingGroupId.getOptional("billing_group_id")

        /**
         * Saved connection_id supplied for an update_phone_numbers job.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun connectionId(): Optional<String> = connectionId.getOptional("connection_id")

        /**
         * Saved customer_reference supplied for an update_phone_numbers job.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun customerReference(): Optional<String> =
            customerReference.getOptional("customer_reference")

        /**
         * Saved deletion_lock_enabled supplied for an update_phone_numbers job.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun deletionLockEnabled(): Optional<Boolean> =
            deletionLockEnabled.getOptional("deletion_lock_enabled")

        /**
         * Saved emergency address identifier for an update_emergency_settings job. An explicitly
         * supplied null is preserved.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun emergencyAddressId(): Optional<String> =
            emergencyAddressId.getOptional("emergency_address_id")

        /**
         * Saved emergency-services setting for an update_emergency_settings job.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun emergencyEnabled(): Optional<Boolean> =
            emergencyEnabled.getOptional("emergency_enabled")

        /**
         * Saved external_pin supplied for an update_phone_numbers job.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun externalPin(): Optional<String> = externalPin.getOptional("external_pin")

        /**
         * Saved hd_voice_enabled supplied for an update_phone_numbers job.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun hdVoiceEnabled(): Optional<Boolean> = hdVoiceEnabled.getOptional("hd_voice_enabled")

        /**
         * Saved target phone numbers in E.164 format and/or identifiers. Jobs created using filters
         * contain the resolved identifiers, not the original filter expression. Stored identifier
         * types are preserved.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phoneNumbers(): Optional<List<PhoneNumber>> = phoneNumbers.getOptional("phone_numbers")

        /**
         * Saved remove_tags for an update_phone_numbers job. Values reflect creation-time
         * normalization.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun removeTags(): Optional<List<String>> = removeTags.getOptional("remove_tags")

        /**
         * Saved tags for an update_phone_numbers job. Values reflect creation-time normalization.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tags(): Optional<List<String>> = tags.getOptional("tags")

        /**
         * Saved voice settings for an update_phone_numbers job, using the public field names and
         * nesting. Only settings present at creation are returned.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun voice(): Optional<Voice> = voice.getOptional("voice")

        /**
         * Returns the raw JSON value of [addTags].
         *
         * Unlike [addTags], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("add_tags") @ExcludeMissing fun _addTags(): JsonField<List<String>> = addTags

        /**
         * Returns the raw JSON value of [billingGroupId].
         *
         * Unlike [billingGroupId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("billing_group_id")
        @ExcludeMissing
        fun _billingGroupId(): JsonField<String> = billingGroupId

        /**
         * Returns the raw JSON value of [connectionId].
         *
         * Unlike [connectionId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("connection_id")
        @ExcludeMissing
        fun _connectionId(): JsonField<String> = connectionId

        /**
         * Returns the raw JSON value of [customerReference].
         *
         * Unlike [customerReference], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("customer_reference")
        @ExcludeMissing
        fun _customerReference(): JsonField<String> = customerReference

        /**
         * Returns the raw JSON value of [deletionLockEnabled].
         *
         * Unlike [deletionLockEnabled], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("deletion_lock_enabled")
        @ExcludeMissing
        fun _deletionLockEnabled(): JsonField<Boolean> = deletionLockEnabled

        /**
         * Returns the raw JSON value of [emergencyAddressId].
         *
         * Unlike [emergencyAddressId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("emergency_address_id")
        @ExcludeMissing
        fun _emergencyAddressId(): JsonField<String> = emergencyAddressId

        /**
         * Returns the raw JSON value of [emergencyEnabled].
         *
         * Unlike [emergencyEnabled], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("emergency_enabled")
        @ExcludeMissing
        fun _emergencyEnabled(): JsonField<Boolean> = emergencyEnabled

        /**
         * Returns the raw JSON value of [externalPin].
         *
         * Unlike [externalPin], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("external_pin")
        @ExcludeMissing
        fun _externalPin(): JsonField<String> = externalPin

        /**
         * Returns the raw JSON value of [hdVoiceEnabled].
         *
         * Unlike [hdVoiceEnabled], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("hd_voice_enabled")
        @ExcludeMissing
        fun _hdVoiceEnabled(): JsonField<Boolean> = hdVoiceEnabled

        /**
         * Returns the raw JSON value of [phoneNumbers].
         *
         * Unlike [phoneNumbers], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("phone_numbers")
        @ExcludeMissing
        fun _phoneNumbers(): JsonField<List<PhoneNumber>> = phoneNumbers

        /**
         * Returns the raw JSON value of [removeTags].
         *
         * Unlike [removeTags], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("remove_tags")
        @ExcludeMissing
        fun _removeTags(): JsonField<List<String>> = removeTags

        /**
         * Returns the raw JSON value of [tags].
         *
         * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

        /**
         * Returns the raw JSON value of [voice].
         *
         * Unlike [voice], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("voice") @ExcludeMissing fun _voice(): JsonField<Voice> = voice

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

            /** Returns a mutable builder for constructing an instance of [Parameters]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Parameters]. */
        class Builder internal constructor() {

            private var addTags: JsonField<MutableList<String>>? = null
            private var billingGroupId: JsonField<String> = JsonMissing.of()
            private var connectionId: JsonField<String> = JsonMissing.of()
            private var customerReference: JsonField<String> = JsonMissing.of()
            private var deletionLockEnabled: JsonField<Boolean> = JsonMissing.of()
            private var emergencyAddressId: JsonField<String> = JsonMissing.of()
            private var emergencyEnabled: JsonField<Boolean> = JsonMissing.of()
            private var externalPin: JsonField<String> = JsonMissing.of()
            private var hdVoiceEnabled: JsonField<Boolean> = JsonMissing.of()
            private var phoneNumbers: JsonField<MutableList<PhoneNumber>>? = null
            private var removeTags: JsonField<MutableList<String>>? = null
            private var tags: JsonField<MutableList<String>>? = null
            private var voice: JsonField<Voice> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(parameters: Parameters) = apply {
                addTags = parameters.addTags.map { it.toMutableList() }
                billingGroupId = parameters.billingGroupId
                connectionId = parameters.connectionId
                customerReference = parameters.customerReference
                deletionLockEnabled = parameters.deletionLockEnabled
                emergencyAddressId = parameters.emergencyAddressId
                emergencyEnabled = parameters.emergencyEnabled
                externalPin = parameters.externalPin
                hdVoiceEnabled = parameters.hdVoiceEnabled
                phoneNumbers = parameters.phoneNumbers.map { it.toMutableList() }
                removeTags = parameters.removeTags.map { it.toMutableList() }
                tags = parameters.tags.map { it.toMutableList() }
                voice = parameters.voice
                additionalProperties = parameters.additionalProperties.toMutableMap()
            }

            /**
             * Saved add_tags for an update_phone_numbers job. Values reflect creation-time
             * normalization.
             */
            fun addTags(addTags: List<String>?) = addTags(JsonField.ofNullable(addTags))

            /** Alias for calling [Builder.addTags] with `addTags.orElse(null)`. */
            fun addTags(addTags: Optional<List<String>>) = addTags(addTags.getOrNull())

            /**
             * Sets [Builder.addTags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.addTags] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun addTags(addTags: JsonField<List<String>>) = apply {
                this.addTags = addTags.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [addTags].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAddTag(addTag: String) = apply {
                addTags =
                    (addTags ?: JsonField.of(mutableListOf())).also {
                        checkKnown("addTags", it).add(addTag)
                    }
            }

            /** Saved billing_group_id supplied for an update_phone_numbers job. */
            fun billingGroupId(billingGroupId: String?) =
                billingGroupId(JsonField.ofNullable(billingGroupId))

            /** Alias for calling [Builder.billingGroupId] with `billingGroupId.orElse(null)`. */
            fun billingGroupId(billingGroupId: Optional<String>) =
                billingGroupId(billingGroupId.getOrNull())

            /**
             * Sets [Builder.billingGroupId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billingGroupId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun billingGroupId(billingGroupId: JsonField<String>) = apply {
                this.billingGroupId = billingGroupId
            }

            /** Saved connection_id supplied for an update_phone_numbers job. */
            fun connectionId(connectionId: String?) =
                connectionId(JsonField.ofNullable(connectionId))

            /** Alias for calling [Builder.connectionId] with `connectionId.orElse(null)`. */
            fun connectionId(connectionId: Optional<String>) =
                connectionId(connectionId.getOrNull())

            /**
             * Sets [Builder.connectionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.connectionId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun connectionId(connectionId: JsonField<String>) = apply {
                this.connectionId = connectionId
            }

            /** Saved customer_reference supplied for an update_phone_numbers job. */
            fun customerReference(customerReference: String?) =
                customerReference(JsonField.ofNullable(customerReference))

            /**
             * Alias for calling [Builder.customerReference] with `customerReference.orElse(null)`.
             */
            fun customerReference(customerReference: Optional<String>) =
                customerReference(customerReference.getOrNull())

            /**
             * Sets [Builder.customerReference] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerReference] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerReference(customerReference: JsonField<String>) = apply {
                this.customerReference = customerReference
            }

            /** Saved deletion_lock_enabled supplied for an update_phone_numbers job. */
            fun deletionLockEnabled(deletionLockEnabled: Boolean?) =
                deletionLockEnabled(JsonField.ofNullable(deletionLockEnabled))

            /**
             * Alias for [Builder.deletionLockEnabled].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun deletionLockEnabled(deletionLockEnabled: Boolean) =
                deletionLockEnabled(deletionLockEnabled as Boolean?)

            /**
             * Alias for calling [Builder.deletionLockEnabled] with
             * `deletionLockEnabled.orElse(null)`.
             */
            fun deletionLockEnabled(deletionLockEnabled: Optional<Boolean>) =
                deletionLockEnabled(deletionLockEnabled.getOrNull())

            /**
             * Sets [Builder.deletionLockEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deletionLockEnabled] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun deletionLockEnabled(deletionLockEnabled: JsonField<Boolean>) = apply {
                this.deletionLockEnabled = deletionLockEnabled
            }

            /**
             * Saved emergency address identifier for an update_emergency_settings job. An
             * explicitly supplied null is preserved.
             */
            fun emergencyAddressId(emergencyAddressId: String?) =
                emergencyAddressId(JsonField.ofNullable(emergencyAddressId))

            /**
             * Alias for calling [Builder.emergencyAddressId] with
             * `emergencyAddressId.orElse(null)`.
             */
            fun emergencyAddressId(emergencyAddressId: Optional<String>) =
                emergencyAddressId(emergencyAddressId.getOrNull())

            /**
             * Sets [Builder.emergencyAddressId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.emergencyAddressId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun emergencyAddressId(emergencyAddressId: JsonField<String>) = apply {
                this.emergencyAddressId = emergencyAddressId
            }

            /** Saved emergency-services setting for an update_emergency_settings job. */
            fun emergencyEnabled(emergencyEnabled: Boolean?) =
                emergencyEnabled(JsonField.ofNullable(emergencyEnabled))

            /**
             * Alias for [Builder.emergencyEnabled].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun emergencyEnabled(emergencyEnabled: Boolean) =
                emergencyEnabled(emergencyEnabled as Boolean?)

            /**
             * Alias for calling [Builder.emergencyEnabled] with `emergencyEnabled.orElse(null)`.
             */
            fun emergencyEnabled(emergencyEnabled: Optional<Boolean>) =
                emergencyEnabled(emergencyEnabled.getOrNull())

            /**
             * Sets [Builder.emergencyEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.emergencyEnabled] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun emergencyEnabled(emergencyEnabled: JsonField<Boolean>) = apply {
                this.emergencyEnabled = emergencyEnabled
            }

            /** Saved external_pin supplied for an update_phone_numbers job. */
            fun externalPin(externalPin: String?) = externalPin(JsonField.ofNullable(externalPin))

            /** Alias for calling [Builder.externalPin] with `externalPin.orElse(null)`. */
            fun externalPin(externalPin: Optional<String>) = externalPin(externalPin.getOrNull())

            /**
             * Sets [Builder.externalPin] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalPin] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun externalPin(externalPin: JsonField<String>) = apply {
                this.externalPin = externalPin
            }

            /** Saved hd_voice_enabled supplied for an update_phone_numbers job. */
            fun hdVoiceEnabled(hdVoiceEnabled: Boolean?) =
                hdVoiceEnabled(JsonField.ofNullable(hdVoiceEnabled))

            /**
             * Alias for [Builder.hdVoiceEnabled].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun hdVoiceEnabled(hdVoiceEnabled: Boolean) = hdVoiceEnabled(hdVoiceEnabled as Boolean?)

            /** Alias for calling [Builder.hdVoiceEnabled] with `hdVoiceEnabled.orElse(null)`. */
            fun hdVoiceEnabled(hdVoiceEnabled: Optional<Boolean>) =
                hdVoiceEnabled(hdVoiceEnabled.getOrNull())

            /**
             * Sets [Builder.hdVoiceEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hdVoiceEnabled] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun hdVoiceEnabled(hdVoiceEnabled: JsonField<Boolean>) = apply {
                this.hdVoiceEnabled = hdVoiceEnabled
            }

            /**
             * Saved target phone numbers in E.164 format and/or identifiers. Jobs created using
             * filters contain the resolved identifiers, not the original filter expression. Stored
             * identifier types are preserved.
             */
            fun phoneNumbers(phoneNumbers: List<PhoneNumber>) =
                phoneNumbers(JsonField.of(phoneNumbers))

            /**
             * Sets [Builder.phoneNumbers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumbers] with a well-typed `List<PhoneNumber>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun phoneNumbers(phoneNumbers: JsonField<List<PhoneNumber>>) = apply {
                this.phoneNumbers = phoneNumbers.map { it.toMutableList() }
            }

            /**
             * Adds a single [PhoneNumber] to [phoneNumbers].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPhoneNumber(phoneNumber: PhoneNumber) = apply {
                phoneNumbers =
                    (phoneNumbers ?: JsonField.of(mutableListOf())).also {
                        checkKnown("phoneNumbers", it).add(phoneNumber)
                    }
            }

            /** Alias for calling [addPhoneNumber] with `PhoneNumber.ofString(string)`. */
            fun addPhoneNumber(string: String) = addPhoneNumber(PhoneNumber.ofString(string))

            /** Alias for calling [addPhoneNumber] with `PhoneNumber.ofInteger(integer)`. */
            fun addPhoneNumber(integer: Long) = addPhoneNumber(PhoneNumber.ofInteger(integer))

            /**
             * Saved remove_tags for an update_phone_numbers job. Values reflect creation-time
             * normalization.
             */
            fun removeTags(removeTags: List<String>?) = removeTags(JsonField.ofNullable(removeTags))

            /** Alias for calling [Builder.removeTags] with `removeTags.orElse(null)`. */
            fun removeTags(removeTags: Optional<List<String>>) = removeTags(removeTags.getOrNull())

            /**
             * Sets [Builder.removeTags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.removeTags] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun removeTags(removeTags: JsonField<List<String>>) = apply {
                this.removeTags = removeTags.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [removeTags].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRemoveTag(removeTag: String) = apply {
                removeTags =
                    (removeTags ?: JsonField.of(mutableListOf())).also {
                        checkKnown("removeTags", it).add(removeTag)
                    }
            }

            /**
             * Saved tags for an update_phone_numbers job. Values reflect creation-time
             * normalization.
             */
            fun tags(tags: List<String>?) = tags(JsonField.ofNullable(tags))

            /** Alias for calling [Builder.tags] with `tags.orElse(null)`. */
            fun tags(tags: Optional<List<String>>) = tags(tags.getOrNull())

            /**
             * Sets [Builder.tags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tags] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tags(tags: JsonField<List<String>>) = apply {
                this.tags = tags.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [tags].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTag(tag: String) = apply {
                tags =
                    (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
            }

            /**
             * Saved voice settings for an update_phone_numbers job, using the public field names
             * and nesting. Only settings present at creation are returned.
             */
            fun voice(voice: Voice) = voice(JsonField.of(voice))

            /**
             * Sets [Builder.voice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.voice] with a well-typed [Voice] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun voice(voice: JsonField<Voice>) = apply { this.voice = voice }

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
             * Returns an immutable instance of [Parameters].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Parameters =
                Parameters(
                    (addTags ?: JsonMissing.of()).map { it.toImmutable() },
                    billingGroupId,
                    connectionId,
                    customerReference,
                    deletionLockEnabled,
                    emergencyAddressId,
                    emergencyEnabled,
                    externalPin,
                    hdVoiceEnabled,
                    (phoneNumbers ?: JsonMissing.of()).map { it.toImmutable() },
                    (removeTags ?: JsonMissing.of()).map { it.toImmutable() },
                    (tags ?: JsonMissing.of()).map { it.toImmutable() },
                    voice,
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
        fun validate(): Parameters = apply {
            if (validated) {
                return@apply
            }

            addTags()
            billingGroupId()
            connectionId()
            customerReference()
            deletionLockEnabled()
            emergencyAddressId()
            emergencyEnabled()
            externalPin()
            hdVoiceEnabled()
            phoneNumbers().ifPresent { it.forEach { it.validate() } }
            removeTags()
            tags()
            voice().ifPresent { it.validate() }
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
            (addTags.asKnown().getOrNull()?.size ?: 0) +
                (if (billingGroupId.asKnown().isPresent) 1 else 0) +
                (if (connectionId.asKnown().isPresent) 1 else 0) +
                (if (customerReference.asKnown().isPresent) 1 else 0) +
                (if (deletionLockEnabled.asKnown().isPresent) 1 else 0) +
                (if (emergencyAddressId.asKnown().isPresent) 1 else 0) +
                (if (emergencyEnabled.asKnown().isPresent) 1 else 0) +
                (if (externalPin.asKnown().isPresent) 1 else 0) +
                (if (hdVoiceEnabled.asKnown().isPresent) 1 else 0) +
                (phoneNumbers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (removeTags.asKnown().getOrNull()?.size ?: 0) +
                (tags.asKnown().getOrNull()?.size ?: 0) +
                (voice.asKnown().getOrNull()?.validity() ?: 0)

        @JsonDeserialize(using = PhoneNumber.Deserializer::class)
        @JsonSerialize(using = PhoneNumber.Serializer::class)
        class PhoneNumber
        private constructor(
            private val string: String? = null,
            private val integer: Long? = null,
            private val _json: JsonValue? = null,
        ) {

            fun string(): Optional<String> = Optional.ofNullable(string)

            fun integer(): Optional<Long> = Optional.ofNullable(integer)

            fun isString(): Boolean = string != null

            fun isInteger(): Boolean = integer != null

            fun asString(): String = string.getOrThrow("string")

            fun asInteger(): Long = integer.getOrThrow("integer")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            /**
             * Maps this instance's current variant to a value of type [T] using the given
             * [visitor].
             *
             * Note that this method is _not_ forwards compatible with new variants from the API,
             * unless [visitor] overrides [Visitor.unknown]. To handle variants not known to this
             * version of the SDK gracefully, consider overriding [Visitor.unknown]:
             * ```java
             * import com.telnyx.sdk.core.JsonValue;
             * import java.util.Optional;
             *
             * Optional<String> result = phoneNumber.accept(new PhoneNumber.Visitor<Optional<String>>() {
             *     @Override
             *     public Optional<String> visitString(String string) {
             *         return Optional.of(string.toString());
             *     }
             *
             *     // ...
             *
             *     @Override
             *     public Optional<String> unknown(JsonValue json) {
             *         // Or inspect the `json`.
             *         return Optional.empty();
             *     }
             * });
             * ```
             *
             * @throws TelnyxInvalidDataException if [Visitor.unknown] is not overridden in
             *   [visitor] and the current variant is unknown.
             */
            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    string != null -> visitor.visitString(string)
                    integer != null -> visitor.visitInteger(integer)
                    else -> visitor.unknown(_json)
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
            fun validate(): PhoneNumber = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitString(string: String) {}

                        override fun visitInteger(integer: Long) {}
                    }
                )
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
                accept(
                    object : Visitor<Int> {
                        override fun visitString(string: String) = 1

                        override fun visitInteger(integer: Long) = 1

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PhoneNumber && string == other.string && integer == other.integer
            }

            override fun hashCode(): Int = Objects.hash(string, integer)

            override fun toString(): String =
                when {
                    string != null -> "PhoneNumber{string=$string}"
                    integer != null -> "PhoneNumber{integer=$integer}"
                    _json != null -> "PhoneNumber{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid PhoneNumber")
                }

            companion object {

                @JvmStatic fun ofString(string: String) = PhoneNumber(string = string)

                @JvmStatic fun ofInteger(integer: Long) = PhoneNumber(integer = integer)
            }

            /**
             * An interface that defines how to map each variant of [PhoneNumber] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitString(string: String): T

                fun visitInteger(integer: Long): T

                /**
                 * Maps an unknown variant of [PhoneNumber] to a value of type [T].
                 *
                 * An instance of [PhoneNumber] can contain an unknown variant if it was
                 * deserialized from data that doesn't match any known variant. For example, if the
                 * SDK is on an older version than the API, then the API may respond with new
                 * variants that the SDK is unaware of.
                 *
                 * @throws TelnyxInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw TelnyxInvalidDataException("Unknown PhoneNumber: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<PhoneNumber>(PhoneNumber::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): PhoneNumber {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                    PhoneNumber(string = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<Long>())?.let {
                                    PhoneNumber(integer = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from boolean).
                        0 -> PhoneNumber(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<PhoneNumber>(PhoneNumber::class) {

                override fun serialize(
                    value: PhoneNumber,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.string != null -> generator.writeObject(value.string)
                        value.integer != null -> generator.writeObject(value.integer)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid PhoneNumber")
                    }
                }
            }
        }

        /**
         * Saved voice settings for an update_phone_numbers job, using the public field names and
         * nesting. Only settings present at creation are returned.
         */
        class Voice
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val callForwarding: JsonField<CallForwarding>,
            private val callRecording: JsonField<CallRecording>,
            private val callerIdNameEnabled: JsonField<Boolean>,
            private val cnamListing: JsonField<CnamListing>,
            private val inboundCallScreening: JsonField<String>,
            private val mediaFeatures: JsonField<MediaFeatures>,
            private val techPrefixEnabled: JsonField<Boolean>,
            private val usagePaymentMethod: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("call_forwarding")
                @ExcludeMissing
                callForwarding: JsonField<CallForwarding> = JsonMissing.of(),
                @JsonProperty("call_recording")
                @ExcludeMissing
                callRecording: JsonField<CallRecording> = JsonMissing.of(),
                @JsonProperty("caller_id_name_enabled")
                @ExcludeMissing
                callerIdNameEnabled: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("cnam_listing")
                @ExcludeMissing
                cnamListing: JsonField<CnamListing> = JsonMissing.of(),
                @JsonProperty("inbound_call_screening")
                @ExcludeMissing
                inboundCallScreening: JsonField<String> = JsonMissing.of(),
                @JsonProperty("media_features")
                @ExcludeMissing
                mediaFeatures: JsonField<MediaFeatures> = JsonMissing.of(),
                @JsonProperty("tech_prefix_enabled")
                @ExcludeMissing
                techPrefixEnabled: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("usage_payment_method")
                @ExcludeMissing
                usagePaymentMethod: JsonField<String> = JsonMissing.of(),
            ) : this(
                callForwarding,
                callRecording,
                callerIdNameEnabled,
                cnamListing,
                inboundCallScreening,
                mediaFeatures,
                techPrefixEnabled,
                usagePaymentMethod,
                mutableMapOf(),
            )

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun callForwarding(): Optional<CallForwarding> =
                callForwarding.getOptional("call_forwarding")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun callRecording(): Optional<CallRecording> =
                callRecording.getOptional("call_recording")

            /**
             * Saved caller_id_name_enabled setting.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun callerIdNameEnabled(): Optional<Boolean> =
                callerIdNameEnabled.getOptional("caller_id_name_enabled")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun cnamListing(): Optional<CnamListing> = cnamListing.getOptional("cnam_listing")

            /**
             * Saved inbound_call_screening setting.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun inboundCallScreening(): Optional<String> =
                inboundCallScreening.getOptional("inbound_call_screening")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun mediaFeatures(): Optional<MediaFeatures> =
                mediaFeatures.getOptional("media_features")

            /**
             * Saved tech_prefix_enabled setting.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun techPrefixEnabled(): Optional<Boolean> =
                techPrefixEnabled.getOptional("tech_prefix_enabled")

            /**
             * Saved usage_payment_method setting.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun usagePaymentMethod(): Optional<String> =
                usagePaymentMethod.getOptional("usage_payment_method")

            /**
             * Returns the raw JSON value of [callForwarding].
             *
             * Unlike [callForwarding], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("call_forwarding")
            @ExcludeMissing
            fun _callForwarding(): JsonField<CallForwarding> = callForwarding

            /**
             * Returns the raw JSON value of [callRecording].
             *
             * Unlike [callRecording], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("call_recording")
            @ExcludeMissing
            fun _callRecording(): JsonField<CallRecording> = callRecording

            /**
             * Returns the raw JSON value of [callerIdNameEnabled].
             *
             * Unlike [callerIdNameEnabled], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("caller_id_name_enabled")
            @ExcludeMissing
            fun _callerIdNameEnabled(): JsonField<Boolean> = callerIdNameEnabled

            /**
             * Returns the raw JSON value of [cnamListing].
             *
             * Unlike [cnamListing], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("cnam_listing")
            @ExcludeMissing
            fun _cnamListing(): JsonField<CnamListing> = cnamListing

            /**
             * Returns the raw JSON value of [inboundCallScreening].
             *
             * Unlike [inboundCallScreening], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("inbound_call_screening")
            @ExcludeMissing
            fun _inboundCallScreening(): JsonField<String> = inboundCallScreening

            /**
             * Returns the raw JSON value of [mediaFeatures].
             *
             * Unlike [mediaFeatures], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("media_features")
            @ExcludeMissing
            fun _mediaFeatures(): JsonField<MediaFeatures> = mediaFeatures

            /**
             * Returns the raw JSON value of [techPrefixEnabled].
             *
             * Unlike [techPrefixEnabled], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("tech_prefix_enabled")
            @ExcludeMissing
            fun _techPrefixEnabled(): JsonField<Boolean> = techPrefixEnabled

            /**
             * Returns the raw JSON value of [usagePaymentMethod].
             *
             * Unlike [usagePaymentMethod], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("usage_payment_method")
            @ExcludeMissing
            fun _usagePaymentMethod(): JsonField<String> = usagePaymentMethod

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

                /** Returns a mutable builder for constructing an instance of [Voice]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Voice]. */
            class Builder internal constructor() {

                private var callForwarding: JsonField<CallForwarding> = JsonMissing.of()
                private var callRecording: JsonField<CallRecording> = JsonMissing.of()
                private var callerIdNameEnabled: JsonField<Boolean> = JsonMissing.of()
                private var cnamListing: JsonField<CnamListing> = JsonMissing.of()
                private var inboundCallScreening: JsonField<String> = JsonMissing.of()
                private var mediaFeatures: JsonField<MediaFeatures> = JsonMissing.of()
                private var techPrefixEnabled: JsonField<Boolean> = JsonMissing.of()
                private var usagePaymentMethod: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(voice: Voice) = apply {
                    callForwarding = voice.callForwarding
                    callRecording = voice.callRecording
                    callerIdNameEnabled = voice.callerIdNameEnabled
                    cnamListing = voice.cnamListing
                    inboundCallScreening = voice.inboundCallScreening
                    mediaFeatures = voice.mediaFeatures
                    techPrefixEnabled = voice.techPrefixEnabled
                    usagePaymentMethod = voice.usagePaymentMethod
                    additionalProperties = voice.additionalProperties.toMutableMap()
                }

                fun callForwarding(callForwarding: CallForwarding) =
                    callForwarding(JsonField.of(callForwarding))

                /**
                 * Sets [Builder.callForwarding] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.callForwarding] with a well-typed
                 * [CallForwarding] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun callForwarding(callForwarding: JsonField<CallForwarding>) = apply {
                    this.callForwarding = callForwarding
                }

                fun callRecording(callRecording: CallRecording) =
                    callRecording(JsonField.of(callRecording))

                /**
                 * Sets [Builder.callRecording] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.callRecording] with a well-typed [CallRecording]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun callRecording(callRecording: JsonField<CallRecording>) = apply {
                    this.callRecording = callRecording
                }

                /** Saved caller_id_name_enabled setting. */
                fun callerIdNameEnabled(callerIdNameEnabled: Boolean?) =
                    callerIdNameEnabled(JsonField.ofNullable(callerIdNameEnabled))

                /**
                 * Alias for [Builder.callerIdNameEnabled].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun callerIdNameEnabled(callerIdNameEnabled: Boolean) =
                    callerIdNameEnabled(callerIdNameEnabled as Boolean?)

                /**
                 * Alias for calling [Builder.callerIdNameEnabled] with
                 * `callerIdNameEnabled.orElse(null)`.
                 */
                fun callerIdNameEnabled(callerIdNameEnabled: Optional<Boolean>) =
                    callerIdNameEnabled(callerIdNameEnabled.getOrNull())

                /**
                 * Sets [Builder.callerIdNameEnabled] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.callerIdNameEnabled] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun callerIdNameEnabled(callerIdNameEnabled: JsonField<Boolean>) = apply {
                    this.callerIdNameEnabled = callerIdNameEnabled
                }

                fun cnamListing(cnamListing: CnamListing) = cnamListing(JsonField.of(cnamListing))

                /**
                 * Sets [Builder.cnamListing] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cnamListing] with a well-typed [CnamListing]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun cnamListing(cnamListing: JsonField<CnamListing>) = apply {
                    this.cnamListing = cnamListing
                }

                /** Saved inbound_call_screening setting. */
                fun inboundCallScreening(inboundCallScreening: String?) =
                    inboundCallScreening(JsonField.ofNullable(inboundCallScreening))

                /**
                 * Alias for calling [Builder.inboundCallScreening] with
                 * `inboundCallScreening.orElse(null)`.
                 */
                fun inboundCallScreening(inboundCallScreening: Optional<String>) =
                    inboundCallScreening(inboundCallScreening.getOrNull())

                /**
                 * Sets [Builder.inboundCallScreening] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.inboundCallScreening] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun inboundCallScreening(inboundCallScreening: JsonField<String>) = apply {
                    this.inboundCallScreening = inboundCallScreening
                }

                fun mediaFeatures(mediaFeatures: MediaFeatures) =
                    mediaFeatures(JsonField.of(mediaFeatures))

                /**
                 * Sets [Builder.mediaFeatures] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.mediaFeatures] with a well-typed [MediaFeatures]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun mediaFeatures(mediaFeatures: JsonField<MediaFeatures>) = apply {
                    this.mediaFeatures = mediaFeatures
                }

                /** Saved tech_prefix_enabled setting. */
                fun techPrefixEnabled(techPrefixEnabled: Boolean?) =
                    techPrefixEnabled(JsonField.ofNullable(techPrefixEnabled))

                /**
                 * Alias for [Builder.techPrefixEnabled].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun techPrefixEnabled(techPrefixEnabled: Boolean) =
                    techPrefixEnabled(techPrefixEnabled as Boolean?)

                /**
                 * Alias for calling [Builder.techPrefixEnabled] with
                 * `techPrefixEnabled.orElse(null)`.
                 */
                fun techPrefixEnabled(techPrefixEnabled: Optional<Boolean>) =
                    techPrefixEnabled(techPrefixEnabled.getOrNull())

                /**
                 * Sets [Builder.techPrefixEnabled] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.techPrefixEnabled] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun techPrefixEnabled(techPrefixEnabled: JsonField<Boolean>) = apply {
                    this.techPrefixEnabled = techPrefixEnabled
                }

                /** Saved usage_payment_method setting. */
                fun usagePaymentMethod(usagePaymentMethod: String?) =
                    usagePaymentMethod(JsonField.ofNullable(usagePaymentMethod))

                /**
                 * Alias for calling [Builder.usagePaymentMethod] with
                 * `usagePaymentMethod.orElse(null)`.
                 */
                fun usagePaymentMethod(usagePaymentMethod: Optional<String>) =
                    usagePaymentMethod(usagePaymentMethod.getOrNull())

                /**
                 * Sets [Builder.usagePaymentMethod] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.usagePaymentMethod] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun usagePaymentMethod(usagePaymentMethod: JsonField<String>) = apply {
                    this.usagePaymentMethod = usagePaymentMethod
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
                 * Returns an immutable instance of [Voice].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Voice =
                    Voice(
                        callForwarding,
                        callRecording,
                        callerIdNameEnabled,
                        cnamListing,
                        inboundCallScreening,
                        mediaFeatures,
                        techPrefixEnabled,
                        usagePaymentMethod,
                        additionalProperties.toMutableMap(),
                    )
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
            fun validate(): Voice = apply {
                if (validated) {
                    return@apply
                }

                callForwarding().ifPresent { it.validate() }
                callRecording().ifPresent { it.validate() }
                callerIdNameEnabled()
                cnamListing().ifPresent { it.validate() }
                inboundCallScreening()
                mediaFeatures().ifPresent { it.validate() }
                techPrefixEnabled()
                usagePaymentMethod()
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
                (callForwarding.asKnown().getOrNull()?.validity() ?: 0) +
                    (callRecording.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (callerIdNameEnabled.asKnown().isPresent) 1 else 0) +
                    (cnamListing.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (inboundCallScreening.asKnown().isPresent) 1 else 0) +
                    (mediaFeatures.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (techPrefixEnabled.asKnown().isPresent) 1 else 0) +
                    (if (usagePaymentMethod.asKnown().isPresent) 1 else 0)

            class CallForwarding
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val callForwardingEnabled: JsonField<Boolean>,
                private val forwardingType: JsonField<String>,
                private val forwardsTo: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("call_forwarding_enabled")
                    @ExcludeMissing
                    callForwardingEnabled: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("forwarding_type")
                    @ExcludeMissing
                    forwardingType: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("forwards_to")
                    @ExcludeMissing
                    forwardsTo: JsonField<String> = JsonMissing.of(),
                ) : this(callForwardingEnabled, forwardingType, forwardsTo, mutableMapOf())

                /**
                 * Saved call_forwarding_enabled setting.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun callForwardingEnabled(): Optional<Boolean> =
                    callForwardingEnabled.getOptional("call_forwarding_enabled")

                /**
                 * Saved forwarding_type setting.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun forwardingType(): Optional<String> =
                    forwardingType.getOptional("forwarding_type")

                /**
                 * Saved forwards_to setting.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun forwardsTo(): Optional<String> = forwardsTo.getOptional("forwards_to")

                /**
                 * Returns the raw JSON value of [callForwardingEnabled].
                 *
                 * Unlike [callForwardingEnabled], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("call_forwarding_enabled")
                @ExcludeMissing
                fun _callForwardingEnabled(): JsonField<Boolean> = callForwardingEnabled

                /**
                 * Returns the raw JSON value of [forwardingType].
                 *
                 * Unlike [forwardingType], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("forwarding_type")
                @ExcludeMissing
                fun _forwardingType(): JsonField<String> = forwardingType

                /**
                 * Returns the raw JSON value of [forwardsTo].
                 *
                 * Unlike [forwardsTo], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("forwards_to")
                @ExcludeMissing
                fun _forwardsTo(): JsonField<String> = forwardsTo

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
                     * Returns a mutable builder for constructing an instance of [CallForwarding].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [CallForwarding]. */
                class Builder internal constructor() {

                    private var callForwardingEnabled: JsonField<Boolean> = JsonMissing.of()
                    private var forwardingType: JsonField<String> = JsonMissing.of()
                    private var forwardsTo: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(callForwarding: CallForwarding) = apply {
                        callForwardingEnabled = callForwarding.callForwardingEnabled
                        forwardingType = callForwarding.forwardingType
                        forwardsTo = callForwarding.forwardsTo
                        additionalProperties = callForwarding.additionalProperties.toMutableMap()
                    }

                    /** Saved call_forwarding_enabled setting. */
                    fun callForwardingEnabled(callForwardingEnabled: Boolean?) =
                        callForwardingEnabled(JsonField.ofNullable(callForwardingEnabled))

                    /**
                     * Alias for [Builder.callForwardingEnabled].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun callForwardingEnabled(callForwardingEnabled: Boolean) =
                        callForwardingEnabled(callForwardingEnabled as Boolean?)

                    /**
                     * Alias for calling [Builder.callForwardingEnabled] with
                     * `callForwardingEnabled.orElse(null)`.
                     */
                    fun callForwardingEnabled(callForwardingEnabled: Optional<Boolean>) =
                        callForwardingEnabled(callForwardingEnabled.getOrNull())

                    /**
                     * Sets [Builder.callForwardingEnabled] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.callForwardingEnabled] with a well-typed
                     * [Boolean] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun callForwardingEnabled(callForwardingEnabled: JsonField<Boolean>) = apply {
                        this.callForwardingEnabled = callForwardingEnabled
                    }

                    /** Saved forwarding_type setting. */
                    fun forwardingType(forwardingType: String?) =
                        forwardingType(JsonField.ofNullable(forwardingType))

                    /**
                     * Alias for calling [Builder.forwardingType] with
                     * `forwardingType.orElse(null)`.
                     */
                    fun forwardingType(forwardingType: Optional<String>) =
                        forwardingType(forwardingType.getOrNull())

                    /**
                     * Sets [Builder.forwardingType] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.forwardingType] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun forwardingType(forwardingType: JsonField<String>) = apply {
                        this.forwardingType = forwardingType
                    }

                    /** Saved forwards_to setting. */
                    fun forwardsTo(forwardsTo: String?) =
                        forwardsTo(JsonField.ofNullable(forwardsTo))

                    /** Alias for calling [Builder.forwardsTo] with `forwardsTo.orElse(null)`. */
                    fun forwardsTo(forwardsTo: Optional<String>) =
                        forwardsTo(forwardsTo.getOrNull())

                    /**
                     * Sets [Builder.forwardsTo] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.forwardsTo] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun forwardsTo(forwardsTo: JsonField<String>) = apply {
                        this.forwardsTo = forwardsTo
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
                     * Returns an immutable instance of [CallForwarding].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): CallForwarding =
                        CallForwarding(
                            callForwardingEnabled,
                            forwardingType,
                            forwardsTo,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): CallForwarding = apply {
                    if (validated) {
                        return@apply
                    }

                    callForwardingEnabled()
                    forwardingType()
                    forwardsTo()
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
                    (if (callForwardingEnabled.asKnown().isPresent) 1 else 0) +
                        (if (forwardingType.asKnown().isPresent) 1 else 0) +
                        (if (forwardsTo.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CallForwarding &&
                        callForwardingEnabled == other.callForwardingEnabled &&
                        forwardingType == other.forwardingType &&
                        forwardsTo == other.forwardsTo &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        callForwardingEnabled,
                        forwardingType,
                        forwardsTo,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "CallForwarding{callForwardingEnabled=$callForwardingEnabled, forwardingType=$forwardingType, forwardsTo=$forwardsTo, additionalProperties=$additionalProperties}"
            }

            class CallRecording
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val inboundCallRecordingChannels: JsonField<String>,
                private val inboundCallRecordingEnabled: JsonField<Boolean>,
                private val inboundCallRecordingFormat: JsonField<String>,
                private val recordContinueOnHold: JsonField<Boolean>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("inbound_call_recording_channels")
                    @ExcludeMissing
                    inboundCallRecordingChannels: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("inbound_call_recording_enabled")
                    @ExcludeMissing
                    inboundCallRecordingEnabled: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("inbound_call_recording_format")
                    @ExcludeMissing
                    inboundCallRecordingFormat: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("record_continue_on_hold")
                    @ExcludeMissing
                    recordContinueOnHold: JsonField<Boolean> = JsonMissing.of(),
                ) : this(
                    inboundCallRecordingChannels,
                    inboundCallRecordingEnabled,
                    inboundCallRecordingFormat,
                    recordContinueOnHold,
                    mutableMapOf(),
                )

                /**
                 * Saved inbound_call_recording_channels setting.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun inboundCallRecordingChannels(): Optional<String> =
                    inboundCallRecordingChannels.getOptional("inbound_call_recording_channels")

                /**
                 * Saved inbound_call_recording_enabled setting.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun inboundCallRecordingEnabled(): Optional<Boolean> =
                    inboundCallRecordingEnabled.getOptional("inbound_call_recording_enabled")

                /**
                 * Saved inbound_call_recording_format setting.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun inboundCallRecordingFormat(): Optional<String> =
                    inboundCallRecordingFormat.getOptional("inbound_call_recording_format")

                /**
                 * Saved record_continue_on_hold setting.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun recordContinueOnHold(): Optional<Boolean> =
                    recordContinueOnHold.getOptional("record_continue_on_hold")

                /**
                 * Returns the raw JSON value of [inboundCallRecordingChannels].
                 *
                 * Unlike [inboundCallRecordingChannels], this method doesn't throw if the JSON
                 * field has an unexpected type.
                 */
                @JsonProperty("inbound_call_recording_channels")
                @ExcludeMissing
                fun _inboundCallRecordingChannels(): JsonField<String> =
                    inboundCallRecordingChannels

                /**
                 * Returns the raw JSON value of [inboundCallRecordingEnabled].
                 *
                 * Unlike [inboundCallRecordingEnabled], this method doesn't throw if the JSON field
                 * has an unexpected type.
                 */
                @JsonProperty("inbound_call_recording_enabled")
                @ExcludeMissing
                fun _inboundCallRecordingEnabled(): JsonField<Boolean> = inboundCallRecordingEnabled

                /**
                 * Returns the raw JSON value of [inboundCallRecordingFormat].
                 *
                 * Unlike [inboundCallRecordingFormat], this method doesn't throw if the JSON field
                 * has an unexpected type.
                 */
                @JsonProperty("inbound_call_recording_format")
                @ExcludeMissing
                fun _inboundCallRecordingFormat(): JsonField<String> = inboundCallRecordingFormat

                /**
                 * Returns the raw JSON value of [recordContinueOnHold].
                 *
                 * Unlike [recordContinueOnHold], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("record_continue_on_hold")
                @ExcludeMissing
                fun _recordContinueOnHold(): JsonField<Boolean> = recordContinueOnHold

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
                     * Returns a mutable builder for constructing an instance of [CallRecording].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [CallRecording]. */
                class Builder internal constructor() {

                    private var inboundCallRecordingChannels: JsonField<String> = JsonMissing.of()
                    private var inboundCallRecordingEnabled: JsonField<Boolean> = JsonMissing.of()
                    private var inboundCallRecordingFormat: JsonField<String> = JsonMissing.of()
                    private var recordContinueOnHold: JsonField<Boolean> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(callRecording: CallRecording) = apply {
                        inboundCallRecordingChannels = callRecording.inboundCallRecordingChannels
                        inboundCallRecordingEnabled = callRecording.inboundCallRecordingEnabled
                        inboundCallRecordingFormat = callRecording.inboundCallRecordingFormat
                        recordContinueOnHold = callRecording.recordContinueOnHold
                        additionalProperties = callRecording.additionalProperties.toMutableMap()
                    }

                    /** Saved inbound_call_recording_channels setting. */
                    fun inboundCallRecordingChannels(inboundCallRecordingChannels: String?) =
                        inboundCallRecordingChannels(
                            JsonField.ofNullable(inboundCallRecordingChannels)
                        )

                    /**
                     * Alias for calling [Builder.inboundCallRecordingChannels] with
                     * `inboundCallRecordingChannels.orElse(null)`.
                     */
                    fun inboundCallRecordingChannels(
                        inboundCallRecordingChannels: Optional<String>
                    ) = inboundCallRecordingChannels(inboundCallRecordingChannels.getOrNull())

                    /**
                     * Sets [Builder.inboundCallRecordingChannels] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.inboundCallRecordingChannels] with a
                     * well-typed [String] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun inboundCallRecordingChannels(
                        inboundCallRecordingChannels: JsonField<String>
                    ) = apply { this.inboundCallRecordingChannels = inboundCallRecordingChannels }

                    /** Saved inbound_call_recording_enabled setting. */
                    fun inboundCallRecordingEnabled(inboundCallRecordingEnabled: Boolean?) =
                        inboundCallRecordingEnabled(
                            JsonField.ofNullable(inboundCallRecordingEnabled)
                        )

                    /**
                     * Alias for [Builder.inboundCallRecordingEnabled].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun inboundCallRecordingEnabled(inboundCallRecordingEnabled: Boolean) =
                        inboundCallRecordingEnabled(inboundCallRecordingEnabled as Boolean?)

                    /**
                     * Alias for calling [Builder.inboundCallRecordingEnabled] with
                     * `inboundCallRecordingEnabled.orElse(null)`.
                     */
                    fun inboundCallRecordingEnabled(
                        inboundCallRecordingEnabled: Optional<Boolean>
                    ) = inboundCallRecordingEnabled(inboundCallRecordingEnabled.getOrNull())

                    /**
                     * Sets [Builder.inboundCallRecordingEnabled] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.inboundCallRecordingEnabled] with a
                     * well-typed [Boolean] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun inboundCallRecordingEnabled(
                        inboundCallRecordingEnabled: JsonField<Boolean>
                    ) = apply { this.inboundCallRecordingEnabled = inboundCallRecordingEnabled }

                    /** Saved inbound_call_recording_format setting. */
                    fun inboundCallRecordingFormat(inboundCallRecordingFormat: String?) =
                        inboundCallRecordingFormat(JsonField.ofNullable(inboundCallRecordingFormat))

                    /**
                     * Alias for calling [Builder.inboundCallRecordingFormat] with
                     * `inboundCallRecordingFormat.orElse(null)`.
                     */
                    fun inboundCallRecordingFormat(inboundCallRecordingFormat: Optional<String>) =
                        inboundCallRecordingFormat(inboundCallRecordingFormat.getOrNull())

                    /**
                     * Sets [Builder.inboundCallRecordingFormat] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.inboundCallRecordingFormat] with a
                     * well-typed [String] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun inboundCallRecordingFormat(inboundCallRecordingFormat: JsonField<String>) =
                        apply {
                            this.inboundCallRecordingFormat = inboundCallRecordingFormat
                        }

                    /** Saved record_continue_on_hold setting. */
                    fun recordContinueOnHold(recordContinueOnHold: Boolean?) =
                        recordContinueOnHold(JsonField.ofNullable(recordContinueOnHold))

                    /**
                     * Alias for [Builder.recordContinueOnHold].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun recordContinueOnHold(recordContinueOnHold: Boolean) =
                        recordContinueOnHold(recordContinueOnHold as Boolean?)

                    /**
                     * Alias for calling [Builder.recordContinueOnHold] with
                     * `recordContinueOnHold.orElse(null)`.
                     */
                    fun recordContinueOnHold(recordContinueOnHold: Optional<Boolean>) =
                        recordContinueOnHold(recordContinueOnHold.getOrNull())

                    /**
                     * Sets [Builder.recordContinueOnHold] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.recordContinueOnHold] with a well-typed
                     * [Boolean] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun recordContinueOnHold(recordContinueOnHold: JsonField<Boolean>) = apply {
                        this.recordContinueOnHold = recordContinueOnHold
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
                     * Returns an immutable instance of [CallRecording].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): CallRecording =
                        CallRecording(
                            inboundCallRecordingChannels,
                            inboundCallRecordingEnabled,
                            inboundCallRecordingFormat,
                            recordContinueOnHold,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): CallRecording = apply {
                    if (validated) {
                        return@apply
                    }

                    inboundCallRecordingChannels()
                    inboundCallRecordingEnabled()
                    inboundCallRecordingFormat()
                    recordContinueOnHold()
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
                    (if (inboundCallRecordingChannels.asKnown().isPresent) 1 else 0) +
                        (if (inboundCallRecordingEnabled.asKnown().isPresent) 1 else 0) +
                        (if (inboundCallRecordingFormat.asKnown().isPresent) 1 else 0) +
                        (if (recordContinueOnHold.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CallRecording &&
                        inboundCallRecordingChannels == other.inboundCallRecordingChannels &&
                        inboundCallRecordingEnabled == other.inboundCallRecordingEnabled &&
                        inboundCallRecordingFormat == other.inboundCallRecordingFormat &&
                        recordContinueOnHold == other.recordContinueOnHold &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        inboundCallRecordingChannels,
                        inboundCallRecordingEnabled,
                        inboundCallRecordingFormat,
                        recordContinueOnHold,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "CallRecording{inboundCallRecordingChannels=$inboundCallRecordingChannels, inboundCallRecordingEnabled=$inboundCallRecordingEnabled, inboundCallRecordingFormat=$inboundCallRecordingFormat, recordContinueOnHold=$recordContinueOnHold, additionalProperties=$additionalProperties}"
            }

            class CnamListing
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val cnamListingDetails: JsonField<String>,
                private val cnamListingEnabled: JsonField<Boolean>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("cnam_listing_details")
                    @ExcludeMissing
                    cnamListingDetails: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("cnam_listing_enabled")
                    @ExcludeMissing
                    cnamListingEnabled: JsonField<Boolean> = JsonMissing.of(),
                ) : this(cnamListingDetails, cnamListingEnabled, mutableMapOf())

                /**
                 * Saved cnam_listing_details setting.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun cnamListingDetails(): Optional<String> =
                    cnamListingDetails.getOptional("cnam_listing_details")

                /**
                 * Saved cnam_listing_enabled setting.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun cnamListingEnabled(): Optional<Boolean> =
                    cnamListingEnabled.getOptional("cnam_listing_enabled")

                /**
                 * Returns the raw JSON value of [cnamListingDetails].
                 *
                 * Unlike [cnamListingDetails], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("cnam_listing_details")
                @ExcludeMissing
                fun _cnamListingDetails(): JsonField<String> = cnamListingDetails

                /**
                 * Returns the raw JSON value of [cnamListingEnabled].
                 *
                 * Unlike [cnamListingEnabled], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("cnam_listing_enabled")
                @ExcludeMissing
                fun _cnamListingEnabled(): JsonField<Boolean> = cnamListingEnabled

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

                    /** Returns a mutable builder for constructing an instance of [CnamListing]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [CnamListing]. */
                class Builder internal constructor() {

                    private var cnamListingDetails: JsonField<String> = JsonMissing.of()
                    private var cnamListingEnabled: JsonField<Boolean> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(cnamListing: CnamListing) = apply {
                        cnamListingDetails = cnamListing.cnamListingDetails
                        cnamListingEnabled = cnamListing.cnamListingEnabled
                        additionalProperties = cnamListing.additionalProperties.toMutableMap()
                    }

                    /** Saved cnam_listing_details setting. */
                    fun cnamListingDetails(cnamListingDetails: String?) =
                        cnamListingDetails(JsonField.ofNullable(cnamListingDetails))

                    /**
                     * Alias for calling [Builder.cnamListingDetails] with
                     * `cnamListingDetails.orElse(null)`.
                     */
                    fun cnamListingDetails(cnamListingDetails: Optional<String>) =
                        cnamListingDetails(cnamListingDetails.getOrNull())

                    /**
                     * Sets [Builder.cnamListingDetails] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.cnamListingDetails] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun cnamListingDetails(cnamListingDetails: JsonField<String>) = apply {
                        this.cnamListingDetails = cnamListingDetails
                    }

                    /** Saved cnam_listing_enabled setting. */
                    fun cnamListingEnabled(cnamListingEnabled: Boolean?) =
                        cnamListingEnabled(JsonField.ofNullable(cnamListingEnabled))

                    /**
                     * Alias for [Builder.cnamListingEnabled].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun cnamListingEnabled(cnamListingEnabled: Boolean) =
                        cnamListingEnabled(cnamListingEnabled as Boolean?)

                    /**
                     * Alias for calling [Builder.cnamListingEnabled] with
                     * `cnamListingEnabled.orElse(null)`.
                     */
                    fun cnamListingEnabled(cnamListingEnabled: Optional<Boolean>) =
                        cnamListingEnabled(cnamListingEnabled.getOrNull())

                    /**
                     * Sets [Builder.cnamListingEnabled] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.cnamListingEnabled] with a well-typed
                     * [Boolean] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun cnamListingEnabled(cnamListingEnabled: JsonField<Boolean>) = apply {
                        this.cnamListingEnabled = cnamListingEnabled
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
                     * Returns an immutable instance of [CnamListing].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): CnamListing =
                        CnamListing(
                            cnamListingDetails,
                            cnamListingEnabled,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): CnamListing = apply {
                    if (validated) {
                        return@apply
                    }

                    cnamListingDetails()
                    cnamListingEnabled()
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
                    (if (cnamListingDetails.asKnown().isPresent) 1 else 0) +
                        (if (cnamListingEnabled.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CnamListing &&
                        cnamListingDetails == other.cnamListingDetails &&
                        cnamListingEnabled == other.cnamListingEnabled &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(cnamListingDetails, cnamListingEnabled, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "CnamListing{cnamListingDetails=$cnamListingDetails, cnamListingEnabled=$cnamListingEnabled, additionalProperties=$additionalProperties}"
            }

            class MediaFeatures
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val acceptAnyRtpPacketsEnabled: JsonField<Boolean>,
                private val rtpAutoAdjustEnabled: JsonField<Boolean>,
                private val t38FaxGatewayEnabled: JsonField<Boolean>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("accept_any_rtp_packets_enabled")
                    @ExcludeMissing
                    acceptAnyRtpPacketsEnabled: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("rtp_auto_adjust_enabled")
                    @ExcludeMissing
                    rtpAutoAdjustEnabled: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("t38_fax_gateway_enabled")
                    @ExcludeMissing
                    t38FaxGatewayEnabled: JsonField<Boolean> = JsonMissing.of(),
                ) : this(
                    acceptAnyRtpPacketsEnabled,
                    rtpAutoAdjustEnabled,
                    t38FaxGatewayEnabled,
                    mutableMapOf(),
                )

                /**
                 * Saved accept_any_rtp_packets_enabled setting.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun acceptAnyRtpPacketsEnabled(): Optional<Boolean> =
                    acceptAnyRtpPacketsEnabled.getOptional("accept_any_rtp_packets_enabled")

                /**
                 * Saved rtp_auto_adjust_enabled setting.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun rtpAutoAdjustEnabled(): Optional<Boolean> =
                    rtpAutoAdjustEnabled.getOptional("rtp_auto_adjust_enabled")

                /**
                 * Saved t38_fax_gateway_enabled setting.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun t38FaxGatewayEnabled(): Optional<Boolean> =
                    t38FaxGatewayEnabled.getOptional("t38_fax_gateway_enabled")

                /**
                 * Returns the raw JSON value of [acceptAnyRtpPacketsEnabled].
                 *
                 * Unlike [acceptAnyRtpPacketsEnabled], this method doesn't throw if the JSON field
                 * has an unexpected type.
                 */
                @JsonProperty("accept_any_rtp_packets_enabled")
                @ExcludeMissing
                fun _acceptAnyRtpPacketsEnabled(): JsonField<Boolean> = acceptAnyRtpPacketsEnabled

                /**
                 * Returns the raw JSON value of [rtpAutoAdjustEnabled].
                 *
                 * Unlike [rtpAutoAdjustEnabled], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("rtp_auto_adjust_enabled")
                @ExcludeMissing
                fun _rtpAutoAdjustEnabled(): JsonField<Boolean> = rtpAutoAdjustEnabled

                /**
                 * Returns the raw JSON value of [t38FaxGatewayEnabled].
                 *
                 * Unlike [t38FaxGatewayEnabled], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("t38_fax_gateway_enabled")
                @ExcludeMissing
                fun _t38FaxGatewayEnabled(): JsonField<Boolean> = t38FaxGatewayEnabled

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
                     * Returns a mutable builder for constructing an instance of [MediaFeatures].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [MediaFeatures]. */
                class Builder internal constructor() {

                    private var acceptAnyRtpPacketsEnabled: JsonField<Boolean> = JsonMissing.of()
                    private var rtpAutoAdjustEnabled: JsonField<Boolean> = JsonMissing.of()
                    private var t38FaxGatewayEnabled: JsonField<Boolean> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(mediaFeatures: MediaFeatures) = apply {
                        acceptAnyRtpPacketsEnabled = mediaFeatures.acceptAnyRtpPacketsEnabled
                        rtpAutoAdjustEnabled = mediaFeatures.rtpAutoAdjustEnabled
                        t38FaxGatewayEnabled = mediaFeatures.t38FaxGatewayEnabled
                        additionalProperties = mediaFeatures.additionalProperties.toMutableMap()
                    }

                    /** Saved accept_any_rtp_packets_enabled setting. */
                    fun acceptAnyRtpPacketsEnabled(acceptAnyRtpPacketsEnabled: Boolean?) =
                        acceptAnyRtpPacketsEnabled(JsonField.ofNullable(acceptAnyRtpPacketsEnabled))

                    /**
                     * Alias for [Builder.acceptAnyRtpPacketsEnabled].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun acceptAnyRtpPacketsEnabled(acceptAnyRtpPacketsEnabled: Boolean) =
                        acceptAnyRtpPacketsEnabled(acceptAnyRtpPacketsEnabled as Boolean?)

                    /**
                     * Alias for calling [Builder.acceptAnyRtpPacketsEnabled] with
                     * `acceptAnyRtpPacketsEnabled.orElse(null)`.
                     */
                    fun acceptAnyRtpPacketsEnabled(acceptAnyRtpPacketsEnabled: Optional<Boolean>) =
                        acceptAnyRtpPacketsEnabled(acceptAnyRtpPacketsEnabled.getOrNull())

                    /**
                     * Sets [Builder.acceptAnyRtpPacketsEnabled] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.acceptAnyRtpPacketsEnabled] with a
                     * well-typed [Boolean] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun acceptAnyRtpPacketsEnabled(acceptAnyRtpPacketsEnabled: JsonField<Boolean>) =
                        apply {
                            this.acceptAnyRtpPacketsEnabled = acceptAnyRtpPacketsEnabled
                        }

                    /** Saved rtp_auto_adjust_enabled setting. */
                    fun rtpAutoAdjustEnabled(rtpAutoAdjustEnabled: Boolean?) =
                        rtpAutoAdjustEnabled(JsonField.ofNullable(rtpAutoAdjustEnabled))

                    /**
                     * Alias for [Builder.rtpAutoAdjustEnabled].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun rtpAutoAdjustEnabled(rtpAutoAdjustEnabled: Boolean) =
                        rtpAutoAdjustEnabled(rtpAutoAdjustEnabled as Boolean?)

                    /**
                     * Alias for calling [Builder.rtpAutoAdjustEnabled] with
                     * `rtpAutoAdjustEnabled.orElse(null)`.
                     */
                    fun rtpAutoAdjustEnabled(rtpAutoAdjustEnabled: Optional<Boolean>) =
                        rtpAutoAdjustEnabled(rtpAutoAdjustEnabled.getOrNull())

                    /**
                     * Sets [Builder.rtpAutoAdjustEnabled] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.rtpAutoAdjustEnabled] with a well-typed
                     * [Boolean] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun rtpAutoAdjustEnabled(rtpAutoAdjustEnabled: JsonField<Boolean>) = apply {
                        this.rtpAutoAdjustEnabled = rtpAutoAdjustEnabled
                    }

                    /** Saved t38_fax_gateway_enabled setting. */
                    fun t38FaxGatewayEnabled(t38FaxGatewayEnabled: Boolean?) =
                        t38FaxGatewayEnabled(JsonField.ofNullable(t38FaxGatewayEnabled))

                    /**
                     * Alias for [Builder.t38FaxGatewayEnabled].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun t38FaxGatewayEnabled(t38FaxGatewayEnabled: Boolean) =
                        t38FaxGatewayEnabled(t38FaxGatewayEnabled as Boolean?)

                    /**
                     * Alias for calling [Builder.t38FaxGatewayEnabled] with
                     * `t38FaxGatewayEnabled.orElse(null)`.
                     */
                    fun t38FaxGatewayEnabled(t38FaxGatewayEnabled: Optional<Boolean>) =
                        t38FaxGatewayEnabled(t38FaxGatewayEnabled.getOrNull())

                    /**
                     * Sets [Builder.t38FaxGatewayEnabled] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.t38FaxGatewayEnabled] with a well-typed
                     * [Boolean] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun t38FaxGatewayEnabled(t38FaxGatewayEnabled: JsonField<Boolean>) = apply {
                        this.t38FaxGatewayEnabled = t38FaxGatewayEnabled
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
                     * Returns an immutable instance of [MediaFeatures].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): MediaFeatures =
                        MediaFeatures(
                            acceptAnyRtpPacketsEnabled,
                            rtpAutoAdjustEnabled,
                            t38FaxGatewayEnabled,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): MediaFeatures = apply {
                    if (validated) {
                        return@apply
                    }

                    acceptAnyRtpPacketsEnabled()
                    rtpAutoAdjustEnabled()
                    t38FaxGatewayEnabled()
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
                    (if (acceptAnyRtpPacketsEnabled.asKnown().isPresent) 1 else 0) +
                        (if (rtpAutoAdjustEnabled.asKnown().isPresent) 1 else 0) +
                        (if (t38FaxGatewayEnabled.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is MediaFeatures &&
                        acceptAnyRtpPacketsEnabled == other.acceptAnyRtpPacketsEnabled &&
                        rtpAutoAdjustEnabled == other.rtpAutoAdjustEnabled &&
                        t38FaxGatewayEnabled == other.t38FaxGatewayEnabled &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        acceptAnyRtpPacketsEnabled,
                        rtpAutoAdjustEnabled,
                        t38FaxGatewayEnabled,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "MediaFeatures{acceptAnyRtpPacketsEnabled=$acceptAnyRtpPacketsEnabled, rtpAutoAdjustEnabled=$rtpAutoAdjustEnabled, t38FaxGatewayEnabled=$t38FaxGatewayEnabled, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Voice &&
                    callForwarding == other.callForwarding &&
                    callRecording == other.callRecording &&
                    callerIdNameEnabled == other.callerIdNameEnabled &&
                    cnamListing == other.cnamListing &&
                    inboundCallScreening == other.inboundCallScreening &&
                    mediaFeatures == other.mediaFeatures &&
                    techPrefixEnabled == other.techPrefixEnabled &&
                    usagePaymentMethod == other.usagePaymentMethod &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    callForwarding,
                    callRecording,
                    callerIdNameEnabled,
                    cnamListing,
                    inboundCallScreening,
                    mediaFeatures,
                    techPrefixEnabled,
                    usagePaymentMethod,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Voice{callForwarding=$callForwarding, callRecording=$callRecording, callerIdNameEnabled=$callerIdNameEnabled, cnamListing=$cnamListing, inboundCallScreening=$inboundCallScreening, mediaFeatures=$mediaFeatures, techPrefixEnabled=$techPrefixEnabled, usagePaymentMethod=$usagePaymentMethod, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Parameters &&
                addTags == other.addTags &&
                billingGroupId == other.billingGroupId &&
                connectionId == other.connectionId &&
                customerReference == other.customerReference &&
                deletionLockEnabled == other.deletionLockEnabled &&
                emergencyAddressId == other.emergencyAddressId &&
                emergencyEnabled == other.emergencyEnabled &&
                externalPin == other.externalPin &&
                hdVoiceEnabled == other.hdVoiceEnabled &&
                phoneNumbers == other.phoneNumbers &&
                removeTags == other.removeTags &&
                tags == other.tags &&
                voice == other.voice &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                addTags,
                billingGroupId,
                connectionId,
                customerReference,
                deletionLockEnabled,
                emergencyAddressId,
                emergencyEnabled,
                externalPin,
                hdVoiceEnabled,
                phoneNumbers,
                removeTags,
                tags,
                voice,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Parameters{addTags=$addTags, billingGroupId=$billingGroupId, connectionId=$connectionId, customerReference=$customerReference, deletionLockEnabled=$deletionLockEnabled, emergencyAddressId=$emergencyAddressId, emergencyEnabled=$emergencyEnabled, externalPin=$externalPin, hdVoiceEnabled=$hdVoiceEnabled, phoneNumbers=$phoneNumbers, removeTags=$removeTags, tags=$tags, voice=$voice, additionalProperties=$additionalProperties}"
    }

    /**
     * The phone numbers pending confirmation on update results. Entries in this list are transient,
     * and will be moved to either successful_operations or failed_operations once the processing is
     * done.
     */
    class PendingOperation
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val phoneNumber: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("phone_number")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of(),
        ) : this(id, phoneNumber, mutableMapOf())

        /**
         * The phone number's ID
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * The phone number in e164 format.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phone_number")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [phoneNumber].
         *
         * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phone_number")
        @ExcludeMissing
        fun _phoneNumber(): JsonField<String> = phoneNumber

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

            /** Returns a mutable builder for constructing an instance of [PendingOperation]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PendingOperation]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var phoneNumber: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(pendingOperation: PendingOperation) = apply {
                id = pendingOperation.id
                phoneNumber = pendingOperation.phoneNumber
                additionalProperties = pendingOperation.additionalProperties.toMutableMap()
            }

            /** The phone number's ID */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The phone number in e164 format. */
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
             * Returns an immutable instance of [PendingOperation].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): PendingOperation =
                PendingOperation(id, phoneNumber, additionalProperties.toMutableMap())
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
        fun validate(): PendingOperation = apply {
            if (validated) {
                return@apply
            }

            id()
            phoneNumber()
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
            (if (id.asKnown().isPresent) 1 else 0) + (if (phoneNumber.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PendingOperation &&
                id == other.id &&
                phoneNumber == other.phoneNumber &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(id, phoneNumber, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PendingOperation{id=$id, phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
    }

    /** Indicates the completion status of the background update. */
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

            @JvmField val PENDING = of("pending")

            @JvmField val IN_PROGRESS = of("in_progress")

            @JvmField val COMPLETED = of("completed")

            @JvmField val FAILED = of("failed")

            @JvmField val EXPIRED = of("expired")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            PENDING,
            IN_PROGRESS,
            COMPLETED,
            FAILED,
            EXPIRED,
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
            PENDING,
            IN_PROGRESS,
            COMPLETED,
            FAILED,
            EXPIRED,
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
                PENDING -> Value.PENDING
                IN_PROGRESS -> Value.IN_PROGRESS
                COMPLETED -> Value.COMPLETED
                FAILED -> Value.FAILED
                EXPIRED -> Value.EXPIRED
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
                PENDING -> Known.PENDING
                IN_PROGRESS -> Known.IN_PROGRESS
                COMPLETED -> Known.COMPLETED
                FAILED -> Known.FAILED
                EXPIRED -> Known.EXPIRED
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

    /** The phone numbers successfully updated. */
    class SuccessfulOperation
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val phoneNumber: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("phone_number")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of(),
        ) : this(id, phoneNumber, mutableMapOf())

        /**
         * The phone number's ID
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * The phone number in e164 format.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phone_number")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [phoneNumber].
         *
         * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phone_number")
        @ExcludeMissing
        fun _phoneNumber(): JsonField<String> = phoneNumber

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

            /** Returns a mutable builder for constructing an instance of [SuccessfulOperation]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SuccessfulOperation]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var phoneNumber: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(successfulOperation: SuccessfulOperation) = apply {
                id = successfulOperation.id
                phoneNumber = successfulOperation.phoneNumber
                additionalProperties = successfulOperation.additionalProperties.toMutableMap()
            }

            /** The phone number's ID */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The phone number in e164 format. */
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
             * Returns an immutable instance of [SuccessfulOperation].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): SuccessfulOperation =
                SuccessfulOperation(id, phoneNumber, additionalProperties.toMutableMap())
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
        fun validate(): SuccessfulOperation = apply {
            if (validated) {
                return@apply
            }

            id()
            phoneNumber()
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
            (if (id.asKnown().isPresent) 1 else 0) + (if (phoneNumber.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SuccessfulOperation &&
                id == other.id &&
                phoneNumber == other.phoneNumber &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(id, phoneNumber, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SuccessfulOperation{id=$id, phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
    }

    /** Identifies the type of the background job. */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val UPDATE_EMERGENCY_SETTINGS = of("update_emergency_settings")

            @JvmField val DELETE_PHONE_NUMBERS = of("delete_phone_numbers")

            @JvmField val UPDATE_PHONE_NUMBERS = of("update_phone_numbers")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            UPDATE_EMERGENCY_SETTINGS,
            DELETE_PHONE_NUMBERS,
            UPDATE_PHONE_NUMBERS,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            UPDATE_EMERGENCY_SETTINGS,
            DELETE_PHONE_NUMBERS,
            UPDATE_PHONE_NUMBERS,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                UPDATE_EMERGENCY_SETTINGS -> Value.UPDATE_EMERGENCY_SETTINGS
                DELETE_PHONE_NUMBERS -> Value.DELETE_PHONE_NUMBERS
                UPDATE_PHONE_NUMBERS -> Value.UPDATE_PHONE_NUMBERS
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
                UPDATE_EMERGENCY_SETTINGS -> Known.UPDATE_EMERGENCY_SETTINGS
                DELETE_PHONE_NUMBERS -> Known.DELETE_PHONE_NUMBERS
                UPDATE_PHONE_NUMBERS -> Known.UPDATE_PHONE_NUMBERS
                else -> throw TelnyxInvalidDataException("Unknown Type: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Type = apply {
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NumbersPhoneNumbersJob &&
            id == other.id &&
            createdAt == other.createdAt &&
            etc == other.etc &&
            failedOperations == other.failedOperations &&
            parameters == other.parameters &&
            pendingOperations == other.pendingOperations &&
            phoneNumbers == other.phoneNumbers &&
            recordType == other.recordType &&
            status == other.status &&
            successfulOperations == other.successfulOperations &&
            type == other.type &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            etc,
            failedOperations,
            parameters,
            pendingOperations,
            phoneNumbers,
            recordType,
            status,
            successfulOperations,
            type,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NumbersPhoneNumbersJob{id=$id, createdAt=$createdAt, etc=$etc, failedOperations=$failedOperations, parameters=$parameters, pendingOperations=$pendingOperations, phoneNumbers=$phoneNumbers, recordType=$recordType, status=$status, successfulOperations=$successfulOperations, type=$type, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
