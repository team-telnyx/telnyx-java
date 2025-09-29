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
import com.telnyx.api.core.checkKnown
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PortingOrdersActivationJob
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val activateAt: JsonField<OffsetDateTime>,
    private val activationType: JsonField<ActivationType>,
    private val activationWindows: JsonField<List<ActivationWindow>>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val recordType: JsonField<String>,
    private val status: JsonField<Status>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("activate_at")
        @ExcludeMissing
        activateAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("activation_type")
        @ExcludeMissing
        activationType: JsonField<ActivationType> = JsonMissing.of(),
        @JsonProperty("activation_windows")
        @ExcludeMissing
        activationWindows: JsonField<List<ActivationWindow>> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        activateAt,
        activationType,
        activationWindows,
        createdAt,
        recordType,
        status,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * Uniquely identifies this activation job
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * ISO 8601 formatted date indicating when the activation job should be executed. This time
     * should be between some activation window.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun activateAt(): Optional<OffsetDateTime> = activateAt.getOptional("activate_at")

    /**
     * Specifies the type of this activation job
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun activationType(): Optional<ActivationType> = activationType.getOptional("activation_type")

    /**
     * List of allowed activation windows for this activation job
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun activationWindows(): Optional<List<ActivationWindow>> =
        activationWindows.getOptional("activation_windows")

    /**
     * ISO 8601 formatted date indicating when the resource was created.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * Identifies the type of the resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordType(): Optional<String> = recordType.getOptional("record_type")

    /**
     * Specifies the status of this activation job
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<Status> = status.getOptional("status")

    /**
     * ISO 8601 formatted date indicating when the resource was created.
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
     * Returns the raw JSON value of [activateAt].
     *
     * Unlike [activateAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("activate_at")
    @ExcludeMissing
    fun _activateAt(): JsonField<OffsetDateTime> = activateAt

    /**
     * Returns the raw JSON value of [activationType].
     *
     * Unlike [activationType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("activation_type")
    @ExcludeMissing
    fun _activationType(): JsonField<ActivationType> = activationType

    /**
     * Returns the raw JSON value of [activationWindows].
     *
     * Unlike [activationWindows], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("activation_windows")
    @ExcludeMissing
    fun _activationWindows(): JsonField<List<ActivationWindow>> = activationWindows

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

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
         * Returns a mutable builder for constructing an instance of [PortingOrdersActivationJob].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PortingOrdersActivationJob]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var activateAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var activationType: JsonField<ActivationType> = JsonMissing.of()
        private var activationWindows: JsonField<MutableList<ActivationWindow>>? = null
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var recordType: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(portingOrdersActivationJob: PortingOrdersActivationJob) = apply {
            id = portingOrdersActivationJob.id
            activateAt = portingOrdersActivationJob.activateAt
            activationType = portingOrdersActivationJob.activationType
            activationWindows =
                portingOrdersActivationJob.activationWindows.map { it.toMutableList() }
            createdAt = portingOrdersActivationJob.createdAt
            recordType = portingOrdersActivationJob.recordType
            status = portingOrdersActivationJob.status
            updatedAt = portingOrdersActivationJob.updatedAt
            additionalProperties = portingOrdersActivationJob.additionalProperties.toMutableMap()
        }

        /** Uniquely identifies this activation job */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * ISO 8601 formatted date indicating when the activation job should be executed. This time
         * should be between some activation window.
         */
        fun activateAt(activateAt: OffsetDateTime) = activateAt(JsonField.of(activateAt))

        /**
         * Sets [Builder.activateAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.activateAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun activateAt(activateAt: JsonField<OffsetDateTime>) = apply {
            this.activateAt = activateAt
        }

        /** Specifies the type of this activation job */
        fun activationType(activationType: ActivationType) =
            activationType(JsonField.of(activationType))

        /**
         * Sets [Builder.activationType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.activationType] with a well-typed [ActivationType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun activationType(activationType: JsonField<ActivationType>) = apply {
            this.activationType = activationType
        }

        /** List of allowed activation windows for this activation job */
        fun activationWindows(activationWindows: List<ActivationWindow>) =
            activationWindows(JsonField.of(activationWindows))

        /**
         * Sets [Builder.activationWindows] to an arbitrary JSON value.
         *
         * You should usually call [Builder.activationWindows] with a well-typed
         * `List<ActivationWindow>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun activationWindows(activationWindows: JsonField<List<ActivationWindow>>) = apply {
            this.activationWindows = activationWindows.map { it.toMutableList() }
        }

        /**
         * Adds a single [ActivationWindow] to [activationWindows].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addActivationWindow(activationWindow: ActivationWindow) = apply {
            activationWindows =
                (activationWindows ?: JsonField.of(mutableListOf())).also {
                    checkKnown("activationWindows", it).add(activationWindow)
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

        /** Specifies the status of this activation job */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** ISO 8601 formatted date indicating when the resource was created. */
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
         * Returns an immutable instance of [PortingOrdersActivationJob].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PortingOrdersActivationJob =
            PortingOrdersActivationJob(
                id,
                activateAt,
                activationType,
                (activationWindows ?: JsonMissing.of()).map { it.toImmutable() },
                createdAt,
                recordType,
                status,
                updatedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PortingOrdersActivationJob = apply {
        if (validated) {
            return@apply
        }

        id()
        activateAt()
        activationType().ifPresent { it.validate() }
        activationWindows().ifPresent { it.forEach { it.validate() } }
        createdAt()
        recordType()
        status().ifPresent { it.validate() }
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
            (if (activateAt.asKnown().isPresent) 1 else 0) +
            (activationType.asKnown().getOrNull()?.validity() ?: 0) +
            (activationWindows.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (recordType.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    /** Specifies the type of this activation job */
    class ActivationType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val SCHEDULED = of("scheduled")

            @JvmField val ON_DEMAND = of("on-demand")

            @JvmStatic fun of(value: String) = ActivationType(JsonField.of(value))
        }

        /** An enum containing [ActivationType]'s known values. */
        enum class Known {
            SCHEDULED,
            ON_DEMAND,
        }

        /**
         * An enum containing [ActivationType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ActivationType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SCHEDULED,
            ON_DEMAND,
            /**
             * An enum member indicating that [ActivationType] was instantiated with an unknown
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
                SCHEDULED -> Value.SCHEDULED
                ON_DEMAND -> Value.ON_DEMAND
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
                SCHEDULED -> Known.SCHEDULED
                ON_DEMAND -> Known.ON_DEMAND
                else -> throw TelnyxInvalidDataException("Unknown ActivationType: $value")
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

        fun validate(): ActivationType = apply {
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

            return other is ActivationType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class ActivationWindow
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val endAt: JsonField<OffsetDateTime>,
        private val startAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("end_at")
            @ExcludeMissing
            endAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("start_at")
            @ExcludeMissing
            startAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(endAt, startAt, mutableMapOf())

        /**
         * ISO 8601 formatted date indicating when the activation window ends
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endAt(): Optional<OffsetDateTime> = endAt.getOptional("end_at")

        /**
         * ISO 8601 formatted date indicating when the activation window starts
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun startAt(): Optional<OffsetDateTime> = startAt.getOptional("start_at")

        /**
         * Returns the raw JSON value of [endAt].
         *
         * Unlike [endAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_at") @ExcludeMissing fun _endAt(): JsonField<OffsetDateTime> = endAt

        /**
         * Returns the raw JSON value of [startAt].
         *
         * Unlike [startAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_at")
        @ExcludeMissing
        fun _startAt(): JsonField<OffsetDateTime> = startAt

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

            /** Returns a mutable builder for constructing an instance of [ActivationWindow]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ActivationWindow]. */
        class Builder internal constructor() {

            private var endAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var startAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(activationWindow: ActivationWindow) = apply {
                endAt = activationWindow.endAt
                startAt = activationWindow.startAt
                additionalProperties = activationWindow.additionalProperties.toMutableMap()
            }

            /** ISO 8601 formatted date indicating when the activation window ends */
            fun endAt(endAt: OffsetDateTime) = endAt(JsonField.of(endAt))

            /**
             * Sets [Builder.endAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endAt(endAt: JsonField<OffsetDateTime>) = apply { this.endAt = endAt }

            /** ISO 8601 formatted date indicating when the activation window starts */
            fun startAt(startAt: OffsetDateTime) = startAt(JsonField.of(startAt))

            /**
             * Sets [Builder.startAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startAt(startAt: JsonField<OffsetDateTime>) = apply { this.startAt = startAt }

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
             * Returns an immutable instance of [ActivationWindow].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ActivationWindow =
                ActivationWindow(endAt, startAt, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): ActivationWindow = apply {
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

            return other is ActivationWindow &&
                endAt == other.endAt &&
                startAt == other.startAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(endAt, startAt, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ActivationWindow{endAt=$endAt, startAt=$startAt, additionalProperties=$additionalProperties}"
    }

    /** Specifies the status of this activation job */
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

            @JvmField val CREATED = of("created")

            @JvmField val IN_PROCESS = of("in-process")

            @JvmField val COMPLETED = of("completed")

            @JvmField val FAILED = of("failed")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            CREATED,
            IN_PROCESS,
            COMPLETED,
            FAILED,
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
            CREATED,
            IN_PROCESS,
            COMPLETED,
            FAILED,
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
                CREATED -> Value.CREATED
                IN_PROCESS -> Value.IN_PROCESS
                COMPLETED -> Value.COMPLETED
                FAILED -> Value.FAILED
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
                CREATED -> Known.CREATED
                IN_PROCESS -> Known.IN_PROCESS
                COMPLETED -> Known.COMPLETED
                FAILED -> Known.FAILED
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

        return other is PortingOrdersActivationJob &&
            id == other.id &&
            activateAt == other.activateAt &&
            activationType == other.activationType &&
            activationWindows == other.activationWindows &&
            createdAt == other.createdAt &&
            recordType == other.recordType &&
            status == other.status &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            activateAt,
            activationType,
            activationWindows,
            createdAt,
            recordType,
            status,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PortingOrdersActivationJob{id=$id, activateAt=$activateAt, activationType=$activationType, activationWindows=$activationWindows, createdAt=$createdAt, recordType=$recordType, status=$status, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
