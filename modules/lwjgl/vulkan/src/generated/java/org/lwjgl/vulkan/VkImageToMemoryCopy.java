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
 * Structure specifying an image to host memory copy operation.
 * 
 * <h5>Description</h5>
 * 
 * <p>This structure is functionally similar to {@link VkBufferImageCopy2}, except it defines host memory as the target of copy instead of a buffer. In particular, the same data packing rules and restrictions as that structure apply here as well.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code pHostPointer} <b>must</b> point to memory that is large enough to contain all memory locations that are accessed according to <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#copies-buffers-images-addressing">Buffer and Image Addressing</a>, for each element of {@code pRegions}</li>
 * <li>The union of all source regions, and the union of all destination regions, specified by the elements of {@code pRegions}, <b>must</b> not overlap in memory</li>
 * </ul>
 * 
 * <ul>
 * <li>{@code bufferRowLength} <b>must</b> be 0, or greater than or equal to the {@code width} member of {@code imageExtent}</li>
 * <li>{@code bufferImageHeight} <b>must</b> be 0, or greater than or equal to the {@code height} member of {@code imageExtent}</li>
 * <li>The {@code aspectMask} member of {@code imageSubresource} <b>must</b> only have a single bit set</li>
 * <li>{@code imageExtent.width} <b>must</b> not be 0</li>
 * <li>{@code imageExtent.height} <b>must</b> not be 0</li>
 * <li>{@code imageExtent.depth} <b>must</b> not be 0</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK14#VK_STRUCTURE_TYPE_IMAGE_TO_MEMORY_COPY STRUCTURE_TYPE_IMAGE_TO_MEMORY_COPY}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code pHostPointer} <b>must</b> be a pointer value</li>
 * <li>{@code imageSubresource} <b>must</b> be a valid {@link VkImageSubresourceLayers} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkCopyImageToMemoryInfo}, {@link VkExtent3D}, {@link VkImageSubresourceLayers}, {@link VkOffset3D}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkImageToMemoryCopy {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     void * {@link #pHostPointer};
 *     uint32_t {@link #memoryRowLength};
 *     uint32_t {@link #memoryImageHeight};
 *     {@link VkImageSubresourceLayers VkImageSubresourceLayers} {@link #imageSubresource};
 *     {@link VkOffset3D VkOffset3D} {@link #imageOffset};
 *     {@link VkExtent3D VkExtent3D} {@link #imageExtent};
 * }</code></pre>
 */
public class VkImageToMemoryCopy extends Struct<VkImageToMemoryCopy> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PHOSTPOINTER,
        MEMORYROWLENGTH,
        MEMORYIMAGEHEIGHT,
        IMAGESUBRESOURCE,
        IMAGEOFFSET,
        IMAGEEXTENT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(VkImageSubresourceLayers.SIZEOF, VkImageSubresourceLayers.ALIGNOF),
            __member(VkOffset3D.SIZEOF, VkOffset3D.ALIGNOF),
            __member(VkExtent3D.SIZEOF, VkExtent3D.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PHOSTPOINTER = layout.offsetof(2);
        MEMORYROWLENGTH = layout.offsetof(3);
        MEMORYIMAGEHEIGHT = layout.offsetof(4);
        IMAGESUBRESOURCE = layout.offsetof(5);
        IMAGEOFFSET = layout.offsetof(6);
        IMAGEEXTENT = layout.offsetof(7);
    }

    protected VkImageToMemoryCopy(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkImageToMemoryCopy create(long address, @Nullable ByteBuffer container) {
        return new VkImageToMemoryCopy(address, container);
    }

    /**
     * Creates a {@code VkImageToMemoryCopy} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageToMemoryCopy(ByteBuffer container) {
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
    /** the host memory address which is the destination of the copy. */
    @NativeType("void *")
    public long pHostPointer() { return npHostPointer(address()); }
    /** {@code memoryRowLength} and {@code memoryImageHeight} specify in texels a subregion of a larger two- or three-dimensional image in host memory, and control the addressing calculations. If either of these values is zero, that aspect of the host memory is considered to be tightly packed according to the {@code imageExtent}. */
    @NativeType("uint32_t")
    public int memoryRowLength() { return nmemoryRowLength(address()); }
    /** see {@code memoryRowLength} */
    @NativeType("uint32_t")
    public int memoryImageHeight() { return nmemoryImageHeight(address()); }
    /** a {@link VkImageSubresourceLayers} used to specify the specific image subresources of the image used for the source or destination image data. */
    public VkImageSubresourceLayers imageSubresource() { return nimageSubresource(address()); }
    /** selects the initial {@code x}, {@code y}, {@code z} offsets in texels of the sub-region of the source image data. */
    public VkOffset3D imageOffset() { return nimageOffset(address()); }
    /** the size in texels of the image to copy in {@code width}, {@code height} and {@code depth}. */
    public VkExtent3D imageExtent() { return nimageExtent(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkImageToMemoryCopy sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_IMAGE_TO_MEMORY_COPY STRUCTURE_TYPE_IMAGE_TO_MEMORY_COPY} value to the {@link #sType} field. */
    public VkImageToMemoryCopy sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_IMAGE_TO_MEMORY_COPY); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkImageToMemoryCopy pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #pHostPointer} field. */
    public VkImageToMemoryCopy pHostPointer(@NativeType("void *") long value) { npHostPointer(address(), value); return this; }
    /** Sets the specified value to the {@link #memoryRowLength} field. */
    public VkImageToMemoryCopy memoryRowLength(@NativeType("uint32_t") int value) { nmemoryRowLength(address(), value); return this; }
    /** Sets the specified value to the {@link #memoryImageHeight} field. */
    public VkImageToMemoryCopy memoryImageHeight(@NativeType("uint32_t") int value) { nmemoryImageHeight(address(), value); return this; }
    /** Copies the specified {@link VkImageSubresourceLayers} to the {@link #imageSubresource} field. */
    public VkImageToMemoryCopy imageSubresource(VkImageSubresourceLayers value) { nimageSubresource(address(), value); return this; }
    /** Passes the {@link #imageSubresource} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkImageToMemoryCopy imageSubresource(java.util.function.Consumer<VkImageSubresourceLayers> consumer) { consumer.accept(imageSubresource()); return this; }
    /** Copies the specified {@link VkOffset3D} to the {@link #imageOffset} field. */
    public VkImageToMemoryCopy imageOffset(VkOffset3D value) { nimageOffset(address(), value); return this; }
    /** Passes the {@link #imageOffset} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkImageToMemoryCopy imageOffset(java.util.function.Consumer<VkOffset3D> consumer) { consumer.accept(imageOffset()); return this; }
    /** Copies the specified {@link VkExtent3D} to the {@link #imageExtent} field. */
    public VkImageToMemoryCopy imageExtent(VkExtent3D value) { nimageExtent(address(), value); return this; }
    /** Passes the {@link #imageExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkImageToMemoryCopy imageExtent(java.util.function.Consumer<VkExtent3D> consumer) { consumer.accept(imageExtent()); return this; }

    /** Initializes this struct with the specified values. */
    public VkImageToMemoryCopy set(
        int sType,
        long pNext,
        long pHostPointer,
        int memoryRowLength,
        int memoryImageHeight,
        VkImageSubresourceLayers imageSubresource,
        VkOffset3D imageOffset,
        VkExtent3D imageExtent
    ) {
        sType(sType);
        pNext(pNext);
        pHostPointer(pHostPointer);
        memoryRowLength(memoryRowLength);
        memoryImageHeight(memoryImageHeight);
        imageSubresource(imageSubresource);
        imageOffset(imageOffset);
        imageExtent(imageExtent);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImageToMemoryCopy set(VkImageToMemoryCopy src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImageToMemoryCopy} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImageToMemoryCopy malloc() {
        return new VkImageToMemoryCopy(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkImageToMemoryCopy} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageToMemoryCopy calloc() {
        return new VkImageToMemoryCopy(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkImageToMemoryCopy} instance allocated with {@link BufferUtils}. */
    public static VkImageToMemoryCopy create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageToMemoryCopy(memAddress(container), container);
    }

    /** Returns a new {@code VkImageToMemoryCopy} instance for the specified memory address. */
    public static VkImageToMemoryCopy create(long address) {
        return new VkImageToMemoryCopy(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkImageToMemoryCopy createSafe(long address) {
        return address == NULL ? null : new VkImageToMemoryCopy(address, null);
    }

    /**
     * Returns a new {@link VkImageToMemoryCopy.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageToMemoryCopy.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImageToMemoryCopy.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageToMemoryCopy.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageToMemoryCopy.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageToMemoryCopy.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkImageToMemoryCopy.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImageToMemoryCopy.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkImageToMemoryCopy.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkImageToMemoryCopy} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageToMemoryCopy malloc(MemoryStack stack) {
        return new VkImageToMemoryCopy(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkImageToMemoryCopy} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageToMemoryCopy calloc(MemoryStack stack) {
        return new VkImageToMemoryCopy(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkImageToMemoryCopy.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageToMemoryCopy.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageToMemoryCopy.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageToMemoryCopy.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkImageToMemoryCopy.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImageToMemoryCopy.PNEXT); }
    /** Unsafe version of {@link #pHostPointer}. */
    public static long npHostPointer(long struct) { return memGetAddress(struct + VkImageToMemoryCopy.PHOSTPOINTER); }
    /** Unsafe version of {@link #memoryRowLength}. */
    public static int nmemoryRowLength(long struct) { return memGetInt(struct + VkImageToMemoryCopy.MEMORYROWLENGTH); }
    /** Unsafe version of {@link #memoryImageHeight}. */
    public static int nmemoryImageHeight(long struct) { return memGetInt(struct + VkImageToMemoryCopy.MEMORYIMAGEHEIGHT); }
    /** Unsafe version of {@link #imageSubresource}. */
    public static VkImageSubresourceLayers nimageSubresource(long struct) { return VkImageSubresourceLayers.create(struct + VkImageToMemoryCopy.IMAGESUBRESOURCE); }
    /** Unsafe version of {@link #imageOffset}. */
    public static VkOffset3D nimageOffset(long struct) { return VkOffset3D.create(struct + VkImageToMemoryCopy.IMAGEOFFSET); }
    /** Unsafe version of {@link #imageExtent}. */
    public static VkExtent3D nimageExtent(long struct) { return VkExtent3D.create(struct + VkImageToMemoryCopy.IMAGEEXTENT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkImageToMemoryCopy.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImageToMemoryCopy.PNEXT, value); }
    /** Unsafe version of {@link #pHostPointer(long) pHostPointer}. */
    public static void npHostPointer(long struct, long value) { memPutAddress(struct + VkImageToMemoryCopy.PHOSTPOINTER, check(value)); }
    /** Unsafe version of {@link #memoryRowLength(int) memoryRowLength}. */
    public static void nmemoryRowLength(long struct, int value) { memPutInt(struct + VkImageToMemoryCopy.MEMORYROWLENGTH, value); }
    /** Unsafe version of {@link #memoryImageHeight(int) memoryImageHeight}. */
    public static void nmemoryImageHeight(long struct, int value) { memPutInt(struct + VkImageToMemoryCopy.MEMORYIMAGEHEIGHT, value); }
    /** Unsafe version of {@link #imageSubresource(VkImageSubresourceLayers) imageSubresource}. */
    public static void nimageSubresource(long struct, VkImageSubresourceLayers value) { memCopy(value.address(), struct + VkImageToMemoryCopy.IMAGESUBRESOURCE, VkImageSubresourceLayers.SIZEOF); }
    /** Unsafe version of {@link #imageOffset(VkOffset3D) imageOffset}. */
    public static void nimageOffset(long struct, VkOffset3D value) { memCopy(value.address(), struct + VkImageToMemoryCopy.IMAGEOFFSET, VkOffset3D.SIZEOF); }
    /** Unsafe version of {@link #imageExtent(VkExtent3D) imageExtent}. */
    public static void nimageExtent(long struct, VkExtent3D value) { memCopy(value.address(), struct + VkImageToMemoryCopy.IMAGEEXTENT, VkExtent3D.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkImageToMemoryCopy.PHOSTPOINTER));
    }

    // -----------------------------------

    /** An array of {@link VkImageToMemoryCopy} structs. */
    public static class Buffer extends StructBuffer<VkImageToMemoryCopy, Buffer> implements NativeResource {

        private static final VkImageToMemoryCopy ELEMENT_FACTORY = VkImageToMemoryCopy.create(-1L);

        /**
         * Creates a new {@code VkImageToMemoryCopy.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageToMemoryCopy#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkImageToMemoryCopy getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkImageToMemoryCopy#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImageToMemoryCopy.nsType(address()); }
        /** @return the value of the {@link VkImageToMemoryCopy#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkImageToMemoryCopy.npNext(address()); }
        /** @return the value of the {@link VkImageToMemoryCopy#pHostPointer} field. */
        @NativeType("void *")
        public long pHostPointer() { return VkImageToMemoryCopy.npHostPointer(address()); }
        /** @return the value of the {@link VkImageToMemoryCopy#memoryRowLength} field. */
        @NativeType("uint32_t")
        public int memoryRowLength() { return VkImageToMemoryCopy.nmemoryRowLength(address()); }
        /** @return the value of the {@link VkImageToMemoryCopy#memoryImageHeight} field. */
        @NativeType("uint32_t")
        public int memoryImageHeight() { return VkImageToMemoryCopy.nmemoryImageHeight(address()); }
        /** @return a {@link VkImageSubresourceLayers} view of the {@link VkImageToMemoryCopy#imageSubresource} field. */
        public VkImageSubresourceLayers imageSubresource() { return VkImageToMemoryCopy.nimageSubresource(address()); }
        /** @return a {@link VkOffset3D} view of the {@link VkImageToMemoryCopy#imageOffset} field. */
        public VkOffset3D imageOffset() { return VkImageToMemoryCopy.nimageOffset(address()); }
        /** @return a {@link VkExtent3D} view of the {@link VkImageToMemoryCopy#imageExtent} field. */
        public VkExtent3D imageExtent() { return VkImageToMemoryCopy.nimageExtent(address()); }

        /** Sets the specified value to the {@link VkImageToMemoryCopy#sType} field. */
        public VkImageToMemoryCopy.Buffer sType(@NativeType("VkStructureType") int value) { VkImageToMemoryCopy.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_IMAGE_TO_MEMORY_COPY STRUCTURE_TYPE_IMAGE_TO_MEMORY_COPY} value to the {@link VkImageToMemoryCopy#sType} field. */
        public VkImageToMemoryCopy.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_IMAGE_TO_MEMORY_COPY); }
        /** Sets the specified value to the {@link VkImageToMemoryCopy#pNext} field. */
        public VkImageToMemoryCopy.Buffer pNext(@NativeType("void const *") long value) { VkImageToMemoryCopy.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkImageToMemoryCopy#pHostPointer} field. */
        public VkImageToMemoryCopy.Buffer pHostPointer(@NativeType("void *") long value) { VkImageToMemoryCopy.npHostPointer(address(), value); return this; }
        /** Sets the specified value to the {@link VkImageToMemoryCopy#memoryRowLength} field. */
        public VkImageToMemoryCopy.Buffer memoryRowLength(@NativeType("uint32_t") int value) { VkImageToMemoryCopy.nmemoryRowLength(address(), value); return this; }
        /** Sets the specified value to the {@link VkImageToMemoryCopy#memoryImageHeight} field. */
        public VkImageToMemoryCopy.Buffer memoryImageHeight(@NativeType("uint32_t") int value) { VkImageToMemoryCopy.nmemoryImageHeight(address(), value); return this; }
        /** Copies the specified {@link VkImageSubresourceLayers} to the {@link VkImageToMemoryCopy#imageSubresource} field. */
        public VkImageToMemoryCopy.Buffer imageSubresource(VkImageSubresourceLayers value) { VkImageToMemoryCopy.nimageSubresource(address(), value); return this; }
        /** Passes the {@link VkImageToMemoryCopy#imageSubresource} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkImageToMemoryCopy.Buffer imageSubresource(java.util.function.Consumer<VkImageSubresourceLayers> consumer) { consumer.accept(imageSubresource()); return this; }
        /** Copies the specified {@link VkOffset3D} to the {@link VkImageToMemoryCopy#imageOffset} field. */
        public VkImageToMemoryCopy.Buffer imageOffset(VkOffset3D value) { VkImageToMemoryCopy.nimageOffset(address(), value); return this; }
        /** Passes the {@link VkImageToMemoryCopy#imageOffset} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkImageToMemoryCopy.Buffer imageOffset(java.util.function.Consumer<VkOffset3D> consumer) { consumer.accept(imageOffset()); return this; }
        /** Copies the specified {@link VkExtent3D} to the {@link VkImageToMemoryCopy#imageExtent} field. */
        public VkImageToMemoryCopy.Buffer imageExtent(VkExtent3D value) { VkImageToMemoryCopy.nimageExtent(address(), value); return this; }
        /** Passes the {@link VkImageToMemoryCopy#imageExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkImageToMemoryCopy.Buffer imageExtent(java.util.function.Consumer<VkExtent3D> consumer) { consumer.accept(imageExtent()); return this; }

    }

}