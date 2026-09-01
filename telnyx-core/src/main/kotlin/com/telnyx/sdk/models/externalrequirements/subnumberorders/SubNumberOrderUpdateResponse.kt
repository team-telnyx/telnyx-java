// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.externalrequirements.subnumberorders

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class SubNumberOrderUpdateResponse
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

        /**
         * Returns a mutable builder for constructing an instance of [SubNumberOrderUpdateResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SubNumberOrderUpdateResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(subNumberOrderUpdateResponse: SubNumberOrderUpdateResponse) = apply {
            data = subNumberOrderUpdateResponse.data
            additionalProperties = subNumberOrderUpdateResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [SubNumberOrderUpdateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SubNumberOrderUpdateResponse =
            SubNumberOrderUpdateResponse(data, additionalProperties.toMutableMap())
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
    fun validate(): SubNumberOrderUpdateResponse = apply {
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
        private val regulatoryRequirementId: JsonField<String>,
        private val requirementAction: JsonField<RequirementAction>,
        private val subOrderId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("regulatory_requirement_id")
            @ExcludeMissing
            regulatoryRequirementId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("requirement_action")
            @ExcludeMissing
            requirementAction: JsonField<RequirementAction> = JsonMissing.of(),
            @JsonProperty("sub_order_id")
            @ExcludeMissing
            subOrderId: JsonField<String> = JsonMissing.of(),
        ) : this(regulatoryRequirementId, requirementAction, subOrderId, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun regulatoryRequirementId(): Optional<String> =
            regulatoryRequirementId.getOptional("regulatory_requirement_id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun requirementAction(): Optional<RequirementAction> =
            requirementAction.getOptional("requirement_action")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun subOrderId(): Optional<String> = subOrderId.getOptional("sub_order_id")

        /**
         * Returns the raw JSON value of [regulatoryRequirementId].
         *
         * Unlike [regulatoryRequirementId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("regulatory_requirement_id")
        @ExcludeMissing
        fun _regulatoryRequirementId(): JsonField<String> = regulatoryRequirementId

        /**
         * Returns the raw JSON value of [requirementAction].
         *
         * Unlike [requirementAction], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("requirement_action")
        @ExcludeMissing
        fun _requirementAction(): JsonField<RequirementAction> = requirementAction

        /**
         * Returns the raw JSON value of [subOrderId].
         *
         * Unlike [subOrderId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sub_order_id")
        @ExcludeMissing
        fun _subOrderId(): JsonField<String> = subOrderId

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

            private var regulatoryRequirementId: JsonField<String> = JsonMissing.of()
            private var requirementAction: JsonField<RequirementAction> = JsonMissing.of()
            private var subOrderId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                regulatoryRequirementId = data.regulatoryRequirementId
                requirementAction = data.requirementAction
                subOrderId = data.subOrderId
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun regulatoryRequirementId(regulatoryRequirementId: String) =
                regulatoryRequirementId(JsonField.of(regulatoryRequirementId))

            /**
             * Sets [Builder.regulatoryRequirementId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.regulatoryRequirementId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun regulatoryRequirementId(regulatoryRequirementId: JsonField<String>) = apply {
                this.regulatoryRequirementId = regulatoryRequirementId
            }

            fun requirementAction(requirementAction: RequirementAction) =
                requirementAction(JsonField.of(requirementAction))

            /**
             * Sets [Builder.requirementAction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.requirementAction] with a well-typed
             * [RequirementAction] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun requirementAction(requirementAction: JsonField<RequirementAction>) = apply {
                this.requirementAction = requirementAction
            }

            fun subOrderId(subOrderId: String) = subOrderId(JsonField.of(subOrderId))

            /**
             * Sets [Builder.subOrderId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subOrderId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun subOrderId(subOrderId: JsonField<String>) = apply { this.subOrderId = subOrderId }

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
                    regulatoryRequirementId,
                    requirementAction,
                    subOrderId,
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

            regulatoryRequirementId()
            requirementAction().ifPresent { it.validate() }
            subOrderId()
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
            (if (regulatoryRequirementId.asKnown().isPresent) 1 else 0) +
                (requirementAction.asKnown().getOrNull()?.validity() ?: 0) +
                (if (subOrderId.asKnown().isPresent) 1 else 0)

        class RequirementAction
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val type: JsonField<String>,
            private val value: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
                @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
            ) : this(type, value, mutableMapOf())

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun type(): Optional<String> = type.getOptional("type")

            /**
             * For Australia mobile ID verification, the unique Onfido verification link to share
             * with the end user.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun value(): Optional<String> = value.getOptional("value")

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

            /**
             * Returns the raw JSON value of [value].
             *
             * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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
                 * Returns a mutable builder for constructing an instance of [RequirementAction].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [RequirementAction]. */
            class Builder internal constructor() {

                private var type: JsonField<String> = JsonMissing.of()
                private var value: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(requirementAction: RequirementAction) = apply {
                    type = requirementAction.type
                    value = requirementAction.value
                    additionalProperties = requirementAction.additionalProperties.toMutableMap()
                }

                fun type(type: String) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<String>) = apply { this.type = type }

                /**
                 * For Australia mobile ID verification, the unique Onfido verification link to
                 * share with the end user.
                 */
                fun value(value: String?) = value(JsonField.ofNullable(value))

                /** Alias for calling [Builder.value] with `value.orElse(null)`. */
                fun value(value: Optional<String>) = value(value.getOrNull())

                /**
                 * Sets [Builder.value] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.value] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun value(value: JsonField<String>) = apply { this.value = value }

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
                 * Returns an immutable instance of [RequirementAction].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): RequirementAction =
                    RequirementAction(type, value, additionalProperties.toMutableMap())
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
            fun validate(): RequirementAction = apply {
                if (validated) {
                    return@apply
                }

                type()
                value()
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
                (if (type.asKnown().isPresent) 1 else 0) + (if (value.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is RequirementAction &&
                    type == other.type &&
                    value == other.value &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(type, value, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "RequirementAction{type=$type, value=$value, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                regulatoryRequirementId == other.regulatoryRequirementId &&
                requirementAction == other.requirementAction &&
                subOrderId == other.subOrderId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                regulatoryRequirementId,
                requirementAction,
                subOrderId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{regulatoryRequirementId=$regulatoryRequirementId, requirementAction=$requirementAction, subOrderId=$subOrderId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubNumberOrderUpdateResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SubNumberOrderUpdateResponse{data=$data, additionalProperties=$additionalProperties}"
}
