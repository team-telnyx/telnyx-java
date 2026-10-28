// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.networkroutes

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

class NetappsCursorPaginationMeta
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
     * Opaque cursors. Absent keys mean there is no such page.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cursors(): Optional<Cursors> = cursors.getOptional("cursors")

    /**
     * The path of the next page, with the same query parameters. Absent on the last page.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun next(): Optional<String> = next.getOptional("next")

    /**
     * The path of the previous page. Present when the request used `page[after]`.
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

        /**
         * Returns a mutable builder for constructing an instance of [NetappsCursorPaginationMeta].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NetappsCursorPaginationMeta]. */
    class Builder internal constructor() {

        private var cursors: JsonField<Cursors> = JsonMissing.of()
        private var next: JsonField<String> = JsonMissing.of()
        private var previous: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(netappsCursorPaginationMeta: NetappsCursorPaginationMeta) = apply {
            cursors = netappsCursorPaginationMeta.cursors
            next = netappsCursorPaginationMeta.next
            previous = netappsCursorPaginationMeta.previous
            additionalProperties = netappsCursorPaginationMeta.additionalProperties.toMutableMap()
        }

        /** Opaque cursors. Absent keys mean there is no such page. */
        fun cursors(cursors: Cursors) = cursors(JsonField.of(cursors))

        /**
         * Sets [Builder.cursors] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cursors] with a well-typed [Cursors] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cursors(cursors: JsonField<Cursors>) = apply { this.cursors = cursors }

        /** The path of the next page, with the same query parameters. Absent on the last page. */
        fun next(next: String) = next(JsonField.of(next))

        /**
         * Sets [Builder.next] to an arbitrary JSON value.
         *
         * You should usually call [Builder.next] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun next(next: JsonField<String>) = apply { this.next = next }

        /** The path of the previous page. Present when the request used `page[after]`. */
        fun previous(previous: String) = previous(JsonField.of(previous))

        /**
         * Sets [Builder.previous] to an arbitrary JSON value.
         *
         * You should usually call [Builder.previous] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
         * Returns an immutable instance of [NetappsCursorPaginationMeta].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): NetappsCursorPaginationMeta =
            NetappsCursorPaginationMeta(
                cursors,
                next,
                previous,
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
    fun validate(): NetappsCursorPaginationMeta = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (cursors.asKnown().getOrNull()?.validity() ?: 0) +
            (if (next.asKnown().isPresent) 1 else 0) +
            (if (previous.asKnown().isPresent) 1 else 0)

    /** Opaque cursors. Absent keys mean there is no such page. */
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
         * Pass as `page[after]` to fetch the next page. Absent on the last page.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun after(): Optional<String> = after.getOptional("after")

        /**
         * The cursor of the previous page. Present when the request used `page[after]`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
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

            /** Pass as `page[after]` to fetch the next page. Absent on the last page. */
            fun after(after: String) = after(JsonField.of(after))

            /**
             * Sets [Builder.after] to an arbitrary JSON value.
             *
             * You should usually call [Builder.after] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun after(after: JsonField<String>) = apply { this.after = after }

            /** The cursor of the previous page. Present when the request used `page[after]`. */
            fun before(before: String) = before(JsonField.of(before))

            /**
             * Sets [Builder.before] to an arbitrary JSON value.
             *
             * You should usually call [Builder.before] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun before(before: JsonField<String>) = apply { this.before = before }

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
             * Returns an immutable instance of [Cursors].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Cursors = Cursors(after, before, additionalProperties.toMutableMap())
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
            (if (after.asKnown().isPresent) 1 else 0) + (if (before.asKnown().isPresent) 1 else 0)

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

        return other is NetappsCursorPaginationMeta &&
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
        "NetappsCursorPaginationMeta{cursors=$cursors, next=$next, previous=$previous, additionalProperties=$additionalProperties}"
}
