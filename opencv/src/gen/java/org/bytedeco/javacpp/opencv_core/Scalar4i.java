// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.javacpp.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.opencv_core.opencv_core.*;

@Name("cv::Scalar_<int>") @Properties(inherit = org.bytedeco.javacpp.opencv_core.opencv_core_presets.class)
public class Scalar4i extends IntPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Scalar4i(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Scalar4i(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Scalar4i position(long position) {
        return (Scalar4i)super.position(position);
    }

    /** default constructor */
    public Scalar4i() { super((Pointer)null); allocate(); }
    private native void allocate();
    public Scalar4i(int v0, int v1, int v2/*=0*/, int v3/*=0*/) { super((Pointer)null); allocate(v0, v1, v2, v3); }
    private native void allocate(int v0, int v1, int v2/*=0*/, int v3/*=0*/);
    public Scalar4i(int v0, int v1) { super((Pointer)null); allocate(v0, v1); }
    private native void allocate(int v0, int v1);
    public Scalar4i(int v0) { super((Pointer)null); allocate(v0); }
    private native void allocate(int v0);

    public Scalar4i(@Const @ByRef Scalar4i s) { super((Pointer)null); allocate(s); }
    private native void allocate(@Const @ByRef Scalar4i s);

    public native @ByRef @Name("operator =") Scalar4i put(@Const @ByRef Scalar4i s);

    /** returns a scalar with all elements set to v0 */
    public static native @ByVal Scalar4i all(int v0);

    /** conversion to another data type */

    /** per-element product */
    public native @ByVal Scalar4i mul(@Const @ByRef Scalar4i a, double scale/*=1*/ );
    public native @ByVal Scalar4i mul(@Const @ByRef Scalar4i a );

    /** returns (v0, -v1, -v2, -v3) */
    public native @ByVal Scalar4i conj();

    /** returns true iff v1 == v2 == v3 == 0 */
    public native @Cast("bool") boolean isReal();
}