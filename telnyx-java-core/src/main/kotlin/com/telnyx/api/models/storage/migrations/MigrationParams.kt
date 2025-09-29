// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.storage.migrations

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.Enum
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.checkRequired
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class MigrationParams
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val sourceId: JsonField<String>,
    private val targetBucketName: JsonField<String>,
    private val targetRegion: JsonField<String>,
    private val id: JsonField<String>,
    private val bytesMigrated: JsonField<Long>,
    private val bytesToMigrate: JsonField<Long>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val eta: JsonField<OffsetDateTime>,
    private val lastCopy: JsonField<OffsetDateTime>,
    private val refresh: JsonField<Boolean>,
    private val speed: JsonField<Long>,
    private val status: JsonField<Status>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("source_id") @ExcludeMissing sourceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("target_bucket_name")
        @ExcludeMissing
        targetBucketName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("target_region")
        @ExcludeMissing
        targetRegion: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("bytes_migrated")
        @ExcludeMissing
        bytesMigrated: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("bytes_to_migrate")
        @ExcludeMissing
        bytesToMigrate: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("eta") @ExcludeMissing eta: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("last_copy")
        @ExcludeMissing
        lastCopy: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("refresh") @ExcludeMissing refresh: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("speed") @ExcludeMissing speed: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
    ) : this(
        sourceId,
        targetBucketName,
        targetRegion,
        id,
        bytesMigrated,
        bytesToMigrate,
        createdAt,
        eta,
        lastCopy,
        refresh,
        speed,
        status,
        mutableMapOf(),
    )

    /**
     * ID of the Migration Source from which to migrate data.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sourceId(): String = sourceId.getRequired("source_id")

    /**
     * Bucket name to migrate the data into. Will default to the same name as the
     * `source_bucket_name`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun targetBucketName(): String = targetBucketName.getRequired("target_bucket_name")

    /**
     * Telnyx Cloud Storage region to migrate the data to.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun targetRegion(): String = targetRegion.getRequired("target_region")

    /**
     * Unique identifier for the data migration.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Total amount of data that has been succesfully migrated.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bytesMigrated(): Optional<Long> = bytesMigrated.getOptional("bytes_migrated")

    /**
     * Total amount of data found in source bucket to migrate.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bytesToMigrate(): Optional<Long> = bytesToMigrate.getOptional("bytes_to_migrate")

    /**
     * Time when data migration was created
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * Estimated time the migration will complete.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun eta(): Optional<OffsetDateTime> = eta.getOptional("eta")

    /**
     * Time when data migration was last copied from the source.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastCopy(): Optional<OffsetDateTime> = lastCopy.getOptional("last_copy")

    /**
     * If true, will continue to poll the source bucket to ensure new data is continually migrated
     * over.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun refresh(): Optional<Boolean> = refresh.getOptional("refresh")

    /**
     * Current speed of the migration.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun speed(): Optional<Long> = speed.getOptional("speed")

    /**
     * Status of the migration.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<Status> = status.getOptional("status")

    /**
     * Returns the raw JSON value of [sourceId].
     *
     * Unlike [sourceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source_id") @ExcludeMissing fun _sourceId(): JsonField<String> = sourceId

    /**
     * Returns the raw JSON value of [targetBucketName].
     *
     * Unlike [targetBucketName], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("target_bucket_name")
    @ExcludeMissing
    fun _targetBucketName(): JsonField<String> = targetBucketName

    /**
     * Returns the raw JSON value of [targetRegion].
     *
     * Unlike [targetRegion], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("target_region")
    @ExcludeMissing
    fun _targetRegion(): JsonField<String> = targetRegion

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [bytesMigrated].
     *
     * Unlike [bytesMigrated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bytes_migrated")
    @ExcludeMissing
    fun _bytesMigrated(): JsonField<Long> = bytesMigrated

    /**
     * Returns the raw JSON value of [bytesToMigrate].
     *
     * Unlike [bytesToMigrate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bytes_to_migrate")
    @ExcludeMissing
    fun _bytesToMigrate(): JsonField<Long> = bytesToMigrate

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [eta].
     *
     * Unlike [eta], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eta") @ExcludeMissing fun _eta(): JsonField<OffsetDateTime> = eta

    /**
     * Returns the raw JSON value of [lastCopy].
     *
     * Unlike [lastCopy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last_copy") @ExcludeMissing fun _lastCopy(): JsonField<OffsetDateTime> = lastCopy

    /**
     * Returns the raw JSON value of [refresh].
     *
     * Unlike [refresh], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("refresh") @ExcludeMissing fun _refresh(): JsonField<Boolean> = refresh

    /**
     * Returns the raw JSON value of [speed].
     *
     * Unlike [speed], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("speed") @ExcludeMissing fun _speed(): JsonField<Long> = speed

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

        /**
         * Returns a mutable builder for constructing an instance of [MigrationParams].
         *
         * The following fields are required:
         * ```java
         * .sourceId()
         * .targetBucketName()
         * .targetRegion()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MigrationParams]. */
    class Builder internal constructor() {

        private var sourceId: JsonField<String>? = null
        private var targetBucketName: JsonField<String>? = null
        private var targetRegion: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var bytesMigrated: JsonField<Long> = JsonMissing.of()
        private var bytesToMigrate: JsonField<Long> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var eta: JsonField<OffsetDateTime> = JsonMissing.of()
        private var lastCopy: JsonField<OffsetDateTime> = JsonMissing.of()
        private var refresh: JsonField<Boolean> = JsonMissing.of()
        private var speed: JsonField<Long> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(migrationParams: MigrationParams) = apply {
            sourceId = migrationParams.sourceId
            targetBucketName = migrationParams.targetBucketName
            targetRegion = migrationParams.targetRegion
            id = migrationParams.id
            bytesMigrated = migrationParams.bytesMigrated
            bytesToMigrate = migrationParams.bytesToMigrate
            createdAt = migrationParams.createdAt
            eta = migrationParams.eta
            lastCopy = migrationParams.lastCopy
            refresh = migrationParams.refresh
            speed = migrationParams.speed
            status = migrationParams.status
            additionalProperties = migrationParams.additionalProperties.toMutableMap()
        }

        /** ID of the Migration Source from which to migrate data. */
        fun sourceId(sourceId: String) = sourceId(JsonField.of(sourceId))

        /**
         * Sets [Builder.sourceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sourceId(sourceId: JsonField<String>) = apply { this.sourceId = sourceId }

        /**
         * Bucket name to migrate the data into. Will default to the same name as the
         * `source_bucket_name`.
         */
        fun targetBucketName(targetBucketName: String) =
            targetBucketName(JsonField.of(targetBucketName))

        /**
         * Sets [Builder.targetBucketName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.targetBucketName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun targetBucketName(targetBucketName: JsonField<String>) = apply {
            this.targetBucketName = targetBucketName
        }

        /** Telnyx Cloud Storage region to migrate the data to. */
        fun targetRegion(targetRegion: String) = targetRegion(JsonField.of(targetRegion))

        /**
         * Sets [Builder.targetRegion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.targetRegion] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun targetRegion(targetRegion: JsonField<String>) = apply {
            this.targetRegion = targetRegion
        }

        /** Unique identifier for the data migration. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Total amount of data that has been succesfully migrated. */
        fun bytesMigrated(bytesMigrated: Long) = bytesMigrated(JsonField.of(bytesMigrated))

        /**
         * Sets [Builder.bytesMigrated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bytesMigrated] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun bytesMigrated(bytesMigrated: JsonField<Long>) = apply {
            this.bytesMigrated = bytesMigrated
        }

        /** Total amount of data found in source bucket to migrate. */
        fun bytesToMigrate(bytesToMigrate: Long) = bytesToMigrate(JsonField.of(bytesToMigrate))

        /**
         * Sets [Builder.bytesToMigrate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bytesToMigrate] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun bytesToMigrate(bytesToMigrate: JsonField<Long>) = apply {
            this.bytesToMigrate = bytesToMigrate
        }

        /** Time when data migration was created */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Estimated time the migration will complete. */
        fun eta(eta: OffsetDateTime) = eta(JsonField.of(eta))

        /**
         * Sets [Builder.eta] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eta] with a well-typed [OffsetDateTime] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eta(eta: JsonField<OffsetDateTime>) = apply { this.eta = eta }

        /** Time when data migration was last copied from the source. */
        fun lastCopy(lastCopy: OffsetDateTime) = lastCopy(JsonField.of(lastCopy))

        /**
         * Sets [Builder.lastCopy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastCopy] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lastCopy(lastCopy: JsonField<OffsetDateTime>) = apply { this.lastCopy = lastCopy }

        /**
         * If true, will continue to poll the source bucket to ensure new data is continually
         * migrated over.
         */
        fun refresh(refresh: Boolean) = refresh(JsonField.of(refresh))

        /**
         * Sets [Builder.refresh] to an arbitrary JSON value.
         *
         * You should usually call [Builder.refresh] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun refresh(refresh: JsonField<Boolean>) = apply { this.refresh = refresh }

        /** Current speed of the migration. */
        fun speed(speed: Long) = speed(JsonField.of(speed))

        /**
         * Sets [Builder.speed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.speed] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun speed(speed: JsonField<Long>) = apply { this.speed = speed }

        /** Status of the migration. */
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
         * Returns an immutable instance of [MigrationParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .sourceId()
         * .targetBucketName()
         * .targetRegion()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MigrationParams =
            MigrationParams(
                checkRequired("sourceId", sourceId),
                checkRequired("targetBucketName", targetBucketName),
                checkRequired("targetRegion", targetRegion),
                id,
                bytesMigrated,
                bytesToMigrate,
                createdAt,
                eta,
                lastCopy,
                refresh,
                speed,
                status,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MigrationParams = apply {
        if (validated) {
            return@apply
        }

        sourceId()
        targetBucketName()
        targetRegion()
        id()
        bytesMigrated()
        bytesToMigrate()
        createdAt()
        eta()
        lastCopy()
        refresh()
        speed()
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
        (if (sourceId.asKnown().isPresent) 1 else 0) +
            (if (targetBucketName.asKnown().isPresent) 1 else 0) +
            (if (targetRegion.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (bytesMigrated.asKnown().isPresent) 1 else 0) +
            (if (bytesToMigrate.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (eta.asKnown().isPresent) 1 else 0) +
            (if (lastCopy.asKnown().isPresent) 1 else 0) +
            (if (refresh.asKnown().isPresent) 1 else 0) +
            (if (speed.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0)

    /** Status of the migration. */
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

            @JvmField val CHECKING = of("checking")

            @JvmField val MIGRATING = of("migrating")

            @JvmField val COMPLETE = of("complete")

            @JvmField val ERROR = of("error")

            @JvmField val STOPPED = of("stopped")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            PENDING,
            CHECKING,
            MIGRATING,
            COMPLETE,
            ERROR,
            STOPPED,
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
            CHECKING,
            MIGRATING,
            COMPLETE,
            ERROR,
            STOPPED,
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
                CHECKING -> Value.CHECKING
                MIGRATING -> Value.MIGRATING
                COMPLETE -> Value.COMPLETE
                ERROR -> Value.ERROR
                STOPPED -> Value.STOPPED
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
                CHECKING -> Known.CHECKING
                MIGRATING -> Known.MIGRATING
                COMPLETE -> Known.COMPLETE
                ERROR -> Known.ERROR
                STOPPED -> Known.STOPPED
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

        return other is MigrationParams &&
            sourceId == other.sourceId &&
            targetBucketName == other.targetBucketName &&
            targetRegion == other.targetRegion &&
            id == other.id &&
            bytesMigrated == other.bytesMigrated &&
            bytesToMigrate == other.bytesToMigrate &&
            createdAt == other.createdAt &&
            eta == other.eta &&
            lastCopy == other.lastCopy &&
            refresh == other.refresh &&
            speed == other.speed &&
            status == other.status &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            sourceId,
            targetBucketName,
            targetRegion,
            id,
            bytesMigrated,
            bytesToMigrate,
            createdAt,
            eta,
            lastCopy,
            refresh,
            speed,
            status,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MigrationParams{sourceId=$sourceId, targetBucketName=$targetBucketName, targetRegion=$targetRegion, id=$id, bytesMigrated=$bytesMigrated, bytesToMigrate=$bytesToMigrate, createdAt=$createdAt, eta=$eta, lastCopy=$lastCopy, refresh=$refresh, speed=$speed, status=$status, additionalProperties=$additionalProperties}"
}
