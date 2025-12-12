// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messaging10dlc.brand

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.errors.TelnyxInvalidDataException

/** (Required for public company) stock exchange. */
class StockExchange @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val NONE = of("NONE")

        @JvmField val NASDAQ = of("NASDAQ")

        @JvmField val NYSE = of("NYSE")

        @JvmField val AMEX = of("AMEX")

        @JvmField val AMX = of("AMX")

        @JvmField val ASX = of("ASX")

        @JvmField val B3 = of("B3")

        @JvmField val BME = of("BME")

        @JvmField val BSE = of("BSE")

        @JvmField val FRA = of("FRA")

        @JvmField val ICEX = of("ICEX")

        @JvmField val JPX = of("JPX")

        @JvmField val JSE = of("JSE")

        @JvmField val KRX = of("KRX")

        @JvmField val LON = of("LON")

        @JvmField val NSE = of("NSE")

        @JvmField val OMX = of("OMX")

        @JvmField val SEHK = of("SEHK")

        @JvmField val SSE = of("SSE")

        @JvmField val STO = of("STO")

        @JvmField val SWX = of("SWX")

        @JvmField val SZSE = of("SZSE")

        @JvmField val TSX = of("TSX")

        @JvmField val TWSE = of("TWSE")

        @JvmField val VSE = of("VSE")

        @JvmStatic fun of(value: String) = StockExchange(JsonField.of(value))
    }

    /** An enum containing [StockExchange]'s known values. */
    enum class Known {
        NONE,
        NASDAQ,
        NYSE,
        AMEX,
        AMX,
        ASX,
        B3,
        BME,
        BSE,
        FRA,
        ICEX,
        JPX,
        JSE,
        KRX,
        LON,
        NSE,
        OMX,
        SEHK,
        SSE,
        STO,
        SWX,
        SZSE,
        TSX,
        TWSE,
        VSE,
    }

    /**
     * An enum containing [StockExchange]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [StockExchange] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        NONE,
        NASDAQ,
        NYSE,
        AMEX,
        AMX,
        ASX,
        B3,
        BME,
        BSE,
        FRA,
        ICEX,
        JPX,
        JSE,
        KRX,
        LON,
        NSE,
        OMX,
        SEHK,
        SSE,
        STO,
        SWX,
        SZSE,
        TSX,
        TWSE,
        VSE,
        /**
         * An enum member indicating that [StockExchange] was instantiated with an unknown value.
         */
        _UNKNOWN,
    }

    /**
     * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if
     * the class was instantiated with an unknown value.
     *
     * Use the [known] method instead if you're certain the value is always known or if you want to
     * throw for the unknown case.
     */
    fun value(): Value =
        when (this) {
            NONE -> Value.NONE
            NASDAQ -> Value.NASDAQ
            NYSE -> Value.NYSE
            AMEX -> Value.AMEX
            AMX -> Value.AMX
            ASX -> Value.ASX
            B3 -> Value.B3
            BME -> Value.BME
            BSE -> Value.BSE
            FRA -> Value.FRA
            ICEX -> Value.ICEX
            JPX -> Value.JPX
            JSE -> Value.JSE
            KRX -> Value.KRX
            LON -> Value.LON
            NSE -> Value.NSE
            OMX -> Value.OMX
            SEHK -> Value.SEHK
            SSE -> Value.SSE
            STO -> Value.STO
            SWX -> Value.SWX
            SZSE -> Value.SZSE
            TSX -> Value.TSX
            TWSE -> Value.TWSE
            VSE -> Value.VSE
            else -> Value._UNKNOWN
        }

    /**
     * Returns an enum member corresponding to this class instance's value.
     *
     * Use the [value] method instead if you're uncertain the value is always known and don't want
     * to throw for the unknown case.
     *
     * @throws TelnyxInvalidDataException if this class instance's value is a not a known member.
     */
    fun known(): Known =
        when (this) {
            NONE -> Known.NONE
            NASDAQ -> Known.NASDAQ
            NYSE -> Known.NYSE
            AMEX -> Known.AMEX
            AMX -> Known.AMX
            ASX -> Known.ASX
            B3 -> Known.B3
            BME -> Known.BME
            BSE -> Known.BSE
            FRA -> Known.FRA
            ICEX -> Known.ICEX
            JPX -> Known.JPX
            JSE -> Known.JSE
            KRX -> Known.KRX
            LON -> Known.LON
            NSE -> Known.NSE
            OMX -> Known.OMX
            SEHK -> Known.SEHK
            SSE -> Known.SSE
            STO -> Known.STO
            SWX -> Known.SWX
            SZSE -> Known.SZSE
            TSX -> Known.TSX
            TWSE -> Known.TWSE
            VSE -> Known.VSE
            else -> throw TelnyxInvalidDataException("Unknown StockExchange: $value")
        }

    /**
     * Returns this class instance's primitive wire representation.
     *
     * This differs from the [toString] method because that method is primarily for debugging and
     * generally doesn't throw.
     *
     * @throws TelnyxInvalidDataException if this class instance's value does not have the expected
     *   primitive type.
     */
    fun asString(): String =
        _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

    private var validated: Boolean = false

    fun validate(): StockExchange = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is StockExchange && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
