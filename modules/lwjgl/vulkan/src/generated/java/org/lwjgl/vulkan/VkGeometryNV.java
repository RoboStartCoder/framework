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
 * <pre>{@code
 * struct VkGeometryNV {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkGeometryTypeKHR geometryType;
 *     {@link VkGeometryDataNV VkGeometryDataNV} geometry;
 *     VkGeometryFlagsKHR flags;
 * }}</pre>
 */
public class VkGeometryNV extends Struct<VkGeometryNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        GEOMETRYTYPE,
        GEOMETRY,
        FLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(VkGeometryDataNV.SIZEOF, VkGeometryDataNV.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        GEOMETRYTYPE = layout.offsetof(2);
        GEOMETRY = layout.offsetof(3);
        FLAGS = layout.offsetof(4);
    }

    protected VkGeometryNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkGeometryNV create(long address, @Nullable ByteBuffer container) {
        return new VkGeometryNV(address, container);
    }

    /**
     * Creates a {@code VkGeometryNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkGeometryNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code geometryType} field. */
    @NativeType("VkGeometryTypeKHR")
    public int geometryType() { return ngeometryType(address()); }
    /** @return a {@link VkGeometryDataNV} view of the {@code geometry} field. */
    public VkGeometryDataNV geometry() { return ngeometry(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("VkGeometryFlagsKHR")
    public int flags() { return nflags(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkGeometryNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVRayTracing#VK_STRUCTURE_TYPE_GEOMETRY_NV STRUCTURE_TYPE_GEOMETRY_NV} value to the {@code sType} field. */
    public VkGeometryNV sType$Default() { return sType(NVRayTracing.VK_STRUCTURE_TYPE_GEOMETRY_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkGeometryNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code geometryType} field. */
    public VkGeometryNV geometryType(@NativeType("VkGeometryTypeKHR") int value) { ngeometryType(address(), value); return this; }
    /** Copies the specified {@link VkGeometryDataNV} to the {@code geometry} field. */
    public VkGeometryNV geometry(VkGeometryDataNV value) { ngeometry(address(), value); return this; }
    /** Passes the {@code geometry} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkGeometryNV geometry(java.util.function.Consumer<VkGeometryDataNV> consumer) { consumer.accept(geometry()); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkGeometryNV flags(@NativeType("VkGeometryFlagsKHR") int value) { nflags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkGeometryNV set(
        int sType,
        long pNext,
        int geometryType,
        VkGeometryDataNV geometry,
        int flags
    ) {
        sType(sType);
        pNext(pNext);
        geometryType(geometryType);
        geometry(geometry);
        flags(flags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkGeometryNV set(VkGeometryNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkGeometryNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkGeometryNV malloc() {
        return new VkGeometryNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkGeometryNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkGeometryNV calloc() {
        return new VkGeometryNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkGeometryNV} instance allocated with {@link BufferUtils}. */
    public static VkGeometryNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkGeometryNV(memAddress(container), container);
    }

    /** Returns a new {@code VkGeometryNV} instance for the specified memory address. */
    public static VkGeometryNV create(long address) {
        return new VkGeometryNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkGeometryNV createSafe(long address) {
        return address == NULL ? null : new VkGeometryNV(address, null);
    }

    /**
     * Returns a new {@link VkGeometryNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeometryNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkGeometryNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeometryNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGeometryNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeometryNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkGeometryNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkGeometryNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkGeometryNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkGeometryNV mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkGeometryNV callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkGeometryNV mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkGeometryNV callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkGeometryNV.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkGeometryNV.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkGeometryNV.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkGeometryNV.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkGeometryNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGeometryNV malloc(MemoryStack stack) {
        return new VkGeometryNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkGeometryNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGeometryNV calloc(MemoryStack stack) {
        return new VkGeometryNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkGeometryNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGeometryNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGeometryNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGeometryNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkGeometryNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkGeometryNV.PNEXT); }
    /** Unsafe version of {@link #geometryType}. */
    public static int ngeometryType(long struct) { return memGetInt(struct + VkGeometryNV.GEOMETRYTYPE); }
    /** Unsafe version of {@link #geometry}. */
    public static VkGeometryDataNV ngeometry(long struct) { return VkGeometryDataNV.create(struct + VkGeometryNV.GEOMETRY); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkGeometryNV.FLAGS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkGeometryNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkGeometryNV.PNEXT, value); }
    /** Unsafe version of {@link #geometryType(int) geometryType}. */
    public static void ngeometryType(long struct, int value) { memPutInt(struct + VkGeometryNV.GEOMETRYTYPE, value); }
    /** Unsafe version of {@link #geometry(VkGeometryDataNV) geometry}. */
    public static void ngeometry(long struct, VkGeometryDataNV value) { memCopy(value.address(), struct + VkGeometryNV.GEOMETRY, VkGeometryDataNV.SIZEOF); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkGeometryNV.FLAGS, value); }

    // -----------------------------------

    /** An array of {@link VkGeometryNV} structs. */
    public static class Buffer extends StructBuffer<VkGeometryNV, Buffer> implements NativeResource {

        private static final VkGeometryNV ELEMENT_FACTORY = VkGeometryNV.create(-1L);

        /**
         * Creates a new {@code VkGeometryNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkGeometryNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkGeometryNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkGeometryNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkGeometryNV.npNext(address()); }
        /** @return the value of the {@code geometryType} field. */
        @NativeType("VkGeometryTypeKHR")
        public int geometryType() { return VkGeometryNV.ngeometryType(address()); }
        /** @return a {@link VkGeometryDataNV} view of the {@code geometry} field. */
        public VkGeometryDataNV geometry() { return VkGeometryNV.ngeometry(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkGeometryFlagsKHR")
        public int flags() { return VkGeometryNV.nflags(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkGeometryNV.Buffer sType(@NativeType("VkStructureType") int value) { VkGeometryNV.nsType(address(), value); return this; }
        /** Sets the {@link NVRayTracing#VK_STRUCTURE_TYPE_GEOMETRY_NV STRUCTURE_TYPE_GEOMETRY_NV} value to the {@code sType} field. */
        public VkGeometryNV.Buffer sType$Default() { return sType(NVRayTracing.VK_STRUCTURE_TYPE_GEOMETRY_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkGeometryNV.Buffer pNext(@NativeType("void const *") long value) { VkGeometryNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code geometryType} field. */
        public VkGeometryNV.Buffer geometryType(@NativeType("VkGeometryTypeKHR") int value) { VkGeometryNV.ngeometryType(address(), value); return this; }
        /** Copies the specified {@link VkGeometryDataNV} to the {@code geometry} field. */
        public VkGeometryNV.Buffer geometry(VkGeometryDataNV value) { VkGeometryNV.ngeometry(address(), value); return this; }
        /** Passes the {@code geometry} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkGeometryNV.Buffer geometry(java.util.function.Consumer<VkGeometryDataNV> consumer) { consumer.accept(geometry()); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkGeometryNV.Buffer flags(@NativeType("VkGeometryFlagsKHR") int value) { VkGeometryNV.nflags(address(), value); return this; }

    }

}