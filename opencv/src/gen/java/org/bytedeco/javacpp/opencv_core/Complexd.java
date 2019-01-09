// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.javacpp.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.opencv_core.opencv_core.*;

@Name("cv::Complex<double>") @NoOffset @Properties(inherit = org.bytedeco.javacpp.opencv_core.opencv_core_presets.class)
public class Complexd extends DoublePointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Complexd(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Complexd(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Complexd position(long position) {
        return (Complexd)super.position(position);
    }


    /** default constructor */
    public Complexd() { super((Pointer)null); allocate(); }
    private native void allocate();
    public Complexd( double _re, double _im/*=0*/ ) { super((Pointer)null); allocate(_re, _im); }
    private native void allocate( double _re, double _im/*=0*/ );
    public Complexd( double _re ) { super((Pointer)null); allocate(_re); }
    private native void allocate( double _re );

    /** conversion to another data type */
    /** conjugation */
    public native @ByVal Complexd conj();

    public native double re(); public native Complexd re(double re);
    public native double im(); public native Complexd im(double im); //< the real and the imaginary parts
}