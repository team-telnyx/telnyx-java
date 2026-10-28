// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios

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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ScenarioRetrieveScenarioAgentProgressResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val error: JsonField<String>,
    private val mode: JsonField<String>,
    private val progressId: JsonField<String>,
    private val result: JsonField<Result>,
    private val sessionId: JsonField<Long>,
    private val status: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("error") @ExcludeMissing error: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mode") @ExcludeMissing mode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("progress_id")
        @ExcludeMissing
        progressId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("result") @ExcludeMissing result: JsonField<Result> = JsonMissing.of(),
        @JsonProperty("session_id") @ExcludeMissing sessionId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
    ) : this(error, mode, progressId, result, sessionId, status, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun error(): Optional<String> = error.getOptional("error")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mode(): Optional<String> = mode.getOptional("mode")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun progressId(): Optional<String> = progressId.getOptional("progress_id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun result(): Optional<Result> = result.getOptional("result")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sessionId(): Optional<Long> = sessionId.getOptional("session_id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<String> = status.getOptional("status")

    /**
     * Returns the raw JSON value of [error].
     *
     * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<String> = error

    /**
     * Returns the raw JSON value of [mode].
     *
     * Unlike [mode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mode") @ExcludeMissing fun _mode(): JsonField<String> = mode

    /**
     * Returns the raw JSON value of [progressId].
     *
     * Unlike [progressId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("progress_id") @ExcludeMissing fun _progressId(): JsonField<String> = progressId

    /**
     * Returns the raw JSON value of [result].
     *
     * Unlike [result], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<Result> = result

    /**
     * Returns the raw JSON value of [sessionId].
     *
     * Unlike [sessionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("session_id") @ExcludeMissing fun _sessionId(): JsonField<Long> = sessionId

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

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
         * [ScenarioRetrieveScenarioAgentProgressResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ScenarioRetrieveScenarioAgentProgressResponse]. */
    class Builder internal constructor() {

        private var error: JsonField<String> = JsonMissing.of()
        private var mode: JsonField<String> = JsonMissing.of()
        private var progressId: JsonField<String> = JsonMissing.of()
        private var result: JsonField<Result> = JsonMissing.of()
        private var sessionId: JsonField<Long> = JsonMissing.of()
        private var status: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            scenarioRetrieveScenarioAgentProgressResponse:
                ScenarioRetrieveScenarioAgentProgressResponse
        ) = apply {
            error = scenarioRetrieveScenarioAgentProgressResponse.error
            mode = scenarioRetrieveScenarioAgentProgressResponse.mode
            progressId = scenarioRetrieveScenarioAgentProgressResponse.progressId
            result = scenarioRetrieveScenarioAgentProgressResponse.result
            sessionId = scenarioRetrieveScenarioAgentProgressResponse.sessionId
            status = scenarioRetrieveScenarioAgentProgressResponse.status
            additionalProperties =
                scenarioRetrieveScenarioAgentProgressResponse.additionalProperties.toMutableMap()
        }

        fun error(error: String?) = error(JsonField.ofNullable(error))

        /** Alias for calling [Builder.error] with `error.orElse(null)`. */
        fun error(error: Optional<String>) = error(error.getOrNull())

        /**
         * Sets [Builder.error] to an arbitrary JSON value.
         *
         * You should usually call [Builder.error] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun error(error: JsonField<String>) = apply { this.error = error }

        fun mode(mode: String) = mode(JsonField.of(mode))

        /**
         * Sets [Builder.mode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mode] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mode(mode: JsonField<String>) = apply { this.mode = mode }

        fun progressId(progressId: String) = progressId(JsonField.of(progressId))

        /**
         * Sets [Builder.progressId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.progressId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun progressId(progressId: JsonField<String>) = apply { this.progressId = progressId }

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

        fun sessionId(sessionId: Long?) = sessionId(JsonField.ofNullable(sessionId))

        /**
         * Alias for [Builder.sessionId].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun sessionId(sessionId: Long) = sessionId(sessionId as Long?)

        /** Alias for calling [Builder.sessionId] with `sessionId.orElse(null)`. */
        fun sessionId(sessionId: Optional<Long>) = sessionId(sessionId.getOrNull())

        /**
         * Sets [Builder.sessionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sessionId] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sessionId(sessionId: JsonField<Long>) = apply { this.sessionId = sessionId }

        fun status(status: String) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<String>) = apply { this.status = status }

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
         * Returns an immutable instance of [ScenarioRetrieveScenarioAgentProgressResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ScenarioRetrieveScenarioAgentProgressResponse =
            ScenarioRetrieveScenarioAgentProgressResponse(
                error,
                mode,
                progressId,
                result,
                sessionId,
                status,
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
    fun validate(): ScenarioRetrieveScenarioAgentProgressResponse = apply {
        if (validated) {
            return@apply
        }

        error()
        mode()
        progressId()
        result().ifPresent { it.validate() }
        sessionId()
        status()
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
        (if (error.asKnown().isPresent) 1 else 0) +
            (if (mode.asKnown().isPresent) 1 else 0) +
            (if (progressId.asKnown().isPresent) 1 else 0) +
            (result.asKnown().getOrNull()?.validity() ?: 0) +
            (if (sessionId.asKnown().isPresent) 1 else 0) +
            (if (status.asKnown().isPresent) 1 else 0)

    class Result
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val cancelled: JsonField<Boolean>,
        private val clarificationQuestions: JsonField<List<ClarificationQuestion>>,
        private val conversationHistory: JsonField<List<ConversationHistory>>,
        private val message: JsonField<String>,
        private val needsClarification: JsonField<Boolean>,
        private val sessionId: JsonField<Long>,
        private val success: JsonField<Boolean>,
        private val updatedScenarios: JsonField<List<UpdatedScenario>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("cancelled")
            @ExcludeMissing
            cancelled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("clarification_questions")
            @ExcludeMissing
            clarificationQuestions: JsonField<List<ClarificationQuestion>> = JsonMissing.of(),
            @JsonProperty("conversation_history")
            @ExcludeMissing
            conversationHistory: JsonField<List<ConversationHistory>> = JsonMissing.of(),
            @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
            @JsonProperty("needs_clarification")
            @ExcludeMissing
            needsClarification: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("session_id")
            @ExcludeMissing
            sessionId: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("success") @ExcludeMissing success: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("updated_scenarios")
            @ExcludeMissing
            updatedScenarios: JsonField<List<UpdatedScenario>> = JsonMissing.of(),
        ) : this(
            cancelled,
            clarificationQuestions,
            conversationHistory,
            message,
            needsClarification,
            sessionId,
            success,
            updatedScenarios,
            mutableMapOf(),
        )

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cancelled(): Optional<Boolean> = cancelled.getOptional("cancelled")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun clarificationQuestions(): Optional<List<ClarificationQuestion>> =
            clarificationQuestions.getOptional("clarification_questions")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun conversationHistory(): Optional<List<ConversationHistory>> =
            conversationHistory.getOptional("conversation_history")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun message(): Optional<String> = message.getOptional("message")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun needsClarification(): Optional<Boolean> =
            needsClarification.getOptional("needs_clarification")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sessionId(): Optional<Long> = sessionId.getOptional("session_id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun success(): Optional<Boolean> = success.getOptional("success")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun updatedScenarios(): Optional<List<UpdatedScenario>> =
            updatedScenarios.getOptional("updated_scenarios")

        /**
         * Returns the raw JSON value of [cancelled].
         *
         * Unlike [cancelled], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cancelled") @ExcludeMissing fun _cancelled(): JsonField<Boolean> = cancelled

        /**
         * Returns the raw JSON value of [clarificationQuestions].
         *
         * Unlike [clarificationQuestions], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("clarification_questions")
        @ExcludeMissing
        fun _clarificationQuestions(): JsonField<List<ClarificationQuestion>> =
            clarificationQuestions

        /**
         * Returns the raw JSON value of [conversationHistory].
         *
         * Unlike [conversationHistory], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("conversation_history")
        @ExcludeMissing
        fun _conversationHistory(): JsonField<List<ConversationHistory>> = conversationHistory

        /**
         * Returns the raw JSON value of [message].
         *
         * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

        /**
         * Returns the raw JSON value of [needsClarification].
         *
         * Unlike [needsClarification], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("needs_clarification")
        @ExcludeMissing
        fun _needsClarification(): JsonField<Boolean> = needsClarification

        /**
         * Returns the raw JSON value of [sessionId].
         *
         * Unlike [sessionId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("session_id") @ExcludeMissing fun _sessionId(): JsonField<Long> = sessionId

        /**
         * Returns the raw JSON value of [success].
         *
         * Unlike [success], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("success") @ExcludeMissing fun _success(): JsonField<Boolean> = success

        /**
         * Returns the raw JSON value of [updatedScenarios].
         *
         * Unlike [updatedScenarios], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("updated_scenarios")
        @ExcludeMissing
        fun _updatedScenarios(): JsonField<List<UpdatedScenario>> = updatedScenarios

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

            private var cancelled: JsonField<Boolean> = JsonMissing.of()
            private var clarificationQuestions: JsonField<MutableList<ClarificationQuestion>>? =
                null
            private var conversationHistory: JsonField<MutableList<ConversationHistory>>? = null
            private var message: JsonField<String> = JsonMissing.of()
            private var needsClarification: JsonField<Boolean> = JsonMissing.of()
            private var sessionId: JsonField<Long> = JsonMissing.of()
            private var success: JsonField<Boolean> = JsonMissing.of()
            private var updatedScenarios: JsonField<MutableList<UpdatedScenario>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(result: Result) = apply {
                cancelled = result.cancelled
                clarificationQuestions = result.clarificationQuestions.map { it.toMutableList() }
                conversationHistory = result.conversationHistory.map { it.toMutableList() }
                message = result.message
                needsClarification = result.needsClarification
                sessionId = result.sessionId
                success = result.success
                updatedScenarios = result.updatedScenarios.map { it.toMutableList() }
                additionalProperties = result.additionalProperties.toMutableMap()
            }

            fun cancelled(cancelled: Boolean) = cancelled(JsonField.of(cancelled))

            /**
             * Sets [Builder.cancelled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cancelled] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cancelled(cancelled: JsonField<Boolean>) = apply { this.cancelled = cancelled }

            fun clarificationQuestions(clarificationQuestions: List<ClarificationQuestion>) =
                clarificationQuestions(JsonField.of(clarificationQuestions))

            /**
             * Sets [Builder.clarificationQuestions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.clarificationQuestions] with a well-typed
             * `List<ClarificationQuestion>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun clarificationQuestions(
                clarificationQuestions: JsonField<List<ClarificationQuestion>>
            ) = apply {
                this.clarificationQuestions = clarificationQuestions.map { it.toMutableList() }
            }

            /**
             * Adds a single [ClarificationQuestion] to [clarificationQuestions].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addClarificationQuestion(clarificationQuestion: ClarificationQuestion) = apply {
                clarificationQuestions =
                    (clarificationQuestions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("clarificationQuestions", it).add(clarificationQuestion)
                    }
            }

            fun conversationHistory(conversationHistory: List<ConversationHistory>) =
                conversationHistory(JsonField.of(conversationHistory))

            /**
             * Sets [Builder.conversationHistory] to an arbitrary JSON value.
             *
             * You should usually call [Builder.conversationHistory] with a well-typed
             * `List<ConversationHistory>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun conversationHistory(conversationHistory: JsonField<List<ConversationHistory>>) =
                apply {
                    this.conversationHistory = conversationHistory.map { it.toMutableList() }
                }

            /**
             * Adds a single [ConversationHistory] to [Builder.conversationHistory].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addConversationHistory(conversationHistory: ConversationHistory) = apply {
                this.conversationHistory =
                    (this.conversationHistory ?: JsonField.of(mutableListOf())).also {
                        checkKnown("conversationHistory", it).add(conversationHistory)
                    }
            }

            fun message(message: String) = message(JsonField.of(message))

            /**
             * Sets [Builder.message] to an arbitrary JSON value.
             *
             * You should usually call [Builder.message] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun message(message: JsonField<String>) = apply { this.message = message }

            fun needsClarification(needsClarification: Boolean) =
                needsClarification(JsonField.of(needsClarification))

            /**
             * Sets [Builder.needsClarification] to an arbitrary JSON value.
             *
             * You should usually call [Builder.needsClarification] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun needsClarification(needsClarification: JsonField<Boolean>) = apply {
                this.needsClarification = needsClarification
            }

            fun sessionId(sessionId: Long) = sessionId(JsonField.of(sessionId))

            /**
             * Sets [Builder.sessionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sessionId] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sessionId(sessionId: JsonField<Long>) = apply { this.sessionId = sessionId }

            fun success(success: Boolean) = success(JsonField.of(success))

            /**
             * Sets [Builder.success] to an arbitrary JSON value.
             *
             * You should usually call [Builder.success] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun success(success: JsonField<Boolean>) = apply { this.success = success }

            fun updatedScenarios(updatedScenarios: List<UpdatedScenario>) =
                updatedScenarios(JsonField.of(updatedScenarios))

            /**
             * Sets [Builder.updatedScenarios] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedScenarios] with a well-typed
             * `List<UpdatedScenario>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun updatedScenarios(updatedScenarios: JsonField<List<UpdatedScenario>>) = apply {
                this.updatedScenarios = updatedScenarios.map { it.toMutableList() }
            }

            /**
             * Adds a single [UpdatedScenario] to [updatedScenarios].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addUpdatedScenario(updatedScenario: UpdatedScenario) = apply {
                updatedScenarios =
                    (updatedScenarios ?: JsonField.of(mutableListOf())).also {
                        checkKnown("updatedScenarios", it).add(updatedScenario)
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
             * Returns an immutable instance of [Result].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Result =
                Result(
                    cancelled,
                    (clarificationQuestions ?: JsonMissing.of()).map { it.toImmutable() },
                    (conversationHistory ?: JsonMissing.of()).map { it.toImmutable() },
                    message,
                    needsClarification,
                    sessionId,
                    success,
                    (updatedScenarios ?: JsonMissing.of()).map { it.toImmutable() },
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

            cancelled()
            clarificationQuestions().ifPresent { it.forEach { it.validate() } }
            conversationHistory().ifPresent { it.forEach { it.validate() } }
            message()
            needsClarification()
            sessionId()
            success()
            updatedScenarios().ifPresent { it.forEach { it.validate() } }
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
            (if (cancelled.asKnown().isPresent) 1 else 0) +
                (clarificationQuestions.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                    ?: 0) +
                (conversationHistory.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (message.asKnown().isPresent) 1 else 0) +
                (if (needsClarification.asKnown().isPresent) 1 else 0) +
                (if (sessionId.asKnown().isPresent) 1 else 0) +
                (if (success.asKnown().isPresent) 1 else 0) +
                (updatedScenarios.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        class ClarificationQuestion
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val question: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("question")
                @ExcludeMissing
                question: JsonField<String> = JsonMissing.of()
            ) : this(question, mutableMapOf())

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun question(): Optional<String> = question.getOptional("question")

            /**
             * Returns the raw JSON value of [question].
             *
             * Unlike [question], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("question") @ExcludeMissing fun _question(): JsonField<String> = question

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
                 * [ClarificationQuestion].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ClarificationQuestion]. */
            class Builder internal constructor() {

                private var question: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(clarificationQuestion: ClarificationQuestion) = apply {
                    question = clarificationQuestion.question
                    additionalProperties = clarificationQuestion.additionalProperties.toMutableMap()
                }

                fun question(question: String) = question(JsonField.of(question))

                /**
                 * Sets [Builder.question] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.question] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun question(question: JsonField<String>) = apply { this.question = question }

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
                 * Returns an immutable instance of [ClarificationQuestion].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): ClarificationQuestion =
                    ClarificationQuestion(question, additionalProperties.toMutableMap())
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
            fun validate(): ClarificationQuestion = apply {
                if (validated) {
                    return@apply
                }

                question()
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
            internal fun validity(): Int = (if (question.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ClarificationQuestion &&
                    question == other.question &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(question, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ClarificationQuestion{question=$question, additionalProperties=$additionalProperties}"
        }

        class ConversationHistory
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val content: JsonField<String>,
            private val role: JsonField<String>,
            private val timestamp: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("content")
                @ExcludeMissing
                content: JsonField<String> = JsonMissing.of(),
                @JsonProperty("role") @ExcludeMissing role: JsonField<String> = JsonMissing.of(),
                @JsonProperty("timestamp")
                @ExcludeMissing
                timestamp: JsonField<String> = JsonMissing.of(),
            ) : this(content, role, timestamp, mutableMapOf())

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun content(): Optional<String> = content.getOptional("content")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun role(): Optional<String> = role.getOptional("role")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun timestamp(): Optional<String> = timestamp.getOptional("timestamp")

            /**
             * Returns the raw JSON value of [content].
             *
             * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

            /**
             * Returns the raw JSON value of [role].
             *
             * Unlike [role], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("role") @ExcludeMissing fun _role(): JsonField<String> = role

            /**
             * Returns the raw JSON value of [timestamp].
             *
             * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("timestamp")
            @ExcludeMissing
            fun _timestamp(): JsonField<String> = timestamp

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
                 * Returns a mutable builder for constructing an instance of [ConversationHistory].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ConversationHistory]. */
            class Builder internal constructor() {

                private var content: JsonField<String> = JsonMissing.of()
                private var role: JsonField<String> = JsonMissing.of()
                private var timestamp: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(conversationHistory: ConversationHistory) = apply {
                    content = conversationHistory.content
                    role = conversationHistory.role
                    timestamp = conversationHistory.timestamp
                    additionalProperties = conversationHistory.additionalProperties.toMutableMap()
                }

                fun content(content: String) = content(JsonField.of(content))

                /**
                 * Sets [Builder.content] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.content] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun content(content: JsonField<String>) = apply { this.content = content }

                fun role(role: String) = role(JsonField.of(role))

                /**
                 * Sets [Builder.role] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.role] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun role(role: JsonField<String>) = apply { this.role = role }

                fun timestamp(timestamp: String) = timestamp(JsonField.of(timestamp))

                /**
                 * Sets [Builder.timestamp] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.timestamp] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun timestamp(timestamp: JsonField<String>) = apply { this.timestamp = timestamp }

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
                 * Returns an immutable instance of [ConversationHistory].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): ConversationHistory =
                    ConversationHistory(
                        content,
                        role,
                        timestamp,
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
            fun validate(): ConversationHistory = apply {
                if (validated) {
                    return@apply
                }

                content()
                role()
                timestamp()
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
                (if (content.asKnown().isPresent) 1 else 0) +
                    (if (role.asKnown().isPresent) 1 else 0) +
                    (if (timestamp.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ConversationHistory &&
                    content == other.content &&
                    role == other.role &&
                    timestamp == other.timestamp &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(content, role, timestamp, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ConversationHistory{content=$content, role=$role, timestamp=$timestamp, additionalProperties=$additionalProperties}"
        }

        class UpdatedScenario
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [UpdatedScenario]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [UpdatedScenario]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(updatedScenario: UpdatedScenario) = apply {
                    additionalProperties = updatedScenario.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [UpdatedScenario].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): UpdatedScenario = UpdatedScenario(additionalProperties.toImmutable())
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
            fun validate(): UpdatedScenario = apply {
                if (validated) {
                    return@apply
                }

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
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is UpdatedScenario &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "UpdatedScenario{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Result &&
                cancelled == other.cancelled &&
                clarificationQuestions == other.clarificationQuestions &&
                conversationHistory == other.conversationHistory &&
                message == other.message &&
                needsClarification == other.needsClarification &&
                sessionId == other.sessionId &&
                success == other.success &&
                updatedScenarios == other.updatedScenarios &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                cancelled,
                clarificationQuestions,
                conversationHistory,
                message,
                needsClarification,
                sessionId,
                success,
                updatedScenarios,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Result{cancelled=$cancelled, clarificationQuestions=$clarificationQuestions, conversationHistory=$conversationHistory, message=$message, needsClarification=$needsClarification, sessionId=$sessionId, success=$success, updatedScenarios=$updatedScenarios, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ScenarioRetrieveScenarioAgentProgressResponse &&
            error == other.error &&
            mode == other.mode &&
            progressId == other.progressId &&
            result == other.result &&
            sessionId == other.sessionId &&
            status == other.status &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(error, mode, progressId, result, sessionId, status, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ScenarioRetrieveScenarioAgentProgressResponse{error=$error, mode=$mode, progressId=$progressId, result=$result, sessionId=$sessionId, status=$status, additionalProperties=$additionalProperties}"
}
