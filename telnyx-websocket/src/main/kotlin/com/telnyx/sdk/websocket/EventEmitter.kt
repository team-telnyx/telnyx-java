// Custom code for WebSocket streaming support - persists across codegen runs.

package com.telnyx.sdk.websocket

import java.util.concurrent.CopyOnWriteArrayList

/**
 * A simple event emitter that supports typed event handlers.
 *
 * @param T the type of events this emitter handles
 */
open class EventEmitter<T : Any> {

    private val listeners = CopyOnWriteArrayList<EventListener<T>>()
    private val onceListeners = CopyOnWriteArrayList<EventListener<T>>()

    /**
     * Registers a listener for events.
     *
     * @param listener the listener to register
     * @return this emitter for chaining
     */
    fun on(listener: EventListener<T>): EventEmitter<T> {
        listeners.add(listener)
        return this
    }

    /**
     * Registers a listener that will be called only once.
     *
     * @param listener the listener to register
     * @return this emitter for chaining
     */
    fun once(listener: EventListener<T>): EventEmitter<T> {
        onceListeners.add(listener)
        return this
    }

    /**
     * Removes a listener.
     *
     * @param listener the listener to remove
     * @return this emitter for chaining
     */
    fun off(listener: EventListener<T>): EventEmitter<T> {
        listeners.remove(listener)
        onceListeners.remove(listener)
        return this
    }

    /**
     * Removes all listeners.
     *
     * @return this emitter for chaining
     */
    fun removeAllListeners(): EventEmitter<T> {
        listeners.clear()
        onceListeners.clear()
        return this
    }

    /**
     * Emits an event to all registered listeners.
     *
     * @param event the event to emit
     */
    protected fun emit(event: T) {
        listeners.forEach { it.onEvent(event) }
        val once = onceListeners.toList()
        onceListeners.clear()
        once.forEach { it.onEvent(event) }
    }

    /**
     * Checks if there are any listeners registered.
     *
     * @return true if there are listeners, false otherwise
     */
    fun hasListeners(): Boolean = listeners.isNotEmpty() || onceListeners.isNotEmpty()

    /**
     * Listener interface for events.
     */
    fun interface EventListener<T> {
        fun onEvent(event: T)
    }
}
