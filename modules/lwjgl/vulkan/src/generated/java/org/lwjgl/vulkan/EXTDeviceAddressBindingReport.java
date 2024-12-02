/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension enables applications to track the binding of regions of the GPU virtual address space, and to associate those regions with Vulkan objects. This extension is primarily intended to aid in crash postmortem, where applications may wish to map a faulting GPU address to a Vulkan object.
 * 
 * <p>For example, a page fault triggered by accessing an address located within a region of the GPU virtual address space that was previously reported as bound and then unbound may indicate a use-after-free error. Similarly, faults generated by accessing virtual addresses outside the limits of a bound region of GPU virtual address space may indicate indexing beyond the bounds of a resource.</p>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_device_address_binding_report}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>355</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2} or <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#versions-1.1">Version 1.1</a> and {@link EXTDebugUtils VK_EXT_debug_utils}</dd>
 * <dt><b>Special Uses</b></dt>
 * <dd><ul>
 * <li><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#extendingvulkan-compatibility-specialuse">Debugging tools</a></li>
 * <li><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#extendingvulkan-compatibility-specialuse">Developer tools</a></li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Ralph Potter r_potter</li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2020-11-23</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension requires {@code VK_EXT_debug_utils}</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Ralph Potter, Samsung</li>
 * <li>Spencer Fricke, Samsung</li>
 * <li>Jan-Harald Fredriksen, ARM</li>
 * <li>Andrew Ellem, Google</li>
 * <li>Alex Walters, IMG</li>
 * <li>Jeff Bolz, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public final class EXTDeviceAddressBindingReport {

    /** The extension specification version. */
    public static final int VK_EXT_DEVICE_ADDRESS_BINDING_REPORT_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_DEVICE_ADDRESS_BINDING_REPORT_EXTENSION_NAME = "VK_EXT_device_address_binding_report";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ADDRESS_BINDING_REPORT_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_ADDRESS_BINDING_REPORT_FEATURES_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DEVICE_ADDRESS_BINDING_CALLBACK_DATA_EXT STRUCTURE_TYPE_DEVICE_ADDRESS_BINDING_CALLBACK_DATA_EXT}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ADDRESS_BINDING_REPORT_FEATURES_EXT = 1000354000,
        VK_STRUCTURE_TYPE_DEVICE_ADDRESS_BINDING_CALLBACK_DATA_EXT            = 1000354001;

    /** Extends {@code VkDebugUtilsMessageTypeFlagBitsEXT}. */
    public static final int VK_DEBUG_UTILS_MESSAGE_TYPE_DEVICE_ADDRESS_BINDING_BIT_EXT = 0x8;

    /**
     * VkDeviceAddressBindingFlagBitsEXT - Bitmask specifying the additional information about a binding event
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_DEVICE_ADDRESS_BINDING_INTERNAL_OBJECT_BIT_EXT DEVICE_ADDRESS_BINDING_INTERNAL_OBJECT_BIT_EXT} specifies that {@link VkDeviceAddressBindingCallbackDataEXT} describes a Vulkan object that has not been made visible to the application via a Vulkan command.</li>
     * </ul>
     */
    public static final int VK_DEVICE_ADDRESS_BINDING_INTERNAL_OBJECT_BIT_EXT = 0x1;

    /**
     * VkDeviceAddressBindingTypeEXT - Enum describing a change in device address bindings
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_DEVICE_ADDRESS_BINDING_TYPE_BIND_EXT DEVICE_ADDRESS_BINDING_TYPE_BIND_EXT} specifies that a new GPU-accessible virtual address range has been bound.</li>
     * <li>{@link #VK_DEVICE_ADDRESS_BINDING_TYPE_UNBIND_EXT DEVICE_ADDRESS_BINDING_TYPE_UNBIND_EXT} specifies that a GPU-accessible virtual address range has been unbound.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkDeviceAddressBindingCallbackDataEXT}</p>
     */
    public static final int
        VK_DEVICE_ADDRESS_BINDING_TYPE_BIND_EXT   = 0,
        VK_DEVICE_ADDRESS_BINDING_TYPE_UNBIND_EXT = 1;

    private EXTDeviceAddressBindingReport() {}

}