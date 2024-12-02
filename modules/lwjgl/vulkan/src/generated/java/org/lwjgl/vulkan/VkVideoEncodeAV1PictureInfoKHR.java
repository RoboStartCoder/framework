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

import org.lwjgl.vulkan.video.*;

import static org.lwjgl.vulkan.KHRVideoDecodeAV1.*;

/**
 * Structure specifies AV1 encode frame parameters.
 * 
 * <h5>Description</h5>
 * 
 * <p>This structure is specified in the {@code pNext} chain of the {@link VkVideoEncodeInfoKHR} structure passed to {@link KHRVideoEncodeQueue#vkCmdEncodeVideoKHR CmdEncodeVideoKHR} to specify the codec-specific picture information for an <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1">AV1 encode operation</a>.</p>
 * 
 * <dl>
 * <dt>Encode Input Picture Information</dt>
 * <dd><ul>
 * <li>The image subregion used is determined according to the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1-picture-data-access">AV1 Encode Picture Data Access</a> section.</li>
 * <li>The encode input picture is associated with the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1-picture-info">AV1 picture information</a> provided in {@code pStdPictureInfo}.</li>
 * </ul></dd>
 * </dl>
 * 
 * <dl>
 * <dt>Std Picture Information</dt>
 * <dd><ul>
 * <li>{@code flags.reserved} and {@code reserved1} are used only for padding purposes and are otherwise ignored;</li>
 * <li>{@code pSegmentation} <b>must</b> be {@code NULL}
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>AV1 segmentation is currently not supported in video encode operations. Accordingly, the application needs to set {@code flags.segmentation_enabled} to 0 and {@code pSegmentation} to {@code NULL}.</p>
 * </div>
 * </li>
 * <li>{@code pTileInfo} is {@code NULL} or a pointer to a {@code StdVideoAV1TileInfo} structure specifying <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1-tile-params">AV1 tile parameters</a>;</li>
 * <li>the {@code StdVideoAV1Quantization} structure pointed to by {@code pQuantization} is interpreted as follows:
 * 
 * <ul>
 * <li>{@code flags.reserved} is used only for padding purposes and is otherwise ignored;</li>
 * <li>all other members of {@code StdVideoAV1Quantization} are interpreted as defined in section 6.8.11 of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#aomedia-av1">AV1 Specification</a>;</li>
 * </ul>
 * </li>
 * <li>the {@code StdVideoAV1LoopFilter} structure pointed to by {@code pLoopFilter} is interpreted as follows:
 * 
 * <ul>
 * <li>{@code flags.reserved} is used only for padding purposes and is otherwise ignored;</li>
 * <li>{@code update_ref_delta} is a bitmask where bit index <code>i</code> is interpreted as the value of {@code update_ref_delta} corresponding to element <code>i</code> of {@code loop_filter_ref_deltas} as defined in section 6.8.10 of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#aomedia-av1">AV1 Specification</a>;</li>
 * <li>{@code update_mode_delta} is a bitmask where bit index <code>i</code> is interpreted as the value of {@code update_mode_delta} corresponding to element <code>i</code> of {@code loop_filter_mode_deltas} as defined in section 6.8.10 of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#aomedia-av1">AV1 Specification</a>;</li>
 * <li>all other members of {@code StdVideoAV1LoopFilter} are interpreted as defined in section 6.8.10 of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#aomedia-av1">AV1 Specification</a>;</li>
 * </ul>
 * </li>
 * <li>if {@code flags.enable_cdef} is set in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1-active-sequence-header">active sequence header</a>, then the members of the {@code StdVideoAV1CDEF} structure pointed to by {@code pCDEF} are interpreted as follows:
 * 
 * <ul>
 * <li>{@code cdef_y_sec_strength} and {@code cdef_uv_sec_strength} are the bitstream values of the corresponding syntax elements defined in section 5.9.19 of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#aomedia-av1">AV1 Specification</a>;</li>
 * <li>all other members of {@code StdVideoAV1CDEF} are interpreted as defined in section 6.10.14 of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#aomedia-av1">AV1 Specification</a>;</li>
 * </ul>
 * </li>
 * <li>if {@code flags.UsesLr} is set in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1-active-sequence-header">active sequence header</a>, then the {@code StdVideoAV1LoopRestoration} structure pointed to by {@code pLoopRestoration} is interpreted as follows:
 * 
 * <ul>
 * <li>{@code LoopRestorationSize}[{@code plane}] is interpreted as <code>log2(size) - 5</code>, where {@code size} is the value of {@code LoopRestorationSize}[{@code plane}] as defined in section 6.10.15 of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#aomedia-av1">AV1 Specification</a>;</li>
 * <li>all other members of {@code StdVideoAV1LoopRestoration} are defined as in section 6.10.15 of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#aomedia-av1">AV1 Specification</a>;</li>
 * </ul>
 * </li>
 * <li>the members of the {@code StdVideoAV1GlobalMotion} structure provided in {@code global_motion} are interpreted as defined in section 7.10 of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#aomedia-av1">AV1 Specification</a>;</li>
 * <li>{@code pExtensionHeader} is {@code NULL} or a pointer to a {@code StdVideoEncodeAV1ExtensionHeader} structure whose {@code temporal_id} and {@code spatial_id} members specify the temporal and spatial layer ID of the reference frame, respectively (these IDs are encoded into the OBU extension header if {@link VkVideoEncodeAV1PictureInfoKHR}{@code ::generateObuExtensionHeader} is set to {@link VK10#VK_TRUE TRUE} for the encode operation);</li>
 * <li>if {@code flags.buffer_removal_time_present_flag} is set, then {@code pBufferRemovalTimes} is a pointer to an array of <code>N</code> number of unsigned integer values specifying the elements of the {@code buffer_removal_time} array, as defined in section 6.8.2 of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#aomedia-av1">AV1 Specification</a>, where <code>N</code> is the number of operating points specified for the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1-active-sequence-header">active sequence header</a> through {@link VkVideoEncodeAV1SessionParametersCreateInfoKHR}{@code ::stdOperatingPointCount};</li>
 * <li>all other members are interpreted as defined in section 6.8 of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#aomedia-av1">AV1 Specification</a>.</li>
 * </ul></dd>
 * </dl>
 * 
 * <p>Reference picture setup is controlled by the value of {@code StdVideoEncodeAV1PictureInfo}{@code ::refresh_frame_flags}. If it is not zero and a <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-reconstructed-picture-info">reconstructed picture</a> is specified, then the latter is used as the target of picture reconstruction to <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dpb-slot-states">activate</a> the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dpb-slot">DPB slot</a> specified in {@code pEncodeInfo→pSetupReferenceSlot→slotIndex}. If {@code StdVideoEncodeAV1PictureInfo}{@code ::refresh_frame_flags} is zero, but a <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-reconstructed-picture-info">reconstructed picture</a> is specified, then the corresponding picture reference associated with the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dpb-slot">DPB slot</a> is invalidated, as described in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dpb-slot-states">DPB Slot States</a> section.</p>
 * 
 * <dl>
 * <dt>Std Tile Parameters</dt>
 * <dd><ul>
 * <li>{@code flags.reserved} and {@code reserved1} are used only for padding purposes and are otherwise ignored;</li>
 * <li>{@code TileCols} and {@code TileRows} specify the number of tile columns and tile rows as defined in section 6.8.14 of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#aomedia-av1">AV1 Specification</a>;</li>
 * <li>{@code tile_size_bytes_minus_1} is ignored, as its value, as defined in section 6.8.14 of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#aomedia-av1">AV1 Specification</a>, is determined as the result of the encoding process;</li>
 * <li>{@code pMiColStarts} and {@code pMiRowStarts} are ignored, as the elements of the {@code MiColStarts} and {@code MiRowStarts} arrays defined in section 6.8.14 of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#aomedia-av1">AV1 Specification</a> are determined by the implementation based on the tile widths and heights determined by the implementation or specified through the {@code pWidthInSbsMinus1} and {@code pHeightInSbsMinus1} arrays, respectively;</li>
 * <li>{@code pWidthInSbsMinus1} is {@code NULL} or a pointer to an array of {@code TileCols} number of unsigned integers that corresponds to {@code width_in_sbs_minus_1} defined in section 6.8.14 of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#aomedia-av1">AV1 Specification</a>;</li>
 * <li>{@code pHeightInSbsMinus1} is {@code NULL} or is a pointer to an array of {@code TileRows} number of unsigned integers that corresponds to {@code height_in_sbs_minus_1} defined in section 6.8.14 of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#aomedia-av1">AV1 Specification</a>;</li>
 * <li>all other members of {@code StdVideoAV1TileInfo} are interpreted as defined in section 6.8.14 of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#aomedia-av1">AV1 Specification</a>.</li>
 * </ul></dd>
 * </dl>
 * 
 * <p>If {@code flags.uniform_tile_spacing_flag} is set, then {@code pWidthInSbsMinus1} and {@code pHeightInSbsMinus1} are ignored.</p>
 * 
 * <p>If {@code flags.uniform_tile_spacing_flag} is not set and {@code pWidthInSbsMinus1} is {@code NULL}, then the width of individual tile columns is determined in an implementation-dependent manner.</p>
 * 
 * <p>If {@code flags.uniform_tile_spacing_flag} is not set and {@code pHeightInSbsMinus1} is {@code NULL}, then the height of individual tile rows is determined in an implementation-dependent manner.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>In general, implementations are expected to respect the application-specified AV1 tile parameters. However, as implementations may have restrictions on the combination of tile column and row counts, and tile widths and heights with respect to the extent of the encoded frame beyond the restrictions specified in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#aomedia-av1">AV1 Specification</a> and this specification (through video profile capabilities), certain parameter combinations may require the implementation to <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-overrides">override</a> them in order to conform to such implementation-specific limitations.</p>
 * </div>
 * 
 * <dl>
 * <dt>Active Parameter Sets</dt>
 * <dd>The <em>active sequence header</em> is the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1-sequence-header">AV1 sequence header</a> stored in the bound video session parameters object.</dd>
 * </dl>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@link VkVideoEncodeAV1CapabilitiesKHR}{@code ::flags}, as returned by {@link KHRVideoQueue#vkGetPhysicalDeviceVideoCapabilitiesKHR GetPhysicalDeviceVideoCapabilitiesKHR} for the used video profile, does not include {@link KHRVideoEncodeAV1#VK_VIDEO_ENCODE_AV1_CAPABILITY_PRIMARY_REFERENCE_CDF_ONLY_BIT_KHR VIDEO_ENCODE_AV1_CAPABILITY_PRIMARY_REFERENCE_CDF_ONLY_BIT_KHR}, then {@code primaryReferenceCdfOnly} <b>must</b> be {@link VK10#VK_FALSE FALSE}</li>
 * <li>If {@code primaryReferenceCdfOnly} is set to {@link VK10#VK_TRUE TRUE}, then {@code pStdPictureInfo→primary_ref_frame} <b>must</b> be less than {@link KHRVideoDecodeAV1#VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR}</li>
 * <li>If {@code pStdPictureInfo→primary_ref_frame} is less than {@link KHRVideoDecodeAV1#VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR}, then {@code referenceNameSlotIndices}[{@code pStdPictureInfo→primary_ref_frame}] <b>must</b> not be negative</li>
 * <li>If {@link VkVideoEncodeAV1CapabilitiesKHR}{@code ::flags}, as returned by {@link KHRVideoQueue#vkGetPhysicalDeviceVideoCapabilitiesKHR GetPhysicalDeviceVideoCapabilitiesKHR} for the used video profile, does not include {@link KHRVideoEncodeAV1#VK_VIDEO_ENCODE_AV1_CAPABILITY_GENERATE_OBU_EXTENSION_HEADER_BIT_KHR VIDEO_ENCODE_AV1_CAPABILITY_GENERATE_OBU_EXTENSION_HEADER_BIT_KHR}, then {@code generateObuExtensionHeader} <b>must</b> be {@link VK10#VK_FALSE FALSE}</li>
 * <li>If {@code generateObuExtensionHeader} is set to {@link VK10#VK_TRUE TRUE}, then {@code pStdPictureInfo→pExtensionHeader} <b>must</b> not be {@code NULL}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoEncodeAV1#VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_PICTURE_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_AV1_PICTURE_INFO_KHR}</li>
 * <li>{@code predictionMode} <b>must</b> be a valid {@code VkVideoEncodeAV1PredictionModeKHR} value</li>
 * <li>{@code rateControlGroup} <b>must</b> be a valid {@code VkVideoEncodeAV1RateControlGroupKHR} value</li>
 * <li>{@code pStdPictureInfo} <b>must</b> be a valid pointer to a valid {@code StdVideoEncodeAV1PictureInfo} value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeAV1PictureInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkVideoEncodeAV1PredictionModeKHR {@link #predictionMode};
 *     VkVideoEncodeAV1RateControlGroupKHR {@link #rateControlGroup};
 *     uint32_t {@link #constantQIndex};
 *     {@link StdVideoEncodeAV1PictureInfo StdVideoEncodeAV1PictureInfo} const * {@link #pStdPictureInfo};
 *     int32_t {@link #referenceNameSlotIndices}[VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR];
 *     VkBool32 {@link #primaryReferenceCdfOnly};
 *     VkBool32 {@link #generateObuExtensionHeader};
 * }</code></pre>
 */
