// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.sessionanalysis.metadata

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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
import kotlin.jvm.optionals.getOrNull

class MetadataRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val meta: JsonField<Meta>,
    private val queryParameters: JsonField<QueryParameters>,
    private val recordTypes: JsonField<List<RecordType>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("meta") @ExcludeMissing meta: JsonField<Meta> = JsonMissing.of(),
        @JsonProperty("query_parameters")
        @ExcludeMissing
        queryParameters: JsonField<QueryParameters> = JsonMissing.of(),
        @JsonProperty("record_types")
        @ExcludeMissing
        recordTypes: JsonField<List<RecordType>> = JsonMissing.of(),
    ) : this(meta, queryParameters, recordTypes, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun meta(): Meta = meta.getRequired("meta")

    /**
     * Map of supported query parameter names to their definitions.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun queryParameters(): QueryParameters = queryParameters.getRequired("query_parameters")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun recordTypes(): List<RecordType> = recordTypes.getRequired("record_types")

    /**
     * Returns the raw JSON value of [meta].
     *
     * Unlike [meta], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("meta") @ExcludeMissing fun _meta(): JsonField<Meta> = meta

    /**
     * Returns the raw JSON value of [queryParameters].
     *
     * Unlike [queryParameters], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("query_parameters")
    @ExcludeMissing
    fun _queryParameters(): JsonField<QueryParameters> = queryParameters

    /**
     * Returns the raw JSON value of [recordTypes].
     *
     * Unlike [recordTypes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("record_types")
    @ExcludeMissing
    fun _recordTypes(): JsonField<List<RecordType>> = recordTypes

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
         * Returns a mutable builder for constructing an instance of [MetadataRetrieveResponse].
         *
         * The following fields are required:
         * ```java
         * .meta()
         * .queryParameters()
         * .recordTypes()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MetadataRetrieveResponse]. */
    class Builder internal constructor() {

        private var meta: JsonField<Meta>? = null
        private var queryParameters: JsonField<QueryParameters>? = null
        private var recordTypes: JsonField<MutableList<RecordType>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(metadataRetrieveResponse: MetadataRetrieveResponse) = apply {
            meta = metadataRetrieveResponse.meta
            queryParameters = metadataRetrieveResponse.queryParameters
            recordTypes = metadataRetrieveResponse.recordTypes.map { it.toMutableList() }
            additionalProperties = metadataRetrieveResponse.additionalProperties.toMutableMap()
        }

        fun meta(meta: Meta) = meta(JsonField.of(meta))

        /**
         * Sets [Builder.meta] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meta] with a well-typed [Meta] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun meta(meta: JsonField<Meta>) = apply { this.meta = meta }

        /** Map of supported query parameter names to their definitions. */
        fun queryParameters(queryParameters: QueryParameters) =
            queryParameters(JsonField.of(queryParameters))

        /**
         * Sets [Builder.queryParameters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.queryParameters] with a well-typed [QueryParameters]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun queryParameters(queryParameters: JsonField<QueryParameters>) = apply {
            this.queryParameters = queryParameters
        }

        fun recordTypes(recordTypes: List<RecordType>) = recordTypes(JsonField.of(recordTypes))

        /**
         * Sets [Builder.recordTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordTypes] with a well-typed `List<RecordType>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recordTypes(recordTypes: JsonField<List<RecordType>>) = apply {
            this.recordTypes = recordTypes.map { it.toMutableList() }
        }

        /**
         * Adds a single [RecordType] to [recordTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRecordType(recordType: RecordType) = apply {
            recordTypes =
                (recordTypes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("recordTypes", it).add(recordType)
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
         * Returns an immutable instance of [MetadataRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .meta()
         * .queryParameters()
         * .recordTypes()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MetadataRetrieveResponse =
            MetadataRetrieveResponse(
                checkRequired("meta", meta),
                checkRequired("queryParameters", queryParameters),
                checkRequired("recordTypes", recordTypes).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MetadataRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        meta().validate()
        queryParameters().validate()
        recordTypes().forEach { it.validate() }
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
        (meta.asKnown().getOrNull()?.validity() ?: 0) +
            (queryParameters.asKnown().getOrNull()?.validity() ?: 0) +
            (recordTypes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Meta
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val lastUpdated: JsonField<OffsetDateTime>,
        private val totalRecordTypes: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("last_updated")
            @ExcludeMissing
            lastUpdated: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("total_record_types")
            @ExcludeMissing
            totalRecordTypes: JsonField<Long> = JsonMissing.of(),
        ) : this(lastUpdated, totalRecordTypes, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun lastUpdated(): OffsetDateTime = lastUpdated.getRequired("last_updated")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun totalRecordTypes(): Long = totalRecordTypes.getRequired("total_record_types")

        /**
         * Returns the raw JSON value of [lastUpdated].
         *
         * Unlike [lastUpdated], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("last_updated")
        @ExcludeMissing
        fun _lastUpdated(): JsonField<OffsetDateTime> = lastUpdated

        /**
         * Returns the raw JSON value of [totalRecordTypes].
         *
         * Unlike [totalRecordTypes], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("total_record_types")
        @ExcludeMissing
        fun _totalRecordTypes(): JsonField<Long> = totalRecordTypes

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
             * Returns a mutable builder for constructing an instance of [Meta].
             *
             * The following fields are required:
             * ```java
             * .lastUpdated()
             * .totalRecordTypes()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Meta]. */
        class Builder internal constructor() {

            private var lastUpdated: JsonField<OffsetDateTime>? = null
            private var totalRecordTypes: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(meta: Meta) = apply {
                lastUpdated = meta.lastUpdated
                totalRecordTypes = meta.totalRecordTypes
                additionalProperties = meta.additionalProperties.toMutableMap()
            }

            fun lastUpdated(lastUpdated: OffsetDateTime) = lastUpdated(JsonField.of(lastUpdated))

            /**
             * Sets [Builder.lastUpdated] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastUpdated] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun lastUpdated(lastUpdated: JsonField<OffsetDateTime>) = apply {
                this.lastUpdated = lastUpdated
            }

            fun totalRecordTypes(totalRecordTypes: Long) =
                totalRecordTypes(JsonField.of(totalRecordTypes))

            /**
             * Sets [Builder.totalRecordTypes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalRecordTypes] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalRecordTypes(totalRecordTypes: JsonField<Long>) = apply {
                this.totalRecordTypes = totalRecordTypes
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
             * Returns an immutable instance of [Meta].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .lastUpdated()
             * .totalRecordTypes()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Meta =
                Meta(
                    checkRequired("lastUpdated", lastUpdated),
                    checkRequired("totalRecordTypes", totalRecordTypes),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Meta = apply {
            if (validated) {
                return@apply
            }

            lastUpdated()
            totalRecordTypes()
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
            (if (lastUpdated.asKnown().isPresent) 1 else 0) +
                (if (totalRecordTypes.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Meta &&
                lastUpdated == other.lastUpdated &&
                totalRecordTypes == other.totalRecordTypes &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(lastUpdated, totalRecordTypes, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Meta{lastUpdated=$lastUpdated, totalRecordTypes=$totalRecordTypes, additionalProperties=$additionalProperties}"
    }

    /** Map of supported query parameter names to their definitions. */
    class QueryParameters
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

            /** Returns a mutable builder for constructing an instance of [QueryParameters]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [QueryParameters]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(queryParameters: QueryParameters) = apply {
                additionalProperties = queryParameters.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [QueryParameters].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): QueryParameters = QueryParameters(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): QueryParameters = apply {
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

            return other is QueryParameters && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "QueryParameters{additionalProperties=$additionalProperties}"
    }

    class RecordType
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val aliases: JsonField<List<String>>,
        private val childRelationships: JsonField<List<ChildRelationshipInfo>>,
        private val description: JsonField<String>,
        private val event: JsonField<String>,
        private val parentRelationships: JsonField<List<ParentRelationshipInfo>>,
        private val product: JsonField<String>,
        private val recordType: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("aliases")
            @ExcludeMissing
            aliases: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("child_relationships")
            @ExcludeMissing
            childRelationships: JsonField<List<ChildRelationshipInfo>> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("event") @ExcludeMissing event: JsonField<String> = JsonMissing.of(),
            @JsonProperty("parent_relationships")
            @ExcludeMissing
            parentRelationships: JsonField<List<ParentRelationshipInfo>> = JsonMissing.of(),
            @JsonProperty("product") @ExcludeMissing product: JsonField<String> = JsonMissing.of(),
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<String> = JsonMissing.of(),
        ) : this(
            aliases,
            childRelationships,
            description,
            event,
            parentRelationships,
            product,
            recordType,
            mutableMapOf(),
        )

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun aliases(): List<String> = aliases.getRequired("aliases")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun childRelationships(): List<ChildRelationshipInfo> =
            childRelationships.getRequired("child_relationships")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun description(): String = description.getRequired("description")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun event(): String = event.getRequired("event")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun parentRelationships(): List<ParentRelationshipInfo> =
            parentRelationships.getRequired("parent_relationships")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun product(): String = product.getRequired("product")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun recordType(): String = recordType.getRequired("record_type")

        /**
         * Returns the raw JSON value of [aliases].
         *
         * Unlike [aliases], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("aliases") @ExcludeMissing fun _aliases(): JsonField<List<String>> = aliases

        /**
         * Returns the raw JSON value of [childRelationships].
         *
         * Unlike [childRelationships], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("child_relationships")
        @ExcludeMissing
        fun _childRelationships(): JsonField<List<ChildRelationshipInfo>> = childRelationships

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [event].
         *
         * Unlike [event], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("event") @ExcludeMissing fun _event(): JsonField<String> = event

        /**
         * Returns the raw JSON value of [parentRelationships].
         *
         * Unlike [parentRelationships], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("parent_relationships")
        @ExcludeMissing
        fun _parentRelationships(): JsonField<List<ParentRelationshipInfo>> = parentRelationships

        /**
         * Returns the raw JSON value of [product].
         *
         * Unlike [product], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("product") @ExcludeMissing fun _product(): JsonField<String> = product

        /**
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<String> = recordType

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
             * Returns a mutable builder for constructing an instance of [RecordType].
             *
             * The following fields are required:
             * ```java
             * .aliases()
             * .childRelationships()
             * .description()
             * .event()
             * .parentRelationships()
             * .product()
             * .recordType()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [RecordType]. */
        class Builder internal constructor() {

            private var aliases: JsonField<MutableList<String>>? = null
            private var childRelationships: JsonField<MutableList<ChildRelationshipInfo>>? = null
            private var description: JsonField<String>? = null
            private var event: JsonField<String>? = null
            private var parentRelationships: JsonField<MutableList<ParentRelationshipInfo>>? = null
            private var product: JsonField<String>? = null
            private var recordType: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(recordType: RecordType) = apply {
                aliases = recordType.aliases.map { it.toMutableList() }
                childRelationships = recordType.childRelationships.map { it.toMutableList() }
                description = recordType.description
                event = recordType.event
                parentRelationships = recordType.parentRelationships.map { it.toMutableList() }
                product = recordType.product
                this.recordType = recordType.recordType
                additionalProperties = recordType.additionalProperties.toMutableMap()
            }

            fun aliases(aliases: List<String>) = aliases(JsonField.of(aliases))

            /**
             * Sets [Builder.aliases] to an arbitrary JSON value.
             *
             * You should usually call [Builder.aliases] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun aliases(aliases: JsonField<List<String>>) = apply {
                this.aliases = aliases.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [aliases].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAlias(alias: String) = apply {
                aliases =
                    (aliases ?: JsonField.of(mutableListOf())).also {
                        checkKnown("aliases", it).add(alias)
                    }
            }

            fun childRelationships(childRelationships: List<ChildRelationshipInfo>) =
                childRelationships(JsonField.of(childRelationships))

            /**
             * Sets [Builder.childRelationships] to an arbitrary JSON value.
             *
             * You should usually call [Builder.childRelationships] with a well-typed
             * `List<ChildRelationshipInfo>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun childRelationships(childRelationships: JsonField<List<ChildRelationshipInfo>>) =
                apply {
                    this.childRelationships = childRelationships.map { it.toMutableList() }
                }

            /**
             * Adds a single [ChildRelationshipInfo] to [childRelationships].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addChildRelationship(childRelationship: ChildRelationshipInfo) = apply {
                childRelationships =
                    (childRelationships ?: JsonField.of(mutableListOf())).also {
                        checkKnown("childRelationships", it).add(childRelationship)
                    }
            }

            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun event(event: String) = event(JsonField.of(event))

            /**
             * Sets [Builder.event] to an arbitrary JSON value.
             *
             * You should usually call [Builder.event] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun event(event: JsonField<String>) = apply { this.event = event }

            fun parentRelationships(parentRelationships: List<ParentRelationshipInfo>) =
                parentRelationships(JsonField.of(parentRelationships))

            /**
             * Sets [Builder.parentRelationships] to an arbitrary JSON value.
             *
             * You should usually call [Builder.parentRelationships] with a well-typed
             * `List<ParentRelationshipInfo>` value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun parentRelationships(parentRelationships: JsonField<List<ParentRelationshipInfo>>) =
                apply {
                    this.parentRelationships = parentRelationships.map { it.toMutableList() }
                }

            /**
             * Adds a single [ParentRelationshipInfo] to [parentRelationships].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addParentRelationship(parentRelationship: ParentRelationshipInfo) = apply {
                parentRelationships =
                    (parentRelationships ?: JsonField.of(mutableListOf())).also {
                        checkKnown("parentRelationships", it).add(parentRelationship)
                    }
            }

            fun product(product: String) = product(JsonField.of(product))

            /**
             * Sets [Builder.product] to an arbitrary JSON value.
             *
             * You should usually call [Builder.product] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun product(product: JsonField<String>) = apply { this.product = product }

            fun recordType(recordType: String) = recordType(JsonField.of(recordType))

            /**
             * Sets [Builder.recordType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

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
             * Returns an immutable instance of [RecordType].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .aliases()
             * .childRelationships()
             * .description()
             * .event()
             * .parentRelationships()
             * .product()
             * .recordType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): RecordType =
                RecordType(
                    checkRequired("aliases", aliases).map { it.toImmutable() },
                    checkRequired("childRelationships", childRelationships).map {
                        it.toImmutable()
                    },
                    checkRequired("description", description),
                    checkRequired("event", event),
                    checkRequired("parentRelationships", parentRelationships).map {
                        it.toImmutable()
                    },
                    checkRequired("product", product),
                    checkRequired("recordType", recordType),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): RecordType = apply {
            if (validated) {
                return@apply
            }

            aliases()
            childRelationships().forEach { it.validate() }
            description()
            event()
            parentRelationships().forEach { it.validate() }
            product()
            recordType()
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
            (aliases.asKnown().getOrNull()?.size ?: 0) +
                (childRelationships.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (event.asKnown().isPresent) 1 else 0) +
                (parentRelationships.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (product.asKnown().isPresent) 1 else 0) +
                (if (recordType.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RecordType &&
                aliases == other.aliases &&
                childRelationships == other.childRelationships &&
                description == other.description &&
                event == other.event &&
                parentRelationships == other.parentRelationships &&
                product == other.product &&
                recordType == other.recordType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                aliases,
                childRelationships,
                description,
                event,
                parentRelationships,
                product,
                recordType,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RecordType{aliases=$aliases, childRelationships=$childRelationships, description=$description, event=$event, parentRelationships=$parentRelationships, product=$product, recordType=$recordType, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MetadataRetrieveResponse &&
            meta == other.meta &&
            queryParameters == other.queryParameters &&
            recordTypes == other.recordTypes &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(meta, queryParameters, recordTypes, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MetadataRetrieveResponse{meta=$meta, queryParameters=$queryParameters, recordTypes=$recordTypes, additionalProperties=$additionalProperties}"
}
