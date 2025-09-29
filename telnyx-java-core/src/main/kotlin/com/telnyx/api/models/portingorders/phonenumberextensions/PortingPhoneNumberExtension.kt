// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.portingorders.phonenumberextensions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.checkKnown
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PortingPhoneNumberExtension
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val activationRanges: JsonField<List<ActivationRange>>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val extensionRange: JsonField<ExtensionRange>,
    private val portingPhoneNumberId: JsonField<String>,
    private val recordType: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("activation_ranges")
        @ExcludeMissing
        activationRanges: JsonField<List<ActivationRange>> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("extension_range")
        @ExcludeMissing
        extensionRange: JsonField<ExtensionRange> = JsonMissing.of(),
        @JsonProperty("porting_phone_number_id")
        @ExcludeMissing
        portingPhoneNumberId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        activationRanges,
        createdAt,
        extensionRange,
        portingPhoneNumberId,
        recordType,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * Uniquely identifies this porting phone number extension.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Specifies the activation ranges for this porting phone number extension. The activation range
     * must be within the extension range and should not overlap with other activation ranges.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun activationRanges(): Optional<List<ActivationRange>> =
        activationRanges.getOptional("activation_ranges")

    /**
     * ISO 8601 formatted date indicating when the resource was created.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * Specifies the extension range for this porting phone number extension.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun extensionRange(): Optional<ExtensionRange> = extensionRange.getOptional("extension_range")

    /**
     * Identifies the porting phone number associated with this porting phone number extension.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun portingPhoneNumberId(): Optional<String> =
        portingPhoneNumberId.getOptional("porting_phone_number_id")

    /**
     * Identifies the type of the resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordType(): Optional<String> = recordType.getOptional("record_type")

    /**
     * ISO 8601 formatted date indicating when the resource was last updated.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [activationRanges].
     *
     * Unlike [activationRanges], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("activation_ranges")
    @ExcludeMissing
    fun _activationRanges(): JsonField<List<ActivationRange>> = activationRanges

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [extensionRange].
     *
     * Unlike [extensionRange], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("extension_range")
    @ExcludeMissing
    fun _extensionRange(): JsonField<ExtensionRange> = extensionRange

    /**
     * Returns the raw JSON value of [portingPhoneNumberId].
     *
     * Unlike [portingPhoneNumberId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("porting_phone_number_id")
    @ExcludeMissing
    fun _portingPhoneNumberId(): JsonField<String> = portingPhoneNumberId

    /**
     * Returns the raw JSON value of [recordType].
     *
     * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("record_type") @ExcludeMissing fun _recordType(): JsonField<String> = recordType

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
         * Returns a mutable builder for constructing an instance of [PortingPhoneNumberExtension].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PortingPhoneNumberExtension]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var activationRanges: JsonField<MutableList<ActivationRange>>? = null
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var extensionRange: JsonField<ExtensionRange> = JsonMissing.of()
        private var portingPhoneNumberId: JsonField<String> = JsonMissing.of()
        private var recordType: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(portingPhoneNumberExtension: PortingPhoneNumberExtension) = apply {
            id = portingPhoneNumberExtension.id
            activationRanges =
                portingPhoneNumberExtension.activationRanges.map { it.toMutableList() }
            createdAt = portingPhoneNumberExtension.createdAt
            extensionRange = portingPhoneNumberExtension.extensionRange
            portingPhoneNumberId = portingPhoneNumberExtension.portingPhoneNumberId
            recordType = portingPhoneNumberExtension.recordType
            updatedAt = portingPhoneNumberExtension.updatedAt
            additionalProperties = portingPhoneNumberExtension.additionalProperties.toMutableMap()
        }

        /** Uniquely identifies this porting phone number extension. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * Specifies the activation ranges for this porting phone number extension. The activation
         * range must be within the extension range and should not overlap with other activation
         * ranges.
         */
        fun activationRanges(activationRanges: List<ActivationRange>) =
            activationRanges(JsonField.of(activationRanges))

        /**
         * Sets [Builder.activationRanges] to an arbitrary JSON value.
         *
         * You should usually call [Builder.activationRanges] with a well-typed
         * `List<ActivationRange>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun activationRanges(activationRanges: JsonField<List<ActivationRange>>) = apply {
            this.activationRanges = activationRanges.map { it.toMutableList() }
        }

        /**
         * Adds a single [ActivationRange] to [activationRanges].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addActivationRange(activationRange: ActivationRange) = apply {
            activationRanges =
                (activationRanges ?: JsonField.of(mutableListOf())).also {
                    checkKnown("activationRanges", it).add(activationRange)
                }
        }

        /** ISO 8601 formatted date indicating when the resource was created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Specifies the extension range for this porting phone number extension. */
        fun extensionRange(extensionRange: ExtensionRange) =
            extensionRange(JsonField.of(extensionRange))

        /**
         * Sets [Builder.extensionRange] to an arbitrary JSON value.
         *
         * You should usually call [Builder.extensionRange] with a well-typed [ExtensionRange] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun extensionRange(extensionRange: JsonField<ExtensionRange>) = apply {
            this.extensionRange = extensionRange
        }

        /**
         * Identifies the porting phone number associated with this porting phone number extension.
         */
        fun portingPhoneNumberId(portingPhoneNumberId: String) =
            portingPhoneNumberId(JsonField.of(portingPhoneNumberId))

        /**
         * Sets [Builder.portingPhoneNumberId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.portingPhoneNumberId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun portingPhoneNumberId(portingPhoneNumberId: JsonField<String>) = apply {
            this.portingPhoneNumberId = portingPhoneNumberId
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

        /** ISO 8601 formatted date indicating when the resource was last updated. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [PortingPhoneNumberExtension].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PortingPhoneNumberExtension =
            PortingPhoneNumberExtension(
                id,
                (activationRanges ?: JsonMissing.of()).map { it.toImmutable() },
                createdAt,
                extensionRange,
                portingPhoneNumberId,
                recordType,
                updatedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PortingPhoneNumberExtension = apply {
        if (validated) {
            return@apply
        }

        id()
        activationRanges().ifPresent { it.forEach { it.validate() } }
        createdAt()
        extensionRange().ifPresent { it.validate() }
        portingPhoneNumberId()
        recordType()
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
            (activationRanges.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (extensionRange.asKnown().getOrNull()?.validity() ?: 0) +
            (if (portingPhoneNumberId.asKnown().isPresent) 1 else 0) +
            (if (recordType.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    class ActivationRange
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val endAt: JsonField<Long>,
        private val startAt: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("end_at") @ExcludeMissing endAt: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("start_at") @ExcludeMissing startAt: JsonField<Long> = JsonMissing.of(),
        ) : this(endAt, startAt, mutableMapOf())

        /**
         * Specifies the end of the activation range. It must be no more than the end of the
         * extension range.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endAt(): Optional<Long> = endAt.getOptional("end_at")

        /**
         * Specifies the start of the activation range. Must be greater or equal the start of the
         * extension range.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun startAt(): Optional<Long> = startAt.getOptional("start_at")

        /**
         * Returns the raw JSON value of [endAt].
         *
         * Unlike [endAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_at") @ExcludeMissing fun _endAt(): JsonField<Long> = endAt

        /**
         * Returns the raw JSON value of [startAt].
         *
         * Unlike [startAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_at") @ExcludeMissing fun _startAt(): JsonField<Long> = startAt

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

            /** Returns a mutable builder for constructing an instance of [ActivationRange]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ActivationRange]. */
        class Builder internal constructor() {

            private var endAt: JsonField<Long> = JsonMissing.of()
            private var startAt: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(activationRange: ActivationRange) = apply {
                endAt = activationRange.endAt
                startAt = activationRange.startAt
                additionalProperties = activationRange.additionalProperties.toMutableMap()
            }

            /**
             * Specifies the end of the activation range. It must be no more than the end of the
             * extension range.
             */
            fun endAt(endAt: Long) = endAt(JsonField.of(endAt))

            /**
             * Sets [Builder.endAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endAt] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun endAt(endAt: JsonField<Long>) = apply { this.endAt = endAt }

            /**
             * Specifies the start of the activation range. Must be greater or equal the start of
             * the extension range.
             */
            fun startAt(startAt: Long) = startAt(JsonField.of(startAt))

            /**
             * Sets [Builder.startAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startAt] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startAt(startAt: JsonField<Long>) = apply { this.startAt = startAt }

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
             * Returns an immutable instance of [ActivationRange].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ActivationRange =
                ActivationRange(endAt, startAt, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): ActivationRange = apply {
            if (validated) {
                return@apply
            }

            endAt()
            startAt()
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
            (if (endAt.asKnown().isPresent) 1 else 0) + (if (startAt.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ActivationRange &&
                endAt == other.endAt &&
                startAt == other.startAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(endAt, startAt, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ActivationRange{endAt=$endAt, startAt=$startAt, additionalProperties=$additionalProperties}"
    }

    /** Specifies the extension range for this porting phone number extension. */
    class ExtensionRange
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val endAt: JsonField<Long>,
        private val startAt: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("end_at") @ExcludeMissing endAt: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("start_at") @ExcludeMissing startAt: JsonField<Long> = JsonMissing.of(),
        ) : this(endAt, startAt, mutableMapOf())

        /**
         * Specifies the end of the extension range for this porting phone number extension.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endAt(): Optional<Long> = endAt.getOptional("end_at")

        /**
         * Specifies the start of the extension range for this porting phone number extension.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun startAt(): Optional<Long> = startAt.getOptional("start_at")

        /**
         * Returns the raw JSON value of [endAt].
         *
         * Unlike [endAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_at") @ExcludeMissing fun _endAt(): JsonField<Long> = endAt

        /**
         * Returns the raw JSON value of [startAt].
         *
         * Unlike [startAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_at") @ExcludeMissing fun _startAt(): JsonField<Long> = startAt

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

            /** Returns a mutable builder for constructing an instance of [ExtensionRange]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ExtensionRange]. */
        class Builder internal constructor() {

            private var endAt: JsonField<Long> = JsonMissing.of()
            private var startAt: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(extensionRange: ExtensionRange) = apply {
                endAt = extensionRange.endAt
                startAt = extensionRange.startAt
                additionalProperties = extensionRange.additionalProperties.toMutableMap()
            }

            /** Specifies the end of the extension range for this porting phone number extension. */
            fun endAt(endAt: Long) = endAt(JsonField.of(endAt))

            /**
             * Sets [Builder.endAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endAt] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun endAt(endAt: JsonField<Long>) = apply { this.endAt = endAt }

            /**
             * Specifies the start of the extension range for this porting phone number extension.
             */
            fun startAt(startAt: Long) = startAt(JsonField.of(startAt))

            /**
             * Sets [Builder.startAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startAt] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startAt(startAt: JsonField<Long>) = apply { this.startAt = startAt }

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
             * Returns an immutable instance of [ExtensionRange].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ExtensionRange =
                ExtensionRange(endAt, startAt, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): ExtensionRange = apply {
            if (validated) {
                return@apply
            }

            endAt()
            startAt()
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
            (if (endAt.asKnown().isPresent) 1 else 0) + (if (startAt.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ExtensionRange &&
                endAt == other.endAt &&
                startAt == other.startAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(endAt, startAt, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ExtensionRange{endAt=$endAt, startAt=$startAt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PortingPhoneNumberExtension &&
            id == other.id &&
            activationRanges == other.activationRanges &&
            createdAt == other.createdAt &&
            extensionRange == other.extensionRange &&
            portingPhoneNumberId == other.portingPhoneNumberId &&
            recordType == other.recordType &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            activationRanges,
            createdAt,
            extensionRange,
            portingPhoneNumberId,
            recordType,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PortingPhoneNumberExtension{id=$id, activationRanges=$activationRanges, createdAt=$createdAt, extensionRange=$extensionRange, portingPhoneNumberId=$portingPhoneNumberId, recordType=$recordType, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
