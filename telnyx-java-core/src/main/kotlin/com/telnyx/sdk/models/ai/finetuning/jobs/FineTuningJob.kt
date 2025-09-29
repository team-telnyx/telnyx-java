// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.finetuning.jobs

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * The `fine_tuning.job` object represents a fine-tuning job that has been created through the API.
 */
class FineTuningJob
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<Long>,
    private val finishedAt: JsonField<Long>,
    private val hyperparameters: JsonField<Hyperparameters>,
    private val model: JsonField<String>,
    private val organizationId: JsonField<String>,
    private val status: JsonField<Status>,
    private val trainedTokens: JsonField<Long>,
    private val trainingFile: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at") @ExcludeMissing createdAt: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("finished_at") @ExcludeMissing finishedAt: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("hyperparameters")
        @ExcludeMissing
        hyperparameters: JsonField<Hyperparameters> = JsonMissing.of(),
        @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
        @JsonProperty("organization_id")
        @ExcludeMissing
        organizationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("trained_tokens")
        @ExcludeMissing
        trainedTokens: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("training_file")
        @ExcludeMissing
        trainingFile: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        finishedAt,
        hyperparameters,
        model,
        organizationId,
        status,
        trainedTokens,
        trainingFile,
        mutableMapOf(),
    )

    /**
     * The name of the fine-tuned model that is being created.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The Unix timestamp (in seconds) for when the fine-tuning job was created.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): Long = createdAt.getRequired("created_at")

    /**
     * The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be
     * null if the fine-tuning job is still running.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun finishedAt(): Optional<Long> = finishedAt.getOptional("finished_at")

    /**
     * The hyperparameters used for the fine-tuning job.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hyperparameters(): Hyperparameters = hyperparameters.getRequired("hyperparameters")

    /**
     * The base model that is being fine-tuned.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun model(): String = model.getRequired("model")

    /**
     * The organization that owns the fine-tuning job.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun organizationId(): String = organizationId.getRequired("organization_id")

    /**
     * The current status of the fine-tuning job.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * The total number of billable tokens processed by this fine-tuning job. The value will be null
     * if the fine-tuning job is still running.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun trainedTokens(): Optional<Long> = trainedTokens.getOptional("trained_tokens")

    /**
     * The storage bucket or object used for training.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun trainingFile(): String = trainingFile.getRequired("training_file")

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
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<Long> = createdAt

    /**
     * Returns the raw JSON value of [finishedAt].
     *
     * Unlike [finishedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("finished_at") @ExcludeMissing fun _finishedAt(): JsonField<Long> = finishedAt

    /**
     * Returns the raw JSON value of [hyperparameters].
     *
     * Unlike [hyperparameters], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hyperparameters")
    @ExcludeMissing
    fun _hyperparameters(): JsonField<Hyperparameters> = hyperparameters

    /**
     * Returns the raw JSON value of [model].
     *
     * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

    /**
     * Returns the raw JSON value of [organizationId].
     *
     * Unlike [organizationId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("organization_id")
    @ExcludeMissing
    fun _organizationId(): JsonField<String> = organizationId

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [trainedTokens].
     *
     * Unlike [trainedTokens], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trained_tokens")
    @ExcludeMissing
    fun _trainedTokens(): JsonField<Long> = trainedTokens

    /**
     * Returns the raw JSON value of [trainingFile].
     *
     * Unlike [trainingFile], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("training_file")
    @ExcludeMissing
    fun _trainingFile(): JsonField<String> = trainingFile

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
         * Returns a mutable builder for constructing an instance of [FineTuningJob].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .finishedAt()
         * .hyperparameters()
         * .model()
         * .organizationId()
         * .status()
         * .trainedTokens()
         * .trainingFile()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FineTuningJob]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<Long>? = null
        private var finishedAt: JsonField<Long>? = null
        private var hyperparameters: JsonField<Hyperparameters>? = null
        private var model: JsonField<String>? = null
        private var organizationId: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var trainedTokens: JsonField<Long>? = null
        private var trainingFile: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(fineTuningJob: FineTuningJob) = apply {
            id = fineTuningJob.id
            createdAt = fineTuningJob.createdAt
            finishedAt = fineTuningJob.finishedAt
            hyperparameters = fineTuningJob.hyperparameters
            model = fineTuningJob.model
            organizationId = fineTuningJob.organizationId
            status = fineTuningJob.status
            trainedTokens = fineTuningJob.trainedTokens
            trainingFile = fineTuningJob.trainingFile
            additionalProperties = fineTuningJob.additionalProperties.toMutableMap()
        }

        /** The name of the fine-tuned model that is being created. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The Unix timestamp (in seconds) for when the fine-tuning job was created. */
        fun createdAt(createdAt: Long) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun createdAt(createdAt: JsonField<Long>) = apply { this.createdAt = createdAt }

        /**
         * The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will
         * be null if the fine-tuning job is still running.
         */
        fun finishedAt(finishedAt: Long?) = finishedAt(JsonField.ofNullable(finishedAt))

        /**
         * Alias for [Builder.finishedAt].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun finishedAt(finishedAt: Long) = finishedAt(finishedAt as Long?)

        /** Alias for calling [Builder.finishedAt] with `finishedAt.orElse(null)`. */
        fun finishedAt(finishedAt: Optional<Long>) = finishedAt(finishedAt.getOrNull())

        /**
         * Sets [Builder.finishedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.finishedAt] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun finishedAt(finishedAt: JsonField<Long>) = apply { this.finishedAt = finishedAt }

        /** The hyperparameters used for the fine-tuning job. */
        fun hyperparameters(hyperparameters: Hyperparameters) =
            hyperparameters(JsonField.of(hyperparameters))

        /**
         * Sets [Builder.hyperparameters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hyperparameters] with a well-typed [Hyperparameters]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun hyperparameters(hyperparameters: JsonField<Hyperparameters>) = apply {
            this.hyperparameters = hyperparameters
        }

        /** The base model that is being fine-tuned. */
        fun model(model: String) = model(JsonField.of(model))

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: JsonField<String>) = apply { this.model = model }

        /** The organization that owns the fine-tuning job. */
        fun organizationId(organizationId: String) = organizationId(JsonField.of(organizationId))

        /**
         * Sets [Builder.organizationId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.organizationId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun organizationId(organizationId: JsonField<String>) = apply {
            this.organizationId = organizationId
        }

        /** The current status of the fine-tuning job. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * The total number of billable tokens processed by this fine-tuning job. The value will be
         * null if the fine-tuning job is still running.
         */
        fun trainedTokens(trainedTokens: Long?) = trainedTokens(JsonField.ofNullable(trainedTokens))

        /**
         * Alias for [Builder.trainedTokens].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun trainedTokens(trainedTokens: Long) = trainedTokens(trainedTokens as Long?)

        /** Alias for calling [Builder.trainedTokens] with `trainedTokens.orElse(null)`. */
        fun trainedTokens(trainedTokens: Optional<Long>) = trainedTokens(trainedTokens.getOrNull())

        /**
         * Sets [Builder.trainedTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trainedTokens] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun trainedTokens(trainedTokens: JsonField<Long>) = apply {
            this.trainedTokens = trainedTokens
        }

        /** The storage bucket or object used for training. */
        fun trainingFile(trainingFile: String) = trainingFile(JsonField.of(trainingFile))

        /**
         * Sets [Builder.trainingFile] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trainingFile] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun trainingFile(trainingFile: JsonField<String>) = apply {
            this.trainingFile = trainingFile
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
         * Returns an immutable instance of [FineTuningJob].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .finishedAt()
         * .hyperparameters()
         * .model()
         * .organizationId()
         * .status()
         * .trainedTokens()
         * .trainingFile()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FineTuningJob =
            FineTuningJob(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("finishedAt", finishedAt),
                checkRequired("hyperparameters", hyperparameters),
                checkRequired("model", model),
                checkRequired("organizationId", organizationId),
                checkRequired("status", status),
                checkRequired("trainedTokens", trainedTokens),
                checkRequired("trainingFile", trainingFile),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): FineTuningJob = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        finishedAt()
        hyperparameters().validate()
        model()
        organizationId()
        status().validate()
        trainedTokens()
        trainingFile()
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
            (if (finishedAt.asKnown().isPresent) 1 else 0) +
            (hyperparameters.asKnown().getOrNull()?.validity() ?: 0) +
            (if (model.asKnown().isPresent) 1 else 0) +
            (if (organizationId.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (trainedTokens.asKnown().isPresent) 1 else 0) +
            (if (trainingFile.asKnown().isPresent) 1 else 0)

    /** The hyperparameters used for the fine-tuning job. */
    class Hyperparameters
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val nEpochs: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("n_epochs") @ExcludeMissing nEpochs: JsonField<Long> = JsonMissing.of()
        ) : this(nEpochs, mutableMapOf())

        /**
         * The number of epochs to train the model for. An epoch refers to one full cycle through
         * the training dataset.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun nEpochs(): Long = nEpochs.getRequired("n_epochs")

        /**
         * Returns the raw JSON value of [nEpochs].
         *
         * Unlike [nEpochs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("n_epochs") @ExcludeMissing fun _nEpochs(): JsonField<Long> = nEpochs

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
             * Returns a mutable builder for constructing an instance of [Hyperparameters].
             *
             * The following fields are required:
             * ```java
             * .nEpochs()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Hyperparameters]. */
        class Builder internal constructor() {

            private var nEpochs: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(hyperparameters: Hyperparameters) = apply {
                nEpochs = hyperparameters.nEpochs
                additionalProperties = hyperparameters.additionalProperties.toMutableMap()
            }

            /**
             * The number of epochs to train the model for. An epoch refers to one full cycle
             * through the training dataset.
             */
            fun nEpochs(nEpochs: Long) = nEpochs(JsonField.of(nEpochs))

            /**
             * Sets [Builder.nEpochs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.nEpochs] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun nEpochs(nEpochs: JsonField<Long>) = apply { this.nEpochs = nEpochs }

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
             * Returns an immutable instance of [Hyperparameters].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .nEpochs()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Hyperparameters =
                Hyperparameters(
                    checkRequired("nEpochs", nEpochs),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Hyperparameters = apply {
            if (validated) {
                return@apply
            }

            nEpochs()
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
        @JvmSynthetic internal fun validity(): Int = (if (nEpochs.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Hyperparameters &&
                nEpochs == other.nEpochs &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(nEpochs, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Hyperparameters{nEpochs=$nEpochs, additionalProperties=$additionalProperties}"
    }

    /** The current status of the fine-tuning job. */
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

            @JvmField val QUEUED = of("queued")

            @JvmField val RUNNING = of("running")

            @JvmField val SUCCEEDED = of("succeeded")

            @JvmField val FAILED = of("failed")

            @JvmField val CANCELLED = of("cancelled")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            QUEUED,
            RUNNING,
            SUCCEEDED,
            FAILED,
            CANCELLED,
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
            QUEUED,
            RUNNING,
            SUCCEEDED,
            FAILED,
            CANCELLED,
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
                QUEUED -> Value.QUEUED
                RUNNING -> Value.RUNNING
                SUCCEEDED -> Value.SUCCEEDED
                FAILED -> Value.FAILED
                CANCELLED -> Value.CANCELLED
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
                QUEUED -> Known.QUEUED
                RUNNING -> Known.RUNNING
                SUCCEEDED -> Known.SUCCEEDED
                FAILED -> Known.FAILED
                CANCELLED -> Known.CANCELLED
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

        return other is FineTuningJob &&
            id == other.id &&
            createdAt == other.createdAt &&
            finishedAt == other.finishedAt &&
            hyperparameters == other.hyperparameters &&
            model == other.model &&
            organizationId == other.organizationId &&
            status == other.status &&
            trainedTokens == other.trainedTokens &&
            trainingFile == other.trainingFile &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            finishedAt,
            hyperparameters,
            model,
            organizationId,
            status,
            trainedTokens,
            trainingFile,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FineTuningJob{id=$id, createdAt=$createdAt, finishedAt=$finishedAt, hyperparameters=$hyperparameters, model=$model, organizationId=$organizationId, status=$status, trainedTokens=$trainedTokens, trainingFile=$trainingFile, additionalProperties=$additionalProperties}"
}
