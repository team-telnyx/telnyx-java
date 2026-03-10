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
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class ChildRelationshipInfo
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val childEvent: JsonField<String>,
    private val childProduct: JsonField<String>,
    private val childRecordType: JsonField<String>,
    private val costRollup: JsonField<Boolean>,
    private val description: JsonField<String>,
    private val relationshipType: JsonField<String>,
    private val traversalEnabled: JsonField<Boolean>,
    private val via: JsonField<MetadataFieldMapping>,
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
        @JsonProperty("via") @ExcludeMissing via: JsonField<MetadataFieldMapping> = JsonMissing.of(),
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
    fun via(): MetadataFieldMapping = via.getRequired("via")

    /**
     * Returns the raw JSON value of [childEvent].
     *
     * Unlike [childEvent], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("child_event") @ExcludeMissing fun _childEvent(): JsonField<String> = childEvent

    /**
     * Returns the raw JSON value of [childProduct].
     *
     * Unlike [childProduct], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("child_product")
    @ExcludeMissing
    fun _childProduct(): JsonField<String> = childProduct

    /**
     * Returns the raw JSON value of [childRecordType].
     *
     * Unlike [childRecordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("child_record_type")
    @ExcludeMissing
    fun _childRecordType(): JsonField<String> = childRecordType

    /**
     * Returns the raw JSON value of [costRollup].
     *
     * Unlike [costRollup], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cost_rollup") @ExcludeMissing fun _costRollup(): JsonField<Boolean> = costRollup

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

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
    @JsonProperty("via") @ExcludeMissing fun _via(): JsonField<MetadataFieldMapping> = via

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
         * Returns a mutable builder for constructing an instance of [ChildRelationshipInfo].
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

    /** A builder for [ChildRelationshipInfo]. */
    class Builder internal constructor() {

        private var childEvent: JsonField<String>? = null
        private var childProduct: JsonField<String>? = null
        private var childRecordType: JsonField<String>? = null
        private var costRollup: JsonField<Boolean>? = null
        private var description: JsonField<String>? = null
        private var relationshipType: JsonField<String>? = null
        private var traversalEnabled: JsonField<Boolean>? = null
        private var via: JsonField<MetadataFieldMapping>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(childRelationshipInfo: ChildRelationshipInfo) = apply {
            childEvent = childRelationshipInfo.childEvent
            childProduct = childRelationshipInfo.childProduct
            childRecordType = childRelationshipInfo.childRecordType
            costRollup = childRelationshipInfo.costRollup
            description = childRelationshipInfo.description
            relationshipType = childRelationshipInfo.relationshipType
            traversalEnabled = childRelationshipInfo.traversalEnabled
            via = childRelationshipInfo.via
            additionalProperties = childRelationshipInfo.additionalProperties.toMutableMap()
        }

        fun childEvent(childEvent: String) = childEvent(JsonField.of(childEvent))

        /**
         * Sets [Builder.childEvent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.childEvent] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun childEvent(childEvent: JsonField<String>) = apply { this.childEvent = childEvent }

        fun childProduct(childProduct: String) = childProduct(JsonField.of(childProduct))

        /**
         * Sets [Builder.childProduct] to an arbitrary JSON value.
         *
         * You should usually call [Builder.childProduct] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
         * You should usually call [Builder.costRollup] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun costRollup(costRollup: JsonField<Boolean>) = apply { this.costRollup = costRollup }

        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

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

        fun via(via: MetadataFieldMapping) = via(JsonField.of(via))

        /**
         * Sets [Builder.via] to an arbitrary JSON value.
         *
         * You should usually call [Builder.via] with a well-typed [MetadataFieldMapping] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun via(via: JsonField<MetadataFieldMapping>) = apply { this.via = via }

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
         * Returns an immutable instance of [ChildRelationshipInfo].
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
        fun build(): ChildRelationshipInfo =
            ChildRelationshipInfo(
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

    fun validate(): ChildRelationshipInfo = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ChildRelationshipInfo &&
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
        "ChildRelationshipInfo{childEvent=$childEvent, childProduct=$childProduct, childRecordType=$childRecordType, costRollup=$costRollup, description=$description, relationshipType=$relationshipType, traversalEnabled=$traversalEnabled, via=$via, additionalProperties=$additionalProperties}"
}
