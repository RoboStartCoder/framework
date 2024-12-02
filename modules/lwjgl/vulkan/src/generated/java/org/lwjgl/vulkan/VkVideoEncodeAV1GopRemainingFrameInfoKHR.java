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
 * Structure specifying AV1 encode rate control GOP remaining frame counts.
 * 
 * <h5>Description</h5>
 * 
 * <p>Setting {@code useGopRemainingFrames} to {@link VK10#VK_TRUE TRUE} and including this structure in the {@code pNext} chain of {@link VkVideoBeginCodingInfoKHR} is only mandatory if the {@link VkVideoEncodeAV1CapabilitiesKHR}{@code ::requiresGopRemainingFrames} reported for the used <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#video-profiles">video profile</a> is {@link VK10#VK_TRUE TRUE}. However, implementations <b>may</b> use these remaining frame counts, when specified, even when it is not required. In particular, when the application does not use a <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1-regular-gop">regular GOP structure</a>, these values <b>may</b> provide additional guidance for the implementation’s rate control algorithm.</p>
 * 
 * <p>The {@link VkVideoEncodeAV1CapabilitiesKHR}{@code ::prefersGopRemainingFrames} capability is also used to indicate that the implementation’s rate control algorithm <b>may</b> operate more accurately if the application specifies the remaining frame counts using this structure.</p>
 * 
 * <p>As with other rate control guidance values, if the effective order and number of frames encoded by the application are not in line with the remaining frame counts specified in this structure at any given point, then the behavior of the implementation’s rate control algorithm <b>may</b> deviate from the one expected by the application.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoEncodeAV1#VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_GOP_REMAINING_FRAME_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_AV1_GOP_REMAINING_FRAME_INFO_KHR}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeAV1GopRemainingFrameInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkBool32 {@link #useGopRemainingFrames};
 *     uint32_t {@link #gopRemainingIntra};
 *     uint32_t {@link #gopRemainingPredictive};
 *     uint32_t {@link #gopRemainingBipredictive};
 * }</code></pre>
 */
public class VkVideoEncodeAV1GopRemainingFrameInfoKHR extends Struct<VkVideoEncodeAV1GopRemainingFrameInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        USEGOPREMAININGFRAMES,
        GOPREMAININGINTRA,
        GOPREMAININGPREDICTIVE,
        GOPREMAININGBIPREDICTIVE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        USEGOPREMAININGFRAMES = layout.offsetof(2);
        GOPREMAININGINTRA = layout.offsetof(3);
        GOPREMAININGPREDICTIVE = layout.offsetof(4);
        GOPREMAININGBIPREDICTIVE = layout.offsetof(5);
    }

    protected VkVideoEncodeAV1GopRemainingFrameInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeAV1GopRemainingFrameInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeAV1GopRemainingFrameInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeAV1GopRemainingFrameInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR(ByteBuffer container) {
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
    /** indicates whether the implementation’s rate control algorithm <b>should</b> use the values specified in {@code gopRemainingIntra}, {@code gopRemainingPredictive}, and {@code gopRemainingBipredictive}. If {@code useGopRemainingFrames} is {@link VK10#VK_FALSE FALSE}, then the values of {@code gopRemainingIntra}, {@code gopRemainingPredictive}, and {@code gopRemainingBipredictive} are ignored. */
    @NativeType("VkBool32")
    public boolean useGopRemainingFrames() { return nuseGopRemainingFrames(address()) != 0; }
    /** specifies the number of frames encoded with {@link KHRVideoEncodeAV1#VK_VIDEO_ENCODE_AV1_RATE_CONTROL_GROUP_INTRA_KHR VIDEO_ENCODE_AV1_RATE_CONTROL_GROUP_INTRA_KHR} the implementation’s rate control algorithm <b>should</b> assume to be remaining in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1-gop">GOP</a> prior to executing the next video encode operation. */
    @NativeType("uint32_t")
    public int gopRemainingIntra() { return ngopRemainingIntra(address()); }
    /** specifies the number of frames encoded with {@link KHRVideoEncodeAV1#VK_VIDEO_ENCODE_AV1_RATE_CONTROL_GROUP_PREDICTIVE_KHR VIDEO_ENCODE_AV1_RATE_CONTROL_GROUP_PREDICTIVE_KHR} the implementation’s rate control algorithm <b>should</b> assume to be remaining in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1-gop">GOP</a> prior to executing the next video encode operation. */
    @NativeType("uint32_t")
    public int gopRemainingPredictive() { return ngopRemainingPredictive(address()); }
    /** specifies the number of frames encoded with {@link KHRVideoEncodeAV1#VK_VIDEO_ENCODE_AV1_RATE_CONTROL_GROUP_BIPREDICTIVE_KHR VIDEO_ENCODE_AV1_RATE_CONTROL_GROUP_BIPREDICTIVE_KHR} the implementation’s rate control algorithm <b>should</b> assume to be remaining in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1-gop">GOP</a> prior to executing the next video encode operation. */
    @NativeType("uint32_t")
    public int gopRemainingBipredictive() { return ngopRemainingBipredictive(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeAV1#VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_GOP_REMAINING_FRAME_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_AV1_GOP_REMAINING_FRAME_INFO_KHR} value to the {@link #sType} field. */
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR sType$Default() { return sType(KHRVideoEncodeAV1.VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_GOP_REMAINING_FRAME_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #useGopRemainingFrames} field. */
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR useGopRemainingFrames(@NativeType("VkBool32") boolean value) { nuseGopRemainingFrames(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #gopRemainingIntra} field. */
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR gopRemainingIntra(@NativeType("uint32_t") int value) { ngopRemainingIntra(address(), value); return this; }
    /** Sets the specified value to the {@link #gopRemainingPredictive} field. */
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR gopRemainingPredictive(@NativeType("uint32_t") int value) { ngopRemainingPredictive(address(), value); return this; }
    /** Sets the specified value to the {@link #gopRemainingBipredictive} field. */
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR gopRemainingBipredictive(@NativeType("uint32_t") int value) { ngopRemainingBipredictive(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR set(
        int sType,
        long pNext,
        boolean useGopRemainingFrames,
        int gopRemainingIntra,
        int gopRemainingPredictive,
        int gopRemainingBipredictive
    ) {
        sType(sType);
        pNext(pNext);
        useGopRemainingFrames(useGopRemainingFrames);
        gopRemainingIntra(gopRemainingIntra);
        gopRemainingPredictive(gopRemainingPredictive);
        gopRemainingBipredictive(gopRemainingBipredictive);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR set(VkVideoEncodeAV1GopRemainingFrameInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeAV1GopRemainingFrameInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeAV1GopRemainingFrameInfoKHR malloc() {
        return new VkVideoEncodeAV1GopRemainingFrameInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeAV1GopRemainingFrameInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeAV1GopRemainingFrameInfoKHR calloc() {
        return new VkVideoEncodeAV1GopRemainingFrameInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeAV1GopRemainingFrameInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeAV1GopRemainingFrameInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeAV1GopRemainingFrameInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeAV1GopRemainingFrameInfoKHR} instance for the specified memory address. */
    public static VkVideoEncodeAV1GopRemainingFrameInfoKHR create(long address) {
        return new VkVideoEncodeAV1GopRemainingFrameInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoEncodeAV1GopRemainingFrameInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeAV1GopRemainingFrameInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1GopRemainingFrameInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1GopRemainingFrameInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1GopRemainingFrameInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1GopRemainingFrameInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1GopRemainingFrameInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1GopRemainingFrameInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeAV1GopRemainingFrameInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1GopRemainingFrameInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoEncodeAV1GopRemainingFrameInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeAV1GopRemainingFrameInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeAV1GopRemainingFrameInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeAV1GopRemainingFrameInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeAV1GopRemainingFrameInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeAV1GopRemainingFrameInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeAV1GopRemainingFrameInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1GopRemainingFrameInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1GopRemainingFrameInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1GopRemainingFrameInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1GopRemainingFrameInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoEncodeAV1GopRemainingFrameInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeAV1GopRemainingFrameInfoKHR.PNEXT); }
    /** Unsafe version of {@link #useGopRemainingFrames}. */
    public static int nuseGopRemainingFrames(long struct) { return memGetInt(struct + VkVideoEncodeAV1GopRemainingFrameInfoKHR.USEGOPREMAININGFRAMES); }
    /** Unsafe version of {@link #gopRemainingIntra}. */
    public static int ngopRemainingIntra(long struct) { return memGetInt(struct + VkVideoEncodeAV1GopRemainingFrameInfoKHR.GOPREMAININGINTRA); }
    /** Unsafe version of {@link #gopRemainingPredictive}. */
    public static int ngopRemainingPredictive(long struct) { return memGetInt(struct + VkVideoEncodeAV1GopRemainingFrameInfoKHR.GOPREMAININGPREDICTIVE); }
    /** Unsafe version of {@link #gopRemainingBipredictive}. */
    public static int ngopRemainingBipredictive(long struct) { return memGetInt(struct + VkVideoEncodeAV1GopRemainingFrameInfoKHR.GOPREMAININGBIPREDICTIVE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoEncodeAV1GopRemainingFrameInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeAV1GopRemainingFrameInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #useGopRemainingFrames(boolean) useGopRemainingFrames}. */
    public static void nuseGopRemainingFrames(long struct, int value) { memPutInt(struct + VkVideoEncodeAV1GopRemainingFrameInfoKHR.USEGOPREMAININGFRAMES, value); }
    /** Unsafe version of {@link #gopRemainingIntra(int) gopRemainingIntra}. */
    public static void ngopRemainingIntra(long struct, int value) { memPutInt(struct + VkVideoEncodeAV1GopRemainingFrameInfoKHR.GOPREMAININGINTRA, value); }
    /** Unsafe version of {@link #gopRemainingPredictive(int) gopRemainingPredictive}. */
    public static void ngopRemainingPredictive(long struct, int value) { memPutInt(struct + VkVideoEncodeAV1GopRemainingFrameInfoKHR.GOPREMAININGPREDICTIVE, value); }
    /** Unsafe version of {@link #gopRemainingBipredictive(int) gopRemainingBipredictive}. */
    public static void ngopRemainingBipredictive(long struct, int value) { memPutInt(struct + VkVideoEncodeAV1GopRemainingFrameInfoKHR.GOPREMAININGBIPREDICTIVE, value); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeAV1GopRemainingFrameInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeAV1GopRemainingFrameInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoEncodeAV1GopRemainingFrameInfoKHR ELEMENT_FACTORY = VkVideoEncodeAV1GopRemainingFrameInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeAV1GopRemainingFrameInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeAV1GopRemainingFrameInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeAV1GopRemainingFrameInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoEncodeAV1GopRemainingFrameInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeAV1GopRemainingFrameInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkVideoEncodeAV1GopRemainingFrameInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeAV1GopRemainingFrameInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkVideoEncodeAV1GopRemainingFrameInfoKHR#useGopRemainingFrames} field. */
        @NativeType("VkBool32")
        public boolean useGopRemainingFrames() { return VkVideoEncodeAV1GopRemainingFrameInfoKHR.nuseGopRemainingFrames(address()) != 0; }
        /** @return the value of the {@link VkVideoEncodeAV1GopRemainingFrameInfoKHR#gopRemainingIntra} field. */
        @NativeType("uint32_t")
        public int gopRemainingIntra() { return VkVideoEncodeAV1GopRemainingFrameInfoKHR.ngopRemainingIntra(address()); }
        /** @return the value of the {@link VkVideoEncodeAV1GopRemainingFrameInfoKHR#gopRemainingPredictive} field. */
        @NativeType("uint32_t")
        public int gopRemainingPredictive() { return VkVideoEncodeAV1GopRemainingFrameInfoKHR.ngopRemainingPredictive(address()); }
        /** @return the value of the {@link VkVideoEncodeAV1GopRemainingFrameInfoKHR#gopRemainingBipredictive} field. */
        @NativeType("uint32_t")
        public int gopRemainingBipredictive() { return VkVideoEncodeAV1GopRemainingFrameInfoKHR.ngopRemainingBipredictive(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeAV1GopRemainingFrameInfoKHR#sType} field. */
        public VkVideoEncodeAV1GopRemainingFrameInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeAV1GopRemainingFrameInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeAV1#VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_GOP_REMAINING_FRAME_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_AV1_GOP_REMAINING_FRAME_INFO_KHR} value to the {@link VkVideoEncodeAV1GopRemainingFrameInfoKHR#sType} field. */
        public VkVideoEncodeAV1GopRemainingFrameInfoKHR.Buffer sType$Default() { return sType(KHRVideoEncodeAV1.VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_GOP_REMAINING_FRAME_INFO_KHR); }
        /** Sets the specified value to the {@link VkVideoEncodeAV1GopRemainingFrameInfoKHR#pNext} field. */
        public VkVideoEncodeAV1GopRemainingFrameInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeAV1GopRemainingFrameInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeAV1GopRemainingFrameInfoKHR#useGopRemainingFrames} field. */
        public VkVideoEncodeAV1GopRemainingFrameInfoKHR.Buffer useGopRemainingFrames(@NativeType("VkBool32") boolean value) { VkVideoEncodeAV1GopRemainingFrameInfoKHR.nuseGopRemainingFrames(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeAV1GopRemainingFrameInfoKHR#gopRemainingIntra} field. */
        public VkVideoEncodeAV1GopRemainingFrameInfoKHR.Buffer gopRemainingIntra(@NativeType("uint32_t") int value) { VkVideoEncodeAV1GopRemainingFrameInfoKHR.ngopRemainingIntra(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeAV1GopRemainingFrameInfoKHR#gopRemainingPredictive} field. */
        public VkVideoEncodeAV1GopRemainingFrameInfoKHR.Buffer gopRemainingPredictive(@NativeType("uint32_t") int value) { VkVideoEncodeAV1GopRemainingFrameInfoKHR.ngopRemainingPredictive(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeAV1GopRemainingFrameInfoKHR#gopRemainingBipredictive} field. */
        public VkVideoEncodeAV1GopRemainingFrameInfoKHR.Buffer gopRemainingBipredictive(@NativeType("uint32_t") int value) { VkVideoEncodeAV1GopRemainingFrameInfoKHR.ngopRemainingBipredictive(address(), value); return this; }

    }

}