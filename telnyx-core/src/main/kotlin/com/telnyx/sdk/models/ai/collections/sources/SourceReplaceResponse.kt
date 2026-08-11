// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.collections.sources

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

class SourceReplaceResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<List<Source>>,
    private val meta: JsonField<Meta>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<List<Source>> = JsonMissing.of(),
        @JsonProperty("meta") @ExcludeMissing meta: JsonField<Meta> = JsonMissing.of(),
    ) : this(data, meta, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): Optional<List<Source>> = data.getOptional("data")

    /**
     * Reports which source IDs were added, retained, and removed by a replace operation.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun meta(): Optional<Meta> = meta.getOptional("meta")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Source>> = data

    /**
     * Returns the raw JSON value of [meta].
     *
     * Unlike [meta], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("meta") @ExcludeMissing fun _meta(): JsonField<Meta> = meta

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

        /** Returns a mutable builder for constructing an instance of [SourceReplaceResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SourceReplaceResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Source>>? = null
        private var meta: JsonField<Meta> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(sourceReplaceResponse: SourceReplaceResponse) = apply {
            data = sourceReplaceResponse.data.map { it.toMutableList() }
            meta = sourceReplaceResponse.meta
            additionalProperties = sourceReplaceResponse.additionalProperties.toMutableMap()
        }

        fun data(data: List<Source>) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed `List<Source>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun data(data: JsonField<List<Source>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        /**
         * Adds a single [Source] to [Builder.data].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addData(data: Source) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).also {
                    checkKnown("data", it).add(data)
                }
        }

        /** Reports which source IDs were added, retained, and removed by a replace operation. */
        fun meta(meta: Meta) = meta(JsonField.of(meta))

        /**
         * Sets [Builder.meta] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meta] with a well-typed [Meta] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun meta(meta: JsonField<Meta>) = apply { this.meta = meta }

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
         * Returns an immutable instance of [SourceReplaceResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SourceReplaceResponse =
            SourceReplaceResponse(
                (data ?: JsonMissing.of()).map { it.toImmutable() },
                meta,
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
    fun validate(): SourceReplaceResponse = apply {
        if (validated) {
            return@apply
        }

        data().ifPresent { it.forEach { it.validate() } }
        meta().ifPresent { it.validate() }
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
        (data.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (meta.asKnown().getOrNull()?.validity() ?: 0)

    /** Reports which source IDs were added, retained, and removed by a replace operation. */
    class Meta
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val added: JsonField<List<String>>,
        private val removed: JsonField<List<String>>,
        private val retained: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("added")
            @ExcludeMissing
            added: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("removed")
            @ExcludeMissing
            removed: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("retained")
            @ExcludeMissing
            retained: JsonField<List<String>> = JsonMissing.of(),
        ) : this(added, removed, retained, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun added(): Optional<List<String>> = added.getOptional("added")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun removed(): Optional<List<String>> = removed.getOptional("removed")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun retained(): Optional<List<String>> = retained.getOptional("retained")

        /**
         * Returns the raw JSON value of [added].
         *
         * Unlike [added], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("added") @ExcludeMissing fun _added(): JsonField<List<String>> = added

        /**
         * Returns the raw JSON value of [removed].
         *
         * Unlike [removed], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("removed") @ExcludeMissing fun _removed(): JsonField<List<String>> = removed

        /**
         * Returns the raw JSON value of [retained].
         *
         * Unlike [retained], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("retained")
        @ExcludeMissing
        fun _retained(): JsonField<List<String>> = retained

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

            /** Returns a mutable builder for constructing an instance of [Meta]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Meta]. */
        class Builder internal constructor() {

            private var added: JsonField<MutableList<String>>? = null
            private var removed: JsonField<MutableList<String>>? = null
            private var retained: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(meta: Meta) = apply {
                added = meta.added.map { it.toMutableList() }
                removed = meta.removed.map { it.toMutableList() }
                retained = meta.retained.map { it.toMutableList() }
                additionalProperties = meta.additionalProperties.toMutableMap()
            }

            fun added(added: List<String>) = added(JsonField.of(added))

            /**
             * Sets [Builder.added] to an arbitrary JSON value.
             *
             * You should usually call [Builder.added] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun added(added: JsonField<List<String>>) = apply {
                this.added = added.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.added].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAdded(added: String) = apply {
                this.added =
                    (this.added ?: JsonField.of(mutableListOf())).also {
                        checkKnown("added", it).add(added)
                    }
            }

            fun removed(removed: List<String>) = removed(JsonField.of(removed))

            /**
             * Sets [Builder.removed] to an arbitrary JSON value.
             *
             * You should usually call [Builder.removed] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun removed(removed: JsonField<List<String>>) = apply {
                this.removed = removed.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.removed].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRemoved(removed: String) = apply {
                this.removed =
                    (this.removed ?: JsonField.of(mutableListOf())).also {
                        checkKnown("removed", it).add(removed)
                    }
            }

            fun retained(retained: List<String>) = retained(JsonField.of(retained))

            /**
             * Sets [Builder.retained] to an arbitrary JSON value.
             *
             * You should usually call [Builder.retained] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun retained(retained: JsonField<List<String>>) = apply {
                this.retained = retained.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.retained].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRetained(retained: String) = apply {
                this.retained =
                    (this.retained ?: JsonField.of(mutableListOf())).also {
                        checkKnown("retained", it).add(retained)
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
             * Returns an immutable instance of [Meta].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Meta =
                Meta(
                    (added ?: JsonMissing.of()).map { it.toImmutable() },
                    (removed ?: JsonMissing.of()).map { it.toImmutable() },
                    (retained ?: JsonMissing.of()).map { it.toImmutable() },
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
        fun validate(): Meta = apply {
            if (validated) {
                return@apply
            }

            added()
            removed()
            retained()
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
            (added.asKnown().getOrNull()?.size ?: 0) +
                (removed.asKnown().getOrNull()?.size ?: 0) +
                (retained.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Meta &&
                added == other.added &&
                removed == other.removed &&
                retained == other.retained &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(added, removed, retained, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Meta{added=$added, removed=$removed, retained=$retained, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SourceReplaceResponse &&
            data == other.data &&
            meta == other.meta &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, meta, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SourceReplaceResponse{data=$data, meta=$meta, additionalProperties=$additionalProperties}"
}
