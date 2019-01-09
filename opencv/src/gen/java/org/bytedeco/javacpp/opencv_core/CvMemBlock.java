// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.javacpp.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.opencv_core.opencv_core.*;


/****************************************************************************************\
*                                   Dynamic Data structures                              *
\****************************************************************************************/

/******************************** Memory storage ****************************************/

@Properties(inherit = org.bytedeco.javacpp.opencv_core.opencv_core_presets.class)
public class CvMemBlock extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvMemBlock() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CvMemBlock(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvMemBlock(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CvMemBlock position(long position) {
        return (CvMemBlock)super.position(position);
    }

    public native CvMemBlock prev(); public native CvMemBlock prev(CvMemBlock prev);
    public native CvMemBlock next(); public native CvMemBlock next(CvMemBlock next);
}