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
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class MetadataRetrieveRecordTypeResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val aliases: JsonField<List<String>>,
    private val childRelationships: JsonField<List<ChildRelationshipInfo>>,
    private val event: JsonField<String>,
    private val examples: JsonField<Examples>,
    private val meta: JsonField<Meta>,
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
        @JsonProperty("event") @ExcludeMissing event: JsonField<String> = JsonMissing.of(),
        @JsonProperty("examples") @ExcludeMissing examples: JsonField<Examples> = JsonMissing.of(),
        @JsonProperty("meta") @ExcludeMissing meta: JsonField<Meta> = JsonMissing.of(),
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
        event,
        examples,
        meta,
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
    fun event(): String = event.getRequired("event")

    /**
     * Example queries and responses for this record type.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun examples(): Examples = examples.getRequired("examples")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun meta(): Meta = meta.getRequired("meta")

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
     * Unlike [childRelationships], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("child_relationships")
    @ExcludeMissing
    fun _childRelationships(): JsonField<List<ChildRelationshipInfo>> = childRelationships

    /**
     * Returns the raw JSON value of [event].
     *
     * Unlike [event], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("event") @ExcludeMissing fun _event(): JsonField<String> = event

    /**
     * Returns the raw JSON value of [examples].
     *
     * Unlike [examples], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("examples") @ExcludeMissing fun _examples(): JsonField<Examples> = examples

    /**
     * Returns the raw JSON value of [meta].
     *
     * Unlike [meta], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("meta") @ExcludeMissing fun _meta(): JsonField<Meta> = meta

    /**
     * Returns the raw JSON value of [parentRelationships].
     *
     * Unlike [parentRelationships], this method doesn't throw if the JSON field has an unexpected
     * type.
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
    @JsonProperty("record_type") @ExcludeMissing fun _recordType(): JsonField<String> = recordType

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
         * [MetadataRetrieveRecordTypeResponse].
         *
         * The following fields are required:
         * ```java
         * .aliases()
         * .childRelationships()
         * .event()
         * .examples()
         * .meta()
         * .parentRelationships()
         * .product()
         * .recordType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MetadataRetrieveRecordTypeResponse]. */
    class Builder internal constructor() {

        private var aliases: JsonField<MutableList<String>>? = null
        private var childRelationships: JsonField<MutableList<ChildRelationshipInfo>>? = null
        private var event: JsonField<String>? = null
        private var examples: JsonField<Examples>? = null
        private var meta: JsonField<Meta>? = null
        private var parentRelationships: JsonField<MutableList<ParentRelationshipInfo>>? = null
        private var product: JsonField<String>? = null
        private var recordType: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(metadataRetrieveRecordTypeResponse: MetadataRetrieveRecordTypeResponse) =
            apply {
                aliases = metadataRetrieveRecordTypeResponse.aliases.map { it.toMutableList() }
                childRelationships =
                    metadataRetrieveRecordTypeResponse.childRelationships.map { it.toMutableList() }
                event = metadataRetrieveRecordTypeResponse.event
                examples = metadataRetrieveRecordTypeResponse.examples
                meta = metadataRetrieveRecordTypeResponse.meta
                parentRelationships =
                    metadataRetrieveRecordTypeResponse.parentRelationships.map {
                        it.toMutableList()
                    }
                product = metadataRetrieveRecordTypeResponse.product
                recordType = metadataRetrieveRecordTypeResponse.recordType
                additionalProperties =
                    metadataRetrieveRecordTypeResponse.additionalProperties.toMutableMap()
            }

        fun aliases(aliases: List<String>) = aliases(JsonField.of(aliases))

        /**
         * Sets [Builder.aliases] to an arbitrary JSON value.
         *
         * You should usually call [Builder.aliases] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
        fun childRelationships(childRelationships: JsonField<List<ChildRelationshipInfo>>) = apply {
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

        fun event(event: String) = event(JsonField.of(event))

        /**
         * Sets [Builder.event] to an arbitrary JSON value.
         *
         * You should usually call [Builder.event] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun event(event: JsonField<String>) = apply { this.event = event }

        /** Example queries and responses for this record type. */
        fun examples(examples: Examples) = examples(JsonField.of(examples))

        /**
         * Sets [Builder.examples] to an arbitrary JSON value.
         *
         * You should usually call [Builder.examples] with a well-typed [Examples] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun examples(examples: JsonField<Examples>) = apply { this.examples = examples }

        fun meta(meta: Meta) = meta(JsonField.of(meta))

        /**
         * Sets [Builder.meta] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meta] with a well-typed [Meta] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun meta(meta: JsonField<Meta>) = apply { this.meta = meta }

        fun parentRelationships(parentRelationships: List<ParentRelationshipInfo>) =
            parentRelationships(JsonField.of(parentRelationships))

        /**
         * Sets [Builder.parentRelationships] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parentRelationships] with a well-typed
         * `List<ParentRelationshipInfo>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
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
         * You should usually call [Builder.product] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun product(product: JsonField<String>) = apply { this.product = product }

        fun recordType(recordType: String) = recordType(JsonField.of(recordType))

        /**
         * Sets [Builder.recordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
         * Returns an immutable instance of [MetadataRetrieveRecordTypeResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .aliases()
         * .childRelationships()
         * .event()
         * .examples()
         * .meta()
         * .parentRelationships()
         * .product()
         * .recordType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MetadataRetrieveRecordTypeResponse =
            MetadataRetrieveRecordTypeResponse(
                checkRequired("aliases", aliases).map { it.toImmutable() },
                checkRequired("childRelationships", childRelationships).map { it.toImmutable() },
                checkRequired("event", event),
                checkRequired("examples", examples),
                checkRequired("meta", meta),
                checkRequired("parentRelationships", parentRelationships).map { it.toImmutable() },
                checkRequired("product", product),
                checkRequired("recordType", recordType),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MetadataRetrieveRecordTypeResponse = apply {
        if (validated) {
            return@apply
        }

        aliases()
        childRelationships().forEach { it.validate() }
        event()
        examples().validate()
        meta().validate()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (aliases.asKnown().getOrNull()?.size ?: 0) +
            (childRelationships.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (event.asKnown().isPresent) 1 else 0) +
            (examples.asKnown().getOrNull()?.validity() ?: 0) +
            (meta.asKnown().getOrNull()?.validity() ?: 0) +
            (parentRelationships.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (product.asKnown().isPresent) 1 else 0) +
            (if (recordType.asKnown().isPresent) 1 else 0)

    /** Example queries and responses for this record type. */
    class Examples
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

            /** Returns a mutable builder for constructing an instance of [Examples]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Examples]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(examples: Examples) = apply {
                additionalProperties = examples.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Examples].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Examples = Examples(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Examples = apply {
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

            return other is Examples && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Examples{additionalProperties=$additionalProperties}"
    }

    class Meta
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val maxRecommendedDepth: JsonField<Long>,
        private val totalChildren: JsonField<Long>,
        private val totalParents: JsonField<Long>,
        private val totalSiblings: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("max_recommended_depth")
            @ExcludeMissing
            maxRecommendedDepth: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("total_children")
            @ExcludeMissing
            totalChildren: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("total_parents")
            @ExcludeMissing
            totalParents: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("total_siblings")
            @ExcludeMissing
            totalSiblings: JsonField<Long> = JsonMissing.of(),
        ) : this(maxRecommendedDepth, totalChildren, totalParents, totalSiblings, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun maxRecommendedDepth(): Long = maxRecommendedDepth.getRequired("max_recommended_depth")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun totalChildren(): Long = totalChildren.getRequired("total_children")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun totalParents(): Long = totalParents.getRequired("total_parents")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun totalSiblings(): Long = totalSiblings.getRequired("total_siblings")

        /**
         * Returns the raw JSON value of [maxRecommendedDepth].
         *
         * Unlike [maxRecommendedDepth], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("max_recommended_depth")
        @ExcludeMissing
        fun _maxRecommendedDepth(): JsonField<Long> = maxRecommendedDepth

        /**
         * Returns the raw JSON value of [totalChildren].
         *
         * Unlike [totalChildren], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("total_children")
        @ExcludeMissing
        fun _totalChildren(): JsonField<Long> = totalChildren

        /**
         * Returns the raw JSON value of [totalParents].
         *
         * Unlike [totalParents], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("total_parents")
        @ExcludeMissing
        fun _totalParents(): JsonField<Long> = totalParents

        /**
         * Returns the raw JSON value of [totalSiblings].
         *
         * Unlike [totalSiblings], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("total_siblings")
        @ExcludeMissing
        fun _totalSiblings(): JsonField<Long> = totalSiblings

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
             * .maxRecommendedDepth()
             * .totalChildren()
             * .totalParents()
             * .totalSiblings()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Meta]. */
        class Builder internal constructor() {

            private var maxRecommendedDepth: JsonField<Long>? = null
            private var totalChildren: JsonField<Long>? = null
            private var totalParents: JsonField<Long>? = null
            private var totalSiblings: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(meta: Meta) = apply {
                maxRecommendedDepth = meta.maxRecommendedDepth
                totalChildren = meta.totalChildren
                totalParents = meta.totalParents
                totalSiblings = meta.totalSiblings
                additionalProperties = meta.additionalProperties.toMutableMap()
            }

            fun maxRecommendedDepth(maxRecommendedDepth: Long) =
                maxRecommendedDepth(JsonField.of(maxRecommendedDepth))

            /**
             * Sets [Builder.maxRecommendedDepth] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxRecommendedDepth] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxRecommendedDepth(maxRecommendedDepth: JsonField<Long>) = apply {
                this.maxRecommendedDepth = maxRecommendedDepth
            }

            fun totalChildren(totalChildren: Long) = totalChildren(JsonField.of(totalChildren))

            /**
             * Sets [Builder.totalChildren] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalChildren] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalChildren(totalChildren: JsonField<Long>) = apply {
                this.totalChildren = totalChildren
            }

            fun totalParents(totalParents: Long) = totalParents(JsonField.of(totalParents))

            /**
             * Sets [Builder.totalParents] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalParents] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalParents(totalParents: JsonField<Long>) = apply {
                this.totalParents = totalParents
            }

            fun totalSiblings(totalSiblings: Long) = totalSiblings(JsonField.of(totalSiblings))

            /**
             * Sets [Builder.totalSiblings] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalSiblings] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalSiblings(totalSiblings: JsonField<Long>) = apply {
                this.totalSiblings = totalSiblings
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
             * .maxRecommendedDepth()
             * .totalChildren()
             * .totalParents()
             * .totalSiblings()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Meta =
                Meta(
                    checkRequired("maxRecommendedDepth", maxRecommendedDepth),
                    checkRequired("totalChildren", totalChildren),
                    checkRequired("totalParents", totalParents),
                    checkRequired("totalSiblings", totalSiblings),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Meta = apply {
            if (validated) {
                return@apply
            }

            maxRecommendedDepth()
            totalChildren()
            totalParents()
            totalSiblings()
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
            (if (maxRecommendedDepth.asKnown().isPresent) 1 else 0) +
                (if (totalChildren.asKnown().isPresent) 1 else 0) +
                (if (totalParents.asKnown().isPresent) 1 else 0) +
                (if (totalSiblings.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Meta &&
                maxRecommendedDepth == other.maxRecommendedDepth &&
                totalChildren == other.totalChildren &&
                totalParents == other.totalParents &&
                totalSiblings == other.totalSiblings &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                maxRecommendedDepth,
                totalChildren,
                totalParents,
                totalSiblings,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Meta{maxRecommendedDepth=$maxRecommendedDepth, totalChildren=$totalChildren, totalParents=$totalParents, totalSiblings=$totalSiblings, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MetadataRetrieveRecordTypeResponse &&
            aliases == other.aliases &&
            childRelationships == other.childRelationships &&
            event == other.event &&
            examples == other.examples &&
            meta == other.meta &&
            parentRelationships == other.parentRelationships &&
            product == other.product &&
            recordType == other.recordType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            aliases,
            childRelationships,
            event,
            examples,
            meta,
            parentRelationships,
            product,
            recordType,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MetadataRetrieveRecordTypeResponse{aliases=$aliases, childRelationships=$childRelationships, event=$event, examples=$examples, meta=$meta, parentRelationships=$parentRelationships, product=$product, recordType=$recordType, additionalProperties=$additionalProperties}"
}
