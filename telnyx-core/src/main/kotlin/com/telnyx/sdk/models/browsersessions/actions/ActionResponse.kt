// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.browsersessions.actions

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
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ActionResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val completedAt: JsonField<OffsetDateTime>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val error: JsonField<Error>,
    private val request: JsonValue,
    private val result: JsonField<Result>,
    private val seq: JsonField<Long>,
    private val sessionId: JsonField<String>,
    private val startedAt: JsonField<OffsetDateTime>,
    private val status: JsonField<Status>,
    private val type: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("completed_at")
        @ExcludeMissing
        completedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("error") @ExcludeMissing error: JsonField<Error> = JsonMissing.of(),
        @JsonProperty("request") @ExcludeMissing request: JsonValue = JsonMissing.of(),
        @JsonProperty("result") @ExcludeMissing result: JsonField<Result> = JsonMissing.of(),
        @JsonProperty("seq") @ExcludeMissing seq: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("session_id") @ExcludeMissing sessionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("started_at")
        @ExcludeMissing
        startedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        completedAt,
        createdAt,
        error,
        request,
        result,
        seq,
        sessionId,
        startedAt,
        status,
        type,
        mutableMapOf(),
    )

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun completedAt(): Optional<OffsetDateTime> = completedAt.getOptional("completed_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * Null unless an execution failure is recorded. Action failures (policy_denied,
     * stale_observation, stale_ref, navigation_blocked, timeout, execution_lost, result_too_large)
     * are returned on the action resource with HTTP 200. An unknown action with execution_lost has
     * retryable=false; inspect session state and reconcile possible effects before any new action.
     * Separately, a request may return HTTP 503 with a top-level execution_lost error and
     * retryable=true; that is not proof of safe re-execution.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun error(): Optional<Error> = error.getOptional("error")

    /**
     * Normalized request metadata; defaults may be materialized and fill values are redacted as
     * {redacted: true, length: number}, including inside batch actions.
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = actionResponse.request().convert(MyClass.class);
     * ```
     */
    @JsonProperty("request") @ExcludeMissing fun _request(): JsonValue = request

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun result(): Optional<Result> = result.getOptional("result")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun seq(): Long = seq.getRequired("seq")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sessionId(): String = sessionId.getRequired("session_id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startedAt(): Optional<OffsetDateTime> = startedAt.getOptional("started_at")

    /**
     * POST returns 202 for queued or running actions. Terminal states are succeeded, failed, and
     * unknown (the execution outcome could not be determined, with error.code=execution_lost). GET
     * returns 200 for both nonterminal and terminal states.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): String = type.getRequired("type")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [completedAt].
     *
     * Unlike [completedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("completed_at")
    @ExcludeMissing
    fun _completedAt(): JsonField<OffsetDateTime> = completedAt

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [error].
     *
     * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<Error> = error

    /**
     * Returns the raw JSON value of [result].
     *
     * Unlike [result], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<Result> = result

    /**
     * Returns the raw JSON value of [seq].
     *
     * Unlike [seq], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("seq") @ExcludeMissing fun _seq(): JsonField<Long> = seq

    /**
     * Returns the raw JSON value of [sessionId].
     *
     * Unlike [sessionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("session_id") @ExcludeMissing fun _sessionId(): JsonField<String> = sessionId

    /**
     * Returns the raw JSON value of [startedAt].
     *
     * Unlike [startedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("started_at")
    @ExcludeMissing
    fun _startedAt(): JsonField<OffsetDateTime> = startedAt

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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
         * Returns a mutable builder for constructing an instance of [ActionResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .completedAt()
         * .createdAt()
         * .error()
         * .request()
         * .result()
         * .seq()
         * .sessionId()
         * .startedAt()
         * .status()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ActionResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var completedAt: JsonField<OffsetDateTime>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var error: JsonField<Error>? = null
        private var request: JsonValue? = null
        private var result: JsonField<Result>? = null
        private var seq: JsonField<Long>? = null
        private var sessionId: JsonField<String>? = null
        private var startedAt: JsonField<OffsetDateTime>? = null
        private var status: JsonField<Status>? = null
        private var type: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(actionResponse: ActionResponse) = apply {
            id = actionResponse.id
            completedAt = actionResponse.completedAt
            createdAt = actionResponse.createdAt
            error = actionResponse.error
            request = actionResponse.request
            result = actionResponse.result
            seq = actionResponse.seq
            sessionId = actionResponse.sessionId
            startedAt = actionResponse.startedAt
            status = actionResponse.status
            type = actionResponse.type
            additionalProperties = actionResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun completedAt(completedAt: OffsetDateTime?) =
            completedAt(JsonField.ofNullable(completedAt))

        /** Alias for calling [Builder.completedAt] with `completedAt.orElse(null)`. */
        fun completedAt(completedAt: Optional<OffsetDateTime>) =
            completedAt(completedAt.getOrNull())

        /**
         * Sets [Builder.completedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.completedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun completedAt(completedAt: JsonField<OffsetDateTime>) = apply {
            this.completedAt = completedAt
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /**
         * Null unless an execution failure is recorded. Action failures (policy_denied,
         * stale_observation, stale_ref, navigation_blocked, timeout, execution_lost,
         * result_too_large) are returned on the action resource with HTTP 200. An unknown action
         * with execution_lost has retryable=false; inspect session state and reconcile possible
         * effects before any new action. Separately, a request may return HTTP 503 with a top-level
         * execution_lost error and retryable=true; that is not proof of safe re-execution.
         */
        fun error(error: Error?) = error(JsonField.ofNullable(error))

        /** Alias for calling [Builder.error] with `error.orElse(null)`. */
        fun error(error: Optional<Error>) = error(error.getOrNull())

        /**
         * Sets [Builder.error] to an arbitrary JSON value.
         *
         * You should usually call [Builder.error] with a well-typed [Error] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun error(error: JsonField<Error>) = apply { this.error = error }

        /**
         * Normalized request metadata; defaults may be materialized and fill values are redacted as
         * {redacted: true, length: number}, including inside batch actions.
         */
        fun request(request: JsonValue) = apply { this.request = request }

        fun result(result: Result?) = result(JsonField.ofNullable(result))

        /** Alias for calling [Builder.result] with `result.orElse(null)`. */
        fun result(result: Optional<Result>) = result(result.getOrNull())

        /**
         * Sets [Builder.result] to an arbitrary JSON value.
         *
         * You should usually call [Builder.result] with a well-typed [Result] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun result(result: JsonField<Result>) = apply { this.result = result }

        fun seq(seq: Long) = seq(JsonField.of(seq))

        /**
         * Sets [Builder.seq] to an arbitrary JSON value.
         *
         * You should usually call [Builder.seq] with a well-typed [Long] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun seq(seq: JsonField<Long>) = apply { this.seq = seq }

        fun sessionId(sessionId: String) = sessionId(JsonField.of(sessionId))

        /**
         * Sets [Builder.sessionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sessionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sessionId(sessionId: JsonField<String>) = apply { this.sessionId = sessionId }

        fun startedAt(startedAt: OffsetDateTime?) = startedAt(JsonField.ofNullable(startedAt))

        /** Alias for calling [Builder.startedAt] with `startedAt.orElse(null)`. */
        fun startedAt(startedAt: Optional<OffsetDateTime>) = startedAt(startedAt.getOrNull())

        /**
         * Sets [Builder.startedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startedAt(startedAt: JsonField<OffsetDateTime>) = apply { this.startedAt = startedAt }

        /**
         * POST returns 202 for queued or running actions. Terminal states are succeeded, failed,
         * and unknown (the execution outcome could not be determined, with
         * error.code=execution_lost). GET returns 200 for both nonterminal and terminal states.
         */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun type(type: String) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<String>) = apply { this.type = type }

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
         * Returns an immutable instance of [ActionResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .completedAt()
         * .createdAt()
         * .error()
         * .request()
         * .result()
         * .seq()
         * .sessionId()
         * .startedAt()
         * .status()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ActionResponse =
            ActionResponse(
                checkRequired("id", id),
                checkRequired("completedAt", completedAt),
                checkRequired("createdAt", createdAt),
                checkRequired("error", error),
                checkRequired("request", request),
                checkRequired("result", result),
                checkRequired("seq", seq),
                checkRequired("sessionId", sessionId),
                checkRequired("startedAt", startedAt),
                checkRequired("status", status),
                checkRequired("type", type),
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
    fun validate(): ActionResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        completedAt()
        createdAt()
        error().ifPresent { it.validate() }
        result().ifPresent { it.validate() }
        seq()
        sessionId()
        startedAt()
        status().validate()
        type()
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
            (if (completedAt.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (error.asKnown().getOrNull()?.validity() ?: 0) +
            (result.asKnown().getOrNull()?.validity() ?: 0) +
            (if (seq.asKnown().isPresent) 1 else 0) +
            (if (sessionId.asKnown().isPresent) 1 else 0) +
            (if (startedAt.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (type.asKnown().isPresent) 1 else 0)

    /**
     * Null unless an execution failure is recorded. Action failures (policy_denied,
     * stale_observation, stale_ref, navigation_blocked, timeout, execution_lost, result_too_large)
     * are returned on the action resource with HTTP 200. An unknown action with execution_lost has
     * retryable=false; inspect session state and reconcile possible effects before any new action.
     * Separately, a request may return HTTP 503 with a top-level execution_lost error and
     * retryable=true; that is not proof of safe re-execution.
     */
    class Error
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val code: JsonField<String>,
        private val retryable: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
            @JsonProperty("retryable")
            @ExcludeMissing
            retryable: JsonField<Boolean> = JsonMissing.of(),
        ) : this(code, retryable, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun code(): String = code.getRequired("code")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun retryable(): Boolean = retryable.getRequired("retryable")

        /**
         * Returns the raw JSON value of [code].
         *
         * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

        /**
         * Returns the raw JSON value of [retryable].
         *
         * Unlike [retryable], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("retryable") @ExcludeMissing fun _retryable(): JsonField<Boolean> = retryable

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
             * Returns a mutable builder for constructing an instance of [Error].
             *
             * The following fields are required:
             * ```java
             * .code()
             * .retryable()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Error]. */
        class Builder internal constructor() {

            private var code: JsonField<String>? = null
            private var retryable: JsonField<Boolean>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(error: Error) = apply {
                code = error.code
                retryable = error.retryable
                additionalProperties = error.additionalProperties.toMutableMap()
            }

            fun code(code: String) = code(JsonField.of(code))

            /**
             * Sets [Builder.code] to an arbitrary JSON value.
             *
             * You should usually call [Builder.code] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun code(code: JsonField<String>) = apply { this.code = code }

            fun retryable(retryable: Boolean) = retryable(JsonField.of(retryable))

            /**
             * Sets [Builder.retryable] to an arbitrary JSON value.
             *
             * You should usually call [Builder.retryable] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun retryable(retryable: JsonField<Boolean>) = apply { this.retryable = retryable }

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
             * Returns an immutable instance of [Error].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .code()
             * .retryable()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Error =
                Error(
                    checkRequired("code", code),
                    checkRequired("retryable", retryable),
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
        fun validate(): Error = apply {
            if (validated) {
                return@apply
            }

            code()
            retryable()
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
            (if (code.asKnown().isPresent) 1 else 0) + (if (retryable.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Error &&
                code == other.code &&
                retryable == other.retryable &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(code, retryable, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Error{code=$code, retryable=$retryable, additionalProperties=$additionalProperties}"
    }

    class Result
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val artifact: JsonField<Artifact>,
        private val observation: JsonField<Observation>,
        private val results: JsonField<List<JsonValue>>,
        private val title: JsonField<String>,
        private val url: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("artifact")
            @ExcludeMissing
            artifact: JsonField<Artifact> = JsonMissing.of(),
            @JsonProperty("observation")
            @ExcludeMissing
            observation: JsonField<Observation> = JsonMissing.of(),
            @JsonProperty("results")
            @ExcludeMissing
            results: JsonField<List<JsonValue>> = JsonMissing.of(),
            @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
            @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
        ) : this(artifact, observation, results, title, url, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun artifact(): Optional<Artifact> = artifact.getOptional("artifact")

        /**
         * Full tree and refs are delivered only in the original successful POST response when
         * completed within wait_seconds. GET polling and idempotent replays return metadata with an
         * empty tree and refs plus ref_count. Submit a fresh observe action to obtain usable refs.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun observation(): Optional<Observation> = observation.getOptional("observation")

        /**
         * Present only for batch actions.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun results(): Optional<List<JsonValue>> = results.getOptional("results")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun title(): Optional<String> = title.getOptional("title")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun url(): Optional<String> = url.getOptional("url")

        /**
         * Returns the raw JSON value of [artifact].
         *
         * Unlike [artifact], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("artifact") @ExcludeMissing fun _artifact(): JsonField<Artifact> = artifact

        /**
         * Returns the raw JSON value of [observation].
         *
         * Unlike [observation], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("observation")
        @ExcludeMissing
        fun _observation(): JsonField<Observation> = observation

        /**
         * Returns the raw JSON value of [results].
         *
         * Unlike [results], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("results")
        @ExcludeMissing
        fun _results(): JsonField<List<JsonValue>> = results

        /**
         * Returns the raw JSON value of [title].
         *
         * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

        /**
         * Returns the raw JSON value of [url].
         *
         * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

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

            /** Returns a mutable builder for constructing an instance of [Result]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Result]. */
        class Builder internal constructor() {

            private var artifact: JsonField<Artifact> = JsonMissing.of()
            private var observation: JsonField<Observation> = JsonMissing.of()
            private var results: JsonField<MutableList<JsonValue>>? = null
            private var title: JsonField<String> = JsonMissing.of()
            private var url: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(result: Result) = apply {
                artifact = result.artifact
                observation = result.observation
                results = result.results.map { it.toMutableList() }
                title = result.title
                url = result.url
                additionalProperties = result.additionalProperties.toMutableMap()
            }

            fun artifact(artifact: Artifact) = artifact(JsonField.of(artifact))

            /**
             * Sets [Builder.artifact] to an arbitrary JSON value.
             *
             * You should usually call [Builder.artifact] with a well-typed [Artifact] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun artifact(artifact: JsonField<Artifact>) = apply { this.artifact = artifact }

            /**
             * Full tree and refs are delivered only in the original successful POST response when
             * completed within wait_seconds. GET polling and idempotent replays return metadata
             * with an empty tree and refs plus ref_count. Submit a fresh observe action to obtain
             * usable refs.
             */
            fun observation(observation: Observation) = observation(JsonField.of(observation))

            /**
             * Sets [Builder.observation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.observation] with a well-typed [Observation] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun observation(observation: JsonField<Observation>) = apply {
                this.observation = observation
            }

            /** Present only for batch actions. */
            fun results(results: List<JsonValue>) = results(JsonField.of(results))

            /**
             * Sets [Builder.results] to an arbitrary JSON value.
             *
             * You should usually call [Builder.results] with a well-typed `List<JsonValue>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun results(results: JsonField<List<JsonValue>>) = apply {
                this.results = results.map { it.toMutableList() }
            }

            /**
             * Adds a single [JsonValue] to [results].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addResult(result: JsonValue) = apply {
                results =
                    (results ?: JsonField.of(mutableListOf())).also {
                        checkKnown("results", it).add(result)
                    }
            }

            fun title(title: String) = title(JsonField.of(title))

            /**
             * Sets [Builder.title] to an arbitrary JSON value.
             *
             * You should usually call [Builder.title] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun title(title: JsonField<String>) = apply { this.title = title }

            fun url(url: String) = url(JsonField.of(url))

            /**
             * Sets [Builder.url] to an arbitrary JSON value.
             *
             * You should usually call [Builder.url] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun url(url: JsonField<String>) = apply { this.url = url }

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
             * Returns an immutable instance of [Result].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Result =
                Result(
                    artifact,
                    observation,
                    (results ?: JsonMissing.of()).map { it.toImmutable() },
                    title,
                    url,
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
        fun validate(): Result = apply {
            if (validated) {
                return@apply
            }

            artifact().ifPresent { it.validate() }
            observation().ifPresent { it.validate() }
            results()
            title()
            url()
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
            (artifact.asKnown().getOrNull()?.validity() ?: 0) +
                (observation.asKnown().getOrNull()?.validity() ?: 0) +
                (results.asKnown().getOrNull()?.size ?: 0) +
                (if (title.asKnown().isPresent) 1 else 0) +
                (if (url.asKnown().isPresent) 1 else 0)

        class Artifact
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val artifactId: JsonField<String>,
            private val contentType: JsonField<String>,
            private val sizeBytes: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("artifact_id")
                @ExcludeMissing
                artifactId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("content_type")
                @ExcludeMissing
                contentType: JsonField<String> = JsonMissing.of(),
                @JsonProperty("size_bytes")
                @ExcludeMissing
                sizeBytes: JsonField<Long> = JsonMissing.of(),
            ) : this(artifactId, contentType, sizeBytes, mutableMapOf())

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun artifactId(): Optional<String> = artifactId.getOptional("artifact_id")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun contentType(): Optional<String> = contentType.getOptional("content_type")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun sizeBytes(): Optional<Long> = sizeBytes.getOptional("size_bytes")

            /**
             * Returns the raw JSON value of [artifactId].
             *
             * Unlike [artifactId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("artifact_id")
            @ExcludeMissing
            fun _artifactId(): JsonField<String> = artifactId

            /**
             * Returns the raw JSON value of [contentType].
             *
             * Unlike [contentType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("content_type")
            @ExcludeMissing
            fun _contentType(): JsonField<String> = contentType

            /**
             * Returns the raw JSON value of [sizeBytes].
             *
             * Unlike [sizeBytes], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("size_bytes")
            @ExcludeMissing
            fun _sizeBytes(): JsonField<Long> = sizeBytes

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

                /** Returns a mutable builder for constructing an instance of [Artifact]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Artifact]. */
            class Builder internal constructor() {

                private var artifactId: JsonField<String> = JsonMissing.of()
                private var contentType: JsonField<String> = JsonMissing.of()
                private var sizeBytes: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(artifact: Artifact) = apply {
                    artifactId = artifact.artifactId
                    contentType = artifact.contentType
                    sizeBytes = artifact.sizeBytes
                    additionalProperties = artifact.additionalProperties.toMutableMap()
                }

                fun artifactId(artifactId: String) = artifactId(JsonField.of(artifactId))

                /**
                 * Sets [Builder.artifactId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.artifactId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun artifactId(artifactId: JsonField<String>) = apply {
                    this.artifactId = artifactId
                }

                fun contentType(contentType: String) = contentType(JsonField.of(contentType))

                /**
                 * Sets [Builder.contentType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.contentType] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun contentType(contentType: JsonField<String>) = apply {
                    this.contentType = contentType
                }

                fun sizeBytes(sizeBytes: Long) = sizeBytes(JsonField.of(sizeBytes))

                /**
                 * Sets [Builder.sizeBytes] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sizeBytes] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun sizeBytes(sizeBytes: JsonField<Long>) = apply { this.sizeBytes = sizeBytes }

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
                 * Returns an immutable instance of [Artifact].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Artifact =
                    Artifact(
                        artifactId,
                        contentType,
                        sizeBytes,
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
            fun validate(): Artifact = apply {
                if (validated) {
                    return@apply
                }

                artifactId()
                contentType()
                sizeBytes()
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
                (if (artifactId.asKnown().isPresent) 1 else 0) +
                    (if (contentType.asKnown().isPresent) 1 else 0) +
                    (if (sizeBytes.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Artifact &&
                    artifactId == other.artifactId &&
                    contentType == other.contentType &&
                    sizeBytes == other.sizeBytes &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(artifactId, contentType, sizeBytes, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Artifact{artifactId=$artifactId, contentType=$contentType, sizeBytes=$sizeBytes, additionalProperties=$additionalProperties}"
        }

        /**
         * Full tree and refs are delivered only in the original successful POST response when
         * completed within wait_seconds. GET polling and idempotent replays return metadata with an
         * empty tree and refs plus ref_count. Submit a fresh observe action to obtain usable refs.
         */
        class Observation
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val observationId: JsonField<String>,
            private val refCount: JsonField<Long>,
            private val refs: JsonValue,
            private val title: JsonField<String>,
            private val tree: JsonField<String>,
            private val truncated: JsonField<Boolean>,
            private val url: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("observation_id")
                @ExcludeMissing
                observationId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("ref_count")
                @ExcludeMissing
                refCount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("refs") @ExcludeMissing refs: JsonValue = JsonMissing.of(),
                @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
                @JsonProperty("tree") @ExcludeMissing tree: JsonField<String> = JsonMissing.of(),
                @JsonProperty("truncated")
                @ExcludeMissing
                truncated: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
            ) : this(observationId, refCount, refs, title, tree, truncated, url, mutableMapOf())

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun observationId(): Optional<String> = observationId.getOptional("observation_id")

            /**
             * Number of refs in the original observation, present on stored observation metadata.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun refCount(): Optional<Long> = refCount.getOptional("ref_count")

            /**
             * This arbitrary value can be deserialized into a custom type using the `convert`
             * method:
             * ```java
             * MyClass myObject = observation.refs().convert(MyClass.class);
             * ```
             */
            @JsonProperty("refs") @ExcludeMissing fun _refs(): JsonValue = refs

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun title(): Optional<String> = title.getOptional("title")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun tree(): Optional<String> = tree.getOptional("tree")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun truncated(): Optional<Boolean> = truncated.getOptional("truncated")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun url(): Optional<String> = url.getOptional("url")

            /**
             * Returns the raw JSON value of [observationId].
             *
             * Unlike [observationId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("observation_id")
            @ExcludeMissing
            fun _observationId(): JsonField<String> = observationId

            /**
             * Returns the raw JSON value of [refCount].
             *
             * Unlike [refCount], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("ref_count") @ExcludeMissing fun _refCount(): JsonField<Long> = refCount

            /**
             * Returns the raw JSON value of [title].
             *
             * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

            /**
             * Returns the raw JSON value of [tree].
             *
             * Unlike [tree], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("tree") @ExcludeMissing fun _tree(): JsonField<String> = tree

            /**
             * Returns the raw JSON value of [truncated].
             *
             * Unlike [truncated], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("truncated")
            @ExcludeMissing
            fun _truncated(): JsonField<Boolean> = truncated

            /**
             * Returns the raw JSON value of [url].
             *
             * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

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

                /** Returns a mutable builder for constructing an instance of [Observation]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Observation]. */
            class Builder internal constructor() {

                private var observationId: JsonField<String> = JsonMissing.of()
                private var refCount: JsonField<Long> = JsonMissing.of()
                private var refs: JsonValue = JsonMissing.of()
                private var title: JsonField<String> = JsonMissing.of()
                private var tree: JsonField<String> = JsonMissing.of()
                private var truncated: JsonField<Boolean> = JsonMissing.of()
                private var url: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(observation: Observation) = apply {
                    observationId = observation.observationId
                    refCount = observation.refCount
                    refs = observation.refs
                    title = observation.title
                    tree = observation.tree
                    truncated = observation.truncated
                    url = observation.url
                    additionalProperties = observation.additionalProperties.toMutableMap()
                }

                fun observationId(observationId: String) =
                    observationId(JsonField.of(observationId))

                /**
                 * Sets [Builder.observationId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.observationId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun observationId(observationId: JsonField<String>) = apply {
                    this.observationId = observationId
                }

                /**
                 * Number of refs in the original observation, present on stored observation
                 * metadata.
                 */
                fun refCount(refCount: Long) = refCount(JsonField.of(refCount))

                /**
                 * Sets [Builder.refCount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.refCount] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun refCount(refCount: JsonField<Long>) = apply { this.refCount = refCount }

                fun refs(refs: JsonValue) = apply { this.refs = refs }

                fun title(title: String) = title(JsonField.of(title))

                /**
                 * Sets [Builder.title] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.title] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun title(title: JsonField<String>) = apply { this.title = title }

                fun tree(tree: String) = tree(JsonField.of(tree))

                /**
                 * Sets [Builder.tree] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tree] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun tree(tree: JsonField<String>) = apply { this.tree = tree }

                fun truncated(truncated: Boolean) = truncated(JsonField.of(truncated))

                /**
                 * Sets [Builder.truncated] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.truncated] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun truncated(truncated: JsonField<Boolean>) = apply { this.truncated = truncated }

                fun url(url: String) = url(JsonField.of(url))

                /**
                 * Sets [Builder.url] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.url] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun url(url: JsonField<String>) = apply { this.url = url }

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
                 * Returns an immutable instance of [Observation].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Observation =
                    Observation(
                        observationId,
                        refCount,
                        refs,
                        title,
                        tree,
                        truncated,
                        url,
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
            fun validate(): Observation = apply {
                if (validated) {
                    return@apply
                }

                observationId()
                refCount()
                title()
                tree()
                truncated()
                url()
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
                (if (observationId.asKnown().isPresent) 1 else 0) +
                    (if (refCount.asKnown().isPresent) 1 else 0) +
                    (if (title.asKnown().isPresent) 1 else 0) +
                    (if (tree.asKnown().isPresent) 1 else 0) +
                    (if (truncated.asKnown().isPresent) 1 else 0) +
                    (if (url.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Observation &&
                    observationId == other.observationId &&
                    refCount == other.refCount &&
                    refs == other.refs &&
                    title == other.title &&
                    tree == other.tree &&
                    truncated == other.truncated &&
                    url == other.url &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    observationId,
                    refCount,
                    refs,
                    title,
                    tree,
                    truncated,
                    url,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Observation{observationId=$observationId, refCount=$refCount, refs=$refs, title=$title, tree=$tree, truncated=$truncated, url=$url, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Result &&
                artifact == other.artifact &&
                observation == other.observation &&
                results == other.results &&
                title == other.title &&
                url == other.url &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(artifact, observation, results, title, url, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Result{artifact=$artifact, observation=$observation, results=$results, title=$title, url=$url, additionalProperties=$additionalProperties}"
    }

    /**
     * POST returns 202 for queued or running actions. Terminal states are succeeded, failed, and
     * unknown (the execution outcome could not be determined, with error.code=execution_lost). GET
     * returns 200 for both nonterminal and terminal states.
     */
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

            @JvmField val UNKNOWN = of("unknown")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            QUEUED,
            RUNNING,
            SUCCEEDED,
            FAILED,
            UNKNOWN,
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
            UNKNOWN,
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
                UNKNOWN -> Value.UNKNOWN
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
                UNKNOWN -> Known.UNKNOWN
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ActionResponse &&
            id == other.id &&
            completedAt == other.completedAt &&
            createdAt == other.createdAt &&
            error == other.error &&
            request == other.request &&
            result == other.result &&
            seq == other.seq &&
            sessionId == other.sessionId &&
            startedAt == other.startedAt &&
            status == other.status &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            completedAt,
            createdAt,
            error,
            request,
            result,
            seq,
            sessionId,
            startedAt,
            status,
            type,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ActionResponse{id=$id, completedAt=$completedAt, createdAt=$createdAt, error=$error, request=$request, result=$result, seq=$seq, sessionId=$sessionId, startedAt=$startedAt, status=$status, type=$type, additionalProperties=$additionalProperties}"
}
