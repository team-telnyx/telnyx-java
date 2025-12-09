// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.globalipassignments

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Update a Global IP assignment. */
class GlobalIpAssignmentUpdateParams
private constructor(
    private val globalIpAssignmentId: String?,
    private val globalIpAssignmentUpdateRequest: GlobalIpAssignmentUpdateRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun globalIpAssignmentId(): Optional<String> = Optional.ofNullable(globalIpAssignmentId)

    /**
     * Identifies the resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = globalIpAssignmentUpdateRequest.id()

    /**
     * ISO 8601 formatted date-time indicating when the resource was created.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<String> = globalIpAssignmentUpdateRequest.createdAt()

    /**
     * Identifies the type of the resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordType(): Optional<String> = globalIpAssignmentUpdateRequest.recordType()

    /**
     * ISO 8601 formatted date-time indicating when the resource was updated.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<String> = globalIpAssignmentUpdateRequest.updatedAt()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun globalIpId(): Optional<String> = globalIpAssignmentUpdateRequest.globalIpId()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun wireguardPeerId(): Optional<String> = globalIpAssignmentUpdateRequest.wireguardPeerId()

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _id(): JsonField<String> = globalIpAssignmentUpdateRequest._id()

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _createdAt(): JsonField<String> = globalIpAssignmentUpdateRequest._createdAt()

    /**
     * Returns the raw JSON value of [recordType].
     *
     * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _recordType(): JsonField<String> = globalIpAssignmentUpdateRequest._recordType()

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _updatedAt(): JsonField<String> = globalIpAssignmentUpdateRequest._updatedAt()

    /**
     * Returns the raw JSON value of [globalIpId].
     *
     * Unlike [globalIpId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _globalIpId(): JsonField<String> = globalIpAssignmentUpdateRequest._globalIpId()

    /**
     * Returns the raw JSON value of [wireguardPeerId].
     *
     * Unlike [wireguardPeerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _wireguardPeerId(): JsonField<String> = globalIpAssignmentUpdateRequest._wireguardPeerId()

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        globalIpAssignmentUpdateRequest._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): GlobalIpAssignmentUpdateParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [GlobalIpAssignmentUpdateParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [GlobalIpAssignmentUpdateParams]. */
    class Builder internal constructor() {

        private var globalIpAssignmentId: String? = null
        private var globalIpAssignmentUpdateRequest: GlobalIpAssignmentUpdateRequest.Builder =
            GlobalIpAssignmentUpdateRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(globalIpAssignmentUpdateParams: GlobalIpAssignmentUpdateParams) = apply {
            globalIpAssignmentId = globalIpAssignmentUpdateParams.globalIpAssignmentId
            globalIpAssignmentUpdateRequest =
                globalIpAssignmentUpdateParams.globalIpAssignmentUpdateRequest.toBuilder()
            additionalHeaders = globalIpAssignmentUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = globalIpAssignmentUpdateParams.additionalQueryParams.toBuilder()
        }

        fun globalIpAssignmentId(globalIpAssignmentId: String?) = apply {
            this.globalIpAssignmentId = globalIpAssignmentId
        }

        /**
         * Alias for calling [Builder.globalIpAssignmentId] with
         * `globalIpAssignmentId.orElse(null)`.
         */
        fun globalIpAssignmentId(globalIpAssignmentId: Optional<String>) =
            globalIpAssignmentId(globalIpAssignmentId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [id]
         * - [createdAt]
         * - [recordType]
         * - [updatedAt]
         * - [globalIpId]
         * - etc.
         */
        fun globalIpAssignmentUpdateRequest(
            globalIpAssignmentUpdateRequest: GlobalIpAssignmentUpdateRequest
        ) = apply {
            this.globalIpAssignmentUpdateRequest = globalIpAssignmentUpdateRequest.toBuilder()
        }

        /** Identifies the resource. */
        fun id(id: String) = apply { globalIpAssignmentUpdateRequest.id(id) }

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { globalIpAssignmentUpdateRequest.id(id) }

        /** ISO 8601 formatted date-time indicating when the resource was created. */
        fun createdAt(createdAt: String) = apply {
            globalIpAssignmentUpdateRequest.createdAt(createdAt)
        }

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdAt(createdAt: JsonField<String>) = apply {
            globalIpAssignmentUpdateRequest.createdAt(createdAt)
        }

        /** Identifies the type of the resource. */
        fun recordType(recordType: String) = apply {
            globalIpAssignmentUpdateRequest.recordType(recordType)
        }

        /**
         * Sets [Builder.recordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recordType(recordType: JsonField<String>) = apply {
            globalIpAssignmentUpdateRequest.recordType(recordType)
        }

        /** ISO 8601 formatted date-time indicating when the resource was updated. */
        fun updatedAt(updatedAt: String) = apply {
            globalIpAssignmentUpdateRequest.updatedAt(updatedAt)
        }

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun updatedAt(updatedAt: JsonField<String>) = apply {
            globalIpAssignmentUpdateRequest.updatedAt(updatedAt)
        }

        fun globalIpId(globalIpId: String) = apply {
            globalIpAssignmentUpdateRequest.globalIpId(globalIpId)
        }

        /**
         * Sets [Builder.globalIpId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.globalIpId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun globalIpId(globalIpId: JsonField<String>) = apply {
            globalIpAssignmentUpdateRequest.globalIpId(globalIpId)
        }

        fun wireguardPeerId(wireguardPeerId: String) = apply {
            globalIpAssignmentUpdateRequest.wireguardPeerId(wireguardPeerId)
        }

        /**
         * Sets [Builder.wireguardPeerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.wireguardPeerId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun wireguardPeerId(wireguardPeerId: JsonField<String>) = apply {
            globalIpAssignmentUpdateRequest.wireguardPeerId(wireguardPeerId)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            globalIpAssignmentUpdateRequest.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            globalIpAssignmentUpdateRequest.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                globalIpAssignmentUpdateRequest.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            globalIpAssignmentUpdateRequest.removeAdditionalProperty(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            globalIpAssignmentUpdateRequest.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [GlobalIpAssignmentUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): GlobalIpAssignmentUpdateParams =
            GlobalIpAssignmentUpdateParams(
                globalIpAssignmentId,
                globalIpAssignmentUpdateRequest.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): GlobalIpAssignmentUpdateRequest = globalIpAssignmentUpdateRequest

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> globalIpAssignmentId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class GlobalIpAssignmentUpdateRequest
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val createdAt: JsonField<String>,
        private val recordType: JsonField<String>,
        private val updatedAt: JsonField<String>,
        private val globalIpId: JsonField<String>,
        private val wireguardPeerId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("global_ip_id")
            @ExcludeMissing
            globalIpId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("wireguard_peer_id")
            @ExcludeMissing
            wireguardPeerId: JsonField<String> = JsonMissing.of(),
        ) : this(id, createdAt, recordType, updatedAt, globalIpId, wireguardPeerId, mutableMapOf())

        fun toGlobalIpAssignment(): GlobalIpAssignment =
            GlobalIpAssignment.builder()
                .id(id)
                .createdAt(createdAt)
                .recordType(recordType)
                .updatedAt(updatedAt)
                .build()

        /**
         * Identifies the resource.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * ISO 8601 formatted date-time indicating when the resource was created.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAt(): Optional<String> = createdAt.getOptional("created_at")

        /**
         * Identifies the type of the resource.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordType(): Optional<String> = recordType.getOptional("record_type")

        /**
         * ISO 8601 formatted date-time indicating when the resource was updated.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun updatedAt(): Optional<String> = updatedAt.getOptional("updated_at")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun globalIpId(): Optional<String> = globalIpId.getOptional("global_ip_id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun wireguardPeerId(): Optional<String> = wireguardPeerId.getOptional("wireguard_peer_id")

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
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<String> = recordType

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt(): JsonField<String> = updatedAt

        /**
         * Returns the raw JSON value of [globalIpId].
         *
         * Unlike [globalIpId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("global_ip_id")
        @ExcludeMissing
        fun _globalIpId(): JsonField<String> = globalIpId

        /**
         * Returns the raw JSON value of [wireguardPeerId].
         *
         * Unlike [wireguardPeerId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("wireguard_peer_id")
        @ExcludeMissing
        fun _wireguardPeerId(): JsonField<String> = wireguardPeerId

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
             * [GlobalIpAssignmentUpdateRequest].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [GlobalIpAssignmentUpdateRequest]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<String> = JsonMissing.of()
            private var recordType: JsonField<String> = JsonMissing.of()
            private var updatedAt: JsonField<String> = JsonMissing.of()
            private var globalIpId: JsonField<String> = JsonMissing.of()
            private var wireguardPeerId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(globalIpAssignmentUpdateRequest: GlobalIpAssignmentUpdateRequest) =
                apply {
                    id = globalIpAssignmentUpdateRequest.id
                    createdAt = globalIpAssignmentUpdateRequest.createdAt
                    recordType = globalIpAssignmentUpdateRequest.recordType
                    updatedAt = globalIpAssignmentUpdateRequest.updatedAt
                    globalIpId = globalIpAssignmentUpdateRequest.globalIpId
                    wireguardPeerId = globalIpAssignmentUpdateRequest.wireguardPeerId
                    additionalProperties =
                        globalIpAssignmentUpdateRequest.additionalProperties.toMutableMap()
                }

            /** Identifies the resource. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** ISO 8601 formatted date-time indicating when the resource was created. */
            fun createdAt(createdAt: String) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<String>) = apply { this.createdAt = createdAt }

            /** Identifies the type of the resource. */
            fun recordType(recordType: String) = recordType(JsonField.of(recordType))

            /**
             * Sets [Builder.recordType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

            /** ISO 8601 formatted date-time indicating when the resource was updated. */
            fun updatedAt(updatedAt: String) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<String>) = apply { this.updatedAt = updatedAt }

            fun globalIpId(globalIpId: String) = globalIpId(JsonField.of(globalIpId))

            /**
             * Sets [Builder.globalIpId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.globalIpId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun globalIpId(globalIpId: JsonField<String>) = apply { this.globalIpId = globalIpId }

            fun wireguardPeerId(wireguardPeerId: String) =
                wireguardPeerId(JsonField.of(wireguardPeerId))

            /**
             * Sets [Builder.wireguardPeerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.wireguardPeerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun wireguardPeerId(wireguardPeerId: JsonField<String>) = apply {
                this.wireguardPeerId = wireguardPeerId
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
             * Returns an immutable instance of [GlobalIpAssignmentUpdateRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): GlobalIpAssignmentUpdateRequest =
                GlobalIpAssignmentUpdateRequest(
                    id,
                    createdAt,
                    recordType,
                    updatedAt,
                    globalIpId,
                    wireguardPeerId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): GlobalIpAssignmentUpdateRequest = apply {
            if (validated) {
                return@apply
            }

            id()
            createdAt()
            recordType()
            updatedAt()
            globalIpId()
            wireguardPeerId()
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
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (recordType.asKnown().isPresent) 1 else 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0) +
                (if (globalIpId.asKnown().isPresent) 1 else 0) +
                (if (wireguardPeerId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is GlobalIpAssignmentUpdateRequest &&
                id == other.id &&
                createdAt == other.createdAt &&
                recordType == other.recordType &&
                updatedAt == other.updatedAt &&
                globalIpId == other.globalIpId &&
                wireguardPeerId == other.wireguardPeerId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                createdAt,
                recordType,
                updatedAt,
                globalIpId,
                wireguardPeerId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "GlobalIpAssignmentUpdateRequest{id=$id, createdAt=$createdAt, recordType=$recordType, updatedAt=$updatedAt, globalIpId=$globalIpId, wireguardPeerId=$wireguardPeerId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is GlobalIpAssignmentUpdateParams &&
            globalIpAssignmentId == other.globalIpAssignmentId &&
            globalIpAssignmentUpdateRequest == other.globalIpAssignmentUpdateRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            globalIpAssignmentId,
            globalIpAssignmentUpdateRequest,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "GlobalIpAssignmentUpdateParams{globalIpAssignmentId=$globalIpAssignmentId, globalIpAssignmentUpdateRequest=$globalIpAssignmentUpdateRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
