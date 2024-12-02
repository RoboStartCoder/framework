/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * See {@link VkRenderingInputAttachmentIndexInfo}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkRenderingInputAttachmentIndexInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t colorAttachmentCount;
 *     uint32_t const * pColorAttachmentInputIndices;
 *     uint32_t const * pDepthInputAttachmentIndex;
 *     uint32_t const * pStencilInputAttachmentIndex;
 * }</code></pre>
 */
public class VkRenderingInputAttachmentIndexInfoKHR extends VkRenderingInputAttachmentIndexInfo {

    protected VkRenderingInputAttachmentIndexInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkRenderingInputAttachmentIndexInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkRenderingInputAttachmentIndexInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkRenderingInputAttachmentIndexInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRenderingInputAttachmentIndexInfoKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkRenderingInputAttachmentIndexInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_RENDERING_INPUT_ATTACHMENT_INDEX_INFO STRUCTURE_TYPE_RENDERING_INPUT_ATTACHMENT_INDEX_INFO} value to the {@code sType} field. */
    @Override
    public VkRenderingInputAttachmentIndexInfoKHR sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_RENDERING_INPUT_ATTACHMENT_INDEX_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkRenderingInputAttachmentIndexInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code colorAttachmentCount} field. */
    @Override
    public VkRenderingInputAttachmentIndexInfoKHR colorAttachmentCount(@NativeType("uint32_t") int value) { ncolorAttachmentCount(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pColorAttachmentInputIndices} field. */
    @Override
    public VkRenderingInputAttachmentIndexInfoKHR pColorAttachmentInputIndices(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npColorAttachmentInputIndices(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pDepthInputAttachmentIndex} field. */
    @Override
    public VkRenderingInputAttachmentIndexInfoKHR pDepthInputAttachmentIndex(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npDepthInputAttachmentIndex(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pStencilInputAttachmentIndex} field. */
    @Override
    public VkRenderingInputAttachmentIndexInfoKHR pStencilInputAttachmentIndex(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npStencilInputAttachmentIndex(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkRenderingInputAttachmentIndexInfoKHR set(
        int sType,
        long pNext,
        int colorAttachmentCount,
        @Nullable IntBuffer pColorAttachmentInputIndices,
        @Nullable IntBuffer pDepthInputAttachmentIndex,
        @Nullable IntBuffer pStencilInputAttachmentIndex
    ) {
        sType(sType);
        pNext(pNext);
        colorAttachmentCount(colorAttachmentCount);
        pColorAttachmentInputIndices(pColorAttachmentInputIndices);
        pDepthInputAttachmentIndex(pDepthInputAttachmentIndex);
        pStencilInputAttachmentIndex(pStencilInputAttachmentIndex);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkRenderingInputAttachmentIndexInfoKHR set(VkRenderingInputAttachmentIndexInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkRenderingInputAttachmentIndexInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRenderingInputAttachmentIndexInfoKHR malloc() {
        return new VkRenderingInputAttachmentIndexInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkRenderingInputAttachmentIndexInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRenderingInputAttachmentIndexInfoKHR calloc() {
        return new VkRenderingInputAttachmentIndexInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkRenderingInputAttachmentIndexInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkRenderingInputAttachmentIndexInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRenderingInputAttachmentIndexInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkRenderingInputAttachmentIndexInfoKHR} instance for the specified memory address. */
    public static VkRenderingInputAttachmentIndexInfoKHR create(long address) {
        return new VkRenderingInputAttachmentIndexInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkRenderingInputAttachmentIndexInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkRenderingInputAttachmentIndexInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkRenderingInputAttachmentIndexInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderingInputAttachmentIndexInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkRenderingInputAttachmentIndexInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderingInputAttachmentIndexInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderingInputAttachmentIndexInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderingInputAttachmentIndexInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkRenderingInputAttachmentIndexInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRenderingInputAttachmentIndexInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkRenderingInputAttachmentIndexInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkRenderingInputAttachmentIndexInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderingInputAttachmentIndexInfoKHR malloc(MemoryStack stack) {
        return new VkRenderingInputAttachmentIndexInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkRenderingInputAttachmentIndexInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderingInputAttachmentIndexInfoKHR calloc(MemoryStack stack) {
        return new VkRenderingInputAttachmentIndexInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkRenderingInputAttachmentIndexInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderingInputAttachmentIndexInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderingInputAttachmentIndexInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderingInputAttachmentIndexInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkRenderingInputAttachmentIndexInfoKHR} structs. */
    public static class Buffer extends VkRenderingInputAttachmentIndexInfo.Buffer {

        private static final VkRenderingInputAttachmentIndexInfoKHR ELEMENT_FACTORY = VkRenderingInputAttachmentIndexInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkRenderingInputAttachmentIndexInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRenderingInputAttachmentIndexInfoKHR#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VkRenderingInputAttachmentIndexInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkRenderingInputAttachmentIndexInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkRenderingInputAttachmentIndexInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_RENDERING_INPUT_ATTACHMENT_INDEX_INFO STRUCTURE_TYPE_RENDERING_INPUT_ATTACHMENT_INDEX_INFO} value to the {@code sType} field. */
        @Override
        public VkRenderingInputAttachmentIndexInfoKHR.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_RENDERING_INPUT_ATTACHMENT_INDEX_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkRenderingInputAttachmentIndexInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkRenderingInputAttachmentIndexInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code colorAttachmentCount} field. */
        @Override
        public VkRenderingInputAttachmentIndexInfoKHR.Buffer colorAttachmentCount(@NativeType("uint32_t") int value) { VkRenderingInputAttachmentIndexInfoKHR.ncolorAttachmentCount(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pColorAttachmentInputIndices} field. */
        @Override
        public VkRenderingInputAttachmentIndexInfoKHR.Buffer pColorAttachmentInputIndices(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkRenderingInputAttachmentIndexInfoKHR.npColorAttachmentInputIndices(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pDepthInputAttachmentIndex} field. */
        @Override
        public VkRenderingInputAttachmentIndexInfoKHR.Buffer pDepthInputAttachmentIndex(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkRenderingInputAttachmentIndexInfoKHR.npDepthInputAttachmentIndex(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pStencilInputAttachmentIndex} field. */
        @Override
        public VkRenderingInputAttachmentIndexInfoKHR.Buffer pStencilInputAttachmentIndex(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkRenderingInputAttachmentIndexInfoKHR.npStencilInputAttachmentIndex(address(), value); return this; }

    }

}