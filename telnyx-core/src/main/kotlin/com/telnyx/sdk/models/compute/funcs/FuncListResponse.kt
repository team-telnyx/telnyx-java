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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class FuncListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val bindings: JsonField<List<Binding>>,
    private val createdAt: JsonField<String>,
    private val invokeUrl: JsonField<String>,
    private val message: JsonField<String>,
    private val name: JsonField<String>,
    private val recordType: JsonField<String>,
    private val status: JsonField<String>,
    private val statusDetail: JsonField<String>,
    private val updatedAt: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("bindings")
        @ExcludeMissing
        bindings: JsonField<List<Binding>> = JsonMissing.of(),
        @JsonProperty("created_at") @ExcludeMissing createdAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("invoke_url") @ExcludeMissing invokeUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status_detail")
        @ExcludeMissing
        statusDetail: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at") @ExcludeMissing updatedAt: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        bindings,
        createdAt,
        invokeUrl,
        message,
        name,
        recordType,
        status,
        statusDetail,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Always present; empty when the function has no bindings.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bindings(): Optional<List<Binding>> = bindings.getOptional("bindings")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<String> = createdAt.getOptional("created_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun invokeUrl(): Optional<String> = invokeUrl.getOptional("invoke_url")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun message(): Optional<String> = message.getOptional("message")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordType(): Optional<String> = recordType.getOptional("record_type")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<String> = status.getOptional("status")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun statusDetail(): Optional<String> = statusDetail.getOptional("status_detail")

    /**
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
     * Returns the raw JSON value of [bindings].
     *
     * Unlike [bindings], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bindings") @ExcludeMissing fun _bindings(): JsonField<List<Binding>> = bindings

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<String> = createdAt

    /**
     * Returns the raw JSON value of [invokeUrl].
     *
     * Unlike [invokeUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("invoke_url") @ExcludeMissing fun _invokeUrl(): JsonField<String> = invokeUrl

    /**
     * Returns the raw JSON value of [message].
     *
     * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

    /**
     * Returns the raw JSON value of [statusDetail].
     *
     * Unlike [statusDetail], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status_detail")
    @ExcludeMissing
    fun _statusDetail(): JsonField<String> = statusDetail

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

        /** Returns a mutable builder for constructing an instance of [FuncListResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FuncListResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var bindings: JsonField<MutableList<Binding>>? = null
        private var createdAt: JsonField<String> = JsonMissing.of()
        private var invokeUrl: JsonField<String> = JsonMissing.of()
        private var message: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var recordType: JsonField<String> = JsonMissing.of()
        private var status: JsonField<String> = JsonMissing.of()
        private var statusDetail: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(funcListResponse: FuncListResponse) = apply {
            id = funcListResponse.id
            bindings = funcListResponse.bindings.map { it.toMutableList() }
            createdAt = funcListResponse.createdAt
            invokeUrl = funcListResponse.invokeUrl
            message = funcListResponse.message
            name = funcListResponse.name
            recordType = funcListResponse.recordType
            status = funcListResponse.status
            statusDetail = funcListResponse.statusDetail
            updatedAt = funcListResponse.updatedAt
            additionalProperties = funcListResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Always present; empty when the function has no bindings. */
        fun bindings(bindings: List<Binding>) = bindings(JsonField.of(bindings))

        /**
         * Sets [Builder.bindings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bindings] with a well-typed `List<Binding>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun bindings(bindings: JsonField<List<Binding>>) = apply {
            this.bindings = bindings.map { it.toMutableList() }
        }

        /**
         * Adds a single [Binding] to [bindings].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBinding(binding: Binding) = apply {
            bindings =
                (bindings ?: JsonField.of(mutableListOf())).also {
                    checkKnown("bindings", it).add(binding)
                }
        }

        fun createdAt(createdAt: String) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdAt(createdAt: JsonField<String>) = apply { this.createdAt = createdAt }

        fun invokeUrl(invokeUrl: String) = invokeUrl(JsonField.of(invokeUrl))

        /**
         * Sets [Builder.invokeUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invokeUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun invokeUrl(invokeUrl: JsonField<String>) = apply { this.invokeUrl = invokeUrl }

        fun message(message: String) = message(JsonField.of(message))

        /**
         * Sets [Builder.message] to an arbitrary JSON value.
         *
         * You should usually call [Builder.message] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun message(message: JsonField<String>) = apply { this.message = message }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun recordType(recordType: String) = recordType(JsonField.of(recordType))

        /**
         * Sets [Builder.recordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

        fun status(status: String) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<String>) = apply { this.status = status }

        fun statusDetail(statusDetail: String) = statusDetail(JsonField.of(statusDetail))

        /**
         * Sets [Builder.statusDetail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statusDetail] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun statusDetail(statusDetail: JsonField<String>) = apply {
            this.statusDetail = statusDetail
        }

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
         * Returns an immutable instance of [FuncListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): FuncListResponse =
            FuncListResponse(
                id,
                (bindings ?: JsonMissing.of()).map { it.toImmutable() },
                createdAt,
                invokeUrl,
                message,
                name,
                recordType,
                status,
                statusDetail,
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
    fun validate(): FuncListResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        bindings().ifPresent { it.forEach { it.validate() } }
        createdAt()
        invokeUrl()
        message()
        name()
        recordType()
        status()
        statusDetail()
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
            (bindings.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (invokeUrl.asKnown().isPresent) 1 else 0) +
            (if (message.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (recordType.asKnown().isPresent) 1 else 0) +
            (if (status.asKnown().isPresent) 1 else 0) +
            (if (statusDetail.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    /**
     * A function-scoped binding persisted at ship time. For binding_type=actor, actor_type is the
     * referenced Stateful Actor type and env_name is the binding name exposed to the function.
     */
    class Binding
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val actorType: JsonField<String>,
        private val bindingId: JsonField<String>,
        private val bindingType: JsonField<String>,
        private val bucketId: JsonField<String>,
        private val createdAt: JsonField<String>,
        private val envName: JsonField<String>,
        private val funcId: JsonField<String>,
        private val kvId: JsonField<String>,
        private val recordType: JsonField<String>,
        private val secretName: JsonField<String>,
        private val sqldbId: JsonField<String>,
        private val status: JsonField<String>,
        private val updatedAt: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("actor_type")
            @ExcludeMissing
            actorType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("binding_id")
            @ExcludeMissing
            bindingId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("binding_type")
            @ExcludeMissing
            bindingType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("bucket_id")
            @ExcludeMissing
            bucketId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("env_name") @ExcludeMissing envName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("func_id") @ExcludeMissing funcId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("kv_id") @ExcludeMissing kvId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("secret_name")
            @ExcludeMissing
            secretName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sqldb_id") @ExcludeMissing sqldbId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<String> = JsonMissing.of(),
        ) : this(
            actorType,
            bindingId,
            bindingType,
            bucketId,
            createdAt,
            envName,
            funcId,
            kvId,
            recordType,
            secretName,
            sqldbId,
            status,
            updatedAt,
            mutableMapOf(),
        )

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun actorType(): Optional<String> = actorType.getOptional("actor_type")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun bindingId(): Optional<String> = bindingId.getOptional("binding_id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun bindingType(): Optional<String> = bindingType.getOptional("binding_type")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun bucketId(): Optional<String> = bucketId.getOptional("bucket_id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAt(): Optional<String> = createdAt.getOptional("created_at")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun envName(): Optional<String> = envName.getOptional("env_name")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun funcId(): Optional<String> = funcId.getOptional("func_id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun kvId(): Optional<String> = kvId.getOptional("kv_id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordType(): Optional<String> = recordType.getOptional("record_type")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun secretName(): Optional<String> = secretName.getOptional("secret_name")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sqldbId(): Optional<String> = sqldbId.getOptional("sqldb_id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun status(): Optional<String> = status.getOptional("status")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun updatedAt(): Optional<String> = updatedAt.getOptional("updated_at")

        /**
         * Returns the raw JSON value of [actorType].
         *
         * Unlike [actorType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("actor_type") @ExcludeMissing fun _actorType(): JsonField<String> = actorType

        /**
         * Returns the raw JSON value of [bindingId].
         *
         * Unlike [bindingId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("binding_id") @ExcludeMissing fun _bindingId(): JsonField<String> = bindingId

        /**
         * Returns the raw JSON value of [bindingType].
         *
         * Unlike [bindingType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("binding_type")
        @ExcludeMissing
        fun _bindingType(): JsonField<String> = bindingType

        /**
         * Returns the raw JSON value of [bucketId].
         *
         * Unlike [bucketId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("bucket_id") @ExcludeMissing fun _bucketId(): JsonField<String> = bucketId

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<String> = createdAt

        /**
         * Returns the raw JSON value of [envName].
         *
         * Unlike [envName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("env_name") @ExcludeMissing fun _envName(): JsonField<String> = envName

        /**
         * Returns the raw JSON value of [funcId].
         *
         * Unlike [funcId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("func_id") @ExcludeMissing fun _funcId(): JsonField<String> = funcId

        /**
         * Returns the raw JSON value of [kvId].
         *
         * Unlike [kvId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("kv_id") @ExcludeMissing fun _kvId(): JsonField<String> = kvId

        /**
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<String> = recordType

        /**
         * Returns the raw JSON value of [secretName].
         *
         * Unlike [secretName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("secret_name")
        @ExcludeMissing
        fun _secretName(): JsonField<String> = secretName

        /**
         * Returns the raw JSON value of [sqldbId].
         *
         * Unlike [sqldbId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sqldb_id") @ExcludeMissing fun _sqldbId(): JsonField<String> = sqldbId

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

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

            /** Returns a mutable builder for constructing an instance of [Binding]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Binding]. */
        class Builder internal constructor() {

            private var actorType: JsonField<String> = JsonMissing.of()
            private var bindingId: JsonField<String> = JsonMissing.of()
            private var bindingType: JsonField<String> = JsonMissing.of()
            private var bucketId: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<String> = JsonMissing.of()
            private var envName: JsonField<String> = JsonMissing.of()
            private var funcId: JsonField<String> = JsonMissing.of()
            private var kvId: JsonField<String> = JsonMissing.of()
            private var recordType: JsonField<String> = JsonMissing.of()
            private var secretName: JsonField<String> = JsonMissing.of()
            private var sqldbId: JsonField<String> = JsonMissing.of()
            private var status: JsonField<String> = JsonMissing.of()
            private var updatedAt: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(binding: Binding) = apply {
                actorType = binding.actorType
                bindingId = binding.bindingId
                bindingType = binding.bindingType
                bucketId = binding.bucketId
                createdAt = binding.createdAt
                envName = binding.envName
                funcId = binding.funcId
                kvId = binding.kvId
                recordType = binding.recordType
                secretName = binding.secretName
                sqldbId = binding.sqldbId
                status = binding.status
                updatedAt = binding.updatedAt
                additionalProperties = binding.additionalProperties.toMutableMap()
            }

            fun actorType(actorType: String) = actorType(JsonField.of(actorType))

            /**
             * Sets [Builder.actorType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.actorType] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun actorType(actorType: JsonField<String>) = apply { this.actorType = actorType }

            fun bindingId(bindingId: String) = bindingId(JsonField.of(bindingId))

            /**
             * Sets [Builder.bindingId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bindingId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bindingId(bindingId: JsonField<String>) = apply { this.bindingId = bindingId }

            fun bindingType(bindingType: String) = bindingType(JsonField.of(bindingType))

            /**
             * Sets [Builder.bindingType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bindingType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bindingType(bindingType: JsonField<String>) = apply {
                this.bindingType = bindingType
            }

            fun bucketId(bucketId: String) = bucketId(JsonField.of(bucketId))

            /**
             * Sets [Builder.bucketId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bucketId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bucketId(bucketId: JsonField<String>) = apply { this.bucketId = bucketId }

            fun createdAt(createdAt: String) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<String>) = apply { this.createdAt = createdAt }

            fun envName(envName: String) = envName(JsonField.of(envName))

            /**
             * Sets [Builder.envName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.envName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun envName(envName: JsonField<String>) = apply { this.envName = envName }

            fun funcId(funcId: String) = funcId(JsonField.of(funcId))

            /**
             * Sets [Builder.funcId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.funcId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun funcId(funcId: JsonField<String>) = apply { this.funcId = funcId }

            fun kvId(kvId: String) = kvId(JsonField.of(kvId))

            /**
             * Sets [Builder.kvId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.kvId] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun kvId(kvId: JsonField<String>) = apply { this.kvId = kvId }

            fun recordType(recordType: String) = recordType(JsonField.of(recordType))

            /**
             * Sets [Builder.recordType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

            fun secretName(secretName: String) = secretName(JsonField.of(secretName))

            /**
             * Sets [Builder.secretName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.secretName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun secretName(secretName: JsonField<String>) = apply { this.secretName = secretName }

            fun sqldbId(sqldbId: String) = sqldbId(JsonField.of(sqldbId))

            /**
             * Sets [Builder.sqldbId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sqldbId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sqldbId(sqldbId: JsonField<String>) = apply { this.sqldbId = sqldbId }

            fun status(status: String) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<String>) = apply { this.status = status }

            fun updatedAt(updatedAt: String) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [Binding].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Binding =
                Binding(
                    actorType,
                    bindingId,
                    bindingType,
                    bucketId,
                    createdAt,
                    envName,
                    funcId,
                    kvId,
                    recordType,
                    secretName,
                    sqldbId,
                    status,
                    updatedAt,
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
        fun validate(): Binding = apply {
            if (validated) {
                return@apply
            }

            actorType()
            bindingId()
            bindingType()
            bucketId()
            createdAt()
            envName()
            funcId()
            kvId()
            recordType()
            secretName()
            sqldbId()
            status()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (actorType.asKnown().isPresent) 1 else 0) +
                (if (bindingId.asKnown().isPresent) 1 else 0) +
                (if (bindingType.asKnown().isPresent) 1 else 0) +
                (if (bucketId.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (envName.asKnown().isPresent) 1 else 0) +
                (if (funcId.asKnown().isPresent) 1 else 0) +
                (if (kvId.asKnown().isPresent) 1 else 0) +
                (if (recordType.asKnown().isPresent) 1 else 0) +
                (if (secretName.asKnown().isPresent) 1 else 0) +
                (if (sqldbId.asKnown().isPresent) 1 else 0) +
                (if (status.asKnown().isPresent) 1 else 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Binding &&
                actorType == other.actorType &&
                bindingId == other.bindingId &&
                bindingType == other.bindingType &&
                bucketId == other.bucketId &&
                createdAt == other.createdAt &&
                envName == other.envName &&
                funcId == other.funcId &&
                kvId == other.kvId &&
                recordType == other.recordType &&
                secretName == other.secretName &&
                sqldbId == other.sqldbId &&
                status == other.status &&
                updatedAt == other.updatedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                actorType,
                bindingId,
                bindingType,
                bucketId,
                createdAt,
                envName,
                funcId,
                kvId,
                recordType,
                secretName,
                sqldbId,
                status,
                updatedAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Binding{actorType=$actorType, bindingId=$bindingId, bindingType=$bindingType, bucketId=$bucketId, createdAt=$createdAt, envName=$envName, funcId=$funcId, kvId=$kvId, recordType=$recordType, secretName=$secretName, sqldbId=$sqldbId, status=$status, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FuncListResponse &&
            id == other.id &&
            bindings == other.bindings &&
            createdAt == other.createdAt &&
            invokeUrl == other.invokeUrl &&
            message == other.message &&
            name == other.name &&
            recordType == other.recordType &&
            status == other.status &&
            statusDetail == other.statusDetail &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            bindings,
            createdAt,
            invokeUrl,
            message,
            name,
            recordType,
            status,
            statusDetail,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FuncListResponse{id=$id, bindings=$bindings, createdAt=$createdAt, invokeUrl=$invokeUrl, message=$message, name=$name, recordType=$recordType, status=$status, statusDetail=$statusDetail, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
