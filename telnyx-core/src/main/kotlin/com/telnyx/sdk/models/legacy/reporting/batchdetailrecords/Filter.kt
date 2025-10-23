// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.legacy.reporting.batchdetailrecords

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Query filter criteria. Note: The first filter object must specify filter_type as 'and'. You
 * cannot follow an 'or' with another 'and'.
 */
class Filter
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val billingGroup: JsonField<String>,
    private val cld: JsonField<String>,
    private val cldFilter: JsonField<CldFilter>,
    private val cli: JsonField<String>,
    private val cliFilter: JsonField<CliFilter>,
    private val filterType: JsonField<FilterType>,
    private val tagsList: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("billing_group")
        @ExcludeMissing
        billingGroup: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cld") @ExcludeMissing cld: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cld_filter")
        @ExcludeMissing
        cldFilter: JsonField<CldFilter> = JsonMissing.of(),
        @JsonProperty("cli") @ExcludeMissing cli: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cli_filter")
        @ExcludeMissing
        cliFilter: JsonField<CliFilter> = JsonMissing.of(),
        @JsonProperty("filter_type")
        @ExcludeMissing
        filterType: JsonField<FilterType> = JsonMissing.of(),
        @JsonProperty("tags_list") @ExcludeMissing tagsList: JsonField<String> = JsonMissing.of(),
    ) : this(billingGroup, cld, cldFilter, cli, cliFilter, filterType, tagsList, mutableMapOf())

    /**
     * Billing group UUID to filter by
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billingGroup(): Optional<String> = billingGroup.getOptional("billing_group")

    /**
     * Called line identification (destination number)
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cld(): Optional<String> = cld.getOptional("cld")

    /**
     * Filter type for CLD matching
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cldFilter(): Optional<CldFilter> = cldFilter.getOptional("cld_filter")

    /**
     * Calling line identification (caller ID)
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cli(): Optional<String> = cli.getOptional("cli")

    /**
     * Filter type for CLI matching
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cliFilter(): Optional<CliFilter> = cliFilter.getOptional("cli_filter")

    /**
     * Logical operator for combining filters
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun filterType(): Optional<FilterType> = filterType.getOptional("filter_type")

    /**
     * Tag name to filter by
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tagsList(): Optional<String> = tagsList.getOptional("tags_list")

    /**
     * Returns the raw JSON value of [billingGroup].
     *
     * Unlike [billingGroup], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("billing_group")
    @ExcludeMissing
    fun _billingGroup(): JsonField<String> = billingGroup

    /**
     * Returns the raw JSON value of [cld].
     *
     * Unlike [cld], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cld") @ExcludeMissing fun _cld(): JsonField<String> = cld

    /**
     * Returns the raw JSON value of [cldFilter].
     *
     * Unlike [cldFilter], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cld_filter") @ExcludeMissing fun _cldFilter(): JsonField<CldFilter> = cldFilter

    /**
     * Returns the raw JSON value of [cli].
     *
     * Unlike [cli], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cli") @ExcludeMissing fun _cli(): JsonField<String> = cli

    /**
     * Returns the raw JSON value of [cliFilter].
     *
     * Unlike [cliFilter], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cli_filter") @ExcludeMissing fun _cliFilter(): JsonField<CliFilter> = cliFilter

    /**
     * Returns the raw JSON value of [filterType].
     *
     * Unlike [filterType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filter_type")
    @ExcludeMissing
    fun _filterType(): JsonField<FilterType> = filterType

    /**
     * Returns the raw JSON value of [tagsList].
     *
     * Unlike [tagsList], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tags_list") @ExcludeMissing fun _tagsList(): JsonField<String> = tagsList

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

        /** Returns a mutable builder for constructing an instance of [Filter]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Filter]. */
    class Builder internal constructor() {

        private var billingGroup: JsonField<String> = JsonMissing.of()
        private var cld: JsonField<String> = JsonMissing.of()
        private var cldFilter: JsonField<CldFilter> = JsonMissing.of()
        private var cli: JsonField<String> = JsonMissing.of()
        private var cliFilter: JsonField<CliFilter> = JsonMissing.of()
        private var filterType: JsonField<FilterType> = JsonMissing.of()
        private var tagsList: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(filter: Filter) = apply {
            billingGroup = filter.billingGroup
            cld = filter.cld
            cldFilter = filter.cldFilter
            cli = filter.cli
            cliFilter = filter.cliFilter
            filterType = filter.filterType
            tagsList = filter.tagsList
            additionalProperties = filter.additionalProperties.toMutableMap()
        }

        /** Billing group UUID to filter by */
        fun billingGroup(billingGroup: String) = billingGroup(JsonField.of(billingGroup))

        /**
         * Sets [Builder.billingGroup] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingGroup] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun billingGroup(billingGroup: JsonField<String>) = apply {
            this.billingGroup = billingGroup
        }

        /** Called line identification (destination number) */
        fun cld(cld: String) = cld(JsonField.of(cld))

        /**
         * Sets [Builder.cld] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cld] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cld(cld: JsonField<String>) = apply { this.cld = cld }

        /** Filter type for CLD matching */
        fun cldFilter(cldFilter: CldFilter) = cldFilter(JsonField.of(cldFilter))

        /**
         * Sets [Builder.cldFilter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cldFilter] with a well-typed [CldFilter] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cldFilter(cldFilter: JsonField<CldFilter>) = apply { this.cldFilter = cldFilter }

        /** Calling line identification (caller ID) */
        fun cli(cli: String) = cli(JsonField.of(cli))

        /**
         * Sets [Builder.cli] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cli] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cli(cli: JsonField<String>) = apply { this.cli = cli }

        /** Filter type for CLI matching */
        fun cliFilter(cliFilter: CliFilter) = cliFilter(JsonField.of(cliFilter))

        /**
         * Sets [Builder.cliFilter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cliFilter] with a well-typed [CliFilter] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cliFilter(cliFilter: JsonField<CliFilter>) = apply { this.cliFilter = cliFilter }

        /** Logical operator for combining filters */
        fun filterType(filterType: FilterType) = filterType(JsonField.of(filterType))

        /**
         * Sets [Builder.filterType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filterType] with a well-typed [FilterType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun filterType(filterType: JsonField<FilterType>) = apply { this.filterType = filterType }

        /** Tag name to filter by */
        fun tagsList(tagsList: String) = tagsList(JsonField.of(tagsList))

        /**
         * Sets [Builder.tagsList] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tagsList] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tagsList(tagsList: JsonField<String>) = apply { this.tagsList = tagsList }

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
         * Returns an immutable instance of [Filter].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Filter =
            Filter(
                billingGroup,
                cld,
                cldFilter,
                cli,
                cliFilter,
                filterType,
                tagsList,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Filter = apply {
        if (validated) {
            return@apply
        }

        billingGroup()
        cld()
        cldFilter().ifPresent { it.validate() }
        cli()
        cliFilter().ifPresent { it.validate() }
        filterType().ifPresent { it.validate() }
        tagsList()
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
        (if (billingGroup.asKnown().isPresent) 1 else 0) +
            (if (cld.asKnown().isPresent) 1 else 0) +
            (cldFilter.asKnown().getOrNull()?.validity() ?: 0) +
            (if (cli.asKnown().isPresent) 1 else 0) +
            (cliFilter.asKnown().getOrNull()?.validity() ?: 0) +
            (filterType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (tagsList.asKnown().isPresent) 1 else 0)

    /** Filter type for CLD matching */
    class CldFilter @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val CONTAINS = of("contains")

            @JvmField val STARTS_WITH = of("starts_with")

            @JvmField val ENDS_WITH = of("ends_with")

            @JvmStatic fun of(value: String) = CldFilter(JsonField.of(value))
        }

        /** An enum containing [CldFilter]'s known values. */
        enum class Known {
            CONTAINS,
            STARTS_WITH,
            ENDS_WITH,
        }

        /**
         * An enum containing [CldFilter]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [CldFilter] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CONTAINS,
            STARTS_WITH,
            ENDS_WITH,
            /**
             * An enum member indicating that [CldFilter] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                CONTAINS -> Value.CONTAINS
                STARTS_WITH -> Value.STARTS_WITH
                ENDS_WITH -> Value.ENDS_WITH
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws TelnyxInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                CONTAINS -> Known.CONTAINS
                STARTS_WITH -> Known.STARTS_WITH
                ENDS_WITH -> Known.ENDS_WITH
                else -> throw TelnyxInvalidDataException("Unknown CldFilter: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): CldFilter = apply {
            if (validated) {
                return@apply
            }

            known()
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CldFilter && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Filter type for CLI matching */
    class CliFilter @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val CONTAINS = of("contains")

            @JvmField val STARTS_WITH = of("starts_with")

            @JvmField val ENDS_WITH = of("ends_with")

            @JvmStatic fun of(value: String) = CliFilter(JsonField.of(value))
        }

        /** An enum containing [CliFilter]'s known values. */
        enum class Known {
            CONTAINS,
            STARTS_WITH,
            ENDS_WITH,
        }

        /**
         * An enum containing [CliFilter]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [CliFilter] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CONTAINS,
            STARTS_WITH,
            ENDS_WITH,
            /**
             * An enum member indicating that [CliFilter] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                CONTAINS -> Value.CONTAINS
                STARTS_WITH -> Value.STARTS_WITH
                ENDS_WITH -> Value.ENDS_WITH
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws TelnyxInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                CONTAINS -> Known.CONTAINS
                STARTS_WITH -> Known.STARTS_WITH
                ENDS_WITH -> Known.ENDS_WITH
                else -> throw TelnyxInvalidDataException("Unknown CliFilter: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): CliFilter = apply {
            if (validated) {
                return@apply
            }

            known()
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CliFilter && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Logical operator for combining filters */
    class FilterType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val AND = of("and")

            @JvmField val OR = of("or")

            @JvmStatic fun of(value: String) = FilterType(JsonField.of(value))
        }

        /** An enum containing [FilterType]'s known values. */
        enum class Known {
            AND,
            OR,
        }

        /**
         * An enum containing [FilterType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [FilterType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AND,
            OR,
            /**
             * An enum member indicating that [FilterType] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                AND -> Value.AND
                OR -> Value.OR
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws TelnyxInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                AND -> Known.AND
                OR -> Known.OR
                else -> throw TelnyxInvalidDataException("Unknown FilterType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): FilterType = apply {
            if (validated) {
                return@apply
            }

            known()
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FilterType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Filter &&
            billingGroup == other.billingGroup &&
            cld == other.cld &&
            cldFilter == other.cldFilter &&
            cli == other.cli &&
            cliFilter == other.cliFilter &&
            filterType == other.filterType &&
            tagsList == other.tagsList &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            billingGroup,
            cld,
            cldFilter,
            cli,
            cliFilter,
            filterType,
            tagsList,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Filter{billingGroup=$billingGroup, cld=$cld, cldFilter=$cldFilter, cli=$cli, cliFilter=$cliFilter, filterType=$filterType, tagsList=$tagsList, additionalProperties=$additionalProperties}"
}
