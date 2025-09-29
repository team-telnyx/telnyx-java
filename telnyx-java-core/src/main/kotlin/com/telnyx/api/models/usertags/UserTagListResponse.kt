// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.usertags

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.checkKnown
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class UserTagListResponse
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

        /** Returns a mutable builder for constructing an instance of [UserTagListResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UserTagListResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(userTagListResponse: UserTagListResponse) = apply {
            data = userTagListResponse.data
            additionalProperties = userTagListResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [UserTagListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): UserTagListResponse =
            UserTagListResponse(data, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): UserTagListResponse = apply {
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
        private val numberTags: JsonField<List<String>>,
        private val outboundProfileTags: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("number_tags")
            @ExcludeMissing
            numberTags: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("outbound_profile_tags")
            @ExcludeMissing
            outboundProfileTags: JsonField<List<String>> = JsonMissing.of(),
        ) : this(numberTags, outboundProfileTags, mutableMapOf())

        /**
         * A list of your tags on the given resource type. NOTE: The casing of the tags returned
         * will not necessarily match the casing of the tags when they were added to a resource.
         * This is because the tags will have the casing of the first time they were used within the
         * Telnyx system regardless of source.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun numberTags(): Optional<List<String>> = numberTags.getOptional("number_tags")

        /**
         * A list of your tags on the given resource type. NOTE: The casing of the tags returned
         * will not necessarily match the casing of the tags when they were added to a resource.
         * This is because the tags will have the casing of the first time they were used within the
         * Telnyx system regardless of source.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun outboundProfileTags(): Optional<List<String>> =
            outboundProfileTags.getOptional("outbound_profile_tags")

        /**
         * Returns the raw JSON value of [numberTags].
         *
         * Unlike [numberTags], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("number_tags")
        @ExcludeMissing
        fun _numberTags(): JsonField<List<String>> = numberTags

        /**
         * Returns the raw JSON value of [outboundProfileTags].
         *
         * Unlike [outboundProfileTags], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("outbound_profile_tags")
        @ExcludeMissing
        fun _outboundProfileTags(): JsonField<List<String>> = outboundProfileTags

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

            private var numberTags: JsonField<MutableList<String>>? = null
            private var outboundProfileTags: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                numberTags = data.numberTags.map { it.toMutableList() }
                outboundProfileTags = data.outboundProfileTags.map { it.toMutableList() }
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /**
             * A list of your tags on the given resource type. NOTE: The casing of the tags returned
             * will not necessarily match the casing of the tags when they were added to a resource.
             * This is because the tags will have the casing of the first time they were used within
             * the Telnyx system regardless of source.
             */
            fun numberTags(numberTags: List<String>) = numberTags(JsonField.of(numberTags))

            /**
             * Sets [Builder.numberTags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.numberTags] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun numberTags(numberTags: JsonField<List<String>>) = apply {
                this.numberTags = numberTags.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [numberTags].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addNumberTag(numberTag: String) = apply {
                numberTags =
                    (numberTags ?: JsonField.of(mutableListOf())).also {
                        checkKnown("numberTags", it).add(numberTag)
                    }
            }

            /**
             * A list of your tags on the given resource type. NOTE: The casing of the tags returned
             * will not necessarily match the casing of the tags when they were added to a resource.
             * This is because the tags will have the casing of the first time they were used within
             * the Telnyx system regardless of source.
             */
            fun outboundProfileTags(outboundProfileTags: List<String>) =
                outboundProfileTags(JsonField.of(outboundProfileTags))

            /**
             * Sets [Builder.outboundProfileTags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outboundProfileTags] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun outboundProfileTags(outboundProfileTags: JsonField<List<String>>) = apply {
                this.outboundProfileTags = outboundProfileTags.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [outboundProfileTags].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addOutboundProfileTag(outboundProfileTag: String) = apply {
                outboundProfileTags =
                    (outboundProfileTags ?: JsonField.of(mutableListOf())).also {
                        checkKnown("outboundProfileTags", it).add(outboundProfileTag)
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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Data =
                Data(
                    (numberTags ?: JsonMissing.of()).map { it.toImmutable() },
                    (outboundProfileTags ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            numberTags()
            outboundProfileTags()
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
            (numberTags.asKnown().getOrNull()?.size ?: 0) +
                (outboundProfileTags.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                numberTags == other.numberTags &&
                outboundProfileTags == other.outboundProfileTags &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(numberTags, outboundProfileTags, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{numberTags=$numberTags, outboundProfileTags=$outboundProfileTags, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UserTagListResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UserTagListResponse{data=$data, additionalProperties=$additionalProperties}"
}
