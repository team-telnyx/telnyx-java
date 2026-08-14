// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage.sqldbs.actions

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

class ActionQueryResponse
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

        /** Returns a mutable builder for constructing an instance of [ActionQueryResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ActionQueryResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(actionQueryResponse: ActionQueryResponse) = apply {
            data = actionQueryResponse.data
            additionalProperties = actionQueryResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [ActionQueryResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ActionQueryResponse =
            ActionQueryResponse(data, additionalProperties.toMutableMap())
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
    fun validate(): ActionQueryResponse = apply {
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
        private val count: JsonField<Long>,
        private val duration: JsonField<Double>,
        private val meta: JsonField<Meta>,
        private val results: JsonField<List<Result>>,
        private val success: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("count") @ExcludeMissing count: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("duration")
            @ExcludeMissing
            duration: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("meta") @ExcludeMissing meta: JsonField<Meta> = JsonMissing.of(),
            @JsonProperty("results")
            @ExcludeMissing
            results: JsonField<List<Result>> = JsonMissing.of(),
            @JsonProperty("success") @ExcludeMissing success: JsonField<Boolean> = JsonMissing.of(),
        ) : this(count, duration, meta, results, success, mutableMapOf())

        /**
         * Number of rows returned.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun count(): Optional<Long> = count.getOptional("count")

        /**
         * Wall-clock duration of the request, in milliseconds.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun duration(): Optional<Double> = duration.getOptional("duration")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun meta(): Optional<Meta> = meta.getOptional("meta")

        /**
         * The result rows, each a map of column name to value. Empty for statements that return no
         * rows.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun results(): Optional<List<Result>> = results.getOptional("results")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun success(): Optional<Boolean> = success.getOptional("success")

        /**
         * Returns the raw JSON value of [count].
         *
         * Unlike [count], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("count") @ExcludeMissing fun _count(): JsonField<Long> = count

        /**
         * Returns the raw JSON value of [duration].
         *
         * Unlike [duration], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("duration") @ExcludeMissing fun _duration(): JsonField<Double> = duration

        /**
         * Returns the raw JSON value of [meta].
         *
         * Unlike [meta], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("meta") @ExcludeMissing fun _meta(): JsonField<Meta> = meta

        /**
         * Returns the raw JSON value of [results].
         *
         * Unlike [results], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("results") @ExcludeMissing fun _results(): JsonField<List<Result>> = results

        /**
         * Returns the raw JSON value of [success].
         *
         * Unlike [success], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("success") @ExcludeMissing fun _success(): JsonField<Boolean> = success

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

            private var count: JsonField<Long> = JsonMissing.of()
            private var duration: JsonField<Double> = JsonMissing.of()
            private var meta: JsonField<Meta> = JsonMissing.of()
            private var results: JsonField<MutableList<Result>>? = null
            private var success: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                count = data.count
                duration = data.duration
                meta = data.meta
                results = data.results.map { it.toMutableList() }
                success = data.success
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Number of rows returned. */
            fun count(count: Long) = count(JsonField.of(count))

            /**
             * Sets [Builder.count] to an arbitrary JSON value.
             *
             * You should usually call [Builder.count] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun count(count: JsonField<Long>) = apply { this.count = count }

            /** Wall-clock duration of the request, in milliseconds. */
            fun duration(duration: Double) = duration(JsonField.of(duration))

            /**
             * Sets [Builder.duration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.duration] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun duration(duration: JsonField<Double>) = apply { this.duration = duration }

            fun meta(meta: Meta) = meta(JsonField.of(meta))

            /**
             * Sets [Builder.meta] to an arbitrary JSON value.
             *
             * You should usually call [Builder.meta] with a well-typed [Meta] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun meta(meta: JsonField<Meta>) = apply { this.meta = meta }

            /**
             * The result rows, each a map of column name to value. Empty for statements that return
             * no rows.
             */
            fun results(results: List<Result>) = results(JsonField.of(results))

            /**
             * Sets [Builder.results] to an arbitrary JSON value.
             *
             * You should usually call [Builder.results] with a well-typed `List<Result>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun results(results: JsonField<List<Result>>) = apply {
                this.results = results.map { it.toMutableList() }
            }

            /**
             * Adds a single [Result] to [results].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addResult(result: Result) = apply {
                results =
                    (results ?: JsonField.of(mutableListOf())).also {
                        checkKnown("results", it).add(result)
                    }
            }

            fun success(success: Boolean) = success(JsonField.of(success))

            /**
             * Sets [Builder.success] to an arbitrary JSON value.
             *
             * You should usually call [Builder.success] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun success(success: JsonField<Boolean>) = apply { this.success = success }

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
                    count,
                    duration,
                    meta,
                    (results ?: JsonMissing.of()).map { it.toImmutable() },
                    success,
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

            count()
            duration()
            meta().ifPresent { it.validate() }
            results().ifPresent { it.forEach { it.validate() } }
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
            (if (count.asKnown().isPresent) 1 else 0) +
                (if (duration.asKnown().isPresent) 1 else 0) +
                (meta.asKnown().getOrNull()?.validity() ?: 0) +
                (results.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (success.asKnown().isPresent) 1 else 0)

        class Meta
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val changes: JsonField<Long>,
            private val duration: JsonField<Double>,
            private val lastRowId: JsonField<Long>,
            private val rowsRead: JsonField<Long>,
            private val rowsWritten: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("changes")
                @ExcludeMissing
                changes: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("duration")
                @ExcludeMissing
                duration: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("last_row_id")
                @ExcludeMissing
                lastRowId: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("rows_read")
                @ExcludeMissing
                rowsRead: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("rows_written")
                @ExcludeMissing
                rowsWritten: JsonField<Long> = JsonMissing.of(),
            ) : this(changes, duration, lastRowId, rowsRead, rowsWritten, mutableMapOf())

            /**
             * Number of rows added, changed, or removed by the statement.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun changes(): Optional<Long> = changes.getOptional("changes")

            /**
             * Wall-clock duration of the statement, in milliseconds.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun duration(): Optional<Double> = duration.getOptional("duration")

            /**
             * Rowid of the last inserted row, when applicable.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun lastRowId(): Optional<Long> = lastRowId.getOptional("last_row_id")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun rowsRead(): Optional<Long> = rowsRead.getOptional("rows_read")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun rowsWritten(): Optional<Long> = rowsWritten.getOptional("rows_written")

            /**
             * Returns the raw JSON value of [changes].
             *
             * Unlike [changes], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("changes") @ExcludeMissing fun _changes(): JsonField<Long> = changes

            /**
             * Returns the raw JSON value of [duration].
             *
             * Unlike [duration], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("duration") @ExcludeMissing fun _duration(): JsonField<Double> = duration

            /**
             * Returns the raw JSON value of [lastRowId].
             *
             * Unlike [lastRowId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("last_row_id")
            @ExcludeMissing
            fun _lastRowId(): JsonField<Long> = lastRowId

            /**
             * Returns the raw JSON value of [rowsRead].
             *
             * Unlike [rowsRead], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("rows_read") @ExcludeMissing fun _rowsRead(): JsonField<Long> = rowsRead

            /**
             * Returns the raw JSON value of [rowsWritten].
             *
             * Unlike [rowsWritten], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("rows_written")
            @ExcludeMissing
            fun _rowsWritten(): JsonField<Long> = rowsWritten

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

                private var changes: JsonField<Long> = JsonMissing.of()
                private var duration: JsonField<Double> = JsonMissing.of()
                private var lastRowId: JsonField<Long> = JsonMissing.of()
                private var rowsRead: JsonField<Long> = JsonMissing.of()
                private var rowsWritten: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(meta: Meta) = apply {
                    changes = meta.changes
                    duration = meta.duration
                    lastRowId = meta.lastRowId
                    rowsRead = meta.rowsRead
                    rowsWritten = meta.rowsWritten
                    additionalProperties = meta.additionalProperties.toMutableMap()
                }

                /** Number of rows added, changed, or removed by the statement. */
                fun changes(changes: Long) = changes(JsonField.of(changes))

                /**
                 * Sets [Builder.changes] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.changes] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun changes(changes: JsonField<Long>) = apply { this.changes = changes }

                /** Wall-clock duration of the statement, in milliseconds. */
                fun duration(duration: Double) = duration(JsonField.of(duration))

                /**
                 * Sets [Builder.duration] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.duration] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun duration(duration: JsonField<Double>) = apply { this.duration = duration }

                /** Rowid of the last inserted row, when applicable. */
                fun lastRowId(lastRowId: Long) = lastRowId(JsonField.of(lastRowId))

                /**
                 * Sets [Builder.lastRowId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lastRowId] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun lastRowId(lastRowId: JsonField<Long>) = apply { this.lastRowId = lastRowId }

                fun rowsRead(rowsRead: Long) = rowsRead(JsonField.of(rowsRead))

                /**
                 * Sets [Builder.rowsRead] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.rowsRead] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun rowsRead(rowsRead: JsonField<Long>) = apply { this.rowsRead = rowsRead }

                fun rowsWritten(rowsWritten: Long) = rowsWritten(JsonField.of(rowsWritten))

                /**
                 * Sets [Builder.rowsWritten] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.rowsWritten] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun rowsWritten(rowsWritten: JsonField<Long>) = apply {
                    this.rowsWritten = rowsWritten
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
                 * Returns an immutable instance of [Meta].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Meta =
                    Meta(
                        changes,
                        duration,
                        lastRowId,
                        rowsRead,
                        rowsWritten,
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
            fun validate(): Meta = apply {
                if (validated) {
                    return@apply
                }

                changes()
                duration()
                lastRowId()
                rowsRead()
                rowsWritten()
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
                (if (changes.asKnown().isPresent) 1 else 0) +
                    (if (duration.asKnown().isPresent) 1 else 0) +
                    (if (lastRowId.asKnown().isPresent) 1 else 0) +
                    (if (rowsRead.asKnown().isPresent) 1 else 0) +
                    (if (rowsWritten.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Meta &&
                    changes == other.changes &&
                    duration == other.duration &&
                    lastRowId == other.lastRowId &&
                    rowsRead == other.rowsRead &&
                    rowsWritten == other.rowsWritten &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    changes,
                    duration,
                    lastRowId,
                    rowsRead,
                    rowsWritten,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Meta{changes=$changes, duration=$duration, lastRowId=$lastRowId, rowsRead=$rowsRead, rowsWritten=$rowsWritten, additionalProperties=$additionalProperties}"
        }

        class Result
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

                /** Returns a mutable builder for constructing an instance of [Result]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Result]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(result: Result) = apply {
                    additionalProperties = result.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [Result].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Result = Result(additionalProperties.toImmutable())
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
            fun validate(): Result = apply {
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

                return other is Result && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Result{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                count == other.count &&
                duration == other.duration &&
                meta == other.meta &&
                results == other.results &&
                success == other.success &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(count, duration, meta, results, success, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{count=$count, duration=$duration, meta=$meta, results=$results, success=$success, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ActionQueryResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ActionQueryResponse{data=$data, additionalProperties=$additionalProperties}"
}
