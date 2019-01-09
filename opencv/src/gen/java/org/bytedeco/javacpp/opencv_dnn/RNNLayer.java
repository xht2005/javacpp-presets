// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.javacpp.opencv_dnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.javacpp.opencv_core.*;
import static org.bytedeco.javacpp.opencv_core.opencv_core.*;
import org.bytedeco.javacpp.opencv_imgproc.*;
import static org.bytedeco.javacpp.opencv_imgproc.opencv_imgproc.*;

import static org.bytedeco.javacpp.opencv_dnn.opencv_dnn.*;


    /** \brief Classical recurrent layer
    <p>
    Accepts two inputs \f$x_t\f$ and \f$h_{t-1}\f$ and compute two outputs \f$o_t\f$ and \f$h_t\f$.
    <p>
    - input: should contain packed input \f$x_t\f$.
    - output: should contain output \f$o_t\f$ (and \f$h_t\f$ if setProduceHiddenOutput() is set to true).
    <p>
    input[0] should have shape [{@code T}, {@code N}, {@code data_dims}] where {@code T} and {@code N} is number of timestamps and number of independent samples of \f$x_t\f$ respectively.
    <p>
    output[0] will have shape [{@code T}, {@code N}, \f$N_o\f$], where \f$N_o\f$ is number of rows in \f$ W_{xo} \f$ matrix.
    <p>
    If setProduceHiddenOutput() is set to true then \p output[1] will contain a Mat with shape [{@code T}, {@code N}, \f$N_h\f$], where \f$N_h\f$ is number of rows in \f$ W_{hh} \f$ matrix.
    */
    @Namespace("cv::dnn") @Properties(inherit = org.bytedeco.javacpp.opencv_dnn.opencv_dnn_presets.class)
public class RNNLayer extends Layer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public RNNLayer(Pointer p) { super(p); }
    
        /** Creates instance of RNNLayer */
        public static native @Ptr RNNLayer create(@Const @ByRef LayerParams params);

        /** Setups learned weights.
        <p>
        Recurrent-layer behavior on each step is defined by current input \f$ x_t \f$, previous state \f$ h_t \f$ and learned weights as follows:
        \f{eqnarray*}{
        h_t &= tanh&(W_{hh} h_{t-1} + W_{xh} x_t + b_h),  \\
        o_t &= tanh&(W_{ho} h_t + b_o),
        \f}
        <p>
        @param Wxh is \f$ W_{xh} \f$ matrix
        @param bh  is \f$ b_{h}  \f$ vector
        @param Whh is \f$ W_{hh} \f$ matrix
        @param Who is \f$ W_{xo} \f$ matrix
        @param bo  is \f$ b_{o}  \f$ vector
        */
        public native void setWeights(@Const @ByRef Mat Wxh, @Const @ByRef Mat bh, @Const @ByRef Mat Whh, @Const @ByRef Mat Who, @Const @ByRef Mat bo);

        /** \brief If this flag is set to true then layer will produce \f$ h_t \f$ as second output.
         * \details Shape of the second output is the same as first output.
         */
        public native void setProduceHiddenOutput(@Cast("bool") boolean produce/*=false*/);
        public native void setProduceHiddenOutput();

    }