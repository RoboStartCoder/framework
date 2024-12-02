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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * See {@link VkPushDescriptorSetWithTemplateInfo}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPushDescriptorSetWithTemplateInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkDescriptorUpdateTemplate descriptorUpdateTemplate;
 *     VkPipelineLayout layout;
 *     uint32_t set;
 *     void const * pData;
 * }</code></pre>
 */
public class VkPushDescriptorSetWithTemplateInfoKHR extends VkPushDescriptorSetWithTemplateInfo {

    protected VkPushDescriptorSetWithTemplateInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPushDescriptorSetWithTemplateInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPushDescriptorSetWithTemplateInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkPushDescriptorSetWithTemplateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPushDescriptorSetWithTemplateInfoKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPushDescriptorSetWithTemplateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_WITH_TEMPLATE_INFO STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_WITH_TEMPLATE_INFO} value to the {@code sType} field. */
    @Override
    public VkPushDescriptorSetWithTemplateInfoKHR sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_WITH_TEMPLATE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPushDescriptorSetWithTemplateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code descriptorUpdateTemplate} field. */
    @Override
    public VkPushDescriptorSetWithTemplateInfoKHR descriptorUpdateTemplate(@NativeType("VkDescriptorUpdateTemplate") long value) { ndescriptorUpdateTemplate(address(), value); return this; }
    /** Sets the specified value to the {@code layout} field. */
    @Override
    public VkPushDescriptorSetWithTemplateInfoKHR layout(@NativeType("VkPipelineLayout") long value) { nlayout(address(), value); return this; }
    /** Sets the specified value to the {@code set} field. */
    @Override
    public VkPushDescriptorSetWithTemplateInfoKHR set(@NativeType("uint32_t") int value) { nset(address(), value); return this; }
    /** Sets the specified value to the {@code pData} field. */
    @Override
    public VkPushDescriptorSetWithTemplateInfoKHR pData(@NativeType("void const *") long value) { npData(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkPushDescriptorSetWithTemplateInfoKHR set(
        int sType,
        long pNext,
        long descriptorUpdateTemplate,
        long layout,
        int set,
        long pData
    ) {
        sType(sType);
        pNext(pNext);
        descriptorUpdateTemplate(descriptorUpdateTemplate);
        layout(layout);
        set(set);
        pData(pData);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPushDescriptorSetWithTemplateInfoKHR set(VkPushDescriptorSetWithTemplateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPushDescriptorSetWithTemplateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPushDescriptorSetWithTemplateInfoKHR malloc() {
        return new VkPushDescriptorSetWithTemplateInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPushDescriptorSetWithTemplateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPushDescriptorSetWithTemplateInfoKHR calloc() {
        return new VkPushDescriptorSetWithTemplateInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPushDescriptorSetWithTemplateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkPushDescriptorSetWithTemplateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPushDescriptorSetWithTemplateInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPushDescriptorSetWithTemplateInfoKHR} instance for the specified memory address. */
    public static VkPushDescriptorSetWithTemplateInfoKHR create(long address) {
        return new VkPushDescriptorSetWithTemplateInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPushDescriptorSetWithTemplateInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkPushDescriptorSetWithTemplateInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkPushDescriptorSetWithTemplateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPushDescriptorSetWithTemplateInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPushDescriptorSetWithTemplateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPushDescriptorSetWithTemplateInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPushDescriptorSetWithTemplateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPushDescriptorSetWithTemplateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPushDescriptorSetWithTemplateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPushDescriptorSetWithTemplateInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPushDescriptorSetWithTemplateInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPushDescriptorSetWithTemplateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPushDescriptorSetWithTemplateInfoKHR malloc(MemoryStack stack) {
        return new VkPushDescriptorSetWithTemplateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPushDescriptorSetWithTemplateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPushDescriptorSetWithTemplateInfoKHR calloc(MemoryStack stack) {
        return new VkPushDescriptorSetWithTemplateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPushDescriptorSetWithTemplateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPushDescriptorSetWithTemplateInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPushDescriptorSetWithTemplateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPushDescriptorSetWithTemplateInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkPushDescriptorSetWithTemplateInfoKHR} structs. */
    public static class Buffer extends VkPushDescriptorSetWithTemplateInfo.Buffer {

        private static final VkPushDescriptorSetWithTemplateInfoKHR ELEMENT_FACTORY = VkPushDescriptorSetWithTemplateInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkPushDescriptorSetWithTemplateInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPushDescriptorSetWithTemplateInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPushDescriptorSetWithTemplateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPushDescriptorSetWithTemplateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPushDescriptorSetWithTemplateInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_WITH_TEMPLATE_INFO STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_WITH_TEMPLATE_INFO} value to the {@code sType} field. */
        @Override
        public VkPushDescriptorSetWithTemplateInfoKHR.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_WITH_TEMPLATE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPushDescriptorSetWithTemplateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkPushDescriptorSetWithTemplateInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code descriptorUpdateTemplate} field. */
        @Override
        public VkPushDescriptorSetWithTemplateInfoKHR.Buffer descriptorUpdateTemplate(@NativeType("VkDescriptorUpdateTemplate") long value) { VkPushDescriptorSetWithTemplateInfoKHR.ndescriptorUpdateTemplate(address(), value); return this; }
        /** Sets the specified value to the {@code layout} field. */
        @Override
        public VkPushDescriptorSetWithTemplateInfoKHR.Buffer layout(@NativeType("VkPipelineLayout") long value) { VkPushDescriptorSetWithTemplateInfoKHR.nlayout(address(), value); return this; }
        /** Sets the specified value to the {@code set} field. */
        @Override
        public VkPushDescriptorSetWithTemplateInfoKHR.Buffer set(@NativeType("uint32_t") int value) { VkPushDescriptorSetWithTemplateInfoKHR.nset(address(), value); return this; }
        /** Sets the specified value to the {@code pData} field. */
        @Override
        public VkPushDescriptorSetWithTemplateInfoKHR.Buffer pData(@NativeType("void const *") long value) { VkPushDescriptorSetWithTemplateInfoKHR.npData(address(), value); return this; }

    }

}