// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.phonenumbers.actions

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

class ActionVerifyOwnershipResponse
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
         * Returns a mutable builder for constructing an instance of
         * [ActionVerifyOwnershipResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ActionVerifyOwnershipResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(actionVerifyOwnershipResponse: ActionVerifyOwnershipResponse) = apply {
            data = actionVerifyOwnershipResponse.data
            additionalProperties = actionVerifyOwnershipResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [ActionVerifyOwnershipResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ActionVerifyOwnershipResponse =
            ActionVerifyOwnershipResponse(data, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): ActionVerifyOwnershipResponse = apply {
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
        private val found: JsonField<List<Found>>,
        private val notFound: JsonField<List<String>>,
        private val recordType: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("found") @ExcludeMissing found: JsonField<List<Found>> = JsonMissing.of(),
            @JsonProperty("not_found")
            @ExcludeMissing
            notFound: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<String> = JsonMissing.of(),
        ) : this(found, notFound, recordType, mutableMapOf())

        /**
         * The list of phone numbers which you own and are in an editable state
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun found(): Optional<List<Found>> = found.getOptional("found")

        /**
         * Phone numbers that are not found in the account
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun notFound(): Optional<List<String>> = notFound.getOptional("not_found")

        /**
         * Identifies the type of the resource.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordType(): Optional<String> = recordType.getOptional("record_type")

        /**
         * Returns the raw JSON value of [found].
         *
         * Unlike [found], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("found") @ExcludeMissing fun _found(): JsonField<List<Found>> = found

        /**
         * Returns the raw JSON value of [notFound].
         *
         * Unlike [notFound], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("not_found")
        @ExcludeMissing
        fun _notFound(): JsonField<List<String>> = notFound

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

            /** Returns a mutable builder for constructing an instance of [Data]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var found: JsonField<MutableList<Found>>? = null
            private var notFound: JsonField<MutableList<String>>? = null
            private var recordType: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                found = data.found.map { it.toMutableList() }
                notFound = data.notFound.map { it.toMutableList() }
                recordType = data.recordType
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** The list of phone numbers which you own and are in an editable state */
            fun found(found: List<Found>) = found(JsonField.of(found))

            /**
             * Sets [Builder.found] to an arbitrary JSON value.
             *
             * You should usually call [Builder.found] with a well-typed `List<Found>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun found(found: JsonField<List<Found>>) = apply {
                this.found = found.map { it.toMutableList() }
            }

            /**
             * Adds a single [Found] to [Builder.found].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addFound(found: Found) = apply {
                this.found =
                    (this.found ?: JsonField.of(mutableListOf())).also {
                        checkKnown("found", it).add(found)
                    }
            }

            /** Phone numbers that are not found in the account */
            fun notFound(notFound: List<String>) = notFound(JsonField.of(notFound))

            /**
             * Sets [Builder.notFound] to an arbitrary JSON value.
             *
             * You should usually call [Builder.notFound] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun notFound(notFound: JsonField<List<String>>) = apply {
                this.notFound = notFound.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.notFound].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addNotFound(notFound: String) = apply {
                this.notFound =
                    (this.notFound ?: JsonField.of(mutableListOf())).also {
                        checkKnown("notFound", it).add(notFound)
                    }
            }

            /** Identifies the type of the resource. */
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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Data =
                Data(
                    (found ?: JsonMissing.of()).map { it.toImmutable() },
                    (notFound ?: JsonMissing.of()).map { it.toImmutable() },
                    recordType,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            found().ifPresent { it.forEach { it.validate() } }
            notFound()
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
            (found.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (notFound.asKnown().getOrNull()?.size ?: 0) +
                (if (recordType.asKnown().isPresent) 1 else 0)

        class Found
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val numberValE164: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("number_val_e164")
                @ExcludeMissing
                numberValE164: JsonField<String> = JsonMissing.of(),
            ) : this(id, numberValE164, mutableMapOf())

            /**
             * Identifies the resource.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun id(): Optional<String> = id.getOptional("id")

            /**
             * The phone number in E.164 format
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun numberValE164(): Optional<String> = numberValE164.getOptional("number_val_e164")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [numberValE164].
             *
             * Unlike [numberValE164], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("number_val_e164")
            @ExcludeMissing
            fun _numberValE164(): JsonField<String> = numberValE164

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

                /** Returns a mutable builder for constructing an instance of [Found]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Found]. */
            class Builder internal constructor() {

                private var id: JsonField<String> = JsonMissing.of()
                private var numberValE164: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(found: Found) = apply {
                    id = found.id
                    numberValE164 = found.numberValE164
                    additionalProperties = found.additionalProperties.toMutableMap()
                }

                /** Identifies the resource. */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** The phone number in E.164 format */
                fun numberValE164(numberValE164: String) =
                    numberValE164(JsonField.of(numberValE164))

                /**
                 * Sets [Builder.numberValE164] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.numberValE164] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun numberValE164(numberValE164: JsonField<String>) = apply {
                    this.numberValE164 = numberValE164
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
                 * Returns an immutable instance of [Found].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Found = Found(id, numberValE164, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Found = apply {
                if (validated) {
                    return@apply
                }

                id()
                numberValE164()
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
                (if (id.asKnown().isPresent) 1 else 0) +
                    (if (numberValE164.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Found &&
                    id == other.id &&
                    numberValE164 == other.numberValE164 &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(id, numberValE164, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Found{id=$id, numberValE164=$numberValE164, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                found == other.found &&
                notFound == other.notFound &&
                recordType == other.recordType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(found, notFound, recordType, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{found=$found, notFound=$notFound, recordType=$recordType, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ActionVerifyOwnershipResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ActionVerifyOwnershipResponse{data=$data, additionalProperties=$additionalProperties}"
}
