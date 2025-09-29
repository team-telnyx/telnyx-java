// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.recordingtranscriptions

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

class RecordingTranscriptionListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<List<RecordingTranscription>>,
    private val meta: JsonField<Meta>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data")
        @ExcludeMissing
        data: JsonField<List<RecordingTranscription>> = JsonMissing.of(),
        @JsonProperty("meta") @ExcludeMissing meta: JsonField<Meta> = JsonMissing.of(),
    ) : this(data, meta, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): Optional<List<RecordingTranscription>> = data.getOptional("data")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun meta(): Optional<Meta> = meta.getOptional("meta")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data")
    @ExcludeMissing
    fun _data(): JsonField<List<RecordingTranscription>> = data

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

        /**
         * Returns a mutable builder for constructing an instance of
         * [RecordingTranscriptionListResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RecordingTranscriptionListResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<RecordingTranscription>>? = null
        private var meta: JsonField<Meta> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(recordingTranscriptionListResponse: RecordingTranscriptionListResponse) =
            apply {
                data = recordingTranscriptionListResponse.data.map { it.toMutableList() }
                meta = recordingTranscriptionListResponse.meta
                additionalProperties =
                    recordingTranscriptionListResponse.additionalProperties.toMutableMap()
            }

        fun data(data: List<RecordingTranscription>) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed `List<RecordingTranscription>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun data(data: JsonField<List<RecordingTranscription>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        /**
         * Adds a single [RecordingTranscription] to [Builder.data].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addData(data: RecordingTranscription) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).also {
                    checkKnown("data", it).add(data)
                }
        }

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
         * Returns an immutable instance of [RecordingTranscriptionListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RecordingTranscriptionListResponse =
            RecordingTranscriptionListResponse(
                (data ?: JsonMissing.of()).map { it.toImmutable() },
                meta,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RecordingTranscriptionListResponse = apply {
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

    class Meta
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val cursors: JsonField<Cursors>,
        private val next: JsonField<String>,
        private val previous: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("cursors") @ExcludeMissing cursors: JsonField<Cursors> = JsonMissing.of(),
            @JsonProperty("next") @ExcludeMissing next: JsonField<String> = JsonMissing.of(),
            @JsonProperty("previous") @ExcludeMissing previous: JsonField<String> = JsonMissing.of(),
        ) : this(cursors, next, previous, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cursors(): Optional<Cursors> = cursors.getOptional("cursors")

        /**
         * Path to next page.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun next(): Optional<String> = next.getOptional("next")

        /**
         * Path to previous page.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun previous(): Optional<String> = previous.getOptional("previous")

        /**
         * Returns the raw JSON value of [cursors].
         *
         * Unlike [cursors], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cursors") @ExcludeMissing fun _cursors(): JsonField<Cursors> = cursors

        /**
         * Returns the raw JSON value of [next].
         *
         * Unlike [next], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("next") @ExcludeMissing fun _next(): JsonField<String> = next

        /**
         * Returns the raw JSON value of [previous].
         *
         * Unlike [previous], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("previous") @ExcludeMissing fun _previous(): JsonField<String> = previous

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

            private var cursors: JsonField<Cursors> = JsonMissing.of()
            private var next: JsonField<String> = JsonMissing.of()
            private var previous: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(meta: Meta) = apply {
                cursors = meta.cursors
                next = meta.next
                previous = meta.previous
                additionalProperties = meta.additionalProperties.toMutableMap()
            }

            fun cursors(cursors: Cursors) = cursors(JsonField.of(cursors))

            /**
             * Sets [Builder.cursors] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cursors] with a well-typed [Cursors] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cursors(cursors: JsonField<Cursors>) = apply { this.cursors = cursors }

            /** Path to next page. */
            fun next(next: String) = next(JsonField.of(next))

            /**
             * Sets [Builder.next] to an arbitrary JSON value.
             *
             * You should usually call [Builder.next] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun next(next: JsonField<String>) = apply { this.next = next }

            /** Path to previous page. */
            fun previous(previous: String) = previous(JsonField.of(previous))

            /**
             * Sets [Builder.previous] to an arbitrary JSON value.
             *
             * You should usually call [Builder.previous] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun previous(previous: JsonField<String>) = apply { this.previous = previous }

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
            fun build(): Meta = Meta(cursors, next, previous, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Meta = apply {
            if (validated) {
                return@apply
            }

            cursors().ifPresent { it.validate() }
            next()
            previous()
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
            (cursors.asKnown().getOrNull()?.validity() ?: 0) +
                (if (next.asKnown().isPresent) 1 else 0) +
                (if (previous.asKnown().isPresent) 1 else 0)

        class Cursors
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val after: JsonField<String>,
            private val before: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("after") @ExcludeMissing after: JsonField<String> = JsonMissing.of(),
                @JsonProperty("before") @ExcludeMissing before: JsonField<String> = JsonMissing.of(),
            ) : this(after, before, mutableMapOf())

            /**
             * Opaque identifier of next page.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun after(): Optional<String> = after.getOptional("after")

            /**
             * Opaque identifier of previous page.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun before(): Optional<String> = before.getOptional("before")

            /**
             * Returns the raw JSON value of [after].
             *
             * Unlike [after], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("after") @ExcludeMissing fun _after(): JsonField<String> = after

            /**
             * Returns the raw JSON value of [before].
             *
             * Unlike [before], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("before") @ExcludeMissing fun _before(): JsonField<String> = before

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

                /** Returns a mutable builder for constructing an instance of [Cursors]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Cursors]. */
            class Builder internal constructor() {

                private var after: JsonField<String> = JsonMissing.of()
                private var before: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(cursors: Cursors) = apply {
                    after = cursors.after
                    before = cursors.before
                    additionalProperties = cursors.additionalProperties.toMutableMap()
                }

                /** Opaque identifier of next page. */
                fun after(after: String) = after(JsonField.of(after))

                /**
                 * Sets [Builder.after] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.after] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun after(after: JsonField<String>) = apply { this.after = after }

                /** Opaque identifier of previous page. */
                fun before(before: String) = before(JsonField.of(before))

                /**
                 * Sets [Builder.before] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.before] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun before(before: JsonField<String>) = apply { this.before = before }

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
                 * Returns an immutable instance of [Cursors].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Cursors = Cursors(after, before, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Cursors = apply {
                if (validated) {
                    return@apply
                }

                after()
                before()
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
                (if (after.asKnown().isPresent) 1 else 0) +
                    (if (before.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Cursors &&
                    after == other.after &&
                    before == other.before &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(after, before, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Cursors{after=$after, before=$before, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Meta &&
                cursors == other.cursors &&
                next == other.next &&
                previous == other.previous &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(cursors, next, previous, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Meta{cursors=$cursors, next=$next, previous=$previous, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RecordingTranscriptionListResponse &&
            data == other.data &&
            meta == other.meta &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, meta, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RecordingTranscriptionListResponse{data=$data, meta=$meta, additionalProperties=$additionalProperties}"
}
