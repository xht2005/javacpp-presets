// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief Base type class for (fixed-size) decimal data */
@Namespace("arrow") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class DecimalType extends FixedSizeBinaryType {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DecimalType(Pointer p) { super(p); }

  public DecimalType(int byte_width, int precision, int scale) { super((Pointer)null); allocate(byte_width, precision, scale); }
  private native void allocate(int byte_width, int precision, int scale);

  public native int precision();
  public native int scale();
}
