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
 * Structure specifying stereo parameters of a newly created display plane surface object.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVDisplayStereo#VK_STRUCTURE_TYPE_DISPLAY_SURFACE_STEREO_CREATE_INFO_NV STRUCTURE_TYPE_DISPLAY_SURFACE_STEREO_CREATE_INFO_NV}</li>
 * <li>{@code stereoType} <b>must</b> be a valid {@code VkDisplaySurfaceStereoTypeNV} value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDisplaySurfaceStereoCreateInfoNV {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkDisplaySurfaceStereoTypeNV {@link #stereoType};
 * }</code></pre>
 */
public class VkDisplaySurfaceStereoCreateInfoNV extends Struct<VkDisplaySurfaceStereoCreateInfoNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        STEREOTYPE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        STEREOTYPE = layout.offsetof(2);
    }

    protected VkDisplaySurfaceStereoCreateInfoNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDisplaySurfaceStereoCreateInfoNV create(long address, @Nullable ByteBuffer container) {
        return new VkDisplaySurfaceStereoCreateInfoNV(address, container);
    }

    /**
     * Creates a {@code VkDisplaySurfaceStereoCreateInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDisplaySurfaceStereoCreateInfoNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** a {@code VkDisplaySurfaceStereoTypeNV} value specifying the type of 3D stereo presentation the display will be configured for. */
    @NativeType("VkDisplaySurfaceStereoTypeNV")
    public int stereoType() { return nstereoType(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkDisplaySurfaceStereoCreateInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVDisplayStereo#VK_STRUCTURE_TYPE_DISPLAY_SURFACE_STEREO_CREATE_INFO_NV STRUCTURE_TYPE_DISPLAY_SURFACE_STEREO_CREATE_INFO_NV} value to the {@link #sType} field. */
    public VkDisplaySurfaceStereoCreateInfoNV sType$Default() { return sType(NVDisplayStereo.VK_STRUCTURE_TYPE_DISPLAY_SURFACE_STEREO_CREATE_INFO_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkDisplaySurfaceStereoCreateInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #stereoType} field. */
    public VkDisplaySurfaceStereoCreateInfoNV stereoType(@NativeType("VkDisplaySurfaceStereoTypeNV") int value) { nstereoType(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDisplaySurfaceStereoCreateInfoNV set(
        int sType,
        long pNext,
        int stereoType
    ) {
        sType(sType);
        pNext(pNext);
        stereoType(stereoType);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDisplaySurfaceStereoCreateInfoNV set(VkDisplaySurfaceStereoCreateInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDisplaySurfaceStereoCreateInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDisplaySurfaceStereoCreateInfoNV malloc() {
        return new VkDisplaySurfaceStereoCreateInfoNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDisplaySurfaceStereoCreateInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDisplaySurfaceStereoCreateInfoNV calloc() {
        return new VkDisplaySurfaceStereoCreateInfoNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDisplaySurfaceStereoCreateInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkDisplaySurfaceStereoCreateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDisplaySurfaceStereoCreateInfoNV(memAddress(container), container);
    }

    /** Returns a new {@code VkDisplaySurfaceStereoCreateInfoNV} instance for the specified memory address. */
    public static VkDisplaySurfaceStereoCreateInfoNV create(long address) {
        return new VkDisplaySurfaceStereoCreateInfoNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDisplaySurfaceStereoCreateInfoNV createSafe(long address) {
        return address == NULL ? null : new VkDisplaySurfaceStereoCreateInfoNV(address, null);
    }

    /**
     * Returns a new {@link VkDisplaySurfaceStereoCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplaySurfaceStereoCreateInfoNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDisplaySurfaceStereoCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplaySurfaceStereoCreateInfoNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDisplaySurfaceStereoCreateInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplaySurfaceStereoCreateInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDisplaySurfaceStereoCreateInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDisplaySurfaceStereoCreateInfoNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDisplaySurfaceStereoCreateInfoNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDisplaySurfaceStereoCreateInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDisplaySurfaceStereoCreateInfoNV malloc(MemoryStack stack) {
        return new VkDisplaySurfaceStereoCreateInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDisplaySurfaceStereoCreateInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDisplaySurfaceStereoCreateInfoNV calloc(MemoryStack stack) {
        return new VkDisplaySurfaceStereoCreateInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDisplaySurfaceStereoCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDisplaySurfaceStereoCreateInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDisplaySurfaceStereoCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDisplaySurfaceStereoCreateInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDisplaySurfaceStereoCreateInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDisplaySurfaceStereoCreateInfoNV.PNEXT); }
    /** Unsafe version of {@link #stereoType}. */
    public static int nstereoType(long struct) { return memGetInt(struct + VkDisplaySurfaceStereoCreateInfoNV.STEREOTYPE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDisplaySurfaceStereoCreateInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDisplaySurfaceStereoCreateInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #stereoType(int) stereoType}. */
    public static void nstereoType(long struct, int value) { memPutInt(struct + VkDisplaySurfaceStereoCreateInfoNV.STEREOTYPE, value); }

    // -----------------------------------

    /** An array of {@link VkDisplaySurfaceStereoCreateInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkDisplaySurfaceStereoCreateInfoNV, Buffer> implements NativeResource {

        private static final VkDisplaySurfaceStereoCreateInfoNV ELEMENT_FACTORY = VkDisplaySurfaceStereoCreateInfoNV.create(-1L);

        /**
         * Creates a new {@code VkDisplaySurfaceStereoCreateInfoNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDisplaySurfaceStereoCreateInfoNV#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
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
        protected VkDisplaySurfaceStereoCreateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDisplaySurfaceStereoCreateInfoNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDisplaySurfaceStereoCreateInfoNV.nsType(address()); }
        /** @return the value of the {@link VkDisplaySurfaceStereoCreateInfoNV#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDisplaySurfaceStereoCreateInfoNV.npNext(address()); }
        /** @return the value of the {@link VkDisplaySurfaceStereoCreateInfoNV#stereoType} field. */
        @NativeType("VkDisplaySurfaceStereoTypeNV")
        public int stereoType() { return VkDisplaySurfaceStereoCreateInfoNV.nstereoType(address()); }

        /** Sets the specified value to the {@link VkDisplaySurfaceStereoCreateInfoNV#sType} field. */
        public VkDisplaySurfaceStereoCreateInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkDisplaySurfaceStereoCreateInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVDisplayStereo#VK_STRUCTURE_TYPE_DISPLAY_SURFACE_STEREO_CREATE_INFO_NV STRUCTURE_TYPE_DISPLAY_SURFACE_STEREO_CREATE_INFO_NV} value to the {@link VkDisplaySurfaceStereoCreateInfoNV#sType} field. */
        public VkDisplaySurfaceStereoCreateInfoNV.Buffer sType$Default() { return sType(NVDisplayStereo.VK_STRUCTURE_TYPE_DISPLAY_SURFACE_STEREO_CREATE_INFO_NV); }
        /** Sets the specified value to the {@link VkDisplaySurfaceStereoCreateInfoNV#pNext} field. */
        public VkDisplaySurfaceStereoCreateInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkDisplaySurfaceStereoCreateInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkDisplaySurfaceStereoCreateInfoNV#stereoType} field. */
        public VkDisplaySurfaceStereoCreateInfoNV.Buffer stereoType(@NativeType("VkDisplaySurfaceStereoTypeNV") int value) { VkDisplaySurfaceStereoCreateInfoNV.nstereoType(address(), value); return this; }

    }

}