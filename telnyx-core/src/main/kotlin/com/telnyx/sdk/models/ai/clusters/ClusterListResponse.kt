// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.clusters

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
import com.telnyx.sdk.models.messaging10dlc.phonenumberassignmentbyprofile.TaskStatus
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class ClusterListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val bucket: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val finishedAt: JsonField<OffsetDateTime>,
    private val minClusterSize: JsonField<Long>,
    private val minSubclusterSize: JsonField<Long>,
    private val status: JsonField<TaskStatus>,
    private val taskId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("bucket") @ExcludeMissing bucket: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("finished_at")
        @ExcludeMissing
        finishedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("min_cluster_size")
        @ExcludeMissing
        minClusterSize: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("min_subcluster_size")
        @ExcludeMissing
        minSubclusterSize: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<TaskStatus> = JsonMissing.of(),
        @JsonProperty("task_id") @ExcludeMissing taskId: JsonField<String> = JsonMissing.of(),
    ) : this(
        bucket,
        createdAt,
        finishedAt,
        minClusterSize,
        minSubclusterSize,
        status,
        taskId,
        mutableMapOf(),
    )

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun bucket(): String = bucket.getRequired("bucket")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun finishedAt(): OffsetDateTime = finishedAt.getRequired("finished_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun minClusterSize(): Long = minClusterSize.getRequired("min_cluster_size")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun minSubclusterSize(): Long = minSubclusterSize.getRequired("min_subcluster_size")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): TaskStatus = status.getRequired("status")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun taskId(): String = taskId.getRequired("task_id")

    /**
     * Returns the raw JSON value of [bucket].
     *
     * Unlike [bucket], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bucket") @ExcludeMissing fun _bucket(): JsonField<String> = bucket

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [finishedAt].
     *
     * Unlike [finishedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("finished_at")
    @ExcludeMissing
    fun _finishedAt(): JsonField<OffsetDateTime> = finishedAt

    /**
     * Returns the raw JSON value of [minClusterSize].
     *
     * Unlike [minClusterSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("min_cluster_size")
    @ExcludeMissing
    fun _minClusterSize(): JsonField<Long> = minClusterSize

    /**
     * Returns the raw JSON value of [minSubclusterSize].
     *
     * Unlike [minSubclusterSize], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("min_subcluster_size")
    @ExcludeMissing
    fun _minSubclusterSize(): JsonField<Long> = minSubclusterSize

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<TaskStatus> = status

    /**
     * Returns the raw JSON value of [taskId].
     *
     * Unlike [taskId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("task_id") @ExcludeMissing fun _taskId(): JsonField<String> = taskId

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
         * Returns a mutable builder for constructing an instance of [ClusterListResponse].
         *
         * The following fields are required:
         * ```java
         * .bucket()
         * .createdAt()
         * .finishedAt()
         * .minClusterSize()
         * .minSubclusterSize()
         * .status()
         * .taskId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ClusterListResponse]. */
    class Builder internal constructor() {

        private var bucket: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var finishedAt: JsonField<OffsetDateTime>? = null
        private var minClusterSize: JsonField<Long>? = null
        private var minSubclusterSize: JsonField<Long>? = null
        private var status: JsonField<TaskStatus>? = null
        private var taskId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(clusterListResponse: ClusterListResponse) = apply {
            bucket = clusterListResponse.bucket
            createdAt = clusterListResponse.createdAt
            finishedAt = clusterListResponse.finishedAt
            minClusterSize = clusterListResponse.minClusterSize
            minSubclusterSize = clusterListResponse.minSubclusterSize
            status = clusterListResponse.status
            taskId = clusterListResponse.taskId
            additionalProperties = clusterListResponse.additionalProperties.toMutableMap()
        }

        fun bucket(bucket: String) = bucket(JsonField.of(bucket))

        /**
         * Sets [Builder.bucket] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bucket] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun bucket(bucket: JsonField<String>) = apply { this.bucket = bucket }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun finishedAt(finishedAt: OffsetDateTime) = finishedAt(JsonField.of(finishedAt))

        /**
         * Sets [Builder.finishedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.finishedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun finishedAt(finishedAt: JsonField<OffsetDateTime>) = apply {
            this.finishedAt = finishedAt
        }

        fun minClusterSize(minClusterSize: Long) = minClusterSize(JsonField.of(minClusterSize))

        /**
         * Sets [Builder.minClusterSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minClusterSize] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun minClusterSize(minClusterSize: JsonField<Long>) = apply {
            this.minClusterSize = minClusterSize
        }

        fun minSubclusterSize(minSubclusterSize: Long) =
            minSubclusterSize(JsonField.of(minSubclusterSize))

        /**
         * Sets [Builder.minSubclusterSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minSubclusterSize] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun minSubclusterSize(minSubclusterSize: JsonField<Long>) = apply {
            this.minSubclusterSize = minSubclusterSize
        }

        fun status(status: TaskStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [TaskStatus] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun status(status: JsonField<TaskStatus>) = apply { this.status = status }

        fun taskId(taskId: String) = taskId(JsonField.of(taskId))

        /**
         * Sets [Builder.taskId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taskId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun taskId(taskId: JsonField<String>) = apply { this.taskId = taskId }

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
         * Returns an immutable instance of [ClusterListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .bucket()
         * .createdAt()
         * .finishedAt()
         * .minClusterSize()
         * .minSubclusterSize()
         * .status()
         * .taskId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ClusterListResponse =
            ClusterListResponse(
                checkRequired("bucket", bucket),
                checkRequired("createdAt", createdAt),
                checkRequired("finishedAt", finishedAt),
                checkRequired("minClusterSize", minClusterSize),
                checkRequired("minSubclusterSize", minSubclusterSize),
                checkRequired("status", status),
                checkRequired("taskId", taskId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ClusterListResponse = apply {
        if (validated) {
            return@apply
        }

        bucket()
        createdAt()
        finishedAt()
        minClusterSize()
        minSubclusterSize()
        status().validate()
        taskId()
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
        (if (bucket.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (finishedAt.asKnown().isPresent) 1 else 0) +
            (if (minClusterSize.asKnown().isPresent) 1 else 0) +
            (if (minSubclusterSize.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (taskId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ClusterListResponse &&
            bucket == other.bucket &&
            createdAt == other.createdAt &&
            finishedAt == other.finishedAt &&
            minClusterSize == other.minClusterSize &&
            minSubclusterSize == other.minSubclusterSize &&
            status == other.status &&
            taskId == other.taskId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            bucket,
            createdAt,
            finishedAt,
            minClusterSize,
            minSubclusterSize,
            status,
            taskId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ClusterListResponse{bucket=$bucket, createdAt=$createdAt, finishedAt=$finishedAt, minClusterSize=$minClusterSize, minSubclusterSize=$minSubclusterSize, status=$status, taskId=$taskId, additionalProperties=$additionalProperties}"
}
