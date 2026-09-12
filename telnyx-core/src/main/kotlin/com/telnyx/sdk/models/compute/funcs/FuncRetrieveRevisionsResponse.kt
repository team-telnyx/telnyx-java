// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.compute.funcs

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class FuncRetrieveRevisionsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<List<Data>>,
    private val meta: JsonField<FunctionsObservabilityPaginationMeta>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<List<Data>> = JsonMissing.of(),
        @JsonProperty("meta")
        @ExcludeMissing
        meta: JsonField<FunctionsObservabilityPaginationMeta> = JsonMissing.of(),
    ) : this(data, meta, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): Optional<List<Data>> = data.getOptional("data")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun meta(): Optional<FunctionsObservabilityPaginationMeta> = meta.getOptional("meta")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Data>> = data

    /**
     * Returns the raw JSON value of [meta].
     *
     * Unlike [meta], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("meta")
    @ExcludeMissing
    fun _meta(): JsonField<FunctionsObservabilityPaginationMeta> = meta

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
         * [FuncRetrieveRevisionsResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FuncRetrieveRevisionsResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var meta: JsonField<FunctionsObservabilityPaginationMeta> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(funcRetrieveRevisionsResponse: FuncRetrieveRevisionsResponse) = apply {
            data = funcRetrieveRevisionsResponse.data.map { it.toMutableList() }
            meta = funcRetrieveRevisionsResponse.meta
            additionalProperties = funcRetrieveRevisionsResponse.additionalProperties.toMutableMap()
        }

        fun data(data: List<Data>) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed `List<Data>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<List<Data>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        /**
         * Adds a single [Data] to [Builder.data].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addData(data: Data) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).also {
                    checkKnown("data", it).add(data)
                }
        }

        fun meta(meta: FunctionsObservabilityPaginationMeta) = meta(JsonField.of(meta))

        /**
         * Sets [Builder.meta] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meta] with a well-typed
         * [FunctionsObservabilityPaginationMeta] value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun meta(meta: JsonField<FunctionsObservabilityPaginationMeta>) = apply { this.meta = meta }

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
         * Returns an immutable instance of [FuncRetrieveRevisionsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): FuncRetrieveRevisionsResponse =
            FuncRetrieveRevisionsResponse(
                (data ?: JsonMissing.of()).map { it.toImmutable() },
                meta,
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
    fun validate(): FuncRetrieveRevisionsResponse = apply {
        if (validated) {
            return@apply
        }

        data().ifPresent { it.forEach { it.validate() } }
        meta().ifPresent { it.validate() }
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
        (data.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (meta.asKnown().getOrNull()?.validity() ?: 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val active: JsonField<Boolean>,
        private val buildOkAt: JsonField<OffsetDateTime>,
        private val buildStatus: JsonField<String>,
        private val commitSha: JsonField<String>,
        private val deployStatus: JsonField<String>,
        private val failureReason: JsonField<String>,
        private val failureStage: JsonField<String>,
        private val image: JsonField<String>,
        private val recordType: JsonField<String>,
        private val revisionId: JsonField<String>,
        private val shippedAt: JsonField<OffsetDateTime>,
        private val shippedBy: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("active") @ExcludeMissing active: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("build_ok_at")
            @ExcludeMissing
            buildOkAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("build_status")
            @ExcludeMissing
            buildStatus: JsonField<String> = JsonMissing.of(),
            @JsonProperty("commit_sha")
            @ExcludeMissing
            commitSha: JsonField<String> = JsonMissing.of(),
            @JsonProperty("deploy_status")
            @ExcludeMissing
            deployStatus: JsonField<String> = JsonMissing.of(),
            @JsonProperty("failure_reason")
            @ExcludeMissing
            failureReason: JsonField<String> = JsonMissing.of(),
            @JsonProperty("failure_stage")
            @ExcludeMissing
            failureStage: JsonField<String> = JsonMissing.of(),
            @JsonProperty("image") @ExcludeMissing image: JsonField<String> = JsonMissing.of(),
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("revision_id")
            @ExcludeMissing
            revisionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("shipped_at")
            @ExcludeMissing
            shippedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("shipped_by")
            @ExcludeMissing
            shippedBy: JsonField<String> = JsonMissing.of(),
        ) : this(
            active,
            buildOkAt,
            buildStatus,
            commitSha,
            deployStatus,
            failureReason,
            failureStage,
            image,
            recordType,
            revisionId,
            shippedAt,
            shippedBy,
            mutableMapOf(),
        )

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun active(): Optional<Boolean> = active.getOptional("active")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun buildOkAt(): Optional<OffsetDateTime> = buildOkAt.getOptional("build_ok_at")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun buildStatus(): Optional<String> = buildStatus.getOptional("build_status")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun commitSha(): Optional<String> = commitSha.getOptional("commit_sha")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun deployStatus(): Optional<String> = deployStatus.getOptional("deploy_status")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun failureReason(): Optional<String> = failureReason.getOptional("failure_reason")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun failureStage(): Optional<String> = failureStage.getOptional("failure_stage")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun image(): Optional<String> = image.getOptional("image")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordType(): Optional<String> = recordType.getOptional("record_type")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun revisionId(): Optional<String> = revisionId.getOptional("revision_id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun shippedAt(): Optional<OffsetDateTime> = shippedAt.getOptional("shipped_at")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun shippedBy(): Optional<String> = shippedBy.getOptional("shipped_by")

        /**
         * Returns the raw JSON value of [active].
         *
         * Unlike [active], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("active") @ExcludeMissing fun _active(): JsonField<Boolean> = active

        /**
         * Returns the raw JSON value of [buildOkAt].
         *
         * Unlike [buildOkAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("build_ok_at")
        @ExcludeMissing
        fun _buildOkAt(): JsonField<OffsetDateTime> = buildOkAt

        /**
         * Returns the raw JSON value of [buildStatus].
         *
         * Unlike [buildStatus], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("build_status")
        @ExcludeMissing
        fun _buildStatus(): JsonField<String> = buildStatus

        /**
         * Returns the raw JSON value of [commitSha].
         *
         * Unlike [commitSha], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("commit_sha") @ExcludeMissing fun _commitSha(): JsonField<String> = commitSha

        /**
         * Returns the raw JSON value of [deployStatus].
         *
         * Unlike [deployStatus], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("deploy_status")
        @ExcludeMissing
        fun _deployStatus(): JsonField<String> = deployStatus

        /**
         * Returns the raw JSON value of [failureReason].
         *
         * Unlike [failureReason], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("failure_reason")
        @ExcludeMissing
        fun _failureReason(): JsonField<String> = failureReason

        /**
         * Returns the raw JSON value of [failureStage].
         *
         * Unlike [failureStage], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("failure_stage")
        @ExcludeMissing
        fun _failureStage(): JsonField<String> = failureStage

        /**
         * Returns the raw JSON value of [image].
         *
         * Unlike [image], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("image") @ExcludeMissing fun _image(): JsonField<String> = image

        /**
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<String> = recordType

        /**
         * Returns the raw JSON value of [revisionId].
         *
         * Unlike [revisionId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("revision_id")
        @ExcludeMissing
        fun _revisionId(): JsonField<String> = revisionId

        /**
         * Returns the raw JSON value of [shippedAt].
         *
         * Unlike [shippedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("shipped_at")
        @ExcludeMissing
        fun _shippedAt(): JsonField<OffsetDateTime> = shippedAt

        /**
         * Returns the raw JSON value of [shippedBy].
         *
         * Unlike [shippedBy], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("shipped_by") @ExcludeMissing fun _shippedBy(): JsonField<String> = shippedBy

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

            private var active: JsonField<Boolean> = JsonMissing.of()
            private var buildOkAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var buildStatus: JsonField<String> = JsonMissing.of()
            private var commitSha: JsonField<String> = JsonMissing.of()
            private var deployStatus: JsonField<String> = JsonMissing.of()
            private var failureReason: JsonField<String> = JsonMissing.of()
            private var failureStage: JsonField<String> = JsonMissing.of()
            private var image: JsonField<String> = JsonMissing.of()
            private var recordType: JsonField<String> = JsonMissing.of()
            private var revisionId: JsonField<String> = JsonMissing.of()
            private var shippedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var shippedBy: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                active = data.active
                buildOkAt = data.buildOkAt
                buildStatus = data.buildStatus
                commitSha = data.commitSha
                deployStatus = data.deployStatus
                failureReason = data.failureReason
                failureStage = data.failureStage
                image = data.image
                recordType = data.recordType
                revisionId = data.revisionId
                shippedAt = data.shippedAt
                shippedBy = data.shippedBy
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun active(active: Boolean) = active(JsonField.of(active))

            /**
             * Sets [Builder.active] to an arbitrary JSON value.
             *
             * You should usually call [Builder.active] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun active(active: JsonField<Boolean>) = apply { this.active = active }

            fun buildOkAt(buildOkAt: OffsetDateTime) = buildOkAt(JsonField.of(buildOkAt))

            /**
             * Sets [Builder.buildOkAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.buildOkAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun buildOkAt(buildOkAt: JsonField<OffsetDateTime>) = apply {
                this.buildOkAt = buildOkAt
            }

            fun buildStatus(buildStatus: String) = buildStatus(JsonField.of(buildStatus))

            /**
             * Sets [Builder.buildStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.buildStatus] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun buildStatus(buildStatus: JsonField<String>) = apply {
                this.buildStatus = buildStatus
            }

            fun commitSha(commitSha: String) = commitSha(JsonField.of(commitSha))

            /**
             * Sets [Builder.commitSha] to an arbitrary JSON value.
             *
             * You should usually call [Builder.commitSha] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun commitSha(commitSha: JsonField<String>) = apply { this.commitSha = commitSha }

            fun deployStatus(deployStatus: String) = deployStatus(JsonField.of(deployStatus))

            /**
             * Sets [Builder.deployStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deployStatus] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun deployStatus(deployStatus: JsonField<String>) = apply {
                this.deployStatus = deployStatus
            }

            fun failureReason(failureReason: String) = failureReason(JsonField.of(failureReason))

            /**
             * Sets [Builder.failureReason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.failureReason] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun failureReason(failureReason: JsonField<String>) = apply {
                this.failureReason = failureReason
            }

            fun failureStage(failureStage: String) = failureStage(JsonField.of(failureStage))

            /**
             * Sets [Builder.failureStage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.failureStage] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun failureStage(failureStage: JsonField<String>) = apply {
                this.failureStage = failureStage
            }

            fun image(image: String) = image(JsonField.of(image))

            /**
             * Sets [Builder.image] to an arbitrary JSON value.
             *
             * You should usually call [Builder.image] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun image(image: JsonField<String>) = apply { this.image = image }

            fun recordType(recordType: String) = recordType(JsonField.of(recordType))

            /**
             * Sets [Builder.recordType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

            fun revisionId(revisionId: String) = revisionId(JsonField.of(revisionId))

            /**
             * Sets [Builder.revisionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.revisionId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun revisionId(revisionId: JsonField<String>) = apply { this.revisionId = revisionId }

            fun shippedAt(shippedAt: OffsetDateTime) = shippedAt(JsonField.of(shippedAt))

            /**
             * Sets [Builder.shippedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.shippedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun shippedAt(shippedAt: JsonField<OffsetDateTime>) = apply {
                this.shippedAt = shippedAt
            }

            fun shippedBy(shippedBy: String) = shippedBy(JsonField.of(shippedBy))

            /**
             * Sets [Builder.shippedBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.shippedBy] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun shippedBy(shippedBy: JsonField<String>) = apply { this.shippedBy = shippedBy }

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
                    active,
                    buildOkAt,
                    buildStatus,
                    commitSha,
                    deployStatus,
                    failureReason,
                    failureStage,
                    image,
                    recordType,
                    revisionId,
                    shippedAt,
                    shippedBy,
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

            active()
            buildOkAt()
            buildStatus()
            commitSha()
            deployStatus()
            failureReason()
            failureStage()
            image()
            recordType()
            revisionId()
            shippedAt()
            shippedBy()
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
            (if (active.asKnown().isPresent) 1 else 0) +
                (if (buildOkAt.asKnown().isPresent) 1 else 0) +
                (if (buildStatus.asKnown().isPresent) 1 else 0) +
                (if (commitSha.asKnown().isPresent) 1 else 0) +
                (if (deployStatus.asKnown().isPresent) 1 else 0) +
                (if (failureReason.asKnown().isPresent) 1 else 0) +
                (if (failureStage.asKnown().isPresent) 1 else 0) +
                (if (image.asKnown().isPresent) 1 else 0) +
                (if (recordType.asKnown().isPresent) 1 else 0) +
                (if (revisionId.asKnown().isPresent) 1 else 0) +
                (if (shippedAt.asKnown().isPresent) 1 else 0) +
                (if (shippedBy.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                active == other.active &&
                buildOkAt == other.buildOkAt &&
                buildStatus == other.buildStatus &&
                commitSha == other.commitSha &&
                deployStatus == other.deployStatus &&
                failureReason == other.failureReason &&
                failureStage == other.failureStage &&
                image == other.image &&
                recordType == other.recordType &&
                revisionId == other.revisionId &&
                shippedAt == other.shippedAt &&
                shippedBy == other.shippedBy &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                active,
                buildOkAt,
                buildStatus,
                commitSha,
                deployStatus,
                failureReason,
                failureStage,
                image,
                recordType,
                revisionId,
                shippedAt,
                shippedBy,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{active=$active, buildOkAt=$buildOkAt, buildStatus=$buildStatus, commitSha=$commitSha, deployStatus=$deployStatus, failureReason=$failureReason, failureStage=$failureStage, image=$image, recordType=$recordType, revisionId=$revisionId, shippedAt=$shippedAt, shippedBy=$shippedBy, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FuncRetrieveRevisionsResponse &&
            data == other.data &&
            meta == other.meta &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, meta, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FuncRetrieveRevisionsResponse{data=$data, meta=$meta, additionalProperties=$additionalProperties}"
}
