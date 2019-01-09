// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.javacpp.opencv_ximgproc;

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

import static org.bytedeco.javacpp.opencv_ximgproc.opencv_ximgproc.*;


                    /** \brief Strategie for the selective search segmentation algorithm
                        The class implements a generic stragery for the algorithm described in \cite uijlings2013selective.
                     */
                    @Namespace("cv::ximgproc::segmentation") @Properties(inherit = org.bytedeco.javacpp.opencv_ximgproc.opencv_ximgproc_presets.class)
public class SelectiveSearchSegmentationStrategy extends Algorithm {
                        static { Loader.load(); }
                        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
                        public SelectiveSearchSegmentationStrategy(Pointer p) { super(p); }
                    
                            /** \brief Set a initial image, with a segementation.
                                @param img The input image. Any number of channel can be provided
                                @param regions A segementation of the image. The parameter must be the same size of img.
                                @param sizes The sizes of different regions
                                @param image_id If not set to -1, try to cache pre-computations. If the same set og (img, regions, size) is used, the image_id need to be the same.
                            */
                            public native void setImage(@ByVal Mat img, @ByVal Mat regions, @ByVal Mat sizes, int image_id/*=-1*/);
                            public native void setImage(@ByVal Mat img, @ByVal Mat regions, @ByVal Mat sizes);
                            public native void setImage(@ByVal UMat img, @ByVal UMat regions, @ByVal UMat sizes, int image_id/*=-1*/);
                            public native void setImage(@ByVal UMat img, @ByVal UMat regions, @ByVal UMat sizes);
                            public native void setImage(@ByVal GpuMat img, @ByVal GpuMat regions, @ByVal GpuMat sizes, int image_id/*=-1*/);
                            public native void setImage(@ByVal GpuMat img, @ByVal GpuMat regions, @ByVal GpuMat sizes);

                            /** \brief Return the score between two regions (between 0 and 1)
                                @param r1 The first region
                                @param r2 The second region
                            */
                            public native float get(int r1, int r2);

                            /** \brief Inform the strategy that two regions will be merged
                                @param r1 The first region
                                @param r2 The second region
                            */
                            public native void merge(int r1, int r2);
                    }