public class VkVideoEncodeAV1PictureInfoKHR extends Struct<VkVideoEncodeAV1PictureInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PREDICTIONMODE,
        RATECONTROLGROUP,
        CONSTANTQINDEX,
        PSTDPICTUREINFO,
        REFERENCENAMESLOTINDICES,
        PRIMARYREFERENCECDFONLY,
        GENERATEOBUEXTENSIONHEADER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __array(4, VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PREDICTIONMODE = layout.offsetof(2);
        RATECONTROLGROUP = layout.offsetof(3);
        CONSTANTQINDEX = layout.offsetof(4);
        PSTDPICTUREINFO = layout.offsetof(5);
        REFERENCENAMESLOTINDICES = layout.offsetof(6);
        PRIMARYREFERENCECDFONLY = layout.offsetof(7);
        GENERATEOBUEXTENSIONHEADER = layout.offsetof(8);
    }

    protected VkVideoEncodeAV1PictureInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeAV1PictureInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeAV1PictureInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeAV1PictureInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeAV1PictureInfoKHR(ByteBuffer container) {
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
    /** specifies the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1-prediction-modes">AV1 prediction mode</a> to use for the encoded frame. */
    @NativeType("VkVideoEncodeAV1PredictionModeKHR")
    public int predictionMode() { return npredictionMode(address()); }
    /** specifies the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1-rate-control-group">AV1 rate control group</a> to use for the encoded frame when the current <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-rate-control-modes">rate control mode</a> is not {@link KHRVideoEncodeQueue#VK_VIDEO_ENCODE_RATE_CONTROL_MODE_DISABLED_BIT_KHR VIDEO_ENCODE_RATE_CONTROL_MODE_DISABLED_BIT_KHR}. Otherwise it is ignored. */
    @NativeType("VkVideoEncodeAV1RateControlGroupKHR")
    public int rateControlGroup() { return nrateControlGroup(address()); }
    /** the quantizer index to use for the encoded frame if the current <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-rate-control-modes">rate control mode</a> configured for the video session is {@link KHRVideoEncodeQueue#VK_VIDEO_ENCODE_RATE_CONTROL_MODE_DISABLED_BIT_KHR VIDEO_ENCODE_RATE_CONTROL_MODE_DISABLED_BIT_KHR}. */
    @NativeType("uint32_t")
    public int constantQIndex() { return nconstantQIndex(address()); }
    /** a pointer to a {@code StdVideoEncodeAV1PictureInfo} structure specifying <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1-picture-info">AV1 picture information</a>. */
    @NativeType("StdVideoEncodeAV1PictureInfo const *")
    public StdVideoEncodeAV1PictureInfo pStdPictureInfo() { return npStdPictureInfo(address()); }
    /** an array of seven ({@link KHRVideoDecodeAV1#VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR}, which is equal to the Video Std definition {@code STD_VIDEO_AV1_REFS_PER_FRAME}) signed integer values specifying the index of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dpb-slot">DPB slot</a> or a negative integer value for each <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1-reference-names">AV1 reference name</a> used for inter coding. In particular, the DPB slot index for the AV1 reference name {@code frame} is specified in {@code referenceNameSlotIndices}[{@code frame} - {@code STD_VIDEO_AV1_REFERENCE_NAME_LAST_FRAME}]. */
    @NativeType("int32_t[VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR]")
    public IntBuffer referenceNameSlotIndices() { return nreferenceNameSlotIndices(address()); }
    /** an array of seven ({@link KHRVideoDecodeAV1#VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR}, which is equal to the Video Std definition {@code STD_VIDEO_AV1_REFS_PER_FRAME}) signed integer values specifying the index of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dpb-slot">DPB slot</a> or a negative integer value for each <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1-reference-names">AV1 reference name</a> used for inter coding. In particular, the DPB slot index for the AV1 reference name {@code frame} is specified in {@code referenceNameSlotIndices}[{@code frame} - {@code STD_VIDEO_AV1_REFERENCE_NAME_LAST_FRAME}]. */
    @NativeType("int32_t")
    public int referenceNameSlotIndices(int index) { return nreferenceNameSlotIndices(address(), index); }
    /** controls whether the primary reference frame indicated by the value of {@code pStdPictureInfo→primary_ref_frame} is used only for CDF data reference, as defined in sections 6.8.2 of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#aomedia-av1">AV1 Specification</a>. If set to {@link VK10#VK_TRUE TRUE}, then the primary reference frame’s picture data will not be used for sample prediction. */
    @NativeType("VkBool32")
    public boolean primaryReferenceCdfOnly() { return nprimaryReferenceCdfOnly(address()) != 0; }
    /** controls whether OBU extension headers are generated into the target bitstream, as defined in sections 5.3.1, 5.3.2, and 5.3.3 of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#aomedia-av1">AV1 Specification</a>. */
    @NativeType("VkBool32")
    public boolean generateObuExtensionHeader() { return ngenerateObuExtensionHeader(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeAV1PictureInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeAV1#VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_PICTURE_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_AV1_PICTURE_INFO_KHR} value to the {@link #sType} field. */
    public VkVideoEncodeAV1PictureInfoKHR sType$Default() { return sType(KHRVideoEncodeAV1.VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_PICTURE_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeAV1PictureInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #predictionMode} field. */
    public VkVideoEncodeAV1PictureInfoKHR predictionMode(@NativeType("VkVideoEncodeAV1PredictionModeKHR") int value) { npredictionMode(address(), value); return this; }
    /** Sets the specified value to the {@link #rateControlGroup} field. */
    public VkVideoEncodeAV1PictureInfoKHR rateControlGroup(@NativeType("VkVideoEncodeAV1RateControlGroupKHR") int value) { nrateControlGroup(address(), value); return this; }
    /** Sets the specified value to the {@link #constantQIndex} field. */
    public VkVideoEncodeAV1PictureInfoKHR constantQIndex(@NativeType("uint32_t") int value) { nconstantQIndex(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoEncodeAV1PictureInfo} to the {@link #pStdPictureInfo} field. */
    public VkVideoEncodeAV1PictureInfoKHR pStdPictureInfo(@NativeType("StdVideoEncodeAV1PictureInfo const *") StdVideoEncodeAV1PictureInfo value) { npStdPictureInfo(address(), value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@link #referenceNameSlotIndices} field. */
    public VkVideoEncodeAV1PictureInfoKHR referenceNameSlotIndices(@NativeType("int32_t[VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR]") IntBuffer value) { nreferenceNameSlotIndices(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@link #referenceNameSlotIndices} field. */
    public VkVideoEncodeAV1PictureInfoKHR referenceNameSlotIndices(int index, @NativeType("int32_t") int value) { nreferenceNameSlotIndices(address(), index, value); return this; }
    /** Sets the specified value to the {@link #primaryReferenceCdfOnly} field. */
    public VkVideoEncodeAV1PictureInfoKHR primaryReferenceCdfOnly(@NativeType("VkBool32") boolean value) { nprimaryReferenceCdfOnly(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #generateObuExtensionHeader} field. */
    public VkVideoEncodeAV1PictureInfoKHR generateObuExtensionHeader(@NativeType("VkBool32") boolean value) { ngenerateObuExtensionHeader(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeAV1PictureInfoKHR set(
        int sType,
        long pNext,
        int predictionMode,
        int rateControlGroup,
        int constantQIndex,
        StdVideoEncodeAV1PictureInfo pStdPictureInfo,
        IntBuffer referenceNameSlotIndices,
        boolean primaryReferenceCdfOnly,
        boolean generateObuExtensionHeader
    ) {
        sType(sType);
        pNext(pNext);
        predictionMode(predictionMode);
        rateControlGroup(rateControlGroup);
        constantQIndex(constantQIndex);
        pStdPictureInfo(pStdPictureInfo);
        referenceNameSlotIndices(referenceNameSlotIndices);
        primaryReferenceCdfOnly(primaryReferenceCdfOnly);
        generateObuExtensionHeader(generateObuExtensionHeader);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeAV1PictureInfoKHR set(VkVideoEncodeAV1PictureInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeAV1PictureInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeAV1PictureInfoKHR malloc() {
        return new VkVideoEncodeAV1PictureInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeAV1PictureInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeAV1PictureInfoKHR calloc() {
        return new VkVideoEncodeAV1PictureInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeAV1PictureInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeAV1PictureInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeAV1PictureInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeAV1PictureInfoKHR} instance for the specified memory address. */
    public static VkVideoEncodeAV1PictureInfoKHR create(long address) {
        return new VkVideoEncodeAV1PictureInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoEncodeAV1PictureInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeAV1PictureInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1PictureInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1PictureInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1PictureInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1PictureInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1PictureInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1PictureInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeAV1PictureInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1PictureInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoEncodeAV1PictureInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeAV1PictureInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeAV1PictureInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeAV1PictureInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeAV1PictureInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeAV1PictureInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeAV1PictureInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1PictureInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1PictureInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1PictureInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1PictureInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoEncodeAV1PictureInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeAV1PictureInfoKHR.PNEXT); }
    /** Unsafe version of {@link #predictionMode}. */
    public static int npredictionMode(long struct) { return memGetInt(struct + VkVideoEncodeAV1PictureInfoKHR.PREDICTIONMODE); }
    /** Unsafe version of {@link #rateControlGroup}. */
    public static int nrateControlGroup(long struct) { return memGetInt(struct + VkVideoEncodeAV1PictureInfoKHR.RATECONTROLGROUP); }
    /** Unsafe version of {@link #constantQIndex}. */
    public static int nconstantQIndex(long struct) { return memGetInt(struct + VkVideoEncodeAV1PictureInfoKHR.CONSTANTQINDEX); }
    /** Unsafe version of {@link #pStdPictureInfo}. */
    public static StdVideoEncodeAV1PictureInfo npStdPictureInfo(long struct) { return StdVideoEncodeAV1PictureInfo.create(memGetAddress(struct + VkVideoEncodeAV1PictureInfoKHR.PSTDPICTUREINFO)); }
    /** Unsafe version of {@link #referenceNameSlotIndices}. */
    public static IntBuffer nreferenceNameSlotIndices(long struct) { return memIntBuffer(struct + VkVideoEncodeAV1PictureInfoKHR.REFERENCENAMESLOTINDICES, VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR); }
    /** Unsafe version of {@link #referenceNameSlotIndices(int) referenceNameSlotIndices}. */
    public static int nreferenceNameSlotIndices(long struct, int index) {
        return memGetInt(struct + VkVideoEncodeAV1PictureInfoKHR.REFERENCENAMESLOTINDICES + check(index, VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR) * 4);
    }
    /** Unsafe version of {@link #primaryReferenceCdfOnly}. */
    public static int nprimaryReferenceCdfOnly(long struct) { return memGetInt(struct + VkVideoEncodeAV1PictureInfoKHR.PRIMARYREFERENCECDFONLY); }
    /** Unsafe version of {@link #generateObuExtensionHeader}. */
    public static int ngenerateObuExtensionHeader(long struct) { return memGetInt(struct + VkVideoEncodeAV1PictureInfoKHR.GENERATEOBUEXTENSIONHEADER); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoEncodeAV1PictureInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeAV1PictureInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #predictionMode(int) predictionMode}. */
    public static void npredictionMode(long struct, int value) { memPutInt(struct + VkVideoEncodeAV1PictureInfoKHR.PREDICTIONMODE, value); }
    /** Unsafe version of {@link #rateControlGroup(int) rateControlGroup}. */
    public static void nrateControlGroup(long struct, int value) { memPutInt(struct + VkVideoEncodeAV1PictureInfoKHR.RATECONTROLGROUP, value); }
    /** Unsafe version of {@link #constantQIndex(int) constantQIndex}. */
    public static void nconstantQIndex(long struct, int value) { memPutInt(struct + VkVideoEncodeAV1PictureInfoKHR.CONSTANTQINDEX, value); }
    /** Unsafe version of {@link #pStdPictureInfo(StdVideoEncodeAV1PictureInfo) pStdPictureInfo}. */
    public static void npStdPictureInfo(long struct, StdVideoEncodeAV1PictureInfo value) { memPutAddress(struct + VkVideoEncodeAV1PictureInfoKHR.PSTDPICTUREINFO, value.address()); }
    /** Unsafe version of {@link #referenceNameSlotIndices(IntBuffer) referenceNameSlotIndices}. */
    public static void nreferenceNameSlotIndices(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR); }
        memCopy(memAddress(value), struct + VkVideoEncodeAV1PictureInfoKHR.REFERENCENAMESLOTINDICES, value.remaining() * 4);
    }
    /** Unsafe version of {@link #referenceNameSlotIndices(int, int) referenceNameSlotIndices}. */
    public static void nreferenceNameSlotIndices(long struct, int index, int value) {
        memPutInt(struct + VkVideoEncodeAV1PictureInfoKHR.REFERENCENAMESLOTINDICES + check(index, VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR) * 4, value);
    }
    /** Unsafe version of {@link #primaryReferenceCdfOnly(boolean) primaryReferenceCdfOnly}. */
    public static void nprimaryReferenceCdfOnly(long struct, int value) { memPutInt(struct + VkVideoEncodeAV1PictureInfoKHR.PRIMARYREFERENCECDFONLY, value); }
    /** Unsafe version of {@link #generateObuExtensionHeader(boolean) generateObuExtensionHeader}. */
    public static void ngenerateObuExtensionHeader(long struct, int value) { memPutInt(struct + VkVideoEncodeAV1PictureInfoKHR.GENERATEOBUEXTENSIONHEADER, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        long pStdPictureInfo = memGetAddress(struct + VkVideoEncodeAV1PictureInfoKHR.PSTDPICTUREINFO);
        check(pStdPictureInfo);
        StdVideoEncodeAV1PictureInfo.validate(pStdPictureInfo);
    }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeAV1PictureInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeAV1PictureInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoEncodeAV1PictureInfoKHR ELEMENT_FACTORY = VkVideoEncodeAV1PictureInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeAV1PictureInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeAV1PictureInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeAV1PictureInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoEncodeAV1PictureInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeAV1PictureInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkVideoEncodeAV1PictureInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeAV1PictureInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkVideoEncodeAV1PictureInfoKHR#predictionMode} field. */
        @NativeType("VkVideoEncodeAV1PredictionModeKHR")
        public int predictionMode() { return VkVideoEncodeAV1PictureInfoKHR.npredictionMode(address()); }
        /** @return the value of the {@link VkVideoEncodeAV1PictureInfoKHR#rateControlGroup} field. */
        @NativeType("VkVideoEncodeAV1RateControlGroupKHR")
        public int rateControlGroup() { return VkVideoEncodeAV1PictureInfoKHR.nrateControlGroup(address()); }
        /** @return the value of the {@link VkVideoEncodeAV1PictureInfoKHR#constantQIndex} field. */
        @NativeType("uint32_t")
        public int constantQIndex() { return VkVideoEncodeAV1PictureInfoKHR.nconstantQIndex(address()); }
        /** @return a {@link StdVideoEncodeAV1PictureInfo} view of the struct pointed to by the {@link VkVideoEncodeAV1PictureInfoKHR#pStdPictureInfo} field. */
        @NativeType("StdVideoEncodeAV1PictureInfo const *")
        public StdVideoEncodeAV1PictureInfo pStdPictureInfo() { return VkVideoEncodeAV1PictureInfoKHR.npStdPictureInfo(address()); }
        /** @return a {@link IntBuffer} view of the {@link VkVideoEncodeAV1PictureInfoKHR#referenceNameSlotIndices} field. */
        @NativeType("int32_t[VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR]")
        public IntBuffer referenceNameSlotIndices() { return VkVideoEncodeAV1PictureInfoKHR.nreferenceNameSlotIndices(address()); }
        /** @return the value at the specified index of the {@link VkVideoEncodeAV1PictureInfoKHR#referenceNameSlotIndices} field. */
        @NativeType("int32_t")
        public int referenceNameSlotIndices(int index) { return VkVideoEncodeAV1PictureInfoKHR.nreferenceNameSlotIndices(address(), index); }
        /** @return the value of the {@link VkVideoEncodeAV1PictureInfoKHR#primaryReferenceCdfOnly} field. */
        @NativeType("VkBool32")
        public boolean primaryReferenceCdfOnly() { return VkVideoEncodeAV1PictureInfoKHR.nprimaryReferenceCdfOnly(address()) != 0; }
        /** @return the value of the {@link VkVideoEncodeAV1PictureInfoKHR#generateObuExtensionHeader} field. */
        @NativeType("VkBool32")
        public boolean generateObuExtensionHeader() { return VkVideoEncodeAV1PictureInfoKHR.ngenerateObuExtensionHeader(address()) != 0; }

        /** Sets the specified value to the {@link VkVideoEncodeAV1PictureInfoKHR#sType} field. */
        public VkVideoEncodeAV1PictureInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeAV1PictureInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeAV1#VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_PICTURE_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_AV1_PICTURE_INFO_KHR} value to the {@link VkVideoEncodeAV1PictureInfoKHR#sType} field. */
        public VkVideoEncodeAV1PictureInfoKHR.Buffer sType$Default() { return sType(KHRVideoEncodeAV1.VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_PICTURE_INFO_KHR); }
        /** Sets the specified value to the {@link VkVideoEncodeAV1PictureInfoKHR#pNext} field. */
        public VkVideoEncodeAV1PictureInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeAV1PictureInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeAV1PictureInfoKHR#predictionMode} field. */
        public VkVideoEncodeAV1PictureInfoKHR.Buffer predictionMode(@NativeType("VkVideoEncodeAV1PredictionModeKHR") int value) { VkVideoEncodeAV1PictureInfoKHR.npredictionMode(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeAV1PictureInfoKHR#rateControlGroup} field. */
        public VkVideoEncodeAV1PictureInfoKHR.Buffer rateControlGroup(@NativeType("VkVideoEncodeAV1RateControlGroupKHR") int value) { VkVideoEncodeAV1PictureInfoKHR.nrateControlGroup(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeAV1PictureInfoKHR#constantQIndex} field. */
        public VkVideoEncodeAV1PictureInfoKHR.Buffer constantQIndex(@NativeType("uint32_t") int value) { VkVideoEncodeAV1PictureInfoKHR.nconstantQIndex(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoEncodeAV1PictureInfo} to the {@link VkVideoEncodeAV1PictureInfoKHR#pStdPictureInfo} field. */
        public VkVideoEncodeAV1PictureInfoKHR.Buffer pStdPictureInfo(@NativeType("StdVideoEncodeAV1PictureInfo const *") StdVideoEncodeAV1PictureInfo value) { VkVideoEncodeAV1PictureInfoKHR.npStdPictureInfo(address(), value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@link VkVideoEncodeAV1PictureInfoKHR#referenceNameSlotIndices} field. */
        public VkVideoEncodeAV1PictureInfoKHR.Buffer referenceNameSlotIndices(@NativeType("int32_t[VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR]") IntBuffer value) { VkVideoEncodeAV1PictureInfoKHR.nreferenceNameSlotIndices(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@link VkVideoEncodeAV1PictureInfoKHR#referenceNameSlotIndices} field. */
        public VkVideoEncodeAV1PictureInfoKHR.Buffer referenceNameSlotIndices(int index, @NativeType("int32_t") int value) { VkVideoEncodeAV1PictureInfoKHR.nreferenceNameSlotIndices(address(), index, value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeAV1PictureInfoKHR#primaryReferenceCdfOnly} field. */
        public VkVideoEncodeAV1PictureInfoKHR.Buffer primaryReferenceCdfOnly(@NativeType("VkBool32") boolean value) { VkVideoEncodeAV1PictureInfoKHR.nprimaryReferenceCdfOnly(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeAV1PictureInfoKHR#generateObuExtensionHeader} field. */
        public VkVideoEncodeAV1PictureInfoKHR.Buffer generateObuExtensionHeader(@NativeType("VkBool32") boolean value) { VkVideoEncodeAV1PictureInfoKHR.ngenerateObuExtensionHeader(address(), value ? 1 : 0); return this; }

    }

}