// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.compute

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
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ComputeRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<Data>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of()
    ) : this(data, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): Optional<Data> = data.getOptional("data")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

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

        /** Returns a mutable builder for constructing an instance of [ComputeRetrieveResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ComputeRetrieveResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(computeRetrieveResponse: ComputeRetrieveResponse) = apply {
            data = computeRetrieveResponse.data
            additionalProperties = computeRetrieveResponse.additionalProperties.toMutableMap()
        }

        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

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
         * Returns an immutable instance of [ComputeRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ComputeRetrieveResponse =
            ComputeRetrieveResponse(data, additionalProperties.toMutableMap())
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
    fun validate(): ComputeRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        data().ifPresent { it.validate() }
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
    @JvmSynthetic internal fun validity(): Int = (data.asKnown().getOrNull()?.validity() ?: 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val createdAt: JsonField<String>,
        private val ownerFunctionId: JsonField<String>,
        private val placement: JsonField<Placement>,
        private val recordType: JsonField<String>,
        private val status: JsonField<String>,
        private val type: JsonField<String>,
        private val updatedAt: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("owner_function_id")
            @ExcludeMissing
            ownerFunctionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("placement")
            @ExcludeMissing
            placement: JsonField<Placement> = JsonMissing.of(),
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            createdAt,
            ownerFunctionId,
            placement,
            recordType,
            status,
            type,
            updatedAt,
            mutableMapOf(),
        )

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAt(): Optional<String> = createdAt.getOptional("created_at")

        /**
         * ID of the function that owns and ships this actor type. Empty when the type is unowned.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun ownerFunctionId(): Optional<String> = ownerFunctionId.getOptional("owner_function_id")

        /**
         * Last deployment fan-out report, not a live probe. Omitted on actor types without a
         * placement-aware deployment.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun placement(): Optional<Placement> = placement.getOptional("placement")

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
        fun type(): Optional<String> = type.getOptional("type")

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
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<String> = createdAt

        /**
         * Returns the raw JSON value of [ownerFunctionId].
         *
         * Unlike [ownerFunctionId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("owner_function_id")
        @ExcludeMissing
        fun _ownerFunctionId(): JsonField<String> = ownerFunctionId

        /**
         * Returns the raw JSON value of [placement].
         *
         * Unlike [placement], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("placement")
        @ExcludeMissing
        fun _placement(): JsonField<Placement> = placement

        /**
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<String> = recordType

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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

            /** Returns a mutable builder for constructing an instance of [Data]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<String> = JsonMissing.of()
            private var ownerFunctionId: JsonField<String> = JsonMissing.of()
            private var placement: JsonField<Placement> = JsonMissing.of()
            private var recordType: JsonField<String> = JsonMissing.of()
            private var status: JsonField<String> = JsonMissing.of()
            private var type: JsonField<String> = JsonMissing.of()
            private var updatedAt: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                createdAt = data.createdAt
                ownerFunctionId = data.ownerFunctionId
                placement = data.placement
                recordType = data.recordType
                status = data.status
                type = data.type
                updatedAt = data.updatedAt
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun createdAt(createdAt: String) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<String>) = apply { this.createdAt = createdAt }

            /**
             * ID of the function that owns and ships this actor type. Empty when the type is
             * unowned.
             */
            fun ownerFunctionId(ownerFunctionId: String) =
                ownerFunctionId(JsonField.of(ownerFunctionId))

            /**
             * Sets [Builder.ownerFunctionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ownerFunctionId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ownerFunctionId(ownerFunctionId: JsonField<String>) = apply {
                this.ownerFunctionId = ownerFunctionId
            }

            /**
             * Last deployment fan-out report, not a live probe. Omitted on actor types without a
             * placement-aware deployment.
             */
            fun placement(placement: Placement) = placement(JsonField.of(placement))

            /**
             * Sets [Builder.placement] to an arbitrary JSON value.
             *
             * You should usually call [Builder.placement] with a well-typed [Placement] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun placement(placement: JsonField<Placement>) = apply { this.placement = placement }

            fun recordType(recordType: String) = recordType(JsonField.of(recordType))

            /**
             * Sets [Builder.recordType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

            fun status(status: String) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<String>) = apply { this.status = status }

            fun type(type: String) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<String>) = apply { this.type = type }

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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Data =
                Data(
                    id,
                    createdAt,
                    ownerFunctionId,
                    placement,
                    recordType,
                    status,
                    type,
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
        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            id()
            createdAt()
            ownerFunctionId()
            placement().ifPresent { it.validate() }
            recordType()
            status()
            type()
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (ownerFunctionId.asKnown().isPresent) 1 else 0) +
                (placement.asKnown().getOrNull()?.validity() ?: 0) +
                (if (recordType.asKnown().isPresent) 1 else 0) +
                (if (status.asKnown().isPresent) 1 else 0) +
                (if (type.asKnown().isPresent) 1 else 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0)

        /**
         * Last deployment fan-out report, not a live probe. Omitted on actor types without a
         * placement-aware deployment.
         */
        class Placement
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val clusterResults: JsonField<List<ClusterResult>>,
            private val clusters: JsonField<List<String>>,
            private val excludedClusters: JsonField<List<String>>,
            private val observedAt: JsonField<String>,
            private val partial: JsonField<Boolean>,
            private val policy: JsonField<Policy>,
            private val uncheckedClusters: JsonField<List<String>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("cluster_results")
                @ExcludeMissing
                clusterResults: JsonField<List<ClusterResult>> = JsonMissing.of(),
                @JsonProperty("clusters")
                @ExcludeMissing
                clusters: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("excluded_clusters")
                @ExcludeMissing
                excludedClusters: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("observed_at")
                @ExcludeMissing
                observedAt: JsonField<String> = JsonMissing.of(),
                @JsonProperty("partial")
                @ExcludeMissing
                partial: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("policy")
                @ExcludeMissing
                policy: JsonField<Policy> = JsonMissing.of(),
                @JsonProperty("unchecked_clusters")
                @ExcludeMissing
                uncheckedClusters: JsonField<List<String>> = JsonMissing.of(),
            ) : this(
                clusterResults,
                clusters,
                excludedClusters,
                observedAt,
                partial,
                policy,
                uncheckedClusters,
                mutableMapOf(),
            )

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun clusterResults(): Optional<List<ClusterResult>> =
                clusterResults.getOptional("cluster_results")

            /**
             * Public regions with successful deployment
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun clusters(): Optional<List<String>> = clusters.getOptional("clusters")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun excludedClusters(): Optional<List<String>> =
                excludedClusters.getOptional("excluded_clusters")

            /**
             * Optional ISO-8601 millisecond timestamp
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun observedAt(): Optional<String> = observedAt.getOptional("observed_at")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun partial(): Optional<Boolean> = partial.getOptional("partial")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun policy(): Optional<Policy> = policy.getOptional("policy")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun uncheckedClusters(): Optional<List<String>> =
                uncheckedClusters.getOptional("unchecked_clusters")

            /**
             * Returns the raw JSON value of [clusterResults].
             *
             * Unlike [clusterResults], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("cluster_results")
            @ExcludeMissing
            fun _clusterResults(): JsonField<List<ClusterResult>> = clusterResults

            /**
             * Returns the raw JSON value of [clusters].
             *
             * Unlike [clusters], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("clusters")
            @ExcludeMissing
            fun _clusters(): JsonField<List<String>> = clusters

            /**
             * Returns the raw JSON value of [excludedClusters].
             *
             * Unlike [excludedClusters], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("excluded_clusters")
            @ExcludeMissing
            fun _excludedClusters(): JsonField<List<String>> = excludedClusters

            /**
             * Returns the raw JSON value of [observedAt].
             *
             * Unlike [observedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("observed_at")
            @ExcludeMissing
            fun _observedAt(): JsonField<String> = observedAt

            /**
             * Returns the raw JSON value of [partial].
             *
             * Unlike [partial], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("partial") @ExcludeMissing fun _partial(): JsonField<Boolean> = partial

            /**
             * Returns the raw JSON value of [policy].
             *
             * Unlike [policy], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("policy") @ExcludeMissing fun _policy(): JsonField<Policy> = policy

            /**
             * Returns the raw JSON value of [uncheckedClusters].
             *
             * Unlike [uncheckedClusters], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("unchecked_clusters")
            @ExcludeMissing
            fun _uncheckedClusters(): JsonField<List<String>> = uncheckedClusters

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

                /** Returns a mutable builder for constructing an instance of [Placement]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Placement]. */
            class Builder internal constructor() {

                private var clusterResults: JsonField<MutableList<ClusterResult>>? = null
                private var clusters: JsonField<MutableList<String>>? = null
                private var excludedClusters: JsonField<MutableList<String>>? = null
                private var observedAt: JsonField<String> = JsonMissing.of()
                private var partial: JsonField<Boolean> = JsonMissing.of()
                private var policy: JsonField<Policy> = JsonMissing.of()
                private var uncheckedClusters: JsonField<MutableList<String>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(placement: Placement) = apply {
                    clusterResults = placement.clusterResults.map { it.toMutableList() }
                    clusters = placement.clusters.map { it.toMutableList() }
                    excludedClusters = placement.excludedClusters.map { it.toMutableList() }
                    observedAt = placement.observedAt
                    partial = placement.partial
                    policy = placement.policy
                    uncheckedClusters = placement.uncheckedClusters.map { it.toMutableList() }
                    additionalProperties = placement.additionalProperties.toMutableMap()
                }

                fun clusterResults(clusterResults: List<ClusterResult>) =
                    clusterResults(JsonField.of(clusterResults))

                /**
                 * Sets [Builder.clusterResults] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.clusterResults] with a well-typed
                 * `List<ClusterResult>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun clusterResults(clusterResults: JsonField<List<ClusterResult>>) = apply {
                    this.clusterResults = clusterResults.map { it.toMutableList() }
                }

                /**
                 * Adds a single [ClusterResult] to [clusterResults].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addClusterResult(clusterResult: ClusterResult) = apply {
                    clusterResults =
                        (clusterResults ?: JsonField.of(mutableListOf())).also {
                            checkKnown("clusterResults", it).add(clusterResult)
                        }
                }

                /** Public regions with successful deployment */
                fun clusters(clusters: List<String>) = clusters(JsonField.of(clusters))

                /**
                 * Sets [Builder.clusters] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.clusters] with a well-typed `List<String>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun clusters(clusters: JsonField<List<String>>) = apply {
                    this.clusters = clusters.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [clusters].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addCluster(cluster: String) = apply {
                    clusters =
                        (clusters ?: JsonField.of(mutableListOf())).also {
                            checkKnown("clusters", it).add(cluster)
                        }
                }

                fun excludedClusters(excludedClusters: List<String>) =
                    excludedClusters(JsonField.of(excludedClusters))

                /**
                 * Sets [Builder.excludedClusters] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.excludedClusters] with a well-typed
                 * `List<String>` value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun excludedClusters(excludedClusters: JsonField<List<String>>) = apply {
                    this.excludedClusters = excludedClusters.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [excludedClusters].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addExcludedCluster(excludedCluster: String) = apply {
                    excludedClusters =
                        (excludedClusters ?: JsonField.of(mutableListOf())).also {
                            checkKnown("excludedClusters", it).add(excludedCluster)
                        }
                }

                /** Optional ISO-8601 millisecond timestamp */
                fun observedAt(observedAt: String) = observedAt(JsonField.of(observedAt))

                /**
                 * Sets [Builder.observedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.observedAt] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun observedAt(observedAt: JsonField<String>) = apply {
                    this.observedAt = observedAt
                }

                fun partial(partial: Boolean) = partial(JsonField.of(partial))

                /**
                 * Sets [Builder.partial] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.partial] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun partial(partial: JsonField<Boolean>) = apply { this.partial = partial }

                fun policy(policy: Policy) = policy(JsonField.of(policy))

                /**
                 * Sets [Builder.policy] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.policy] with a well-typed [Policy] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun policy(policy: JsonField<Policy>) = apply { this.policy = policy }

                fun uncheckedClusters(uncheckedClusters: List<String>) =
                    uncheckedClusters(JsonField.of(uncheckedClusters))

                /**
                 * Sets [Builder.uncheckedClusters] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.uncheckedClusters] with a well-typed
                 * `List<String>` value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun uncheckedClusters(uncheckedClusters: JsonField<List<String>>) = apply {
                    this.uncheckedClusters = uncheckedClusters.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [uncheckedClusters].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addUncheckedCluster(uncheckedCluster: String) = apply {
                    uncheckedClusters =
                        (uncheckedClusters ?: JsonField.of(mutableListOf())).also {
                            checkKnown("uncheckedClusters", it).add(uncheckedCluster)
                        }
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
                 * Returns an immutable instance of [Placement].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Placement =
                    Placement(
                        (clusterResults ?: JsonMissing.of()).map { it.toImmutable() },
                        (clusters ?: JsonMissing.of()).map { it.toImmutable() },
                        (excludedClusters ?: JsonMissing.of()).map { it.toImmutable() },
                        observedAt,
                        partial,
                        policy,
                        (uncheckedClusters ?: JsonMissing.of()).map { it.toImmutable() },
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
            fun validate(): Placement = apply {
                if (validated) {
                    return@apply
                }

                clusterResults().ifPresent { it.forEach { it.validate() } }
                clusters()
                excludedClusters()
                observedAt()
                partial()
                policy().ifPresent { it.validate() }
                uncheckedClusters()
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
                (clusterResults.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (clusters.asKnown().getOrNull()?.size ?: 0) +
                    (excludedClusters.asKnown().getOrNull()?.size ?: 0) +
                    (if (observedAt.asKnown().isPresent) 1 else 0) +
                    (if (partial.asKnown().isPresent) 1 else 0) +
                    (policy.asKnown().getOrNull()?.validity() ?: 0) +
                    (uncheckedClusters.asKnown().getOrNull()?.size ?: 0)

            class ClusterResult
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val clusterId: JsonField<String>,
                private val error: JsonField<String>,
                private val errorCode: JsonField<String>,
                private val status: JsonField<String>,
                private val success: JsonField<Boolean>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("cluster_id")
                    @ExcludeMissing
                    clusterId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("error")
                    @ExcludeMissing
                    error: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("error_code")
                    @ExcludeMissing
                    errorCode: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("status")
                    @ExcludeMissing
                    status: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("success")
                    @ExcludeMissing
                    success: JsonField<Boolean> = JsonMissing.of(),
                ) : this(clusterId, error, errorCode, status, success, mutableMapOf())

                /**
                 * Public region, or unknown when no mapping exists
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun clusterId(): Optional<String> = clusterId.getOptional("cluster_id")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun error(): Optional<String> = error.getOptional("error")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun errorCode(): Optional<String> = errorCode.getOptional("error_code")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun status(): Optional<String> = status.getOptional("status")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun success(): Optional<Boolean> = success.getOptional("success")

                /**
                 * Returns the raw JSON value of [clusterId].
                 *
                 * Unlike [clusterId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("cluster_id")
                @ExcludeMissing
                fun _clusterId(): JsonField<String> = clusterId

                /**
                 * Returns the raw JSON value of [error].
                 *
                 * Unlike [error], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<String> = error

                /**
                 * Returns the raw JSON value of [errorCode].
                 *
                 * Unlike [errorCode], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("error_code")
                @ExcludeMissing
                fun _errorCode(): JsonField<String> = errorCode

                /**
                 * Returns the raw JSON value of [status].
                 *
                 * Unlike [status], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

                /**
                 * Returns the raw JSON value of [success].
                 *
                 * Unlike [success], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("success")
                @ExcludeMissing
                fun _success(): JsonField<Boolean> = success

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
                     * Returns a mutable builder for constructing an instance of [ClusterResult].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [ClusterResult]. */
                class Builder internal constructor() {

                    private var clusterId: JsonField<String> = JsonMissing.of()
                    private var error: JsonField<String> = JsonMissing.of()
                    private var errorCode: JsonField<String> = JsonMissing.of()
                    private var status: JsonField<String> = JsonMissing.of()
                    private var success: JsonField<Boolean> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(clusterResult: ClusterResult) = apply {
                        clusterId = clusterResult.clusterId
                        error = clusterResult.error
                        errorCode = clusterResult.errorCode
                        status = clusterResult.status
                        success = clusterResult.success
                        additionalProperties = clusterResult.additionalProperties.toMutableMap()
                    }

                    /** Public region, or unknown when no mapping exists */
                    fun clusterId(clusterId: String) = clusterId(JsonField.of(clusterId))

                    /**
                     * Sets [Builder.clusterId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.clusterId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun clusterId(clusterId: JsonField<String>) = apply {
                        this.clusterId = clusterId
                    }

                    fun error(error: String) = error(JsonField.of(error))

                    /**
                     * Sets [Builder.error] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.error] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun error(error: JsonField<String>) = apply { this.error = error }

                    fun errorCode(errorCode: String) = errorCode(JsonField.of(errorCode))

                    /**
                     * Sets [Builder.errorCode] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.errorCode] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun errorCode(errorCode: JsonField<String>) = apply {
                        this.errorCode = errorCode
                    }

                    fun status(status: String) = status(JsonField.of(status))

                    /**
                     * Sets [Builder.status] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.status] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun status(status: JsonField<String>) = apply { this.status = status }

                    fun success(success: Boolean) = success(JsonField.of(success))

                    /**
                     * Sets [Builder.success] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.success] with a well-typed [Boolean] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun success(success: JsonField<Boolean>) = apply { this.success = success }

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
                     * Returns an immutable instance of [ClusterResult].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): ClusterResult =
                        ClusterResult(
                            clusterId,
                            error,
                            errorCode,
                            status,
                            success,
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
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): ClusterResult = apply {
                    if (validated) {
                        return@apply
                    }

                    clusterId()
                    error()
                    errorCode()
                    status()
                    success()
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
                    (if (clusterId.asKnown().isPresent) 1 else 0) +
                        (if (error.asKnown().isPresent) 1 else 0) +
                        (if (errorCode.asKnown().isPresent) 1 else 0) +
                        (if (status.asKnown().isPresent) 1 else 0) +
                        (if (success.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ClusterResult &&
                        clusterId == other.clusterId &&
                        error == other.error &&
                        errorCode == other.errorCode &&
                        status == other.status &&
                        success == other.success &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(clusterId, error, errorCode, status, success, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ClusterResult{clusterId=$clusterId, error=$error, errorCode=$errorCode, status=$status, success=$success, additionalProperties=$additionalProperties}"
            }

            class Policy @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val EVERYWHERE = of("everywhere")

                    @JvmField val SINGLE_SITE = of("single_site")

                    @JvmStatic fun of(value: String) = Policy(JsonField.of(value))
                }

                /** An enum containing [Policy]'s known values. */
                enum class Known {
                    EVERYWHERE,
                    SINGLE_SITE,
                }

                /**
                 * An enum containing [Policy]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Policy] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    EVERYWHERE,
                    SINGLE_SITE,
                    /**
                     * An enum member indicating that [Policy] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        EVERYWHERE -> Value.EVERYWHERE
                        SINGLE_SITE -> Value.SINGLE_SITE
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        EVERYWHERE -> Known.EVERYWHERE
                        SINGLE_SITE -> Known.SINGLE_SITE
                        else -> throw TelnyxInvalidDataException("Unknown Policy: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Policy = apply {
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

                    return other is Policy && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Placement &&
                    clusterResults == other.clusterResults &&
                    clusters == other.clusters &&
                    excludedClusters == other.excludedClusters &&
                    observedAt == other.observedAt &&
                    partial == other.partial &&
                    policy == other.policy &&
                    uncheckedClusters == other.uncheckedClusters &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    clusterResults,
                    clusters,
                    excludedClusters,
                    observedAt,
                    partial,
                    policy,
                    uncheckedClusters,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Placement{clusterResults=$clusterResults, clusters=$clusters, excludedClusters=$excludedClusters, observedAt=$observedAt, partial=$partial, policy=$policy, uncheckedClusters=$uncheckedClusters, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                id == other.id &&
                createdAt == other.createdAt &&
                ownerFunctionId == other.ownerFunctionId &&
                placement == other.placement &&
                recordType == other.recordType &&
                status == other.status &&
                type == other.type &&
                updatedAt == other.updatedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                createdAt,
                ownerFunctionId,
                placement,
                recordType,
                status,
                type,
                updatedAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, createdAt=$createdAt, ownerFunctionId=$ownerFunctionId, placement=$placement, recordType=$recordType, status=$status, type=$type, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ComputeRetrieveResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ComputeRetrieveResponse{data=$data, additionalProperties=$additionalProperties}"
}
