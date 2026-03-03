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
    private val childRelationships: JsonField<List<ChildRelationship>>,
    private val event: JsonField<String>,
    private val examples: JsonField<Examples>,
    private val meta: JsonField<Meta>,
    private val parentRelationships: JsonField<List<ParentRelationship>>,
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
        childRelationships: JsonField<List<ChildRelationship>> = JsonMissing.of(),
        @JsonProperty("event") @ExcludeMissing event: JsonField<String> = JsonMissing.of(),
        @JsonProperty("examples") @ExcludeMissing examples: JsonField<Examples> = JsonMissing.of(),
        @JsonProperty("meta") @ExcludeMissing meta: JsonField<Meta> = JsonMissing.of(),
        @JsonProperty("parent_relationships")
        @ExcludeMissing
        parentRelationships: JsonField<List<ParentRelationship>> = JsonMissing.of(),
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
    fun childRelationships(): List<ChildRelationship> =
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
    fun parentRelationships(): List<ParentRelationship> =
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
    fun _childRelationships(): JsonField<List<ChildRelationship>> = childRelationships

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
    fun _parentRelationships(): JsonField<List<ParentRelationship>> = parentRelationships

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
        private var childRelationships: JsonField<MutableList<ChildRelationship>>? = null
        private var event: JsonField<String>? = null
        private var examples: JsonField<Examples>? = null
        private var meta: JsonField<Meta>? = null
        private var parentRelationships: JsonField<MutableList<ParentRelationship>>? = null
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

        fun childRelationships(childRelationships: List<ChildRelationship>) =
            childRelationships(JsonField.of(childRelationships))

        /**
         * Sets [Builder.childRelationships] to an arbitrary JSON value.
         *
         * You should usually call [Builder.childRelationships] with a well-typed
         * `List<ChildRelationship>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun childRelationships(childRelationships: JsonField<List<ChildRelationship>>) = apply {
            this.childRelationships = childRelationships.map { it.toMutableList() }
        }

        /**
         * Adds a single [ChildRelationship] to [childRelationships].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addChildRelationship(childRelationship: ChildRelationship) = apply {
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

        fun parentRelationships(parentRelationships: List<ParentRelationship>) =
            parentRelationships(JsonField.of(parentRelationships))

        /**
         * Sets [Builder.parentRelationships] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parentRelationships] with a well-typed
         * `List<ParentRelationship>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun parentRelationships(parentRelationships: JsonField<List<ParentRelationship>>) = apply {
            this.parentRelationships = parentRelationships.map { it.toMutableList() }
        }

        /**
         * Adds a single [ParentRelationship] to [parentRelationships].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addParentRelationship(parentRelationship: ParentRelationship) = apply {
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

    class ChildRelationship
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val childEvent: JsonField<String>,
        private val childProduct: JsonField<String>,
        private val childRecordType: JsonField<String>,
        private val costRollup: JsonField<Boolean>,
        private val description: JsonField<String>,
        private val relationshipType: JsonField<String>,
        private val traversalEnabled: JsonField<Boolean>,
        private val via: JsonField<Via>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("child_event")
            @ExcludeMissing
            childEvent: JsonField<String> = JsonMissing.of(),
            @JsonProperty("child_product")
            @ExcludeMissing
            childProduct: JsonField<String> = JsonMissing.of(),
            @JsonProperty("child_record_type")
            @ExcludeMissing
            childRecordType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("cost_rollup")
            @ExcludeMissing
            costRollup: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("relationship_type")
            @ExcludeMissing
            relationshipType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("traversal_enabled")
            @ExcludeMissing
            traversalEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("via") @ExcludeMissing via: JsonField<Via> = JsonMissing.of(),
        ) : this(
            childEvent,
            childProduct,
            childRecordType,
            costRollup,
            description,
            relationshipType,
            traversalEnabled,
            via,
            mutableMapOf(),
        )

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun childEvent(): String = childEvent.getRequired("child_event")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun childProduct(): String = childProduct.getRequired("child_product")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun childRecordType(): String = childRecordType.getRequired("child_record_type")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun costRollup(): Boolean = costRollup.getRequired("cost_rollup")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun description(): String = description.getRequired("description")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun relationshipType(): String = relationshipType.getRequired("relationship_type")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun traversalEnabled(): Boolean = traversalEnabled.getRequired("traversal_enabled")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun via(): Via = via.getRequired("via")

        /**
         * Returns the raw JSON value of [childEvent].
         *
         * Unlike [childEvent], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("child_event")
        @ExcludeMissing
        fun _childEvent(): JsonField<String> = childEvent

        /**
         * Returns the raw JSON value of [childProduct].
         *
         * Unlike [childProduct], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("child_product")
        @ExcludeMissing
        fun _childProduct(): JsonField<String> = childProduct

        /**
         * Returns the raw JSON value of [childRecordType].
         *
         * Unlike [childRecordType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("child_record_type")
        @ExcludeMissing
        fun _childRecordType(): JsonField<String> = childRecordType

        /**
         * Returns the raw JSON value of [costRollup].
         *
         * Unlike [costRollup], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cost_rollup")
        @ExcludeMissing
        fun _costRollup(): JsonField<Boolean> = costRollup

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [relationshipType].
         *
         * Unlike [relationshipType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("relationship_type")
        @ExcludeMissing
        fun _relationshipType(): JsonField<String> = relationshipType

        /**
         * Returns the raw JSON value of [traversalEnabled].
         *
         * Unlike [traversalEnabled], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("traversal_enabled")
        @ExcludeMissing
        fun _traversalEnabled(): JsonField<Boolean> = traversalEnabled

        /**
         * Returns the raw JSON value of [via].
         *
         * Unlike [via], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("via") @ExcludeMissing fun _via(): JsonField<Via> = via

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
             * Returns a mutable builder for constructing an instance of [ChildRelationship].
             *
             * The following fields are required:
             * ```java
             * .childEvent()
             * .childProduct()
             * .childRecordType()
             * .costRollup()
             * .description()
             * .relationshipType()
             * .traversalEnabled()
             * .via()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ChildRelationship]. */
        class Builder internal constructor() {

            private var childEvent: JsonField<String>? = null
            private var childProduct: JsonField<String>? = null
            private var childRecordType: JsonField<String>? = null
            private var costRollup: JsonField<Boolean>? = null
            private var description: JsonField<String>? = null
            private var relationshipType: JsonField<String>? = null
            private var traversalEnabled: JsonField<Boolean>? = null
            private var via: JsonField<Via>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(childRelationship: ChildRelationship) = apply {
                childEvent = childRelationship.childEvent
                childProduct = childRelationship.childProduct
                childRecordType = childRelationship.childRecordType
                costRollup = childRelationship.costRollup
                description = childRelationship.description
                relationshipType = childRelationship.relationshipType
                traversalEnabled = childRelationship.traversalEnabled
                via = childRelationship.via
                additionalProperties = childRelationship.additionalProperties.toMutableMap()
            }

            fun childEvent(childEvent: String) = childEvent(JsonField.of(childEvent))

            /**
             * Sets [Builder.childEvent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.childEvent] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun childEvent(childEvent: JsonField<String>) = apply { this.childEvent = childEvent }

            fun childProduct(childProduct: String) = childProduct(JsonField.of(childProduct))

            /**
             * Sets [Builder.childProduct] to an arbitrary JSON value.
             *
             * You should usually call [Builder.childProduct] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun childProduct(childProduct: JsonField<String>) = apply {
                this.childProduct = childProduct
            }

            fun childRecordType(childRecordType: String) =
                childRecordType(JsonField.of(childRecordType))

            /**
             * Sets [Builder.childRecordType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.childRecordType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun childRecordType(childRecordType: JsonField<String>) = apply {
                this.childRecordType = childRecordType
            }

            fun costRollup(costRollup: Boolean) = costRollup(JsonField.of(costRollup))

            /**
             * Sets [Builder.costRollup] to an arbitrary JSON value.
             *
             * You should usually call [Builder.costRollup] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun costRollup(costRollup: JsonField<Boolean>) = apply { this.costRollup = costRollup }

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

            fun relationshipType(relationshipType: String) =
                relationshipType(JsonField.of(relationshipType))

            /**
             * Sets [Builder.relationshipType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.relationshipType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun relationshipType(relationshipType: JsonField<String>) = apply {
                this.relationshipType = relationshipType
            }

            fun traversalEnabled(traversalEnabled: Boolean) =
                traversalEnabled(JsonField.of(traversalEnabled))

            /**
             * Sets [Builder.traversalEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.traversalEnabled] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun traversalEnabled(traversalEnabled: JsonField<Boolean>) = apply {
                this.traversalEnabled = traversalEnabled
            }

            fun via(via: Via) = via(JsonField.of(via))

            /**
             * Sets [Builder.via] to an arbitrary JSON value.
             *
             * You should usually call [Builder.via] with a well-typed [Via] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun via(via: JsonField<Via>) = apply { this.via = via }

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
             * Returns an immutable instance of [ChildRelationship].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .childEvent()
             * .childProduct()
             * .childRecordType()
             * .costRollup()
             * .description()
             * .relationshipType()
             * .traversalEnabled()
             * .via()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ChildRelationship =
                ChildRelationship(
                    checkRequired("childEvent", childEvent),
                    checkRequired("childProduct", childProduct),
                    checkRequired("childRecordType", childRecordType),
                    checkRequired("costRollup", costRollup),
                    checkRequired("description", description),
                    checkRequired("relationshipType", relationshipType),
                    checkRequired("traversalEnabled", traversalEnabled),
                    checkRequired("via", via),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ChildRelationship = apply {
            if (validated) {
                return@apply
            }

            childEvent()
            childProduct()
            childRecordType()
            costRollup()
            description()
            relationshipType()
            traversalEnabled()
            via().validate()
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
            (if (childEvent.asKnown().isPresent) 1 else 0) +
                (if (childProduct.asKnown().isPresent) 1 else 0) +
                (if (childRecordType.asKnown().isPresent) 1 else 0) +
                (if (costRollup.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (relationshipType.asKnown().isPresent) 1 else 0) +
                (if (traversalEnabled.asKnown().isPresent) 1 else 0) +
                (via.asKnown().getOrNull()?.validity() ?: 0)

        class Via
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val localField: JsonField<String>,
            private val parentField: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("local_field")
                @ExcludeMissing
                localField: JsonField<String> = JsonMissing.of(),
                @JsonProperty("parent_field")
                @ExcludeMissing
                parentField: JsonField<String> = JsonMissing.of(),
            ) : this(localField, parentField, mutableMapOf())

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun localField(): String = localField.getRequired("local_field")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun parentField(): String = parentField.getRequired("parent_field")

            /**
             * Returns the raw JSON value of [localField].
             *
             * Unlike [localField], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("local_field")
            @ExcludeMissing
            fun _localField(): JsonField<String> = localField

            /**
             * Returns the raw JSON value of [parentField].
             *
             * Unlike [parentField], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("parent_field")
            @ExcludeMissing
            fun _parentField(): JsonField<String> = parentField

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
                 * Returns a mutable builder for constructing an instance of [Via].
                 *
                 * The following fields are required:
                 * ```java
                 * .localField()
                 * .parentField()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Via]. */
            class Builder internal constructor() {

                private var localField: JsonField<String>? = null
                private var parentField: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(via: Via) = apply {
                    localField = via.localField
                    parentField = via.parentField
                    additionalProperties = via.additionalProperties.toMutableMap()
                }

                fun localField(localField: String) = localField(JsonField.of(localField))

                /**
                 * Sets [Builder.localField] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.localField] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun localField(localField: JsonField<String>) = apply {
                    this.localField = localField
                }

                fun parentField(parentField: String) = parentField(JsonField.of(parentField))

                /**
                 * Sets [Builder.parentField] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.parentField] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun parentField(parentField: JsonField<String>) = apply {
                    this.parentField = parentField
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
                 * Returns an immutable instance of [Via].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .localField()
                 * .parentField()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Via =
                    Via(
                        checkRequired("localField", localField),
                        checkRequired("parentField", parentField),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Via = apply {
                if (validated) {
                    return@apply
                }

                localField()
                parentField()
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
                (if (localField.asKnown().isPresent) 1 else 0) +
                    (if (parentField.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Via &&
                    localField == other.localField &&
                    parentField == other.parentField &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(localField, parentField, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Via{localField=$localField, parentField=$parentField, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ChildRelationship &&
                childEvent == other.childEvent &&
                childProduct == other.childProduct &&
                childRecordType == other.childRecordType &&
                costRollup == other.costRollup &&
                description == other.description &&
                relationshipType == other.relationshipType &&
                traversalEnabled == other.traversalEnabled &&
                via == other.via &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                childEvent,
                childProduct,
                childRecordType,
                costRollup,
                description,
                relationshipType,
                traversalEnabled,
                via,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ChildRelationship{childEvent=$childEvent, childProduct=$childProduct, childRecordType=$childRecordType, costRollup=$costRollup, description=$description, relationshipType=$relationshipType, traversalEnabled=$traversalEnabled, via=$via, additionalProperties=$additionalProperties}"
    }

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

    class ParentRelationship
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val costRollup: JsonField<Boolean>,
        private val description: JsonField<String>,
        private val parentEvent: JsonField<String>,
        private val parentProduct: JsonField<String>,
        private val parentRecordType: JsonField<String>,
        private val relationshipType: JsonField<String>,
        private val traversalEnabled: JsonField<Boolean>,
        private val via: JsonField<Via>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("cost_rollup")
            @ExcludeMissing
            costRollup: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("parent_event")
            @ExcludeMissing
            parentEvent: JsonField<String> = JsonMissing.of(),
            @JsonProperty("parent_product")
            @ExcludeMissing
            parentProduct: JsonField<String> = JsonMissing.of(),
            @JsonProperty("parent_record_type")
            @ExcludeMissing
            parentRecordType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("relationship_type")
            @ExcludeMissing
            relationshipType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("traversal_enabled")
            @ExcludeMissing
            traversalEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("via") @ExcludeMissing via: JsonField<Via> = JsonMissing.of(),
        ) : this(
            costRollup,
            description,
            parentEvent,
            parentProduct,
            parentRecordType,
            relationshipType,
            traversalEnabled,
            via,
            mutableMapOf(),
        )

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun costRollup(): Boolean = costRollup.getRequired("cost_rollup")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun description(): String = description.getRequired("description")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun parentEvent(): String = parentEvent.getRequired("parent_event")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun parentProduct(): String = parentProduct.getRequired("parent_product")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun parentRecordType(): String = parentRecordType.getRequired("parent_record_type")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun relationshipType(): String = relationshipType.getRequired("relationship_type")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun traversalEnabled(): Boolean = traversalEnabled.getRequired("traversal_enabled")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun via(): Via = via.getRequired("via")

        /**
         * Returns the raw JSON value of [costRollup].
         *
         * Unlike [costRollup], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cost_rollup")
        @ExcludeMissing
        fun _costRollup(): JsonField<Boolean> = costRollup

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [parentEvent].
         *
         * Unlike [parentEvent], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("parent_event")
        @ExcludeMissing
        fun _parentEvent(): JsonField<String> = parentEvent

        /**
         * Returns the raw JSON value of [parentProduct].
         *
         * Unlike [parentProduct], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("parent_product")
        @ExcludeMissing
        fun _parentProduct(): JsonField<String> = parentProduct

        /**
         * Returns the raw JSON value of [parentRecordType].
         *
         * Unlike [parentRecordType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("parent_record_type")
        @ExcludeMissing
        fun _parentRecordType(): JsonField<String> = parentRecordType

        /**
         * Returns the raw JSON value of [relationshipType].
         *
         * Unlike [relationshipType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("relationship_type")
        @ExcludeMissing
        fun _relationshipType(): JsonField<String> = relationshipType

        /**
         * Returns the raw JSON value of [traversalEnabled].
         *
         * Unlike [traversalEnabled], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("traversal_enabled")
        @ExcludeMissing
        fun _traversalEnabled(): JsonField<Boolean> = traversalEnabled

        /**
         * Returns the raw JSON value of [via].
         *
         * Unlike [via], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("via") @ExcludeMissing fun _via(): JsonField<Via> = via

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
             * Returns a mutable builder for constructing an instance of [ParentRelationship].
             *
             * The following fields are required:
             * ```java
             * .costRollup()
             * .description()
             * .parentEvent()
             * .parentProduct()
             * .parentRecordType()
             * .relationshipType()
             * .traversalEnabled()
             * .via()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ParentRelationship]. */
        class Builder internal constructor() {

            private var costRollup: JsonField<Boolean>? = null
            private var description: JsonField<String>? = null
            private var parentEvent: JsonField<String>? = null
            private var parentProduct: JsonField<String>? = null
            private var parentRecordType: JsonField<String>? = null
            private var relationshipType: JsonField<String>? = null
            private var traversalEnabled: JsonField<Boolean>? = null
            private var via: JsonField<Via>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(parentRelationship: ParentRelationship) = apply {
                costRollup = parentRelationship.costRollup
                description = parentRelationship.description
                parentEvent = parentRelationship.parentEvent
                parentProduct = parentRelationship.parentProduct
                parentRecordType = parentRelationship.parentRecordType
                relationshipType = parentRelationship.relationshipType
                traversalEnabled = parentRelationship.traversalEnabled
                via = parentRelationship.via
                additionalProperties = parentRelationship.additionalProperties.toMutableMap()
            }

            fun costRollup(costRollup: Boolean) = costRollup(JsonField.of(costRollup))

            /**
             * Sets [Builder.costRollup] to an arbitrary JSON value.
             *
             * You should usually call [Builder.costRollup] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun costRollup(costRollup: JsonField<Boolean>) = apply { this.costRollup = costRollup }

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

            fun parentEvent(parentEvent: String) = parentEvent(JsonField.of(parentEvent))

            /**
             * Sets [Builder.parentEvent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.parentEvent] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun parentEvent(parentEvent: JsonField<String>) = apply {
                this.parentEvent = parentEvent
            }

            fun parentProduct(parentProduct: String) = parentProduct(JsonField.of(parentProduct))

            /**
             * Sets [Builder.parentProduct] to an arbitrary JSON value.
             *
             * You should usually call [Builder.parentProduct] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun parentProduct(parentProduct: JsonField<String>) = apply {
                this.parentProduct = parentProduct
            }

            fun parentRecordType(parentRecordType: String) =
                parentRecordType(JsonField.of(parentRecordType))

            /**
             * Sets [Builder.parentRecordType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.parentRecordType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun parentRecordType(parentRecordType: JsonField<String>) = apply {
                this.parentRecordType = parentRecordType
            }

            fun relationshipType(relationshipType: String) =
                relationshipType(JsonField.of(relationshipType))

            /**
             * Sets [Builder.relationshipType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.relationshipType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun relationshipType(relationshipType: JsonField<String>) = apply {
                this.relationshipType = relationshipType
            }

            fun traversalEnabled(traversalEnabled: Boolean) =
                traversalEnabled(JsonField.of(traversalEnabled))

            /**
             * Sets [Builder.traversalEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.traversalEnabled] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun traversalEnabled(traversalEnabled: JsonField<Boolean>) = apply {
                this.traversalEnabled = traversalEnabled
            }

            fun via(via: Via) = via(JsonField.of(via))

            /**
             * Sets [Builder.via] to an arbitrary JSON value.
             *
             * You should usually call [Builder.via] with a well-typed [Via] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun via(via: JsonField<Via>) = apply { this.via = via }

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
             * Returns an immutable instance of [ParentRelationship].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .costRollup()
             * .description()
             * .parentEvent()
             * .parentProduct()
             * .parentRecordType()
             * .relationshipType()
             * .traversalEnabled()
             * .via()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ParentRelationship =
                ParentRelationship(
                    checkRequired("costRollup", costRollup),
                    checkRequired("description", description),
                    checkRequired("parentEvent", parentEvent),
                    checkRequired("parentProduct", parentProduct),
                    checkRequired("parentRecordType", parentRecordType),
                    checkRequired("relationshipType", relationshipType),
                    checkRequired("traversalEnabled", traversalEnabled),
                    checkRequired("via", via),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ParentRelationship = apply {
            if (validated) {
                return@apply
            }

            costRollup()
            description()
            parentEvent()
            parentProduct()
            parentRecordType()
            relationshipType()
            traversalEnabled()
            via().validate()
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
            (if (costRollup.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (parentEvent.asKnown().isPresent) 1 else 0) +
                (if (parentProduct.asKnown().isPresent) 1 else 0) +
                (if (parentRecordType.asKnown().isPresent) 1 else 0) +
                (if (relationshipType.asKnown().isPresent) 1 else 0) +
                (if (traversalEnabled.asKnown().isPresent) 1 else 0) +
                (via.asKnown().getOrNull()?.validity() ?: 0)

        class Via
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val localField: JsonField<String>,
            private val parentField: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("local_field")
                @ExcludeMissing
                localField: JsonField<String> = JsonMissing.of(),
                @JsonProperty("parent_field")
                @ExcludeMissing
                parentField: JsonField<String> = JsonMissing.of(),
            ) : this(localField, parentField, mutableMapOf())

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun localField(): String = localField.getRequired("local_field")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun parentField(): String = parentField.getRequired("parent_field")

            /**
             * Returns the raw JSON value of [localField].
             *
             * Unlike [localField], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("local_field")
            @ExcludeMissing
            fun _localField(): JsonField<String> = localField

            /**
             * Returns the raw JSON value of [parentField].
             *
             * Unlike [parentField], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("parent_field")
            @ExcludeMissing
            fun _parentField(): JsonField<String> = parentField

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
                 * Returns a mutable builder for constructing an instance of [Via].
                 *
                 * The following fields are required:
                 * ```java
                 * .localField()
                 * .parentField()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Via]. */
            class Builder internal constructor() {

                private var localField: JsonField<String>? = null
                private var parentField: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(via: Via) = apply {
                    localField = via.localField
                    parentField = via.parentField
                    additionalProperties = via.additionalProperties.toMutableMap()
                }

                fun localField(localField: String) = localField(JsonField.of(localField))

                /**
                 * Sets [Builder.localField] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.localField] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun localField(localField: JsonField<String>) = apply {
                    this.localField = localField
                }

                fun parentField(parentField: String) = parentField(JsonField.of(parentField))

                /**
                 * Sets [Builder.parentField] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.parentField] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun parentField(parentField: JsonField<String>) = apply {
                    this.parentField = parentField
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
                 * Returns an immutable instance of [Via].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .localField()
                 * .parentField()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Via =
                    Via(
                        checkRequired("localField", localField),
                        checkRequired("parentField", parentField),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Via = apply {
                if (validated) {
                    return@apply
                }

                localField()
                parentField()
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
                (if (localField.asKnown().isPresent) 1 else 0) +
                    (if (parentField.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Via &&
                    localField == other.localField &&
                    parentField == other.parentField &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(localField, parentField, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Via{localField=$localField, parentField=$parentField, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ParentRelationship &&
                costRollup == other.costRollup &&
                description == other.description &&
                parentEvent == other.parentEvent &&
                parentProduct == other.parentProduct &&
                parentRecordType == other.parentRecordType &&
                relationshipType == other.relationshipType &&
                traversalEnabled == other.traversalEnabled &&
                via == other.via &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                costRollup,
                description,
                parentEvent,
                parentProduct,
                parentRecordType,
                relationshipType,
                traversalEnabled,
                via,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ParentRelationship{costRollup=$costRollup, description=$description, parentEvent=$parentEvent, parentProduct=$parentProduct, parentRecordType=$parentRecordType, relationshipType=$relationshipType, traversalEnabled=$traversalEnabled, via=$via, additionalProperties=$additionalProperties}"
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
