// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.javacpp.opencv_shape;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.javacpp.opencv_core.*;
import static org.bytedeco.javacpp.opencv_core.opencv_core.*;
import org.bytedeco.javacpp.opencv_imgproc.*;
import static org.bytedeco.javacpp.opencv_imgproc.opencv_imgproc.*;
import org.bytedeco.javacpp.opencv_imgcodecs.*;
import static org.bytedeco.javacpp.opencv_imgcodecs.opencv_imgcodecs.*;
import org.bytedeco.javacpp.opencv_videoio.*;
import static org.bytedeco.javacpp.opencv_videoio.opencv_videoio.*;
import org.bytedeco.javacpp.opencv_highgui.*;
import static org.bytedeco.javacpp.opencv_highgui.opencv_highgui.*;
import org.bytedeco.javacpp.opencv_flann.*;
import static org.bytedeco.javacpp.opencv_flann.opencv_flann.*;
import org.bytedeco.javacpp.opencv_features2d.*;
import static org.bytedeco.javacpp.opencv_features2d.opencv_features2d.*;
import org.bytedeco.javacpp.opencv_calib3d.*;
import static org.bytedeco.javacpp.opencv_calib3d.opencv_calib3d.*;

import static org.bytedeco.javacpp.opencv_shape.opencv_shape.*;


/***********************************************************************************/
/***********************************************************************************/

/** \brief Definition of the transformation
<p>
occupied in the paper "Principal Warps: Thin-Plate Splines and Decomposition of Deformations", by
F.L. Bookstein (PAMI 1989). :
 */
@Namespace("cv") @Properties(inherit = org.bytedeco.javacpp.opencv_shape.opencv_shape_presets.class)
public class ThinPlateSplineShapeTransformer extends ShapeTransformer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ThinPlateSplineShapeTransformer(Pointer p) { super(p); }

    /** \brief Set the regularization parameter for relaxing the exact interpolation requirements of the TPS
    algorithm.
    <p>
    @param beta value of the regularization parameter.
     */
    public native void setRegularizationParameter(double beta);
    public native double getRegularizationParameter();
}