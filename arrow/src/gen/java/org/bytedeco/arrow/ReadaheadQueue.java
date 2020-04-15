// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Namespace("arrow::detail") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class ReadaheadQueue extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ReadaheadQueue(Pointer p) { super(p); }

  public ReadaheadQueue(int readahead_queue_size) { super((Pointer)null); allocate(readahead_queue_size); }
  private native void allocate(int readahead_queue_size);

  public native @ByVal Status Append(@UniquePtr ReadaheadPromise arg0);
  public native @ByVal Status PopDone(@UniquePtr ReadaheadPromise arg0);
  public native @ByVal Status Pump(@ByVal @Cast("std::function<std::unique_ptr<arrow::detail::ReadaheadPromise>()>*") Pointer factory);
  public native @ByVal Status Shutdown();
  public native void EnsureShutdownOrDie();
}